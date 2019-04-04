// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments.troubleshoot;

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

public final class NotificationTroubleshootRecyclerViewAdapter$ViewHolder_ViewBinding implements Unbinder {
  private NotificationTroubleshootRecyclerViewAdapter.ViewHolder target;

  @UiThread
  public NotificationTroubleshootRecyclerViewAdapter$ViewHolder_ViewBinding(
      NotificationTroubleshootRecyclerViewAdapter.ViewHolder target, View source) {
    this.target = target;

    target.titleText = Utils.findRequiredViewAsType(source, R.id.troubleshootTestTitle, "field 'titleText'", TextView.class);
    target.descriptionText = Utils.findRequiredViewAsType(source, R.id.troubleshootTestDescription, "field 'descriptionText'", TextView.class);
    target.statusIconImage = Utils.findRequiredViewAsType(source, R.id.troubleshootStatusIcon, "field 'statusIconImage'", ImageView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.troubleshootProgressBar, "field 'progressBar'", ProgressBar.class);
    target.fixButton = Utils.findRequiredViewAsType(source, R.id.troubleshootTestButton, "field 'fixButton'", Button.class);
  }

  @Override
  public void unbind() {
    NotificationTroubleshootRecyclerViewAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleText = null;
    target.descriptionText = null;
    target.statusIconImage = null;
    target.progressBar = null;
    target.fixButton = null;
  }
}
