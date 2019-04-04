// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;
import ms.messageapp.view.HomeSectionView;

public class HomeFragment_ViewBinding implements Unbinder {
  private HomeFragment target;

  @UiThread
  public HomeFragment_ViewBinding(HomeFragment target, View source) {
    this.target = target;

    target.mNestedScrollView = Utils.findRequiredViewAsType(source, R.id.nested_scrollview, "field 'mNestedScrollView'", NestedScrollView.class);
    target.mInvitationsSection = Utils.findRequiredViewAsType(source, R.id.invitations_section, "field 'mInvitationsSection'", HomeSectionView.class);
    target.mFavouritesSection = Utils.findRequiredViewAsType(source, R.id.favourites_section, "field 'mFavouritesSection'", HomeSectionView.class);
    target.mDirectChatsSection = Utils.findRequiredViewAsType(source, R.id.direct_chats_section, "field 'mDirectChatsSection'", HomeSectionView.class);
    target.mServerNoticesSection = Utils.findRequiredViewAsType(source, R.id.server_notices_section, "field 'mServerNoticesSection'", HomeSectionView.class);
    target.mRoomsSection = Utils.findRequiredViewAsType(source, R.id.rooms_section, "field 'mRoomsSection'", HomeSectionView.class);
    target.mLowPrioritySection = Utils.findRequiredViewAsType(source, R.id.low_priority_section, "field 'mLowPrioritySection'", HomeSectionView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mNestedScrollView = null;
    target.mInvitationsSection = null;
    target.mFavouritesSection = null;
    target.mDirectChatsSection = null;
    target.mServerNoticesSection = null;
    target.mRoomsSection = null;
    target.mLowPrioritySection = null;
  }
}
