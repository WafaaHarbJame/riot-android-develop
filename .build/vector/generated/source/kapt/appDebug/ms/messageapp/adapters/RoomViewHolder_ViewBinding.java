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

public class RoomViewHolder_ViewBinding implements Unbinder {
  private RoomViewHolder target;

  @UiThread
  public RoomViewHolder_ViewBinding(RoomViewHolder target, View source) {
    this.target = target;

    target.vRoomAvatar = Utils.findRequiredViewAsType(source, R.id.room_avatar, "field 'vRoomAvatar'", ImageView.class);
    target.vRoomName = Utils.findRequiredViewAsType(source, R.id.room_name, "field 'vRoomName'", TextView.class);
    target.vRoomNameServer = Utils.findOptionalViewAsType(source, R.id.room_name_server, "field 'vRoomNameServer'", TextView.class);
    target.vRoomLastMessage = Utils.findOptionalViewAsType(source, R.id.room_message, "field 'vRoomLastMessage'", TextView.class);
    target.vRoomTimestamp = Utils.findOptionalViewAsType(source, R.id.room_update_date, "field 'vRoomTimestamp'", TextView.class);
    target.vRoomUnreadIndicator = source.findViewById(R.id.indicator_unread_message);
    target.vRoomUnreadCount = Utils.findRequiredViewAsType(source, R.id.room_unread_count, "field 'vRoomUnreadCount'", TextView.class);
    target.mDirectChatIndicator = source.findViewById(R.id.direct_chat_indicator);
    target.vRoomEncryptedIcon = Utils.findRequiredView(source, R.id.room_avatar_encrypted_icon, "field 'vRoomEncryptedIcon'");
    target.vRoomMoreActionClickArea = source.findViewById(R.id.room_more_action_click_area);
    target.vRoomMoreActionAnchor = source.findViewById(R.id.room_more_action_anchor);
  }

  @Override
  @CallSuper
  public void unbind() {
    RoomViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vRoomAvatar = null;
    target.vRoomName = null;
    target.vRoomNameServer = null;
    target.vRoomLastMessage = null;
    target.vRoomTimestamp = null;
    target.vRoomUnreadIndicator = null;
    target.vRoomUnreadCount = null;
    target.mDirectChatIndicator = null;
    target.vRoomEncryptedIcon = null;
    target.vRoomMoreActionClickArea = null;
    target.vRoomMoreActionAnchor = null;
  }
}
