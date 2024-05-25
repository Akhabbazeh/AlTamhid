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

public class Page_31 extends BaseFragment {
    FrameLayout frameLayout_page_31;
    private PageInterface pageInterface;
    private View page_31_1;
    private View page_31_2;
    private View page_31_3;
    private View page_31_4;
    private View page_31_5;
    private View page_31_6;
    private View page_31_7;
    private View page_31_8;
    private View page_31_9;
    private View page_31_10;
    private View page_31_11;
    private View page_31_12;


    public Page_31() {

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
        View page_31 = LayoutInflater.from(getContext()).inflate(R.layout.page_31, container, false);
        frameLayout_page_31=page_31.findViewById(R.id.frameLayout_page_31);
        page_31_1 = page_31.findViewById(R.id.page_31_1);
        page_31_2 = page_31.findViewById(R.id.page_31_2);
        page_31_3 = page_31.findViewById(R.id.page_31_3);
        page_31_4 = page_31.findViewById(R.id.page_31_4);
        page_31_5 = page_31.findViewById(R.id.page_31_5);
        page_31_6 = page_31.findViewById(R.id.page_31_6);
        page_31_7 = page_31.findViewById(R.id.page_31_7);
        page_31_8 = page_31.findViewById(R.id.page_31_8);
        page_31_9 = page_31.findViewById(R.id.page_31_9);
        page_31_10 = page_31.findViewById(R.id.page_31_10);
        page_31_11 = page_31.findViewById(R.id.page_31_11);
        page_31_12 = page_31.findViewById(R.id.page_31_12);



        setOnLongClickListener();


        return page_31;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_31_1) {
                pageInterface.OnLongClickListeners("page_31_1");
            }
            else if (v.getId() == R.id.page_31_2) {
                pageInterface.OnLongClickListeners("page_31_2");
            }
            else if (v.getId() == R.id.page_31_3) {
                pageInterface.OnLongClickListeners("page_31_3");
            }
            else if (v.getId() == R.id.page_31_4) {
                pageInterface.OnLongClickListeners("page_31_4");
            }
            else if (v.getId() == R.id.page_31_5) {
                pageInterface.OnLongClickListeners("page_31_5");
            }
            else if (v.getId() == R.id.page_31_6) {
                pageInterface.OnLongClickListeners("page_31_6");
            }
            else if (v.getId() == R.id.page_31_7) {
                pageInterface.OnLongClickListeners("page_31_7");
            }
            else if (v.getId() == R.id.page_31_8) {
                pageInterface.OnLongClickListeners("page_31_8");
            }
            else if (v.getId() == R.id.page_31_9) {
                pageInterface.OnLongClickListeners("page_31_9");
            }
            else if (v.getId() == R.id.page_31_10) {
                pageInterface.OnLongClickListeners("page_31_10");
            }
            else if (v.getId() == R.id.page_31_11) {
                pageInterface.OnLongClickListeners("page_31_11");
            }
            else if (v.getId() == R.id.page_31_12) {
                pageInterface.OnLongClickListeners("page_31_12");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_31_1.setOnLongClickListener(listener);
        page_31_2.setOnLongClickListener(listener);
        page_31_3.setOnLongClickListener(listener);
        page_31_4.setOnLongClickListener(listener);
        page_31_5.setOnLongClickListener(listener);
        page_31_6.setOnLongClickListener(listener);
        page_31_7.setOnLongClickListener(listener);
        page_31_8.setOnLongClickListener(listener);
        page_31_9.setOnLongClickListener(listener);
        page_31_10.setOnLongClickListener(listener);
        page_31_11.setOnLongClickListener(listener);
        page_31_12.setOnLongClickListener(listener);


    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_31.requestLayout();
    }
}