// Generated by view binder compiler. Do not edit!
package com.bookmoa.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityRegisteredBookBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final TextView et333;

  @NonNull
  public final EditText etNewAuthour;

  @NonNull
  public final EditText etNewIsbn;

  @NonNull
  public final EditText etNewPage;

  @NonNull
  public final EditText etNewPublisher;

  @NonNull
  public final EditText etNewTitle;

  @NonNull
  public final ImageView imgNewBookCover;

  @NonNull
  public final TextView textView26;

  @NonNull
  public final TextView textView28;

  @NonNull
  public final TextView textView30;

  @NonNull
  public final TextView textView33;

  private ActivityRegisteredBookBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSave,
      @NonNull TextView et333, @NonNull EditText etNewAuthour, @NonNull EditText etNewIsbn,
      @NonNull EditText etNewPage, @NonNull EditText etNewPublisher, @NonNull EditText etNewTitle,
      @NonNull ImageView imgNewBookCover, @NonNull TextView textView26,
      @NonNull TextView textView28, @NonNull TextView textView30, @NonNull TextView textView33) {
    this.rootView = rootView;
    this.btnSave = btnSave;
    this.et333 = et333;
    this.etNewAuthour = etNewAuthour;
    this.etNewIsbn = etNewIsbn;
    this.etNewPage = etNewPage;
    this.etNewPublisher = etNewPublisher;
    this.etNewTitle = etNewTitle;
    this.imgNewBookCover = imgNewBookCover;
    this.textView26 = textView26;
    this.textView28 = textView28;
    this.textView30 = textView30;
    this.textView33 = textView33;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisteredBookBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisteredBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registered_book, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisteredBookBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSave;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.et333;
      TextView et333 = ViewBindings.findChildViewById(rootView, id);
      if (et333 == null) {
        break missingId;
      }

      id = R.id.etNewAuthour;
      EditText etNewAuthour = ViewBindings.findChildViewById(rootView, id);
      if (etNewAuthour == null) {
        break missingId;
      }

      id = R.id.etNewIsbn;
      EditText etNewIsbn = ViewBindings.findChildViewById(rootView, id);
      if (etNewIsbn == null) {
        break missingId;
      }

      id = R.id.etNewPage;
      EditText etNewPage = ViewBindings.findChildViewById(rootView, id);
      if (etNewPage == null) {
        break missingId;
      }

      id = R.id.etNewPublisher;
      EditText etNewPublisher = ViewBindings.findChildViewById(rootView, id);
      if (etNewPublisher == null) {
        break missingId;
      }

      id = R.id.etNewTitle;
      EditText etNewTitle = ViewBindings.findChildViewById(rootView, id);
      if (etNewTitle == null) {
        break missingId;
      }

      id = R.id.imgNewBookCover;
      ImageView imgNewBookCover = ViewBindings.findChildViewById(rootView, id);
      if (imgNewBookCover == null) {
        break missingId;
      }

      id = R.id.textView26;
      TextView textView26 = ViewBindings.findChildViewById(rootView, id);
      if (textView26 == null) {
        break missingId;
      }

      id = R.id.textView28;
      TextView textView28 = ViewBindings.findChildViewById(rootView, id);
      if (textView28 == null) {
        break missingId;
      }

      id = R.id.textView30;
      TextView textView30 = ViewBindings.findChildViewById(rootView, id);
      if (textView30 == null) {
        break missingId;
      }

      id = R.id.textView33;
      TextView textView33 = ViewBindings.findChildViewById(rootView, id);
      if (textView33 == null) {
        break missingId;
      }

      return new ActivityRegisteredBookBinding((ConstraintLayout) rootView, btnSave, et333,
          etNewAuthour, etNewIsbn, etNewPage, etNewPublisher, etNewTitle, imgNewBookCover,
          textView26, textView28, textView30, textView33);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
