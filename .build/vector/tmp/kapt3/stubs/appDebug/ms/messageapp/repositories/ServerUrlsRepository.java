package ms.messageapp.repositories;

import android.content.Context;
import android.support.v7.preference.PreferenceManager;
import android.text.TextUtils;
import ms.messageapp.R;

/**
 * * Object to store and retrieve home and identity server urls
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004J\u0016\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J\u001e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lms/messageapp/repositories/ServerUrlsRepository;", "", "()V", "DEFAULT_REFERRER_HOME_SERVER_URL_PREF", "", "DEFAULT_REFERRER_IDENTITY_SERVER_URL_PREF", "HOME_SERVER_URL_PREF", "IDENTITY_SERVER_URL_PREF", "getDefaultHomeServerUrl", "context", "Landroid/content/Context;", "getDefaultIdentityServerUrl", "getLastHomeServerUrl", "getLastIdentityServerUrl", "isDefaultHomeServerUrl", "", "url", "isDefaultIdentityServerUrl", "saveServerUrls", "", "homeServerUrl", "identityServerUrl", "setDefaultUrlsFromReferrer", "vector_appDebug"})
public final class ServerUrlsRepository {
    private static final java.lang.String DEFAULT_REFERRER_HOME_SERVER_URL_PREF = "default_referrer_home_server_url";
    private static final java.lang.String DEFAULT_REFERRER_IDENTITY_SERVER_URL_PREF = "default_referrer_identity_server_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HOME_SERVER_URL_PREF = "home_server_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IDENTITY_SERVER_URL_PREF = "identity_server_url";
    public static final ms.messageapp.repositories.ServerUrlsRepository INSTANCE = null;
    
    /**
     * * Save home and identity sever urls received by the Referrer receiver
     */
    public final void setDefaultUrlsFromReferrer(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String homeServerUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String identityServerUrl) {
    }
    
    /**
     * * Save home and identity sever urls entered by the user. May be custom or default value
     */
    public final void saveServerUrls(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String homeServerUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String identityServerUrl) {
    }
    
    /**
     * * Return last used home server url, or the default one from referrer or the default one from resources
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastHomeServerUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * * Return last used identity server url, or the default one from referrer or the default one from resources
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastIdentityServerUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * * Return true if url is the default home server url form resources
     */
    public final boolean isDefaultHomeServerUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    /**
     * * Return true if url is the default identity server url form resources
     */
    public final boolean isDefaultIdentityServerUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    /**
     * * Return default home server url from resources
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefaultHomeServerUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * * Return default identity server url from resources
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefaultIdentityServerUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private ServerUrlsRepository() {
        super();
    }
}