// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments.keysbackup.settings;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class KeysBackupSettingsRecyclerViewAdapter$FooterViewHolder_ViewBinding implements Unbinder {
  private KeysBackupSettingsRecyclerViewAdapter.FooterViewHolder target;

  @UiThread
  public KeysBackupSettingsRecyclerViewAdapter$FooterViewHolder_ViewBinding(
      KeysBackupSettingsRecyclerViewAdapter.FooterViewHolder target, View source) {
    this.target = target;

    target.button1 = Utils.findRequiredViewAsType(source, R.id.keys_backup_settings_footer_button1, "field 'button1'", Button.class);
    target.button2 = Utils.findRequiredViewAsType(source, R.id.keys_backup_settings_footer_button2, "field 'button2'", Button.class);
  }

  @Override
  public void unbind() {
    KeysBackupSettingsRecyclerViewAdapter.FooterViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.button1 = null;
    target.button2 = null;
  }
}
