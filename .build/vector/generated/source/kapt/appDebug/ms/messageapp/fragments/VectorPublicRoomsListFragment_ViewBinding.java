// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class VectorPublicRoomsListFragment_ViewBinding implements Unbinder {
  private VectorPublicRoomsListFragment target;

  @UiThread
  public VectorPublicRoomsListFragment_ViewBinding(VectorPublicRoomsListFragment target,
      View source) {
    this.target = target;

    target.mRecentsListView = Utils.findRequiredViewAsType(source, R.id.fragment_public_rooms_list, "field 'mRecentsListView'", ListView.class);
    target.mInitializationSpinnerView = Utils.findRequiredView(source, R.id.listView_global_spinner_views, "field 'mInitializationSpinnerView'");
    target.mForwardPaginationView = Utils.findRequiredView(source, R.id.listView_forward_spinner_view, "field 'mForwardPaginationView'");
  }

  @Override
  @CallSuper
  public void unbind() {
    VectorPublicRoomsListFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecentsListView = null;
    target.mInitializationSpinnerView = null;
    target.mForwardPaginationView = null;
  }
}
