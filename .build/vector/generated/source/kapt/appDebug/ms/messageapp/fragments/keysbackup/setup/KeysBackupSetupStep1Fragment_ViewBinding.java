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

public final class KeysBackupSetupStep1Fragment_ViewBinding implements Unbinder {
  private KeysBackupSetupStep1Fragment target;

  private View view2131296732;

  private View view2131296730;

  @UiThread
  public KeysBackupSetupStep1Fragment_ViewBinding(final KeysBackupSetupStep1Fragment target,
      View source) {
    this.target = target;

    View view;
    target.advancedOptionText = Utils.findRequiredViewAsType(source, R.id.keys_backup_setup_step1_advanced, "field 'advancedOptionText'", TextView.class);
    view = Utils.findRequiredView(source, R.id.keys_backup_setup_step1_manualExport, "field 'manualExportButton' and method 'onManualExportClick'");
    target.manualExportButton = Utils.castView(view, R.id.keys_backup_setup_step1_manualExport, "field 'manualExportButton'", Button.class);
    view2131296732 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onManualExportClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.keys_backup_setup_step1_button, "method 'onButtonClick'");
    view2131296730 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onButtonClick();
      }
    });
  }

  @Override
  public void unbind() {
    KeysBackupSetupStep1Fragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.advancedOptionText = null;
    target.manualExportButton = null;

    view2131296732.setOnClickListener(null);
    view2131296732 = null;
    view2131296730.setOnClickListener(null);
    view2131296730 = null;
  }
}
