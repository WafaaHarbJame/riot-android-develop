// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ExpandableListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class VectorSearchPeopleListFragment_ViewBinding implements Unbinder {
  private VectorSearchPeopleListFragment target;

  @UiThread
  public VectorSearchPeopleListFragment_ViewBinding(VectorSearchPeopleListFragment target,
      View source) {
    this.target = target;

    target.mPeopleListView = Utils.findRequiredViewAsType(source, R.id.search_people_list, "field 'mPeopleListView'", ExpandableListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VectorSearchPeopleListFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPeopleListView = null;
  }
}
