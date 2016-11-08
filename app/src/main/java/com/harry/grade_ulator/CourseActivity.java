/*
package com.harry.grade_ulator;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import java.util.UUID;

public class CourseActivity extends SingleFragmentActivity {

    private static final String EXTRA_COURSE_ID = "com.harry.grade-ulator.course_id";

    public static Intent newIntent(Context packageContext, UUID courseId){
    Intent intent = new Intent(packageContext, CourseActivity.class);
    intent.putExtra(EXTRA_COURSE_ID,courseId);
    return intent;
}


    @Override
    protected Fragment createFragment() {
        UUID courseId = (UUID) getIntent().getSerializableExtra(EXTRA_COURSE_ID);
        return CourseFragment.newInstance(courseId);
    }
}
*/
