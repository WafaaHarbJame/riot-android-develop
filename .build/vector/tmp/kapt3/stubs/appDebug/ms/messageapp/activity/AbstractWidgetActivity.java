package ms.messageapp.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.CallSuper;
import android.webkit.*;
import butterknife.BindView;
import com.google.gson.reflect.TypeToken;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.types.JsonDict;
import ms.messageapp.types.WidgetEventData;
import ms.messageapp.util.AssetReader;
import ms.messageapp.widgets.WidgetsManager;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.data.Room;
import org.matrix.androidsdk.rest.callback.ApiCallback;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.util.JsonUtils;
import org.matrix.androidsdk.util.Log;
import java.util.*;
import javax.net.ssl.HttpsURLConnection;

/**
 * * Parent class for all Activities managing Widget Webview
 * *
 * * This class manage the communication (JS Bridge) with the WebView.
 * *
 * * Layout MUST contains a WebView with ID 'widget_webview'
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\b&\u0018\u0000 :2\u00020\u0001:\u0003:;<B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&J\b\u0010\u001c\u001a\u00020\u0004H&J&\u0010\u001d\u001a\u00020\u00042\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!H\u0017J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0017J\b\u0010%\u001a\u00020#H\u0003J\u0012\u0010&\u001a\u00020#2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\'\u001a\u00020#H\u0016J0\u0010(\u001a\u00020#2&\u0010)\u001a\"\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020 0\u001f\u0018\u00010\u001fj\u0004\u0018\u0001`*H\u0002J\u001c\u0010+\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u001aH\u0004J.\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\u00042\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!H\u0004J.\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u001a2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!H\u0004J.\u00102\u001a\u00020#2\u0006\u0010/\u001a\u0002032\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!H\u0004J.\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020 2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!H\u0004J0\u00106\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u00010 2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!H\u0004J.\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020\u001a2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!H\u0002J&\u00109\u001a\u00020#2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!H\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006="}, d2 = {"Lms/messageapp/activity/AbstractWidgetActivity;", "Lms/messageapp/activity/VectorAppCompatActivity;", "()V", "mHistoryAlreadyCleared", "", "mIsRefreshingToken", "mRoom", "Lorg/matrix/androidsdk/data/Room;", "getMRoom", "()Lorg/matrix/androidsdk/data/Room;", "setMRoom", "(Lorg/matrix/androidsdk/data/Room;)V", "mSession", "Lorg/matrix/androidsdk/MXSession;", "getMSession", "()Lorg/matrix/androidsdk/MXSession;", "setMSession", "(Lorg/matrix/androidsdk/MXSession;)V", "mTokenAlreadyRefreshed", "mWebView", "Landroid/webkit/WebView;", "getMWebView", "()Landroid/webkit/WebView;", "setMWebView", "(Landroid/webkit/WebView;)V", "buildInterfaceUrl", "", "scalarToken", "canScalarTokenBeProvided", "dealsWithWidgetRequest", "eventData", "", "", "Lms/messageapp/types/JsonDict;", "getScalarTokenAndLoadUrl", "", "initUiAndData", "initWebView", "launchUrl", "onBackPressed", "onWidgetMessage", "JSData", "Lms/messageapp/types/WidgetEventData;", "openIntegrationManager", "widgetId", "screenId", "sendBoolResponse", "response", "sendError", "message", "sendIntegerResponse", "", "sendObjectAsJsonMap", "any", "sendObjectResponse", "sendResponse", "jsString", "sendSuccess", "Companion", "WidgetApiCallback", "WidgetWebAppInterface", "vector_appDebug"})
public abstract class AbstractWidgetActivity extends ms.messageapp.activity.VectorAppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.widget_webview)
    public android.webkit.WebView mWebView;
    @org.jetbrains.annotations.Nullable()
    private org.matrix.androidsdk.MXSession mSession;
    @org.jetbrains.annotations.Nullable()
    private org.matrix.androidsdk.data.Room mRoom;
    private boolean mIsRefreshingToken;
    private boolean mTokenAlreadyRefreshed;
    private boolean mHistoryAlreadyCleared;
    private static final java.lang.String LOG_TAG = null;
    
    /**
     * * the parameters
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MATRIX_ID = "EXTRA_MATRIX_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ROOM_ID = "EXTRA_ROOM_ID";
    public static final ms.messageapp.activity.AbstractWidgetActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.webkit.WebView getMWebView() {
        return null;
    }
    
    public final void setMWebView(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final org.matrix.androidsdk.MXSession getMSession() {
        return null;
    }
    
    protected final void setMSession(@org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.MXSession p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final org.matrix.androidsdk.data.Room getMRoom() {
        return null;
    }
    
    protected final void setMRoom(@org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.data.Room p0) {
    }
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    private final void getScalarTokenAndLoadUrl() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void initWebView() {
    }
    
    private final void launchUrl(java.lang.String scalarToken) {
    }
    
    public abstract boolean canScalarTokenBeProvided();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String buildInterfaceUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String scalarToken);
    
    /**
     * * Manage the request from the Javascript
     *     *
     *     * @param JSData the js data request
     */
    private final void onWidgetMessage(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> JSData) {
    }
    
    /**
     * * A Widget message has been received, deals with it and send the response
     *     *
     *     * @return true if the message is handled (it means an answer has been sent), false if not
     */
    @android.support.annotation.CallSuper()
    public boolean dealsWithWidgetRequest(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
        return false;
    }
    
    /**
     * * Send the response to the javascript
     *     *
     *     * @param jsString  the response data
     *     * @param eventData the modular data
     */
    private final void sendResponse(java.lang.String jsString, java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Send a boolean response
     *     *
     *     * @param response  the response
     *     * @param eventData the modular data
     */
    protected final void sendBoolResponse(boolean response, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Send an integer response
     *     *
     *     * @param response  the response
     *     * @param eventData the modular data
     */
    protected final void sendIntegerResponse(int response, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Send an object response
     *     *
     *     * @param response  the response
     *     * @param eventData the modular data
     */
    protected final void sendObjectResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Object response, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Send success
     *     *
     *     * @param eventData the modular data
     */
    protected final void sendSuccess(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Send an error
     *     *
     *     * @param message   the error message
     *     * @param eventData the modular data
     */
    protected final void sendError(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Send an object as a JSON map
     *     *
     *     * @param object    the object to send
     *     * @param eventData the modular data
     */
    protected final void sendObjectAsJsonMap(@org.jetbrains.annotations.NotNull()
    java.lang.Object any, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Open integration manager
     */
    protected final void openIntegrationManager(@org.jetbrains.annotations.Nullable()
    java.lang.String widgetId, @org.jetbrains.annotations.Nullable()
    java.lang.String screenId) {
    }
    
    public AbstractWidgetActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lms/messageapp/activity/AbstractWidgetActivity$WidgetWebAppInterface;", "", "(Lms/messageapp/activity/AbstractWidgetActivity;)V", "onWidgetEvent", "", "eventData", "", "vector_appDebug"})
    final class WidgetWebAppInterface {
        
        @android.webkit.JavascriptInterface()
        public final void onWidgetEvent(@org.jetbrains.annotations.NotNull()
        java.lang.String eventData) {
        }
        
        public WidgetWebAppInterface() {
            super();
        }
    }
    
    /**
     * * Api callbacks
     *     *
     *     * @param <T> the callback type
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0084\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B+\u0012\u001c\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0011j\u0002`\u0012H\u0016J\u0017\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0011j\u0002`\u0012H\u0016R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lms/messageapp/activity/AbstractWidgetActivity$WidgetApiCallback;", "T", "Lorg/matrix/androidsdk/rest/callback/ApiCallback;", "mEventData", "", "", "", "Lms/messageapp/types/JsonDict;", "mDescription", "(Lms/messageapp/activity/AbstractWidgetActivity;Ljava/util/Map;Ljava/lang/String;)V", "onError", "", "error", "onMatrixError", "e", "Lorg/matrix/androidsdk/rest/model/MatrixError;", "onNetworkError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "info", "(Ljava/lang/Object;)V", "onUnexpectedError", "vector_appDebug"})
    public final class WidgetApiCallback<T extends java.lang.Object> implements org.matrix.androidsdk.rest.callback.ApiCallback<T> {
        private final java.util.Map<java.lang.String, java.lang.Object> mEventData = null;
        private final java.lang.String mDescription = null;
        
        @java.lang.Override()
        public void onSuccess(@org.jetbrains.annotations.Nullable()
        T info) {
        }
        
        private final void onError(java.lang.String error) {
        }
        
        @java.lang.Override()
        public void onNetworkError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception e) {
        }
        
        @java.lang.Override()
        public void onMatrixError(@org.jetbrains.annotations.NotNull()
        org.matrix.androidsdk.rest.model.MatrixError e) {
        }
        
        @java.lang.Override()
        public void onUnexpectedError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception e) {
        }
        
        public WidgetApiCallback(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends java.lang.Object> mEventData, @org.jetbrains.annotations.NotNull()
        java.lang.String mDescription) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lms/messageapp/activity/AbstractWidgetActivity$Companion;", "", "()V", "EXTRA_MATRIX_ID", "", "EXTRA_ROOM_ID", "LOG_TAG", "kotlin.jvm.PlatformType", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "matrixId", "roomId", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String matrixId, @org.jetbrains.annotations.NotNull()
        java.lang.String roomId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}