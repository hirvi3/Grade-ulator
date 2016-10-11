package com.harry.grade_ulator;

import java.util.UUID;

/**
 * Created by Harry on 11/10/2016.
 */

public class Grade {

    private UUID mId;
    private String mTitle;
    public Grade() {
// Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }
    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }
}
