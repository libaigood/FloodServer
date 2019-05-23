package com.bzh.floodserver.service;

import com.bzh.floodserver.model.Stcd;
import com.bzh.floodserver.model.user.UserStcd;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StcdService {

	List<Stcd> getStcd();

	/**
	 * 用户添加自己关注的站号
	 * @param id 用户id
	 * @param list 用户所关注的站号
	 * @return 添加的条数
	 */
	int addUserStcd(@Param("id") int id, @Param("list")List<Integer> list);


	/**
	 * 用户查询自己关注的站号
	 * @param id  用户id
	 * @return  UserStcd
	 */
	List<String> selectById(@Param("id") int id);
}
