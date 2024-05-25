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

public class Page_41 extends BaseFragment {
    FrameLayout frameLayout_page_41;
    private PageInterface pageInterface;
    private View page_41_1;
    private View page_41_2;
    private View page_41_3;
    private View page_41_4;
    private View page_41_5;
    private View page_41_6;
    private View page_41_7;
    private View page_41_8;
    private View page_41_9;
    private View page_41_10;
    private View page_41_11;
    private View page_41_12;
    private View page_41_13;
    private View page_41_14;


    public Page_41() {

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
        View page_41 = LayoutInflater.from(getContext()).inflate(R.layout.page_41, container, false);
        frameLayout_page_41=page_41.findViewById(R.id.frameLayout_page_41);
        page_41_1 = page_41.findViewById(R.id.page_41_1);
        page_41_2 = page_41.findViewById(R.id.page_41_2);
        page_41_3 = page_41.findViewById(R.id.page_41_3);
        page_41_4 = page_41.findViewById(R.id.page_41_4);
        page_41_5 = page_41.findViewById(R.id.page_41_5);
        page_41_6 = page_41.findViewById(R.id.page_41_6);
        page_41_7 = page_41.findViewById(R.id.page_41_7);
        page_41_8 = page_41.findViewById(R.id.page_41_8);
        page_41_9 = page_41.findViewById(R.id.page_41_9);
        page_41_10 = page_41.findViewById(R.id.page_41_10);
        page_41_11 = page_41.findViewById(R.id.page_41_11);
        page_41_12 = page_41.findViewById(R.id.page_41_12);
        page_41_13 = page_41.findViewById(R.id.page_41_13);
        page_41_14 = page_41.findViewById(R.id.page_41_14);



        setOnLongClickListener();


        return page_41;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_41_1) {
                pageInterface.OnLongClickListeners("page_41_1");
            }
            else if (v.getId() == R.id.page_41_2) {
                pageInterface.OnLongClickListeners("page_41_2");
            }
            else if (v.getId() == R.id.page_41_3) {
                pageInterface.OnLongClickListeners("page_41_3");
            }
            else if (v.getId() == R.id.page_41_4) {
                pageInterface.OnLongClickListeners("page_41_4");
            }
            else if (v.getId() == R.id.page_41_5) {
                pageInterface.OnLongClickListeners("page_41_5");
            }
            else if (v.getId() == R.id.page_41_6) {
                pageInterface.OnLongClickListeners("page_41_6");
            }
            else if (v.getId() == R.id.page_41_7) {
                pageInterface.OnLongClickListeners("page_41_7");
            }
            else if (v.getId() == R.id.page_41_8) {
                pageInterface.OnLongClickListeners("page_41_8");
            }
            else if (v.getId() == R.id.page_41_9) {
                pageInterface.OnLongClickListeners("page_41_9");
            }
            else if (v.getId() == R.id.page_41_10) {
                pageInterface.OnLongClickListeners("page_41_10");
            }
            else if (v.getId() == R.id.page_41_11) {
                pageInterface.OnLongClickListeners("page_41_11");
            }
            else if (v.getId() == R.id.page_41_12) {
                pageInterface.OnLongClickListeners("page_41_12");
            }
            else if (v.getId() == R.id.page_41_13) {
                pageInterface.OnLongClickListeners("page_41_13");
            }
            else if (v.getId() == R.id.page_41_14) {
                pageInterface.OnLongClickListeners("page_41_14");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_41_1.setOnLongClickListener(listener);
        page_41_2.setOnLongClickListener(listener);
        page_41_3.setOnLongClickListener(listener);
        page_41_4.setOnLongClickListener(listener);
        page_41_5.setOnLongClickListener(listener);
        page_41_6.setOnLongClickListener(listener);
        page_41_7.setOnLongClickListener(listener);
        page_41_8.setOnLongClickListener(listener);
        page_41_9.setOnLongClickListener(listener);
        page_41_10.setOnLongClickListener(listener);
        page_41_11.setOnLongClickListener(listener);
        page_41_12.setOnLongClickListener(listener);
        page_41_13.setOnLongClickListener(listener);
        page_41_14.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_41.requestLayout();
    }
}