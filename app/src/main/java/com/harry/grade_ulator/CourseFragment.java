package com.harry.grade_ulator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.UUID;

/**
 * Created by Harry on 11/10/2016.
 */

public class CourseFragment extends Fragment {
    private Course mCourse;
    private EditText mCourseField;

    private static final String ARG_COURSE_ID = "crime_id";

    public static CourseFragment newInstance(UUID courseId) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_COURSE_ID, courseId);

        CourseFragment fragment = new CourseFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UUID courseId = (UUID) getArguments().getSerializable(ARG_COURSE_ID);
        mCourse = CourseLab.get(getActivity()).getCourse(courseId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_course, container, false);

        mCourseField = (EditText) v.findViewById(R.id.course_title);
        mCourseField.setText(mCourse.getTitle());
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
