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

public class Page_11 extends BaseFragment {
    FrameLayout frameLayout_page_11;
    private PageInterface pageInterface;
    private View page_11_1;
    private View page_11_2;
    private View page_11_3;


    public Page_11() {

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
        View page_11 = LayoutInflater.from(getContext()).inflate(R.layout.page_11, container, false);
        frameLayout_page_11=page_11.findViewById(R.id.frameLayout_page_11);
        page_11_1 = page_11.findViewById(R.id.page_11_1);
        page_11_2 = page_11.findViewById(R.id.page_11_2);
        page_11_3 = page_11.findViewById(R.id.page_11_3);



        setOnLongClickListener();


        return page_11;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_11_1) {
                pageInterface.OnLongClickListeners("page_11_1");
            }
            else if (v.getId() == R.id.page_11_2) {
                pageInterface.OnLongClickListeners("page_11_2");
            }
            else if (v.getId() == R.id.page_11_3) {
                pageInterface.OnLongClickListeners("page_11_3");}


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_11_1.setOnLongClickListener(listener);
        page_11_2.setOnLongClickListener(listener);
        page_11_3.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_11.requestLayout();
    }
}