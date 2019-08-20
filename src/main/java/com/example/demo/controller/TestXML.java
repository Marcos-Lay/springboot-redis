package com.example.demo.controller;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

/**
 * @program: demo
 * @description: 测试以XML方式请求解析
 * @author: Marcos-Lay
 * @create: 2019-07-29 10:47
 **/
@RestController
public class TestXML {
    @PostMapping("text")
    public String test(@RequestBody String xml) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbf.newDocumentBuilder();
        Document doc = docBuilder.parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));
        Element root = doc.getDocumentElement();
        Element ipAddress = (Element)root.getElementsByTagName("ipAddress").item(0);
        Element peopleCounting = (Element)root.getElementsByTagName("peopleCounting").item(0);
        Element timeRange = (Element)peopleCounting.getElementsByTagName("TimeRange").item(0);
        Node startTime = timeRange.getElementsByTagName("startTime").item(0);
        return startTime.getTextContent().trim();
    }
    @PostMapping("text1")
    public String test1(@RequestBody String xml){
        XMLSerializer xmls = new XMLSerializer();
        JSON con = xmls.read(xml);
        System.out.println(con);
        return con.toString();
    }
}
