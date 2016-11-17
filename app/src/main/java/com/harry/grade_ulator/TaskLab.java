package com.harry.grade_ulator;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Harry on 17/11/2016.
 */

public class TaskLab {

    private static TaskLab sTaskLab;

    private List<Task> mTasks;

    public static TaskLab get(Context context) {
        if (sTaskLab == null) {
            sTaskLab = new TaskLab(context);
        }
        return sTaskLab;
    }
    private TaskLab(Context context) {
        mTasks = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Task task = new Task();
            task.setTitle("Assessment #" + i);
            mTasks.add(task);
        }
    }

    public List<Task> getTasks() {
        return mTasks;
    }

    public Task getTask(UUID id) {
        for (Task task : mTasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }
}
