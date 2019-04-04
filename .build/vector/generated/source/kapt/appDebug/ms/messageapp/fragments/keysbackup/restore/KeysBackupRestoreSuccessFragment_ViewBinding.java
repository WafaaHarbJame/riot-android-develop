// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments.keysbackup.restore;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class KeysBackupRestoreSuccessFragment_ViewBinding implements Unbinder {
  private KeysBackupRestoreSuccessFragment target;

  private View view2131296724;

  @UiThread
  public KeysBackupRestoreSuccessFragment_ViewBinding(final KeysBackupRestoreSuccessFragment target,
      View source) {
    this.target = target;

    View view;
    target.mSuccessText = Utils.findRequiredViewAsType(source, R.id.keys_backup_restore_success, "field 'mSuccessText'", TextView.class);
    target.mSuccessDetailsText = Utils.findRequiredViewAsType(source, R.id.keys_backup_restore_success_info, "field 'mSuccessDetailsText'", TextView.class);
    view = Utils.findRequiredView(source, R.id.keys_backup_setup_done_button, "method 'onDone'");
    view2131296724 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onDone();
      }
    });
  }

  @Override
  public void unbind() {
    KeysBackupRestoreSuccessFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSuccessText = null;
    target.mSuccessDetailsText = null;

    view2131296724.setOnClickListener(null);
    view2131296724 = null;
  }
}
