package com.harry.grade_ulator;

import android.support.v4.app.Fragment;

/**
 * Created by Harry on 17/11/2016.
 */

public class TaskListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new TaskListFragment();
    }
}
