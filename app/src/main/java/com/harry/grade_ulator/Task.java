package com.harry.grade_ulator;

import android.widget.TextView;

import java.util.UUID;

/**
 * Created by Harry on 17/11/2016.
 */

public class Task {

    private UUID mId;
    private String mTitle;
    private Float mMark;
    private Float mOutOf;
    private Float mPercent;
    private Float mWeight;
    private Float mWorth;
    private Float mTotal;

    public Task() {
        // To generate unique identifier
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

    public Float getMark() {
        return mMark;
    }

    public void setMark(Float mMark) {
        this.mMark = mMark;
    }

    public Float getOutOf() {
        return mOutOf;
    }

    public void setOutOf(Float mOutOf) {
        this.mOutOf = mOutOf;
    }

    public Float getPercent() {
        return mPercent;
    }

    public void setPercent(Float mPercent) {
        this.mPercent = mPercent;
    }

    public Float getWeight() {
        return mWeight;
    }

    public void setWeight(Float mWeight) {
        this.mWeight = mWeight;
    }

    public Float getWorth() {
        return mWorth;
    }

    public void setWorth(Float mWorth) {
        this.mWorth = mWorth;
    }

    public Float getTotal() {
        return mTotal;
    }

    public void setTotal(Float mTotal) {
        this.mTotal = mTotal;
    }

}
