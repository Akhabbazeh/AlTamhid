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

public class Page_38 extends BaseFragment {
    FrameLayout frameLayout_page_38;
    private PageInterface pageInterface;
    private View page_38_1;
    private View page_38_2;
    private View page_38_3;
    private View page_38_4;
    private View page_38_5;
    private View page_38_6;
    private View page_38_7;
    private View page_38_8;
    private View page_38_9;
    private View page_38_10;
    private View page_38_11;
    private View page_38_12;
    private View page_38_13;
    private View page_38_14;
    private View page_38_15;
    private View page_38_16;
    private View page_38_17;
    private View page_38_18;
    private View page_38_19;
    private View page_38_20;


    public Page_38() {

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
        View page_38 = LayoutInflater.from(getContext()).inflate(R.layout.page_38, container, false);
        frameLayout_page_38=page_38.findViewById(R.id.frameLayout_page_38);
        page_38_1 = page_38.findViewById(R.id.page_38_1);
        page_38_2 = page_38.findViewById(R.id.page_38_2);
        page_38_3 = page_38.findViewById(R.id.page_38_3);
        page_38_4 = page_38.findViewById(R.id.page_38_4);
        page_38_5 = page_38.findViewById(R.id.page_38_5);
        page_38_6 = page_38.findViewById(R.id.page_38_6);
        page_38_7 = page_38.findViewById(R.id.page_38_7);
        page_38_8 = page_38.findViewById(R.id.page_38_8);
        page_38_9 = page_38.findViewById(R.id.page_38_9);
        page_38_10 = page_38.findViewById(R.id.page_38_10);
        page_38_11 = page_38.findViewById(R.id.page_38_11);
        page_38_12 = page_38.findViewById(R.id.page_38_12);
        page_38_13 = page_38.findViewById(R.id.page_38_13);
        page_38_14 = page_38.findViewById(R.id.page_38_14);
        page_38_15 = page_38.findViewById(R.id.page_38_15);
        page_38_16 = page_38.findViewById(R.id.page_38_16);
        page_38_17 = page_38.findViewById(R.id.page_38_17);
        page_38_18 = page_38.findViewById(R.id.page_38_18);
        page_38_19 = page_38.findViewById(R.id.page_38_19);
        page_38_20 = page_38.findViewById(R.id.page_38_20);



        setOnLongClickListener();


        return page_38;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_38_1) {
                pageInterface.OnLongClickListeners("page_38_1");
            }
            else if (v.getId() == R.id.page_38_2) {
                pageInterface.OnLongClickListeners("page_38_2");
            }
            else if (v.getId() == R.id.page_38_3) {
                pageInterface.OnLongClickListeners("page_38_3");
            }
            else if (v.getId() == R.id.page_38_4) {
                pageInterface.OnLongClickListeners("page_38_4");
            }
            else if (v.getId() == R.id.page_38_5) {
                pageInterface.OnLongClickListeners("page_38_5");
            }
            else if (v.getId() == R.id.page_38_6) {
                pageInterface.OnLongClickListeners("page_38_6");
            }
            else if (v.getId() == R.id.page_38_7) {
                pageInterface.OnLongClickListeners("page_38_7");
            }
            else if (v.getId() == R.id.page_38_8) {
                pageInterface.OnLongClickListeners("page_38_8");
            }
            else if (v.getId() == R.id.page_38_9) {
                pageInterface.OnLongClickListeners("page_38_9");
            }
            else if (v.getId() == R.id.page_38_10) {
                pageInterface.OnLongClickListeners("page_38_10");
            }
            else if (v.getId() == R.id.page_38_11) {
                pageInterface.OnLongClickListeners("page_38_11");
            }
            else if (v.getId() == R.id.page_38_12) {
                pageInterface.OnLongClickListeners("page_38_12");
            }
            else if (v.getId() == R.id.page_38_13) {
                pageInterface.OnLongClickListeners("page_38_13");
            }
            else if (v.getId() == R.id.page_38_14) {
                pageInterface.OnLongClickListeners("page_38_14");
            }
            else if (v.getId() == R.id.page_38_15) {
                pageInterface.OnLongClickListeners("page_38_15");
            }
            else if (v.getId() == R.id.page_38_16) {
                pageInterface.OnLongClickListeners("page_38_16");
            }
            else if (v.getId() == R.id.page_38_17) {
                pageInterface.OnLongClickListeners("page_38_17");
            }
            else if (v.getId() == R.id.page_38_18) {
                pageInterface.OnLongClickListeners("page_38_18");
            }
            else if (v.getId() == R.id.page_38_19) {
                pageInterface.OnLongClickListeners("page_38_19");
            }
            else if (v.getId() == R.id.page_38_20) {
                pageInterface.OnLongClickListeners("page_38_20");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_38_1.setOnLongClickListener(listener);
        page_38_2.setOnLongClickListener(listener);
        page_38_3.setOnLongClickListener(listener);
        page_38_4.setOnLongClickListener(listener);
        page_38_5.setOnLongClickListener(listener);
        page_38_6.setOnLongClickListener(listener);
        page_38_7.setOnLongClickListener(listener);
        page_38_8.setOnLongClickListener(listener);
        page_38_9.setOnLongClickListener(listener);
        page_38_10.setOnLongClickListener(listener);
        page_38_11.setOnLongClickListener(listener);
        page_38_12.setOnLongClickListener(listener);
        page_38_13.setOnLongClickListener(listener);
        page_38_14.setOnLongClickListener(listener);
        page_38_15.setOnLongClickListener(listener);
        page_38_16.setOnLongClickListener(listener);
        page_38_17.setOnLongClickListener(listener);
        page_38_18.setOnLongClickListener(listener);
        page_38_19.setOnLongClickListener(listener);
        page_38_20.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_38.requestLayout();
    }
}