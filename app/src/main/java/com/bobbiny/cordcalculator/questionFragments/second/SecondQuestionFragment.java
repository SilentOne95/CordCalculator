package com.bobbiny.cordcalculator.questionFragments.second;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.android.cordcalculator.R;

public class SecondQuestionFragment extends Fragment {

    private ImageView mImageSwitchViewPrevious, mImageSwitchViewNext;

    public SecondQuestionFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second_question, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);
    }

    private void initViews(View view) {
        mImageSwitchViewPrevious = view.findViewById(R.id.image_button_previous);
        mImageSwitchViewNext = view.findViewById(R.id.image_button_next);

        mImageSwitchViewPrevious.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.secondQuestion_to_firstQuestion, null));
        mImageSwitchViewNext.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.secondQuestion_to_thirdQuestion, null));
    }
}
