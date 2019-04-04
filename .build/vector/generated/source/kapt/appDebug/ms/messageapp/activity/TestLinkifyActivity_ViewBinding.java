// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class TestLinkifyActivity_ViewBinding implements Unbinder {
  private TestLinkifyActivity target;

  @UiThread
  public TestLinkifyActivity_ViewBinding(TestLinkifyActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TestLinkifyActivity_ViewBinding(TestLinkifyActivity target, View source) {
    this.target = target;

    target.scrollContent = Utils.findRequiredViewAsType(source, R.id.test_linkify_content_view, "field 'scrollContent'", LinearLayout.class);
    target.coordinatorLayout = Utils.findRequiredViewAsType(source, R.id.test_linkify_coordinator, "field 'coordinatorLayout'", CoordinatorLayout.class);
  }

  @Override
  public void unbind() {
    TestLinkifyActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.scrollContent = null;
    target.coordinatorLayout = null;
  }
}
