// Generated by view binder compiler. Do not edit!
package com.bookmoa.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bookmoa.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentInsearchtitlervBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView insearchtitleDateTv;

  @NonNull
  public final TextView insearchtitleDescriptionTv;

  @NonNull
  public final ImageView insearchtitleImageIv;

  @NonNull
  public final TextView insearchtitleNameTv;

  @NonNull
  public final TextView insearchtitleTitleTv;

  private FragmentInsearchtitlervBinding(@NonNull CardView rootView,
      @NonNull TextView insearchtitleDateTv, @NonNull TextView insearchtitleDescriptionTv,
      @NonNull ImageView insearchtitleImageIv, @NonNull TextView insearchtitleNameTv,
      @NonNull TextView insearchtitleTitleTv) {
    this.rootView = rootView;
    this.insearchtitleDateTv = insearchtitleDateTv;
    this.insearchtitleDescriptionTv = insearchtitleDescriptionTv;
    this.insearchtitleImageIv = insearchtitleImageIv;
    this.insearchtitleNameTv = insearchtitleNameTv;
    this.insearchtitleTitleTv = insearchtitleTitleTv;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentInsearchtitlervBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentInsearchtitlervBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_insearchtitlerv, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentInsearchtitlervBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.insearchtitle_date_tv;
      TextView insearchtitleDateTv = ViewBindings.findChildViewById(rootView, id);
      if (insearchtitleDateTv == null) {
        break missingId;
      }

      id = R.id.insearchtitle_description_tv;
      TextView insearchtitleDescriptionTv = ViewBindings.findChildViewById(rootView, id);
      if (insearchtitleDescriptionTv == null) {
        break missingId;
      }

      id = R.id.insearchtitle_image_iv;
      ImageView insearchtitleImageIv = ViewBindings.findChildViewById(rootView, id);
      if (insearchtitleImageIv == null) {
        break missingId;
      }

      id = R.id.insearchtitle_name_tv;
      TextView insearchtitleNameTv = ViewBindings.findChildViewById(rootView, id);
      if (insearchtitleNameTv == null) {
        break missingId;
      }

      id = R.id.insearchtitle_title_tv;
      TextView insearchtitleTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (insearchtitleTitleTv == null) {
        break missingId;
      }

      return new FragmentInsearchtitlervBinding((CardView) rootView, insearchtitleDateTv,
          insearchtitleDescriptionTv, insearchtitleImageIv, insearchtitleNameTv,
          insearchtitleTitleTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}