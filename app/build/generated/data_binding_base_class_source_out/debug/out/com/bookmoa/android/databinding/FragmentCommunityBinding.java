// Generated by view binder compiler. Do not edit!
package com.bookmoa.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.bookmoa.android.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCommunityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView communityBackIv;

  @NonNull
  public final TextView communityDescriptionTv;

  @NonNull
  public final ImageView communitySearchIv;

  @NonNull
  public final TextView communityTitleTv;

  @NonNull
  public final TabLayout communityTl;

  @NonNull
  public final ViewPager2 communityVp;

  @NonNull
  public final ImageView communityWriteIv;

  private FragmentCommunityBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView communityBackIv, @NonNull TextView communityDescriptionTv,
      @NonNull ImageView communitySearchIv, @NonNull TextView communityTitleTv,
      @NonNull TabLayout communityTl, @NonNull ViewPager2 communityVp,
      @NonNull ImageView communityWriteIv) {
    this.rootView = rootView;
    this.communityBackIv = communityBackIv;
    this.communityDescriptionTv = communityDescriptionTv;
    this.communitySearchIv = communitySearchIv;
    this.communityTitleTv = communityTitleTv;
    this.communityTl = communityTl;
    this.communityVp = communityVp;
    this.communityWriteIv = communityWriteIv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCommunityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCommunityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_community, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCommunityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.community_back_iv;
      ImageView communityBackIv = ViewBindings.findChildViewById(rootView, id);
      if (communityBackIv == null) {
        break missingId;
      }

      id = R.id.community_description_tv;
      TextView communityDescriptionTv = ViewBindings.findChildViewById(rootView, id);
      if (communityDescriptionTv == null) {
        break missingId;
      }

      id = R.id.community_search_iv;
      ImageView communitySearchIv = ViewBindings.findChildViewById(rootView, id);
      if (communitySearchIv == null) {
        break missingId;
      }

      id = R.id.community_title_tv;
      TextView communityTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (communityTitleTv == null) {
        break missingId;
      }

      id = R.id.community_tl;
      TabLayout communityTl = ViewBindings.findChildViewById(rootView, id);
      if (communityTl == null) {
        break missingId;
      }

      id = R.id.community_vp;
      ViewPager2 communityVp = ViewBindings.findChildViewById(rootView, id);
      if (communityVp == null) {
        break missingId;
      }

      id = R.id.community_write_iv;
      ImageView communityWriteIv = ViewBindings.findChildViewById(rootView, id);
      if (communityWriteIv == null) {
        break missingId;
      }

      return new FragmentCommunityBinding((LinearLayout) rootView, communityBackIv,
          communityDescriptionTv, communitySearchIv, communityTitleTv, communityTl, communityVp,
          communityWriteIv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}