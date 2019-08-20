package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import com.shuncom.sdk.core.client.ShuncomApiClient;
import com.shuncom.sdk.core.model.CredentialProvider;
import org.junit.Test;

/**
 * @program: demo
 * @description: 测试LED3
 * @author: Marcos-Lay
 * @create: 2019-07-13 14:50
 **/
public class TestLED3 {
    //secret
    public static final String OPERATOR_ID        	   = "710934318";
    public static final String OPERATOR_SECRET         = "817d6468b4284991";
    public static final String DATA_SECRET             = "96a16fa2d4544a61";
    public static final String DATA_SECRETIV           = "1ace4a3822164a3b";
    public static final String SIG_SECRET              = "cc66aad09752473a";

    public static final String USER_NAME = "root";
    public static final String PASS_WORD = "root.7036";
    public static final String HOST = "192.168.5.221:8083";
    public CredentialProvider getProvider(){
        CredentialProvider provider = new CredentialProvider();
        provider.setUserName(USER_NAME).setPassword(PASS_WORD)
                .setOperatorID(OPERATOR_ID).setSigsecret(SIG_SECRET)
                .setDataSecret(DATA_SECRET).setOperatorSecret(OPERATOR_SECRET)
                .setSecretIV(DATA_SECRETIV);
        return provider;
    }
    public ShuncomApiClient getClient(){
        CredentialProvider provider = getProvider();
        ShuncomApiClient client = ShuncomApiClient.newBuilder()
                .setCredentialProvider(provider).setHost(HOST).build();
        return client;
    }
    @Test
    public void add_device(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("name","addLED3Test2");
        body.put("width","100");
        body.put("height","100");
        body.put("addr","6e:0d:c7:5f:9d:c2");
        String sync = getClient().sync("led3/v1_0/add_device", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void query_device(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("page","1");
        body.put("limit",10);
        String sync = getClient().sync("led3/v1_0/query_device", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void query_device_only(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("uid","5d24765d63c46a1ce4070157888");
        String sync = getClient().sync("led3/v1_0/query_device_only", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void update_device(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("uid","5d2eee3563c46a3e40b75aaa");
        body.put("name","cs1");
        String sync = getClient().sync("led3/v1_0/update_device", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void delete_device(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("uids","5d24765d63c46a1ce4070157");
        String sync = getClient().sync("led3/v1_0/delete_device", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void add_resources(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("type",2);
        String sync = getClient().sync("led3/v1_0/add_resources", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void query_resources(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("page","3");
        body.put("limit","5");
        String sync = getClient().sync("led3/v1_0/query_resources", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void query_resource_only(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("uid","3");
        String sync = getClient().sync("led3/v1_0/query_resource_only", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void delete_resources(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("uid","5d2008e3f22aff1b793f8aaa, , ,");
        String sync = getClient().sync("led3/v1_0/delete_resources", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void query_program_only(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("uid","1");
        String sync = getClient().sync("led3/v1_0/query_program_only", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void update_program(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("uid","5c8a0db28d48280eb41d8a56");
        body.put("name","test1");
        String sync = getClient().sync("led3/v1_0/update_program", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void delete_programs(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("uids","5c8a0db28d48280eb41d8a56, , ,");
        String sync = getClient().sync("led3/v1_0/delete_programs", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void program_bind_devices(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("uid","5c8a0db28d48280eb41d8a56");
        body.put("deviceList","5d298523631db34f34d6aa32, , , ");
        String sync = getClient().sync("led3/v1_0/program_bind_devices", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void publish_programs(){
        JSONObject body = new JSONObject();
        body.put("oid","1234");
        body.put("uid","5c8a0db28d48280eb41d8a56");
        body.put("deviceList","5d298523631db34f34d6aa32, , , ");
        String sync = getClient().sync("led3/v1_0/publish_programs", body.toJSONString());
        System.out.println(sync);
    }
}
