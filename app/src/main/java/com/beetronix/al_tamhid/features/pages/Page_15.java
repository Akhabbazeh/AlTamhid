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

public class Page_15 extends BaseFragment {
    FrameLayout frameLayout_page_15;
    private PageInterface pageInterface;
    private LayoutInflater textCounterLayout;
    private View page_15_1;
    private View page_15_2;
    private View page_15_3;
    private View page_15_4;
    private View page_15_5;
    private View page_15_6;
    private View page_15_7;
    private View page_15_8;
    private View page_15_9;
    private View page_15_10;
    private View page_15_11;
    private View page_15_12;
    private View page_15_13;
    private View page_15_14;
    private View page_15_15;
    private View page_15_16;
    private View page_15_17;
    private View page_15_18;

    public Page_15() {

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
        View page_15 = LayoutInflater.from(getContext()).inflate(R.layout.page_15, container, false);
        frameLayout_page_15=page_15.findViewById(R.id.frameLayout_page_15);
        page_15_1 = page_15.findViewById(R.id.page_15_1);
        page_15_2 = page_15.findViewById(R.id.page_15_2);
        page_15_3 = page_15.findViewById(R.id.page_15_3);
        page_15_4 = page_15.findViewById(R.id.page_15_4);
        page_15_5 = page_15.findViewById(R.id.page_15_5);
        page_15_6 = page_15.findViewById(R.id.page_15_6);
        page_15_7 = page_15.findViewById(R.id.page_15_7);
        page_15_8 = page_15.findViewById(R.id.page_15_8);
        page_15_9 = page_15.findViewById(R.id.page_15_9);
        page_15_10 = page_15.findViewById(R.id.page_15_10);
        page_15_11 = page_15.findViewById(R.id.page_15_11);
        page_15_12 = page_15.findViewById(R.id.page_15_12);
        page_15_13 = page_15.findViewById(R.id.page_15_13);
        page_15_14 = page_15.findViewById(R.id.page_15_14);
        page_15_15 = page_15.findViewById(R.id.page_15_15);
        page_15_16 = page_15.findViewById(R.id.page_15_16);
        page_15_17 = page_15.findViewById(R.id.page_15_17);
        page_15_18 = page_15.findViewById(R.id.page_15_18);


        setOnLongClickListener();


        return page_15;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {

            if (v.getId() == R.id.page_15_1) {
                pageInterface.OnLongClickListeners("page_15_1");
            }
            else if (v.getId() == R.id.page_15_2) {
                pageInterface.OnLongClickListeners("page_15_2");
            }
            else if (v.getId() == R.id.page_15_3) {
                pageInterface.OnLongClickListeners("page_15_3");
            }
            else if (v.getId() == R.id.page_15_4) {
                pageInterface.OnLongClickListeners("page_15_4");
            }
            else if (v.getId() == R.id.page_15_5) {
                pageInterface.OnLongClickListeners("page_15_5");
            }
            else if (v.getId() == R.id.page_15_6) {
                pageInterface.OnLongClickListeners("page_15_6");
            }
            else if (v.getId() == R.id.page_15_7) {
                pageInterface.OnLongClickListeners("page_15_7");
            }
            else if (v.getId() == R.id.page_15_8) {
                pageInterface.OnLongClickListeners("page_15_8");
            }
            else if (v.getId() == R.id.page_15_9) {
                pageInterface.OnLongClickListeners("page_15_9");
            }
            else if (v.getId() == R.id.page_15_10) {
                pageInterface.OnLongClickListeners("page_15_10");
            }
            else if (v.getId() == R.id.page_15_11) {
                pageInterface.OnLongClickListeners("page_15_11");
            }
            else if (v.getId() == R.id.page_15_12) {
                pageInterface.OnLongClickListeners("page_15_12");
            }
            else if (v.getId() == R.id.page_15_13) {
                pageInterface.OnLongClickListeners("page_15_13");
            }
            else if (v.getId() == R.id.page_15_14) {
                pageInterface.OnLongClickListeners("page_15_14");
            }
            else if (v.getId() == R.id.page_15_15) {
                pageInterface.OnLongClickListeners("page_15_15");
            }
            else if (v.getId() == R.id.page_15_16) {
                pageInterface.OnLongClickListeners("page_15_16");
            }
            else if (v.getId() == R.id.page_15_17) {
                pageInterface.OnLongClickListeners("page_15_17");
            }
            else if (v.getId() == R.id.page_15_18) {
                pageInterface.OnLongClickListeners("page_15_18");
            }

            return true;
        }
    };
   private void setOnLongClickListener(){
       page_15_1.setOnLongClickListener(listener);
       page_15_2.setOnLongClickListener(listener);
       page_15_3.setOnLongClickListener(listener);
       page_15_4.setOnLongClickListener(listener);
       page_15_5.setOnLongClickListener(listener);
       page_15_6.setOnLongClickListener(listener);
       page_15_7.setOnLongClickListener(listener);
       page_15_8.setOnLongClickListener(listener);
       page_15_9.setOnLongClickListener(listener);
       page_15_10.setOnLongClickListener(listener);
       page_15_11.setOnLongClickListener(listener);
       page_15_12.setOnLongClickListener(listener);
       page_15_13.setOnLongClickListener(listener);
       page_15_14.setOnLongClickListener(listener);
       page_15_15.setOnLongClickListener(listener);
       page_15_16.setOnLongClickListener(listener);
       page_15_17.setOnLongClickListener(listener);
       page_15_18.setOnLongClickListener(listener);


    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_15.requestLayout();
    }
}