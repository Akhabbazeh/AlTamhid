package com.beetronix.al_tamhid.features.ContentsFragment;

import android.icu.text.CaseMap;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class ContentInfo implements Parcelable {
    private String Title;
    private int page_number;


    public ContentInfo(String title, int page_number) {
        Title = title;
        this.page_number = page_number;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    protected ContentInfo(Parcel in) {
        Title = in.readString();
        page_number = in.readInt();
    }



    public static final Creator<ContentInfo> CREATOR = new Creator<ContentInfo>() {
        @Override
        public ContentInfo createFromParcel(Parcel in) {
            return new ContentInfo(in);
        }

        @Override
        public ContentInfo[] newArray(int size) {
            return new ContentInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(Title);
        dest.writeInt(page_number);
    }
}
