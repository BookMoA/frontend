// Generated by view binder compiler. Do not edit!
package com.bookmoa.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bookmoa.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemMemoListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView itemMemoAuthorTv;

  @NonNull
  public final TextView itemMemoContentsTv;

  @NonNull
  public final ImageView itemSearchMemoCoverIv;

  @NonNull
  public final TextView itemSearchMemoTitleTv;

  private ItemMemoListBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView itemMemoAuthorTv, @NonNull TextView itemMemoContentsTv,
      @NonNull ImageView itemSearchMemoCoverIv, @NonNull TextView itemSearchMemoTitleTv) {
    this.rootView = rootView;
    this.itemMemoAuthorTv = itemMemoAuthorTv;
    this.itemMemoContentsTv = itemMemoContentsTv;
    this.itemSearchMemoCoverIv = itemSearchMemoCoverIv;
    this.itemSearchMemoTitleTv = itemSearchMemoTitleTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemMemoListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemMemoListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_memo_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemMemoListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item_memo_author_tv;
      TextView itemMemoAuthorTv = ViewBindings.findChildViewById(rootView, id);
      if (itemMemoAuthorTv == null) {
        break missingId;
      }

      id = R.id.item_memo_contents_tv;
      TextView itemMemoContentsTv = ViewBindings.findChildViewById(rootView, id);
      if (itemMemoContentsTv == null) {
        break missingId;
      }

      id = R.id.item_search_memo_cover_iv;
      ImageView itemSearchMemoCoverIv = ViewBindings.findChildViewById(rootView, id);
      if (itemSearchMemoCoverIv == null) {
        break missingId;
      }

      id = R.id.item_search_memo_title_tv;
      TextView itemSearchMemoTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (itemSearchMemoTitleTv == null) {
        break missingId;
      }

      return new ItemMemoListBinding((ConstraintLayout) rootView, itemMemoAuthorTv,
          itemMemoContentsTv, itemSearchMemoCoverIv, itemSearchMemoTitleTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}