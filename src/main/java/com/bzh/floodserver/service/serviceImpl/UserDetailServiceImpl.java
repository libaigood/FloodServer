package com.bzh.floodserver.service.serviceImpl;

import com.bzh.floodserver.mapper.UserMapper;
import com.bzh.floodserver.model.User;
import com.bzh.floodserver.utils.SecurityModelFactory;
import com.bzh.floodserver.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 毕泽浩
 * @Description: 获取 userDetail
 * @time 2018/9/10 14:25
 */
@Service("userDetailServiceImpl")
public class UserDetailServiceImpl implements UserDetailsService {

	private final UserMapper userMapper;

	private final TokenUtils tokenUtils;

	@Autowired
	public UserDetailServiceImpl(UserMapper userMapper, TokenUtils tokenUtils) {
		this.userMapper = userMapper;
		this.tokenUtils = tokenUtils;
	}

	@Override
	public UserDetails loadUserByUsername(String token) throws UsernameNotFoundException {

		// 尝试拿 token 中的 username
		// 若是没有 token 或者拿 username 时出现异常，那么 username 为 null
		String username = tokenUtils.getUsernameFromToken(token);
		if (username == null) {
			return null;
		} else {
			User user = userMapper.getUserByName(username);
			if (user == null) {
				throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
			} else {
				user.setToken(token);
				return SecurityModelFactory.create(user);
			}
		}
	}
}
