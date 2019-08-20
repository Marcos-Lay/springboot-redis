package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import com.shuncom.sdk.core.client.ShuncomApiClient;
import com.shuncom.sdk.core.model.CredentialProvider;
import org.junit.Test;

/**
 * @program: demo
 * @description: LED2接口测试
 * @author: Marcos-Lay
 * @create: 2019-08-15 16:28
 **/
public class TestLed2 {
    //secret
    public static final String OPERATOR_ID = "710934318";
    public static final String OPERATOR_SECRET = "817d6468b4284991";
    public static final String DATA_SECRET = "96a16fa2d4544a61";
    public static final String DATA_SECRETIV = "1ace4a3822164a3b";
    public static final String SIG_SECRET = "cc66aad09752473a";

    public static final String USER_NAME = "yunboqun";
    public static final String PASS_WORD = "87654321";
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
    public void dev_list() {
        JSONObject body = new JSONObject();
        body.put("skip", "0");
        body.put("limit", "1");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/dev_list", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void dev_add() {
        JSONObject body = new JSONObject();
        body.put("cardId", "123");
        body.put("name", "1234567");
        body.put("id", "123");
        body.put("height", "-12a311111");
        body.put("width", "1231a1111");
        body.put("lightPole", "123");
        String sync = getClient().sync("led2/v1_0/dev_add", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void dev_del() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d552f3a560d65403c530b40111");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/dev_del", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void dev_group_query() {
        JSONObject body = new JSONObject();
        body.put("skip", "0");
        body.put("limit", "1");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/dev_group_query", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void dev_by_groupId() {
        JSONObject body = new JSONObject();
        body.put("uid", "1115c7779ac999a071a205f96c4");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/dev_by_groupId", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void dev_group_add() {
        JSONObject body = new JSONObject();
        body.put("devices","5bffc9eb4cb28b3020053833");
        body.put("name", "1234");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/dev_group_add", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void dev_group_del() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d554809560d11165403c530b41");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/dev_group_del", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void dev_group_update() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d2d68526c1152184855b39f");
        body.put("id", "123");
        body.put("name", "123");
        body.put("devices", "5cb695cbf22affbf32eca9a4");
        String sync = getClient().sync("led2/v1_0/dev_group_update", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void prog_query() {
        JSONObject body = new JSONObject();
        body.put("skip", "0");
        body.put("limit", "1");
        body.put("id", "123");
        body.put("validate", 0);
        String sync = getClient().sync("led2/v1_0/prog_query", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void prog_query_byId() {
        JSONObject body = new JSONObject();
        body.put("uid", "5c88c4f5999a07202436e51b");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/prog_query_byId", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void prog_add() {
        JSONObject body = new JSONObject();
        body.put("name", "5c88c4f5999a07202436e51b");
        body.put("width", "123");
        body.put("height", "123");
        body.put("layers", "123");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/prog_add", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void prog_del() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d1c226dcc5c862ce055c6a0");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/prog_del", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void prog_check() {
        JSONObject body = new JSONObject();
        body.put("uid", "5c88c4f5999a07202436e51b");
        body.put("id", "123");
        body.put("validate", "1a");
        body.put("failReason", "123");
        String sync = getClient().sync("led2/v1_0/prog_check", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void screen_open() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d3818626c115218f829bf76");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/screen_open", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void screen_close() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d3818626c115218f829bf76");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/screen_close", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void screen_capture() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d3818626c115218f829bf76");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/screen_capture", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void hardware_status() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d3818626c115218f829bf76111");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/hardware_status", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void adjust_light() {
        JSONObject body = new JSONObject();
        body.put("uid", "5cde5bd6f22aff47c9ddbd69");
        body.put("id", "123");
        body.put("lightValue", "123456");
        String sync = getClient().sync("led2/v1_0/adjust_light", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void network_query() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d3818626c115218f829bf76111");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/network_query", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void version_update() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d3818626c115218f829bf76");
        body.put("id", "123");
        body.put("appUrl", "123");
        String sync = getClient().sync("led2/v1_0/version_update", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void config_adv() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d3818626c115218f829bf76");
        body.put("id", "123");
        body.put("serverURL", "123");
        body.put("companyId", "123");
        body.put("realtimeURL", "123");
        body.put("usbProgramPwd", "123");
        String sync = getClient().sync("led2/v1_0/config_adv", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void dev_reboot() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d3818626c115218f829bf76");
        body.put("id", "123");
        String sync = getClient().sync("led2/v1_0/dev_reboot", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void dev_lock() {
        JSONObject body = new JSONObject();
        body.put("uid", "5cde5bd6f22aff47c9ddbd69");
        body.put("id", "123");
        body.put("lock", "1");
        String sync = getClient().sync("led2/v1_0/dev_lock", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void dev_autoBrightness() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d3818626c115218f829bf76");
        body.put("id", "123");
        body.put("sensitivity", "111qa111");
        body.put("minBrightness", "11a1111");
        String sync = getClient().sync("led2/v1_0/dev_autoBrightness", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void dev_sync() {
        JSONObject body = new JSONObject();
        body.put("uid", "5d3818626c115218f829bf76");
        body.put("id", "123");
        body.put("time", "111qa111");
        body.put("brightness", "111qa111");
        body.put("volume", "111qa111");
        body.put("screenSwitch", "111qa111");
        body.put("delaySync", "111qa111");
        body.put("checkNtpTime", "111qa111");
        String sync = getClient().sync("led2/v1_0/dev_sync", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void task_query() {
        JSONObject body = new JSONObject();
        body.put("id", "123");
        body.put("skip", "0");
        body.put("limit", "-1");
        String sync = getClient().sync("led2/v1_0/task_query", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void task_del() {
        JSONObject body = new JSONObject();
        body.put("id", "123");
        body.put("uid","5d3fe7c9f22affc6027ad9bc");
        String sync = getClient().sync("led2/v1_0/task_del", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void task_bind_dev() {
        JSONObject body = new JSONObject();
        body.put("id", "123");
        body.put("uid","5d3fe7c9f22affc6027ad9bc");
        body.put("devices","5d3818626c115218f829bf76");
        String sync = getClient().sync("led2/v1_0/task_bind_dev", body.toJSONString());
        System.out.println(sync);
    }

    @Test
    public void task_publish() {
        JSONObject body = new JSONObject();
        body.put("id", "123");
        body.put("uid","5d3fe7c9f22affc6027ad9bc");
        String sync = getClient().sync("led2/v1_0/task_publish", body.toJSONString());
        System.out.println(sync);
    }
    @Test
    public void test1() {
        int maxValue = Integer.MAX_VALUE;
        int i = maxValue + 1;
        System.out.println(maxValue);
        System.out.println(i);
    }
}
