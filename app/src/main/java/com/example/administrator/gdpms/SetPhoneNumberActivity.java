package com.example.administrator.gdpms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.InputFilter;
import android.text.InputType;
import android.text.method.NumberKeyListener;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by Administrator on 2016/4/21.
 * 这个数据应该返回到InfoActivity页面
 */

public class SetPhoneNumberActivity extends Activity {
    private EditText mPhoneNumber;
    private ImageButton mBack, mSave;
    private String mEditText;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setphone);
        mPhoneNumber = (EditText) findViewById(R.id.phone_number);
        mBack = (ImageButton) findViewById(R.id.phone_back);
        mSave = (ImageButton) findViewById(R.id.phone_save);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SetPhoneNumberActivity.this, InfoActivity.class);
                startActivity(i);
            }
        });
        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SetPhoneNumberActivity.this, InfoActivity.class);
                startActivity(i);
            }
        });
        mPhoneNumber.setKeyListener(new NumberKeyListener() {
            @Override
            protected char[] getAcceptedChars() {
                char[] number = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
                return number;
            }

            @Override
            public int getInputType() {
                return InputType.TYPE_CLASS_NUMBER;
            }
        });
        mPhoneNumber.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
        mEditText=mPhoneNumber.getText().toString();

    }
}
