// Generated code from Butter Knife. Do not modify!
package ms.messageapp.adapters;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class RoomInvitationViewHolder_ViewBinding extends RoomViewHolder_ViewBinding {
  private RoomInvitationViewHolder target;

  @UiThread
  public RoomInvitationViewHolder_ViewBinding(RoomInvitationViewHolder target, View source) {
    super(target, source);

    this.target = target;

    target.vRejectButton = Utils.findRequiredViewAsType(source, R.id.room_invite_reject_button, "field 'vRejectButton'", Button.class);
    target.vPreViewButton = Utils.findRequiredViewAsType(source, R.id.room_invite_preview_button, "field 'vPreViewButton'", Button.class);
  }

  @Override
  public void unbind() {
    RoomInvitationViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vRejectButton = null;
    target.vPreViewButton = null;

    super.unbind();
  }
}
