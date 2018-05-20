package com.qf.p2p;

import com.google.gson.Gson;
import com.qf.domain.City;
import com.qf.domain.ResultJson;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

//消息监听器，可以实现异步消息获取，还可以实现消息过滤
public class MsgListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        if(message instanceof TextMessage){
            System.out.println("文本消息");
            TextMessage textMessage = (TextMessage)message;
            try {
                String json = textMessage.getText();
                System.out.println("原声:"+json);
                ResultJson<City> resultJson = new Gson().fromJson(json,ResultJson.class);
                System.out.println(resultJson.getMsg()+"--->"+resultJson.getResult().size());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
