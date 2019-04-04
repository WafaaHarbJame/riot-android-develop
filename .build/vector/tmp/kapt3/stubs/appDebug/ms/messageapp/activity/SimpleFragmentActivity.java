package ms.messageapp.activity;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import ms.messageapp.R;
import ms.messageapp.activity.util.WaitingViewData;

/**
 * * Simple activity with a toolbar, a waiting overlay, and a fragment container and a mxSession.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lms/messageapp/activity/SimpleFragmentActivity;", "Lms/messageapp/activity/MXCActionBarActivity;", "()V", "waitingCircularProgress", "Landroid/view/View;", "getWaitingCircularProgress", "()Landroid/view/View;", "setWaitingCircularProgress", "(Landroid/view/View;)V", "waitingHorizontalProgress", "Landroid/widget/ProgressBar;", "getWaitingHorizontalProgress", "()Landroid/widget/ProgressBar;", "setWaitingHorizontalProgress", "(Landroid/widget/ProgressBar;)V", "waitingStatusText", "Landroid/widget/TextView;", "getWaitingStatusText", "()Landroid/widget/TextView;", "setWaitingStatusText", "(Landroid/widget/TextView;)V", "getLayoutRes", "", "hideWaitingView", "", "initUiAndData", "onBackPressed", "showWaitingView", "updateWaitingView", "data", "Lms/messageapp/activity/util/WaitingViewData;", "vector_appDebug"})
public class SimpleFragmentActivity extends ms.messageapp.activity.MXCActionBarActivity {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.waiting_view_status_circular_progress)
    public android.view.View waitingCircularProgress;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.waiting_view_status_text)
    public android.widget.TextView waitingStatusText;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.waiting_view_status_horizontal_progress)
    public android.widget.ProgressBar waitingHorizontalProgress;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getWaitingCircularProgress() {
        return null;
    }
    
    public final void setWaitingCircularProgress(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getWaitingStatusText() {
        return null;
    }
    
    public final void setWaitingStatusText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getWaitingHorizontalProgress() {
        return null;
    }
    
    public final void setWaitingHorizontalProgress(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    /**
     * * Displays a progress indicator with a message to the user.
     *     * Blocks user interactions.
     */
    public final void updateWaitingView(@org.jetbrains.annotations.Nullable()
    ms.messageapp.activity.util.WaitingViewData data) {
    }
    
    @java.lang.Override()
    public void showWaitingView() {
    }
    
    @java.lang.Override()
    public void hideWaitingView() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public SimpleFragmentActivity() {
        super();
    }
}