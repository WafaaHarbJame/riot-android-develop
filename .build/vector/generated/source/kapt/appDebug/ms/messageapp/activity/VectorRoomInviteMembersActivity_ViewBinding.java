// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ExpandableListView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class VectorRoomInviteMembersActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private VectorRoomInviteMembersActivity target;

  private View view2131297120;

  @UiThread
  public VectorRoomInviteMembersActivity_ViewBinding(VectorRoomInviteMembersActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VectorRoomInviteMembersActivity_ViewBinding(final VectorRoomInviteMembersActivity target,
      View source) {
    super(target, source);

    this.target = target;

    View view;
    target.mListView = Utils.findRequiredViewAsType(source, R.id.room_details_members_list, "field 'mListView'", ExpandableListView.class);
    view = Utils.findRequiredView(source, R.id.search_invite_by_id, "method 'displayInviteByUserId'");
    view2131297120 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.displayInviteByUserId();
      }
    });
  }

  @Override
  public void unbind() {
    VectorRoomInviteMembersActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mListView = null;

    view2131297120.setOnClickListener(null);
    view2131297120 = null;

    super.unbind();
  }
}
