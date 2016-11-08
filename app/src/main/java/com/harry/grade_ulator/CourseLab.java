package com.harry.grade_ulator;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Harry on 11/10/2016.
 */

public class CourseLab {
    private static CourseLab sCourseLab;

    public void addCourse(Course c) {
        mCourses.add(c);
    }

    private List<Course> mCourses;

    public static CourseLab get(Context context) {
        if (sCourseLab == null) {
            sCourseLab = new CourseLab(context);
        }
        return sCourseLab;
    }
    private CourseLab(Context context) {
        mCourses = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            Course course = new Course();
            course.setTitle("Subject #" + i);
            mCourses.add(course);
        }
    }
    public List<Course> getCourses() {
        return mCourses;
    }
    public Course getCourse(UUID id) {
        for (Course course : mCourses) {
            if (course.getId().equals(id)) {
                return course;
            }
        }
        return null;
    }
}
