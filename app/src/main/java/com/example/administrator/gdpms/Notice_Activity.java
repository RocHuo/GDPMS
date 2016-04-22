package com.example.administrator.gdpms;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ListActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.example.administrator.fragment.AnswerFragment;
import com.example.administrator.fragment.BookFragment;
import com.example.administrator.fragment.CommitFragment;
import com.example.administrator.fragment.ContentFragment;
import com.example.administrator.fragment.DoneFragment;
import com.example.administrator.fragment.LoadFragment;
import com.example.administrator.fragment.ResultFragment;
import com.example.administrator.fragment.ScanFragment;
import com.example.administrator.view.SlidingMenu;

import org.w3c.dom.Text;

/**
 * Created by Administrator on 2016/4/13.
 */
public class Notice_Activity extends Activity {
//     private DbHelper mDate;
//     private SQLiteDatabase mDateReate;
     private SimpleCursorAdapter adapter;
     private TextView title;
     private ListView main_list;
     private SlidingMenu changestate;
<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678
=======
    private  Button info;
>>>>>>> bingxing




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notcie);

        init();
        initList();
        initListener();
    }
    private void init() {


        main_list=(ListView)findViewById(R.id.main_list);
        changestate=(SlidingMenu)findViewById(R.id.sliding);
        title =(TextView)findViewById(R.id.title);
<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678


=======
        info= (Button) findViewById(R.id.info);
>>>>>>> bingxing

        android.app.FragmentManager contentfragment=getFragmentManager();
        FragmentTransaction transaction=contentfragment.beginTransaction();

        ContentFragment noticefragment=new ContentFragment();
        transaction.add(R.id.content,noticefragment,"noticefragment");

    }
    private void initList() {

        String[] main_list_string={"选题浏览","已选课题","任务书","任务提交","教师答疑","答辩成绩","下载",};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.array_item,main_list_string);
        main_list.setAdapter(adapter);
    }
    private void initListener() {
                    main_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            switch (position) {

                                case 0: {
                                    Log.i("guanyong", "onItemClick: ");
                                    title.setText("选题浏览");
                                    android.app.FragmentManager i=getFragmentManager();
                                    FragmentTransaction j=i.beginTransaction();
                                    ScanFragment scanfragment=new ScanFragment();
                                    j.replace(R.id.content, scanfragment);
                                    j.commit();
                                    return;
                                }
                                case 1: {
                                    Log.i("guanyong", "onItemClick: ");
                                    title.setText("已选课题");

                                    android.app.FragmentManager i=getFragmentManager();
                                    FragmentTransaction j=i.beginTransaction();
                                    DoneFragment doneFragment=new DoneFragment();
                                    j.replace(R.id.content, doneFragment);
                                    j.commit();
                                    return;
                                }
                                 case 2: {
                                    Log.i("guanyong", "onItemClick: ");
                                    title.setText("任务书");
                                     android.app.FragmentManager i=getFragmentManager();
                                     FragmentTransaction j=i.beginTransaction();
                                     BookFragment bookFragment=new BookFragment();
                                     j.replace(R.id.content, bookFragment);
                                     j.commit();
                                    return;
                                }
                                case 3: {
                                    Log.i("guanyong", "onItemClick: ");
                                    title.setText("任务提交");
                                    android.app.FragmentManager i=getFragmentManager();
                                    FragmentTransaction j=i.beginTransaction();
                                    CommitFragment commitFragment=new CommitFragment();
                                    j.replace(R.id.content, commitFragment);
                                    j.commit();
                                    return;
                                }
                                case 4: {
                                    Log.i("guanyong", "onItemClick: ");
                                    title.setText("教师指导");
                                    android.app.FragmentManager i=getFragmentManager();
                                    FragmentTransaction j=i.beginTransaction();
                                    AnswerFragment answerFragment=new AnswerFragment();
                                    j.replace(R.id.content, answerFragment);
                                    j.commit();
                                    return;
                                }
                                case 5: {
                                    Log.i("guanyong", "onItemClick: ");
                                    title.setText("答辩成绩");
                                    android.app.FragmentManager i=getFragmentManager();
                                    FragmentTransaction j=i.beginTransaction();
                                    ResultFragment resultFragment=new ResultFragment();
                                    j.replace(R.id.content, resultFragment);
                                    j.commit();
                                    return;
                                }
                                case 6: {
                                    Log.i("guanyong", "onItemClick: ");
                                    title.setText("下载");
                                    android.app.FragmentManager i=getFragmentManager();
                                    FragmentTransaction j=i.beginTransaction();
                                    LoadFragment loadFragment=new LoadFragment();
                                    j.replace(R.id.content, loadFragment);
                                    j.commit();
                                    return;
                                }
//                                case 7: {
//                                    Log.i("guanyong", "onItemClick: ");
//                                    title.setText("选题浏览");
//                                    ScanFragment scanfragment=new ScanFragment();
//                                    transaction.replace(R.id.content, scanfragment);
//                                    transaction.commit();
//                                    return;
//                                }

                            }
                        }
                    });

<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678

=======
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Notice_Activity.this,InfoActivity.class);
                startActivity(i);
            }
        });
>>>>>>> bingxing

    }

        public void changestate(View view ){
            changestate.changestate();
        }

}
