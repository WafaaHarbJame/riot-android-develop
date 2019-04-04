// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.getbase.floatingactionbutton.AddFloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;
import ms.messageapp.view.KeysBackupBanner;
import ms.messageapp.view.VectorPendingCallView;

public class VectorHomeActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private VectorHomeActivity target;

  private View view2131296377;

  private View view2131296368;

  private View view2131296371;

  private View view2131296550;

  @UiThread
  public VectorHomeActivity_ViewBinding(VectorHomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VectorHomeActivity_ViewBinding(final VectorHomeActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.mKeysBackupBanner = Utils.findRequiredViewAsType(source, R.id.home_keys_backup_banner, "field 'mKeysBackupBanner'", KeysBackupBanner.class);
    target.mFloatingActionsMenu = Utils.findRequiredViewAsType(source, R.id.floating_action_menu, "field 'mFloatingActionsMenu'", FloatingActionsMenu.class);
    target.mFabMain = Utils.findRequiredViewAsType(source, R.id.fab_expand_menu_button, "field 'mFabMain'", AddFloatingActionButton.class);
    view = Utils.findRequiredView(source, R.id.button_start_chat, "field 'mFabStartChat' and method 'fabMenuStartChat'");
    target.mFabStartChat = Utils.castView(view, R.id.button_start_chat, "field 'mFabStartChat'", FloatingActionButton.class);
    view2131296377 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.fabMenuStartChat();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_create_room, "field 'mFabCreateRoom' and method 'fabMenuCreateRoom'");
    target.mFabCreateRoom = Utils.castView(view, R.id.button_create_room, "field 'mFabCreateRoom'", FloatingActionButton.class);
    view2131296368 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.fabMenuCreateRoom();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_join_room, "field 'mFabJoinRoom' and method 'fabMenuJoinRoom'");
    target.mFabJoinRoom = Utils.castView(view, R.id.button_join_room, "field 'mFabJoinRoom'", FloatingActionButton.class);
    view2131296371 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.fabMenuJoinRoom();
      }
    });
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.home_toolbar, "field 'mToolbar'", Toolbar.class);
    target.mDrawerLayout = Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'mDrawerLayout'", DrawerLayout.class);
    target.mBottomNavigationView = Utils.findRequiredViewAsType(source, R.id.bottom_navigation, "field 'mBottomNavigationView'", BottomNavigationView.class);
    target.navigationView = Utils.findRequiredViewAsType(source, R.id.navigation_view, "field 'navigationView'", NavigationView.class);
    target.mVectorPendingCallView = Utils.findRequiredViewAsType(source, R.id.listView_pending_callview, "field 'mVectorPendingCallView'", VectorPendingCallView.class);
    target.mSyncInProgressView = Utils.findRequiredViewAsType(source, R.id.home_recents_sync_in_progress, "field 'mSyncInProgressView'", ProgressBar.class);
    target.mSearchView = Utils.findRequiredViewAsType(source, R.id.home_search_view, "field 'mSearchView'", SearchView.class);
    view = Utils.findRequiredView(source, R.id.floating_action_menu_touch_guard, "field 'touchGuard' and method 'touchGuardClicked'");
    target.touchGuard = view;
    view2131296550 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.touchGuardClicked();
      }
    });
  }

  @Override
  public void unbind() {
    VectorHomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mKeysBackupBanner = null;
    target.mFloatingActionsMenu = null;
    target.mFabMain = null;
    target.mFabStartChat = null;
    target.mFabCreateRoom = null;
    target.mFabJoinRoom = null;
    target.mToolbar = null;
    target.mDrawerLayout = null;
    target.mBottomNavigationView = null;
    target.navigationView = null;
    target.mVectorPendingCallView = null;
    target.mSyncInProgressView = null;
    target.mSearchView = null;
    target.touchGuard = null;

    view2131296377.setOnClickListener(null);
    view2131296377 = null;
    view2131296368.setOnClickListener(null);
    view2131296368 = null;
    view2131296371.setOnClickListener(null);
    view2131296371 = null;
    view2131296550.setOnClickListener(null);
    view2131296550 = null;

    super.unbind();
  }
}
