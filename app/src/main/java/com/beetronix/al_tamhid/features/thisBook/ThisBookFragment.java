package com.beetronix.al_tamhid.features.thisBook;

import android.os.Bundle;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.features.about_book.AboutBookManger;
import com.beetronix.al_tamhid.features.about_book.AboutBookUiInterface;
import com.beetronix.al_tamhid.features.about_book.BeAboutBook;
import com.beetronix.al_tamhid.util.Tool;
import com.example.myapplication.features.ui.BaseFragment;


public class ThisBookFragment extends BaseFragment implements AboutBookUiInterface {
    private AboutBookManger aboutBookManger;
    public ThisBookFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_3 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_this_book, container, false);
        setNotificationBarColor(R.color.primary_color);
        aboutBookManger = new AboutBookManger(this,this);



        aboutBookManger.getBookData(9);
        return view_3;
    }


    @Override
    public void showBookData(BeAboutBook beAboutBook) {


    }
}
