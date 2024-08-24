// Generated by view binder compiler. Do not edit!
package com.bookmoa.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bookmoa.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView commaTv;

  @NonNull
  public final LinearLayout emailAndPassword;

  @NonNull
  public final TextView emailErrorTv;

  @NonNull
  public final TextView emailGuideTv;

  @NonNull
  public final TextView emailTitleTv;

  @NonNull
  public final EditText emailTv;

  @NonNull
  public final TextView findPasswordBtn;

  @NonNull
  public final TextView guideTv1;

  @NonNull
  public final TextView guideTv2;

  @NonNull
  public final AppCompatButton kakaoLoginBtn;

  @NonNull
  public final View lineLeft;

  @NonNull
  public final View lineRight;

  @NonNull
  public final AppCompatButton loginBtn;

  @NonNull
  public final ImageView loginIc;

  @NonNull
  public final TextView loginTv;

  @NonNull
  public final TextView passwordErrorTv;

  @NonNull
  public final TextView passwordGuideTv;

  @NonNull
  public final TextView passwordTitleTv;

  @NonNull
  public final EditText passwordTv;

  @NonNull
  public final TextView privacyPolicyBtn;

  @NonNull
  public final TextView serviceTermsBtn;

  @NonNull
  public final TextView signupBtn;

  @NonNull
  public final View signupLine;

  @NonNull
  public final ConstraintLayout socialLoginLayout;

  @NonNull
  public final TextView socialLoginTv;

  @NonNull
  public final View topbarGuideline;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull TextView commaTv,
      @NonNull LinearLayout emailAndPassword, @NonNull TextView emailErrorTv,
      @NonNull TextView emailGuideTv, @NonNull TextView emailTitleTv, @NonNull EditText emailTv,
      @NonNull TextView findPasswordBtn, @NonNull TextView guideTv1, @NonNull TextView guideTv2,
      @NonNull AppCompatButton kakaoLoginBtn, @NonNull View lineLeft, @NonNull View lineRight,
      @NonNull AppCompatButton loginBtn, @NonNull ImageView loginIc, @NonNull TextView loginTv,
      @NonNull TextView passwordErrorTv, @NonNull TextView passwordGuideTv,
      @NonNull TextView passwordTitleTv, @NonNull EditText passwordTv,
      @NonNull TextView privacyPolicyBtn, @NonNull TextView serviceTermsBtn,
      @NonNull TextView signupBtn, @NonNull View signupLine,
      @NonNull ConstraintLayout socialLoginLayout, @NonNull TextView socialLoginTv,
      @NonNull View topbarGuideline) {
    this.rootView = rootView;
    this.commaTv = commaTv;
    this.emailAndPassword = emailAndPassword;
    this.emailErrorTv = emailErrorTv;
    this.emailGuideTv = emailGuideTv;
    this.emailTitleTv = emailTitleTv;
    this.emailTv = emailTv;
    this.findPasswordBtn = findPasswordBtn;
    this.guideTv1 = guideTv1;
    this.guideTv2 = guideTv2;
    this.kakaoLoginBtn = kakaoLoginBtn;
    this.lineLeft = lineLeft;
    this.lineRight = lineRight;
    this.loginBtn = loginBtn;
    this.loginIc = loginIc;
    this.loginTv = loginTv;
    this.passwordErrorTv = passwordErrorTv;
    this.passwordGuideTv = passwordGuideTv;
    this.passwordTitleTv = passwordTitleTv;
    this.passwordTv = passwordTv;
    this.privacyPolicyBtn = privacyPolicyBtn;
    this.serviceTermsBtn = serviceTermsBtn;
    this.signupBtn = signupBtn;
    this.signupLine = signupLine;
    this.socialLoginLayout = socialLoginLayout;
    this.socialLoginTv = socialLoginTv;
    this.topbarGuideline = topbarGuideline;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.comma_tv;
      TextView commaTv = ViewBindings.findChildViewById(rootView, id);
      if (commaTv == null) {
        break missingId;
      }

      id = R.id.email_and_password;
      LinearLayout emailAndPassword = ViewBindings.findChildViewById(rootView, id);
      if (emailAndPassword == null) {
        break missingId;
      }

      id = R.id.email_error_tv;
      TextView emailErrorTv = ViewBindings.findChildViewById(rootView, id);
      if (emailErrorTv == null) {
        break missingId;
      }

      id = R.id.email_guide_tv;
      TextView emailGuideTv = ViewBindings.findChildViewById(rootView, id);
      if (emailGuideTv == null) {
        break missingId;
      }

      id = R.id.email_title_tv;
      TextView emailTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (emailTitleTv == null) {
        break missingId;
      }

      id = R.id.email_tv;
      EditText emailTv = ViewBindings.findChildViewById(rootView, id);
      if (emailTv == null) {
        break missingId;
      }

      id = R.id.find_password_btn;
      TextView findPasswordBtn = ViewBindings.findChildViewById(rootView, id);
      if (findPasswordBtn == null) {
        break missingId;
      }

      id = R.id.guide_tv1;
      TextView guideTv1 = ViewBindings.findChildViewById(rootView, id);
      if (guideTv1 == null) {
        break missingId;
      }

      id = R.id.guide_tv2;
      TextView guideTv2 = ViewBindings.findChildViewById(rootView, id);
      if (guideTv2 == null) {
        break missingId;
      }

      id = R.id.kakao_login_btn;
      AppCompatButton kakaoLoginBtn = ViewBindings.findChildViewById(rootView, id);
      if (kakaoLoginBtn == null) {
        break missingId;
      }

      id = R.id.line_left;
      View lineLeft = ViewBindings.findChildViewById(rootView, id);
      if (lineLeft == null) {
        break missingId;
      }

      id = R.id.line_right;
      View lineRight = ViewBindings.findChildViewById(rootView, id);
      if (lineRight == null) {
        break missingId;
      }

      id = R.id.login_btn;
      AppCompatButton loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.login_ic;
      ImageView loginIc = ViewBindings.findChildViewById(rootView, id);
      if (loginIc == null) {
        break missingId;
      }

      id = R.id.login_tv;
      TextView loginTv = ViewBindings.findChildViewById(rootView, id);
      if (loginTv == null) {
        break missingId;
      }

      id = R.id.password_error_tv;
      TextView passwordErrorTv = ViewBindings.findChildViewById(rootView, id);
      if (passwordErrorTv == null) {
        break missingId;
      }

      id = R.id.password_guide_tv;
      TextView passwordGuideTv = ViewBindings.findChildViewById(rootView, id);
      if (passwordGuideTv == null) {
        break missingId;
      }

      id = R.id.password_title_tv;
      TextView passwordTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (passwordTitleTv == null) {
        break missingId;
      }

      id = R.id.password_tv;
      EditText passwordTv = ViewBindings.findChildViewById(rootView, id);
      if (passwordTv == null) {
        break missingId;
      }

      id = R.id.privacyPolicy_btn;
      TextView privacyPolicyBtn = ViewBindings.findChildViewById(rootView, id);
      if (privacyPolicyBtn == null) {
        break missingId;
      }

      id = R.id.serviceTerms_btn;
      TextView serviceTermsBtn = ViewBindings.findChildViewById(rootView, id);
      if (serviceTermsBtn == null) {
        break missingId;
      }

      id = R.id.signup_btn;
      TextView signupBtn = ViewBindings.findChildViewById(rootView, id);
      if (signupBtn == null) {
        break missingId;
      }

      id = R.id.signup_line;
      View signupLine = ViewBindings.findChildViewById(rootView, id);
      if (signupLine == null) {
        break missingId;
      }

      id = R.id.social_login_layout;
      ConstraintLayout socialLoginLayout = ViewBindings.findChildViewById(rootView, id);
      if (socialLoginLayout == null) {
        break missingId;
      }

      id = R.id.social_login_tv;
      TextView socialLoginTv = ViewBindings.findChildViewById(rootView, id);
      if (socialLoginTv == null) {
        break missingId;
      }

      id = R.id.topbar_guideline;
      View topbarGuideline = ViewBindings.findChildViewById(rootView, id);
      if (topbarGuideline == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, commaTv, emailAndPassword,
          emailErrorTv, emailGuideTv, emailTitleTv, emailTv, findPasswordBtn, guideTv1, guideTv2,
          kakaoLoginBtn, lineLeft, lineRight, loginBtn, loginIc, loginTv, passwordErrorTv,
          passwordGuideTv, passwordTitleTv, passwordTv, privacyPolicyBtn, serviceTermsBtn,
          signupBtn, signupLine, socialLoginLayout, socialLoginTv, topbarGuideline);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}