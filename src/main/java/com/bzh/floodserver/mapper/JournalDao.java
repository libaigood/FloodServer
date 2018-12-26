package com.bzh.floodserver.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalDao {
	int logJournal(@Param("id") String id, @Param("tm") String tm, @Param("requrl") String requrl, @Param("lvl") int lvl);
}
