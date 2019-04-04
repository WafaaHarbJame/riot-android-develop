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

public class GroupViewHolder_ViewBinding implements Unbinder {
  private GroupViewHolder target;

  @UiThread
  public GroupViewHolder_ViewBinding(GroupViewHolder target, View source) {
    this.target = target;

    target.vGroupAvatar = Utils.findRequiredViewAsType(source, R.id.group_avatar, "field 'vGroupAvatar'", ImageView.class);
    target.vGroupName = Utils.findRequiredViewAsType(source, R.id.group_name, "field 'vGroupName'", TextView.class);
    target.vGroupTopic = Utils.findOptionalViewAsType(source, R.id.group_topic, "field 'vGroupTopic'", TextView.class);
    target.vGroupMembersCount = Utils.findRequiredViewAsType(source, R.id.group_members_count, "field 'vGroupMembersCount'", TextView.class);
    target.vGroupMoreActionClickArea = source.findViewById(R.id.group_more_action_click_area);
    target.vGroupMoreActionAnchor = source.findViewById(R.id.group_more_action_anchor);
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vGroupAvatar = null;
    target.vGroupName = null;
    target.vGroupTopic = null;
    target.vGroupMembersCount = null;
    target.vGroupMoreActionClickArea = null;
    target.vGroupMoreActionAnchor = null;
  }
}
