package com.ZidnyScience.TamheedTelawa.features.AboutGroupFragment;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ZidnyScience.TamheedTelawa.R;
import com.ZidnyScience.TamheedTelawa.features.about_book.aboutBookFragment;
import com.ZidnyScience.TamheedTelawa.util.Tool;
import com.example.myapplication.features.ui.BaseFragment;

import java.util.ArrayList;
import java.util.List;


public class AboutGroupFragment extends BaseFragment {
    private ImageView ButtonBack;
    private ImageView background_page_user_guide;
    private RecyclerView RecyclerView_About_Group;
    private AdapterGroup adapterAboutGroup;
    private List<BeAboutGroup> beAboutGroups;
    private ImageView img_logo_app_about_group;
    private ImageView img_logo_app_about_group_2;
    private ImageView btn_go_to_Telegram;
    public AboutGroupFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_5 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_about_group, container, false);
        setNotificationBarColor(R.color.primary_color);

        ButtonBack = view_5.findViewById(R.id.ButtonBack);
        RecyclerView_About_Group = view_5.findViewById(R.id.RecyclerView_About_Group);
        background_page_user_guide = view_5.findViewById(R.id.background_page_user_guide);
        img_logo_app_about_group = view_5.findViewById(R.id.img_logo_app_about_group);
        img_logo_app_about_group_2 = view_5.findViewById(R.id.img_logo_app_about_group_2);
        btn_go_to_Telegram = view_5.findViewById(R.id.btn_go_to_Telegram);
       // Tool.displayImageDrawable(getContext(),background_page_user_guide,R.drawable.background_page);
        Tool.displayImageDrawable(getContext(),ButtonBack,R.drawable.ic_arrow_right);
        Tool.displayImageDrawable(getContext(),img_logo_app_about_group,R.drawable.bsem_allah_img);
        Tool.displayImageDrawable(getContext(),img_logo_app_about_group_2,R.drawable.title_group_book);

        ButtonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        btn_go_to_Telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;

                try {
                    try {
                        getContext().getPackageManager().getPackageInfo("org.telegram.messenger", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        getContext().getPackageManager().getPackageInfo("org.thunderdog.challegram", 0);
                    }
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/zidnyscience"));
                    getContext().startActivity(intent);

                } catch (PackageManager.NameNotFoundException e) {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/zidnyscience"));
                    getContext().startActivity(intent);
                }
            }
        });

        initRecycleViewCart();
        return view_5;
    }


    private void initRecycleViewCart(){
        beAboutGroups = new ArrayList<>();
        beAboutGroups.add(new BeAboutGroup(1,R.drawable.img_03,"1- التمهيد للقراءة العربية","https://t.me/Atmhed"));
        beAboutGroups.add(new BeAboutGroup(2,R.drawable.img_01,"2- التمهيد لتعليم الكتابة العربية (المستوى الأول)","https://t.me/zidnyscience"));
        beAboutGroups.add(new BeAboutGroup(3,R.drawable.img_02,"3- التمهيد لتعليم الكتابة العربية (المستوى الثاني)","https://t.me/zidnyscience"));
        beAboutGroups.add(new BeAboutGroup(4,R.drawable.img_08,"4- تفسيرٌ لبعض مفردات القرآن الكريم","https://t.me/zidnyscience"));
        beAboutGroups.add(new BeAboutGroup(5,R.drawable.img_07,"5- مختارات من الأحاديث والأذكار النبوية","https://t.me/zidnyscience"));
        beAboutGroups.add(new BeAboutGroup(6,R.drawable.img_05,"6- تفسير مفردات جزء عم","https://t.me/zidnyscience"));
        beAboutGroups.add(new BeAboutGroup(7,R.drawable.img_06,"7- أخبرني عن الإيمان","https://t.me/Akhberni_iman"));
        beAboutGroups.add(new BeAboutGroup(8,R.drawable.img_04,"8- مختصر التمهيد للقراءة العربية","https://t.me/Atmhed2"));
        beAboutGroups.add(new BeAboutGroup(9,R.drawable.img_09,"9- التمهيدُ لتلاوة القرآن المجيد","https://t.me/tamheed_Quran"));



        adapterAboutGroup = new AdapterGroup(getContext() , beAboutGroups);
        RecyclerView_About_Group.setLayoutManager(new GridLayoutManager(getContext(),3));
        RecyclerView_About_Group.setAdapter(adapterAboutGroup);
        RecyclerView_About_Group.setAdapter(adapterAboutGroup);

        adapterAboutGroup.setBookClickListener(new AdapterGroup.OnBookClickListener() {
            @Override
            public void OnBookClickListener(int book_number) {
                aboutBookFragment aboutBookFragment = new aboutBookFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("Position" , book_number);
                aboutBookFragment.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .replace(R.id.FrameLayout_main_activity, aboutBookFragment ,"aboutBookFragment")
                        .addToBackStack("aboutBookFragment")
                        .commit();

            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @Override
    public void onPause() {
        super.onResume();
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_USER);

}
}
