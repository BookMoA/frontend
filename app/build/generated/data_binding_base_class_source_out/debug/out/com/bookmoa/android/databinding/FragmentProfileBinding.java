// Generated by view binder compiler. Do not edit!
package com.bookmoa.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bookmoa.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView profileBackIv;

  @NonNull
  public final TextView profileDoneTv;

  @NonNull
  public final EditText profileFloatEt;

  @NonNull
  public final FrameLayout profileFloatFl;

  @NonNull
  public final TextView profileNameTv;

  @NonNull
  public final ImageView profileProfileIv;

  private FragmentProfileBinding(@NonNull LinearLayout rootView, @NonNull ImageView profileBackIv,
      @NonNull TextView profileDoneTv, @NonNull EditText profileFloatEt,
      @NonNull FrameLayout profileFloatFl, @NonNull TextView profileNameTv,
      @NonNull ImageView profileProfileIv) {
    this.rootView = rootView;
    this.profileBackIv = profileBackIv;
    this.profileDoneTv = profileDoneTv;
    this.profileFloatEt = profileFloatEt;
    this.profileFloatFl = profileFloatFl;
    this.profileNameTv = profileNameTv;
    this.profileProfileIv = profileProfileIv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.profile_back_iv;
      ImageView profileBackIv = ViewBindings.findChildViewById(rootView, id);
      if (profileBackIv == null) {
        break missingId;
      }

      id = R.id.profile_done_tv;
      TextView profileDoneTv = ViewBindings.findChildViewById(rootView, id);
      if (profileDoneTv == null) {
        break missingId;
      }

      id = R.id.profile_float_et;
      EditText profileFloatEt = ViewBindings.findChildViewById(rootView, id);
      if (profileFloatEt == null) {
        break missingId;
      }

      id = R.id.profile_float_fl;
      FrameLayout profileFloatFl = ViewBindings.findChildViewById(rootView, id);
      if (profileFloatFl == null) {
        break missingId;
      }

      id = R.id.profile_name_tv;
      TextView profileNameTv = ViewBindings.findChildViewById(rootView, id);
      if (profileNameTv == null) {
        break missingId;
      }

      id = R.id.profile_profile_iv;
      ImageView profileProfileIv = ViewBindings.findChildViewById(rootView, id);
      if (profileProfileIv == null) {
        break missingId;
      }

      return new FragmentProfileBinding((LinearLayout) rootView, profileBackIv, profileDoneTv,
          profileFloatEt, profileFloatFl, profileNameTv, profileProfileIv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
