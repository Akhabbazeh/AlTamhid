package com.beetronix.al_tamhid.features.AboutGroupFragment;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.util.Tool;

import java.util.ArrayList;
import java.util.List;

public class AdapterGroup extends RecyclerView.Adapter<AdapterGroup.ViewHolder>{

    private List<BeAboutGroup> beAboutGroups;
    private Context context;

    private String maxSize;
    private OnBookClickListener onBookClickListener;


    public AdapterGroup(Context context, List<BeAboutGroup> beAboutGroups) {
        ArrayList<String> names = new ArrayList<>();

        for (int i=0 ;i< beAboutGroups.size();i++){
            names.add(beAboutGroups.get(i).getName());
        }
        maxSize = findLongestText(names);
        this.context = context;
        this.beAboutGroups = beAboutGroups;

    }

    public interface OnBookClickListener
    {
        void OnBookClickListener(int book_number);

    }

    public void setBookClickListener(OnBookClickListener onBookClickListener)
    {
        this.onBookClickListener = onBookClickListener;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Initialize view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle_books, parent, false);
        // Pass holder view
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.txt_book_name.setText(beAboutGroups.get(position).getName());

        Tool.displayImageDrawable(context,holder.img_book_about_group,beAboutGroups.get(position).getImg());
        holder.txt_book_name_max.setText(maxSize);

        holder.card_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onBookClickListener != null){
                    onBookClickListener.OnBookClickListener(beAboutGroups.get(position).getBook_number());
                }
            }
        });



//        holder.img_book_about_group.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getTelegramInt(context,beAboutGroups.get(position).getLink());
//            }
//        });



    }

    @Override
    public int getItemCount() {
        return beAboutGroups.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_max;
        private TextView txt_name_book_about_group;
        private ImageView img_book_about_group;
        private TextView txt_book_name;
        private TextView txt_book_name_max;
        private CardView card_book;

        public ViewHolder(View itemView) {
            super(itemView);
            txt_max= itemView.findViewById(R.id.txt_max);
            txt_book_name_max = itemView.findViewById(R.id.txt_book_name_max);
            txt_book_name = itemView.findViewById(R.id.txt_book_name);
            card_book = itemView.findViewById(R.id.card_book);
            txt_name_book_about_group= itemView.findViewById(R.id.txt_name_book_about_group);
            img_book_about_group= itemView.findViewById(R.id.img_book_about_group);

        }
    }

    private String findLongestText(List<String> dataList) {
        String longest = "";
        for (String text : dataList) {
            if (text.length() > longest.length()) {
                longest = text;
            }
        }
        return longest;
    }

    private void getTelegramInt(Context context, String link) {

        Intent intent;

        try {
            try {
                context.getPackageManager().getPackageInfo("org.telegram.messenger", 0);
            } catch (PackageManager.NameNotFoundException e) {
                context.getPackageManager().getPackageInfo("org.thunderdog.challegram", 0);
            }
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
            context.startActivity(intent);

        } catch (PackageManager.NameNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
            context.startActivity(intent);
        }
    }
}
