// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments.keysbackup.setup;

import android.support.annotation.UiThread;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;
import ms.messageapp.view.PasswordStrengthBar;

public final class KeysBackupSetupStep2Fragment_ViewBinding implements Unbinder {
  private KeysBackupSetupStep2Fragment target;

  private View view2131296710;

  private TextWatcher view2131296710TextWatcher;

  private View view2131296745;

  private View view2131296708;

  private TextWatcher view2131296708TextWatcher;

  private View view2131296734;

  private View view2131296735;

  @UiThread
  public KeysBackupSetupStep2Fragment_ViewBinding(final KeysBackupSetupStep2Fragment target,
      View source) {
    this.target = target;

    View view;
    target.rootGroup = Utils.findRequiredViewAsType(source, R.id.keys_backup_root, "field 'rootGroup'", ViewGroup.class);
    view = Utils.findRequiredView(source, R.id.keys_backup_passphrase_enter_edittext, "field 'mPassphraseTextEdit' and method 'onPassphraseChanged'");
    target.mPassphraseTextEdit = Utils.castView(view, R.id.keys_backup_passphrase_enter_edittext, "field 'mPassphraseTextEdit'", EditText.class);
    view2131296710 = view;
    view2131296710TextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        target.onPassphraseChanged();
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
      }
    };
    ((TextView) view).addTextChangedListener(view2131296710TextWatcher);
    target.mPassphraseInputLayout = Utils.findRequiredViewAsType(source, R.id.keys_backup_passphrase_enter_til, "field 'mPassphraseInputLayout'", TextInputLayout.class);
    view = Utils.findRequiredView(source, R.id.keys_backup_view_show_password, "field 'mPassphraseReveal' and method 'toggleVisibilityMode'");
    target.mPassphraseReveal = Utils.castView(view, R.id.keys_backup_view_show_password, "field 'mPassphraseReveal'", ImageView.class);
    view2131296745 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toggleVisibilityMode();
      }
    });
    view = Utils.findRequiredView(source, R.id.keys_backup_passphrase_confirm_edittext, "field 'mPassphraseConfirmTextEdit' and method 'onConfirmPassphraseChanged'");
    target.mPassphraseConfirmTextEdit = Utils.castView(view, R.id.keys_backup_passphrase_confirm_edittext, "field 'mPassphraseConfirmTextEdit'", EditText.class);
    view2131296708 = view;
    view2131296708TextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        target.onConfirmPassphraseChanged();
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
      }
    };
    ((TextView) view).addTextChangedListener(view2131296708TextWatcher);
    target.mPassphraseConfirmInputLayout = Utils.findRequiredViewAsType(source, R.id.keys_backup_passphrase_confirm_til, "field 'mPassphraseConfirmInputLayout'", TextInputLayout.class);
    target.mPassphraseProgressLevel = Utils.findRequiredViewAsType(source, R.id.keys_backup_passphrase_security_progress, "field 'mPassphraseProgressLevel'", PasswordStrengthBar.class);
    view = Utils.findRequiredView(source, R.id.keys_backup_setup_step2_button, "method 'doNext'");
    view2131296734 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.doNext();
      }
    });
    view = Utils.findRequiredView(source, R.id.keys_backup_setup_step2_skip_button, "method 'skipPassphrase'");
    view2131296735 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.skipPassphrase();
      }
    });
  }

  @Override
  public void unbind() {
    KeysBackupSetupStep2Fragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rootGroup = null;
    target.mPassphraseTextEdit = null;
    target.mPassphraseInputLayout = null;
    target.mPassphraseReveal = null;
    target.mPassphraseConfirmTextEdit = null;
    target.mPassphraseConfirmInputLayout = null;
    target.mPassphraseProgressLevel = null;

    ((TextView) view2131296710).removeTextChangedListener(view2131296710TextWatcher);
    view2131296710TextWatcher = null;
    view2131296710 = null;
    view2131296745.setOnClickListener(null);
    view2131296745 = null;
    ((TextView) view2131296708).removeTextChangedListener(view2131296708TextWatcher);
    view2131296708TextWatcher = null;
    view2131296708 = null;
    view2131296734.setOnClickListener(null);
    view2131296734 = null;
    view2131296735.setOnClickListener(null);
    view2131296735 = null;
  }
}
