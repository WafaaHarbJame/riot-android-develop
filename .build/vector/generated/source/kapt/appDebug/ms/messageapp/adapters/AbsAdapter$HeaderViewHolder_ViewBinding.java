// Generated code from Butter Knife. Do not modify!
package ms.messageapp.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class AbsAdapter$HeaderViewHolder_ViewBinding implements Unbinder {
  private AbsAdapter.HeaderViewHolder target;

  @UiThread
  public AbsAdapter$HeaderViewHolder_ViewBinding(AbsAdapter.HeaderViewHolder target, View source) {
    this.target = target;

    target.vSectionTitle = Utils.findRequiredViewAsType(source, R.id.section_title, "field 'vSectionTitle'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AbsAdapter.HeaderViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vSectionTitle = null;
  }
}
