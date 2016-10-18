package com.harry.grade_ulator;

import android.support.v4.app.Fragment;

/**
 * Created by Harry on 11/10/2016.
 */

public class CourseListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CourseListFragment();
    }
}
