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

public class GradeFragment extends Fragment {
    private Grade mGrade;
    private EditText mSubjectField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGrade = new Grade();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_grade, container, false);

        mSubjectField = (EditText) v.findViewById(R.id.grade_title);
        mSubjectField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(
                    CharSequence s, int start, int count, int after) {
// This space intentionally left blank
            }

            @Override
            public void onTextChanged(
                    CharSequence s, int start, int before, int count) {
                mGrade.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
// This one too
            }
        });

        return v;
    }
}
