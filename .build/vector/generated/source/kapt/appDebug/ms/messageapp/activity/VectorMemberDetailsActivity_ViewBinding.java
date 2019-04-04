// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class VectorMemberDetailsActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private VectorMemberDetailsActivity target;

  private View view2131296866;

  private View view2131296870;

  @UiThread
  public VectorMemberDetailsActivity_ViewBinding(VectorMemberDetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VectorMemberDetailsActivity_ViewBinding(final VectorMemberDetailsActivity target,
      View source) {
    super(target, source);

    this.target = target;

    View view;
    target.mMemberAvatarImageView = Utils.findRequiredViewAsType(source, R.id.member_detail_avatar, "field 'mMemberAvatarImageView'", ImageView.class);
    target.mMemberAvatarBadgeImageView = Utils.findRequiredViewAsType(source, R.id.member_avatar_badge, "field 'mMemberAvatarBadgeImageView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.member_details_display_name, "field 'mMemberDisplayNameTextView' and method 'onUserInfoClicked'");
    target.mMemberDisplayNameTextView = Utils.castView(view, R.id.member_details_display_name, "field 'mMemberDisplayNameTextView'", TextView.class);
    view2131296866 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onUserInfoClicked(Utils.<TextView>castParam(p0, "doClick", 0, "onUserInfoClicked", 0));
      }
    });
    view = Utils.findRequiredView(source, R.id.member_details_user_id, "field 'mMemberUserIdTextView' and method 'onUserInfoClicked'");
    target.mMemberUserIdTextView = Utils.castView(view, R.id.member_details_user_id, "field 'mMemberUserIdTextView'", TextView.class);
    view2131296870 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onUserInfoClicked(Utils.<TextView>castParam(p0, "doClick", 0, "onUserInfoClicked", 0));
      }
    });
    target.mPresenceTextView = Utils.findRequiredViewAsType(source, R.id.member_details_presence, "field 'mPresenceTextView'", TextView.class);
    target.mExpandableListView = Utils.findRequiredViewAsType(source, R.id.member_details_actions_list_view, "field 'mExpandableListView'", ExpandableListView.class);
    target.mDevicesListView = Utils.findRequiredViewAsType(source, R.id.member_details_devices_list_view, "field 'mDevicesListView'", ListView.class);
    target.mDevicesListHeaderView = Utils.findRequiredView(source, R.id.devices_header_view, "field 'mDevicesListHeaderView'");
  }

  @Override
  public void unbind() {
    VectorMemberDetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mMemberAvatarImageView = null;
    target.mMemberAvatarBadgeImageView = null;
    target.mMemberDisplayNameTextView = null;
    target.mMemberUserIdTextView = null;
    target.mPresenceTextView = null;
    target.mExpandableListView = null;
    target.mDevicesListView = null;
    target.mDevicesListHeaderView = null;

    view2131296866.setOnClickListener(null);
    view2131296866 = null;
    view2131296870.setOnClickListener(null);
    view2131296870 = null;

    super.unbind();
  }
}
