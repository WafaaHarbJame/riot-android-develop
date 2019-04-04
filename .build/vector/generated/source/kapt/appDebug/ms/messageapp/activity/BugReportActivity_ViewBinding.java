// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.internal.Utils;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class BugReportActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private BugReportActivity target;

  private View view2131296360;

  private TextWatcher view2131296360TextWatcher;

  private View view2131296359;

  @UiThread
  public BugReportActivity_ViewBinding(BugReportActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BugReportActivity_ViewBinding(final BugReportActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.bug_report_edit_text, "field 'mBugReportText' and method 'textChanged$vector_appDebug'");
    target.mBugReportText = Utils.castView(view, R.id.bug_report_edit_text, "field 'mBugReportText'", EditText.class);
    view2131296360 = view;
    view2131296360TextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        target.textChanged$vector_appDebug();
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
      }
    };
    ((TextView) view).addTextChangedListener(view2131296360TextWatcher);
    target.mIncludeLogsButton = Utils.findRequiredViewAsType(source, R.id.bug_report_button_include_logs, "field 'mIncludeLogsButton'", CheckBox.class);
    target.mIncludeCrashLogsButton = Utils.findRequiredViewAsType(source, R.id.bug_report_button_include_crash_logs, "field 'mIncludeCrashLogsButton'", CheckBox.class);
    view = Utils.findRequiredView(source, R.id.bug_report_button_include_screenshot, "field 'mIncludeScreenShotButton' and method 'onSendScreenshotChanged$vector_appDebug'");
    target.mIncludeScreenShotButton = Utils.castView(view, R.id.bug_report_button_include_screenshot, "field 'mIncludeScreenShotButton'", CheckBox.class);
    view2131296359 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onSendScreenshotChanged$vector_appDebug();
      }
    });
    target.mScreenShotPreview = Utils.findRequiredViewAsType(source, R.id.bug_report_screenshot_preview, "field 'mScreenShotPreview'", ImageView.class);
    target.mProgressBar = Utils.findRequiredViewAsType(source, R.id.bug_report_progress_view, "field 'mProgressBar'", ProgressBar.class);
    target.mProgressTextView = Utils.findRequiredViewAsType(source, R.id.bug_report_progress_text_view, "field 'mProgressTextView'", TextView.class);
    target.mScrollView = Utils.findRequiredView(source, R.id.bug_report_scrollview, "field 'mScrollView'");
    target.mMaskView = Utils.findRequiredView(source, R.id.bug_report_mask_view, "field 'mMaskView'");
  }

  @Override
  public void unbind() {
    BugReportActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mBugReportText = null;
    target.mIncludeLogsButton = null;
    target.mIncludeCrashLogsButton = null;
    target.mIncludeScreenShotButton = null;
    target.mScreenShotPreview = null;
    target.mProgressBar = null;
    target.mProgressTextView = null;
    target.mScrollView = null;
    target.mMaskView = null;

    ((TextView) view2131296360).removeTextChangedListener(view2131296360TextWatcher);
    view2131296360TextWatcher = null;
    view2131296360 = null;
    ((CompoundButton) view2131296359).setOnCheckedChangeListener(null);
    view2131296359 = null;

    super.unbind();
  }
}
