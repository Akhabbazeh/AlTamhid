package com.ZidnyScience.TamheedTelawa.features.ContentsFragment;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ZidnyScience.TamheedTelawa.R;
import com.ZidnyScience.TamheedTelawa.features.pages.pagesFragment;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import java.util.List;

public class AdapterContent extends ExpandableRecyclerViewAdapter<AdapterContent.ViewHolderExamParent, AdapterContent.ViewHolderExamChild>
{

    private Context context;
    private FragmentManager fragmentManager;
    private OnItemClickListener onItemClickListener;
    private RecyclerView recycle_container;
    public AdapterContent(List<? extends ExpandableGroup> groups,FragmentManager fragmentManager,Context context,RecyclerView recycle_container)
    {
        super(groups);
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.recycle_container = recycle_container;
    }

    public interface OnItemClickListener
    {
        void OnItemClickListener(boolean state);

    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener)
    {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ViewHolderExamParent onCreateGroupViewHolder(ViewGroup parent, int viewType)
    {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_expandable_recycler_content_parent,parent,false);
        return new ViewHolderExamParent(view);
    }

    @Override
    public ViewHolderExamChild onCreateChildViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_expandable_recycler_content_child,parent,false);
        return new ViewHolderExamChild(view);
    }

    @Override
    public void onBindChildViewHolder(ViewHolderExamChild holder, int flatPosition, ExpandableGroup group, int childIndex)
    {
        final ContentInfo artist = ((ContentMain) group).getItems().get(childIndex);
        holder.txt_page_num_content_child.setText(artist.getPage_number()+"");
        holder.txtRecyclerNameChild.setText(artist.getTitle());

        holder.content_child_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendPageNumber(artist.getPage_number() - 4);
            }
        });

    }

    @Override
    public void onBindGroupViewHolder(ViewHolderExamParent holder, int flatPosition, ExpandableGroup group)
    {
        if (group instanceof ContentMain)
        {
            holder.txtRecyclerNameParent.setText(group.getTitle());
            holder.txt_page_num_content_parent.setText(group.getItemCount()+"");

        }
    }


    class ViewHolderExamChild extends ChildViewHolder
    {
        private TextView txtRecyclerNameChild;
        private TextView txt_page_num_content_child;
        private CardView content_child_layout;

        public ViewHolderExamChild(View itemView)
        {
            super(itemView);

            txtRecyclerNameChild = itemView.findViewById(R.id.txtRecyclerNameChild);
            content_child_layout = itemView.findViewById(R.id.content_child_layout);
            txt_page_num_content_child = itemView.findViewById(R.id.txt_page_num_content_child);

        }
    }

    class ViewHolderExamParent extends GroupViewHolder
    {
        private TextView txtRecyclerNameParent;
        private TextView txt_page_num_content_parent;
        private ImageView imgRecyclerArrow;
        private CardView card_item_content;

        public ViewHolderExamParent(View itemView)
        {
            super(itemView);

            imgRecyclerArrow = itemView.findViewById(R.id.imgRecyclerArrow);
            txtRecyclerNameParent = itemView.findViewById(R.id.txtRecyclerNameParent);
            txt_page_num_content_parent = itemView.findViewById(R.id.txt_page_num_content_parent);
            card_item_content = itemView.findViewById(R.id.card_item_content);
        }

        @Override
        public void expand() {
            animateExpand();
        }

        @Override
        public void collapse() {
            animateCollapse();
        }

        private void animateExpand() {
            RotateAnimation rotate =
                    new RotateAnimation(360, 180, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
            rotate.setDuration(300);
            rotate.setFillAfter(true);
            imgRecyclerArrow.setAnimation(rotate);
        }

        private void animateCollapse() {
            RotateAnimation rotate =
                    new RotateAnimation(180, 360, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
            rotate.setDuration(300);
            rotate.setFillAfter(true);
            imgRecyclerArrow.setAnimation(rotate);
        }
    }

    private void sendPageNumber(int position){
        pagesFragment pagesFragment = new pagesFragment();

        Bundle bundle = new Bundle();
        bundle.putInt("Position", position);

        pagesFragment.setArguments(bundle);

        fragmentManager.beginTransaction()
                .replace(R.id.FrameLayout_main_activity, pagesFragment, "pagesFragment")
                .addToBackStack("pagesFragment")
                .commit();


    }
}

