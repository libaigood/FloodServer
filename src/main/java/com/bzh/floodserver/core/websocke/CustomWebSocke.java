package com.bzh.floodserver.core.websocke;

import com.bzh.floodserver.model.user.Talk;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: libai
 * @Date: 2019/5/7 9:44
 * @Version 1.0
 * @Description:
 */
@Component
public class CustomWebSocke extends WebSocketServer {

    public CustomWebSocke() throws UnknownHostException {
        super(new InetSocketAddress(8763));
    }

    private static final Map<String, WebSocket> stringMap = new LinkedHashMap<>();
    private static final Map<WebSocket, String> webSocketMap = new LinkedHashMap<>();
    private static Gson gson;


    /**
     * 连接建立成功调用的方法
     */
    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
        System.out.println("webSocke--onOpen");
        String address = webSocket.getRemoteSocketAddress().getAddress().getHostAddress();
        String message = String.format("(%s) <进入房间！>", address);
        System.out.println(message);

    }

    /**
     * 连接关闭调用的方法
     */
    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {
        System.out.println("webSocke--onClose");
        String address = webSocket.getRemoteSocketAddress().getAddress().getHostAddress();
        String message = String.format("(%s) <退出房间！>", address);
        System.out.println(message);
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param webSocket
     * @param s
     */
    @Override
    public void onMessage(WebSocket webSocket, String s) {
        System.out.println("webSocke--onMessage");
        Talk talk = new Talk((long) 1,"100","123456","111111",1,new Date(),"123456");//gson.fromJson(s, Talk.class);
//        System.out.println(toString());
        switch (talk.getCode()) {
            case "100": //首次连接
                boolean isContains = stringMap.containsKey(talk.getSender());
                System.out.println("状态" + isContains);
                if (isContains) {
                    WebSocket ws = stringMap.get(talk.getSender());
                    System.out.println(ws);
                    Talk tk = new Talk();
                    tk.setCode("455");
                    tk.setMessage("账号异常,请重新登录");
                    ws.send(gson.toJson(tk, Talk.class));
                    stringMap.remove(talk.getSender());
                    webSocketMap.remove(ws);
                }
                stringMap.put(talk.getSender(), webSocket);
                webSocketMap.put(webSocket, talk.getSender());
                //messageHandler.activePush(talk.getSender());
                break;
            case "200": //聊天
                // messageHandler.transferPush(talk);
                break;
        }
    }

    @Override
    public void onError(WebSocket webSocket, Exception e) {
        System.out.println("webSocke--onError");
        e.printStackTrace();
    }

    /**
     *
     */
    @Override
    public void onStart() {
        System.out.println("webSocke--onStart");
        System.out.println("开始执行WebSocket");
        gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    }
}
