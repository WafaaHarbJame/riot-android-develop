// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class AbstractWidgetActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private AbstractWidgetActivity target;

  @UiThread
  public AbstractWidgetActivity_ViewBinding(AbstractWidgetActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AbstractWidgetActivity_ViewBinding(AbstractWidgetActivity target, View source) {
    super(target, source);

    this.target = target;

    target.mWebView = Utils.findRequiredViewAsType(source, R.id.widget_webview, "field 'mWebView'", WebView.class);
  }

  @Override
  public void unbind() {
    AbstractWidgetActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mWebView = null;

    super.unbind();
  }
}
