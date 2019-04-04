// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class LoggingOutActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private LoggingOutActivity target;

  @UiThread
  public LoggingOutActivity_ViewBinding(LoggingOutActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoggingOutActivity_ViewBinding(LoggingOutActivity target, View source) {
    super(target, source);

    this.target = target;

    target.animatedLogo = Utils.findRequiredViewAsType(source, R.id.animated_logo_image_view, "field 'animatedLogo'", ImageView.class);
  }

  @Override
  public void unbind() {
    LoggingOutActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.animatedLogo = null;

    super.unbind();
  }
}
