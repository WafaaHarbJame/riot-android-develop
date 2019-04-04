package ms.messageapp.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import butterknife.BindView;
import ms.messageapp.R;
import ms.messageapp.webview.VectorWebViewClient;
import ms.messageapp.webview.WebViewMode;

/**
 * * This class is responsible for managing a WebView
 * * It does also have a loading view and a toolbar
 * * It relies on the VectorWebViewClient
 * * This class shouldn't be extended. To add new behaviors, you might create a new WebViewMode and a new WebViewEventListener
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lms/messageapp/activity/VectorWebViewActivity;", "Lms/messageapp/activity/VectorAppCompatActivity;", "()V", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "setWebView", "(Landroid/webkit/WebView;)V", "getLayoutRes", "", "initUiAndData", "", "onBackPressed", "Companion", "vector_appDebug"})
public final class VectorWebViewActivity extends ms.messageapp.activity.VectorAppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.simple_webview)
    public android.webkit.WebView webView;
    private static final java.lang.String EXTRA_URL = "EXTRA_URL";
    private static final java.lang.String EXTRA_TITLE = "EXTRA_TITLE";
    private static final java.lang.String EXTRA_MODE = "EXTRA_MODE";
    private static final java.lang.String USE_TITLE_FROM_WEB_PAGE = "";
    public static final ms.messageapp.activity.VectorWebViewActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.webkit.WebView getWebView() {
        return null;
    }
    
    public final void setWebView(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView p0) {
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public VectorWebViewActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lms/messageapp/activity/VectorWebViewActivity$Companion;", "", "()V", "EXTRA_MODE", "", "EXTRA_TITLE", "EXTRA_URL", "USE_TITLE_FROM_WEB_PAGE", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "url", "title", "mode", "Lms/messageapp/webview/WebViewMode;", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        ms.messageapp.webview.WebViewMode mode) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}