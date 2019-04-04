// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments.keysbackup.restore;

import android.support.annotation.UiThread;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
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

public final class KeysBackupRestoreFromPassphraseFragment_ViewBinding implements Unbinder {
  private KeysBackupRestoreFromPassphraseFragment target;

  private View view2131296710;

  private TextWatcher view2131296710TextWatcher;

  private View view2131296745;

  private View view2131296712;

  private View view2131296718;

  @UiThread
  public KeysBackupRestoreFromPassphraseFragment_ViewBinding(
      final KeysBackupRestoreFromPassphraseFragment target, View source) {
    this.target = target;

    View view;
    target.mPassphraseInputLayout = Utils.findRequiredViewAsType(source, R.id.keys_backup_passphrase_enter_til, "field 'mPassphraseInputLayout'", TextInputLayout.class);
    view = Utils.findRequiredView(source, R.id.keys_backup_passphrase_enter_edittext, "field 'mPassphraseTextEdit' and method 'onPassphraseTextEditChange'");
    target.mPassphraseTextEdit = Utils.castView(view, R.id.keys_backup_passphrase_enter_edittext, "field 'mPassphraseTextEdit'", EditText.class);
    view2131296710 = view;
    view2131296710TextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        target.onPassphraseTextEditChange(Utils.<Editable>castParam(p0, "onTextChanged", 0, "onPassphraseTextEditChange", 0));
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
      }
    };
    ((TextView) view).addTextChangedListener(view2131296710TextWatcher);
    view = Utils.findRequiredView(source, R.id.keys_backup_view_show_password, "field 'mPassphraseReveal' and method 'toggleVisibilityMode'");
    target.mPassphraseReveal = Utils.castView(view, R.id.keys_backup_view_show_password, "field 'mPassphraseReveal'", ImageView.class);
    view2131296745 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toggleVisibilityMode();
      }
    });
    view = Utils.findRequiredView(source, R.id.keys_backup_passphrase_help_with_link, "field 'helperTextWithLink' and method 'onUseRecoveryKey'");
    target.helperTextWithLink = Utils.castView(view, R.id.keys_backup_passphrase_help_with_link, "field 'helperTextWithLink'", TextView.class);
    view2131296712 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onUseRecoveryKey();
      }
    });
    view = Utils.findRequiredView(source, R.id.keys_backup_restore_with_passphrase_submit, "method 'onRestoreBackup'");
    view2131296718 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRestoreBackup();
      }
    });
  }

  @Override
  public void unbind() {
    KeysBackupRestoreFromPassphraseFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPassphraseInputLayout = null;
    target.mPassphraseTextEdit = null;
    target.mPassphraseReveal = null;
    target.helperTextWithLink = null;

    ((TextView) view2131296710).removeTextChangedListener(view2131296710TextWatcher);
    view2131296710TextWatcher = null;
    view2131296710 = null;
    view2131296745.setOnClickListener(null);
    view2131296745 = null;
    view2131296712.setOnClickListener(null);
    view2131296712 = null;
    view2131296718.setOnClickListener(null);
    view2131296718 = null;
  }
}
