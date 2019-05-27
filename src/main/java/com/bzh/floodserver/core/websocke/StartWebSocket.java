package com.bzh.floodserver.core.websocke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: libai
 * @Date: 2019/5/7 10:09
 * @Version 1.0
 * @Description:
 */
@Component
@Order(value = 1)
public class StartWebSocket implements ApplicationRunner {
    @Autowired
    private CustomWebSocke customWebSocke;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        customWebSocke.start();
        try {
            String ip = InetAddress.getLocalHost().getHostAddress();
            int port = customWebSocke.getPort();
            System.out.println(String.format("服务已启动: %s:%d", ip, port));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

		/*while (true) {
			try {
				String msg = reader.readLine();
				socketServer.sendToAll(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/

    }
}
