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

public class Page_12 extends BaseFragment {
    FrameLayout frameLayout_page_12;
    private View page_12_1;
    private View page_12_2;
    private View page_12_3;
    private View page_12_4;
    private View page_12_5;
    private View page_12_6;
    private PageInterface pageInterface;


    public Page_12() {

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
        View page_12 = LayoutInflater.from(getContext()).inflate(R.layout.page_12, container, false);
        frameLayout_page_12=page_12.findViewById(R.id.frameLayout_page_12);
        page_12_1 = page_12.findViewById(R.id.page_12_1);
        page_12_2 = page_12.findViewById(R.id.page_12_2);
        page_12_3 = page_12.findViewById(R.id.page_12_3);
        page_12_4 = page_12.findViewById(R.id.page_12_4);
        page_12_5 = page_12.findViewById(R.id.page_12_5);
        page_12_6 = page_12.findViewById(R.id.page_12_6);


        setOnLongClickListener();


        return page_12;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_12_1) {
                pageInterface.OnLongClickListeners("page_12_1");
            }
            else if (v.getId() == R.id.page_12_2) {
                pageInterface.OnLongClickListeners("page_12_2");
            }
            else if (v.getId() == R.id.page_12_3) {
                pageInterface.OnLongClickListeners("page_12_3");
            }
            else if (v.getId() == R.id.page_12_4) {
                pageInterface.OnLongClickListeners("page_12_4");
            }
            else if (v.getId() == R.id.page_12_5) {
                pageInterface.OnLongClickListeners("page_12_5");
            }
            else if (v.getId() == R.id.page_12_6) {
                pageInterface.OnLongClickListeners("page_12_6");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_12_1.setOnLongClickListener(listener);
        page_12_2.setOnLongClickListener(listener);
        page_12_3.setOnLongClickListener(listener);
        page_12_4.setOnLongClickListener(listener);
        page_12_5.setOnLongClickListener(listener);
        page_12_6.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_12.requestLayout();
    }
}