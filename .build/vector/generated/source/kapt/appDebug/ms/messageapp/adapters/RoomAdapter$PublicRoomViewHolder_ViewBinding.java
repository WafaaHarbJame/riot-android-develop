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

public class RoomAdapter$PublicRoomViewHolder_ViewBinding implements Unbinder {
  private RoomAdapter.PublicRoomViewHolder target;

  @UiThread
  public RoomAdapter$PublicRoomViewHolder_ViewBinding(RoomAdapter.PublicRoomViewHolder target,
      View source) {
    this.target = target;

    target.vPublicRoomAvatar = Utils.findRequiredViewAsType(source, R.id.public_room_avatar, "field 'vPublicRoomAvatar'", ImageView.class);
    target.vPublicRoomName = Utils.findRequiredViewAsType(source, R.id.public_room_name, "field 'vPublicRoomName'", TextView.class);
    target.vRoomTopic = Utils.findRequiredViewAsType(source, R.id.public_room_topic, "field 'vRoomTopic'", TextView.class);
    target.vPublicRoomsMemberCountTextView = Utils.findRequiredViewAsType(source, R.id.public_room_members_count, "field 'vPublicRoomsMemberCountTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RoomAdapter.PublicRoomViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vPublicRoomAvatar = null;
    target.vPublicRoomName = null;
    target.vRoomTopic = null;
    target.vPublicRoomsMemberCountTextView = null;
  }
}
