package com.example.paytmapi;

public class Constants {

    // Paytm Merchant Staging Credentials obtained from https://dashboard.paytm.com/next/apikeys
    final static String MERCHANT_ID = "bDNidr78776558981598";
    final static String WEBSITE = "WEBSTAGING";
    final static String HOST = "https://us-central1-form-dc039.cloudfunctions.net/"; // Firebase functions url
    final static String CALLBACK = HOST + "/response";
    final static String CHECKSUM = HOST + "/checksum";
}
