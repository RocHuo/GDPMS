package com.example.administrator.gdpms;

import android.app.Dialog;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Administrator on 2016/4/21.
 */
public class MyDialog extends Dialog {
    private View mView ;
    private ListView mListView;
    private static final int TITILE_NAME=1;
    private List<Title> mItem=new ArrayList<>();


    public MyDialog(Context context,int type) {
        super(context);
        setCanceledOnTouchOutside(true);
        mView= LayoutInflater.from(context).inflate(R.layout.dialog_show,null);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public class Title{
        public String name;
        public int id;
    }
}


