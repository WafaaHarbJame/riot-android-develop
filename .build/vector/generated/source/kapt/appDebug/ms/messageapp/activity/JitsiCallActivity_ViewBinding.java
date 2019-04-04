// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class JitsiCallActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private JitsiCallActivity target;

  @UiThread
  public JitsiCallActivity_ViewBinding(JitsiCallActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public JitsiCallActivity_ViewBinding(JitsiCallActivity target, View source) {
    super(target, source);

    this.target = target;

    target.mBackToAppIcon = Utils.findRequiredView(source, R.id.jsti_back_to_app_icon, "field 'mBackToAppIcon'");
    target.mCloseWidgetIcon = Utils.findRequiredView(source, R.id.jsti_close_widget_icon, "field 'mCloseWidgetIcon'");
    target.mConnectingTextView = Utils.findRequiredView(source, R.id.jsti_connecting_text_view, "field 'mConnectingTextView'");
  }

  @Override
  public void unbind() {
    JitsiCallActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mBackToAppIcon = null;
    target.mCloseWidgetIcon = null;
    target.mConnectingTextView = null;

    super.unbind();
  }
}
