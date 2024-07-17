package com.ZidnyScience.TamheedTelawa.features.thisBook;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ZidnyScience.TamheedTelawa.R;
import com.ZidnyScience.TamheedTelawa.features.about_book.AboutBookManger;
import com.ZidnyScience.TamheedTelawa.features.about_book.AboutBookUiInterface;
import com.ZidnyScience.TamheedTelawa.features.about_book.BeAboutBook;
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
