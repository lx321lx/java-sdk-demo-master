package com.qianmi.open.sdk.web.controller.recharge;

import com.qianmi.open.api.ApiException;
import com.qianmi.open.api.DefaultOpenClient;
import com.qianmi.open.api.OpenClient;
import com.qianmi.open.api.request.RechargeBaseGetItemInfoRequest;
import com.qianmi.open.api.response.RechargeBaseGetItemInfoResponse;

public class ApiDemo {
    protected static String serverUrl = "http://gw.api.qianmi.com/api";
    protected static String appKey = "test";
    protected static String appSecret = "test";
    protected static String acceessToken = "test";

    public void testGetItemInfo()  {
        OpenClient client = new DefaultOpenClient(serverUrl, appKey, appSecret);
        RechargeBaseGetItemInfoRequest req = new RechargeBaseGetItemInfoRequest();
        req.setItemId("140600");
        try {
            RechargeBaseGetItemInfoResponse response=client.execute(req,acceessToken);
            System.out.println(response.getItemInfo().getItemName());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ApiDemo().testGetItemInfo();
    }
}
