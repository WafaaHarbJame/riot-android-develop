// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class SimpleFragmentActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private SimpleFragmentActivity target;

  @UiThread
  public SimpleFragmentActivity_ViewBinding(SimpleFragmentActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SimpleFragmentActivity_ViewBinding(SimpleFragmentActivity target, View source) {
    super(target, source);

    this.target = target;

    target.waitingCircularProgress = Utils.findRequiredView(source, R.id.waiting_view_status_circular_progress, "field 'waitingCircularProgress'");
    target.waitingStatusText = Utils.findRequiredViewAsType(source, R.id.waiting_view_status_text, "field 'waitingStatusText'", TextView.class);
    target.waitingHorizontalProgress = Utils.findRequiredViewAsType(source, R.id.waiting_view_status_horizontal_progress, "field 'waitingHorizontalProgress'", ProgressBar.class);
  }

  @Override
  public void unbind() {
    SimpleFragmentActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.waitingCircularProgress = null;
    target.waitingStatusText = null;
    target.waitingHorizontalProgress = null;

    super.unbind();
  }
}
