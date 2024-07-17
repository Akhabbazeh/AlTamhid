package com.ZidnyScience.TamheedTelawa.features;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ZidnyScience.TamheedTelawa.R;
import com.ZidnyScience.TamheedTelawa.features.pages.pagesFragment;
import com.example.myapplication.features.ui.BaseFragment;
import com.ZidnyScience.TamheedTelawa.util.Tool;

public class AuthorsFragment extends BaseFragment {

    private ImageView ButtonBack;
    private ImageView img_logo_app_authors;
    private ImageView img_background_authors;
    private LinearLayout btn_go_to_Define_1;
    private LinearLayout btn_go_to_Define_2;
    private LinearLayout btn_go_to_Define_3;

    public AuthorsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_4 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_authors, container, false);
        setNotificationBarColor(R.color.primary_color);
        img_logo_app_authors = view_4.findViewById(R.id.img_logo_app_authors);
        img_background_authors = view_4.findViewById(R.id.img_background_authors);
        btn_go_to_Define_1 = view_4.findViewById(R.id.btn_go_to_Define_1);
        btn_go_to_Define_2 = view_4.findViewById(R.id.btn_go_to_Define_2);
        btn_go_to_Define_3 = view_4.findViewById(R.id.btn_go_to_Define_3);


        ButtonBack = view_4.findViewById(R.id.ButtonBack);

        Tool.displayImageDrawable(getContext(),img_logo_app_authors,R.drawable.bsem_allah_img);
       // Tool.displayImageDrawable(getContext(),img_background_authors,R.drawable.background_page);
        Tool.displayImageDrawable(getContext(),ButtonBack,R.drawable.ic_arrow_right);
        ButtonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        btn_go_to_Define_1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sendPageNumber(0);
            }
        });

        btn_go_to_Define_2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sendPageNumber(1);
            }
        });

        btn_go_to_Define_3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
              sendPageNumber(2);
            }
        });
        return view_4;
    }




    private void sendPageNumber(int position){
        pagesFragment pagesFragment = new pagesFragment();

        Bundle bundle = new Bundle();
        bundle.putInt("Position", position);

        pagesFragment.setArguments(bundle);

        getParentFragmentManager().beginTransaction()
                .replace(R.id.FrameLayout_main_activity, pagesFragment, "pagesFragment")
                .addToBackStack("pagesFragment")
                .commit();


    }



}
