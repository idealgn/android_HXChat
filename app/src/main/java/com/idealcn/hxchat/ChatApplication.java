package com.idealcn.hxchat;

import android.app.Application;

import org.xutils.x;

/**
 * author:idealcn
 * date:16-8-7 下午6:49
 */
public class ChatApplication extends Application {

    private static ChatApplication instance;

    public static ChatApplication getInstance(){
      return  instance;
    }



    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

       ChatHepler.getInstance().init(this);

        //xutils
        x.Ext.init(this);



    }


}
