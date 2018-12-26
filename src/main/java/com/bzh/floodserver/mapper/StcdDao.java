package com.bzh.floodserver.mapper;

import com.bzh.floodserver.model.Stcd;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 查询站点 等等
 */
@Repository
public interface StcdDao {
    List<Stcd> getStcd();

}
