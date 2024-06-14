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
   private TextView txtTitlePage;
   private TextView txt_counter;
    private ImageView run_player_icon;
    private ImageView btn_add_counter;
    private ImageView btn_remove_counter;
    private ImageView stop_player_icon;
    private ImageView btn_cancel_counter;
    private ImageView btn_play_counter;
    private MediaPlayer mediaPlayer;
    private SeekBar seekBar;
    private TextView seekbarHint;
    private ViewPager2 ViewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private boolean isPause=false;
    private PageInterface pageInterface;
   private int pageNum;
   private static FrameLayout constraint_nav_counter;
    private static FrameLayout constraint_nav;
    private static String Long_click_button_title;
    private int number_of_repetitions =1;
    private boolean counterIsEmpty=true;
    private int counterIsplay =2;
    private int position=0;
    private TextView txt_page_num;
    private boolean stateIsCounter = false;
    private ImageView background_page_page;
    private ImageView img_high_margin;
    private TextView btn_read_all_page;
    private FrameLayout main_nav;
    private TextView btn_repet;
    private TextView txt_enter_the_word;


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
        View view_2 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_pages, container, false);



        run_player_icon = view_2.findViewById(R.id.run_player_icon);
        stop_player_icon = view_2.findViewById(R.id.stop_player_icon);
        ViewPager = view_2.findViewById(R.id.pager);
        seekbarHint= view_2.findViewById(R.id.seekbarHint);
        seekBar = view_2.findViewById(R.id.seekbar);
        mediaPlayer= MediaPlayer.create(getContext(),R.raw.page_15);
        txtTitlePage = view_2.findViewById(R.id.txtTitlePage);
        constraint_nav_counter = view_2.findViewById(R.id.constraint_nav_counter);
        constraint_nav = view_2.findViewById(R.id.constraint_nav);
        btn_cancel_counter = view_2.findViewById(R.id.btn_cancel_counter);
        btn_play_counter = view_2.findViewById(R.id.btn_play_counter);
        txt_counter = view_2.findViewById(R.id.txt_counter);
        btn_add_counter = view_2.findViewById(R.id.btn_add_counter);
        btn_remove_counter = view_2.findViewById(R.id.btn_remove_counter);
        txt_page_num = view_2.findViewById(R.id.txt_page_num);
        background_page_page = view_2.findViewById(R.id.background_page_page);
        img_high_margin = view_2.findViewById(R.id.img_high_margin);
        btn_read_all_page = view_2.findViewById(R.id.btn_read_all_page);
        main_nav = view_2.findViewById(R.id.main_nav);
        btn_repet = view_2.findViewById(R.id.btn_repet);
        txt_enter_the_word = view_2.findViewById(R.id.txt_enter_the_word);



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

        return view_2;
    }

    public void initViewPager() {
        pageInterface.isPlayer(false,false);
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
        mediaPlayer=Tool.getAudioPage(getContext(),position);
        seekBar.setMax(mediaPlayer.getDuration());
        txtTitlePage.setText(Tool.getPageTitle(position));
        txt_page_num.setText((position+11)+"");

        ViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                pageNum = position;
                if (position>26){txt_page_num.setText((position+13)+"");}else {txt_page_num.setText((position+11)+"");}
                if (!(mediaPlayer.isPlaying() && mediaPlayer != null || isPause==true)){
                    // الشرط السابق ينص على أنه في حال كان لايوجد مقطع قيد العمل أو حال الإيقاف المؤقت لا تعمل هيئ البار السفلي المسؤول عن تشغيل الصفحة كاملة
                    // هذا عند قلبب الصفحة
                    mediaPlayer=Tool.getAudioPage(getContext(),pageNum);
                    seekBar.setMax(mediaPlayer.getDuration());
                    txtTitlePage.setText(Tool.getPageTitle(pageNum));
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }

   public void initComponent(){

       Tool.displayImageDrawable(getContext(), stop_player_icon, R.drawable.stop_player_icon);
       Tool.displayImageDrawable(getContext(), run_player_icon, R.drawable.run_player_icon);
       Tool.displayImageDrawable(getContext(), background_page_page, R.drawable.background_page);
       Tool.displayImageDrawable(getContext(), img_high_margin, R.drawable.high_margin);
       Tool.displayImageDrawable(getContext(), btn_cancel_counter, R.drawable.concel_icon);
       Tool.displayImageDrawable(getContext(), btn_play_counter, R.drawable.run_player_icon);
       Tool.displayImageDrawable(getContext(), btn_add_counter, R.drawable.add_icon);
       Tool.displayImageDrawable(getContext(), btn_remove_counter, R.drawable.remove_icon);


       run_player_icon.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               seekbarHint.setVisibility(view.VISIBLE);
               if (mediaPlayer != null && mediaPlayer.isPlaying()) {pauseAudio();}
               else {startAudio();}
           }});

            stop_player_icon.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {stopAudio();}
      });

            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromTouch) {
                if(fromTouch) {
                    mediaPlayer.seekTo(progress);
                    seekBar.setProgress(progress);
                }
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.seekTo(seekBar.getProgress());
                }
            }
        });

       btn_read_all_page.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               main_nav.setVisibility(View.GONE);
               run_player_icon.performClick();
           }
       });

       btn_repet.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               btn_read_all_page.setVisibility(View.GONE);
               btn_repet.setVisibility(View.GONE);
               txt_enter_the_word.setVisibility(View.VISIBLE);
               pageInterface.isPlayer(true,false);
           }
       });



        Handler mSeekbarUpdateHandler = new Handler();
        Runnable mUpdateSeekbar = new Runnable() {
           @Override
           public void run() {
               seekbarHint.setText(Tool.milliSecondsToTimer(mediaPlayer.getCurrentPosition()));
               seekBar.setProgress(mediaPlayer.getCurrentPosition());
               mSeekbarUpdateHandler.postDelayed(this, 50);
           }
       };
       mSeekbarUpdateHandler.postDelayed(mUpdateSeekbar, 0);

       btn_cancel_counter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               //لتهيئة البار السفلي الخاص بعملية التكرار
               constraint_nav_counter.setVisibility(View.GONE);
               btn_add_counter.setVisibility(View.VISIBLE);
               btn_remove_counter.setVisibility(View.VISIBLE);
               number_of_repetitions = 1;
               txt_counter.setText(number_of_repetitions+"");


               // من أجل اعادة الواجهة لحالتها الابتدائية في التعامل مع زر تشغيل مرات التكرار
               counterIsplay = 0;
               counterIsEmpty = true;

               // من أجل إعادة السماح بالاستجابة للضغطة المطولة على عبارات التمارين
               pageInterface.isPlayer(false,false);

               stopAudio();

           }
       });

       btn_add_counter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               number_of_repetitions++;
               txt_counter.setText(number_of_repetitions+"");
           }
       });
       btn_remove_counter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(number_of_repetitions>1)
               { number_of_repetitions--;
               txt_counter.setText(number_of_repetitions+"");}
           }
       });

       btn_play_counter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

                   if (!counterIsEmpty){
                       // هيئ البار السفلي لحالة الايقاف المؤقت للصوت
                       btn_add_counter.setVisibility(View.VISIBLE);
                       btn_remove_counter.setVisibility(View.VISIBLE);
                       number_of_repetitions=Integer.parseInt(txt_counter.getText().toString());
                       txt_counter.setText(number_of_repetitions+"");
                       Tool.displayImageDrawable(getContext(), btn_play_counter, R.drawable.run_player_icon);
                       counterIsEmpty = true;
                       // أوقف عملية التكرار
                       counterIsplay =0;

                   }else {
                   counterIsplay =1;
                   stateIsCounter = true;
                   Tool.displayImageDrawable(getContext(), btn_play_counter, R.drawable.pause_player_icon);
                   btn_add_counter.setVisibility(View.GONE);
                   btn_remove_counter.setVisibility(View.GONE);
                   repeating_the_sound(Long_click_button_title,number_of_repetitions);
                   }

                   }

       });


   };


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mediaPlayer.stop();
        // ولها استخدام اخر وهو أنه عند الخروج من الصفحة بشكل كامل أو مؤقت أوقف الصوت الخاص بالعبارة
        pageInterface.isPlayer(true,false);

    }

    private void stopAudio(){
        mediaPlayer.stop();
        main_nav.setVisibility(View.VISIBLE);
        seekbarHint.setVisibility(View.GONE);
        seekBar.setVisibility(View.GONE);
        stop_player_icon.setVisibility(View.GONE);
        Tool.displayImageDrawable(getContext(), run_player_icon, R.drawable.run_player_icon);
        pageInterface.isPlayer(false,false); // لتفعيل الاستجابة لنقرات التمارين الخاصة بالصفحة

        // لإعادة تهيئة عناصر البار السفلي الخاص بتشغيل المقطع الصوتي الخاص بكامل الصفحة
        mediaPlayer = Tool.getAudioPage(getContext(),pageNum);
        seekBar.setMax(mediaPlayer.getDuration());
        txtTitlePage.setText(Tool.getPageTitle(pageNum));
        seekBar.setProgress(0);
        // من اجل اعادة وضعيعة الايقاف المؤقت للوضع الافتراضي وبدونها شرط الفحص المسؤول عن تجديد بيانات الصفحة عن القلب سيختل
        isPause=false;
        stateIsCounter = false;
    }
    private void startAudio(){
        seekBar.setProgress(mediaPlayer.getCurrentPosition());
        seekBar.setVisibility(View.VISIBLE);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                if (!stateIsCounter){stopAudio();}
            }
        });
        mediaPlayer.start();
        stop_player_icon.setVisibility(View.VISIBLE);
        Tool.displayImageDrawable(getContext(), run_player_icon, R.drawable.pause_player_icon);
        pageInterface.isPlayer(true,false); // لإيقاف الاستجابة للنقرات على كلامات التمارين
    }

    private void pauseAudio(){
        mediaPlayer.pause();
        Tool.displayImageDrawable(getContext(), run_player_icon, R.drawable.run_player_icon);
        // لمنع تهيئة البار السفلي عن قلب الصفحة
        isPause=true;

        pageInterface.isPlayer(false,true); /* بالنسبة لل isPause وقت عم تاخد القيمة الايجابية ففعلتها أن تمنع الاستجابة للضغطة المطولة الخاصة بميزة تكرار الصوت
        تذكر بأن امكانية النقرة البسيطة تعمل
        */
    }

    public static void OnLongClickListeners(String button_title) {
            constraint_nav_counter.setVisibility(View.VISIBLE);
            // لتعريف هذا الكلاس على عنوان النقرة المطولة من أجل عند الضغط على تشغيل مرات التكرار بعد تحديد عدد يعرف شو المقطع الصوتي يلي لازم يشغله
            Long_click_button_title = button_title;

    }
    private void repeating_the_sound(String buttonTile,int num) {

        if(num!=0){
            mediaPlayer = MediaPlayer.create(getContext(), Tool.getAudioFileByTitle(buttonTile));
            final int[] count = {num};
            // من أجل عدم الاستجابة للضغطات المطولة في حالة أن مرات التكرار الصوتي للعبارات لم تنتهي
            pageInterface.isPlayer(true,false);
            // من أجل تهئة العداد بعد التعامل معه بالمرة السابقة يعني عد وخلص فلازم يكون فاضي, في حال ما هيئته مو هو فاضي فعند الرغبة بالايقاف المؤقت للتكرار ما رح يدخل عالشرط لاني هو فاضي فلا داعي للايقاف المؤقت
            counterIsEmpty=false;

            // هون عن برصد نهاية النطق بعبارة التمرين للمرة الواحدة مشان بعد هذه اللحظة أقوم بالاجراءات اللازمة على قيمة العداد في حال ما وصلت للصفر أو التهيئة لمنطقة البار السفلي في حال وصلت للصفر
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                 if (count[0]>1) {
                     if(counterIsplay==0){
                         // إيقاف عملية التكرار للصوت وهذا يختلف عن عملية تابع إيقاف الصوت ففي تابع إيقاف الصوت تهيأ الواجهة من جديد ولا توقف عملية التكرار
                         // يعني في حال ما استخدمت هي فالشاشة رح تكون جاهزة للاستخدام بشكل صحيح ولكن الصوت لن يتوقف عن التكرار حتى النهاية
                         return;
                        }
                        mediaPlayer.start();
                        count[0]--;
                        txt_counter.setText(count[0] +"");
                    } else if (!stateIsCounter){stopAudio();

                 }
                 else {
                     // هون خلص العداد فعم هيئ البار السفلي الخاص بعملية تكرار الصوت للوضع الابتدائي وو الواجهة ككل
                        constraint_nav_counter.setVisibility(View.GONE);
                        btn_add_counter.setVisibility(View.VISIBLE);
                        btn_remove_counter.setVisibility(View.VISIBLE);
                        number_of_repetitions=1;
                        txt_counter.setText(number_of_repetitions+"");
                        counterIsEmpty=true;
                        Tool.displayImageDrawable(getContext(), btn_play_counter, R.drawable.run_player_icon);
                        pageInterface.isPlayer(false,false);


                    }
                }
            });

            // هذه الاسطر تقوم لتهيئة الصوت الذي سيعمل بعد الضعط على زر تشغيل الصفحة كاملة لأن متغير تكرار الصوت و الصفحة كاملة مشترك على عكس متغير الصوت تبع النقرة فهو في MainActivity
            mediaPlayer.start();
            mediaPlayer = Tool.getAudioPage(getContext(),pageNum);
            seekBar.setMax(mediaPlayer.getDuration());
        }
    }

    @Override
    public void onPause() {
        pauseAudio();
        super.onPause();

    }
}
