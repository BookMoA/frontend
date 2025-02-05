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

public final class FragmentInsearcharticlevpBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RelativeLayout insearcharticleContainer;

  @NonNull
  public final RecyclerView insearcharticleRv;

  @NonNull
  public final Spinner insearcharticleSpinner;

  private FragmentInsearcharticlevpBinding(@NonNull LinearLayout rootView,
      @NonNull RelativeLayout insearcharticleContainer, @NonNull RecyclerView insearcharticleRv,
      @NonNull Spinner insearcharticleSpinner) {
    this.rootView = rootView;
    this.insearcharticleContainer = insearcharticleContainer;
    this.insearcharticleRv = insearcharticleRv;
    this.insearcharticleSpinner = insearcharticleSpinner;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentInsearcharticlevpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentInsearcharticlevpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_insearcharticlevp, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentInsearcharticlevpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.insearcharticle_container;
      RelativeLayout insearcharticleContainer = ViewBindings.findChildViewById(rootView, id);
      if (insearcharticleContainer == null) {
        break missingId;
      }

      id = R.id.insearcharticle_rv;
      RecyclerView insearcharticleRv = ViewBindings.findChildViewById(rootView, id);
      if (insearcharticleRv == null) {
        break missingId;
      }

      id = R.id.insearcharticle_spinner;
      Spinner insearcharticleSpinner = ViewBindings.findChildViewById(rootView, id);
      if (insearcharticleSpinner == null) {
        break missingId;
      }

      return new FragmentInsearcharticlevpBinding((LinearLayout) rootView, insearcharticleContainer,
          insearcharticleRv, insearcharticleSpinner);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
