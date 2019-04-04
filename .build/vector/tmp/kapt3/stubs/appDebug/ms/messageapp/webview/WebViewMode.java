package ms.messageapp.webview;

import ms.messageapp.activity.VectorAppCompatActivity;

/**
 * * This enum indicates the WebView mode. It's responsible for creating a WebViewEventListener
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/webview/WebViewMode;", "", "Lms/messageapp/webview/WebViewEventListenerFactory;", "(Ljava/lang/String;I)V", "DEFAULT", "CONSENT", "vector_appDebug"})
public enum WebViewMode implements ms.messageapp.webview.WebViewEventListenerFactory {
    /*public static final*/ DEFAULT /* = new @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/webview/WebViewMode$DEFAULT;", "Lms/messageapp/webview/WebViewMode;", "eventListener", "Lms/messageapp/webview/WebViewEventListener;", "activity", "Lms/messageapp/activity/VectorAppCompatActivity;", "vector_appDebug"}) DEFAULT(){
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ms.messageapp.webview.WebViewEventListener eventListener(@org.jetbrains.annotations.NotNull()
        ms.messageapp.activity.VectorAppCompatActivity activity) {
            return null;
        }
        
        DEFAULT() {
            super();
        }
    } */,
    /*public static final*/ CONSENT /* = new @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/webview/WebViewMode$CONSENT;", "Lms/messageapp/webview/WebViewMode;", "eventListener", "Lms/messageapp/webview/WebViewEventListener;", "activity", "Lms/messageapp/activity/VectorAppCompatActivity;", "vector_appDebug"}) CONSENT(){
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ms.messageapp.webview.WebViewEventListener eventListener(@org.jetbrains.annotations.NotNull()
        ms.messageapp.activity.VectorAppCompatActivity activity) {
            return null;
        }
        
        CONSENT() {
            super();
        }
    } */;
    
    WebViewMode() {
    }
}