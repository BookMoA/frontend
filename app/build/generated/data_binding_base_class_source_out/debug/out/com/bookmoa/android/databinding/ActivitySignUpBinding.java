// Generated by view binder compiler. Do not edit!
package com.bookmoa.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView ageAgreeIc;

  @NonNull
  public final ImageView ageAgreeMoreIc;

  @NonNull
  public final TextView ageAgreeTv;

  @NonNull
  public final ImageView allAgreeIc;

  @NonNull
  public final TextView allAgreeTv;

  @NonNull
  public final LinearLayout emailAndPasswordLayout;

  @NonNull
  public final TextView emailGuideTv;

  @NonNull
  public final TextView emailTitleTv;

  @NonNull
  public final EditText emailTv;

  @NonNull
  public final View guideline;

  @NonNull
  public final AppCompatButton nicknameCheckBtn;

  @NonNull
  public final TextView nicknameCheckDoneTv;

  @NonNull
  public final TextView nicknameCheckErrorTv;

  @NonNull
  public final TextView nicknameGuideTv;

  @NonNull
  public final ConstraintLayout nicknameLayout;

  @NonNull
  public final TextView nicknameTitleTv;

  @NonNull
  public final EditText nicknameTv;

  @NonNull
  public final ImageView noAllAgreeIc;

  @NonNull
  public final ImageView passwordCheckEyeIc;

  @NonNull
  public final TextView passwordCheckGuideTv;

  @NonNull
  public final TextView passwordCheckTitleTv;

  @NonNull
  public final EditText passwordCheckTv;

  @NonNull
  public final ImageView passwordEyeIc;

  @NonNull
  public final TextView passwordGuideTv;

  @NonNull
  public final TextView passwordTitleTv;

  @NonNull
  public final EditText passwordTv;

  @NonNull
  public final ImageView privacyAgreeIc;

  @NonNull
  public final ImageView privacyAgreeMoreIc;

  @NonNull
  public final TextView privacyAgreeTv;

  @NonNull
  public final ImageView serviceAgreeIc;

  @NonNull
  public final ImageView serviceAgreeMoreIc;

  @NonNull
  public final TextView serviceAgreeTv;

  @NonNull
  public final AppCompatButton signupBtn;

  @NonNull
  public final TextView signupTv;

  @NonNull
  public final LinearLayout termsAgreeLayout;

  @NonNull
  public final TextView termsAllTv;

  @NonNull
  public final View termsGuideline;

  @NonNull
  public final View topbarGuideline;

  private ActivitySignUpBinding(@NonNull ScrollView rootView, @NonNull ImageView ageAgreeIc,
      @NonNull ImageView ageAgreeMoreIc, @NonNull TextView ageAgreeTv,
      @NonNull ImageView allAgreeIc, @NonNull TextView allAgreeTv,
      @NonNull LinearLayout emailAndPasswordLayout, @NonNull TextView emailGuideTv,
      @NonNull TextView emailTitleTv, @NonNull EditText emailTv, @NonNull View guideline,
      @NonNull AppCompatButton nicknameCheckBtn, @NonNull TextView nicknameCheckDoneTv,
      @NonNull TextView nicknameCheckErrorTv, @NonNull TextView nicknameGuideTv,
      @NonNull ConstraintLayout nicknameLayout, @NonNull TextView nicknameTitleTv,
      @NonNull EditText nicknameTv, @NonNull ImageView noAllAgreeIc,
      @NonNull ImageView passwordCheckEyeIc, @NonNull TextView passwordCheckGuideTv,
      @NonNull TextView passwordCheckTitleTv, @NonNull EditText passwordCheckTv,
      @NonNull ImageView passwordEyeIc, @NonNull TextView passwordGuideTv,
      @NonNull TextView passwordTitleTv, @NonNull EditText passwordTv,
      @NonNull ImageView privacyAgreeIc, @NonNull ImageView privacyAgreeMoreIc,
      @NonNull TextView privacyAgreeTv, @NonNull ImageView serviceAgreeIc,
      @NonNull ImageView serviceAgreeMoreIc, @NonNull TextView serviceAgreeTv,
      @NonNull AppCompatButton signupBtn, @NonNull TextView signupTv,
      @NonNull LinearLayout termsAgreeLayout, @NonNull TextView termsAllTv,
      @NonNull View termsGuideline, @NonNull View topbarGuideline) {
    this.rootView = rootView;
    this.ageAgreeIc = ageAgreeIc;
    this.ageAgreeMoreIc = ageAgreeMoreIc;
    this.ageAgreeTv = ageAgreeTv;
    this.allAgreeIc = allAgreeIc;
    this.allAgreeTv = allAgreeTv;
    this.emailAndPasswordLayout = emailAndPasswordLayout;
    this.emailGuideTv = emailGuideTv;
    this.emailTitleTv = emailTitleTv;
    this.emailTv = emailTv;
    this.guideline = guideline;
    this.nicknameCheckBtn = nicknameCheckBtn;
    this.nicknameCheckDoneTv = nicknameCheckDoneTv;
    this.nicknameCheckErrorTv = nicknameCheckErrorTv;
    this.nicknameGuideTv = nicknameGuideTv;
    this.nicknameLayout = nicknameLayout;
    this.nicknameTitleTv = nicknameTitleTv;
    this.nicknameTv = nicknameTv;
    this.noAllAgreeIc = noAllAgreeIc;
    this.passwordCheckEyeIc = passwordCheckEyeIc;
    this.passwordCheckGuideTv = passwordCheckGuideTv;
    this.passwordCheckTitleTv = passwordCheckTitleTv;
    this.passwordCheckTv = passwordCheckTv;
    this.passwordEyeIc = passwordEyeIc;
    this.passwordGuideTv = passwordGuideTv;
    this.passwordTitleTv = passwordTitleTv;
    this.passwordTv = passwordTv;
    this.privacyAgreeIc = privacyAgreeIc;
    this.privacyAgreeMoreIc = privacyAgreeMoreIc;
    this.privacyAgreeTv = privacyAgreeTv;
    this.serviceAgreeIc = serviceAgreeIc;
    this.serviceAgreeMoreIc = serviceAgreeMoreIc;
    this.serviceAgreeTv = serviceAgreeTv;
    this.signupBtn = signupBtn;
    this.signupTv = signupTv;
    this.termsAgreeLayout = termsAgreeLayout;
    this.termsAllTv = termsAllTv;
    this.termsGuideline = termsGuideline;
    this.topbarGuideline = topbarGuideline;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.age_agree_ic;
      ImageView ageAgreeIc = ViewBindings.findChildViewById(rootView, id);
      if (ageAgreeIc == null) {
        break missingId;
      }

      id = R.id.age_agree_more_ic;
      ImageView ageAgreeMoreIc = ViewBindings.findChildViewById(rootView, id);
      if (ageAgreeMoreIc == null) {
        break missingId;
      }

      id = R.id.age_agree_tv;
      TextView ageAgreeTv = ViewBindings.findChildViewById(rootView, id);
      if (ageAgreeTv == null) {
        break missingId;
      }

      id = R.id.all_agree_ic;
      ImageView allAgreeIc = ViewBindings.findChildViewById(rootView, id);
      if (allAgreeIc == null) {
        break missingId;
      }

      id = R.id.all_agree_tv;
      TextView allAgreeTv = ViewBindings.findChildViewById(rootView, id);
      if (allAgreeTv == null) {
        break missingId;
      }

      id = R.id.email_and_password_layout;
      LinearLayout emailAndPasswordLayout = ViewBindings.findChildViewById(rootView, id);
      if (emailAndPasswordLayout == null) {
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

      id = R.id.guideline;
      View guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.nickname_check_btn;
      AppCompatButton nicknameCheckBtn = ViewBindings.findChildViewById(rootView, id);
      if (nicknameCheckBtn == null) {
        break missingId;
      }

      id = R.id.nickname_check_done_tv;
      TextView nicknameCheckDoneTv = ViewBindings.findChildViewById(rootView, id);
      if (nicknameCheckDoneTv == null) {
        break missingId;
      }

      id = R.id.nickname_check_error_tv;
      TextView nicknameCheckErrorTv = ViewBindings.findChildViewById(rootView, id);
      if (nicknameCheckErrorTv == null) {
        break missingId;
      }

      id = R.id.nickname_guide_tv;
      TextView nicknameGuideTv = ViewBindings.findChildViewById(rootView, id);
      if (nicknameGuideTv == null) {
        break missingId;
      }

      id = R.id.nickname_layout;
      ConstraintLayout nicknameLayout = ViewBindings.findChildViewById(rootView, id);
      if (nicknameLayout == null) {
        break missingId;
      }

      id = R.id.nickname_title_tv;
      TextView nicknameTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (nicknameTitleTv == null) {
        break missingId;
      }

      id = R.id.nickname_tv;
      EditText nicknameTv = ViewBindings.findChildViewById(rootView, id);
      if (nicknameTv == null) {
        break missingId;
      }

      id = R.id.no_all_agree_ic;
      ImageView noAllAgreeIc = ViewBindings.findChildViewById(rootView, id);
      if (noAllAgreeIc == null) {
        break missingId;
      }

      id = R.id.password_check_eye_ic;
      ImageView passwordCheckEyeIc = ViewBindings.findChildViewById(rootView, id);
      if (passwordCheckEyeIc == null) {
        break missingId;
      }

      id = R.id.password_check_guide_tv;
      TextView passwordCheckGuideTv = ViewBindings.findChildViewById(rootView, id);
      if (passwordCheckGuideTv == null) {
        break missingId;
      }

      id = R.id.password_check_title_tv;
      TextView passwordCheckTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (passwordCheckTitleTv == null) {
        break missingId;
      }

      id = R.id.password_check_tv;
      EditText passwordCheckTv = ViewBindings.findChildViewById(rootView, id);
      if (passwordCheckTv == null) {
        break missingId;
      }

      id = R.id.password_eye_ic;
      ImageView passwordEyeIc = ViewBindings.findChildViewById(rootView, id);
      if (passwordEyeIc == null) {
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

      id = R.id.privacy_agree_ic;
      ImageView privacyAgreeIc = ViewBindings.findChildViewById(rootView, id);
      if (privacyAgreeIc == null) {
        break missingId;
      }

      id = R.id.privacy_agree_more_ic;
      ImageView privacyAgreeMoreIc = ViewBindings.findChildViewById(rootView, id);
      if (privacyAgreeMoreIc == null) {
        break missingId;
      }

      id = R.id.privacy_agree_tv;
      TextView privacyAgreeTv = ViewBindings.findChildViewById(rootView, id);
      if (privacyAgreeTv == null) {
        break missingId;
      }

      id = R.id.service_agree_ic;
      ImageView serviceAgreeIc = ViewBindings.findChildViewById(rootView, id);
      if (serviceAgreeIc == null) {
        break missingId;
      }

      id = R.id.service_agree_more_ic;
      ImageView serviceAgreeMoreIc = ViewBindings.findChildViewById(rootView, id);
      if (serviceAgreeMoreIc == null) {
        break missingId;
      }

      id = R.id.service_agree_tv;
      TextView serviceAgreeTv = ViewBindings.findChildViewById(rootView, id);
      if (serviceAgreeTv == null) {
        break missingId;
      }

      id = R.id.signup_btn;
      AppCompatButton signupBtn = ViewBindings.findChildViewById(rootView, id);
      if (signupBtn == null) {
        break missingId;
      }

      id = R.id.signup_tv;
      TextView signupTv = ViewBindings.findChildViewById(rootView, id);
      if (signupTv == null) {
        break missingId;
      }

      id = R.id.terms_agree_layout;
      LinearLayout termsAgreeLayout = ViewBindings.findChildViewById(rootView, id);
      if (termsAgreeLayout == null) {
        break missingId;
      }

      id = R.id.terms_all_tv;
      TextView termsAllTv = ViewBindings.findChildViewById(rootView, id);
      if (termsAllTv == null) {
        break missingId;
      }

      id = R.id.terms_guideline;
      View termsGuideline = ViewBindings.findChildViewById(rootView, id);
      if (termsGuideline == null) {
        break missingId;
      }

      id = R.id.topbar_guideline;
      View topbarGuideline = ViewBindings.findChildViewById(rootView, id);
      if (topbarGuideline == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((ScrollView) rootView, ageAgreeIc, ageAgreeMoreIc,
          ageAgreeTv, allAgreeIc, allAgreeTv, emailAndPasswordLayout, emailGuideTv, emailTitleTv,
          emailTv, guideline, nicknameCheckBtn, nicknameCheckDoneTv, nicknameCheckErrorTv,
          nicknameGuideTv, nicknameLayout, nicknameTitleTv, nicknameTv, noAllAgreeIc,
          passwordCheckEyeIc, passwordCheckGuideTv, passwordCheckTitleTv, passwordCheckTv,
          passwordEyeIc, passwordGuideTv, passwordTitleTv, passwordTv, privacyAgreeIc,
          privacyAgreeMoreIc, privacyAgreeTv, serviceAgreeIc, serviceAgreeMoreIc, serviceAgreeTv,
          signupBtn, signupTv, termsAgreeLayout, termsAllTv, termsGuideline, topbarGuideline);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}