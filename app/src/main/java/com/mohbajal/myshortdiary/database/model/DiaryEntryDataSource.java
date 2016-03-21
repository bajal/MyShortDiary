package com.mohbajal.myshortdiary.database.model;

import android.database.sqlite.SQLiteDatabase;

import com.mohbajal.myshortdiary.database.MySQLiteHelper;

/**
 * Created by 908752 on 3/20/16.
 */
public class DiaryEntryDataSource {

    private SQLiteDatabase database;
    private MySQLiteHelper dbHelper;
    private String[] allColumns = { MySQLiteHelper.COLUMN_ID,
            MySQLiteHelper.COLUMN_ITEM_NAME };

}
