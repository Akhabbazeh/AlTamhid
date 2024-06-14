package com.beetronix.al_tamhid.features.ContentsFragment;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ContentMain extends ExpandableGroup<ContentInfo> {
    public ContentMain(String title, List<ContentInfo> items) {
        super(title, items);
    }
}
