// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class GroupsFragment_ViewBinding implements Unbinder {
  private GroupsFragment target;

  @UiThread
  public GroupsFragment_ViewBinding(GroupsFragment target, View source) {
    this.target = target;

    target.mRecycler = Utils.findRequiredViewAsType(source, R.id.recyclerview, "field 'mRecycler'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecycler = null;
  }
}
