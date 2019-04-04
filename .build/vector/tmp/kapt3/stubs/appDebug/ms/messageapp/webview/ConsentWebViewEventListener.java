package ms.messageapp.webview;

import ms.messageapp.Matrix;
import ms.messageapp.activity.VectorAppCompatActivity;
import org.matrix.androidsdk.rest.callback.ApiCallback;
import org.matrix.androidsdk.rest.callback.SimpleApiCallback;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.util.Log;

/**
 * * This class is the Consent implementation of WebViewEventListener.
 * * It is used to manage the consent agreement flow.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0002J!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0096\u0001J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0011\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0096\u0001J\u0011\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0096\u0001J\u0011\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\bH\u0096\u0001R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lms/messageapp/webview/ConsentWebViewEventListener;", "Lms/messageapp/webview/WebViewEventListener;", "activity", "Lms/messageapp/activity/VectorAppCompatActivity;", "delegate", "(Lms/messageapp/activity/VectorAppCompatActivity;Lms/messageapp/webview/WebViewEventListener;)V", "createRiotBotRoomCallback", "Lorg/matrix/androidsdk/rest/callback/ApiCallback;", "", "safeActivity", "getSafeActivity", "()Lms/messageapp/activity/VectorAppCompatActivity;", "safeActivity$delegate", "Lms/messageapp/util/WeakReferenceDelegate;", "createRiotBotRoomIfNeeded", "", "onPageError", "url", "errorCode", "", "description", "onPageFinished", "onPageStarted", "pageWillStart", "shouldOverrideUrlLoading", "", "vector_appDebug"})
public final class ConsentWebViewEventListener implements ms.messageapp.webview.WebViewEventListener {
    private final ms.messageapp.util.WeakReferenceDelegate safeActivity$delegate = null;
    
    /**
     * * APICallback instance
     */
    private final org.matrix.androidsdk.rest.callback.ApiCallback<java.lang.String> createRiotBotRoomCallback = null;
    private final ms.messageapp.webview.WebViewEventListener delegate = null;
    
    private final ms.messageapp.activity.VectorAppCompatActivity getSafeActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void onPageFinished(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    /**
     * * This methods try to create the RiotBot room when the user gives his agreement
     */
    private final void createRiotBotRoomIfNeeded() {
    }
    
    public ConsentWebViewEventListener(@org.jetbrains.annotations.NotNull()
    ms.messageapp.activity.VectorAppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    ms.messageapp.webview.WebViewEventListener delegate) {
        super();
    }
    
    /**
     * * Triggered when an error occurred while loading a page.
     *     *
     *     * @param url         The url that failed.
     *     * @param errorCode   The error code.
     *     * @param description The error description.
     */
    @java.lang.Override()
    public void onPageError(@org.jetbrains.annotations.NotNull()
    java.lang.String url, int errorCode, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
    
    /**
     * * Triggered when a loading webview page has started.
     *     *
     *     * @param url The rendering url.
     */
    @java.lang.Override()
    public void onPageStarted(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    /**
     * * Triggered when a webview page is about to be started.
     *     *
     *     * @param url The url about to be rendered.
     */
    @java.lang.Override()
    public void pageWillStart(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    /**
     * * Triggered when a webview load an url
     *     *
     *     * @param url The url about to be rendered.
     *     * @return true if the method needs to manage some custom handling
     */
    @java.lang.Override()
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
}