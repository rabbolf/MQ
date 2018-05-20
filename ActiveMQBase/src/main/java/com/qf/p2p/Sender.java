package com.qf.p2p;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class Sender {
    private String username;
    private String password;
    private String url;
    public Sender(){
        username= ActiveMQConnection.DEFAULT_USER;
        password=ActiveMQConnection.DEFAULT_PASSWORD;
        url="tcp://10.0.127.90:61616";//发送端口号
    }
    public void sendMsg(String msg) throws JMSException {
        ConnectionFactory factory = new ActiveMQConnectionFactory(username,password,url);
        Connection connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        //创建目标对象，队列或者主题
        Destination destination = session.createQueue("java");
        MessageProducer producer = session.createProducer(destination);
        TextMessage textMessage = session.createTextMessage(msg);
        producer.send(textMessage);
        session.close();
        connection.close();

    }
}
