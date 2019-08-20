package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import com.shuncom.sdk.core.client.ShuncomApiClient;
import com.shuncom.sdk.core.model.CredentialProvider;
import org.junit.Test;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-08-03 14:59
 **/
public class TestLed2Task {
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
    public void query_device() {
        JSONObject body = new JSONObject();
        body.put("skip", "0");
        body.put("limit", "111");
        String sync = getClient().sync("led2task/v1_0/queryTimedBrightness", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void binding() {
        JSONObject body = new JSONObject();
        body.put("id", "5d43da89cc5c863c20fec845");
        body.put("devId", "5cb695cbf22affbf32eca9a4");
        String sync = getClient().sync("led2task/v1_0/binding", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void UnboundTask() {
        JSONObject body = new JSONObject();
        body.put("id", "5d43da89cc5c863c20fec845");
        body.put("devId", "5cb695cbf22affbf32eca9a4");
        String sync = getClient().sync("led2task/v1_0/UnboundTask", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void openTimedBrightnessTask() {
        JSONObject body = new JSONObject();
        body.put("id", "5cc12e366c11524a447cd0af");
        body.put("defaultBrightness", "10");
        String sync = getClient().sync("led2task/v1_0/openTimedBrightnessTask", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void addTimedBrightness() {
        JSONObject body = new JSONObject();
        body.put("name", "13");
        body.put("dateType", "All");
        body.put("startDate", "1991-01-01");
        body.put("endDate", "1991-01-02");
        body.put("timeType", "All");
        body.put("startTime", "00:00");
        body.put("endTime", "00:01");
        body.put("filterType", "All");
        body.put("weekFilter", "1,7,1,5,7");
        body.put("brightness", "11");
        String sync = getClient().sync("led2task/v1_0/addTimedBrightness", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void updateTimedBrightnessTask() {
        JSONObject body = new JSONObject();
        body.put("id","5d4ce718560d6522a460e184");
        String sync = getClient().sync("led2task/v1_0/updateTimedBrightness", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void queryOne_device() {
        JSONObject body = new JSONObject();
        body.put("id", "5cc12e366c11524a447cd0af");
        String sync = getClient().sync("led2task/v1_0/queryOneTimedBrightness", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void queryOneSwitchScreenTask() {
        JSONObject body = new JSONObject();
        body.put("id", "5d4a6b94560d65617c0f4630");
        String sync = getClient().sync("led2task/v1_0/queryOneSwitchScreenTask", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void querySwitchScreenTask() {
        JSONObject body = new JSONObject();
        body.put("skip", "0");
        body.put("limit", "10");
        String sync = getClient().sync("led2task/v1_0/querySwitchScreenTask", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void addSwitchScreen() {
        JSONObject body = new JSONObject();
        body.put("name", "23");
        body.put("dateType", "All");
        body.put("startDate", "1991-01-01");
        body.put("endDate", "1991-01-02");
        body.put("timeType", "All");
        body.put("startTime", "00:00");
        body.put("endTime", "00:01");
        body.put("filterType", "All");
        body.put("weekFilter", "1,7,,,");
        body.put("screenStatus", "0");
        String sync = getClient().sync("led2task/v1_0/addSwitchScreen", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void openTimedBrightness() {
        JSONObject body = new JSONObject();
        body.put("id", "5d53d08cf22affaa5d7953d9");
        body.put("brightness", "1");
        String sync = getClient().sync("led2task/v1_0/openTimedBrightness", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void closeTimedBrightness() {
        JSONObject body = new JSONObject();
        body.put("id", "5d53d08cf22affaa5d7953d9");
        body.put("brightness", "1");
        String sync = getClient().sync("led2task/v1_0/closeTimedBrightness", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void updateTimedBrightness() {
        JSONObject body = new JSONObject();
        body.put("id", "5d5a08a04639c526008dfb6b");
        body.put("name", "14");
        body.put("dateType", "All");
        body.put("startDate", "1991-01-01");
        body.put("endDate", "1991-01-02");
        body.put("timeType", "All");
        body.put("startTime", "00:00");
        body.put("endTime", "00:01");
        body.put("filterType", "All");
        body.put("weekFilter", "1,7,1,5,7");
        body.put("screenStatus", "0");
        String sync = getClient().sync("led2task/v1_0/updateTimedBrightness", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void deleteTimedBrightness() {
        JSONObject body = new JSONObject();
        body.put("id", "5d5128d4560d65161c111380");
        String sync = getClient().sync("led2task/v1_0/deleteTimedBrightness", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void queryOneSwitchScreen() {
        JSONObject body = new JSONObject();
        body.put("id", "5d43da89cc5c863c20fec845");
        String sync = getClient().sync("led2task/v1_0/queryOneSwitchScreen", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void querySwitchScreen() {
        JSONObject body = new JSONObject();
        body.put("skip", "0");
        body.put("limit", "3");
        String sync = getClient().sync("led2task/v1_0/querySwitchScreen", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void openSwitchScreen() {
        JSONObject body = new JSONObject();
        body.put("id", "5d53efdcf22affaa5d7953de");
        String sync = getClient().sync("led2task/v1_0/openSwitchScreen", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void closeSwitchScreen() {
        JSONObject body = new JSONObject();
        body.put("id", "5d53efdcf22affaa5d7953de");
        String sync = getClient().sync("led2task/v1_0/closeSwitchScreen", body.toJSONString());
        System.out.println(sync);
    }

}
