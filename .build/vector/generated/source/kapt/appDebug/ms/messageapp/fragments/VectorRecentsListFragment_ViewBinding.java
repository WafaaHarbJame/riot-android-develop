// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;
import ms.messageapp.view.RecentsExpandableListView;

public class VectorRecentsListFragment_ViewBinding implements Unbinder {
  private VectorRecentsListFragment target;

  @UiThread
  public VectorRecentsListFragment_ViewBinding(VectorRecentsListFragment target, View source) {
    this.target = target;

    target.mRecentsListView = Utils.findRequiredViewAsType(source, R.id.fragment_recents_list, "field 'mRecentsListView'", RecentsExpandableListView.class);
    target.mWaitingView = Utils.findRequiredView(source, R.id.listView_spinner_views, "field 'mWaitingView'");
    target.mSelectedCellLayout = Utils.findRequiredViewAsType(source, R.id.fragment_recents_selected_cell_layout, "field 'mSelectedCellLayout'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VectorRecentsListFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecentsListView = null;
    target.mWaitingView = null;
    target.mSelectedCellLayout = null;
  }
}
