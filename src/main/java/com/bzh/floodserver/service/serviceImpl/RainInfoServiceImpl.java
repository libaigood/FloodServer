package com.bzh.floodserver.service.serviceImpl;

import com.bzh.floodserver.mapper.RainInfoDao;
import com.bzh.floodserver.model.sjappfu.*;
import com.bzh.floodserver.service.NoDataException;
import com.bzh.floodserver.service.RainInfoService;
import com.bzh.floodserver.service.SomeForRain;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 雨情信息
 */
@Service
public class RainInfoServiceImpl implements RainInfoService {
    @Resource
    private RainInfoDao rainInfoDao;

    @Override
    public List<Rainfalls_all> select(List<String> addvcd) {
        return rainInfoDao.select(addvcd);
    }

    //雨量信息
    public List<Rainfalls_all> rainfalls_all(String stm, String etm, String addvcd) throws NoDataException {
        return rainInfoDao.rainfalls_all(stm, etm, stringList(addvcd));
    }

    //将字符串拆封，变成数组
    private List<String> stringList(String addvcd) {
        if (addvcd == null) {
            return null;
        }
        List<String> list = new ArrayList<>();
        String[] sourceStrArray = addvcd.split(",");
        for (int i = 0; i < sourceStrArray.length; i++) {
            System.out.println(sourceStrArray[i]);
            list.add(sourceStrArray[i]);
        }
        return list;
    }

    public List<Rainfalls_one> rainfalls_one(String stcd, String stm, String etm, int timelength) throws NoDataException {
        List<Rainfalls_one> list = rainInfoDao.rainfalls_one(stcd, stm, etm);
        if (list.size() == 0) {
            throw new NoDataException("没有数据!");
        }
        //向list添加一条假数据，用来结束并计算最后一条数据
        Rainfalls_one addone = new Rainfalls_one();
        addone.setStcd("");
        addone.setStnm("");
        addone.setDrp(0);
        addone.setTtt("");
        addone.setTm(new Date(list.get(list.size() - 1).getTm().getTime() + (24 * 60 * 60 * 1000)));
        list.add(addone);
        //创建新的list返回计算后的数据
        List<Rainfalls_one> newlist = new ArrayList<Rainfalls_one>();

        double drp = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            //当前数据
            Rainfalls_one oneNow = list.get(i);
            Date tmNow = oneNow.getTm();
            double drpNow = oneNow.getDrp();
            int sdNow = SomeForRain.getshiduan(tmNow, timelength);
            //下一条数据
            Rainfalls_one oneNext = list.get(i + 1);
            Date tmNext = oneNext.getTm();
            int sdNext = SomeForRain.getshiduan(tmNext, timelength);
            //两条数据相差分钟数
            long x = (tmNext.getTime() - tmNow.getTime()) / (1000 * 60);

            if (sdNow == sdNext && x < timelength * 60) {
                drp += drpNow;
            } else {
                Rainfalls_one one = new Rainfalls_one();
                drp += drpNow;
                one.setDrp(Double.parseDouble(new DecimalFormat("#0.0").format(drp)));
                drp = 0;
                one.setTtt(SomeForRain.tmstr(tmNow, sdNow, timelength));
                one.setStcd(stcd);
                one.setStnm(oneNow.getStnm());
                newlist.add(one);
            }
        }

