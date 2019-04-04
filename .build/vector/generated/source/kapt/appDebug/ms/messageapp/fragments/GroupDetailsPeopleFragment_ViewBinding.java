// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class GroupDetailsPeopleFragment_ViewBinding implements Unbinder {
  private GroupDetailsPeopleFragment target;

  @UiThread
  public GroupDetailsPeopleFragment_ViewBinding(GroupDetailsPeopleFragment target, View source) {
    this.target = target;

    target.mRecycler = Utils.findRequiredViewAsType(source, R.id.people_recyclerview, "field 'mRecycler'", RecyclerView.class);
    target.mSearchView = Utils.findRequiredViewAsType(source, R.id.people_search_view, "field 'mSearchView'", SearchView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupDetailsPeopleFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecycler = null;
    target.mSearchView = null;
  }
}
