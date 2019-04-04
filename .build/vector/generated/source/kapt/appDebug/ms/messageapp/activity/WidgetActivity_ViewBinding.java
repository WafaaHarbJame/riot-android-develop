// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class WidgetActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private WidgetActivity target;

  private View view2131297288;

  private View view2131297287;

  @UiThread
  public WidgetActivity_ViewBinding(WidgetActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WidgetActivity_ViewBinding(final WidgetActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.widget_close_icon, "field 'mCloseWidgetIcon' and method 'onCloseClick$vector_appDebug'");
    target.mCloseWidgetIcon = view;
    view2131297288 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCloseClick$vector_appDebug();
      }
    });
    target.mWidgetWebView = Utils.findRequiredViewAsType(source, R.id.widget_web_view, "field 'mWidgetWebView'", WebView.class);
    target.mWidgetTypeTextView = Utils.findRequiredViewAsType(source, R.id.widget_title, "field 'mWidgetTypeTextView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.widget_back_icon, "method 'onBackClicked$vector_appDebug'");
    view2131297287 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBackClicked$vector_appDebug();
      }
    });
  }

  @Override
  public void unbind() {
    WidgetActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCloseWidgetIcon = null;
    target.mWidgetWebView = null;
    target.mWidgetTypeTextView = null;

    view2131297288.setOnClickListener(null);
    view2131297288 = null;
    view2131297287.setOnClickListener(null);
    view2131297287 = null;

    super.unbind();
  }
}
