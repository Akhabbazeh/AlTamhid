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

public class Page_19 extends BaseFragment {
    FrameLayout frameLayout_page_19;
    private PageInterface pageInterface;
    private View page_19_1;
    private View page_19_2;
    private View page_19_3;
    private View page_19_4;
    private View page_19_5;
    private View page_19_6;
    private View page_19_7;
    private View page_19_8;
    private View page_19_9;
    private View page_19_10;
    private View page_19_11;
    private View page_19_12;


    public Page_19() {

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
        View page_19 = LayoutInflater.from(getContext()).inflate(R.layout.page_19, container, false);
        frameLayout_page_19=page_19.findViewById(R.id.frameLayout_page_19);
        page_19_1 = page_19.findViewById(R.id.page_19_1);
        page_19_2 = page_19.findViewById(R.id.page_19_2);
        page_19_3 = page_19.findViewById(R.id.page_19_3);
        page_19_4 = page_19.findViewById(R.id.page_19_4);
        page_19_5 = page_19.findViewById(R.id.page_19_5);
        page_19_6 = page_19.findViewById(R.id.page_19_6);
        page_19_7 = page_19.findViewById(R.id.page_19_7);
        page_19_8 = page_19.findViewById(R.id.page_19_8);
        page_19_9 = page_19.findViewById(R.id.page_19_9);
        page_19_10 = page_19.findViewById(R.id.page_19_10);
        page_19_11 = page_19.findViewById(R.id.page_19_11);
        page_19_12 = page_19.findViewById(R.id.page_19_12);



        setOnLongClickListener();


        return page_19;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_19_1) {
                pageInterface.OnLongClickListeners("page_19_1");
            }
            else if (v.getId() == R.id.page_19_2) {
                pageInterface.OnLongClickListeners("page_19_2");
            }
            else if (v.getId() == R.id.page_19_3) {
                pageInterface.OnLongClickListeners("page_19_3");
            }
            else if (v.getId() == R.id.page_19_4) {
                pageInterface.OnLongClickListeners("page_19_4");
            }
            else if (v.getId() == R.id.page_19_5) {
                pageInterface.OnLongClickListeners("page_19_5");
            }
            else if (v.getId() == R.id.page_19_6) {
                pageInterface.OnLongClickListeners("page_19_6");
            }
            else if (v.getId() == R.id.page_19_7) {
                pageInterface.OnLongClickListeners("page_19_7");
            }
            else if (v.getId() == R.id.page_19_8) {
                pageInterface.OnLongClickListeners("page_19_8");
            }
            else if (v.getId() == R.id.page_19_9) {
                pageInterface.OnLongClickListeners("page_19_9");
            }
            else if (v.getId() == R.id.page_19_10) {
                pageInterface.OnLongClickListeners("page_19_10");
            }
            else if (v.getId() == R.id.page_19_11) {
                pageInterface.OnLongClickListeners("page_19_11");
            }
            else if (v.getId() == R.id.page_19_12) {
                pageInterface.OnLongClickListeners("page_19_12");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_19_1.setOnLongClickListener(listener);
        page_19_2.setOnLongClickListener(listener);
        page_19_3.setOnLongClickListener(listener);
        page_19_4.setOnLongClickListener(listener);
        page_19_5.setOnLongClickListener(listener);
        page_19_6.setOnLongClickListener(listener);
        page_19_7.setOnLongClickListener(listener);
        page_19_8.setOnLongClickListener(listener);
        page_19_9.setOnLongClickListener(listener);
        page_19_10.setOnLongClickListener(listener);
        page_19_11.setOnLongClickListener(listener);
        page_19_12.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_19.requestLayout();
    }
}