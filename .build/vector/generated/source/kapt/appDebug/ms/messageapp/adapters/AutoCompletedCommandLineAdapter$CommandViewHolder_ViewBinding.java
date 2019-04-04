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

public class AutoCompletedCommandLineAdapter$CommandViewHolder_ViewBinding implements Unbinder {
  private AutoCompletedCommandLineAdapter.CommandViewHolder target;

  @UiThread
  public AutoCompletedCommandLineAdapter$CommandViewHolder_ViewBinding(
      AutoCompletedCommandLineAdapter.CommandViewHolder target, View source) {
    this.target = target;

    target.tvCommandName = Utils.findRequiredViewAsType(source, R.id.item_command_auto_complete_name, "field 'tvCommandName'", TextView.class);
    target.tvCommandParameter = Utils.findRequiredViewAsType(source, R.id.item_command_auto_complete_parameter, "field 'tvCommandParameter'", TextView.class);
    target.tvCommandDescription = Utils.findRequiredViewAsType(source, R.id.item_command_auto_complete_description, "field 'tvCommandDescription'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AutoCompletedCommandLineAdapter.CommandViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvCommandName = null;
    target.tvCommandParameter = null;
    target.tvCommandDescription = null;
  }
}
