package com.qf.p2p;

import javax.jms.JMSException;

public class ReceiveMain {
    public static void main(String[] args) throws JMSException {
        new Receiver().receiveAsy();
    }
}
