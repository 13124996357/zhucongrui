package cn.edu.gdmec.android.mobileguard.m5virusscan.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Administrator on 2017/11/10 0010.
 */

public class AntiVirusDao {
    /**
     * 检查某个md5是否有毒
     * @param md5
     * @return null 代表扫描安全
     */
    public static String checkVirus(String md5){
        String desc=null;
        SQLiteDatabase db=SQLiteDatabase.openDatabase(
                "/data/data/cn.edu.gdmec.android.mobileguard/files/antivirus.db",null,SQLiteDatabase.OPEN_READONLY);
        Cursor cursor=db.rawQuery("select desc from datable where md5=?",new String [] {md5});
        if(cursor.moveToNext()){
            desc=cursor.getString(0);
        }
        cursor.close();
        db.close();
        return desc;

    }
}
