// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class FallbackAuthenticationActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private FallbackAuthenticationActivity target;

  @UiThread
  public FallbackAuthenticationActivity_ViewBinding(FallbackAuthenticationActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FallbackAuthenticationActivity_ViewBinding(FallbackAuthenticationActivity target,
      View source) {
    super(target, source);

    this.target = target;

    target.mWebView = Utils.findRequiredViewAsType(source, R.id.fallback_authentication_webview, "field 'mWebView'", WebView.class);
  }

  @Override
  public void unbind() {
    FallbackAuthenticationActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mWebView = null;

    super.unbind();
  }
}
