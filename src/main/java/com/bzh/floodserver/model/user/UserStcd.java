package com.bzh.floodserver.model.user;

import java.util.List;

/**
 * @Author: libai
 * @Date: 2019/5/21 16:04
 * @Version 1.0
 * @Description:
 */
public class UserStcd {
    private Integer ID;
    private Integer STCD;

    public UserStcd() {
    }





    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getSTCD() {
        return STCD;
    }

    public void setSTCD(Integer STCD) {
        this.STCD = STCD;
    }

    public UserStcd(Integer ID, Integer STCD) {
        this.ID = ID;
        this.STCD = STCD;
    }

    @Override
    public String toString() {
        return "UserStcd{" +
                "ID=" + ID +
                ", STCD=" + STCD +
                '}';
    }
}
