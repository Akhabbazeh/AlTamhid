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

public class Page_49 extends BaseFragment {
    FrameLayout frameLayout_page_49;
    private PageInterface pageInterface;
    private View page_49_1;
    private View page_49_2;
    private View page_49_3;
    private View page_49_4;
    private View page_49_5;
    private View page_49_6;
    private View page_49_7;
    private View page_49_8;
    private View page_49_9;
    private View page_49_10;
    private View page_49_11;
    private View page_49_12;
    private View page_49_13;
    private View page_49_14;
    private View page_49_15;
    private View page_49_16;
    private View page_49_17;
    private View page_49_18;


    public Page_49() {

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
        View page_49 = LayoutInflater.from(getContext()).inflate(R.layout.page_49, container, false);
        frameLayout_page_49=page_49.findViewById(R.id.frameLayout_page_49);
        page_49_1 = page_49.findViewById(R.id.page_49_1);
        page_49_2 = page_49.findViewById(R.id.page_49_2);
        page_49_3 = page_49.findViewById(R.id.page_49_3);
        page_49_4 = page_49.findViewById(R.id.page_49_4);
        page_49_5 = page_49.findViewById(R.id.page_49_5);
        page_49_6 = page_49.findViewById(R.id.page_49_6);
        page_49_7 = page_49.findViewById(R.id.page_49_7);
        page_49_8 = page_49.findViewById(R.id.page_49_8);
        page_49_9 = page_49.findViewById(R.id.page_49_9);
        page_49_10 = page_49.findViewById(R.id.page_49_10);
        page_49_11 = page_49.findViewById(R.id.page_49_11);
        page_49_12 = page_49.findViewById(R.id.page_49_12);
        page_49_13 = page_49.findViewById(R.id.page_49_13);
        page_49_14 = page_49.findViewById(R.id.page_49_14);
        page_49_15 = page_49.findViewById(R.id.page_49_15);
        page_49_16 = page_49.findViewById(R.id.page_49_16);
        page_49_17 = page_49.findViewById(R.id.page_49_17);
        page_49_18 = page_49.findViewById(R.id.page_49_18);



        setOnLongClickListener();


        return page_49;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_49_1) {
                pageInterface.OnLongClickListeners("page_49_1");
            }
            else if (v.getId() == R.id.page_49_2) {
                pageInterface.OnLongClickListeners("page_49_2");
            }
            else if (v.getId() == R.id.page_49_3) {
                pageInterface.OnLongClickListeners("page_49_3");
            }
            else if (v.getId() == R.id.page_49_4) {
                pageInterface.OnLongClickListeners("page_49_4");
            }
            else if (v.getId() == R.id.page_49_5) {
                pageInterface.OnLongClickListeners("page_49_5");
            }
            else if (v.getId() == R.id.page_49_6) {
                pageInterface.OnLongClickListeners("page_49_6");
            }
            else if (v.getId() == R.id.page_49_7) {
                pageInterface.OnLongClickListeners("page_49_7");
            }
            else if (v.getId() == R.id.page_49_8) {
                pageInterface.OnLongClickListeners("page_49_8");
            }
            else if (v.getId() == R.id.page_49_9) {
                pageInterface.OnLongClickListeners("page_49_9");
            }
            else if (v.getId() == R.id.page_49_10) {
                pageInterface.OnLongClickListeners("page_49_10");
            }
            else if (v.getId() == R.id.page_49_11) {
                pageInterface.OnLongClickListeners("page_49_11");
            }
            else if (v.getId() == R.id.page_49_12) {
                pageInterface.OnLongClickListeners("page_49_12");
            }
            else if (v.getId() == R.id.page_49_13) {
                pageInterface.OnLongClickListeners("page_49_13");
            }
            else if (v.getId() == R.id.page_49_14) {
                pageInterface.OnLongClickListeners("page_49_14");
            }
            else if (v.getId() == R.id.page_49_15) {
                pageInterface.OnLongClickListeners("page_49_15");
            }
            else if (v.getId() == R.id.page_49_16) {
                pageInterface.OnLongClickListeners("page_49_16");
            }
            else if (v.getId() == R.id.page_49_17) {
                pageInterface.OnLongClickListeners("page_49_17");
            }
            else if (v.getId() == R.id.page_49_18) {
                pageInterface.OnLongClickListeners("page_49_18");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_49_1.setOnLongClickListener(listener);
        page_49_2.setOnLongClickListener(listener);
        page_49_3.setOnLongClickListener(listener);
        page_49_4.setOnLongClickListener(listener);
        page_49_5.setOnLongClickListener(listener);
        page_49_6.setOnLongClickListener(listener);
        page_49_7.setOnLongClickListener(listener);
        page_49_8.setOnLongClickListener(listener);
        page_49_9.setOnLongClickListener(listener);
        page_49_10.setOnLongClickListener(listener);
        page_49_11.setOnLongClickListener(listener);
        page_49_12.setOnLongClickListener(listener);
        page_49_13.setOnLongClickListener(listener);
        page_49_14.setOnLongClickListener(listener);
        page_49_15.setOnLongClickListener(listener);
        page_49_16.setOnLongClickListener(listener);
        page_49_17.setOnLongClickListener(listener);
        page_49_18.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_49.requestLayout();
    }
}