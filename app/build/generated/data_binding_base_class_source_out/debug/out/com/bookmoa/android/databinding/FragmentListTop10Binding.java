// Generated by view binder compiler. Do not edit!
package com.bookmoa.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bookmoa.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentListTop10Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton listTop10BackIcon;

  @NonNull
  public final TextView listTop10DataAndtimeTv;

  @NonNull
  public final View listTop10Line;

  @NonNull
  public final RecyclerView listTop10Rv;

  @NonNull
  public final ImageButton listTop10SearchIcon;

  @NonNull
  public final TextView listTop10TitleTv;

  private FragmentListTop10Binding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton listTop10BackIcon, @NonNull TextView listTop10DataAndtimeTv,
      @NonNull View listTop10Line, @NonNull RecyclerView listTop10Rv,
      @NonNull ImageButton listTop10SearchIcon, @NonNull TextView listTop10TitleTv) {
    this.rootView = rootView;
    this.listTop10BackIcon = listTop10BackIcon;
    this.listTop10DataAndtimeTv = listTop10DataAndtimeTv;
    this.listTop10Line = listTop10Line;
    this.listTop10Rv = listTop10Rv;
    this.listTop10SearchIcon = listTop10SearchIcon;
    this.listTop10TitleTv = listTop10TitleTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentListTop10Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentListTop10Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_list_top10, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentListTop10Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.list_top10_back_icon;
      ImageButton listTop10BackIcon = ViewBindings.findChildViewById(rootView, id);
      if (listTop10BackIcon == null) {
        break missingId;
      }

      id = R.id.list_top10_dataAndtime_tv;
      TextView listTop10DataAndtimeTv = ViewBindings.findChildViewById(rootView, id);
      if (listTop10DataAndtimeTv == null) {
        break missingId;
      }

      id = R.id.list_top10_line;
      View listTop10Line = ViewBindings.findChildViewById(rootView, id);
      if (listTop10Line == null) {
        break missingId;
      }

      id = R.id.list_top10_rv;
      RecyclerView listTop10Rv = ViewBindings.findChildViewById(rootView, id);
      if (listTop10Rv == null) {
        break missingId;
      }

      id = R.id.list_top10_search_icon;
      ImageButton listTop10SearchIcon = ViewBindings.findChildViewById(rootView, id);
      if (listTop10SearchIcon == null) {
        break missingId;
      }

      id = R.id.list_top10_title_tv;
      TextView listTop10TitleTv = ViewBindings.findChildViewById(rootView, id);
      if (listTop10TitleTv == null) {
        break missingId;
      }

      return new FragmentListTop10Binding((ConstraintLayout) rootView, listTop10BackIcon,
          listTop10DataAndtimeTv, listTop10Line, listTop10Rv, listTop10SearchIcon,
          listTop10TitleTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}