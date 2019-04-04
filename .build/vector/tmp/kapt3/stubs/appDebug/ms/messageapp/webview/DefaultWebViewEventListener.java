package ms.messageapp.webview;

import org.matrix.androidsdk.util.Log;

/**
 * * This class is the default implementation of WebViewEventListener.
 * * It can be used with delegation pattern
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lms/messageapp/webview/DefaultWebViewEventListener;", "Lms/messageapp/webview/WebViewEventListener;", "()V", "onPageError", "", "url", "", "errorCode", "", "description", "onPageFinished", "onPageStarted", "pageWillStart", "shouldOverrideUrlLoading", "", "vector_appDebug"})
public final class DefaultWebViewEventListener implements ms.messageapp.webview.WebViewEventListener {
    
    @java.lang.Override()
    public void pageWillStart(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @java.lang.Override()
    public void onPageStarted(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @java.lang.Override()
    public void onPageFinished(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @java.lang.Override()
    public void onPageError(@org.jetbrains.annotations.NotNull()
    java.lang.String url, int errorCode, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
    
    @java.lang.Override()
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    public DefaultWebViewEventListener() {
        super();
    }
}