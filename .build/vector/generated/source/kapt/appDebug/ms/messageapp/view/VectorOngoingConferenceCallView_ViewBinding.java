// Generated code from Butter Knife. Do not modify!
package ms.messageapp.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class VectorOngoingConferenceCallView_ViewBinding implements Unbinder {
  private VectorOngoingConferenceCallView target;

  private View view2131296415;

  @UiThread
  public VectorOngoingConferenceCallView_ViewBinding(VectorOngoingConferenceCallView target) {
    this(target, target);
  }

  @UiThread
  public VectorOngoingConferenceCallView_ViewBinding(final VectorOngoingConferenceCallView target,
      View source) {
    this.target = target;

    View view;
    target.mConferenceCallTextView = Utils.findRequiredViewAsType(source, R.id.ongoing_conference_call_text_view, "field 'mConferenceCallTextView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.close_widget_icon, "field 'mCloseWidgetIcon' and method 'onClose'");
    target.mCloseWidgetIcon = view;
    view2131296415 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClose();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    VectorOngoingConferenceCallView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mConferenceCallTextView = null;
    target.mCloseWidgetIcon = null;

    view2131296415.setOnClickListener(null);
    view2131296415 = null;
  }
}