        return newlist;
    }

    //雨强信息
    @SuppressWarnings("deprecation")
    public Map<String, List<RainIntensity_all>> rainIntensity_all(String stm, String etm, String addvcd) throws NoDataException {
        List<RainIntensity_all> list = rainInfoDao.rainIntensity_all(stm, etm, stringList(addvcd));
		
		/*if(list.size() == 0) {
			throw new NoDataException("没有数据!");
		}*/

        //时长为1小时的时候，只需要将list进行排序即可，不必进行累计运算
        List<RainIntensity_all> list_1 = new ArrayList<RainIntensity_all>();
        list_1.addAll(list);
        Collections.sort(list_1, new Comparator<RainIntensity_all>() {
            @Override
            public int compare(RainIntensity_all o1, RainIntensity_all o2) {
                return new Double(o2.drp).compareTo(new Double(o1.drp));
            }
        });
        for (int i = 0; i < list_1.size(); i++) {
            int hour = list_1.get(i).getTm().getHours();
            int h1 = (hour - 1) == -1 ? 23 : (hour - 1);
            int h2 = hour == 0 ? 24 : hour;
            list_1.get(i).setTtt((h1 < 10 ? "0" + h1 : h1) + "时-" + (h2 < 10 ? "0" + h2 : h2) + "时");
        }

        //时长为3或6小时的时候，需要进行累计运算

        //添加一条假数据
        list.add(new RainIntensity_all());

        List<RainIntensity_all> list_a = new ArrayList<RainIntensity_all>();
        List<List<RainIntensity_all>> list_b = new ArrayList<List<RainIntensity_all>>();

        //将数据按照stcd分组放入list_b
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStcd() != null && list.get(i).getStcd().equals(list.get(i + 1).getStcd())) {
                list_a.add(list.get(i));
            } else {
                if (list.get(i).getStcd() != null) {
                    list_a.add(list.get(i));
                    list_b.add(list_a);
                    list_a = new ArrayList<RainIntensity_all>();
                }

            }
            //遇到最后一条假数据时不再向下进行
            if (i == list.size() - 1) break;
        }

        List<RainIntensity_all> list_3 = new ArrayList<RainIntensity_all>();
        list_3.addAll(getlist(list_b, 3));
        List<RainIntensity_all> list_6 = new ArrayList<RainIntensity_all>();
        list_6.addAll(getlist(list_b, 6));

        Map<String, List<RainIntensity_all>> map = new LinkedHashMap<String, List<RainIntensity_all>>();
        map.put("1hours", list_1);
        map.put("3hours", list_3);
        map.put("6hours", list_6);

        System.out.println("list_1.size():" + list_1.size());
        System.out.println("list_3.size():" + list_3.size());
        System.out.println("list_6.size():" + list_6.size());

        return map;
    }

    @SuppressWarnings("deprecation")
    public List<RainIntensity_all> getlist(List<List<RainIntensity_all>> list_b, int timelength) throws NoDataException {

        List<RainIntensity_all> newlist = new ArrayList<RainIntensity_all>();
        //k循环一次，向后推一个小时
        for (int k = 0; k < timelength; k++) {
            //i循环一次，计算一个站点
            for (int i = 0; i < list_b.size(); i++) {
                List<RainIntensity_all> list_i = list_b.get(i);

                RainIntensity_all ra_1 = list_i.get(0);
                long lt_1 = ra_1.getTm().getTime() + k * 1000 * 60 * 60;

                RainIntensity_all ra_n = list_i.get(list_i.size() - 1);
                long lt_n = ra_n.getTm().getTime();

                while (lt_1 < lt_n) {
                    double drps = 0;
                    for (int j = 0; j < list_i.size(); j++) {
                        long lt = list_i.get(j).getTm().getTime();
                        if (lt_1 < lt && lt < lt_1 + (timelength * 1000 * 60 * 60)) {
                            drps += list_i.get(j).getDrp();
                        }
                    }
                    if (drps > 0) {
                        RainIntensity_all newra = new RainIntensity_all();
                        newra.setAdcd(list_i.get(0).getAdcd());
                        newra.setAdnm(list_i.get(0).getAdnm());
                        newra.setStcd(list_i.get(0).getStcd());
                        newra.setStnm(list_i.get(0).getStnm());
                        newra.setDrp(Double.parseDouble(new DecimalFormat("#0.00").format(drps)));
                        int h1 = new Date(lt_1).getHours();
                        int h2 = new Date(lt_1 + timelength * 1000 * 60 * 60).getHours();
                        newra.setTtt((h1 < 10 ? "0" + h1 : h1) + "时-" + (h2 < 10 ? "0" + h2 : h2) + "时");
                        newlist.add(newra);
                    }
                    lt_1 += (timelength * 1000 * 60 * 60);
                }


            }

        }


        Collections.sort(newlist, new Comparator<RainIntensity_all>() {
            @Override
            public int compare(RainIntensity_all o1, RainIntensity_all o2) {
                return new Double(o2.drp).compareTo(new Double(o1.drp));
            }
        });
        return newlist;
    }

    public List<RainIntensity_one> rainIntensity_one(String stcd, String stm, String etm, int timelength) throws NoDataException {
        List<RainIntensity_one> list = rainInfoDao.rainIntensity_one(stcd, stm, etm);
        if (list.size() == 0) {
            throw new NoDataException("没有数据!");
        }
        //向list添加一条假数据，用来结束并计算最后一条数据
        RainIntensity_one addone = new RainIntensity_one();
        addone.setStcd("");
        addone.setStnm("");
        addone.setDrp(0);
        addone.setTtt("");
        addone.setTm(new Date(list.get(list.size() - 1).getTm().getTime() + (24 * 60 * 60 * 1000)));
        list.add(addone);
        //创建新的list返回计算后的数据
        List<RainIntensity_one> newlist = new ArrayList<RainIntensity_one>();

        double drp = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            //当前数据
            RainIntensity_one oneNow = list.get(i);
            Date tmNow = oneNow.getTm();
            double drpNow = oneNow.getDrp();
            int sdNow = SomeForRain.getshiduan(tmNow, timelength);
            //下一条数据
            RainIntensity_one oneNext = list.get(i + 1);
            Date tmNext = oneNext.getTm();
            int sdNext = SomeForRain.getshiduan(tmNext, timelength);
            //两条数据相差分钟数
            long x = (tmNext.getTime() - tmNow.getTime()) / (1000 * 60);

            if (sdNow == sdNext && x < timelength * 60) {
                drp += drpNow;
            } else {
                RainIntensity_one one = new RainIntensity_one();
                drp += drpNow;
                one.setDrp(Double.parseDouble(new DecimalFormat("#0.0").format(drp)));
                drp = 0;
                one.setTtt(SomeForRain.tmstr(tmNow, sdNow, timelength));
                one.setStcd(stcd);
                one.setStnm(oneNow.getStnm());
                newlist.add(one);
            }
        }

        return newlist;
    }

    //区域降雨统计
    public Map<String, List<RegionalRainfall>> regionalRainfall(String stm, String etm) throws NoDataException {
        stm += " 08:00:00";
        etm += " 08:00:00";

        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        long slong = 0;
        long elong = 0;
        try {
            Date date = sDateFormat.parse(stm);
            slong = date.getTime();
            date = sDateFormat.parse(etm);
            elong = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int days = (int) ((elong - slong) / (1000 * 60 * 60 * 24)) + 1;
        //建立一个早上8点钟的long值数组（包括最后一天的结束时间，所以长度为天数+1）
        long[] longTMs = new long[days + 1];
        for (int i = 0; i < longTMs.length; i++) {
            longTMs[i] = slong + (1000 * 60 * 60 * 24 * i);

        }
        List<RegionalRainfall> adcds = rainInfoDao.findadcd();
        String[] ads = new String[adcds.size()];
        for (int i = 0; i < adcds.size(); i++) {
            ads[i] = adcds.get(i).getAdcd();
        }
        Map<String, List<RegionalRainfall>> map = new LinkedHashMap<String, List<RegionalRainfall>>();
        //按天查询，每天一个list
        for (int i = 0; i < days; i++) {
            stm = sDateFormat.format(new Date(longTMs[i]));
            etm = sDateFormat.format(new Date(longTMs[i + 1]));

            //list中查询到的是某一天的数据
            List<RegionalRainfall> list = rainInfoDao.regionalRainfall(stm, etm);

            //日期字符串ttt和新生成的newlist将作为键值对放入map返回
            String ttt = stm.substring(0, 10);
            List<RegionalRainfall> newlist = new ArrayList<RegionalRainfall>();

            //list_groupbyadcd用于放置同一天内不同地区的数据
            List<List<RegionalRainfall>> list_groupbyadcd = new ArrayList<List<RegionalRainfall>>();
            for (int j = 0; j < ads.length; j++) {
                List<RegionalRainfall> lsit_adcd = new ArrayList<RegionalRainfall>();
                for (int k = 0; k < list.size(); k++) {
                    RegionalRainfall now = list.get(k);
                    if (now != null && now.getAdcd().equals(ads[j])) {
                        lsit_adcd.add(now);
                    }
                }
                list_groupbyadcd.add(lsit_adcd);
            }
            //对每一天，每个地区的站点进行计算
            for (int j = 0; j < list_groupbyadcd.size(); j++) {

                List<RegionalRainfall> lsit_adcd = list_groupbyadcd.get(j);
                //政区名称
                String adnm = "";
                //累计降雨量
                double sumdrp = 0;
                //最大降雨量
                double maxdpr = 0;
                //降雨量大于50的站点数
                int over50 = 0;
                //有降雨的站的数量
                int num = 0;

                for (int k = 0; k < lsit_adcd.size(); k++) {
                    RegionalRainfall now = lsit_adcd.get(i);
                    //政区名称
                    adnm = now.getAdnm();
                    //累计降雨量
                    sumdrp += now.getDrp();
                    //最大降雨量
                    if (maxdpr < now.getDrp()) {
                        maxdpr = now.getDrp();
                    }
                    //降雨量大于50的站点数
                    if (now.getDrp() >= 50) {
                        over50++;
                    }
                    //有降雨的站的数量
                    if (now.getDrp() > 0) {
                        num++;
                    }
                }
                //平均降雨量
                double avgdrp = Double.parseDouble(new DecimalFormat("#0.0").format(sumdrp / num));

                RegionalRainfall rgrf = new RegionalRainfall();
                rgrf.setAdnm(adnm);
                rgrf.setNum(num);
                rgrf.setAvgdrp(avgdrp);
                rgrf.setMaxdpr(maxdpr);
                rgrf.setOver50(over50);
                rgrf.setNum(num);

                //将某个站的计算结果放入newlist
                newlist.add(rgrf);
            }

            //将时间作为键，newlist作为值，放入map
            map.put(ttt, newlist);


        }

        return map;
    }

    //站点详细信息
    public Rainfalls_one rain_detailed(String stcd) throws NoDataException {
        Rainfalls_one rrf = rainInfoDao.rain_detailed(stcd);
        if (rrf == null) {
            throw new NoDataException("没有数据！");
        }
        return rrf;
    }

}
