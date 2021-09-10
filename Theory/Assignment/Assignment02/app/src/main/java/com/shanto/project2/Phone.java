package com.shanto.project2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "phone_table")
public class Phone {
    @PrimaryKey
    private int mId;

    @ColumnInfo(name = "tag")
    private String mTag;
    @ColumnInfo(name = "phone")
    private String mPhone;

    public Phone(int id, String tag, String phone) {
        this.mId = id;
        this.mTag = tag;
        this.mPhone = phone;
    }
    public Phone getPhone() {
        Phone phone = new Phone(this.mId, this.mTag, this.mPhone);
        return phone;
    }

}
