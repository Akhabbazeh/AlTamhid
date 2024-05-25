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

public class Page_35 extends BaseFragment {
    FrameLayout frameLayout_page_35;
    private PageInterface pageInterface;
    private View page_35_1;
    private View page_35_2;
    private View page_35_3;
    private View page_35_4;
    private View page_35_5;
    private View page_35_6;
    private View page_35_7;


    public Page_35() {

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
        View page_35 = LayoutInflater.from(getContext()).inflate(R.layout.page_35, container, false);
        frameLayout_page_35=page_35.findViewById(R.id.frameLayout_page_35);
        page_35_1 = page_35.findViewById(R.id.page_35_1);
        page_35_2 = page_35.findViewById(R.id.page_35_2);
        page_35_3 = page_35.findViewById(R.id.page_35_3);
        page_35_4 = page_35.findViewById(R.id.page_35_4);
        page_35_5 = page_35.findViewById(R.id.page_35_5);
        page_35_6 = page_35.findViewById(R.id.page_35_6);
        page_35_7 = page_35.findViewById(R.id.page_35_7);



        setOnLongClickListener();


        return page_35;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_35_1) {
                pageInterface.OnLongClickListeners("page_35_1");
            }
            else if (v.getId() == R.id.page_35_2) {
                pageInterface.OnLongClickListeners("page_35_2");
            }
            else if (v.getId() == R.id.page_35_3) {
                pageInterface.OnLongClickListeners("page_35_3");
            }
            else if (v.getId() == R.id.page_35_4) {
                pageInterface.OnLongClickListeners("page_35_4");
            }
            else if (v.getId() == R.id.page_35_5) {
                pageInterface.OnLongClickListeners("page_35_5");
            }
            else if (v.getId() == R.id.page_35_6) {
                pageInterface.OnLongClickListeners("page_35_6");
            }
            else if (v.getId() == R.id.page_35_7) {
                pageInterface.OnLongClickListeners("page_35_7");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_35_1.setOnLongClickListener(listener);
        page_35_2.setOnLongClickListener(listener);
        page_35_3.setOnLongClickListener(listener);
        page_35_4.setOnLongClickListener(listener);
        page_35_5.setOnLongClickListener(listener);
        page_35_6.setOnLongClickListener(listener);
        page_35_7.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_35.requestLayout();
    }
}