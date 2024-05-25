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

public class Page_46 extends BaseFragment {
    FrameLayout frameLayout_page_46;
    private PageInterface pageInterface;
    private View page_46_1;
    private View page_46_2;
    private View page_46_3;
    private View page_46_4;
    private View page_46_5;
    private View page_46_6;
    private View page_46_7;
    private View page_46_8;
    private View page_46_9;
    private View page_46_10;
    private View page_46_11;
    private View page_46_12;
    private View page_46_13;
    private View page_46_14;
    private View page_46_15;


    public Page_46() {

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
        View page_46 = LayoutInflater.from(getContext()).inflate(R.layout.page_46, container, false);
        frameLayout_page_46=page_46.findViewById(R.id.frameLayout_page_46);
        page_46_1 = page_46.findViewById(R.id.page_46_1);
        page_46_2 = page_46.findViewById(R.id.page_46_2);
        page_46_3 = page_46.findViewById(R.id.page_46_3);
        page_46_4 = page_46.findViewById(R.id.page_46_4);
        page_46_5 = page_46.findViewById(R.id.page_46_5);
        page_46_6 = page_46.findViewById(R.id.page_46_6);
        page_46_7 = page_46.findViewById(R.id.page_46_7);
        page_46_8 = page_46.findViewById(R.id.page_46_8);
        page_46_9 = page_46.findViewById(R.id.page_46_9);
        page_46_10 = page_46.findViewById(R.id.page_46_10);
        page_46_11 = page_46.findViewById(R.id.page_46_11);
        page_46_12 = page_46.findViewById(R.id.page_46_12);
        page_46_13 = page_46.findViewById(R.id.page_46_13);
        page_46_14 = page_46.findViewById(R.id.page_46_14);
        page_46_15 = page_46.findViewById(R.id.page_46_15);



        setOnLongClickListener();


        return page_46;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_46_1) {
                pageInterface.OnLongClickListeners("page_46_1");
            }
            else if (v.getId() == R.id.page_46_2) {
                pageInterface.OnLongClickListeners("page_46_2");
            }
            else if (v.getId() == R.id.page_46_3) {
                pageInterface.OnLongClickListeners("page_46_3");
            }
            else if (v.getId() == R.id.page_46_4) {
                pageInterface.OnLongClickListeners("page_46_4");
            }
            else if (v.getId() == R.id.page_46_5) {
                pageInterface.OnLongClickListeners("page_46_5");
            }
            else if (v.getId() == R.id.page_46_6) {
                pageInterface.OnLongClickListeners("page_46_6");
            }
            else if (v.getId() == R.id.page_46_7) {
                pageInterface.OnLongClickListeners("page_46_7");
            }
            else if (v.getId() == R.id.page_46_8) {
                pageInterface.OnLongClickListeners("page_46_8");
            }
            else if (v.getId() == R.id.page_46_9) {
                pageInterface.OnLongClickListeners("page_46_9");
            }
            else if (v.getId() == R.id.page_46_10) {
                pageInterface.OnLongClickListeners("page_46_10");
            }
            else if (v.getId() == R.id.page_46_11) {
                pageInterface.OnLongClickListeners("page_46_11");
            }
            else if (v.getId() == R.id.page_46_12) {
                pageInterface.OnLongClickListeners("page_46_12");
            }
            else if (v.getId() == R.id.page_46_13) {
                pageInterface.OnLongClickListeners("page_46_13");
            }
            else if (v.getId() == R.id.page_46_14) {
                pageInterface.OnLongClickListeners("page_46_14");
            }
            else if (v.getId() == R.id.page_46_15) {
                pageInterface.OnLongClickListeners("page_46_15");
            }



            return true;
        }
    };
    private void setOnLongClickListener(){
        page_46_1.setOnLongClickListener(listener);
        page_46_2.setOnLongClickListener(listener);
        page_46_3.setOnLongClickListener(listener);
        page_46_4.setOnLongClickListener(listener);
        page_46_5.setOnLongClickListener(listener);
        page_46_6.setOnLongClickListener(listener);
        page_46_7.setOnLongClickListener(listener);
        page_46_8.setOnLongClickListener(listener);
        page_46_9.setOnLongClickListener(listener);
        page_46_10.setOnLongClickListener(listener);
        page_46_11.setOnLongClickListener(listener);
        page_46_12.setOnLongClickListener(listener);
        page_46_13.setOnLongClickListener(listener);
        page_46_14.setOnLongClickListener(listener);
        page_46_15.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_46.requestLayout();
    }
}