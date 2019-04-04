package ms.messageapp.webview;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * * This class inherits from WebViewClient. It has to be used with a WebView.
 * * It's responsible for dispatching events to the WebViewEventListener
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J \u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J(\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lms/messageapp/webview/VectorWebViewClient;", "Landroid/webkit/WebViewClient;", "eventListener", "Lms/messageapp/webview/WebViewEventListener;", "(Lms/messageapp/webview/WebViewEventListener;)V", "mInError", "", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "shouldOverrideUrl", "shouldOverrideUrlLoading", "vector_appDebug"})
public final class VectorWebViewClient extends android.webkit.WebViewClient {
    private boolean mInError;
    private final ms.messageapp.webview.WebViewEventListener eventListener = null;
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
    android.webkit.WebResourceRequest request) {
        return false;
    }
    
    @java.lang.Override()
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    @java.lang.Override()
    public void onPageStarted(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap favicon) {
    }
    
    @java.lang.Override()
    public void onPageFinished(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @java.lang.Override()
    public void onReceivedError(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView view, int errorCode, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String failingUrl) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public void onReceivedError(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
    android.webkit.WebResourceRequest request, @org.jetbrains.annotations.NotNull()
    android.webkit.WebResourceError error) {
    }
    
    private final boolean shouldOverrideUrl(java.lang.String url) {
        return false;
    }
    
    public VectorWebViewClient(@org.jetbrains.annotations.NotNull()
    ms.messageapp.webview.WebViewEventListener eventListener) {
        super();
    }
}