package com.example.administrator.gdpms;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.text.method.NumberKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/4/20.
 */
public class InfoActivity extends Activity{
    private RelativeLayout mPhone;
    private View.OnClickListener mPhoneListener;
    private TextView mPhoneNumber;
    private ImageButton mBack;
    private  boolean first = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        
        init();
        initListener();
    }

    private void init(){
        mBack= (ImageButton) findViewById(R.id.info_back);
        mPhone= (RelativeLayout) findViewById(R.id.phone);
        mPhoneNumber= (TextView) findViewById(R.id.info_setphone);
        //当AlertDialog确定后，将返回的数值传到显示页面




                    mPhoneListener =new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i=new Intent(InfoActivity.this,SetPhoneNumberActivity.class);
                            startActivity(i);

                }
            };


    }

    private void initListener() {

        mPhone.setOnClickListener(mPhoneListener);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(InfoActivity.this,Notice_Activity.class);
                startActivity(i);
            }
        });
    }

}
