package com.idealcn.hxchat.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.idealcn.hxchat.ChatApplication;

/**
 * author:idealgn
 * date:16-10-8 下午3:00
 */
public class ChatDBOpenHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "chat.db";
    private static final int DB_VERSION = 1;


    private static ChatDBOpenHelper helper;

    public synchronized static ChatDBOpenHelper getHelper(){
        if (helper==null)
            helper = new ChatDBOpenHelper(ChatApplication.getInstance());
        return helper;
    }


    private ChatDBOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(UserDao.TABLE_CREATOR);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}