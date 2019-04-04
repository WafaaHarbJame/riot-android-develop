// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments;

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

public class GroupDetailsHomeFragment_ViewBinding implements Unbinder {
  private GroupDetailsHomeFragment target;

  @UiThread
  public GroupDetailsHomeFragment_ViewBinding(GroupDetailsHomeFragment target, View source) {
    this.target = target;

    target.mGroupAvatar = Utils.findRequiredViewAsType(source, R.id.group_avatar, "field 'mGroupAvatar'", ImageView.class);
    target.mGroupNameTextView = Utils.findRequiredViewAsType(source, R.id.group_name_text_view, "field 'mGroupNameTextView'", TextView.class);
    target.mGroupTopicTextView = Utils.findRequiredViewAsType(source, R.id.group_topic_text_view, "field 'mGroupTopicTextView'", TextView.class);
    target.mGroupMembersIconView = Utils.findRequiredViewAsType(source, R.id.group_members_icon_view, "field 'mGroupMembersIconView'", ImageView.class);
    target.mGroupMembersTextView = Utils.findRequiredViewAsType(source, R.id.group_members_text_view, "field 'mGroupMembersTextView'", TextView.class);
    target.mGroupRoomsIconView = Utils.findRequiredViewAsType(source, R.id.group_rooms_icon_view, "field 'mGroupRoomsIconView'", ImageView.class);
    target.mGroupRoomsTextView = Utils.findRequiredViewAsType(source, R.id.group_rooms_text_view, "field 'mGroupRoomsTextView'", TextView.class);
    target.mGroupHtmlTextView = Utils.findRequiredViewAsType(source, R.id.html_text_view, "field 'mGroupHtmlTextView'", TextView.class);
    target.noLongDescriptionTextView = Utils.findRequiredViewAsType(source, R.id.no_html_text_view, "field 'noLongDescriptionTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupDetailsHomeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mGroupAvatar = null;
    target.mGroupNameTextView = null;
    target.mGroupTopicTextView = null;
    target.mGroupMembersIconView = null;
    target.mGroupMembersTextView = null;
    target.mGroupRoomsIconView = null;
    target.mGroupRoomsTextView = null;
    target.mGroupHtmlTextView = null;
    target.noLongDescriptionTextView = null;
  }
}
