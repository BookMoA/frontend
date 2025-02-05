// Generated by view binder compiler. Do not edit!
package com.bookmoa.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bookmoa.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentInsearchauthorvpBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RelativeLayout insearchauthorContainer;

  @NonNull
  public final RecyclerView insearchauthorRv;

  @NonNull
  public final Spinner insearchauthorSpinner;

  private FragmentInsearchauthorvpBinding(@NonNull LinearLayout rootView,
      @NonNull RelativeLayout insearchauthorContainer, @NonNull RecyclerView insearchauthorRv,
      @NonNull Spinner insearchauthorSpinner) {
    this.rootView = rootView;
    this.insearchauthorContainer = insearchauthorContainer;
    this.insearchauthorRv = insearchauthorRv;
    this.insearchauthorSpinner = insearchauthorSpinner;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentInsearchauthorvpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentInsearchauthorvpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_insearchauthorvp, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentInsearchauthorvpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.insearchauthor_container;
      RelativeLayout insearchauthorContainer = ViewBindings.findChildViewById(rootView, id);
      if (insearchauthorContainer == null) {
        break missingId;
      }

      id = R.id.insearchauthor_rv;
      RecyclerView insearchauthorRv = ViewBindings.findChildViewById(rootView, id);
      if (insearchauthorRv == null) {
        break missingId;
      }

      id = R.id.insearchauthor_spinner;
      Spinner insearchauthorSpinner = ViewBindings.findChildViewById(rootView, id);
      if (insearchauthorSpinner == null) {
        break missingId;
      }

      return new FragmentInsearchauthorvpBinding((LinearLayout) rootView, insearchauthorContainer,
          insearchauthorRv, insearchauthorSpinner);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
