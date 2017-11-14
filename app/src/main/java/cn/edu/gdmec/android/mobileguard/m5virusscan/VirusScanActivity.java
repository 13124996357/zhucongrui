package cn.edu.gdmec.android.mobileguard.m5virusscan;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import cn.edu.gdmec.android.mobileguard.R;

public class VirusScanActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mLastTimeTV;
    private SharedPreferences mSP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_virus_scan);
        mSP=getSharedPreferences("config",MODE_PRIVATE);
        cppyDB("antivirus.db");
        initView();
    }
    @Override
    protected void onResume(){
        String string= mSP.getString("lastVirusScan","你还没有查杀病毒");
        mLastTimeTV.setText(string);
        super.onResume();
    }

    /**
     * 复制病毒数据库
     * @param string
     */

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgv_leftbtn:
                finish();
                break;
            case R.id.rl_allscanvirus:
                startActivity(new Intent(this,VirusScanSpeedActivity.class));
                break;
        }


    }


    private void cppyDB(final String dbname){


    }

    /**
     * 初始化控件
     */

    private void initView(){


    }
}
