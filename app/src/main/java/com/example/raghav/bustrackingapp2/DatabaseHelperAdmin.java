package com.example.raghav.bustrackingapp2;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelperAdmin extends SQLiteOpenHelper{

    private static  final  String DATABASE_NAME = "BUSINFO.DB";
    private static  final  int DATABASE_VERSION = 2;
    private static  final String CREATE_QUERY =
            "CREATE TABLE "+BusDetails.NewBusInfo.TABLE_NAME+"("+ BusDetails.NewBusInfo.BUS_NO+" TEXT,"+
                    BusDetails.NewBusInfo.DRIVER_NAME+" TEXT,"+ BusDetails.NewBusInfo.ROUTE_NO+" TEXT,"+
                    BusDetails.NewBusInfo.DL_NO+" TEXT);";



    public  DatabaseHelperAdmin(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        Log.e("DATABASE OPERATION","Database created / opened...");

    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(CREATE_QUERY);
        Log.e("DATABASE OPERATION","Table created...");
    }

    public  void  addInformations(String bus,String driver,String route,String dl,SQLiteDatabase db)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(BusDetails.NewBusInfo.BUS_NO,bus);
        contentValues.put(BusDetails.NewBusInfo.DRIVER_NAME,driver);
        contentValues.put(BusDetails.NewBusInfo.ROUTE_NO,route);
        contentValues.put(BusDetails.NewBusInfo.DL_NO,dl);
        db.insert(BusDetails.NewBusInfo.TABLE_NAME,null,contentValues);
        Log.e("DATABASE OPERATION","One row inserted...");

    }

    public Cursor getInformations(SQLiteDatabase db)
    {
        Cursor cursor;
        String[] projections = {BusDetails.NewBusInfo.BUS_NO, BusDetails.NewBusInfo.DRIVER_NAME, BusDetails.NewBusInfo.ROUTE_NO, BusDetails.NewBusInfo.DL_NO};
     cursor=  db.query(BusDetails.NewBusInfo.TABLE_NAME,projections,null,null,null,null,null);
    return cursor;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
