package com.beetronix.al_tamhid.features;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.beetronix.al_tamhid.R;
import com.example.myapplication.features.ui.BaseFragment;
import com.beetronix.al_tamhid.util.Tool;

public class AuthorsFragment extends BaseFragment {

    private ImageView ButtonBack;
    private ImageView img_logo_app_authors;
    private ImageView img_background_authors;
    public AuthorsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_4 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_authors, container, false);
        setNotificationBarColor(R.color.primary_color);
        img_logo_app_authors = view_4.findViewById(R.id.img_logo_app_authors);
        img_background_authors = view_4.findViewById(R.id.img_background_authors);

        ButtonBack = view_4.findViewById(R.id.ButtonBack);

        Tool.displayImageDrawable(getContext(),img_logo_app_authors,R.drawable.bsem_allah_img);
        Tool.displayImageDrawable(getContext(),img_background_authors,R.drawable.background_page);
        Tool.displayImageDrawable(getContext(),ButtonBack,R.drawable.ic_arrow_right);
        ButtonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
        return view_4;
    }



}
