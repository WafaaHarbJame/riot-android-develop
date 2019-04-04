// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments.keysbackup.settings;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class KeysBackupSettingsFragment_ViewBinding implements Unbinder {
  private KeysBackupSettingsFragment target;

  @UiThread
  public KeysBackupSettingsFragment_ViewBinding(KeysBackupSettingsFragment target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.keys_backup_settings_recycler_view, "field 'recyclerView'", RecyclerView.class);
  }

  @Override
  public void unbind() {
    KeysBackupSettingsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
  }
}
