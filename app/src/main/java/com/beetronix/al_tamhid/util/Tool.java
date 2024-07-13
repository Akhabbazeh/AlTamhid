package com.beetronix.al_tamhid.util;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.DrawableRes;

import com.beetronix.al_tamhid.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class Tool {

    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager =
                (InputMethodManager) activity.getSystemService(
                        Activity.INPUT_METHOD_SERVICE);
        if (inputMethodManager.isActive()) {
            if (activity.getCurrentFocus() != null) {
                inputMethodManager.hideSoftInputFromWindow(
                        activity.getCurrentFocus().getWindowToken(), 0);
            }
        }
    }

    public static String milliSecondsToTimer(long milliseconds) {
        String finalTimerString = "";
        String secondsString = "";

        // Convert total duration into time
        int hours = (int) (milliseconds / (1000 * 60 * 60));
        int minutes = (int) (milliseconds % (1000 * 60 * 60)) / (1000 * 60);
        int seconds = (int) ((milliseconds % (1000 * 60 * 60)) % (1000 * 60) / 1000);
        // Add hours if there
        if (hours > 0) {
            finalTimerString = hours + ":";
        }

        // Prepending 0 to seconds if it is one digit
        if (seconds < 10) {
            secondsString = "0" + seconds;
        } else {
            secondsString = "" + seconds;
        }

        finalTimerString = finalTimerString + minutes + ":" + secondsString;

        // return timer string
        return finalTimerString;


    }

    public static MediaPlayer getAudioPage(Context context,int position){

        if (position==0){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==1){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==2){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==3){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==4){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==5){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==6){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==7){
            return MediaPlayer.create(context,R.raw.page_11);
        }else if (position==8){
            return MediaPlayer.create(context,R.raw.page_12);
        }else if (position==9){
            return MediaPlayer.create(context,R.raw.page_13);
        }else if (position==10){
            return MediaPlayer.create(context,R.raw.page_14);
        }else if (position==11){
            return MediaPlayer.create(context,R.raw.page_15);
        }else if (position==12){
            return MediaPlayer.create(context,R.raw.page_16);
        }else if (position==13){
            return MediaPlayer.create(context,R.raw.page_17);
        }else if (position==14){
            return MediaPlayer.create(context,R.raw.page_18);
        }else if (position==15) {
            return MediaPlayer.create(context, R.raw.page_19);
        }else if (position==16){
            return MediaPlayer.create(context,R.raw.page_20);
        }else if (position==17){
            return MediaPlayer.create(context,R.raw.page_21);
        }else if (position==18){
            return MediaPlayer.create(context,R.raw.page_22);
        }else if (position==19){
            return MediaPlayer.create(context,R.raw.page_23);
        }else if (position==20){
            return MediaPlayer.create(context,R.raw.page_24);
        }else if (position==21){
            return MediaPlayer.create(context,R.raw.page_25);
        }else if (position==22){
            return MediaPlayer.create(context,R.raw.page_26);
        }else if (position==23){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==24){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==25){
            return MediaPlayer.create(context,R.raw.page_29);
        }else if (position==26){
            return MediaPlayer.create(context,R.raw.page_30);
        }else if (position==27){
            return MediaPlayer.create(context,R.raw.page_31);
        }else if (position==28){
            return MediaPlayer.create(context,R.raw.page_32);
        }else if (position==29){
            return MediaPlayer.create(context,R.raw.page_33);
        }else if (position==30){
            return MediaPlayer.create(context,R.raw.page_34);
        }else if (position==31){
            return MediaPlayer.create(context,R.raw.page_35);
        }else if (position==32){
            return MediaPlayer.create(context,R.raw.page_36);
        }else if (position==33){
            return MediaPlayer.create(context,R.raw.page_37);
        }else if (position==34){
            return MediaPlayer.create(context,R.raw.page_38);
        }else if (position==35){
            return MediaPlayer.create(context,R.raw.page_39);
        } else if (position==36){
            return MediaPlayer.create(context,R.raw.page_40);
        }else if (position==37){
            return MediaPlayer.create(context,R.raw.page_41);
        }else if (position==38){
            return MediaPlayer.create(context,R.raw.page_42);
        }else if (position==39){
            return MediaPlayer.create(context,R.raw.page_43);
        }else if (position==40){
            return MediaPlayer.create(context,R.raw.page_44);
        }else if (position==41){
            return MediaPlayer.create(context,R.raw.page_45);
        }else if (position==42){
            return MediaPlayer.create(context,R.raw.page_46);
        }else if (position==43){
            return MediaPlayer.create(context,R.raw.page_47);
        }else if (position==44){
            return MediaPlayer.create(context,R.raw.page_48);
        }else if (position==45){
            return MediaPlayer.create(context,R.raw.page_49);
        }else if (position==46){
            return MediaPlayer.create(context,R.raw.page_50);
        }else if (position==47){
            return MediaPlayer.create(context,R.raw.page_51);
        }else if (position==48){
            return MediaPlayer.create(context,R.raw.page_52);
        }else if (position==49){
            return MediaPlayer.create(context,R.raw.page_53);
        }else if (position==50){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==51){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==52){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==53){
            return MediaPlayer.create(context,R.raw.page_00);
        }else if (position==54){
            return MediaPlayer.create(context,R.raw.page_00);
        }  {
            return MediaPlayer.create(context, R.raw.page_00);
        }
    }

    public static String getPageTitle(int pageNum){
        switch (pageNum){
            case 0:
                return "مقدمة الشيخ محمد نادر خياطة";
            case 1:
                return "مقدمة الشيخ د.محمود زعتري";
            case 2:
                return "مقدمة الشيخ عمار مصطفى بازرباشي";
            case 3:
                return "مقدِّمةٌ تعريفيَّةٌ بالكتاب";
            case 4:
                return "مقدِّمةٌ تعريفيَّةٌ بالكتاب";
            case 5:
                return "مقدِّمةٌ تعريفيَّةٌ بالكتاب";
            case 6:
                return "دروس المرحلة الأولى";
            case 7:
                return "المخارج الخمسة الرَّئيسة وتمارين حروف الجوف";
            case 8:
                return "تمارين حروف الحَلْق";
            case 9:
                return "تمارين حروف اللِّسان";
            case 10:
                return "تمارين حروف الشَّفتَين والخَيْشوم";
            case 11:
                return "تمارين الحروف اللِّثَوِيَّة";
            case 12:
                return "تمارين حروف الهمس (1)";
            case 13:
                return "تمارين حروف الهمس (2)";
            case 14:
                return "التَّاءُ المبسوطةُ والتَّاءُ المَربوطة وتمارينهما";
            case 15:
                return "تمارين القلقلة (1)";
            case 16:
                return "تمارين القلقلة (2)";
            case 17:
                return "تمارين التفخيم (1)";
            case 18:
                return "تمارين التفخيم (2)";
            case 19:
                return "الحروف التي تَقبلُ التَّفخيمَ أو التَّرقيقَ";
            case 20:
                return "أحكام وتمارين لام اسم الجلالة (الله)";
            case 21:
                return "أحكام وتمارين الراء";
            case 22:
                return "اختبار المرحلة الأولى";
            case 23:
                return "شهادة نجاح باختبار المرحلة الأولى";
            case 24:
                return "دروس المرحلة الثانية";
            case 25:
                return "همزةُ الوصلِ في الأسماء";
            case 26:
                return "همزةُ الوصلِ في الأفعال";
            case 27:
                return "اللام القمرية وتمارينها (1)";
            case 28:
                return "اللام القمرية وتمارينها (2)";
            case 29:
                return "اللام الشَّمسية وتمارينها (1)";
            case 30:
                return "اللام الشَّمسية وتمارينها (2)";
            case 31:
                return "حروف المد مع أمثلة";
            case 32:
                return "تمارين حروف المدّ";
            case 33:
                return "حروف المد الصغيرة في الرسم القرآني";
            case 34:
                return "حالاتُ المدِّ الأصليِّ";
            case 35:
                return "المدُّ الفرعيُّ (1)";
            case 36:
                return "المدُّ الفرعيُّ (2)";
            case 37:
                return "الغُنَّةُ وتمارينُها";
            case 38:
                return "تمارين الغُنَّة (1)";
            case 39:
                return "تمارين الغُنَّة (2)";
            case 40:
                return "التَّنوينُ وتمارينُه";
            case 41:
                return "تمارين التَّنوين (1)";
            case 42:
                return "تمارين التَّنوين (2)";
            case 43:
                return "علاماتُ الوَقْف";
            case 44:
                return "علاماتُ الوَقفِ وعلامةُ السَّجدة";
            case 45:
                return "علاماتٌ متفرِّقةٌ";
            case 46:
                return "أمثلةٌ توضِّح الفروقات بين الرَّسْم العثماني والرَّسْم الإملائي";
            case 47:
                return "تمارين عامَّة من جزء عمَّ";
            case 48:
                return "اختبار (1)";
            case 49:
                return "اختبار (2)";
            case 50:
                return "شهادة نجاح باختبار كامل الكتاب";

            default: return null;


        }
    }


    public static void displayImageDrawable(Context context, ImageView img, @DrawableRes int drawable) {
        try {
            Glide.with(context).load(drawable)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(img);
        } catch (Exception e) {
        }
    }

    public static int getAudioFileByTitle(String buttonTile)
    {
        switch(buttonTile){

            case "page_11_1":
                return R.raw.page_11_1;
            case "page_11_2":
                return R.raw.page_11_2;
            case "page_11_3":
                return R.raw.page_11_3;
            case "page_12_1":
                return R.raw.page_12_1;
            case "page_12_2":
                return R.raw.page_12_2;
            case "page_12_3":
                return R.raw.page_12_3;
            case "page_12_4":
                return R.raw.page_12_4;
            case "page_12_5":
                return R.raw.page_12_5;
            case "page_12_6":
                return R.raw.page_12_6;
            case "page_13_1":
                return R.raw.page_13_1;
            case "page_13_2":
                return R.raw.page_13_2;
            case "page_13_3":
                return R.raw.page_13_3;
            case "page_13_4":
                return R.raw.page_13_4;
            case "page_13_5":
                return R.raw.page_13_5;
            case "page_13_6":
                return R.raw.page_13_6;
            case "page_13_7":
                return R.raw.page_13_7;
            case "page_13_8":
                return R.raw.page_13_8;
            case "page_13_9":
                return R.raw.page_13_9;
            case "page_13_10":
                return R.raw.page_13_10;
            case "page_13_11":
                return R.raw.page_13_11;
            case "page_13_12":
                return R.raw.page_13_12;
            case "page_13_13":
                return R.raw.page_13_13;
            case "page_13_14":
                return R.raw.page_13_14;
            case "page_13_15":
                return R.raw.page_13_15;
            case "page_13_16":
                return R.raw.page_13_16;
            case "page_13_17":
                return R.raw.page_13_17;
            case "page_13_18":
                return R.raw.page_13_18;
            case "page_14_1":
                return R.raw.page_14_1;
            case "page_14_2":
                return R.raw.page_14_2;
            case "page_14_3":
                return R.raw.page_14_3;
            case "page_14_4":
                return R.raw.page_14_4;
            case "page_14_5":
                return R.raw.page_14_5;
            case "page_14_6":
                return R.raw.page_14_6;
            case "page_15_1":
                return R.raw.page_15_1;
            case "page_15_2":
                return R.raw.page_15_2;
            case "page_15_3":
                return R.raw.page_15_3;
            case "page_15_4":
                return R.raw.page_15_4;
            case "page_15_5":
                return R.raw.page_15_5;
            case "page_15_6":
                return R.raw.page_15_6;
            case "page_15_7":
                return R.raw.page_15_7;
            case "page_15_8":
                return R.raw.page_15_8;
            case "page_15_9":
                return R.raw.page_15_9;
            case "page_15_10":
                return R.raw.page_15_10;
            case "page_15_11":
                return R.raw.page_15_11;
            case "page_15_12":
                return R.raw.page_15_12;
            case "page_15_13":
                return R.raw.page_15_13;
            case "page_15_14":
                return R.raw.page_15_14;
            case "page_15_15":
                return R.raw.page_15_15;
            case "page_15_16":
                return R.raw.page_15_16;
            case "page_15_17":
                return R.raw.page_15_17;
            case "page_15_18":
                return R.raw.page_15_18;
            case "page_16_1":
                return R.raw.page_16_1;
            case "page_16_2":
                return R.raw.page_16_2;
            case "page_16_3":
                return R.raw.page_16_3;
            case "page_16_4":
                return R.raw.page_16_4;
            case "page_16_5":
                return R.raw.page_16_5;
            case "page_16_6":
                return R.raw.page_16_6;
            case "page_16_7":
                return R.raw.page_16_7;
            case "page_16_8":
                return R.raw.page_16_8;
            case "page_16_9":
                return R.raw.page_16_9;
            case "page_16_10":
                return R.raw.page_16_10;
            case "page_16_11":
                return R.raw.page_16_11;
            case "page_16_12":
                return R.raw.page_16_12;
            case "page_16_13":
                return R.raw.page_16_13;
            case "page_16_14":
                return R.raw.page_16_14;
            case "page_16_15":
                return R.raw.page_16_15;
            case "page_16_16":
                return R.raw.page_16_16;
            case "page_17_1":
                return R.raw.page_17_1;
            case "page_17_2":
                return R.raw.page_17_2;
            case "page_17_3":
                return R.raw.page_17_3;
            case "page_17_4":
                return R.raw.page_17_4;
            case "page_17_5":
                return R.raw.page_17_5;
            case "page_17_6":
                return R.raw.page_17_6;
            case "page_17_7":
                return R.raw.page_17_7;
            case "page_17_8":
                return R.raw.page_17_8;
            case "page_17_9":
                return R.raw.page_17_9;
            case "page_17_10":
                return R.raw.page_17_10;
            case "page_17_11":
                return R.raw.page_17_11;
            case "page_17_12":
                return R.raw.page_17_12;
            case "page_17_13":
                return R.raw.page_17_13;
            case "page_17_14":
                return R.raw.page_17_14;
            case "page_17_15":
                return R.raw.page_17_15;
            case "page_17_16":
                return R.raw.page_17_16;
            case "page_17_17":
                return R.raw.page_17_17;
            case "page_17_18":
                return R.raw.page_17_18;
            case "page_17_19":
                return R.raw.page_17_19;
            case "page_17_20":
                return R.raw.page_17_20;
            case "page_17_21":
                return R.raw.page_17_21;
            case "page_17_22":
                return R.raw.page_17_22;
            case "page_17_23":
                return R.raw.page_17_23;
            case "page_17_24":
                return R.raw.page_17_24;
            case "page_17_25":
                return R.raw.page_17_25;
            case "page_17_26":
                return R.raw.page_17_26;
            case "page_17_27":
                return R.raw.page_17_27;
            case "page_17_28":
                return R.raw.page_17_28;
            case "page_17_29":
                return R.raw.page_17_29;
            case "page_17_30":
                return R.raw.page_17_30;
            case "page_17_31":
                return R.raw.page_17_31;
            case "page_17_32":
                return R.raw.page_17_32;
            case "page_17_33":
                return R.raw.page_17_33;
            case "page_18_1":
                return R.raw.page_18_1;
            case "page_18_2":
                return R.raw.page_18_2;
            case "page_18_3":
                return R.raw.page_18_3;
            case "page_18_4":
                return R.raw.page_18_4;
            case "page_18_5":
                return R.raw.page_18_5;
            case "page_18_6":
                return R.raw.page_18_6;
            case "page_18_7":
                return R.raw.page_18_7;
            case "page_18_8":
                return R.raw.page_18_8;
            case "page_18_9":
                return R.raw.page_18_9;
            case "page_18_10":
                return R.raw.page_18_10;
            case "page_18_11":
                return R.raw.page_18_11;
            case "page_18_12":
                return R.raw.page_18_12;
            case "page_18_13":
                return R.raw.page_18_13;
            case "page_18_14":
                return R.raw.page_18_14;
            case "page_18_15":
                return R.raw.page_18_15;
            case "page_18_16":
                return R.raw.page_18_16;
            case "page_18_17":
                return R.raw.page_18_17;
            case "page_18_18":
                return R.raw.page_18_18;
            case "page_18_19":
                return R.raw.page_18_19;
            case "page_18_20":
                return R.raw.page_18_20;
            case "page_18_21":
                return R.raw.page_18_21;
            case "page_18_22":
                return R.raw.page_18_22;
            case "page_18_23":
                return R.raw.page_18_23;
            case "page_18_24":
                return R.raw.page_18_24;
            case "page_18_25":
                return R.raw.page_18_25;
            case "page_19_1":
                return R.raw.page_19_1;
            case "page_19_2":
                return R.raw.page_19_2;
            case "page_19_3":
                return R.raw.page_19_3;
            case "page_19_4":
                return R.raw.page_19_4;
            case "page_19_5":
                return R.raw.page_19_5;
            case "page_19_6":
                return R.raw.page_19_6;
            case "page_19_7":
                return R.raw.page_19_7;
            case "page_19_8":
                return R.raw.page_19_8;
            case "page_19_9":
                return R.raw.page_19_9;
            case "page_19_10":
                return R.raw.page_19_10;
            case "page_19_11":
                return R.raw.page_19_11;
            case "page_19_12":
                return R.raw.page_19_12;
            case "page_20_1":
                return R.raw.page_20_1;
            case "page_20_2":
                return R.raw.page_20_2;
            case "page_20_3":
                return R.raw.page_20_3;
            case "page_20_4":
                return R.raw.page_20_4;
            case "page_20_5":
                return R.raw.page_20_5;
            case "page_20_6":
                return R.raw.page_20_6;
            case "page_20_7":
                return R.raw.page_20_7;
            case "page_20_8":
                return R.raw.page_20_8;
            case "page_20_9":
                return R.raw.page_20_9;
            case "page_20_10":
                return R.raw.page_20_10;
            case "page_20_11":
                return R.raw.page_20_11;
            case "page_20_12":
                return R.raw.page_20_12;
            case "page_20_13":
                return R.raw.page_20_13;
            case "page_20_14":
                return R.raw.page_20_14;
            case "page_20_15":
                return R.raw.page_20_15;
            case "page_20_16":
                return R.raw.page_20_16;
            case "page_20_17":
                return R.raw.page_20_17;
            case "page_20_18":
                return R.raw.page_20_18;
            case "page_20_19":
                return R.raw.page_20_19;
            case "page_20_20":
                return R.raw.page_20_20;
            case "page_20_21":
                return R.raw.page_20_21;
            case "page_20_22":
                return R.raw.page_20_22;
            case "page_20_23":
                return R.raw.page_20_23;
            case "page_20_24":
                return R.raw.page_20_24;
            case "page_21_1":
                return R.raw.page_21_1;
            case "page_21_2":
                return R.raw.page_21_2;
            case "page_21_3":
                return R.raw.page_21_3;
            case "page_21_4":
                return R.raw.page_21_4;
            case "page_21_5":
                return R.raw.page_21_5;
            case "page_21_6":
                return R.raw.page_21_6;
            case "page_21_7":
                return R.raw.page_21_7;
            case "page_21_8":
                return R.raw.page_21_8;
            case "page_21_9":
                return R.raw.page_21_9;
            case "page_21_10":
                return R.raw.page_21_10;
            case "page_21_11":
                return R.raw.page_21_11;
            case "page_21_12":
                return R.raw.page_21_12;
            case "page_22_1":
                return R.raw.page_22_1;
            case "page_22_2":
                return R.raw.page_22_2;
            case "page_22_3":
                return R.raw.page_22_3;
            case "page_22_4":
                return R.raw.page_22_4;
            case "page_22_5":
                return R.raw.page_22_5;
            case "page_22_6":
                return R.raw.page_22_6;
            case "page_22_7":
                return R.raw.page_22_7;
            case "page_22_8":
                return R.raw.page_22_8;
            case "page_22_9":
                return R.raw.page_22_9;
            case "page_22_10":
                return R.raw.page_22_10;
            case "page_22_11":
                return R.raw.page_22_11;
            case "page_22_12":
                return R.raw.page_22_12;
            case "page_22_13":
                return R.raw.page_22_13;
            case "page_22_14":
                return R.raw.page_22_14;
            case "page_22_15":
                return R.raw.page_22_15;
            case "page_22_16":
                return R.raw.page_22_16;
            case "page_22_17":
                return R.raw.page_22_17;
            case "page_22_18":
                return R.raw.page_22_18;
            case "page_22_19":
                return R.raw.page_22_19;
            case "page_22_20":
                return R.raw.page_22_20;
            case "page_22_21":
                return R.raw.page_22_21;
            case "page_22_22":
                return R.raw.page_22_22;
            case "page_22_23":
                return R.raw.page_22_23;
            case "page_22_24":
                return R.raw.page_22_24;
            case "page_22_25":
                return R.raw.page_22_25;
            case "page_23_1":
                return R.raw.page_23_1;
            case "page_23_2":
                return R.raw.page_23_2;
            case "page_23_3":
                return R.raw.page_23_3;
            case "page_23_4":
                return R.raw.page_23_4;
            case "page_23_5":
                return R.raw.page_23_5;
            case "page_23_6":
                return R.raw.page_23_6;
            case "page_23_7":
                return R.raw.page_23_7;
            case "page_23_8":
                return R.raw.page_23_8;
            case "page_23_9":
                return R.raw.page_23_9;
            case "page_23_10":
                return R.raw.page_23_10;
            case "page_23_11":
                return R.raw.page_23_11;
            case "page_23_12":
                return R.raw.page_23_12;
            case "page_23_13":
                return R.raw.page_23_13;
            case "page_23_14":
                return R.raw.page_23_14;
            case "page_23_15":
                return R.raw.page_23_15;
            case "page_23_16":
                return R.raw.page_23_16;
            case "page_23_17":
                return R.raw.page_23_17;
            case "page_24_1":
                return R.raw.page_24_1;
            case "page_24_2":
                return R.raw.page_24_2;
            case "page_24_3":
                return R.raw.page_24_3;
            case "page_24_4":
                return R.raw.page_24_4;
            case "page_24_5":
                return R.raw.page_24_5;
            case "page_24_6":
                return R.raw.page_24_6;
            case "page_24_7":
                return R.raw.page_24_7;
            case "page_24_8":
                return R.raw.page_24_8;
            case "page_24_9":
                return R.raw.page_24_9;
            case "page_24_10":
                return R.raw.page_24_10;
            case "page_24_11":
                return R.raw.page_24_11;
            case "page_24_12":
                return R.raw.page_24_12;
            case "page_24_13":
                return R.raw.page_24_13;
            case "page_24_14":
                return R.raw.page_24_14;
            case "page_24_15":
                return R.raw.page_24_15;
            case "page_24_16":
                return R.raw.page_24_16;
            case "page_24_17":
                return R.raw.page_24_17;
            case "page_25_1":
                return R.raw.page_25_1;
            case "page_25_2":
                return R.raw.page_25_2;
            case "page_25_3":
                return R.raw.page_25_3;
            case "page_25_4":
                return R.raw.page_25_4;
            case "page_25_5":
                return R.raw.page_25_5;
            case "page_25_6":
                return R.raw.page_25_6;
            case "page_25_7":
                return R.raw.page_25_7;
            case "page_25_8":
                return R.raw.page_25_8;
            case "page_25_9":
                return R.raw.page_25_9;
            case "page_25_10":
                return R.raw.page_25_10;
            case "page_25_11":
                return R.raw.page_25_11;
            case "page_25_12":
                return R.raw.page_25_12;
            case "page_25_13":
                return R.raw.page_25_13;
            case "page_25_14":
                return R.raw.page_25_14;
            case "page_25_15":
                return R.raw.page_25_15;
            case "page_25_16":
                return R.raw.page_25_16;
            case "page_25_17":
                return R.raw.page_25_17;
            case "page_25_18":
                return R.raw.page_25_18;
            case "page_25_19":
                return R.raw.page_25_19;
            case "page_25_20":
                return R.raw.page_25_20;
            case "page_25_21":
                return R.raw.page_25_21;
            case "page_25_22":
                return R.raw.page_25_22;
            case "page_25_23":
                return R.raw.page_25_23;
            case "page_26_1":
                return R.raw.page_26_1;
            case "page_26_2":
                return R.raw.page_26_2;
            case "page_26_3":
                return R.raw.page_26_3;
            case "page_26_4":
                return R.raw.page_26_4;
            case "page_26_5":
                return R.raw.page_26_5;
            case "page_26_6":
                return R.raw.page_26_6;
            case "page_26_7":
                return R.raw.page_26_7;
            case "page_29_1":
                return R.raw.page_29_1;
            case "page_29_2":
                return R.raw.page_29_2;
            case "page_29_3":
                return R.raw.page_29_3;
            case "page_29_4":
                return R.raw.page_29_4;
            case "page_29_5":
                return R.raw.page_29_5;
            case "page_29_6":
                return R.raw.page_29_6;
            case "page_29_7":
                return R.raw.page_29_7;
            case "page_29_8":
                return R.raw.page_29_8;
            case "page_29_9":
                return R.raw.page_29_9;
            case "page_29_10":
                return R.raw.page_29_10;
            case "page_29_11":
                return R.raw.page_29_11;
            case "page_29_12":
                return R.raw.page_29_12;
            case "page_29_13":
                return R.raw.page_29_13;
            case "page_29_14":
                return R.raw.page_29_14;
            case "page_29_15":
                return R.raw.page_29_15;
            case "page_29_16":
                return R.raw.page_29_16;
            case "page_30_1":
                return R.raw.page_30_1;
            case "page_30_2":
                return R.raw.page_30_2;
            case "page_30_3":
                return R.raw.page_30_3;
            case "page_30_4":
                return R.raw.page_30_4;
            case "page_30_5":
                return R.raw.page_30_5;
            case "page_30_6":
                return R.raw.page_30_6;
            case "page_30_7":
                return R.raw.page_30_7;
            case "page_30_8":
                return R.raw.page_30_8;
            case "page_30_9":
                return R.raw.page_30_9;
            case "page_30_10":
                return R.raw.page_30_10;
            case "page_30_11":
                return R.raw.page_30_11;
            case "page_30_12":
                return R.raw.page_30_12;
            case "page_30_13":
                return R.raw.page_30_13;
            case "page_30_14":
                return R.raw.page_30_14;
            case "page_30_15":
                return R.raw.page_30_15;
            case "page_30_16":
                return R.raw.page_30_16;
            case "page_30_17":
                return R.raw.page_30_17;
            case "page_30_18":
                return R.raw.page_30_18;
            case "page_30_19":
                return R.raw.page_30_19;
            case "page_30_20":
                return R.raw.page_30_20;
            case "page_30_21":
                return R.raw.page_30_21;
            case "page_30_22":
                return R.raw.page_30_22;
            case "page_30_23":
                return R.raw.page_30_23;
            case "page_30_24":
                return R.raw.page_30_24;
            case "page_31_1":
                return R.raw.page_31_1;
            case "page_31_2":
                return R.raw.page_31_2;
            case "page_31_3":
                return R.raw.page_31_3;
            case "page_31_4":
                return R.raw.page_31_4;
            case "page_31_5":
                return R.raw.page_31_5;
            case "page_31_6":
                return R.raw.page_31_6;
            case "page_31_7":
                return R.raw.page_31_7;
            case "page_31_8":
                return R.raw.page_31_8;
            case "page_31_9":
                return R.raw.page_31_9;
            case "page_31_10":
                return R.raw.page_31_10;
            case "page_31_11":
                return R.raw.page_31_11;
            case "page_31_12":
                return R.raw.page_31_12;
            case "page_32_1":
                return R.raw.page_32_1;
            case "page_32_2":
                return R.raw.page_32_2;
            case "page_32_3":
                return R.raw.page_32_3;
            case "page_32_4":
                return R.raw.page_32_4;
            case "page_32_5":
                return R.raw.page_32_5;
            case "page_32_6":
                return R.raw.page_32_6;
            case "page_32_7":
                return R.raw.page_32_7;
            case "page_32_8":
                return R.raw.page_32_8;
            case "page_32_9":
                return R.raw.page_32_9;
            case "page_32_10":
                return R.raw.page_32_10;
            case "page_32_11":
                return R.raw.page_32_11;
            case "page_32_12":
                return R.raw.page_32_12;
            case "page_32_13":
                return R.raw.page_32_13;
            case "page_32_14":
                return R.raw.page_32_14;
            case "page_32_15":
                return R.raw.page_32_15;
            case "page_32_16":
                return R.raw.page_32_16;
            case "page_32_17":
                return R.raw.page_32_17;
            case "page_32_18":
                return R.raw.page_32_18;
            case "page_32_19":
                return R.raw.page_32_19;
            case "page_32_20":
                return R.raw.page_32_20;
            case "page_32_21":
                return R.raw.page_32_21;
            case "page_32_22":
                return R.raw.page_32_22;
            case "page_33_1":
                return R.raw.page_33_1;
            case "page_33_2":
                return R.raw.page_33_2;
            case "page_33_3":
                return R.raw.page_33_3;
            case "page_33_4":
                return R.raw.page_33_4;
            case "page_33_5":
                return R.raw.page_33_5;
            case "page_33_6":
                return R.raw.page_33_6;
            case "page_33_7":
                return R.raw.page_33_7;
            case "page_33_8":
                return R.raw.page_33_8;
            case "page_33_9":
                return R.raw.page_33_9;
            case "page_33_10":
                return R.raw.page_33_10;
            case "page_33_11":
                return R.raw.page_33_11;
            case "page_33_12":
                return R.raw.page_33_12;
            case "page_33_13":
                return R.raw.page_33_13;
            case "page_33_14":
                return R.raw.page_33_14;
            case "page_33_15":
                return R.raw.page_33_15;
            case "page_33_16":
                return R.raw.page_33_16;
            case "page_34_1":
                return R.raw.page_34_1;
            case "page_34_2":
                return R.raw.page_34_2;
            case "page_34_3":
                return R.raw.page_34_3;
            case "page_34_4":
                return R.raw.page_34_4;
            case "page_34_5":
                return R.raw.page_34_5;
            case "page_34_6":
                return R.raw.page_34_6;
            case "page_34_7":
                return R.raw.page_34_7;
            case "page_34_8":
                return R.raw.page_34_8;
            case "page_34_9":
                return R.raw.page_34_9;
            case "page_34_10":
                return R.raw.page_34_10;
            case "page_34_11":
                return R.raw.page_34_11;
            case "page_34_12":
                return R.raw.page_34_12;
            case "page_34_13":
                return R.raw.page_34_13;
            case "page_34_14":
                return R.raw.page_34_14;
            case "page_34_15":
                return R.raw.page_34_15;
            case "page_34_16":
                return R.raw.page_34_16;
            case "page_34_17":
                return R.raw.page_34_17;
            case "page_34_18":
                return R.raw.page_34_18;
            case "page_34_19":
                return R.raw.page_34_19;
            case "page_34_20":
                return R.raw.page_34_20;
            case "page_34_21":
                return R.raw.page_34_21;
            case "page_34_22":
                return R.raw.page_34_22;
            case "page_34_23":
                return R.raw.page_34_23;
            case "page_34_24":
                return R.raw.page_34_24;
            case "page_34_25":
                return R.raw.page_34_25;
            case "page_35_1":
                return R.raw.page_35_1;
            case "page_35_2":
                return R.raw.page_35_2;
            case "page_35_3":
                return R.raw.page_35_3;
            case "page_35_4":
                return R.raw.page_35_4;
            case "page_35_5":
                return R.raw.page_35_5;
            case "page_35_6":
                return R.raw.page_35_6;
            case "page_35_7":
                return R.raw.page_35_7;
            case "page_36_1":
                return R.raw.page_36_1;
            case "page_36_2":
                return R.raw.page_36_2;
            case "page_36_3":
                return R.raw.page_36_3;
            case "page_36_4":
                return R.raw.page_36_4;
            case "page_36_5":
                return R.raw.page_36_5;
            case "page_36_6":
                return R.raw.page_36_6;
            case "page_36_7":
                return R.raw.page_36_7;
            case "page_36_8":
                return R.raw.page_36_8;
            case "page_36_9":
                return R.raw.page_36_9;
            case "page_36_10":
                return R.raw.page_36_10;
            case "page_36_11":
                return R.raw.page_36_11;
            case "page_36_12":
                return R.raw.page_36_12;
            case "page_36_13":
                return R.raw.page_36_13;
            case "page_36_14":
                return R.raw.page_36_14;
            case "page_36_15":
                return R.raw.page_36_15;
            case "page_36_16":
                return R.raw.page_36_16;
            case "page_36_17":
                return R.raw.page_36_17;
            case "page_37_1":
                return R.raw.page_37_1;
            case "page_37_2":
                return R.raw.page_37_2;
            case "page_37_3":
                return R.raw.page_37_3;
            case "page_37_4":
                return R.raw.page_37_4;
            case "page_37_5":
                return R.raw.page_37_5;
            case "page_37_6":
                return R.raw.page_37_6;
            case "page_37_7":
                return R.raw.page_37_7;
            case "page_37_8":
                return R.raw.page_37_8;
            case "page_37_9":
                return R.raw.page_37_9;
            case "page_37_10":
                return R.raw.page_37_10;
            case "page_37_11":
                return R.raw.page_37_11;
            case "page_37_12":
                return R.raw.page_37_12;
            case "page_37_13":
                return R.raw.page_37_13;
            case "page_37_14":
                return R.raw.page_37_14;
            case "page_37_15":
                return R.raw.page_37_15;
            case "page_38_1":
                return R.raw.page_38_1;
            case "page_38_2":
                return R.raw.page_38_2;
            case "page_38_3":
                return R.raw.page_38_3;
            case "page_38_4":
                return R.raw.page_38_4;
            case "page_38_5":
                return R.raw.page_38_5;
            case "page_38_6":
                return R.raw.page_38_6;
            case "page_38_7":
                return R.raw.page_38_7;
            case "page_38_8":
                return R.raw.page_38_8;
            case "page_38_9":
                return R.raw.page_38_9;
            case "page_38_10":
                return R.raw.page_38_10;
            case "page_38_11":
                return R.raw.page_38_11;
            case "page_38_12":
                return R.raw.page_38_12;
            case "page_38_13":
                return R.raw.page_38_13;
            case "page_38_14":
                return R.raw.page_38_14;
            case "page_38_15":
                return R.raw.page_38_15;
            case "page_38_16":
                return R.raw.page_38_16;
            case "page_38_17":
                return R.raw.page_38_17;
            case "page_38_18":
                return R.raw.page_38_18;
            case "page_38_19":
                return R.raw.page_38_19;
            case "page_38_20":
                return R.raw.page_38_20;
            case "page_38_21":
                return R.raw.page_38_21;
            case "page_38_22":
                return R.raw.page_38_22;
            case "page_38_23":
                return R.raw.page_38_23;
            case "page_39_1":
                return R.raw.page_39_1;
            case "page_39_2":
                return R.raw.page_39_2;
            case "page_39_3":
                return R.raw.page_39_3;
            case "page_39_4":
                return R.raw.page_39_4;
            case "page_39_5":
                return R.raw.page_39_5;
            case "page_39_6":
                return R.raw.page_39_6;
            case "page_39_7":
                return R.raw.page_39_7;
            case "page_39_8":
                return R.raw.page_39_8;
            case "page_39_9":
                return R.raw.page_39_9;
            case "page_39_10":
                return R.raw.page_39_10;
            case "page_39_11":
                return R.raw.page_39_11;
            case "page_39_12":
                return R.raw.page_39_12;
            case "page_39_13":
                return R.raw.page_39_13;
            case "page_39_14":
                return R.raw.page_39_14;
            case "page_39_15":
                return R.raw.page_39_15;
            case "page_39_16":
//                return R.raw.page_39_16;
//            case "page_39_17":
//                return R.raw.page_39_17;
            case "page_39_18":
                return R.raw.page_39_18;
            case "page_39_19":
                return R.raw.page_39_19;
            case "page_39_20":
                return R.raw.page_39_20;
            case "page_39_21":
                return R.raw.page_39_21;
            case "page_39_22":
                return R.raw.page_39_22;
            case "page_39_23":
                return R.raw.page_39_23;
            case "page_39_24":
                return R.raw.page_39_24;
            case "page_40_1":
                return R.raw.page_40_1;
            case "page_40_2":
                return R.raw.page_40_2;
            case "page_40_3":
                return R.raw.page_40_3;
            case "page_40_4":
                return R.raw.page_40_4;
            case "page_40_5":
                return R.raw.page_40_5;
            case "page_40_6":
                return R.raw.page_40_6;
            case "page_40_7":
                return R.raw.page_40_7;
            case "page_40_8":
                return R.raw.page_40_8;
            case "page_40_9":
                return R.raw.page_40_9;
            case "page_40_10":
                return R.raw.page_40_10;
            case "page_40_11":
                return R.raw.page_40_11;
            case "page_40_12":
                return R.raw.page_40_12;
            case "page_40_13":
                return R.raw.page_40_13;
            case "page_40_14":
                return R.raw.page_40_14;
            case "page_40_15":
                return R.raw.page_40_15;
            case "page_40_16":
                return R.raw.page_40_16;
            case "page_40_17":
                return R.raw.page_40_17;
            case "page_40_18":
                return R.raw.page_40_18;
            case "page_40_19":
                return R.raw.page_40_19;
            case "page_40_20":
                return R.raw.page_40_20;
            case "page_40_21":
                return R.raw.page_40_21;
            case "page_41_1":
                return R.raw.page_41_1;
            case "page_41_2":
                return R.raw.page_41_2;
            case "page_41_3":
                return R.raw.page_41_3;
            case "page_41_4":
                return R.raw.page_41_4;
            case "page_41_5":
                return R.raw.page_41_5;
            case "page_41_6":
                return R.raw.page_41_6;
            case "page_41_7":
                return R.raw.page_41_7;
            case "page_41_8":
                return R.raw.page_41_8;
            case "page_41_9":
                return R.raw.page_41_9;
            case "page_41_10":
                return R.raw.page_41_10;
            case "page_41_11":
                return R.raw.page_41_11;
            case "page_41_12":
                return R.raw.page_41_12;
            case "page_41_13":
                return R.raw.page_41_13;
            case "page_41_14":
                return R.raw.page_41_14;
            case "page_42_1":
                return R.raw.page_42_1;
            case "page_42_2":
                return R.raw.page_42_2;
            case "page_42_3":
                return R.raw.page_42_3;
            case "page_42_4":
                return R.raw.page_42_4;
            case "page_42_5":
                return R.raw.page_42_5;
            case "page_42_6":
                return R.raw.page_42_6;
            case "page_42_7":
                return R.raw.page_42_7;
            case "page_42_8":
                return R.raw.page_42_8;
            case "page_42_9":
                return R.raw.page_42_9;
            case "page_42_10":
                return R.raw.page_42_10;
            case "page_42_11":
                return R.raw.page_42_11;
            case "page_42_12":
                return R.raw.page_42_12;
            case "page_42_13":
                return R.raw.page_42_13;
            case "page_42_14":
                return R.raw.page_42_14;
            case "page_42_15":
                return R.raw.page_42_15;
            case "page_42_16":
                return R.raw.page_42_16;
            case "page_42_17":
                return R.raw.page_42_17;
            case "page_42_18":
                return R.raw.page_42_18;
            case "page_42_19":
                return R.raw.page_42_19;
            case "page_42_20":
                return R.raw.page_42_20;
            case "page_42_21":
                return R.raw.page_42_21;
            case "page_42_22":
                return R.raw.page_42_22;
            case "page_42_23":
                return R.raw.page_42_23;
            case "page_42_24":
                return R.raw.page_42_24;
            case "page_42_25":
                return R.raw.page_42_25;
            case "page_42_26":
                return R.raw.page_42_26;
            case "page_43_1":
                return R.raw.page_43_1;
            case "page_43_2":
                return R.raw.page_43_2;
            case "page_43_3":
                return R.raw.page_43_3;
            case "page_43_4":
                return R.raw.page_43_4;
            case "page_43_5":
                return R.raw.page_43_5;
            case "page_43_6":
                return R.raw.page_43_6;
            case "page_43_7":
                return R.raw.page_43_7;
            case "page_43_8":
                return R.raw.page_43_8;
            case "page_43_9":
                return R.raw.page_43_9;
            case "page_43_10":
                return R.raw.page_43_10;
            case "page_43_11":
                return R.raw.page_43_11;
            case "page_43_12":
                return R.raw.page_43_12;
            case "page_43_13":
                return R.raw.page_43_13;
            case "page_43_14":
                return R.raw.page_43_14;
            case "page_43_15":
                return R.raw.page_43_15;
            case "page_43_16":
                return R.raw.page_43_16;
            case "page_44_1":
                return R.raw.page_44_1;
            case "page_44_2":
                return R.raw.page_44_2;
            case "page_44_3":
                return R.raw.page_44_3;
            case "page_44_4":
                return R.raw.page_44_4;
            case "page_44_5":
                return R.raw.page_44_5;
            case "page_44_6":
                return R.raw.page_44_6;
            case "page_44_7":
                return R.raw.page_44_7;
            case "page_44_8":
                return R.raw.page_44_8;
            case "page_44_9":
                return R.raw.page_44_9;
            case "page_44_10":
                return R.raw.page_44_10;
            case "page_44_11":
                return R.raw.page_44_11;
            case "page_44_12":
                return R.raw.page_44_12;
            case "page_44_13":
                return R.raw.page_44_13;
            case "page_44_14":
                return R.raw.page_44_14;
            case "page_44_15":
                return R.raw.page_44_15;
            case "page_44_16":
                return R.raw.page_44_16;
            case "page_44_17":
                return R.raw.page_44_17;
            case "page_44_18":
                return R.raw.page_44_18;
            case "page_44_19":
                return R.raw.page_44_19;
            case "page_44_20":
                return R.raw.page_44_20;
            case "page_44_21":
                return R.raw.page_44_21;
            case "page_44_22":
                return R.raw.page_44_22;
            case "page_44_23":
                return R.raw.page_44_23;
            case "page_44_24":
                return R.raw.page_44_24;
            case "page_45_1":
                return R.raw.page_45_1;
            case "page_45_2":
                return R.raw.page_45_2;
            case "page_45_3":
                return R.raw.page_45_3;
            case "page_45_4":
                return R.raw.page_45_4;
            case "page_45_5":
                return R.raw.page_45_5;
            case "page_45_6":
                return R.raw.page_45_6;
            case "page_45_7":
                return R.raw.page_45_7;
            case "page_45_8":
                return R.raw.page_45_8;
            case "page_45_9":
                return R.raw.page_45_9;
            case "page_45_10":
                return R.raw.page_45_10;
            case "page_45_11":
                return R.raw.page_45_11;
            case "page_45_12":
                return R.raw.page_45_12;
            case "page_45_13":
                return R.raw.page_45_13;
            case "page_45_14":
                return R.raw.page_45_14;
            case "page_45_15":
                return R.raw.page_45_15;
            case "page_45_16":
                return R.raw.page_45_16;
            case "page_45_17":
                return R.raw.page_45_17;
            case "page_45_18":
                return R.raw.page_45_18;
            case "page_45_19":
                return R.raw.page_45_19;
            case "page_45_20":
                return R.raw.page_45_20;
            case "page_45_21":
                return R.raw.page_45_21;
            case "page_45_22":
                return R.raw.page_45_22;
            case "page_45_23":
                return R.raw.page_45_23;
            case "page_45_24":
                return R.raw.page_45_24;
            case "page_45_25":
                return R.raw.page_45_25;
            case "page_45_26":
                return R.raw.page_45_26;
            case "page_45_27":
                return R.raw.page_45_27;
            case "page_46_1":
                return R.raw.page_46_1;
            case "page_46_2":
                return R.raw.page_46_2;
            case "page_46_3":
                return R.raw.page_46_3;
            case "page_46_4":
                return R.raw.page_46_4;
            case "page_46_5":
                return R.raw.page_46_5;
            case "page_46_6":
                return R.raw.page_46_6;
            case "page_46_7":
                return R.raw.page_46_7;
            case "page_46_8":
                return R.raw.page_46_8;
            case "page_46_9":
                return R.raw.page_46_9;
            case "page_46_10":
                return R.raw.page_46_10;
            case "page_46_11":
                return R.raw.page_46_11;
            case "page_46_12":
                return R.raw.page_46_12;
            case "page_46_13":
                return R.raw.page_46_13;
            case "page_46_14":
                return R.raw.page_46_14;
            case "page_46_15":
                return R.raw.page_46_15;
            case "page_47_1":
                return R.raw.page_47_1;
            case "page_47_2":
                return R.raw.page_47_2;
            case "page_47_3":
                return R.raw.page_47_3;
            case "page_47_4":
                return R.raw.page_47_4;
            case "page_47_5":
                return R.raw.page_47_5;
            case "page_47_6":
                return R.raw.page_47_6;
            case "page_48_1":
                return R.raw.page_48_1;
            case "page_48_2":
                return R.raw.page_48_2;
            case "page_48_3":
                return R.raw.page_48_3;
            case "page_48_4":
                return R.raw.page_48_4;
            case "page_49_1":
                return R.raw.page_49_1;
            case "page_49_2":
                return R.raw.page_49_2;
            case "page_49_3":
                return R.raw.page_49_3;
            case "page_49_4":
                return R.raw.page_49_4;
            case "page_49_5":
                return R.raw.page_49_5;
            case "page_49_6":
                return R.raw.page_49_6;
            case "page_49_7":
                return R.raw.page_49_7;
            case "page_49_8":
                return R.raw.page_49_8;
            case "page_49_9":
                return R.raw.page_49_9;
            case "page_49_10":
                return R.raw.page_49_10;
            case "page_49_11":
                return R.raw.page_49_11;
            case "page_49_12":
                return R.raw.page_49_12;
            case "page_49_13":
                return R.raw.page_49_13;
            case "page_49_14":
                return R.raw.page_49_14;
            case "page_49_15":
                return R.raw.page_49_15;
            case "page_49_16":
                return R.raw.page_49_16;
            case "page_49_17":
                return R.raw.page_49_17;
            case "page_49_18":
                return R.raw.page_49_18;
            case "page_49_19":
                return R.raw.page_49_19;
            case "page_49_20":
                return R.raw.page_49_20;
            case "page_50_1":
                return R.raw.page_50_1;
            case "page_50_2":
                return R.raw.page_50_2;
            case "page_50_3":
                return R.raw.page_50_3;
            case "page_50_4":
                return R.raw.page_50_4;
            case "page_50_5":
                return R.raw.page_50_5;
            case "page_50_6":
                return R.raw.page_50_6;
            case "page_50_7":
                return R.raw.page_50_7;
            case "page_50_8":
                return R.raw.page_50_8;
            case "page_50_9":
                return R.raw.page_50_9;
            case "page_50_10":
                return R.raw.page_50_10;
            case "page_50_11":
                return R.raw.page_50_11;
            case "page_50_12":
                return R.raw.page_50_12;
            case "page_50_13":
                return R.raw.page_50_13;
            case "page_50_14":
                return R.raw.page_50_14;
            case "page_50_15":
                return R.raw.page_50_15;
            case "page_50_16":
                return R.raw.page_50_16;
            case "page_50_17":
                return R.raw.page_50_17;
            case "page_50_18":
                return R.raw.page_50_18;
            case "page_50_19":
                return R.raw.page_50_19;
            case "page_50_20":
                return R.raw.page_50_20;
            case "page_50_21":
                return R.raw.page_50_21;
            case "page_50_22":
                return R.raw.page_50_22;
            case "page_51_1":
                return R.raw.page_51_1;
            case "page_51_2":
                return R.raw.page_51_2;
            case "page_51_3":
                return R.raw.page_51_3;
            case "page_51_4":
                return R.raw.page_51_4;
            case "page_51_5":
                return R.raw.page_51_5;
            case "page_51_6":
                return R.raw.page_51_6;
            case "page_51_7":
                return R.raw.page_51_7;
            case "page_51_8":
                return R.raw.page_51_8;
            case "page_51_9":
                return R.raw.page_51_9;
            case "page_51_10":
                return R.raw.page_51_10;
            case "page_51_11":
                return R.raw.page_51_11;
            case "page_51_12":
                return R.raw.page_51_12;
            case "page_51_13":
                return R.raw.page_51_13;
            case "page_51_14":
                return R.raw.page_51_14;
            case "page_51_15":
                return R.raw.page_51_15;
            case "page_51_16":
                return R.raw.page_51_16;
            case "page_51_17":
                return R.raw.page_51_17;
            case "page_51_18":
                return R.raw.page_51_18;
            case "page_51_19":
                return R.raw.page_51_19;
            case "page_51_20":
                return R.raw.page_51_20;
            case "page_51_21":
                return R.raw.page_51_21;
            case "page_51_22":
                return R.raw.page_51_22;
            case "page_51_23":
                return R.raw.page_51_23;
            case "page_51_24":
                return R.raw.page_51_24;
            case "page_51_25":
                return R.raw.page_51_25;
            case "page_51_26":
                return R.raw.page_51_26;
            case "page_52_1":
                return R.raw.page_52_1;
            case "page_52_2":
                return R.raw.page_52_2;
            case "page_52_3":
                return R.raw.page_52_3;
            case "page_53_1":
                return R.raw.page_53_1;
            case "page_53_2":
                return R.raw.page_53_2;
            case "page_53_3":
                return R.raw.page_53_3;
            case "page_53_4":
                return R.raw.page_53_4;
            case "page_53_5":
                return R.raw.page_53_5;
            default: return R.raw.cleck_00;
}
    }
}
