package com.beetronix.al_tamhid.features.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.features.PageInterface;
import com.beetronix.al_tamhid.features.StartFragment;
import com.beetronix.al_tamhid.features.pages.Page_11;
import com.beetronix.al_tamhid.features.pages.pagesFragment;
import com.beetronix.al_tamhid.util.Tool;

public class MainActivity extends AppCompatActivity implements PageInterface {
    private MediaPlayer music;
    private boolean isPlayer=false;
    private boolean isPause=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFragment(new StartFragment());



    }

    public void click(View view) {
        view.setBackground(getResources().getDrawable(R.drawable.background_circle_selector));
        Toast.makeText(getApplicationContext(), view.getTag().toString(), Toast.LENGTH_LONG).show();

        if (isPlayer == true) {
//            Toast.makeText(getApplicationContext(), "الرجاء إيقاف التسجيل أولاً", Toast.LENGTH_LONG).show();
        } else {

            if (music != null) {
                music.release();
                music = null;}

                String tag = view.getTag().toString();
                music = MediaPlayer.create(MainActivity.this, Tool.getAudioFileByTitle(tag));
                music.start();
            }
        }




    private void setFragment(Fragment fragment) {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.FrameLayout_main_activity, fragment)
                .commit(); }

    @Override
    public void isPlayer(boolean state,boolean isPause) {
        this.isPlayer=state;
        this.isPause=isPause;

        // من أجل إيقاف الصوت الناتج عن النقر على أحد عبارات التمارين في حال شغلة الصوت الخاص لكامل الصفحة ولم ينتهي صوت النقرة بعد
        if(state ==true && music != null){
            music.release();
            music=null;
        }
    }

    @Override
    public void OnLongClickListeners(String buttonTile) {
        if (isPlayer != true && isPause==false) {
            // الشرط السابق ينص أنه من بعد ما تستقبل النقرة المطولة على أحد عبارات التمارين الخاصة بشاشة معينة إذا مافي مقطع صوتي شغال و وضعية الإيقاف المؤقت غير شغالة استجب للضغطة المطولة
//            pagesFragment.OnLongClickListeners(buttonTile);
        }
    }



    }

