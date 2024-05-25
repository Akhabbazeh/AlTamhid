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

public class Page_25 extends BaseFragment {
    FrameLayout frameLayout_page_25;
    private PageInterface pageInterface;
    private View page_25_1;
    private View page_25_2;
    private View page_25_3;
    private View page_25_4;
    private View page_25_5;
    private View page_25_6;
    private View page_25_7;
    private View page_25_8;
    private View page_25_9;
    private View page_25_10;
    private View page_25_11;
    private View page_25_12;
    private View page_25_13;
    private View page_25_14;
    private View page_25_15;
    private View page_25_16;
    private View page_25_17;
    private View page_25_18;
    private View page_25_19;
    private View page_25_20;
    private View page_25_21;
    private View page_25_22;
    private View page_25_23;


    public Page_25() {

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
        View page_25 = LayoutInflater.from(getContext()).inflate(R.layout.page_25, container, false);
        frameLayout_page_25=page_25.findViewById(R.id.frameLayout_page_25);
        page_25_1 = page_25.findViewById(R.id.page_25_1);
        page_25_2 = page_25.findViewById(R.id.page_25_2);
        page_25_3 = page_25.findViewById(R.id.page_25_3);
        page_25_4 = page_25.findViewById(R.id.page_25_4);
        page_25_5 = page_25.findViewById(R.id.page_25_5);
        page_25_6 = page_25.findViewById(R.id.page_25_6);
        page_25_7 = page_25.findViewById(R.id.page_25_7);
        page_25_8 = page_25.findViewById(R.id.page_25_8);
        page_25_9 = page_25.findViewById(R.id.page_25_9);
        page_25_10 = page_25.findViewById(R.id.page_25_10);
        page_25_11 = page_25.findViewById(R.id.page_25_11);
        page_25_12 = page_25.findViewById(R.id.page_25_12);
        page_25_13 = page_25.findViewById(R.id.page_25_13);
        page_25_14 = page_25.findViewById(R.id.page_25_14);
        page_25_15 = page_25.findViewById(R.id.page_25_15);
        page_25_16 = page_25.findViewById(R.id.page_25_16);
        page_25_17 = page_25.findViewById(R.id.page_25_17);
        page_25_18 = page_25.findViewById(R.id.page_25_18);
        page_25_19 = page_25.findViewById(R.id.page_25_19);
        page_25_20 = page_25.findViewById(R.id.page_25_20);
        page_25_21 = page_25.findViewById(R.id.page_25_21);
        page_25_22 = page_25.findViewById(R.id.page_25_22);
        page_25_23 = page_25.findViewById(R.id.page_25_23);



        setOnLongClickListener();


        return page_25;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_25_1) {
                pageInterface.OnLongClickListeners("page_25_1");
            }
            else if (v.getId() == R.id.page_25_2) {
                pageInterface.OnLongClickListeners("page_25_2");
            }
            else if (v.getId() == R.id.page_25_3) {
                pageInterface.OnLongClickListeners("page_25_3");
            }
            else if (v.getId() == R.id.page_25_4) {
                pageInterface.OnLongClickListeners("page_25_4");
            }
            else if (v.getId() == R.id.page_25_5) {
                pageInterface.OnLongClickListeners("page_25_5");
            }
            else if (v.getId() == R.id.page_25_6) {
                pageInterface.OnLongClickListeners("page_25_6");
            }
            else if (v.getId() == R.id.page_25_7) {
                pageInterface.OnLongClickListeners("page_25_7");
            }
            else if (v.getId() == R.id.page_25_8) {
                pageInterface.OnLongClickListeners("page_25_8");
            }
            else if (v.getId() == R.id.page_25_9) {
                pageInterface.OnLongClickListeners("page_25_9");
            }
            else if (v.getId() == R.id.page_25_10) {
                pageInterface.OnLongClickListeners("page_25_10");
            }
            else if (v.getId() == R.id.page_25_11) {
                pageInterface.OnLongClickListeners("page_25_11");
            }
            else if (v.getId() == R.id.page_25_12) {
                pageInterface.OnLongClickListeners("page_25_12");
            }
            else if (v.getId() == R.id.page_25_13) {
                pageInterface.OnLongClickListeners("page_25_13");
            }
            else if (v.getId() == R.id.page_25_14) {
                pageInterface.OnLongClickListeners("page_25_14");
            }
            else if (v.getId() == R.id.page_25_15) {
                pageInterface.OnLongClickListeners("page_25_15");
            }
            else if (v.getId() == R.id.page_25_16) {
                pageInterface.OnLongClickListeners("page_25_16");
            }
            else if (v.getId() == R.id.page_25_17) {
                pageInterface.OnLongClickListeners("page_25_17");
            }
            else if (v.getId() == R.id.page_25_18) {
                pageInterface.OnLongClickListeners("page_25_18");
            }
            else if (v.getId() == R.id.page_25_19) {
                pageInterface.OnLongClickListeners("page_25_19");
            }
            else if (v.getId() == R.id.page_25_20) {
                pageInterface.OnLongClickListeners("page_25_20");
            }
            else if (v.getId() == R.id.page_25_21) {
                pageInterface.OnLongClickListeners("page_25_21");
            }
            else if (v.getId() == R.id.page_25_22) {
                pageInterface.OnLongClickListeners("page_25_22");
            }
            else if (v.getId() == R.id.page_25_23) {
                pageInterface.OnLongClickListeners("page_25_23");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_25_1.setOnLongClickListener(listener);
        page_25_2.setOnLongClickListener(listener);
        page_25_3.setOnLongClickListener(listener);
        page_25_4.setOnLongClickListener(listener);
        page_25_5.setOnLongClickListener(listener);
        page_25_6.setOnLongClickListener(listener);
        page_25_7.setOnLongClickListener(listener);
        page_25_8.setOnLongClickListener(listener);
        page_25_9.setOnLongClickListener(listener);
        page_25_10.setOnLongClickListener(listener);
        page_25_11.setOnLongClickListener(listener);
        page_25_12.setOnLongClickListener(listener);
        page_25_13.setOnLongClickListener(listener);
        page_25_14.setOnLongClickListener(listener);
        page_25_15.setOnLongClickListener(listener);
        page_25_16.setOnLongClickListener(listener);
        page_25_17.setOnLongClickListener(listener);
        page_25_18.setOnLongClickListener(listener);
        page_25_19.setOnLongClickListener(listener);
        page_25_20.setOnLongClickListener(listener);
        page_25_21.setOnLongClickListener(listener);
        page_25_22.setOnLongClickListener(listener);
        page_25_23.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_25.requestLayout();
    }
}