package com.beetronix.al_tamhid.features.pages;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.viewpager2.widget.ViewPager2;
import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.features.PageInterface;
import com.beetronix.al_tamhid.features.ui.MainActivity;
import com.beetronix.al_tamhid.util.Tool;
import com.beetronix.al_tamhid.features.ui.MainActivity.StateTypeNow;
import com.example.myapplication.features.ui.BaseFragment;


public class pagesFragment extends BaseFragment {
    private View view;
    private static ViewPager2 ViewPager;
    private PageInterface pageInterface;
    private ViewPagerAdapter viewPagerAdapter;
    private TextView txt_page_num;
    private ImageView background_page_page;
    private ImageView img_high_margin;
    private static FrameLayout main_nav;
    private TextView btn_repet;
    private TextView btn_read_all_page;
    private int position;
    private int pageNum;
    private LinearLayout btn_repet_layout;
    private LinearLayout btn_read_all_page_layout;




    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof PageInterface) {
            pageInterface = (PageInterface) context;
        } else {
            throw new RuntimeException(context.toString()
                    + "");
        }
    }


    public pagesFragment() {

    }

    public static void show_main_nav(){
        main_nav.setVisibility( View.VISIBLE);
    }
    public static void hide_main_nav(){
        main_nav.setVisibility( View.GONE);
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_BEHIND);
       view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_pages, container, false);



        ViewPager = view.findViewById(R.id.pager);
        txt_page_num = view.findViewById(R.id.txt_page_num);
        background_page_page = view.findViewById(R.id.background_page_page);
        main_nav = view.findViewById(R.id.main_nav);
        btn_repet = view.findViewById(R.id.btn_repet);
        btn_read_all_page = view.findViewById(R.id.btn_read_all_page);
        btn_read_all_page_layout = view.findViewById(R.id.btn_read_all_page_layout);
        btn_repet_layout = view.findViewById(R.id.btn_repet_layout);






        Bundle bundle = getArguments();
        if(bundle != null)
        {
            position = bundle.getInt("Position",0);
        }
        else
        {
            position = 0;
        }



        initViewPager();
        initComponent();


        return view;
    }

    public void initViewPager() {
        viewPagerAdapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager(), getLifecycle());
        // set Orientation in your ViewPager2
        ViewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        viewPagerAdapter.addFragment(new Page_4());
        viewPagerAdapter.addFragment(new Page_5());
        viewPagerAdapter.addFragment(new Page_6());
        viewPagerAdapter.addFragment(new Page_7());
        viewPagerAdapter.addFragment(new Page_8());
        viewPagerAdapter.addFragment(new Page_9());
        viewPagerAdapter.addFragment(new Page_10());
        viewPagerAdapter.addFragment(new Page_11());
        viewPagerAdapter.addFragment(new Page_12());
        viewPagerAdapter.addFragment(new Page_13());
        viewPagerAdapter.addFragment(new Page_14());
        viewPagerAdapter.addFragment(new Page_15());
        viewPagerAdapter.addFragment(new Page_16());
        viewPagerAdapter.addFragment(new Page_17());
        viewPagerAdapter.addFragment(new Page_18());
        viewPagerAdapter.addFragment(new Page_19());
        viewPagerAdapter.addFragment(new Page_20());
        viewPagerAdapter.addFragment(new Page_21());
        viewPagerAdapter.addFragment(new Page_22());
        viewPagerAdapter.addFragment(new Page_23());
        viewPagerAdapter.addFragment(new Page_24());
        viewPagerAdapter.addFragment(new Page_25());
        viewPagerAdapter.addFragment(new Page_26());
        viewPagerAdapter.addFragment(new Page_27());
        viewPagerAdapter.addFragment(new Page_28());
        viewPagerAdapter.addFragment(new Page_29());
        viewPagerAdapter.addFragment(new Page_30());
        viewPagerAdapter.addFragment(new Page_31());
        viewPagerAdapter.addFragment(new Page_32());
        viewPagerAdapter.addFragment(new Page_33());
        viewPagerAdapter.addFragment(new Page_34());
        viewPagerAdapter.addFragment(new Page_35());
        viewPagerAdapter.addFragment(new Page_36());
        viewPagerAdapter.addFragment(new Page_37());
        viewPagerAdapter.addFragment(new Page_38());
        viewPagerAdapter.addFragment(new Page_39());
        viewPagerAdapter.addFragment(new Page_40());
        viewPagerAdapter.addFragment(new Page_41());
        viewPagerAdapter.addFragment(new Page_42());
        viewPagerAdapter.addFragment(new Page_43());
        viewPagerAdapter.addFragment(new Page_44());
        viewPagerAdapter.addFragment(new Page_45());
        viewPagerAdapter.addFragment(new Page_46());
        viewPagerAdapter.addFragment(new Page_47());
        viewPagerAdapter.addFragment(new Page_48());
        viewPagerAdapter.addFragment(new Page_49());
        viewPagerAdapter.addFragment(new Page_50());
        viewPagerAdapter.addFragment(new Page_51());
        viewPagerAdapter.addFragment(new Page_52());
        viewPagerAdapter.addFragment(new Page_53());
        viewPagerAdapter.addFragment(new Page_54());

        ViewPager.setAdapter(viewPagerAdapter);
        if (position < 7 || position == 23 || position == 24 || position == 50){
            main_nav.setVisibility(View.GONE);
        }else {
            main_nav.setVisibility(View.VISIBLE);
        }
        ViewPager.setCurrentItem(position,false);
        txt_page_num.setText((position+4)+"");
        pageNum = position;
        pageInterface.showPageInformation(position);

        ViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                pageNum = position;
                if (position < 7 || position == 23 || position == 24 || position == 50){
                    main_nav.setVisibility(View.GONE);
                    pageInterface.hidePageInformation();
                }else {
                    main_nav.setVisibility(View.VISIBLE);
                }

                txt_page_num.setText((position+4)+"");
                pageInterface.showPageInformation(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }



   public void initComponent(){

       btn_repet_layout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               btn_repet.callOnClick();
           }
       });

       btn_read_all_page_layout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               btn_read_all_page.callOnClick();
           }
       });

       Tool.displayImageDrawable(getContext(), background_page_page, R.drawable.background_page);

       btn_read_all_page.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               pageInterface.set_state_type(StateTypeNow.AllPAge,pageNum);
               main_nav.setVisibility(View.GONE);

           }
       });

       btn_repet.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               pageInterface.set_state_type(StateTypeNow.Repet,pageNum);
               main_nav.setVisibility(View.GONE);

           }
       });

   }

    @Override
    public void onStop() {
        super.onStop();
        ((MainActivity) getActivity()).finish_page_fragment(pageNum);

    }


}
