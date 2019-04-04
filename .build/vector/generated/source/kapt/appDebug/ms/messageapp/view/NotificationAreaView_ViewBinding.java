// Generated code from Butter Knife. Do not modify!
package ms.messageapp.view;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class NotificationAreaView_ViewBinding implements Unbinder {
  private NotificationAreaView target;

  @UiThread
  public NotificationAreaView_ViewBinding(NotificationAreaView target) {
    this(target, target);
  }

  @UiThread
  public NotificationAreaView_ViewBinding(NotificationAreaView target, View source) {
    this.target = target;

    target.imageView = Utils.findRequiredViewAsType(source, R.id.room_notification_icon, "field 'imageView'", ImageView.class);
    target.messageView = Utils.findRequiredViewAsType(source, R.id.room_notification_message, "field 'messageView'", TextView.class);
  }

  @Override
  public void unbind() {
    NotificationAreaView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
    target.messageView = null;
  }
}
