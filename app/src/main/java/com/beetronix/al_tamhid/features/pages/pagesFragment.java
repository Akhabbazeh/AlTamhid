package com.beetronix.al_tamhid.features.pages;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.viewpager2.widget.ViewPager2;

import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.features.PageInterface;
import com.beetronix.al_tamhid.features.*;

import com.beetronix.al_tamhid.util.Tool;
import com.example.myapplication.features.ui.BaseFragment;


public class pagesFragment extends BaseFragment {
    private View view;
    private ViewPager2 ViewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private PageInterface pageInterface;
    private TextView txt_page_num;
    private ImageView background_page_page;
    private ImageView img_high_margin;
    private FrameLayout main_nav;
    private TextView btn_repet;
    private TextView btn_read_all_page;
    private int position;


    public pagesFragment() {

    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            pageInterface = (PageInterface) context;

        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement FragmentToActivity");
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_BEHIND);
       view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_pages, container, false);



        ViewPager = view.findViewById(R.id.pager);
        txt_page_num = view.findViewById(R.id.txt_page_num);
        background_page_page = view.findViewById(R.id.background_page_page);
        img_high_margin = view.findViewById(R.id.img_high_margin);
        main_nav = view.findViewById(R.id.main_nav);
        btn_repet = view.findViewById(R.id.btn_repet);
        btn_read_all_page = view.findViewById(R.id.btn_read_all_page);



        Bundle bundle = getArguments();
        if(bundle != null)
        {
            position = bundle.getInt("Position",0);
        }
        else
        {
            position = 0;
        }


        initComponent();
        initViewPager();

        return view;
    }

    public void initViewPager() {
        viewPagerAdapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager(), getLifecycle());
        // set Orientation in your ViewPager2
        ViewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

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

        ViewPager.setAdapter(viewPagerAdapter);
        ViewPager.setCurrentItem(position,false);
//        seekBar.setMax(mediaPlayer.getDuration());
//        txtTitlePage.setText(Tool.getPageTitle(position));
        txt_page_num.setText((position+11)+"");

        ViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if (position>26){txt_page_num.setText((position+13)+"");}else {txt_page_num.setText((position+11)+"");}
//                if (!(mediaPlayer.isPlaying() && mediaPlayer != null || isPause==true)){
//                    // الشرط السابق ينص على أنه في حال كان لايوجد مقطع قيد العمل أو حال الإيقاف المؤقت لا تعمل هيئ البار السفلي المسؤول عن تشغيل الصفحة كاملة
//                    // هذا عند قلبب الصفحة
//                    mediaPlayer=Tool.getAudioPage(getContext(),pageNum);
//                    seekBar.setMax(mediaPlayer.getDuration());
//                    txtTitlePage.setText(Tool.getPageTitle(pageNum));
//                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }

   public void initComponent(){


       Tool.displayImageDrawable(getContext(), background_page_page, R.drawable.background_page);
       Tool.displayImageDrawable(getContext(), img_high_margin, R.drawable.high_margin);

       btn_read_all_page.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               main_nav.setVisibility(View.VISIBLE);

           }
       });

       btn_repet.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               main_nav.setVisibility(View.VISIBLE);

           }
       });

   }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        mediaPlayer.stop();
//        // ولها استخدام اخر وهو أنه عند الخروج من الصفحة بشكل كامل أو مؤقت أوقف الصوت الخاص بالعبارة
//        pageInterface.isPlayer(true,false);

    }

    @Override
    public void onPause() {
        super.onPause();

    }
}
