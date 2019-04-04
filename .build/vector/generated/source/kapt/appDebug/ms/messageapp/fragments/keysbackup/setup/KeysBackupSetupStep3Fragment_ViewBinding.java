// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments.keysbackup.setup;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class KeysBackupSetupStep3Fragment_ViewBinding implements Unbinder {
  private KeysBackupSetupStep3Fragment target;

  private View view2131296738;

  private View view2131296714;

  private View view2131296739;

  @UiThread
  public KeysBackupSetupStep3Fragment_ViewBinding(final KeysBackupSetupStep3Fragment target,
      View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.keys_backup_setup_step3_button, "field 'mFinishButton' and method 'onFinishButtonClicked'");
    target.mFinishButton = Utils.castView(view, R.id.keys_backup_setup_step3_button, "field 'mFinishButton'", Button.class);
    view2131296738 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFinishButtonClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.keys_backup_recovery_key_text, "field 'mRecoveryKeyTextView' and method 'onRecoveryKeyClicked'");
    target.mRecoveryKeyTextView = Utils.castView(view, R.id.keys_backup_recovery_key_text, "field 'mRecoveryKeyTextView'", TextView.class);
    view2131296714 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRecoveryKeyClicked();
      }
    });
    target.mRecoveryKeyLabel2TextView = Utils.findRequiredViewAsType(source, R.id.keys_backup_setup_step3_line2_text, "field 'mRecoveryKeyLabel2TextView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.keys_backup_setup_step3_copy_button, "method 'onCopyButtonClicked'");
    view2131296739 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCopyButtonClicked();
      }
    });
  }

  @Override
  public void unbind() {
    KeysBackupSetupStep3Fragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFinishButton = null;
    target.mRecoveryKeyTextView = null;
    target.mRecoveryKeyLabel2TextView = null;

    view2131296738.setOnClickListener(null);
    view2131296738 = null;
    view2131296714.setOnClickListener(null);
    view2131296714 = null;
    view2131296739.setOnClickListener(null);
    view2131296739 = null;
  }
}
