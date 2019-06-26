package smartbox.test.application.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import smartbox.test.application.R;

public class BindingAdapters {

    @BindingAdapter("setAvatar")
    public static void setAvatar(ImageView imageView, String url) {
        Picasso.get().load(url).transform(new PicassoCircleTransform()).placeholder(R.drawable.ic_user_placeholder).into(imageView);
    }

    @BindingAdapter("setIcon")
    public static void setIcon(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .placeholder(R.drawable.placeholder)
                .into(imageView);
    }

}
