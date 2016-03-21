package com.mohbajal.myshortdiary.database.dao;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by 908752 on 3/20/16.
 */
public class DiaryEntry {

    @Getter @Setter private long id;
    @Getter @Setter private StringBuffer entry;
    @Getter @Setter private Date entryDate;
    @Getter @Setter private boolean isStarred;

}
