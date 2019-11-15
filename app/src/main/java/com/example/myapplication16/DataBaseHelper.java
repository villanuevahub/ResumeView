package com.example.myapplication16;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "DB";



    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Users.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + Users.TABLE_NAME);
        onCreate(db);
    }

    public long insertUser(String First_Name, String Second_Name, String Last_Name,
                           String Second_Last_Name, String Alias, String Username, String Password,
                           String Email, String Mobile_Phone, String Genre, String Age, String Street,
                           String Number, String Neighbourhood, String Country, String School,
                           String Birthdate, String Civil_Status, String Job) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Users.COLUMN_FIRST_NAME, First_Name);
        values.put(Users.COLUMN_SECOND_NAME, Second_Name);
        values.put(Users.COLUMN_LAST_NAME, Last_Name);
        values.put(Users.COLUMN_SECOND_LAST_NAME, Second_Last_Name);
        values.put(Users.COLUMN_ALIAS, Alias);
        values.put(Users.COLUMN_USERNAME, Username);
        values.put(Users.COLUMN_PASSWORD, Password);
        values.put(Users.COLUMN_EMAIL, Email);
        values.put(Users.COLUMN_MOBILE_PHONE, Mobile_Phone);
        values.put(Users.COLUMN_GENRE, Genre);
        values.put(Users.COLUMN_AGE, Age);
        values.put(Users.COLUMN_STREET, Street);
        values.put(Users.COLUMN_NUMBER, Number);
        values.put(Users.COLUMN_NEIGHBOURHOOD, Neighbourhood);
        values.put(Users.COLUMN_COUNTRY, Country);
        values.put(Users.COLUMN_SCHOOL, School);
        values.put(Users.COLUMN_BIRTHDATE, Birthdate);
        values.put(Users.COLUMN_CIVIL_STATUS, Civil_Status);
        values.put(Users.COLUMN_JOB, Job);

        long Id = db.insert(Users.TABLE_NAME, null, values);

        db.close();

        return Id;
    }

    public Users getUser(long Id) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(Users.TABLE_NAME, new String[]{Users.COLUMN_ID, Users.COLUMN_IDE,
                Users.COLUMN_FIRST_NAME, Users.COLUMN_SECOND_NAME, Users.COLUMN_LAST_NAME,
                Users.COLUMN_SECOND_LAST_NAME, Users.COLUMN_ALIAS, Users.COLUMN_USERNAME,
                Users.COLUMN_PASSWORD, Users.COLUMN_EMAIL, Users.COLUMN_MOBILE_PHONE,
                Users.COLUMN_GENRE, Users.COLUMN_AGE, Users.COLUMN_STREET, Users.COLUMN_NUMBER,
                Users.COLUMN_NEIGHBOURHOOD, Users.COLUMN_COUNTRY, Users.COLUMN_SCHOOL,
                Users.COLUMN_BIRTHDATE, Users.COLUMN_CIVIL_STATUS, Users.COLUMN_JOB,
                Users.COLUMN_CURRENT_TIMESTAMP},
                Users.COLUMN_ID + "=?", new String[]{String.valueOf(Id)},
                null, null, null, null);

        if(cursor != null)
            cursor.moveToFirst();

        Users user = new Users(
                cursor.getInt(cursor.getColumnIndex(Users.COLUMN_ID)),
                cursor.getInt(cursor.getColumnIndex(Users.COLUMN_IDE)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_FIRST_NAME)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_SECOND_NAME)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_LAST_NAME)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_SECOND_LAST_NAME)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_ALIAS)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_USERNAME)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_PASSWORD)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_EMAIL)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_MOBILE_PHONE)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_GENRE)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_AGE)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_STREET)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_NUMBER)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_NEIGHBOURHOOD)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_COUNTRY)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_SCHOOL)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_BIRTHDATE)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_CIVIL_STATUS)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_JOB)),
                cursor.getString(cursor.getColumnIndex(Users.COLUMN_CURRENT_TIMESTAMP)));

        return user;
       }

    public List<Users> getAllUsers() {
        List<Users> allUsers = new ArrayList<>();
        String SelectAllUsers = "SELECT * FROM " + Users.TABLE_NAME + " ORDER BY "
                + Users.COLUMN_CURRENT_TIMESTAMP + " DESC";

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(SelectAllUsers, null);

        if(cursor.moveToFirst()) {
            do {

                Users user = new Users();
                user.setId(cursor.getInt(cursor.getColumnIndex(Users.COLUMN_ID)));
                user.setIde(cursor.getInt(cursor.getColumnIndex(Users.COLUMN_IDE)));
                user.setFirst_Name(cursor.getString(cursor.getColumnIndex(Users.COLUMN_FIRST_NAME)));
                user.setSecond_Name(cursor.getString(cursor.getColumnIndex(Users.COLUMN_SECOND_NAME)));
                user.setLast_Name(cursor.getString(cursor.getColumnIndex(Users.COLUMN_LAST_NAME)));
                user.setSecond_Name(cursor.getString(cursor.getColumnIndex(Users.COLUMN_SECOND_LAST_NAME)));
                user.setAlias(cursor.getString(cursor.getColumnIndex(Users.COLUMN_ALIAS)));
                user.setUsername(cursor.getString(cursor.getColumnIndex(Users.COLUMN_USERNAME)));
                user.setPassword(cursor.getString(cursor.getColumnIndex(Users.COLUMN_PASSWORD)));
                user.setEmail(cursor.getString(cursor.getColumnIndex(Users.COLUMN_EMAIL)));
                user.setMobile_Phone(cursor.getString(cursor.getColumnIndex(Users.COLUMN_MOBILE_PHONE)));
                user.setGenre(cursor.getString(cursor.getColumnIndex(Users.COLUMN_GENRE)));
                user.setAge(cursor.getString(cursor.getColumnIndex(Users.COLUMN_AGE)));
                user.setStreet(cursor.getString(cursor.getColumnIndex(Users.COLUMN_STREET)));
                user.setNumber(cursor.getString(cursor.getColumnIndex(Users.COLUMN_NUMBER)));
                user.setNeighbourhood(cursor.getString(cursor.getColumnIndex(Users.COLUMN_NEIGHBOURHOOD)));
                user.setCountry(cursor.getString(cursor.getColumnIndex(Users.COLUMN_COUNTRY)));
                user.setSchool(cursor.getString(cursor.getColumnIndex(Users.COLUMN_SCHOOL)));
                user.setBirthdate(cursor.getString(cursor.getColumnIndex(Users.COLUMN_BIRTHDATE)));
                user.setCivil_Status(cursor.getString(cursor.getColumnIndex(Users.COLUMN_CIVIL_STATUS)));
                user.setJob(cursor.getString(cursor.getColumnIndex(Users.COLUMN_JOB)));
                user.setTimestamp(cursor.getString(cursor.getColumnIndex(Users.COLUMN_CURRENT_TIMESTAMP)));

            }while (cursor.moveToNext());
        }
        db.close();
        return allUsers;
    }
    public int getUsersCount() {
        String CountQuery = "SELECT * FROM "+ Users.TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(CountQuery, null);

        int count = cursor.getCount();
        cursor.close();
        return count;
    }

    public int updateUser(Users user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Users.COLUMN_FIRST_NAME, user.getFirst_Name());
        values.put(Users.COLUMN_SECOND_NAME, user.getSecond_Name());
        values.put(Users.COLUMN_LAST_NAME, user.getLast_Name());
        values.put(Users.COLUMN_SECOND_LAST_NAME, user.getSecond_Name());
        values.put(Users.COLUMN_ALIAS, user.getAlias());
        values.put(Users.COLUMN_USERNAME, user.getUsername());
        values.put(Users.COLUMN_PASSWORD, user.getPassword());
        values.put(Users.COLUMN_EMAIL, user.getEmail());
        values.put(Users.COLUMN_MOBILE_PHONE, user.getMobile_Phone());
        values.put(Users.COLUMN_GENRE, user.getGenre());
        values.put(Users.COLUMN_AGE, user.getAge());
        values.put(Users.COLUMN_STREET, user.getStreet());
        values.put(Users.COLUMN_NUMBER, user.getNumber());
        values.put(Users.COLUMN_NEIGHBOURHOOD, user.getNeighbourhood());
        values.put(Users.COLUMN_COUNTRY, user.getCountry());
        values.put(Users.COLUMN_SCHOOL, user.getSchool());
        values.put(Users.COLUMN_BIRTHDATE, user.getBirthdate());
        values.put(Users.COLUMN_CIVIL_STATUS, user.getCivilStatus());
        values.put(Users.COLUMN_JOB, user.getJob());

        return db.update(Users.TABLE_NAME, values, Users.COLUMN_ID + " =?",
                new String[]{String.valueOf(user.getId())});
    }

    public void deleteUser(Users user) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(Users.TABLE_NAME, Users.COLUMN_ID + " =?", new String[]{String.valueOf(user.getId())});
    }
}
