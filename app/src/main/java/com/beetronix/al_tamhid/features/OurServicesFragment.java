package com.beetronix.al_tamhid.features;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.util.Tool;
import com.example.myapplication.features.ui.BaseFragment;


public class OurServicesFragment extends BaseFragment {
    ImageView ButtonBack;
    private ImageView img_background_content;
    public OurServicesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_4 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_our_services, container, false);
        setNotificationBarColor(R.color.primary_color);

        ButtonBack = view_4.findViewById(R.id.ButtonBack);
        img_background_content = view_4.findViewById(R.id.img_background_content);


        Tool.displayImageDrawable(getContext(),img_background_content,R.drawable.background_page);
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
