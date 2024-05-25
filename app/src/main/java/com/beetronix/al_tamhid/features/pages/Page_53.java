package com.beetronix.al_tamhid.features.pages;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.features.PageInterface;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_53 extends BaseFragment {
    FrameLayout frameLayout_page_53;
    private PageInterface pageInterface;
    private View page_53_1;
    private View page_53_2;
    private View page_53_3;
    private View page_53_4;
    private View page_53_5;


    public Page_53() {

    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            pageInterface = (PageInterface) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement TextClicked");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_53 = LayoutInflater.from(getContext()).inflate(R.layout.page_53, container, false);
        frameLayout_page_53=page_53.findViewById(R.id.frameLayout_page_53);
        page_53_1 = page_53.findViewById(R.id.page_53_1);
        page_53_2 = page_53.findViewById(R.id.page_53_2);
        page_53_3 = page_53.findViewById(R.id.page_53_3);
        page_53_4 = page_53.findViewById(R.id.page_53_4);
        page_53_5 = page_53.findViewById(R.id.page_53_5);



        setOnLongClickListener();


        return page_53;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_53_1) {
                pageInterface.OnLongClickListeners("page_53_1");
            }
            else if (v.getId() == R.id.page_53_2) {
                pageInterface.OnLongClickListeners("page_53_2");
            }
            else if (v.getId() == R.id.page_53_3) {
                pageInterface.OnLongClickListeners("page_53_3");
            }
            else if (v.getId() == R.id.page_53_4) {
                pageInterface.OnLongClickListeners("page_53_4");
            }
            else if (v.getId() == R.id.page_53_5) {
                pageInterface.OnLongClickListeners("page_53_5");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_53_1.setOnLongClickListener(listener);
        page_53_2.setOnLongClickListener(listener);
        page_53_3.setOnLongClickListener(listener);
        page_53_4.setOnLongClickListener(listener);
        page_53_5.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_53.requestLayout();
    }
}