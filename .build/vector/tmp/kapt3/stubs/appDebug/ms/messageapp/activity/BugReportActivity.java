package ms.messageapp.activity;

import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import butterknife.BindView;
import butterknife.OnCheckedChanged;
import butterknife.OnTextChanged;
import ms.messageapp.R;
import ms.messageapp.VectorApp;
import ms.messageapp.util.BugReporter;
import org.matrix.androidsdk.util.Log;

/**
 * * Form to send a bug report
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000201H\u0016J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000204H\u0016J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0016J\r\u0010=\u001a\u000204H\u0001\u00a2\u0006\u0002\b>J\b\u0010?\u001a\u000204H\u0002J\r\u0010@\u001a\u000204H\u0001\u00a2\u0006\u0002\bAR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001a\u00a8\u0006C"}, d2 = {"Lms/messageapp/activity/BugReportActivity;", "Lms/messageapp/activity/MXCActionBarActivity;", "()V", "mBugReportText", "Landroid/widget/EditText;", "getMBugReportText", "()Landroid/widget/EditText;", "setMBugReportText", "(Landroid/widget/EditText;)V", "mIncludeCrashLogsButton", "Landroid/widget/CheckBox;", "getMIncludeCrashLogsButton", "()Landroid/widget/CheckBox;", "setMIncludeCrashLogsButton", "(Landroid/widget/CheckBox;)V", "mIncludeLogsButton", "getMIncludeLogsButton", "setMIncludeLogsButton", "mIncludeScreenShotButton", "getMIncludeScreenShotButton", "setMIncludeScreenShotButton", "mMaskView", "Landroid/view/View;", "getMMaskView", "()Landroid/view/View;", "setMMaskView", "(Landroid/view/View;)V", "mProgressBar", "Landroid/widget/ProgressBar;", "getMProgressBar", "()Landroid/widget/ProgressBar;", "setMProgressBar", "(Landroid/widget/ProgressBar;)V", "mProgressTextView", "Landroid/widget/TextView;", "getMProgressTextView", "()Landroid/widget/TextView;", "setMProgressTextView", "(Landroid/widget/TextView;)V", "mScreenShotPreview", "Landroid/widget/ImageView;", "getMScreenShotPreview", "()Landroid/widget/ImageView;", "setMScreenShotPreview", "(Landroid/widget/ImageView;)V", "mScrollView", "getMScrollView", "setMScrollView", "getLayoutRes", "", "getMenuRes", "initUiAndData", "", "onBackPressed", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onSendScreenshotChanged", "onSendScreenshotChanged$vector_appDebug", "sendBugReport", "textChanged", "textChanged$vector_appDebug", "Companion", "vector_appDebug"})
public final class BugReportActivity extends ms.messageapp.activity.MXCActionBarActivity {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bug_report_edit_text)
    public android.widget.EditText mBugReportText;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bug_report_button_include_logs)
    public android.widget.CheckBox mIncludeLogsButton;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bug_report_button_include_crash_logs)
    public android.widget.CheckBox mIncludeCrashLogsButton;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bug_report_button_include_screenshot)
    public android.widget.CheckBox mIncludeScreenShotButton;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bug_report_screenshot_preview)
    public android.widget.ImageView mScreenShotPreview;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bug_report_progress_view)
    public android.widget.ProgressBar mProgressBar;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bug_report_progress_text_view)
    public android.widget.TextView mProgressTextView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bug_report_scrollview)
    public android.view.View mScrollView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bug_report_mask_view)
    public android.view.View mMaskView;
    private static final java.lang.String LOG_TAG = null;
    public static final ms.messageapp.activity.BugReportActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getMBugReportText() {
        return null;
    }
    
    public final void setMBugReportText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getMIncludeLogsButton() {
        return null;
    }
    
    public final void setMIncludeLogsButton(@org.jetbrains.annotations.NotNull()
    android.widget.CheckBox p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getMIncludeCrashLogsButton() {
        return null;
    }
    
    public final void setMIncludeCrashLogsButton(@org.jetbrains.annotations.NotNull()
    android.widget.CheckBox p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getMIncludeScreenShotButton() {
        return null;
    }
    
    public final void setMIncludeScreenShotButton(@org.jetbrains.annotations.NotNull()
    android.widget.CheckBox p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getMScreenShotPreview() {
        return null;
    }
    
    public final void setMScreenShotPreview(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getMProgressBar() {
        return null;
    }
    
    public final void setMProgressBar(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMProgressTextView() {
        return null;
    }
    
    public final void setMProgressTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getMScrollView() {
        return null;
    }
    
    public final void setMScrollView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getMMaskView() {
        return null;
    }
    
    public final void setMMaskView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    @java.lang.Override()
    public int getMenuRes() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * * Send the bug report
     */
    private final void sendBugReport() {
    }
    
    @butterknife.OnTextChanged(value = {2131296360})
    public final void textChanged$vector_appDebug() {
    }
    
    @butterknife.OnCheckedChanged(value = {2131296359})
    public final void onSendScreenshotChanged$vector_appDebug() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public BugReportActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/activity/BugReportActivity$Companion;", "", "()V", "LOG_TAG", "", "kotlin.jvm.PlatformType", "vector_appDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}