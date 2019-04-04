package ms.messageapp.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import butterknife.BindView;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import ms.messageapp.R;
import org.matrix.androidsdk.rest.model.login.Credentials;
import org.matrix.androidsdk.util.JsonUtils;
import org.matrix.androidsdk.util.Log;
import java.net.URLDecoder;
import java.util.*;

/**
 * * FallbackAuthenticationActivity is the fallback login or create account activity
 * * i.e this activity is created when the client does not support the login flow or register flow of the homeserver
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lms/messageapp/activity/FallbackAuthenticationActivity;", "Lms/messageapp/activity/VectorAppCompatActivity;", "()V", "mHomeServerUrl", "", "mMode", "", "mWebView", "Landroid/webkit/WebView;", "getMWebView", "()Landroid/webkit/WebView;", "setMWebView", "(Landroid/webkit/WebView;)V", "getLayoutRes", "getTitleRes", "initUiAndData", "", "launchWebView", "onBackPressed", "onKeyDown", "", "keyCode", "event", "Landroid/view/KeyEvent;", "Companion", "vector_appDebug"})
public final class FallbackAuthenticationActivity extends ms.messageapp.activity.VectorAppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.fallback_authentication_webview)
    public android.webkit.WebView mWebView;
    private java.lang.String mHomeServerUrl;
    private int mMode;
    private static final java.lang.String LOG_TAG = null;
    private static final int MODE_LOGIN = 1;
    private static final int MODE_REGISTER = 2;
    private static final java.lang.String EXTRA_IN_MODE = "FallbackAuthenticationActivity.EXTRA_IN_MODE";
    private static final java.lang.String EXTRA_IN_HOME_SERVER_URL = "FallbackAuthenticationActivity.EXTRA_IN_HOME_SERVER_URL";
    private static final java.lang.String EXTRA_OUT_SERIALIZED_CREDENTIALS = "FallbackAuthenticationActivity.EXTRA_OUT_SERIALIZED_CREDENTIALS";
    public static final ms.messageapp.activity.FallbackAuthenticationActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.webkit.WebView getMWebView() {
        return null;
    }
    
    public final void setMWebView(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView p0) {
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public int getTitleRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    private final void launchWebView() {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public FallbackAuthenticationActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lms/messageapp/activity/FallbackAuthenticationActivity$Companion;", "", "()V", "EXTRA_IN_HOME_SERVER_URL", "", "EXTRA_IN_MODE", "EXTRA_OUT_SERIALIZED_CREDENTIALS", "LOG_TAG", "kotlin.jvm.PlatformType", "MODE_LOGIN", "", "MODE_REGISTER", "getIntentToLogin", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "homeserverUrl", "getIntentToRegister", "getResultCredentials", "Lorg/matrix/androidsdk/rest/model/login/Credentials;", "data", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntentToLogin(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String homeserverUrl) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntentToRegister(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String homeserverUrl) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.matrix.androidsdk.rest.model.login.Credentials getResultCredentials(@org.jetbrains.annotations.NotNull()
        android.content.Intent data) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}