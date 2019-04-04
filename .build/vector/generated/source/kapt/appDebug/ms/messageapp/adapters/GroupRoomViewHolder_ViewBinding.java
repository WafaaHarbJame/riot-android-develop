// Generated code from Butter Knife. Do not modify!
package ms.messageapp.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class GroupRoomViewHolder_ViewBinding implements Unbinder {
  private GroupRoomViewHolder target;

  @UiThread
  public GroupRoomViewHolder_ViewBinding(GroupRoomViewHolder target, View source) {
    this.target = target;

    target.vContactAvatar = Utils.findRequiredViewAsType(source, R.id.adapter_item_group_contact_avatar, "field 'vContactAvatar'", ImageView.class);
    target.vContactName = Utils.findRequiredViewAsType(source, R.id.contact_name, "field 'vContactName'", TextView.class);
    target.vContactDesc = Utils.findOptionalViewAsType(source, R.id.contact_desc, "field 'vContactDesc'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupRoomViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vContactAvatar = null;
    target.vContactName = null;
    target.vContactDesc = null;
  }
}
