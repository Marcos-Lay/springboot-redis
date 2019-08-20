package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import com.shuncom.sdk.core.client.ShuncomApiClient;
import com.shuncom.sdk.core.model.CredentialProvider;
import org.junit.Test;

/**
 * @program: demo
 * @description: LED2资源接口测试
 * @author: Marcos-Lay
 * @create: 2019-08-14 09:38
 **/
public class TestLed2Resources {
    //secret
    public static final String OPERATOR_ID = "710934318";
    public static final String OPERATOR_SECRET = "817d6468b4284991";
    public static final String DATA_SECRET = "96a16fa2d4544a61";
    public static final String DATA_SECRETIV = "1ace4a3822164a3b";
    public static final String SIG_SECRET = "cc66aad09752473a";

    public static final String USER_NAME = "root";
    public static final String PASS_WORD = "root.7036";
    public static final String HOST = "192.168.5.221:8083";

    public CredentialProvider getProvider() {
        CredentialProvider provider = new CredentialProvider();
        provider.setUserName(USER_NAME).setPassword(PASS_WORD)
                .setOperatorID(OPERATOR_ID).setSigsecret(SIG_SECRET)
                .setDataSecret(DATA_SECRET).setOperatorSecret(OPERATOR_SECRET)
                .setSecretIV(DATA_SECRETIV);
        return provider;
    }

    public ShuncomApiClient getClient() {
        CredentialProvider provider = getProvider();
        ShuncomApiClient client = ShuncomApiClient.newBuilder()
                .setCredentialProvider(provider).setHost(HOST).build();
        return client;
    }

    @Test
    public void res_query() {
        JSONObject body = new JSONObject();
        body.put("skip", "0");
        body.put("limit", "1");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/res_query", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void res_query_byId() {
        JSONObject body = new JSONObject();
        body.put("id", "123");
        body.put("uid", "5cb6d25df22affc6968ddd8d");
        String sync = getClient().sync("led2/v1_0/res_query_byId", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void res_query_byName() {
        JSONObject body = new JSONObject();
        body.put("id", "123");
        body.put("name", "2f1ce6f2_8373_43d9_aa23_de22f7e957c8_14_classicsportscars_chevroletcorvette.jpg");
        String sync = getClient().sync("led2/v1_0/res_query_byName", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void res_add() {
        JSONObject body = new JSONObject();
        body.put("id", "123");
        body.put("type", "2");
        body.put("name", "Marcos测试1");
        String sync = getClient().sync("led2/v1_0/res_add", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void res_del() {
        JSONObject body = new JSONObject();
        body.put("id", "123");
        body.put("uid", "5cc65460999a07073462e517");
        String sync = getClient().sync("led2/v1_0/res_del", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void res_group_query() {
        JSONObject body = new JSONObject();
        body.put("skip", "0");
        body.put("limit", "1");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/res_group_query", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void res_by_groupId() {
        JSONObject body = new JSONObject();
        body.put("id", "123");
        body.put("uid", "5c9c2b42999a0707e07c9953");
        String sync = getClient().sync("led2/v1_0/res_by_groupId", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void res_group_add() {
        JSONObject body = new JSONObject();
        body.put("id", "123");
        body.put("name", "123");
        body.put("resources", "123,234,345");
        String sync = getClient().sync("led2/v1_0/res_group_add", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void res_group_del() {
        JSONObject body = new JSONObject();
        body.put("id", "123");
        body.put("uid", "5c9c2b42999a0707e07c9953");
        String sync = getClient().sync("led2/v1_0/res_group_del", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void res_group_update() {
        JSONObject body = new JSONObject();
        body.put("id", "123");
        body.put("uid", "5cb02e89999a0713781782a8");
        body.put("name","123");
        body.put("resourcesList","123");
        String sync = getClient().sync("led2/v1_0/res_group_update", body.toJSONString());
        System.out.println(sync);
    }
}
