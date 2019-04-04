// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class DebugMenuActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private DebugMenuActivity target;

  private View view2131296453;

  @UiThread
  public DebugMenuActivity_ViewBinding(DebugMenuActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DebugMenuActivity_ViewBinding(final DebugMenuActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.debug_test_text_view_link, "method 'testTextViewLink'");
    view2131296453 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.testTextViewLink();
      }
    });
  }

  @Override
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131296453.setOnClickListener(null);
    view2131296453 = null;

    super.unbind();
  }
}
