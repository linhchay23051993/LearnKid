package com.linhchay.learnkid.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.linhchay.learnkid.entity.LearnObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOpenHelper extends SQLiteOpenHelper {

    private Context mycontext;
    private static String DB_NAME = "DatabaseTest.db";
    private static String DB_PATH = "/databases/";
    public SQLiteDatabase myDataBase = null;

    public DatabaseOpenHelper(Context context) throws IOException {
        super(context, DB_NAME, null, 1);
        this.mycontext = context;
        processSQlite();
    }

    private void processSQlite() throws IOException {
        File dbFile = mycontext.getDatabasePath(DB_NAME);
        if (!dbFile.exists()) {
            copyDatabaseFromAssets();
        }
    }

    private void copyDatabaseFromAssets() throws IOException {
        InputStream databaseInputStream = mycontext.getAssets().open(DB_NAME);
        String outPutStrem = getPathSystem();
        String pathName = mycontext.getApplicationInfo().dataDir + DB_PATH;
        File file = new File(pathName);
        if (!file.exists()) {
            file.mkdir();
        }
        OutputStream databaseOutputStream = new FileOutputStream(outPutStrem);
        byte[] buffer = new byte[1024];
        int lenght;
        while ((lenght = databaseInputStream.read(buffer)) > 0) {
            databaseOutputStream.write(buffer, 0, lenght);
        }
        databaseOutputStream.flush();
        databaseOutputStream.close();
        databaseInputStream.close();
    }


    public synchronized void close() {
        if (myDataBase != null) {
            myDataBase.close();
        }
        super.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public List<LearnObject> getAnimals() {
        myDataBase = mycontext.openOrCreateDatabase(DB_NAME, mycontext.MODE_PRIVATE, null);
        List<LearnObject> list = new ArrayList<>();
        Cursor cursor = myDataBase.rawQuery("SELECT * FROM animals", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            list.add(new LearnObject(cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5)));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }

    public String getPathSystem() {
        return mycontext.getApplicationInfo().dataDir + DB_PATH + DB_NAME;
    }
}