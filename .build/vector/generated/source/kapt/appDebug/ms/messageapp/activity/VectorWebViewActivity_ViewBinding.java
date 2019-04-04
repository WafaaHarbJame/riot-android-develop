// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class VectorWebViewActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private VectorWebViewActivity target;

  @UiThread
  public VectorWebViewActivity_ViewBinding(VectorWebViewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VectorWebViewActivity_ViewBinding(VectorWebViewActivity target, View source) {
    super(target, source);

    this.target = target;

    target.webView = Utils.findRequiredViewAsType(source, R.id.simple_webview, "field 'webView'", WebView.class);
  }

  @Override
  public void unbind() {
    VectorWebViewActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.webView = null;

    super.unbind();
  }
}
