package com.beetronix.al_tamhid.features.about_book;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;

import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.util.Tool;
import com.example.myapplication.features.ui.BaseFragment;

import java.util.ArrayList;
import java.util.List;

public class aboutBookFragment extends BaseFragment implements AboutBookUiInterface{
    private ImageView ButtonBack;
    private ViewPager2  pagerAboutBookImages;
    private LinearLayout layoutDotsAboutBookImages;
    private List<Integer> images;
    private AboutBookManger aboutBookManger;
    private Handler handler;
    private Runnable runnable;
    private int maxStep;
    private int position;
    private TextView txt_book_description;
    private TextView txt_book_name;
    private ImageView btn_go_to_Telegram;
    private LinearLayout btn_go_to_Telegram_layout;

    private AdapterPagerAboutImage adapterPagerAboutImage;
    private LinearLayout btn_go_to_google_play;
    private ImageView img_go_to_google_play;


    public aboutBookFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_4 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_about_book, container, false);
        setNotificationBarColor(R.color.primary_color);
        ButtonBack = view_4.findViewById(R.id.ButtonBack);
        btn_go_to_Telegram_layout = view_4.findViewById(R.id.btn_go_to_Telegram_layout);
        txt_book_description = view_4.findViewById(R.id.txt_book_description);
        txt_book_name = view_4.findViewById(R.id.txt_book_name);
        pagerAboutBookImages = view_4.findViewById(R.id.pagerAboutBookImages);
        btn_go_to_Telegram = view_4.findViewById(R.id.btn_go_to_Telegram);
        btn_go_to_google_play = view_4.findViewById(R.id.btn_go_to_google_play);
        img_go_to_google_play = view_4.findViewById(R.id.img_go_to_google_play);
        layoutDotsAboutBookImages = view_4.findViewById(R.id.layoutDotsAboutBookImages);
        aboutBookManger = new AboutBookManger(this,this);

        Bundle bundle = getArguments();
        if(bundle != null)
        {
            position = bundle.getInt("Position",0);
        }
        else
        {
            position = 0;
        }

        Tool.displayImageDrawable(getContext(),ButtonBack,R.drawable.ic_arrow_right);
        Tool.displayImageDrawable(getContext(),img_go_to_google_play,R.drawable.google_play_icon);

        ButtonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        initImagesPager();
        getData();
        return view_4;
    }


    private void getData(){
        aboutBookManger.getBookData(position);
    }

    private void initImagesPager()
    {
        images = new ArrayList<>();


        maxStep = images.size();

        adapterPagerAboutImage = new AdapterPagerAboutImage(getContext(),images);

        pagerAboutBookImages.setAdapter(adapterPagerAboutImage);

        pagerAboutBookImages.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position)
            {
                super.onPageSelected(position);
                bottomProgressDots(position,maxStep);

            }

            @Override
            public void onPageScrollStateChanged(int state)
            {
                super.onPageScrollStateChanged(state);
            }
        });

    }

    private void bottomProgressDots(int current_index , int maxStep)
    {
        ImageView[] dots = new ImageView[maxStep];

        layoutDotsAboutBookImages.removeAllViews();
        for (int i = 0; i < dots.length; i++)
        {
            dots[i] = new ImageView(getContext());
            int width_height;
            if(i == current_index)
            {
                width_height = 20;
            }
            else
            {
                width_height = 15;
            }
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(width_height, width_height));
            params.setMargins(10, 10, 10, 10);
            dots[i].setLayoutParams(params);
            dots[i].setImageResource(R.drawable.circle_shape);
            dots[i].setColorFilter(getResources().getColor(R.color.grey), PorterDuff.Mode.SRC_IN);
            layoutDotsAboutBookImages.addView(dots[i]);
        }

        if (dots.length > 0)
        {
            dots[current_index].setImageResource(R.drawable.circle_shape);
            dots[current_index].setColorFilter(getResources().getColor(R.color.primary_color), PorterDuff.Mode.SRC_IN);
        }

    }

    @Override
    public void showBookData(BeAboutBook beAboutBook) {
        maxStep = beAboutBook.getImg().size();
        adapterPagerAboutImage.setImages(beAboutBook.getImg());


        if(maxStep > 1)
        {
            if(isAdded())
            {
                pagerAboutBookImages.setCurrentItem(1);
               // startAutoSlider(maxStep);
            }
        }


        txt_book_description.setText(beAboutBook.getDiscription());
        txt_book_name.setText(beAboutBook.getName());

        if (beAboutBook.getLink().isEmpty()||beAboutBook.getLink()==null){
            btn_go_to_Telegram_layout.setVisibility(View.GONE);
        }else {
            btn_go_to_Telegram_layout.setVisibility(View.VISIBLE);
            btn_go_to_Telegram.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    getTelegramInt(getContext(),beAboutBook.getLink());
                }
            });
        }

        if (beAboutBook.getLink_app().isEmpty() || beAboutBook.getLink_app()==null){
            btn_go_to_google_play.setVisibility(View.GONE);

        }else {
            btn_go_to_google_play.setVisibility(View.VISIBLE);

            btn_go_to_google_play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openAppInGooglePlay(beAboutBook.getLink_app());
                }
            });

        }


    }


    private void getTelegramInt(Context context, String link) {

        Intent intent;

        try {
            try {
                context.getPackageManager().getPackageInfo("org.telegram.messenger", 0);
            } catch (PackageManager.NameNotFoundException e) {
                context.getPackageManager().getPackageInfo("org.thunderdog.challegram", 0);
            }
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
            context.startActivity(intent);

        } catch (PackageManager.NameNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
            context.startActivity(intent);
        }
    }

    private void startAutoSlider(final int count)
    {
        if(handler != null && runnable != null)
        {
            handler.removeCallbacks(runnable);
        }
        handler = new Handler();
        runnable = new Runnable()
        {
            @Override
            public void run()
            {
                int position = pagerAboutBookImages.getCurrentItem();
                position++;
                if(position>=count) position=0;
                pagerAboutBookImages.setCurrentItem(position);
                handler.postDelayed(runnable,2000);

            }
        };
        handler.postDelayed(runnable,2000);
    }

    private void openAppInGooglePlay(String appPackageName){

        try {
            Intent appStoreIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName));
            appStoreIntent.setPackage("com.android.vending");

            startActivity(appStoreIntent);
        } catch (android.content.ActivityNotFoundException exception) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }

    }






}
