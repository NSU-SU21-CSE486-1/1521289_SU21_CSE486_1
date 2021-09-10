package com.shanto.project2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class User {
    @PrimaryKey(autoGenerate = true)
    private int mId;

    @ColumnInfo(name="name")
    private String mName;
    @ColumnInfo(name="nid")
    private String mNid;
    @ColumnInfo(name="bloodGroup")
    private String mBloodGroup;
    @ColumnInfo(name="birthDate")
    private String mBirthDate;


    public User(int id, String name, String nid, String blood, String birth) {
        this.mId = id;
        this.mName = name;
        this.mNid = nid;
        this.mBloodGroup = blood;
        this.mBirthDate = birth;
    }
    public User getWord(){
        User user = new User(this.mId, this.mName, this.mNid, this.mBloodGroup, this.mBirthDate);
        return user;
    }
}
