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

public class Page_52 extends BaseFragment {
    FrameLayout frameLayout_page_52;
    private PageInterface pageInterface;
    private View page_52_1;
    private View page_52_2;
    private View page_52_3;


    public Page_52() {

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
        View page_52 = LayoutInflater.from(getContext()).inflate(R.layout.page_52, container, false);
        frameLayout_page_52=page_52.findViewById(R.id.frameLayout_page_52);
        page_52_1 = page_52.findViewById(R.id.page_52_1);
        page_52_2 = page_52.findViewById(R.id.page_52_2);
        page_52_3 = page_52.findViewById(R.id.page_52_3);


        setOnLongClickListener();


        return page_52;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_52_1) {
                pageInterface.OnLongClickListeners("page_52_1");
            }
            else if (v.getId() == R.id.page_52_2) {
                pageInterface.OnLongClickListeners("page_52_2");
            }
            else if (v.getId() == R.id.page_52_3) {
                pageInterface.OnLongClickListeners("page_52_3");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_52_1.setOnLongClickListener(listener);
        page_52_2.setOnLongClickListener(listener);
        page_52_3.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_52.requestLayout();
    }
}