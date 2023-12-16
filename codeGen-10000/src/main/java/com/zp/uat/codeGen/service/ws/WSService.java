package com.zp.uat.codeGen.service.ws;

import org.springframework.boot.webservices.client.WebServiceTemplateBuilder;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.transform.Result;
import java.io.IOException;

/**
 * @author PeterZP
 * @create 2023-12-01 11:04
 */
public class WSService {
    private final WebServiceTemplate webServiceTemplate;

    public WSService(WebServiceTemplateBuilder webServiceTemplateBuilder) {
        this.webServiceTemplate = webServiceTemplateBuilder.build();
    }

    public static void main(String[] args) {
        WebServiceTemplateBuilder webServiceTemplateBuilder = new WebServiceTemplateBuilder();
        WebServiceTemplate webServiceTemplate = webServiceTemplateBuilder.build();
        webServiceTemplate.setMarshaller(new Marshaller() {
            @Override
            public boolean supports(Class<?> clazz) {
                return false;
            }

            @Override
            public void marshal(Object graph, Result result) throws IOException, XmlMappingException {

            }
        });
        webServiceTemplate.setDefaultUri("https://ws.webxml.com.cn/WebServices/WeatherWS.asmx/getRegionProvince");
        Object o = webServiceTemplate.marshalSendAndReceive(new Object() ,new SoapActionCallback("https://ws.webxml.com.cn/WebServices/WeatherWS.asmx/getRegionProvince"));
        System.out.println(o);
    }

}
