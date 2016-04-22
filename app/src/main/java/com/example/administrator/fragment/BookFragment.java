package com.example.administrator.fragment;

<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
=======
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
>>>>>>> bingxing

import com.example.administrator.gdpms.R;

/**
 * Created by Administrator on 2016/4/15.
<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678
 */
public class BookFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.book_fragment,container,false);
=======
 * //ScrollView 在上下滑动的时候非常卡
 */
public class BookFragment extends Fragment {
    private RelativeLayout mBookname,mBookNatura, mBookType, mBookFrom, mBookContent,
            mBookRequire, mBookData, mJob1, mJob2, mJob3, mJib4, mJob5;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view=getActivity().getLayoutInflater().inflate(R.layout.book_fragment,null);
        mBookname= (RelativeLayout) view.findViewById(R.id.titlename);
        mBookNatura= (RelativeLayout) view.findViewById(R.id.titlenature);
        mBookType = (RelativeLayout) view.findViewById(R.id.titletype);
        mBookFrom = (RelativeLayout) view.findViewById(R.id.titlefrom);
        mBookContent = (RelativeLayout)view.findViewById(R.id.maincontent);
        mBookRequire = (RelativeLayout) view.findViewById(R.id.bookrequire);
        mBookData = (RelativeLayout) view.findViewById(R.id.bookdata);
        mJob1 = (RelativeLayout) view.findViewById(R.id.job1);
        mJob2 = (RelativeLayout)view.findViewById(R.id.job2);
        mJob3 = (RelativeLayout) view.findViewById(R.id.job3);
        mJib4 = (RelativeLayout)view.findViewById(R.id.job4);
        mJob5 = (RelativeLayout) view.findViewById(R.id.job5);

        //题目名称的设置可以通过setView方法实现的而且效果更好，但是会报错而且我不会解决，留到以后有时间有精力在完善
        mBookname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mBookNatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

    Log.i("string","bx");
        //当AlertDialog确定后，将返回的数值传到显示页面
//        final EditText write_title_name=new EditText(getActivity());

        return inflater.inflate(R.layout.book_fragment, container, false);

    }

    @Override
    public void onStart() {
        super.onStart();
>>>>>>> bingxing
    }
}
