// Generated by view binder compiler. Do not edit!
package com.bookmoa.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class FragmentDialogjoinBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button dialogjoinCancelBtn;

  @NonNull
  public final TextView dialogjoinCountTv;

  @NonNull
  public final CardView dialogjoinCv;

  @NonNull
  public final TextView dialogjoinDescriptionTv;

  @NonNull
  public final Button dialogjoinJoinBtn;

  @NonNull
  public final TextView dialogjoinNoticeTv;

  @NonNull
  public final TextView dialogjoinTitleTv;

  private FragmentDialogjoinBinding(@NonNull CardView rootView, @NonNull Button dialogjoinCancelBtn,
      @NonNull TextView dialogjoinCountTv, @NonNull CardView dialogjoinCv,
      @NonNull TextView dialogjoinDescriptionTv, @NonNull Button dialogjoinJoinBtn,
      @NonNull TextView dialogjoinNoticeTv, @NonNull TextView dialogjoinTitleTv) {
    this.rootView = rootView;
    this.dialogjoinCancelBtn = dialogjoinCancelBtn;
    this.dialogjoinCountTv = dialogjoinCountTv;
    this.dialogjoinCv = dialogjoinCv;
    this.dialogjoinDescriptionTv = dialogjoinDescriptionTv;
    this.dialogjoinJoinBtn = dialogjoinJoinBtn;
    this.dialogjoinNoticeTv = dialogjoinNoticeTv;
    this.dialogjoinTitleTv = dialogjoinTitleTv;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDialogjoinBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDialogjoinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_dialogjoin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDialogjoinBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dialogjoin_cancel_btn;
      Button dialogjoinCancelBtn = ViewBindings.findChildViewById(rootView, id);
      if (dialogjoinCancelBtn == null) {
        break missingId;
      }

      id = R.id.dialogjoin_count_tv;
      TextView dialogjoinCountTv = ViewBindings.findChildViewById(rootView, id);
      if (dialogjoinCountTv == null) {
        break missingId;
      }

      CardView dialogjoinCv = (CardView) rootView;

      id = R.id.dialogjoin_description_tv;
      TextView dialogjoinDescriptionTv = ViewBindings.findChildViewById(rootView, id);
      if (dialogjoinDescriptionTv == null) {
        break missingId;
      }

      id = R.id.dialogjoin_join_btn;
      Button dialogjoinJoinBtn = ViewBindings.findChildViewById(rootView, id);
      if (dialogjoinJoinBtn == null) {
        break missingId;
      }

      id = R.id.dialogjoin_notice_tv;
      TextView dialogjoinNoticeTv = ViewBindings.findChildViewById(rootView, id);
      if (dialogjoinNoticeTv == null) {
        break missingId;
      }

      id = R.id.dialogjoin_title_tv;
      TextView dialogjoinTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (dialogjoinTitleTv == null) {
        break missingId;
      }

      return new FragmentDialogjoinBinding((CardView) rootView, dialogjoinCancelBtn,
          dialogjoinCountTv, dialogjoinCv, dialogjoinDescriptionTv, dialogjoinJoinBtn,
          dialogjoinNoticeTv, dialogjoinTitleTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}