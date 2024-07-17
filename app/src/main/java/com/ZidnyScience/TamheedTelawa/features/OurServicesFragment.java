package com.ZidnyScience.TamheedTelawa.features;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ZidnyScience.TamheedTelawa.R;
import com.ZidnyScience.TamheedTelawa.util.Tool;
import com.example.myapplication.features.ui.BaseFragment;


public class OurServicesFragment extends BaseFragment {
    ImageView ButtonBack;
    private ImageView img_background_content;
    private ImageView img_logo_app_authors;
    private ImageView btn_go_to_whatsapp;
    private LinearLayout btn_go_to_whatsapp_layout;
    public OurServicesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_4 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_our_services, container, false);
        setNotificationBarColor(R.color.primary_color);


        ButtonBack = view_4.findViewById(R.id.ButtonBack);
        img_background_content = view_4.findViewById(R.id.img_background_content);
        img_logo_app_authors = view_4.findViewById(R.id.img_logo_app_authors);
        btn_go_to_whatsapp = view_4.findViewById(R.id.btn_go_to_whatsapp);
        btn_go_to_whatsapp_layout = view_4.findViewById(R.id.btn_go_to_whatsapp_layout);

       // Tool.displayImageDrawable(getContext(),img_background_content,R.drawable.background_page);
        Tool.displayImageDrawable(getContext(),btn_go_to_whatsapp,R.drawable.whatsapp_icon);
        Tool.displayImageDrawable(getContext(),ButtonBack,R.drawable.ic_arrow_right);
        Tool.displayImageDrawable(getContext(),img_logo_app_authors,R.drawable.bsem_allah_img);

        ButtonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        btn_go_to_whatsapp_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/+963968346818"));
                getContext().startActivity(intent);
            }
        });

        return view_4;
    }



}
