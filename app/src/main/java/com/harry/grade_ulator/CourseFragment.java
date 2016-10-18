package com.harry.grade_ulator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Harry on 11/10/2016.
 */

public class CourseFragment extends Fragment {
    private Course mCourse;
    private EditText mCourseField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCourse = new Course();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_course, container, false);

        mCourseField = (EditText) v.findViewById(R.id.course_title);
        mCourseField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(
                    CharSequence s, int start, int count, int after) {
// This space intentionally left blank
            }

            @Override
            public void onTextChanged(
                    CharSequence s, int start, int before, int count) {
                mCourse.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
// This one too
            }
        });

        return v;
    }
}
