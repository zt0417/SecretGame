package com.tongzhang.secret;

import android.content.Context;
import android.content.SharedPreferences.Editor;


/**
 * Created by zt041 on 2017-03-20.
 */

public class Config {
    public  static  final String SERVER_URL="";

    public static final String KEY_TOKEN ="token";
    public  static  final String KEY_ACTION="action";
    public  static  final String KEY_PHONE="phone";
    public  static  final String KEY_STATUS="status";


    public  static  final int RESULT_STATUS_SUCCESS=1;
    public  static  final int RESULT_STATUS_FALL=0;
    public  static  final int RESULT_STATUS_INVALID_TOKEN=2;

    public static final String APP_ID ="tongzhang.com";
    public static final String CHARSET = "UTF-8";

    public  static  final String ACTION_GET_CODE="send_pass";

    //get cache
    public static String getCachedToken(Context context){
        return context.getSharedPreferences(APP_ID,Context.MODE_PRIVATE).getString(KEY_TOKEN,null);

    }
    public static void cacheToken(Context context,String token) {
        Editor e=context.getSharedPreferences(APP_ID, context.MODE_PRIVATE).edit();
        e.putString(KEY_TOKEN,token);
        e.commit();
    }
}
