package com.ZidnyScience.TamheedTelawa.features;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ZidnyScience.TamheedTelawa.R;
import com.ZidnyScience.TamheedTelawa.features.AboutGroupFragment.AboutGroupFragment;
import com.ZidnyScience.TamheedTelawa.features.ContentsFragment.ContentsFragment;
import com.ZidnyScience.TamheedTelawa.features.about_book.aboutBookFragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.myapplication.features.ui.BaseFragment;


public class StartFragment extends BaseFragment {
    private ImageView background_start_fragment;
    private ImageView img_home_shape_top;
    private ImageView title_group_book;
    private ImageView logo_app;
    private ImageView background_buttons_start_fragment_1;
    private ImageView background_buttons_start_fragment_2;
    private ImageView background_buttons_start_fragment_3;
    private ImageView background_buttons_start_fragment_4;
    private ImageView background_buttons_start_fragment_5;
    private ImageView background_page_start;




    public StartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_start, container, false);

        setNotificationBarColor(R.color.yallow);


        background_start_fragment = view.findViewById(R.id.background_start_fragment);
        img_home_shape_top = view.findViewById(R.id.img_home_shape_top);
        title_group_book = view.findViewById(R.id.title_group_book);
        logo_app = view.findViewById(R.id.logo_app);
        background_page_start = view.findViewById(R.id.background_page_start);
        background_buttons_start_fragment_1 = view.findViewById(R.id.background_buttons_start_fragment_1);
        background_buttons_start_fragment_2 = view.findViewById(R.id.background_buttons_start_fragment_2);
        background_buttons_start_fragment_3 = view.findViewById(R.id.background_buttons_start_fragment_3);
        background_buttons_start_fragment_4 = view.findViewById(R.id.background_buttons_start_fragment_4);
        background_buttons_start_fragment_5 = view.findViewById(R.id.background_buttons_start_fragment_5);



        displayImageDrawable(getContext(),background_start_fragment,R.drawable.background_page);
        displayImageDrawable(getContext(),title_group_book,R.drawable.title_group_book);
        displayImageDrawable(getContext(),background_start_fragment,R.drawable.background_start_fragment);
        displayImageDrawable(getContext(),background_page_start,R.drawable.background_page);
        displayImageDrawable(getContext(),img_home_shape_top,R.drawable.img_home_shape_top);
        displayImageDrawable(getContext(),logo_app,R.drawable.logo_app);
        displayImageDrawable(getContext(),background_buttons_start_fragment_1,R.drawable.background_buttons_start_fragment_2);
        displayImageDrawable(getContext(),background_buttons_start_fragment_2,R.drawable.background_buttons_start_fragment_2);
        displayImageDrawable(getContext(),background_buttons_start_fragment_3,R.drawable.background_buttons_start_fragment_2);
        displayImageDrawable(getContext(),background_buttons_start_fragment_4,R.drawable.background_buttons_start_fragment_2);
        displayImageDrawable(getContext(),background_buttons_start_fragment_5,R.drawable.background_buttons_start_fragment_2);


        background_buttons_start_fragment_1.setOnClickListener(v -> {

                getActivity().getSupportFragmentManager().beginTransaction()
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .replace(R.id.FrameLayout_main_activity, new ContentsFragment(),"ContentsFragment")
                        .addToBackStack("ContentsFragment")
                        .commit();
        });

        background_buttons_start_fragment_2.setOnClickListener(v -> {

            aboutBookFragment aboutBookFragment = new aboutBookFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("Position" , 9);
            aboutBookFragment.setArguments(bundle);
            getActivity().getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.FrameLayout_main_activity, aboutBookFragment ,"aboutBookFragment")
                    .addToBackStack("aboutBookFragment")
                    .commit();
        });

        background_buttons_start_fragment_3.setOnClickListener(v -> {

            getActivity().getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.FrameLayout_main_activity, new AuthorsFragment(),"AuthorsFragment")
                    .addToBackStack("AuthorsFragment")
                    .commit();
        });

        background_buttons_start_fragment_4.setOnClickListener(v -> {

            getActivity().getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.FrameLayout_main_activity, new AboutGroupFragment(),"AboutGroupFragment")
                    .addToBackStack("AboutGroupFragment")
                    .commit();
        });

        background_buttons_start_fragment_5.setOnClickListener(v -> {

            getActivity().getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.FrameLayout_main_activity, new OurServicesFragment(),"OurServicesFragment")
                    .addToBackStack("OurServicesFragment")
                    .commit();
        });

        return view;


    }
    public static void displayImageDrawable(Context context, ImageView img, @DrawableRes int drawable) {
        try {
            Glide.with(context).load(drawable)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(img);
        } catch (Exception e) {
        }
    }
    

}

