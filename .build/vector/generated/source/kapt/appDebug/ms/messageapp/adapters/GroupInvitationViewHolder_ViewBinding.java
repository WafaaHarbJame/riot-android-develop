// Generated code from Butter Knife. Do not modify!
package ms.messageapp.adapters;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class GroupInvitationViewHolder_ViewBinding extends GroupViewHolder_ViewBinding {
  private GroupInvitationViewHolder target;

  @UiThread
  public GroupInvitationViewHolder_ViewBinding(GroupInvitationViewHolder target, View source) {
    super(target, source);

    this.target = target;

    target.vRejectButton = Utils.findRequiredViewAsType(source, R.id.group_invite_reject_button, "field 'vRejectButton'", Button.class);
    target.vJoinButton = Utils.findRequiredViewAsType(source, R.id.group_invite_join_button, "field 'vJoinButton'", Button.class);
  }

  @Override
  public void unbind() {
    GroupInvitationViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vRejectButton = null;
    target.vJoinButton = null;

    super.unbind();
  }
}
