package com.bzh.floodserver.utils;

import com.bzh.floodserver.model.User;
import com.bzh.floodserver.service.serviceImpl.UserDetailImpl;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.Collection;

/**
 * @version V1.0.0
 * @Description 用于将 User 转换成 UserDetail对象
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017年8月13日17:04:08
 */
public class SecurityModelFactory {

	public static UserDetailImpl create(User user) {
		Collection<? extends GrantedAuthority> authorities;
		try {
			authorities = AuthorityUtils.commaSeparatedStringToAuthorityList(user.getAuthorities());
		} catch (Exception e) {
			authorities = null;
		}

		/*Date lastPasswordReset = new Date();
		lastPasswordReset.setTime(user.getLastPasswordChange());*/
		return new UserDetailImpl(
				user.getUsername(),
				user.getUsername(),
				user.getPassword(),
				user.getLastPasswordChange(),
				authorities,
				user.enable(),
				user.getToken()
		);
	}

}
