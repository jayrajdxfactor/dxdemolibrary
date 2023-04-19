package com.dxdemo.dxdemolibrary.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import androidx.databinding.BindingAdapter
import com.dxdemo.dxdemolibrary.R


@BindingAdapter("imageUrl")
fun loadOriginalQaulityImage(imageView: ImageView, imageUrl: String?) {


    val requestOptions = RequestOptions()
    requestOptions.diskCacheStrategy(DiskCacheStrategy.NONE)
    requestOptions.dontTransform()
    requestOptions.fitCenter()
    requestOptions.priority(Priority.HIGH)
    requestOptions.format(DecodeFormat.PREFER_ARGB_8888)
    requestOptions.override(Target.SIZE_ORIGINAL)



    imageView.let {
        Glide.with(imageView.context)
            .setDefaultRequestOptions(requestOptions)
            .load(imageUrl)
            .placeholder(R.drawable.placeholder)
            .into(imageView)

    }
}