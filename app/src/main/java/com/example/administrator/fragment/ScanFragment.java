package com.example.administrator.fragment;

import android.app.Fragment;
import android.app.ListFragment;
import android.content.Intent;
import android.database.Cursor;
<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678
=======
import android.database.sqlite.SQLiteDatabase;
>>>>>>> bingxing
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.example.administrator.gdpms.DbHelper;
import com.example.administrator.gdpms.DoneActivity;
import com.example.administrator.gdpms.R;

<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678
=======
import java.lang.reflect.Array;

>>>>>>> bingxing
/**
 * Created by Administrator on 2016/4/15.
 */
public class ScanFragment extends Fragment {


<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678
=======

>>>>>>> bingxing
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.v("scanfragment","how");

        return inflater.inflate(R.layout.scan_fragment,container,false);
    }

    @Override
    public void onStart() {
        super.onStart();
<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678
        ListView listview= (ListView) getActivity().findViewById(R.id.scan_list);
        String[] string={DbHelper.TABLE_NAME_TASK_TITLE};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(), R.layout.array_item,string);
        listview.setAdapter(adapter);
//        SimpleCursorAdapter adapter=new SimpleCursorAdapter(getActivity(),R.layout.scan_list,null,
//                new String[]{DbHelper.TABLE_NAME_TASK_TITLE},
//                new int[]{R.id.scan_title});
//        listview.setAdapter(adapter);
=======
        DbHelper db=new DbHelper(getActivity());
        SQLiteDatabase dbReader=db.getReadableDatabase();
        SQLiteDatabase dbWrite=db.getWritableDatabase();
        ListView listview= (ListView) getActivity().findViewById(R.id.scan_list);
        Cursor c=dbReader.query(DbHelper.TABLE_NAME_TASK, new String[]{DbHelper.TABLE_NAME_TASK_TITLE, DbHelper.TABLE_NAME_TASK_TEACHER},
                DbHelper.TABLE_NAME_ID + "=?", null, null, null, null);
        int i=c.getCount();
        if (i>0 && c!=null){
        }
        //我怀疑是无响应问题 simplecursoradapter在ui线程中运行
        SimpleCursorAdapter adapter=new SimpleCursorAdapter(getActivity(),R.layout.scan_list,null,
                new String[]{DbHelper.TABLE_NAME_TASK_TITLE},
                new int[]{R.id.scan_title});
        listview.setAdapter(adapter);
>>>>>>> bingxing
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), DoneActivity.class);
                i.putExtra(DoneActivity.TASK_ID,position);
                startActivityForResult(i,1);
            }
        });

    }
}
