package com.example.administrator.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.administrator.gdpms.DbHelper;
import com.example.administrator.gdpms.DoneActivity;
import com.example.administrator.gdpms.R;

import static com.example.administrator.gdpms.R.layout.array_item;

/**
 * Created by Administrator on 2016/4/15.
 */
public class DoneFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.done_fragment,container,false);
    }

    @Override
    public void onStart() {
        super.onStart();
        ListView listview= (ListView) getActivity().findViewById(R.id.done_list);
        String[] string={DbHelper.TABLE_NAME_TASK_TITLE};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(), R.layout.array_item,string);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                switch (position) {
                                                    case 0: {
                                                        Intent i = new Intent(getActivity(), DoneActivity.class);
                                                        i.putExtra(DoneActivity.TASK_ID,position);
                                                        startActivityForResult(i, 1);
                                                    }
                                                }
                                            }
                                        }
            );

        }
    }

