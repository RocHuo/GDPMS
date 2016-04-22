package com.example.administrator.gdpms;
<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678

=======
>>>>>>> bingxing
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678
/**
 * Created by Administrator on 2016/4/13.
 */
public class DbHelper extends SQLiteOpenHelper{

=======

public class DbHelper extends SQLiteOpenHelper {
>>>>>>> bingxing
    public static final String  TABLE_NAME_ID="_id";
    public static final String  TABLE="task";
    //公告表
    public static final String TABLE_NAME_NOTICE="notice";
    public static final String TABLE_NAME_NOTICE_TITEL="title";
    public static final String TABLE_NAME_NOTICE_DATA="date";
    public static final String TABLE_NAME_NOTICE_ISSUER="issuer";
    public static final String TABLE_NAME_NOTICE_CONTEXT="context";

    public static final String TABLE_NAME_TASK="task";
    public static final String TABLE_NAME_TASK_TITLE="title";
    public static final String TABLE_NAME_TASK_YEAR="year";
    public static final String TABLE_NAME_TASK_TEACHER="teacher";
    public static final String TABLE_NAME_TASK_NUMBER="number";
    public static final String TABLE_NAME_TASK_FROM="from";
    public static final String TABLE_NAME_TASK_MODEL="model";
    public static final String TABLE_NAME_TASK_TYPE="type";
    public static final String TABLE_NAME_TASK_DIFFICULT="difficult";
    public static final String TABLE_NAME_TASK_WORK="work";
    public static final String TABLE_NAME_TASK_DEGREE="degree";
    public static final String TABLE_NAME_TASK_ISOK="isok";
    public static final String TABLE_NAME_TASK_HASWORKS="hasword";
    public static final String TABLE_NAME_TASK_MESSAGE_CONTENT="message_content";
    public static final String TABLE_NAME_TASK_TASK_REQUIRE="task_require";
<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678
//    public static final String TABLE_NAME_
//    public static final String
//    public static final String



    public DbHelper(Context context) {
        super(context, TABLE, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME_NOTICE + "(" + TABLE_NAME_ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT," + TABLE_NAME_NOTICE_TITEL
                + " TEXT NOT NULL DEFAULT \"\"," + TABLE_NAME_NOTICE_CONTEXT
                + " TEXT NOT NULL DEFAULT \"\","+ TABLE_NAME_NOTICE_DATA
                + " TEXT NOT NULL DEFAULT \"\"," + TABLE_NAME_NOTICE_ISSUER
                + " TEXT NOT NULL DEFAULT \"\"" + ")");
        db.execSQL("CREATE TABLE " + TABLE_NAME_TASK + "(" + TABLE_NAME_ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT," + TABLE_NAME_TASK_TITLE
                + " TEXT NOT NULL DEFAULT \"\"," + TABLE_NAME_TASK_YEAR
                + " TEXT NOT NULL DEFAULT \"\"," + TABLE_NAME_TASK_TEACHER
                + " TEXT NOT NULL DEFAULT \"\"" + ")");
=======
    public DbHelper(Context context) {
        super(context, TABLE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        db.execSQL("CREATE TABLE " + TABLE_NAME_MEMOS + "(" + COLUMN_NAME_ID
//                + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_NAME_MEMO_NAME
//                + " TEXT NOT NULL DEFAULT \"\"," + COLUMN_NAME_MEMO_CONTENT
//                + " TEXT NOT NULL DEFAULT \"\"," + COLUMN_NAME_MEMO_DATE
//                + " TEXT NOT NULL DEFAULT \"\"" + ")");
        db.execSQL("CREATE TABLE " + TABLE_NAME_TASK + "(" + TABLE_NAME_ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + TABLE_NAME_TASK_TITLE + " TEXT NOT NULL DEFAULT \"\","
                + TABLE_NAME_TASK_TEACHER
                + " INTEGER NOT NULL DEFAULT 0" + ")");
        db.execSQL("insert task(title,teacher)value('jiyu','xingbing')");



>>>>>>> bingxing
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
<<<<<<< 2b2fc41fe5a5c4f93c856aba2090f6c6a9424678
=======

//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
///**
// * Created by Administrator on 2016/4/13.
// */
//public class DbHelper extends SQLiteOpenHelper{
//
//    public static final String  TABLE_NAME_ID="_id";
//    public static final String  TABLE="task";
//    //公告表
//    public static final String TABLE_NAME_NOTICE="notice";
//    public static final String TABLE_NAME_NOTICE_TITEL="title";
//    public static final String TABLE_NAME_NOTICE_DATA="date";
//    public static final String TABLE_NAME_NOTICE_ISSUER="issuer";
//    public static final String TABLE_NAME_NOTICE_CONTEXT="context";
//
//    public static final String TABLE_NAME_TASK="task";
//    public static final String TABLE_NAME_TASK_TITLE="title";
//    public static final String TABLE_NAME_TASK_YEAR="year";
//    public static final String TABLE_NAME_TASK_TEACHER="teacher";
//    public static final String TABLE_NAME_TASK_NUMBER="number";
//    public static final String TABLE_NAME_TASK_FROM="from";
//    public static final String TABLE_NAME_TASK_MODEL="model";
//    public static final String TABLE_NAME_TASK_TYPE="type";
//    public static final String TABLE_NAME_TASK_DIFFICULT="difficult";
//    public static final String TABLE_NAME_TASK_WORK="work";
//    public static final String TABLE_NAME_TASK_DEGREE="degree";
//    public static final String TABLE_NAME_TASK_ISOK="isok";
//    public static final String TABLE_NAME_TASK_HASWORKS="hasword";
//    public static final String TABLE_NAME_TASK_MESSAGE_CONTENT="message_content";
//    public static final String TABLE_NAME_TASK_TASK_REQUIRE="task_require";
////    public static final String TABLE_NAME_
////    public static final String
////    public static final String
//
//
//
//    public DbHelper(Context context) {
//        super(context, "usr.db", null, 1);
//    }
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        db.execSQL("CREATE TABLE if not exists" + TABLE_NAME_NOTICE + "(" + TABLE_NAME_ID
//                + " INTEGER PRIMARY KEY AUTOINCREMENT," + TABLE_NAME_NOTICE_TITEL
//                + " TEXT NOT NULL DEFAULT \"\"," + TABLE_NAME_NOTICE_CONTEXT
//                + " TEXT NOT NULL DEFAULT \"\","+ TABLE_NAME_NOTICE_DATA
//                + " TEXT NOT NULL DEFAULT \"\"," + TABLE_NAME_NOTICE_ISSUER
//                + " TEXT NOT NULL DEFAULT \"\"" + ")");
//        db.execSQL("create table if not exists task(_id interger primary key autoincrement,title text not null ,year text not null)");
////        db.execSQL("CREATE TABLE if not exists" + TABLE_NAME_TASK + "(" + TABLE_NAME_ID
////                + " INTEGER PRIMARY KEY AUTOINCREMENT," + TABLE_NAME_TASK_TITLE
////                + " TEXT NOT NULL DEFAULT \"\"," + TABLE_NAME_TASK_YEAR
////                + " TEXT NOT NULL DEFAULT \"\"," + TABLE_NAME_TASK_TEACHER
////                + " TEXT NOT NULL DEFAULT \"\"" + ")");
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//    }
//}
>>>>>>> bingxing
