package cn.edu.gdmec.android.mobileguard.m3communicationguard.db.dao;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/11/4 0004.
 */
@RunWith(AndroidJUnit4.class)

public class BlackNumberDaoTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("", appContext.getPackageName());
    }
}