package cn.edu.gdmec.android.mobileguard.m2theftguard.dialog;

/*public class SetUpPasswordDialog extends Dialog implements View.OnClickListener{
    private TextView mTitleTV;
    public EditText mFirstPWDET;
    public EditText mAffirmET;
    private MyCallBack myCallBack;

   /* public SetUpPasswordDialog(@NonNull Context context) {
        super(context, R.style.dialog_custom);
    }*/

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.http.util.TextUtils;

import cn.edu.gdmec.android.mobileguard.R;

/*public void setMyCallBack(MyCallBack myCallBack){
        this.myCallBack=myCallBack;
    }*/
  /* @Override
   protected void onCreate(Bundle savedInstanceState){
       setContentView(R.layout.setup_password_dialog);
       super.onCreate(savedInstanceState);
       initView();
   }
    public SetUpPasswordDialog(@NonNull Context context) {
        super(context, R.style.dialog_custom);
    }

    private void initView() {
        mTitleTV=(TextView)findViewById(R.id.tv_setuppwd_title);
        mFirstPWDET=(EditText)findViewById(R.id.et_firstpwd);
        mAffirmET=(EditText)findViewById(R.id.et_affirm_password);
        findViewById(R.id.btn_ok).setOnClickListener(this);
        findViewById(R.id.btn_cancle).setOnClickListener(this);
    }
    public void setTitle(String title){
        if(!TextUtils.isEmpty(title)){
            mTitleTV.setText(title);
        }
    }
    public void setMyCallBack(MyCallBack myCallBack){
        this.myCallBack=myCallBack;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_ok:
                myCallBack.ok();
                System.out.print("SetupPasswordDialog");
                break;
            case R.id.btn_cancle:
                myCallBack.cancle();
                break;
        }

    }

    public void setCallBack(MyCallBack myCallBack) {
    }

    public interface MyCallBack{
        void ok();
        void cancle();
    }
}*/
    public class SetUpPasswordDialog extends Dialog implements View.OnClickListener {
        /**标题栏*/
        private TextView mTitleTV;
        /**首次输入密码文本框*/
        public EditText mFirstPWDET;
        /**确认密码文本框*/
        public EditText mAffirmET;
        /**回调接口*/
        private MyCallBack myCallBack;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            setContentView(R.layout.setup_password_dialog);
            super.onCreate(savedInstanceState);
            initView();
        }

        public SetUpPasswordDialog(@NonNull Context context) {
            super(context, R.style.dialog_custom);
        }

        /**初始化控件*/
        private void initView() {
            mTitleTV = (TextView) findViewById(R.id.tv_setuppwd_title);
            mFirstPWDET = (EditText) findViewById(R.id.et_firstpwd);
            mAffirmET = (EditText) findViewById(R.id.et_affirm_password);
            findViewById(R.id.btn_ok).setOnClickListener(this);
            findViewById(R.id.btn_cancle).setOnClickListener(this);
        }

        /**
         * 设置对话框标题栏
         * @param title
         */
        public void setTitle(String title){
            if(!TextUtils.isEmpty(title)){
                mTitleTV.setText(title);
            }
        }
        public void setCallBack(MyCallBack myCallBack){
            this.myCallBack = myCallBack;
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_ok:
                    System.out.print("SetupPasswordDialog");
                    myCallBack.ok();
                    break;
                case R.id.btn_cancle:
                    myCallBack.cancel();
                    break;
            }
        }

        public interface MyCallBack{
            void ok();
            void cancel();
        }
    }

