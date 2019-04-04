package ms.messageapp.webview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lms/messageapp/webview/WebViewEventListener;", "", "onPageError", "", "url", "", "errorCode", "", "description", "onPageFinished", "onPageStarted", "pageWillStart", "shouldOverrideUrlLoading", "", "vector_appDebug"})
public abstract interface WebViewEventListener {
    
    /**
     * * Triggered when a webview page is about to be started.
     *     *
     *     * @param url The url about to be rendered.
     */
    public abstract void pageWillStart(@org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    /**
     * * Triggered when a loading webview page has started.
     *     *
     *     * @param url The rendering url.
     */
    public abstract void onPageStarted(@org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    /**
     * * Triggered when a loading webview page has finished loading but has not been rendered yet.
     *     *
     *     * @param url The finished url.
     */
    public abstract void onPageFinished(@org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    /**
     * * Triggered when an error occurred while loading a page.
     *     *
     *     * @param url         The url that failed.
     *     * @param errorCode   The error code.
     *     * @param description The error description.
     */
    public abstract void onPageError(@org.jetbrains.annotations.NotNull()
    java.lang.String url, int errorCode, @org.jetbrains.annotations.NotNull()
    java.lang.String description);
    
    /**
     * * Triggered when a webview load an url
     *     *
     *     * @param url The url about to be rendered.
     *     * @return true if the method needs to manage some custom handling
     */
    public abstract boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull()
    java.lang.String url);
}