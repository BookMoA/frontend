// Generated by view binder compiler. Do not edit!
package com.bookmoa.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bookmoa.android.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class FragmentToastBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView toastTv;

  private FragmentToastBinding(@NonNull TextView rootView, @NonNull TextView toastTv) {
    this.rootView = rootView;
    this.toastTv = toastTv;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentToastBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentToastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_toast, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentToastBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView toastTv = (TextView) rootView;

    return new FragmentToastBinding((TextView) rootView, toastTv);
  }
}