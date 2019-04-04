// Generated code from Butter Knife. Do not modify!
package ms.messageapp.dialogs;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class DialogListItemHolder_ViewBinding implements Unbinder {
  private DialogListItemHolder target;

  @UiThread
  public DialogListItemHolder_ViewBinding(DialogListItemHolder target, View source) {
    this.target = target;

    target.icon = Utils.findRequiredViewAsType(source, R.id.adapter_item_dialog_icon, "field 'icon'", ImageView.class);
    target.text = Utils.findRequiredViewAsType(source, R.id.adapter_item_dialog_text, "field 'text'", TextView.class);
  }

  @Override
  public void unbind() {
    DialogListItemHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.icon = null;
    target.text = null;
  }
}
