package com.ZidnyScience.TamheedTelawa.features.ui;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.ZidnyScience.TamheedTelawa.R;
import com.ZidnyScience.TamheedTelawa.features.PageInterface;
import com.ZidnyScience.TamheedTelawa.features.StartFragment;
import com.ZidnyScience.TamheedTelawa.features.pages.pagesFragment;
import com.ZidnyScience.TamheedTelawa.util.Tool;

public class MainActivity extends AppCompatActivity implements PageInterface{

    private MediaPlayer music;
    private MediaPlayer currentAudio;
    private boolean isPlayer=false;
    private FrameLayout constraint_nav;
    private ImageView btn_add_counter;
    private TextView txt_counter;
    private ImageView btn_remove_counter;
    private LinearLayout seekbar_layout;
    private SeekBar seekBar;
    private TextView seekbarHint;
    private ImageView run_player_icon;
    private ImageView cancel_full_page_readers;
    private TextView txtTitlePage;
    private StateTypeNow state_type;
    private int page_number;
    private int number_of_repetitions = 1;
    private int counterIsplay = 1;
    private boolean repetIsplay = false;
    private Handler mSeekbarUpdateHandler = new Handler();
    private Runnable mUpdateSeekbar;
    private LinearLayout counter_item_group;
    private boolean isPaused = false;
    private int currentPosition = 0;
    private String last_tag = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFragment(new StartFragment());
        constraint_nav =  findViewById(R.id.constraint_nav);
        seekbar_layout =  findViewById(R.id.seekbar_layout);
        btn_add_counter =  findViewById(R.id.btn_add_counter);
        btn_remove_counter =  findViewById(R.id.btn_remove_counter);
        txt_counter =  findViewById(R.id.txt_counter);
        seekBar =  findViewById(R.id.seekbar);
        seekbarHint =  findViewById(R.id.seekbarHint);
        run_player_icon =  findViewById(R.id.run_player_icon);
        cancel_full_page_readers =  findViewById(R.id.cancel_full_page_readers);
        txtTitlePage =  findViewById(R.id.txtTitlePage);
        counter_item_group =  findViewById(R.id.counter_item_group);


