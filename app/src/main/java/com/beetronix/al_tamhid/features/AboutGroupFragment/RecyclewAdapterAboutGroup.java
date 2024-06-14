package com.beetronix.al_tamhid.features.AboutGroupFragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.features.ContentsFragment.ContainerModul;
import com.beetronix.al_tamhid.features.pages.pagesFragment;
import com.beetronix.al_tamhid.util.Tool;

import java.util.ArrayList;
import java.util.List;

class RecyclewAdapterAboutGroup extends RecyclerView.Adapter<RecyclewAdapterAboutGroup.ContainerHolder> {

   private Context context;
    private List<BeAboutGroup> beAboutGroups ;


    public RecyclewAdapterAboutGroup( Context context, List<BeAboutGroup> beAboutGroups) {
        this.context = context;
        this.beAboutGroups = beAboutGroups;

    }


    @NonNull
    @Override
    public RecyclewAdapterAboutGroup.ContainerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycle_about_group,parent,false);
        return new ContainerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclewAdapterAboutGroup.ContainerHolder holder, int position) {
        holder.txt_name_book_about_group.setText(beAboutGroups.get(position).getName());
        Tool.displayImageDrawable(context,holder.img_book_about_group,beAboutGroups.get(position).getImg());

    }


    @Override
    public int getItemCount() {
        return beAboutGroups.size();
    }


    public class ContainerHolder extends RecyclerView.ViewHolder {
        TextView txt_name_book_about_group;
        ImageView img_book_about_group;
        public ContainerHolder(@NonNull View itemView) {
            super(itemView);
            txt_name_book_about_group = itemView.findViewById(R.id.txt_name_book_about_group);
            img_book_about_group = itemView.findViewById(R.id.img_book_about_group);


        }


}

}


