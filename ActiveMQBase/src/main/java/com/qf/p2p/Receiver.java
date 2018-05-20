package com.qf.p2p;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import javax.xml.soap.Text;

public class Receiver {
    private String username;
    private String password;
    private String url;
    public Receiver(){
        username= ActiveMQConnection.DEFAULT_USER;
        password=ActiveMQConnection.DEFAULT_PASSWORD;
        url="tcp://10.0.127.90:61616";//发送端口号
    }
    public String receiveMsg() throws JMSException {
        ConnectionFactory factory = new ActiveMQConnectionFactory(username,password,url);
        Connection connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        //创建目标对象，队列或者主题
        Destination destination = session.createQueue("java");
        MessageConsumer consumer = session.createConsumer(destination);
        TextMessage message = (TextMessage) consumer.receive();//没有消息，receive方法就阻塞
        String messageText = message.getText();
        session.close();
        connection.close();
        return messageText;
    }

    public void receiveAsy() throws JMSException {
        ConnectionFactory factory = new ActiveMQConnectionFactory(username,password,url);
        Connection connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        //创建目标对象，队列或者主题
        Destination destination = session.createQueue("java");
        MessageConsumer consumer = session.createConsumer(destination);
        consumer.setMessageListener(new MsgListener());
        //session.close();
        //connection.close();
    }
}
