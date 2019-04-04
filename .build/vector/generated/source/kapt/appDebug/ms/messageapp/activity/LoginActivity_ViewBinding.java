// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class LoginActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private LoginActivity target;

  private View view2131296372;

  private View view2131296380;

  private View view2131296373;

  private View view2131296374;

  private View view2131296379;

  private View view2131296375;

  private View view2131296378;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.mMainContainer = Utils.findRequiredViewAsType(source, R.id.login_main_container, "field 'mMainContainer'", ViewGroup.class);
    target.mFormContainer = Utils.findRequiredViewAsType(source, R.id.login_form_container, "field 'mFormContainer'", ViewGroup.class);
    target.mLoginLayout = Utils.findRequiredView(source, R.id.login_inputs_layout, "field 'mLoginLayout'");
    target.mCreationLayout = Utils.findRequiredView(source, R.id.creation_inputs_layout, "field 'mCreationLayout'");
    target.mForgetPasswordLayout = Utils.findRequiredView(source, R.id.forget_password_inputs_layout, "field 'mForgetPasswordLayout'");
    target.mThreePidLayout = Utils.findRequiredView(source, R.id.three_pid_layout, "field 'mThreePidLayout'");
    view = Utils.findRequiredView(source, R.id.button_login, "field 'mLoginButton' and method 'onLoginClick'");
    target.mLoginButton = Utils.castView(view, R.id.button_login, "field 'mLoginButton'", Button.class);
    view2131296372 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLoginClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_switch_to_register, "field 'mSwitchToRegisterButton' and method 'onSwitchToRegisterClick'");
    target.mSwitchToRegisterButton = Utils.castView(view, R.id.button_switch_to_register, "field 'mSwitchToRegisterButton'", Button.class);
    view2131296380 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSwitchToRegisterClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_login_sso, "field 'mLoginSsoButton' and method 'openLoginFallback'");
    target.mLoginSsoButton = Utils.castView(view, R.id.button_login_sso, "field 'mLoginSsoButton'", Button.class);
    view2131296373 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openLoginFallback();
      }
    });
    target.spinner = Utils.findRequiredViewAsType(source, R.id.spinner, "field 'spinner'", Spinner.class);
    view = Utils.findRequiredView(source, R.id.button_register, "field 'mRegisterButton' and method 'onRegisterClick'");
    target.mRegisterButton = Utils.castView(view, R.id.button_register, "field 'mRegisterButton'", Button.class);
    view2131296374 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRegisterClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_switch_to_login, "field 'mSwitchToLoginButton' and method 'onSwitchToLoginClick'");
    target.mSwitchToLoginButton = Utils.castView(view, R.id.button_switch_to_login, "field 'mSwitchToLoginButton'", Button.class);
    view2131296379 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSwitchToLoginClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_reset_password, "field 'mForgotPasswordButton' and method 'onForgotPasswordClick'");
    target.mForgotPasswordButton = Utils.castView(view, R.id.button_reset_password, "field 'mForgotPasswordButton'", Button.class);
    view2131296375 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onForgotPasswordClick();
      }
    });
    target.mForgotValidateEmailButton = Utils.findRequiredViewAsType(source, R.id.button_forgot_email_validate, "field 'mForgotValidateEmailButton'", Button.class);
    target.mLoginEmailTextViewTil = Utils.findRequiredViewAsType(source, R.id.login_user_name_til, "field 'mLoginEmailTextViewTil'", TextInputLayout.class);
    target.mLoginEmailTextView = Utils.findRequiredViewAsType(source, R.id.login_user_name, "field 'mLoginEmailTextView'", EditText.class);
    target.mLoginPhoneNumberTil = Utils.findRequiredViewAsType(source, R.id.login_phone_number_value_til, "field 'mLoginPhoneNumberTil'", TextInputLayout.class);
    target.mLoginPhoneNumber = Utils.findRequiredViewAsType(source, R.id.login_phone_number_value, "field 'mLoginPhoneNumber'", EditText.class);
    target.mLoginPhoneNumberCountryCode = Utils.findRequiredViewAsType(source, R.id.login_phone_number_country, "field 'mLoginPhoneNumberCountryCode'", EditText.class);
    target.mLoginPasswordTextViewTil = Utils.findRequiredViewAsType(source, R.id.login_password_til, "field 'mLoginPasswordTextViewTil'", TextInputLayout.class);
    target.mLoginPasswordTextView = Utils.findRequiredViewAsType(source, R.id.login_password, "field 'mLoginPasswordTextView'", EditText.class);
    target.mButtonsView = Utils.findRequiredView(source, R.id.login_actions_bar, "field 'mButtonsView'");
    target.mCreationUsernameTextViewTil = Utils.findRequiredViewAsType(source, R.id.creation_your_name_til, "field 'mCreationUsernameTextViewTil'", TextInputLayout.class);
    target.mCreationUsernameTextView = Utils.findRequiredViewAsType(source, R.id.creation_your_name, "field 'mCreationUsernameTextView'", EditText.class);
    target.mCreationPassword1TextViewTil = Utils.findRequiredViewAsType(source, R.id.creation_password1_til, "field 'mCreationPassword1TextViewTil'", TextInputLayout.class);
    target.mCreationPassword1TextView = Utils.findRequiredViewAsType(source, R.id.creation_password1, "field 'mCreationPassword1TextView'", EditText.class);
    target.mCreationPassword2TextViewTil = Utils.findRequiredViewAsType(source, R.id.creation_password2_til, "field 'mCreationPassword2TextViewTil'", TextInputLayout.class);
    target.mCreationPassword2TextView = Utils.findRequiredViewAsType(source, R.id.creation_password2, "field 'mCreationPassword2TextView'", EditText.class);
    target.mPasswordForgottenTxtView = Utils.findRequiredViewAsType(source, R.id.login_forgot_password, "field 'mPasswordForgottenTxtView'", TextView.class);
    target.mForgotEmailTextViewTil = Utils.findRequiredViewAsType(source, R.id.forget_email_address_til, "field 'mForgotEmailTextViewTil'", TextInputLayout.class);
    target.mForgotEmailTextView = Utils.findRequiredViewAsType(source, R.id.forget_email_address, "field 'mForgotEmailTextView'", EditText.class);
    target.mForgotPassword1TextViewTil = Utils.findRequiredViewAsType(source, R.id.forget_new_password_til, "field 'mForgotPassword1TextViewTil'", TextInputLayout.class);
    target.mForgotPassword1TextView = Utils.findRequiredViewAsType(source, R.id.forget_new_password, "field 'mForgotPassword1TextView'", EditText.class);
    target.mForgotPassword2TextViewTil = Utils.findRequiredViewAsType(source, R.id.forget_confirm_new_password_til, "field 'mForgotPassword2TextViewTil'", TextInputLayout.class);
    target.mForgotPassword2TextView = Utils.findRequiredViewAsType(source, R.id.forget_confirm_new_password, "field 'mForgotPassword2TextView'", EditText.class);
    target.mHomeServerTextTil = Utils.findRequiredViewAsType(source, R.id.login_matrix_server_url_til, "field 'mHomeServerTextTil'", TextInputLayout.class);
    target.mHomeServerText = Utils.findRequiredViewAsType(source, R.id.login_matrix_server_url, "field 'mHomeServerText'", EditText.class);
    target.mIdentityServerTextTil = Utils.findRequiredViewAsType(source, R.id.login_identity_url_til, "field 'mIdentityServerTextTil'", TextInputLayout.class);
    target.mIdentityServerText = Utils.findRequiredViewAsType(source, R.id.login_identity_url, "field 'mIdentityServerText'", EditText.class);
    target.mWaitingView = Utils.findRequiredView(source, R.id.flow_ui_mask_login, "field 'mWaitingView'");
    target.mProgressTextView = Utils.findRequiredViewAsType(source, R.id.flow_progress_message_textview, "field 'mProgressTextView'", TextView.class);
    target.mMainLayout = Utils.findRequiredView(source, R.id.main_input_layout, "field 'mMainLayout'");
    target.mHomeServerUrlsLayout = Utils.findRequiredView(source, R.id.login_matrix_server_options_layout, "field 'mHomeServerUrlsLayout'");
    target.mUseCustomHomeServersCheckbox = Utils.findRequiredViewAsType(source, R.id.display_server_url_expand_checkbox, "field 'mUseCustomHomeServersCheckbox'", CheckBox.class);
    target.mThreePidInstructions = Utils.findRequiredViewAsType(source, R.id.instructions, "field 'mThreePidInstructions'", TextView.class);
    target.mEmailAddressTil = Utils.findRequiredViewAsType(source, R.id.registration_email_til, "field 'mEmailAddressTil'", TextInputLayout.class);
    target.mEmailAddress = Utils.findRequiredViewAsType(source, R.id.registration_email, "field 'mEmailAddress'", EditText.class);
    target.mPhoneNumberLayout = Utils.findRequiredView(source, R.id.registration_phone_number, "field 'mPhoneNumberLayout'");
    target.mRegistrationPhoneNumberCountryCode = Utils.findRequiredViewAsType(source, R.id.registration_phone_number_country, "field 'mRegistrationPhoneNumberCountryCode'", EditText.class);
    target.mRegistrationPhoneNumberTil = Utils.findRequiredViewAsType(source, R.id.registration_phone_number_value_til, "field 'mRegistrationPhoneNumberTil'", TextInputLayout.class);
    target.mRegistrationPhoneNumber = Utils.findRequiredViewAsType(source, R.id.registration_phone_number_value, "field 'mRegistrationPhoneNumber'", EditText.class);
    view = Utils.findRequiredView(source, R.id.button_submit_three_pid, "field 'mSubmitThreePidButton' and method 'submitThreePids'");
    target.mSubmitThreePidButton = Utils.castView(view, R.id.button_submit_three_pid, "field 'mSubmitThreePidButton'", Button.class);
    view2131296378 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submitThreePids();
      }
    });
    target.mSkipThreePidButton = Utils.findRequiredViewAsType(source, R.id.button_skip_three_pid, "field 'mSkipThreePidButton'", Button.class);
    target.mHomeServerOptionLayout = Utils.findRequiredView(source, R.id.homeserver_layout, "field 'mHomeServerOptionLayout'");
  }

  @Override
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mMainContainer = null;
    target.mFormContainer = null;
    target.mLoginLayout = null;
    target.mCreationLayout = null;
    target.mForgetPasswordLayout = null;
    target.mThreePidLayout = null;
    target.mLoginButton = null;
    target.mSwitchToRegisterButton = null;
    target.mLoginSsoButton = null;
    target.spinner = null;
    target.mRegisterButton = null;
    target.mSwitchToLoginButton = null;
    target.mForgotPasswordButton = null;
    target.mForgotValidateEmailButton = null;
    target.mLoginEmailTextViewTil = null;
    target.mLoginEmailTextView = null;
    target.mLoginPhoneNumberTil = null;
    target.mLoginPhoneNumber = null;
    target.mLoginPhoneNumberCountryCode = null;
    target.mLoginPasswordTextViewTil = null;
    target.mLoginPasswordTextView = null;
    target.mButtonsView = null;
    target.mCreationUsernameTextViewTil = null;
    target.mCreationUsernameTextView = null;
    target.mCreationPassword1TextViewTil = null;
    target.mCreationPassword1TextView = null;
    target.mCreationPassword2TextViewTil = null;
    target.mCreationPassword2TextView = null;
    target.mPasswordForgottenTxtView = null;
    target.mForgotEmailTextViewTil = null;
    target.mForgotEmailTextView = null;
    target.mForgotPassword1TextViewTil = null;
    target.mForgotPassword1TextView = null;
    target.mForgotPassword2TextViewTil = null;
    target.mForgotPassword2TextView = null;
    target.mHomeServerTextTil = null;
    target.mHomeServerText = null;
    target.mIdentityServerTextTil = null;
    target.mIdentityServerText = null;
    target.mWaitingView = null;
    target.mProgressTextView = null;
    target.mMainLayout = null;
    target.mHomeServerUrlsLayout = null;
    target.mUseCustomHomeServersCheckbox = null;
    target.mThreePidInstructions = null;
    target.mEmailAddressTil = null;
    target.mEmailAddress = null;
    target.mPhoneNumberLayout = null;
    target.mRegistrationPhoneNumberCountryCode = null;
    target.mRegistrationPhoneNumberTil = null;
    target.mRegistrationPhoneNumber = null;
    target.mSubmitThreePidButton = null;
    target.mSkipThreePidButton = null;
    target.mHomeServerOptionLayout = null;

    view2131296372.setOnClickListener(null);
    view2131296372 = null;
    view2131296380.setOnClickListener(null);
    view2131296380 = null;
    view2131296373.setOnClickListener(null);
    view2131296373 = null;
    view2131296374.setOnClickListener(null);
    view2131296374 = null;
    view2131296379.setOnClickListener(null);
    view2131296379 = null;
    view2131296375.setOnClickListener(null);
    view2131296375 = null;
    view2131296378.setOnClickListener(null);
    view2131296378 = null;

    super.unbind();
  }
}
