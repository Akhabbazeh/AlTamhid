package com.beetronix.al_tamhid.features;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.util.Tool;
import com.example.myapplication.features.ui.BaseFragment;


public class UsersGuideFragment extends BaseFragment {
    private ImageView ButtonBack;
    private ImageView background_page_user_guide;
    public UsersGuideFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_5 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_users_guide, container, false);
        setNotificationBarColor(R.color.primary_color);

        ButtonBack = view_5.findViewById(R.id.ButtonBack);
        background_page_user_guide = view_5.findViewById(R.id.background_page_user_guide);
        Tool.displayImageDrawable(getContext(),background_page_user_guide,R.drawable.background_page);
        Tool.displayImageDrawable(getContext(),ButtonBack,R.drawable.ic_arrow_right);
        ButtonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
        return view_5;
    }



}
