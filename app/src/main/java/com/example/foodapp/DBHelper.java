package com.example.foodapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DBNAME="Login.db";
    public DBHelper( Context context) {
        super(context, "Login.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase mydb) {
        mydb.execSQL("create Table users(username TEXT PRIMARY KEY,password TEXT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase mydb, int i, int i1) {
        mydb.execSQL("drop table if exists users" );
    }
    public boolean insertData(String username,String password){
        SQLiteDatabase mydb = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password" , password);
        long results =mydb.insert("users",null,contentValues);
        if(results==-1)
            return false;
        else
            return true;
    }
    public boolean checkusername(String username){
        SQLiteDatabase mydb=this.getWritableDatabase();
        Cursor cursor =mydb.rawQuery("select * from users where username = ?",new String[] {username});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
    public boolean checkusernamepassword(String username,String password){
        SQLiteDatabase mydb=this.getWritableDatabase();
        Cursor cursor=mydb.rawQuery("select * from users where username = ? and password = ? ",new String[]{username,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
