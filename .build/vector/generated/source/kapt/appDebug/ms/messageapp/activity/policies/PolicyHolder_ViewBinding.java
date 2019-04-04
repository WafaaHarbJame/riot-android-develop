// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity.policies;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class PolicyHolder_ViewBinding implements Unbinder {
  private PolicyHolder target;

  @UiThread
  public PolicyHolder_ViewBinding(PolicyHolder target, View source) {
    this.target = target;

    target.checkbox = Utils.findRequiredViewAsType(source, R.id.adapter_item_policy_checkbox, "field 'checkbox'", CheckBox.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.adapter_item_policy_title, "field 'title'", TextView.class);
  }

  @Override
  public void unbind() {
    PolicyHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.checkbox = null;
    target.title = null;
  }
}
