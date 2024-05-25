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

public class Page_26 extends BaseFragment {
    FrameLayout frameLayout_page_26;
    private PageInterface pageInterface;
    private View page_26_1;
    private View page_26_2;
    private View page_26_3;
    private View page_26_4;
    private View page_26_5;
    private View page_26_6;
    private View page_26_7;


    public Page_26() {

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
        View page_26 = LayoutInflater.from(getContext()).inflate(R.layout.page_26, container, false);
        frameLayout_page_26=page_26.findViewById(R.id.frameLayout_page_26);
        page_26_1 = page_26.findViewById(R.id.page_26_1);
        page_26_2 = page_26.findViewById(R.id.page_26_2);
        page_26_3 = page_26.findViewById(R.id.page_26_3);
        page_26_4 = page_26.findViewById(R.id.page_26_4);
        page_26_5 = page_26.findViewById(R.id.page_26_5);
        page_26_6 = page_26.findViewById(R.id.page_26_6);
        page_26_7 = page_26.findViewById(R.id.page_26_7);



        setOnLongClickListener();


        return page_26;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_26_1) {
                pageInterface.OnLongClickListeners("page_26_1");
            }
            else if (v.getId() == R.id.page_26_2) {
                pageInterface.OnLongClickListeners("page_26_2");
            }
            else if (v.getId() == R.id.page_26_3) {
                pageInterface.OnLongClickListeners("page_26_3");
            }
            else if (v.getId() == R.id.page_26_4) {
                pageInterface.OnLongClickListeners("page_26_4");
            }
            else if (v.getId() == R.id.page_26_5) {
                pageInterface.OnLongClickListeners("page_26_5");
            }
            else if (v.getId() == R.id.page_26_6) {
                pageInterface.OnLongClickListeners("page_26_6");
            }
            else if (v.getId() == R.id.page_26_7) {
                pageInterface.OnLongClickListeners("page_26_7");
            }

            return true;
        }
    };
    private void setOnLongClickListener(){
        page_26_1.setOnLongClickListener(listener);
        page_26_2.setOnLongClickListener(listener);
        page_26_3.setOnLongClickListener(listener);
        page_26_4.setOnLongClickListener(listener);
        page_26_5.setOnLongClickListener(listener);
        page_26_6.setOnLongClickListener(listener);
        page_26_7.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_26.requestLayout();
    }
}