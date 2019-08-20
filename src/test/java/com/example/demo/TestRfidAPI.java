package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import com.shuncom.sdk.core.client.ShuncomApiClient;
import com.shuncom.sdk.core.model.CredentialProvider;

import java.lang.reflect.InvocationTargetException;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-06-29 15:31
 **/
public class TestRfidAPI {
    //secret
    public static final String OPERATOR_ID        	   = "710934318";
    public static final String OPERATOR_SECRET         = "817d6468b4284991";
    public static final String DATA_SECRET             = "96a16fa2d4544a61";
    public static final String DATA_SECRETIV           = "1ace4a3822164a3b";
    public static final String SIG_SECRET              = "cc66aad09752473a";

    public static final String USER_NAME = "yunboqun";
    public static final String PASS_WORD = "87654321";
    public static final String HOST = "192.168.5.221:8083";

    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        CredentialProvider provider = new CredentialProvider();
        provider.setUserName(USER_NAME).setPassword(PASS_WORD)
                .setOperatorID(OPERATOR_ID).setSigsecret(SIG_SECRET)
                .setDataSecret(DATA_SECRET).setOperatorSecret(OPERATOR_SECRET)
                .setSecretIV(DATA_SECRETIV);

        ShuncomApiClient client = ShuncomApiClient.newBuilder()
                .setCredentialProvider(provider).setHost(HOST).build();
        JSONObject body = new JSONObject();
        //测试分页查询读卡器
        /*body.put("skip","0");
        body.put("limit","5");
        String result = client.sync("rfidreader/v1_0/queryDevice", body.toJSONString());
        System.out.println(result);*/
        //测试根据ID查询读卡器
        /*body.put("id","5c9334fd6c115235f4852189111");
        String result = client.sync("rfidreader/v1_0/queryOneDevice", body.toJSONString());
        System.out.println(result);*/
        //读卡器在线数与在线率
        /*String result = client.sync("rfidreader/v1_0/onlineDevice", body.toJSONString());
        System.out.println(result);*/
        //读卡器添加
        /*body.put("name","test15");
        body.put("sno","12312312313b");
        body.put("lightPole","59fa6bfa2773e41c80837892");
        String result = client.sync("rfidreader/v1_0/addDevice", body.toJSONString());
        System.out.println(result);*/
        //读卡器更新
        /*body.put("id","5d2c54dcbad2dd230c0bd652");
        String result = client.sync("rfidreader/v1_0/updateDevice", body.toJSONString());
        System.out.println(result);*/
        //读卡器删除
        /*body.put("id","5d1aec8f631db31cb0fedf14");
        String result = client.sync("rfidreader/v1_0/deleteDeviceRfidReader", body.toJSONString());
        System.out.println(result);*/
        //卡片增加
        /*body.put("sno","12323233");
        body.put("name","test1");
        String result = client.sync("rfididcard/v1_0/addDeviceRfidIdCard", body.toJSONString());
        System.out.println(result);*/
        //卡片更新
        /*body.put("id","5c934adc6c11521334626733");
        body.put("name","35");
        String result = client.sync("rfididcard/v1_0/updateDevice", body.toJSONString());
        System.out.println(result);*/
        //卡片删除
        /*body.put("id","5d1afd5b631db33a24c4c56b");
        String result = client.sync("rfididcard/v1_0/deleteDeviceRfidIdCard", body.toJSONString());
        System.out.println(result);*/
        //卡片分页查询
        /*body.put("skip","0");
        body.put("limit","5");
        String result = client.sync("rfididcard/v1_0/queryDevice", body.toJSONString());
        System.out.println(result);*/
        //卡片ID查询
        /*body.put("id","5c934adc6c11521334626733");
        String result = client.sync("rfididcard/v1_0/queryOneDeviceIdCard", body.toJSONString());
        System.out.println(result);*/
        //查询打卡历史记录
        /*body.put("startDate","2019-03-12 18:13:45");
        body.put("endDate","2019-03-12 18:88:16");
        body.put("skip","0");
        body.put("limit","101");
        String result = client.sync("rfididcard/v1_0/findHistory", body.toJSONString());
        System.out.println(result);*/
        //离线报警接口
        /*body.put("startDate","2019-03-11 18:13:45");
        body.put("endDate","2019-03-20 18:88:16");
        body.put("skip","0");
        body.put("limit","5");
        body.put("search","201808030163");
        String result = client.sync("rfidalarm/v1_0/offLine", body.toJSONString());
        System.out.println(result);*/
        //低压报警接口
        body.put("startDate","2019-03-11 18:13:45");
        body.put("endDate","2019-03-20 18:88:16");
        body.put("skip","0");
        body.put("limit","5");
        String result = client.sync("rfidalarm/v1_0/lowPre", body.toJSONString());
        System.out.println(result);
    }
}
