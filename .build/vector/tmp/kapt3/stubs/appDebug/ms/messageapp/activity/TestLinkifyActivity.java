package ms.messageapp.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import ms.messageapp.R;
import ms.messageapp.listeners.IMessagesAdapterActionsListener;
import ms.messageapp.util.MatrixLinkMovementMethod;
import org.matrix.androidsdk.crypto.data.MXDeviceInfo;
import org.matrix.androidsdk.rest.model.Event;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lms/messageapp/activity/TestLinkifyActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "coordinatorLayout", "Landroid/support/design/widget/CoordinatorLayout;", "getCoordinatorLayout", "()Landroid/support/design/widget/CoordinatorLayout;", "setCoordinatorLayout", "(Landroid/support/design/widget/CoordinatorLayout;)V", "scrollContent", "Landroid/widget/LinearLayout;", "getScrollContent", "()Landroid/widget/LinearLayout;", "setScrollContent", "(Landroid/widget/LinearLayout;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "vector_appDebug"})
public final class TestLinkifyActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.test_linkify_content_view)
    public android.widget.LinearLayout scrollContent;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.test_linkify_coordinator)
    public android.support.design.widget.CoordinatorLayout coordinatorLayout;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getScrollContent() {
        return null;
    }
    
    public final void setScrollContent(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.design.widget.CoordinatorLayout getCoordinatorLayout() {
        return null;
    }
    
    public final void setCoordinatorLayout(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.CoordinatorLayout p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public TestLinkifyActivity() {
        super();
    }
}