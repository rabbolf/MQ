package com.qf.p2p;

import javax.jms.JMSException;

public class activeMain {
    public static void main(String[] args) throws JMSException {
        //new Sender().sendMsg("第一条activeMQ");
        //System.out.println(new Receiver().receiveMsg());
        new Sender().sendMsg("\n" +
                "\n" +
                "{\n" +
                "    \"status\": \"0\",\n" +
                "    \"msg\": \"ok\",\n" +
                "    \"result\": [\n" +
                "        {\n" +
                "            \"city\": \"beijing\",\n" +
                "            \"cityname\": \"北京\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"city\": \"tianjin\",\n" +
                "            \"cityname\": \"天津\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"city\": \"hangzhou\",\n" +
                "            \"cityname\": \"杭州\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"city\": \"chengdu\",\n" +
                "            \"cityname\": \"成都\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"city\": \"lanzhou\",\n" +
                "            \"cityname\": \"兰州\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"city\": \"guiyang\",\n" +
                "            \"cityname\": \"贵阳\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"city\": \"nanchang\",\n" +
                "            \"cityname\": \"南昌\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"city\": \"changchun\",\n" +
                "            \"cityname\": \"长春\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"city\": \"haerbin\",\n" +
                "            \"cityname\": \"哈尔滨\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"city\": \"wuhan\",\n" +
                "            \"cityname\": \"武汉\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"city\": \"shanghai\",\n" +
                "            \"cityname\": \"上海\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"city\": \"shenzhen\",\n" +
                "            \"cityname\": \"深圳\"\n" +
                "        }\n" +
                "    ]\n" +
                "}\n" +
                "\n");
        //new Receiver().receiveAsy();
    }
}
