package com.ZidnyScience.TamheedTelawa.features.about_book;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.ZidnyScience.TamheedTelawa.util.Tool;
import com.airbnb.lottie.LottieAnimationView;
import com.ZidnyScience.TamheedTelawa.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.util.List;

public class AdapterPagerAboutImage extends RecyclerView.Adapter<AdapterPagerAboutImage.ViewHolderAboutImage>
{
    private Context context;
    private List<Integer> images;

    private OnImageClickListener onImageClickListener;

    public AdapterPagerAboutImage(Context context, List<Integer> images)
    {
        this.context = context;
        this.images = images;
    }

    public interface OnImageClickListener
    {
        void onImageClick(int position);
    }

    public void setOnImageClickListener(OnImageClickListener onImageClickListener)
    {
        this.onImageClickListener = onImageClickListener;
    }

    @NonNull
    @Override
    public ViewHolderAboutImage onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pager_about_book_images, parent , false);
        return new ViewHolderAboutImage(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolderAboutImage holder, final int position)
    {
        try
        {
            Glide.with(context).load(images.get(position))
                    .listener(new RequestListener<Drawable>()
                    {
                        @Override
                        public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource)
                        {
                            holder.lottiePagerAboutImageAnimation.setVisibility(View.GONE);
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource)
                        {
                            holder.lottiePagerAboutImageAnimation.setVisibility(View.GONE);
                            return false;
                        }
                    })
                    .error(R.drawable.concel_icon)
                    .into(holder.imgPagerAboutSchoolImage);
        }
        catch (Exception e)
        {
            Tool.displayImageDrawable(context,holder.imgPagerAboutSchoolImage,R.drawable.concel_icon);
            holder.lottiePagerAboutImageAnimation.setVisibility(View.GONE);
        }

        holder.cardPagerAboutSchoolImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(onImageClickListener != null)
                {
                    onImageClickListener.onImageClick(position);
                }
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return images.size();
    }

    public class ViewHolderAboutImage extends RecyclerView.ViewHolder
    {
        private View view;

        private CardView cardPagerAboutSchoolImage;
        private ImageView imgPagerAboutSchoolImage;
        private LottieAnimationView lottiePagerAboutImageAnimation;

        public ViewHolderAboutImage(@NonNull View view)
        {
            super(view);

            this.view = view;

            cardPagerAboutSchoolImage = view.findViewById(R.id.cardPagerAboutSchoolImage);
            imgPagerAboutSchoolImage = view.findViewById(R.id.imgPagerAboutSchoolImage);
            lottiePagerAboutImageAnimation = view.findViewById(R.id.lottiePagerAboutImageAnimation);
        }
    }

    public void setImages(List<Integer> images)
    {
        this.images = images;
        notifyDataSetChanged();
    }
}
