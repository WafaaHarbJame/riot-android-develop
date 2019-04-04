package ms.messageapp.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.*;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.widgets.Widget;
import ms.messageapp.widgets.WidgetsManager;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.data.Room;
import org.matrix.androidsdk.rest.callback.ApiCallback;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.util.Log;
import javax.net.ssl.HttpsURLConnection;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0003J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\"H\u0017J\b\u0010&\u001a\u00020\"H\u0002J\r\u0010\'\u001a\u00020\"H\u0001\u00a2\u0006\u0002\b(J\r\u0010)\u001a\u00020\"H\u0001\u00a2\u0006\u0002\b*J\b\u0010+\u001a\u00020\"H\u0014J\b\u0010,\u001a\u00020\"H\u0014J\b\u0010-\u001a\u00020\"H\u0014J\b\u0010.\u001a\u00020\"H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00060"}, d2 = {"Lms/messageapp/activity/WidgetActivity;", "Lms/messageapp/activity/VectorAppCompatActivity;", "()V", "mCloseWidgetIcon", "Landroid/view/View;", "getMCloseWidgetIcon", "()Landroid/view/View;", "setMCloseWidgetIcon", "(Landroid/view/View;)V", "mHistoryAlreadyCleared", "", "mIsRefreshingToken", "mRoom", "Lorg/matrix/androidsdk/data/Room;", "mSession", "Lorg/matrix/androidsdk/MXSession;", "mTokenAlreadyRefreshed", "mWidget", "Lms/messageapp/widgets/Widget;", "mWidgetListener", "Lms/messageapp/widgets/WidgetsManager$onWidgetUpdateListener;", "mWidgetTypeTextView", "Landroid/widget/TextView;", "getMWidgetTypeTextView", "()Landroid/widget/TextView;", "setMWidgetTypeTextView", "(Landroid/widget/TextView;)V", "mWidgetWebView", "Landroid/webkit/WebView;", "getMWidgetWebView", "()Landroid/webkit/WebView;", "setMWidgetWebView", "(Landroid/webkit/WebView;)V", "configureWebView", "", "getLayoutRes", "", "initUiAndData", "loadUrl", "onBackClicked", "onBackClicked$vector_appDebug", "onCloseClick", "onCloseClick$vector_appDebug", "onDestroy", "onPause", "onResume", "refreshStatusBar", "Companion", "vector_appDebug"})
public final class WidgetActivity extends ms.messageapp.activity.VectorAppCompatActivity {
    private ms.messageapp.widgets.Widget mWidget;
    private org.matrix.androidsdk.MXSession mSession;
    private org.matrix.androidsdk.data.Room mRoom;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.widget_close_icon)
    public android.view.View mCloseWidgetIcon;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.widget_web_view)
    public android.webkit.WebView mWidgetWebView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.widget_title)
    public android.widget.TextView mWidgetTypeTextView;
    private boolean mIsRefreshingToken;
    private boolean mTokenAlreadyRefreshed;
    private boolean mHistoryAlreadyCleared;
    
    /**
     * * Widget events listener
     */
    private final ms.messageapp.widgets.WidgetsManager.onWidgetUpdateListener mWidgetListener = null;
    private static final java.lang.String LOG_TAG = null;
    
    /**
     * * The linked widget
     */
    private static final java.lang.String EXTRA_WIDGET_ID = "EXTRA_WIDGET_ID";
    public static final ms.messageapp.activity.WidgetActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getMCloseWidgetIcon() {
        return null;
    }
    
    public final void setMCloseWidgetIcon(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.webkit.WebView getMWidgetWebView() {
        return null;
    }
    
    public final void setMWidgetWebView(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMWidgetTypeTextView() {
        return null;
    }
    
    public final void setMWidgetTypeTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @butterknife.OnClick(value = {2131297288})
    public final void onCloseClick$vector_appDebug() {
    }
    
    @butterknife.OnClick(value = {2131297287})
    public final void onBackClicked$vector_appDebug() {
    }
    
    /**
     * * Refresh the status bar
     */
    private final void refreshStatusBar() {
    }
    
    /**
     * * Load the widget call
     */
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void configureWebView() {
    }
    
    private final void loadUrl() {
    }
    
    public WidgetActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lms/messageapp/activity/WidgetActivity$Companion;", "", "()V", "EXTRA_WIDGET_ID", "", "LOG_TAG", "kotlin.jvm.PlatformType", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "widget", "Lms/messageapp/widgets/Widget;", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        ms.messageapp.widgets.Widget widget) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}