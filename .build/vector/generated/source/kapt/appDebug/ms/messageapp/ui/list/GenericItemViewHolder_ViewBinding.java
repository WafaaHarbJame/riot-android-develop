// Generated code from Butter Knife. Do not modify!
package ms.messageapp.ui.list;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class GenericItemViewHolder_ViewBinding implements Unbinder {
  private GenericItemViewHolder target;

  @UiThread
  public GenericItemViewHolder_ViewBinding(GenericItemViewHolder target, View source) {
    this.target = target;

    target.titleText = Utils.findRequiredViewAsType(source, R.id.item_generic_title_text, "field 'titleText'", TextView.class);
    target.descriptionText = Utils.findRequiredViewAsType(source, R.id.item_generic_description_text, "field 'descriptionText'", TextView.class);
    target.accessoryImage = Utils.findRequiredViewAsType(source, R.id.item_generic_accessory_image, "field 'accessoryImage'", ImageView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.item_generic_progress_bar, "field 'progressBar'", ProgressBar.class);
    target.actionButton = Utils.findRequiredViewAsType(source, R.id.item_generic_action_button, "field 'actionButton'", Button.class);
  }

  @Override
  public void unbind() {
    GenericItemViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleText = null;
    target.descriptionText = null;
    target.accessoryImage = null;
    target.progressBar = null;
    target.actionButton = null;
  }
}
