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

public class Page_20 extends BaseFragment {
    FrameLayout frameLayout_page_20;
    private PageInterface pageInterface;
    private View page_20_1;
    private View page_20_2;
    private View page_20_3;
    private View page_20_4;
    private View page_20_5;
    private View page_20_6;
    private View page_20_7;
    private View page_20_8;
    private View page_20_9;
    private View page_20_10;
    private View page_20_11;
    private View page_20_12;
    private View page_20_13;
    private View page_20_14;
    private View page_20_15;
    private View page_20_16;
    private View page_20_17;
    private View page_20_18;
    private View page_20_19;
    private View page_20_20;
    private View page_20_21;
    private View page_20_22;
    private View page_20_23;
    private View page_20_24;


    public Page_20() {

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
        View page_20 = LayoutInflater.from(getContext()).inflate(R.layout.page_20, container, false);
        frameLayout_page_20=page_20.findViewById(R.id.frameLayout_page_20);
        page_20_1 = page_20.findViewById(R.id.page_20_1);
        page_20_2 = page_20.findViewById(R.id.page_20_2);
        page_20_3 = page_20.findViewById(R.id.page_20_3);
        page_20_4 = page_20.findViewById(R.id.page_20_4);
        page_20_5 = page_20.findViewById(R.id.page_20_5);
        page_20_6 = page_20.findViewById(R.id.page_20_6);
        page_20_7 = page_20.findViewById(R.id.page_20_7);
        page_20_8 = page_20.findViewById(R.id.page_20_8);
        page_20_9 = page_20.findViewById(R.id.page_20_9);
        page_20_10 = page_20.findViewById(R.id.page_20_10);
        page_20_11 = page_20.findViewById(R.id.page_20_11);
        page_20_12 = page_20.findViewById(R.id.page_20_12);
        page_20_13 = page_20.findViewById(R.id.page_20_13);
        page_20_14 = page_20.findViewById(R.id.page_20_14);
        page_20_15 = page_20.findViewById(R.id.page_20_15);
        page_20_16 = page_20.findViewById(R.id.page_20_16);
        page_20_17 = page_20.findViewById(R.id.page_20_17);
        page_20_18 = page_20.findViewById(R.id.page_20_18);
        page_20_19 = page_20.findViewById(R.id.page_20_19);
        page_20_20 = page_20.findViewById(R.id.page_20_20);
        page_20_21 = page_20.findViewById(R.id.page_20_21);
        page_20_22 = page_20.findViewById(R.id.page_20_22);
        page_20_23 = page_20.findViewById(R.id.page_20_23);
        page_20_24 = page_20.findViewById(R.id.page_20_24);



        setOnLongClickListener();


        return page_20;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_20_1) {
                pageInterface.OnLongClickListeners("page_20_1");
            }
            else if (v.getId() == R.id.page_20_2) {
                pageInterface.OnLongClickListeners("page_20_2");
            }
            else if (v.getId() == R.id.page_20_3) {
                pageInterface.OnLongClickListeners("page_20_3");
            }
            else if (v.getId() == R.id.page_20_4) {
                pageInterface.OnLongClickListeners("page_20_4");
            }
            else if (v.getId() == R.id.page_20_5) {
                pageInterface.OnLongClickListeners("page_20_5");
            }
            else if (v.getId() == R.id.page_20_6) {
                pageInterface.OnLongClickListeners("page_20_6");
            }
            else if (v.getId() == R.id.page_20_7) {
                pageInterface.OnLongClickListeners("page_20_7");
            }
            else if (v.getId() == R.id.page_20_8) {
                pageInterface.OnLongClickListeners("page_20_8");
            }
            else if (v.getId() == R.id.page_20_9) {
                pageInterface.OnLongClickListeners("page_20_9");
            }
            else if (v.getId() == R.id.page_20_10) {
                pageInterface.OnLongClickListeners("page_20_10");
            }
            else if (v.getId() == R.id.page_20_11) {
                pageInterface.OnLongClickListeners("page_20_11");
            }
            else if (v.getId() == R.id.page_20_12) {
                pageInterface.OnLongClickListeners("page_20_12");
            }
            else if (v.getId() == R.id.page_20_13) {
                pageInterface.OnLongClickListeners("page_20_13");
            }
            else if (v.getId() == R.id.page_20_14) {
                pageInterface.OnLongClickListeners("page_20_14");
            }
            else if (v.getId() == R.id.page_20_15) {
                pageInterface.OnLongClickListeners("page_20_15");
            }
            else if (v.getId() == R.id.page_20_16) {
                pageInterface.OnLongClickListeners("page_20_16");
            }
            else if (v.getId() == R.id.page_20_17) {
                pageInterface.OnLongClickListeners("page_20_17");
            }
            else if (v.getId() == R.id.page_20_18) {
                pageInterface.OnLongClickListeners("page_20_18");
            }
            else if (v.getId() == R.id.page_20_19) {
                pageInterface.OnLongClickListeners("page_20_19");
            }
            else if (v.getId() == R.id.page_20_20) {
                pageInterface.OnLongClickListeners("page_20_20");
            }
            else if (v.getId() == R.id.page_20_21) {
                pageInterface.OnLongClickListeners("page_20_21");
            }
            else if (v.getId() == R.id.page_20_22) {
                pageInterface.OnLongClickListeners("page_20_22");
            }
            else if (v.getId() == R.id.page_20_23) {
                pageInterface.OnLongClickListeners("page_20_23");
            }
            else if (v.getId() == R.id.page_20_24) {
                pageInterface.OnLongClickListeners("page_20_24");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_20_1.setOnLongClickListener(listener);
        page_20_2.setOnLongClickListener(listener);
        page_20_3.setOnLongClickListener(listener);
        page_20_4.setOnLongClickListener(listener);
        page_20_5.setOnLongClickListener(listener);
        page_20_6.setOnLongClickListener(listener);
        page_20_7.setOnLongClickListener(listener);
        page_20_8.setOnLongClickListener(listener);
        page_20_9.setOnLongClickListener(listener);
        page_20_10.setOnLongClickListener(listener);
        page_20_11.setOnLongClickListener(listener);
        page_20_12.setOnLongClickListener(listener);
        page_20_13.setOnLongClickListener(listener);
        page_20_14.setOnLongClickListener(listener);
        page_20_15.setOnLongClickListener(listener);
        page_20_16.setOnLongClickListener(listener);
        page_20_17.setOnLongClickListener(listener);
        page_20_18.setOnLongClickListener(listener);
        page_20_19.setOnLongClickListener(listener);
        page_20_20.setOnLongClickListener(listener);
        page_20_21.setOnLongClickListener(listener);
        page_20_22.setOnLongClickListener(listener);
        page_20_23.setOnLongClickListener(listener);
        page_20_24.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_20.requestLayout();
    }
}