        initComponent();
    }


    private void setFragment(Fragment fragment) {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.FrameLayout_main_activity, fragment)
                .commit(); }



    public void initComponent(){
        state_type = StateTypeNow.NoThing;
        constraint_nav.setVisibility( View.GONE);
        music = MediaPlayer.create(getBaseContext(), Tool.getAudioFileByTitle(""));
        Tool.displayImageDrawable(getBaseContext(),run_player_icon,R.drawable.run_player_icon);
        Tool.displayImageDrawable(getBaseContext(),cancel_full_page_readers,R.drawable.concel_icon);
        cancel_full_page_readers.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state_type == StateTypeNow.audioIsPlayed || state_type == StateTypeNow.paused) {
                    stopAudio();
                } else if (state_type == StateTypeNow.paused_Repet ||state_type == StateTypeNow.Repet) {
                    constraint_nav.setVisibility( View.GONE);
                    btn_add_counter.setVisibility( View.VISIBLE);
                    btn_remove_counter.setVisibility( View.VISIBLE);
                    counter_item_group.setVisibility( View.GONE);
                    number_of_repetitions = 1;
                    txt_counter.setText(number_of_repetitions+"");
                    counterIsplay = 0;
                    state_type = StateTypeNow.NoThing;
                    repetIsplay = false;
                    stopAudio();
                } else if (state_type == StateTypeNow.AllPAge) {
                    constraint_nav.setVisibility( View.GONE);
                    pagesFragment.show_main_nav();
                    state_type = StateTypeNow.NoThing;
                }
            }
        });
        btn_add_counter.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number_of_repetitions++;
                txt_counter.setText(number_of_repetitions+"");
            }
        });
        btn_remove_counter.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number_of_repetitions>1)
                { number_of_repetitions--;
                    txt_counter.setText(number_of_repetitions+"");}
            }
        });

        run_player_icon.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state_type == StateTypeNow.AllPAge){
                    music=Tool.getAudioPage(getBaseContext(),page_number);
                    startAudio(music);
                }else if (state_type == StateTypeNow.audioIsPlayed){
                    pauseAudio();
                } else if (state_type == StateTypeNow.paused){
                    music.start();
                    Tool.displayImageDrawable(getBaseContext(), run_player_icon, R.drawable.pause_player_icon);
                    state_type = StateTypeNow.audioIsPlayed;
                }else if (state_type == StateTypeNow.Repet){
                    pauseRepeatingSound();
                } else if (state_type == StateTypeNow.paused_Repet) {
                    resumeRepeatingSound();
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromTouch) {
                if(fromTouch) {
                    music.seekTo(progress);
                    seekBar.setProgress(progress);
                }
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (music != null && music.isPlaying()) {
                    music.seekTo(seekBar.getProgress());
                }
            }
        });
    }
    @Override
    public void set_state_type(StateTypeNow stateTypeNow,int number) {
        constraint_nav.setVisibility( View.VISIBLE);
        if (stateTypeNow == StateTypeNow.AllPAge){

            state_type = StateTypeNow.AllPAge;
//            this.page_number = number;
            txtTitlePage.setText(Tool.getPageTitle(number));
            txtTitlePage.setVisibility( View.VISIBLE);
            counter_item_group.setVisibility( View.GONE);
            run_player_icon.setVisibility( View.VISIBLE);
           // run_player_icon.callOnClick();

        }else if (stateTypeNow == StateTypeNow.Repet){
            state_type = StateTypeNow.Repet;
            txtTitlePage.setVisibility( View.GONE);
            counter_item_group.setVisibility(View.VISIBLE);
            run_player_icon.setVisibility( View.GONE);

        }
    }

    @Override
    public void showPageInformation(int position) {
        this.page_number = position;
        if (state_type != StateTypeNow.audioIsPlayed )
        {txtTitlePage.setText(Tool.getPageTitle(page_number));
        } else if (state_type != StateTypeNow.paused) {
            txtTitlePage.setText(Tool.getPageTitle(page_number));
        } else if ((state_type == StateTypeNow.NoThing)){
            txtTitlePage.setText(Tool.getPageTitle(page_number));
        }

    }

    @Override
    public void hidePageInformation() {
        mSeekbarUpdateHandler.removeCallbacksAndMessages(null);
        constraint_nav.setVisibility( View.GONE);

    }



    public void finishPageFragment() {
        if (music != null) {
                music.stop();
                state_type =StateTypeNow.NoThing;
                constraint_nav.setVisibility(View.GONE);
                mSeekbarUpdateHandler.removeCallbacksAndMessages(null);
                constraint_nav.setVisibility( View.GONE);
                btn_add_counter.setVisibility( View.VISIBLE);
                btn_remove_counter.setVisibility( View.VISIBLE);
                counter_item_group.setVisibility( View.GONE);
                number_of_repetitions = 1;
                txt_counter.setText(number_of_repetitions+"");
                counterIsplay = 0;
                state_type = StateTypeNow.NoThing;
                repetIsplay = false;
                isPaused= false;
                stopAudio();

            music.release();
            music = null;
        }
    }

    private void pauseRepeatingSound() {
        if (music != null && music.isPlaying()) {
            currentPosition = music.getCurrentPosition();
            music.pause();
            isPaused = true;
            mSeekbarUpdateHandler.post(mUpdateSeekbar);
            Tool.displayImageDrawable(getBaseContext(), run_player_icon, R.drawable.run_player_icon);
            state_type = StateTypeNow.paused_Repet;
        }
    }

    private void resumeRepeatingSound() {
        if (music != null && isPaused) {
            music.seekTo(currentPosition);
            music.start();
            isPaused = false;
            mSeekbarUpdateHandler.post(mUpdateSeekbar);
            Tool.displayImageDrawable(getBaseContext(), run_player_icon, R.drawable.pause_player_icon);
            state_type = StateTypeNow.Repet;
        }
    }

    private void pauseAudio(){
        music.pause();
        Tool.displayImageDrawable(getBaseContext(), run_player_icon, R.drawable.run_player_icon);
        state_type = StateTypeNow.paused;
    }


    private void repeating_the_sound(String buttonTile, int num) {
        if (num != 0) {
            mSeekbarUpdateHandler.removeCallbacksAndMessages(null);
            music = MediaPlayer.create(getBaseContext(), Tool.getAudioFileByTitle(buttonTile));
            final int[] count = {num};

            music.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    if (count[0] > 1) {
                        if (counterIsplay == 0) {
                            return;
                        }
                        if (!isPaused) { // لا تعيد التشغيل إذا كان متوقف مؤقتاً
                            music.start();
                            count[0]--;
                            txt_counter.setText(count[0] + "");
                        }
                    } else {
                        constraint_nav.setVisibility( View.GONE);
                        pagesFragment.show_main_nav();
                        state_type = StateTypeNow.NoThing;
                        btn_add_counter.setVisibility( View.VISIBLE);
                        btn_remove_counter.setVisibility( View.VISIBLE);
                        Tool.displayImageDrawable(getBaseContext(), run_player_icon, R.drawable.run_player_icon);
                        repetIsplay = false;
                        number_of_repetitions = 1;
                        counter_item_group.setVisibility( View.GONE);
                        txt_counter.setText(number_of_repetitions + "");
                        stopAudio();
                    }
                }
            });

            music.start();
            constraint_nav.setVisibility( View.VISIBLE);
            seekbar_layout.setVisibility( View.VISIBLE);
            seekBar.setMax(music.getDuration());

            mSeekbarUpdateHandler = new Handler();

            if (mUpdateSeekbar != null) {
                mSeekbarUpdateHandler.removeCallbacks(mUpdateSeekbar);
            }

            mUpdateSeekbar = new Runnable() {
                @Override
                public void run() {
                    if (!isPaused) { // لا تحدث شريط التمرير إذا كان متوقف مؤقتاً
                        seekbarHint.setText(Tool.milliSecondsToTimer(music.getCurrentPosition()));
                        seekBar.setProgress(music.getCurrentPosition());
                        mSeekbarUpdateHandler.postDelayed(this, 200);
                    }
                }
            };
            mSeekbarUpdateHandler.postDelayed(mUpdateSeekbar, 0);
        }
    }


    private void stopAudio(){
        music.stop();
        seekbar_layout.setVisibility( View.GONE);
        constraint_nav.setVisibility( View.GONE);
        txtTitlePage.setVisibility(View.GONE);
        pagesFragment.show_main_nav();
        Tool.displayImageDrawable(getBaseContext(), cancel_full_page_readers, R.drawable.concel_icon);
        Tool.displayImageDrawable(getBaseContext(), run_player_icon, R.drawable.run_player_icon);
        state_type = StateTypeNow.NoThing;
        seekBar.setProgress(0);
    }

    private void startAudio(MediaPlayer audio){
        if (currentAudio != null) {
            currentAudio.release();
            currentAudio = null;
        }

        currentAudio = audio;

        constraint_nav.setVisibility( View.VISIBLE);
        txtTitlePage.setVisibility( View.GONE);
        seekbar_layout.setVisibility( View.VISIBLE);
        seekBar.setMax(audio.getDuration());
        audio.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                state_type = StateTypeNow.NoThing;
                seekbar_layout.setVisibility( View.GONE);
                txtTitlePage.setVisibility( View.GONE);
                counter_item_group.setVisibility( View.GONE);
                Tool.displayImageDrawable(getBaseContext(), cancel_full_page_readers, R.drawable.concel_icon);
                Tool.displayImageDrawable(getBaseContext(), run_player_icon, R.drawable.run_player_icon);
                constraint_nav.setVisibility( View.GONE);
                pagesFragment.show_main_nav();
            }
        });
        currentAudio.start();
        Tool.displayImageDrawable(getBaseContext(), cancel_full_page_readers, R.drawable.stop_player_icon);
        Tool.displayImageDrawable(getBaseContext(), run_player_icon, R.drawable.pause_player_icon);
        state_type = StateTypeNow.audioIsPlayed;

        mSeekbarUpdateHandler = new Handler();

        if (mUpdateSeekbar != null) {
            mSeekbarUpdateHandler.removeCallbacks(mUpdateSeekbar);
        }
        mUpdateSeekbar = new Runnable() {
            @Override
            public void run() {
                seekbarHint.setText(Tool.milliSecondsToTimer(currentAudio.getCurrentPosition()));
                seekBar.setProgress(currentAudio.getCurrentPosition());
                mSeekbarUpdateHandler.postDelayed(this, 200);
            }
        };
        mSeekbarUpdateHandler.postDelayed(mUpdateSeekbar, 0);


    }

    public void click(View view) {
        String tag =  view.getTag().toString();
        view.setBackground(getResources().getDrawable(R.drawable.background_circle_selector));


        if (state_type == StateTypeNow.NoThing){

            if (isPlayer == true) {

            } else {

                if (music != null) {
                    music.release();
                    music = null;}

                music = MediaPlayer.create(getBaseContext(), Tool.getAudioFileByTitle(tag));
                txtTitlePage.setText("");
                startAudio(music);
            }

        }else if (state_type == StateTypeNow.Repet && !repetIsplay){
            run_player_icon.setVisibility( View.VISIBLE);
            Tool.displayImageDrawable(getBaseContext(), run_player_icon, R.drawable.pause_player_icon);
            repeating_the_sound(tag,Integer.parseInt(txt_counter.getText().toString()));
            btn_add_counter.setVisibility( View.GONE);
            btn_remove_counter.setVisibility( View.GONE);
            last_tag = tag;
            repetIsplay = true;
            counterIsplay = 1;

        }
    }

    public enum StateTypeNow {
        AllPAge , Repet , NoThing ,audioIsPlayed, paused,paused_Repet;

    }
     public void finish_page_fragment(int position){
        stopAudio();
         //pagesFragment.hide_main_nav();
        constraint_nav.setVisibility(View.GONE);
        state_type = StateTypeNow.NoThing;
        // pagesFragment.show_main_nav();
         btn_add_counter.setVisibility( View.VISIBLE);
         btn_remove_counter.setVisibility( View.VISIBLE);
         Tool.displayImageDrawable(getBaseContext(), run_player_icon, R.drawable.run_player_icon);
         repetIsplay = false;
         number_of_repetitions = 1;
         counter_item_group.setVisibility( View.GONE);
         txt_counter.setText(number_of_repetitions + "");

         if (position < 7 || position == 23 || position == 24 || position == 50){
             pagesFragment.hide_main_nav();
         }else {
             pagesFragment.show_main_nav();
         }


     }


    }




