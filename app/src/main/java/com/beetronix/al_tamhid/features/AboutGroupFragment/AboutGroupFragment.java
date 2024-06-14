package com.beetronix.al_tamhid.features.AboutGroupFragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.util.Tool;
import com.example.myapplication.features.ui.BaseFragment;

import java.util.ArrayList;
import java.util.List;


public class AboutGroupFragment extends BaseFragment {
    private ImageView ButtonBack;
    private ImageView background_page_user_guide;
    private RecyclerView RecyclerView_About_Group;
    private RecyclewAdapterAboutGroup adapterAboutGroup;
    private List<BeAboutGroup> beAboutGroups;
    public AboutGroupFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_5 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_about_group, container, false);
        setNotificationBarColor(R.color.primary_color);

        ButtonBack = view_5.findViewById(R.id.ButtonBack);
        RecyclerView_About_Group = view_5.findViewById(R.id.RecyclerView_About_Group);
        background_page_user_guide = view_5.findViewById(R.id.background_page_user_guide);
        Tool.displayImageDrawable(getContext(),background_page_user_guide,R.drawable.background_page);
        Tool.displayImageDrawable(getContext(),ButtonBack,R.drawable.ic_arrow_right);
        ButtonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        initRecycleViewCart();
        return view_5;
    }


    private void initRecycleViewCart(){
        beAboutGroups = new ArrayList<>();
        beAboutGroups.add(new BeAboutGroup(R.drawable.img_01,"التمهيد لتعليم الكتابة العربية (المستوى الأول)"));
        beAboutGroups.add(new BeAboutGroup(R.drawable.img_02,"التمهيد لتعليم الكتابة العربية (المستوى الثاني)"));
        beAboutGroups.add(new BeAboutGroup(R.drawable.img_03,"التمهيد للقراءة العربية"));
        beAboutGroups.add(new BeAboutGroup(R.drawable.img_04,"مختصر التمهيد للقراءة العربية"));
        beAboutGroups.add(new BeAboutGroup(R.drawable.img_05,"تفسير مفردات جزء عم"));
        beAboutGroups.add(new BeAboutGroup(R.drawable.img_06,"أخبرني عن الإيمان"));
        beAboutGroups.add(new BeAboutGroup(R.drawable.img_07,"مختارات من الأحاديث والأذكار النبوية"));
        beAboutGroups.add(new BeAboutGroup(R.drawable.img_08,"تفسيرٌ لبعض مفردات القرآن الكريم"));
        beAboutGroups.add(new BeAboutGroup(R.drawable.img_09,"التمهيدُ لتلاوة القرآن المجيد"));


        adapterAboutGroup = new RecyclewAdapterAboutGroup(getContext() , beAboutGroups);
        RecyclerView_About_Group.setAdapter(adapterAboutGroup);
        RecyclerView_About_Group.setHasFixedSize(true);
        RecyclerView_About_Group.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false));
    }




}
