package cn.edu.gdmec.android.mobileguard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import cn.edu.gdmec.android.mobileguard.m1Home.HomeActivity;
import cn.edu.gdmec.android.mobileguard.m1Home.utils.MyUtils;
import cn.edu.gdmec.android.mobileguard.m1Home.utils.VersionUpdateUtils;

public class SplashActivity extends AppCompatActivity {

    private TextView mVersionTV;
    private String mVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        mVersion = MyUtils.getVersion(getApplicationContext());
        mVersionTV = (TextView) findViewById(R.id.tv_splash_version);
        mVersionTV.setText("版本号:"+mVersion);
        final VersionUpdateUtils versionUpdateUtils = new VersionUpdateUtils(mVersion,SplashActivity.this);
//        new Thread(){
//
//            @Override
//            public void run() {
//                versionUpdateUtils.getCloudVersion();
//            }
//        }.start();
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}

