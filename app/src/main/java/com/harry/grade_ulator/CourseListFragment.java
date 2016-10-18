package com.harry.grade_ulator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Harry on 11/10/2016.
 */

public class CourseListFragment extends Fragment {

    private RecyclerView mCourseRecyclerView;
    private CourseAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_course_list, container, false);
        mCourseRecyclerView = (RecyclerView) view
                .findViewById(R.id.course_recycler_view);
        mCourseRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI() {
        CourseLab courseLab = CourseLab.get(getActivity());
        List<Course> courses = courseLab.getCourses();
        mAdapter = new CourseAdapter(courses);
        mCourseRecyclerView.setAdapter(mAdapter);
    }

    private class CourseHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mTitleTextView;
        private Course mCourse;
        public CourseHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            mTitleTextView = (TextView)
            itemView.findViewById(R.id.list_item_course_title_text_view);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(getActivity(),
                    mCourse.getTitle() + " clicked!", Toast.LENGTH_SHORT)
                    .show();
        }

        public void bindCourse(Course course) {
            mCourse = course;
            mTitleTextView.setText(mCourse.getTitle());
        }
    }

    private class CourseAdapter extends RecyclerView.Adapter<CourseHolder> {
        private List<Course> mCourses;
        public CourseAdapter(List<Course> courses) {
            mCourses = courses;
        }
        @Override
        public CourseHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater
                    .inflate(R.layout.list_item_course, parent, false);
            return new CourseHolder(view);
        }
        @Override
        public void onBindViewHolder(CourseHolder holder, int position) {
            Course course = mCourses.get(position);
            holder.bindCourse(course);
        }
        @Override
        public int getItemCount() {
            return mCourses.size();
        }
    }
}
