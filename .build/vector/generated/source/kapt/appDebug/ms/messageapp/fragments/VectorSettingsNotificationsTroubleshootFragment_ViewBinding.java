// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class VectorSettingsNotificationsTroubleshootFragment_ViewBinding implements Unbinder {
  private VectorSettingsNotificationsTroubleshootFragment target;

  @UiThread
  public VectorSettingsNotificationsTroubleshootFragment_ViewBinding(
      VectorSettingsNotificationsTroubleshootFragment target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.troubleshoot_test_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    target.mBottomView = Utils.findRequiredViewAsType(source, R.id.troubleshoot_bottom_view, "field 'mBottomView'", ViewGroup.class);
    target.mSummaryDescription = Utils.findRequiredViewAsType(source, R.id.toubleshoot_summ_description, "field 'mSummaryDescription'", TextView.class);
    target.mSummaryButton = Utils.findRequiredViewAsType(source, R.id.troubleshoot_summ_button, "field 'mSummaryButton'", Button.class);
    target.mRunButton = Utils.findRequiredViewAsType(source, R.id.troubleshoot_run_button, "field 'mRunButton'", Button.class);
  }

  @Override
  public void unbind() {
    VectorSettingsNotificationsTroubleshootFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mBottomView = null;
    target.mSummaryDescription = null;
    target.mSummaryButton = null;
    target.mRunButton = null;
  }
}
