// Generated code from Butter Knife. Do not modify!
package ms.messageapp.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class HomeSectionView_ViewBinding implements Unbinder {
  private HomeSectionView target;

  @UiThread
  public HomeSectionView_ViewBinding(HomeSectionView target) {
    this(target, target);
  }

  @UiThread
  public HomeSectionView_ViewBinding(HomeSectionView target, View source) {
    this.target = target;

    target.mHeader = Utils.findRequiredViewAsType(source, R.id.section_header, "field 'mHeader'", TextView.class);
    target.mBadge = Utils.findRequiredViewAsType(source, R.id.section_badge, "field 'mBadge'", TextView.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.section_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    target.mPlaceHolder = Utils.findRequiredViewAsType(source, R.id.section_placeholder, "field 'mPlaceHolder'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeSectionView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mHeader = null;
    target.mBadge = null;
    target.mRecyclerView = null;
    target.mPlaceHolder = null;
  }
}
