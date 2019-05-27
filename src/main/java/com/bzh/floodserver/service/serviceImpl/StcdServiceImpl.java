package com.bzh.floodserver.service.serviceImpl;

import com.bzh.floodserver.mapper.StcdDao;
import com.bzh.floodserver.model.Stcd;
import com.bzh.floodserver.model.user.Station;
import com.bzh.floodserver.model.user.TStation;
import com.bzh.floodserver.service.StcdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StcdServiceImpl implements StcdService {

    private final StcdDao stcdDao;

    @Autowired
    public StcdServiceImpl(StcdDao stcdDao) {
        this.stcdDao = stcdDao;
    }

    @Override
    public List<Stcd> getStcd() {
        return stcdDao.getStcd();
    }

    @Transactional
    @Override
    public int addUserStcd(int id, List<String> list) {
        List<String> stringList = stcdDao.selectById(id);
        Boolean aBoolean=null;
        if (stringList!=null){
            aBoolean = stcdDao.deleteById(id);
            if (aBoolean){
                return stcdDao.addUserStcd(id, list);
            }else {
                return 0;
            }
        }else {
            return stcdDao.addUserStcd(id, list);
        }
    }

    @Override
    public List<String> selectById(int id) {
        return stcdDao.selectById(id);
    }

    @Override
    public List<TStation> selectSSA() {
        List<Station> list = stcdDao.selectSSA();
        Map<String, List<Station>> map = new HashMap<>();
        List<Station> stations = null;
        for (int i = 0; i < list.size(); i++) {
            String adnm = list.get(i).getADNM();
            String stnm = list.get(i).getSTNM();
            String stcd = list.get(i).getSTCD();
            if (map.containsKey(adnm)) {
                stations = map.get(adnm);
                stations.add(new Station(stcd, stnm));
                map.put(adnm, stations);
            } else {
                stations = new ArrayList<>();
                stations.add(new Station(stcd, stnm));
                map.put(adnm, stations);
            }
        }
        List<TStation> tStationList = new ArrayList<>();

        for (String key : map.keySet()) {//keySet获取map集合key的集合  然后在遍历key即可
            List<Station> stationList = map.get(key);//
            List<TStation.CStation> cStationList = new ArrayList<>();
            for (int i = 0; i < stationList.size(); i++) {
                Station station = stationList.get(i);
                cStationList.add(new TStation.CStation(station.getSTCD(), station.getSTNM()));

            }
            tStationList.add(new TStation(key, cStationList));
        }
        /**内部类
         *  TStation tStation=new TStation();
         *  TStation.dd d=tStation.new dd();
         */

        /**嵌套类
         * TStation.cc c=new TStation.cc();
         */

        return tStationList;
    }
}
