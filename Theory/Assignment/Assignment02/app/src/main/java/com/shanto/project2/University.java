package com.shanto.project2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "university_table")
public class University {
    @PrimaryKey
    private int mId;

    @ColumnInfo(name="university")
    private String mUniversity;
    @ColumnInfo(name="department")
    private String mDepartment;
    @ColumnInfo(name="studentId")
    private String mStudentId;
    @ColumnInfo(name="studyLevel")
    private String mStudyLevel;
    @ColumnInfo(name="email")
    private String mEmail;

    public University(int id, String uni, String dept, String studentId, String level, String email) {
        this.mId = id;
        this.mUniversity = uni;
        this.mDepartment = dept;
        this.mStudentId = studentId;
        this.mStudyLevel = level;
        this.mEmail = email;
    }

    public University getUniversity() {
        University uni = new University(this.mId, this.mUniversity, this.mDepartment,this.mStudentId, this.mStudyLevel, this.mEmail);
        return uni;
    }

}
