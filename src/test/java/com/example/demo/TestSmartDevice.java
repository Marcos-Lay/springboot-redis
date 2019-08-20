package com.example.demo;

import com.shuncom.sdk.core.client.ShuncomApiClient;
import com.shuncom.sdk.core.model.CredentialProvider;
import org.junit.Test;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-07-23 11:02
 **/
public class TestSmartDevice {
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
    public void test(){

    }
}
