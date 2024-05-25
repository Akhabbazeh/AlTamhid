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

public class Page_18 extends BaseFragment {
    FrameLayout frameLayout_page_18;
    private PageInterface pageInterface;
    private View page_18_1;
    private View page_18_2;
    private View page_18_3;
    private View page_18_4;
    private View page_18_5;
    private View page_18_6;
    private View page_18_7;
    private View page_18_8;
    private View page_18_9;
    private View page_18_10;
    private View page_18_11;
    private View page_18_12;
    private View page_18_13;
    private View page_18_14;
    private View page_18_15;
    private View page_18_16;
    private View page_18_17;
    private View page_18_18;
    private View page_18_19;
    private View page_18_20;
    private View page_18_21;
    private View page_18_22;
    private View page_18_23;
    private View page_18_24;
    private View page_18_25;


    public Page_18() {

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
        View page_18 = LayoutInflater.from(getContext()).inflate(R.layout.page_18, container, false);
        frameLayout_page_18=page_18.findViewById(R.id.frameLayout_page_18);
        page_18_1 = page_18.findViewById(R.id.page_18_1);
        page_18_2 = page_18.findViewById(R.id.page_18_2);
        page_18_3 = page_18.findViewById(R.id.page_18_3);
        page_18_4 = page_18.findViewById(R.id.page_18_4);
        page_18_5 = page_18.findViewById(R.id.page_18_5);
        page_18_6 = page_18.findViewById(R.id.page_18_6);
        page_18_7 = page_18.findViewById(R.id.page_18_7);
        page_18_8 = page_18.findViewById(R.id.page_18_8);
        page_18_9 = page_18.findViewById(R.id.page_18_9);
        page_18_10 = page_18.findViewById(R.id.page_18_10);
        page_18_11 = page_18.findViewById(R.id.page_18_11);
        page_18_12 = page_18.findViewById(R.id.page_18_12);
        page_18_13 = page_18.findViewById(R.id.page_18_13);
        page_18_14 = page_18.findViewById(R.id.page_18_14);
        page_18_15 = page_18.findViewById(R.id.page_18_15);
        page_18_16 = page_18.findViewById(R.id.page_18_16);
        page_18_17 = page_18.findViewById(R.id.page_18_17);
        page_18_18 = page_18.findViewById(R.id.page_18_18);
        page_18_19 = page_18.findViewById(R.id.page_18_19);
        page_18_20 = page_18.findViewById(R.id.page_18_20);
        page_18_21 = page_18.findViewById(R.id.page_18_21);
        page_18_22 = page_18.findViewById(R.id.page_18_22);
        page_18_23 = page_18.findViewById(R.id.page_18_23);
        page_18_24 = page_18.findViewById(R.id.page_18_24);
        page_18_25 = page_18.findViewById(R.id.page_18_25);



        setOnLongClickListener();


        return page_18;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_18_1) {
                pageInterface.OnLongClickListeners("page_18_1");
            }
            else if (v.getId() == R.id.page_18_2) {
                pageInterface.OnLongClickListeners("page_18_2");
            }
            else if (v.getId() == R.id.page_18_3) {
                pageInterface.OnLongClickListeners("page_18_3");
            }
            else if (v.getId() == R.id.page_18_4) {
                pageInterface.OnLongClickListeners("page_18_4");
            }
            else if (v.getId() == R.id.page_18_5) {
                pageInterface.OnLongClickListeners("page_18_5");
            }
            else if (v.getId() == R.id.page_18_6) {
                pageInterface.OnLongClickListeners("page_18_6");
            }
            else if (v.getId() == R.id.page_18_7) {
                pageInterface.OnLongClickListeners("page_18_7");
            }
            else if (v.getId() == R.id.page_18_8) {
                pageInterface.OnLongClickListeners("page_18_8");
            }
            else if (v.getId() == R.id.page_18_9) {
                pageInterface.OnLongClickListeners("page_18_9");
            }
            else if (v.getId() == R.id.page_18_10) {
                pageInterface.OnLongClickListeners("page_18_10");
            }
            else if (v.getId() == R.id.page_18_11) {
                pageInterface.OnLongClickListeners("page_18_11");
            }
            else if (v.getId() == R.id.page_18_12) {
                pageInterface.OnLongClickListeners("page_18_12");
            }
            else if (v.getId() == R.id.page_18_13) {
                pageInterface.OnLongClickListeners("page_18_13");
            }
            else if (v.getId() == R.id.page_18_14) {
                pageInterface.OnLongClickListeners("page_18_14");
            }
            else if (v.getId() == R.id.page_18_15) {
                pageInterface.OnLongClickListeners("page_18_15");
            }
            else if (v.getId() == R.id.page_18_16) {
                pageInterface.OnLongClickListeners("page_18_16");
            }
            else if (v.getId() == R.id.page_18_17) {
                pageInterface.OnLongClickListeners("page_18_17");
            }
            else if (v.getId() == R.id.page_18_18) {
                pageInterface.OnLongClickListeners("page_18_18");
            }
            else if (v.getId() == R.id.page_18_19) {
                pageInterface.OnLongClickListeners("page_18_19");
            }
            else if (v.getId() == R.id.page_18_20) {
                pageInterface.OnLongClickListeners("page_18_20");
            }
            else if (v.getId() == R.id.page_18_21) {
                pageInterface.OnLongClickListeners("page_18_21");
            }
            else if (v.getId() == R.id.page_18_22) {
                pageInterface.OnLongClickListeners("page_18_22");
            }
            else if (v.getId() == R.id.page_18_23) {
                pageInterface.OnLongClickListeners("page_18_23");
            }
            else if (v.getId() == R.id.page_18_24) {
                pageInterface.OnLongClickListeners("page_18_24");
            }
            else if (v.getId() == R.id.page_18_25) {
                pageInterface.OnLongClickListeners("page_18_25");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_18_1.setOnLongClickListener(listener);
        page_18_2.setOnLongClickListener(listener);
        page_18_3.setOnLongClickListener(listener);
        page_18_4.setOnLongClickListener(listener);
        page_18_5.setOnLongClickListener(listener);
        page_18_6.setOnLongClickListener(listener);
        page_18_7.setOnLongClickListener(listener);
        page_18_8.setOnLongClickListener(listener);
        page_18_9.setOnLongClickListener(listener);
        page_18_10.setOnLongClickListener(listener);
        page_18_11.setOnLongClickListener(listener);
        page_18_12.setOnLongClickListener(listener);
        page_18_13.setOnLongClickListener(listener);
        page_18_14.setOnLongClickListener(listener);
        page_18_15.setOnLongClickListener(listener);
        page_18_16.setOnLongClickListener(listener);
        page_18_17.setOnLongClickListener(listener);
        page_18_18.setOnLongClickListener(listener);
        page_18_19.setOnLongClickListener(listener);
        page_18_20.setOnLongClickListener(listener);
        page_18_21.setOnLongClickListener(listener);
        page_18_22.setOnLongClickListener(listener);
        page_18_23.setOnLongClickListener(listener);
        page_18_24.setOnLongClickListener(listener);
        page_18_25.setOnLongClickListener(listener);


    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_18.requestLayout();
    }
}