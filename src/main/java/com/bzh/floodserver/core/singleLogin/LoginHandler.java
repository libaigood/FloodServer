package com.bzh.floodserver.core.singleLogin;

import com.bzh.floodserver.model.User;
import com.bzh.floodserver.service.serviceImpl.UserDetailImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 毕泽浩
 * @Description: 用户容器容器
 * @time 2018/12/21 10:35
 */
@Component
public class LoginHandler {

	private Map<String, String> usersContainer;

	public void addUser(User user) {

		if (usersContainer == null) {
			usersContainer = new HashMap<>();
		}
		usersContainer.put(user.getUsername(), user.getToken());
	}

	/**
	 * 比对token
	 * @param userDetail
	 * @return
	 */
	public boolean tokenHandler(UserDetailImpl userDetail) {
        if (usersContainer == null) {
            usersContainer = new HashMap<>();
        }
		String val = usersContainer.get(userDetail.getUsername());
		if(val!=null){
		return val.equals(userDetail.getToken());
		}else{
		    return  false;
        }

	}
}
