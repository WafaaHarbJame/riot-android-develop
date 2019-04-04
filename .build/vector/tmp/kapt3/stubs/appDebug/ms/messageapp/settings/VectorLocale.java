package ms.messageapp.settings;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Pair;
import ms.messageapp.R;
import kotlinx.coroutines.experimental.GlobalScope;
import org.matrix.androidsdk.util.Log;
import java.util.*;

/**
 * * Object to manage the Locale choice of the user
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\nJ\u0016\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lms/messageapp/settings/VectorLocale;", "", "()V", "APPLICATION_LOCALE_COUNTRY_KEY", "", "APPLICATION_LOCALE_LANGUAGE_KEY", "APPLICATION_LOCALE_VARIANT_KEY", "LOG_TAG", "kotlin.jvm.PlatformType", "<set-?>", "Ljava/util/Locale;", "applicationLocale", "getApplicationLocale", "()Ljava/util/Locale;", "defaultLocale", "Ljava/util/ArrayList;", "supportedLocales", "getSupportedLocales", "()Ljava/util/ArrayList;", "getString", "context", "Landroid/content/Context;", "locale", "resourceId", "", "init", "", "initApplicationLocales", "localeToLocalisedString", "saveApplicationLocale", "vector_appDebug"})
public final class VectorLocale {
    private static final java.lang.String LOG_TAG = null;
    private static final java.lang.String APPLICATION_LOCALE_COUNTRY_KEY = "APPLICATION_LOCALE_COUNTRY_KEY";
    private static final java.lang.String APPLICATION_LOCALE_VARIANT_KEY = "APPLICATION_LOCALE_VARIANT_KEY";
    private static final java.lang.String APPLICATION_LOCALE_LANGUAGE_KEY = "APPLICATION_LOCALE_LANGUAGE_KEY";
    private static final java.util.Locale defaultLocale = null;
    
    /**
     * * The supported application languages
     */
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<java.util.Locale> supportedLocales;
    
    /**
     * * Provides the current application locale
     */
    @org.jetbrains.annotations.NotNull()
    private static java.util.Locale applicationLocale;
    public static final ms.messageapp.settings.VectorLocale INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.util.Locale> getSupportedLocales() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Locale getApplicationLocale() {
        return null;
    }
    
    /**
     * * Init this object
     */
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * * Save the new application locale.
     */
    public final void saveApplicationLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
    }
    
    /**
     * * Get String from a locale
     *     *
     *     * @param context    the context
     *     * @param locale     the locale
     *     * @param resourceId the string resource id
     *     * @return the localized string
     */
    private final java.lang.String getString(android.content.Context context, java.util.Locale locale, int resourceId) {
        return null;
    }
    
    /**
     * * Provides the supported application locales list
     *     *
     *     * @param context the context
     */
    private final void initApplicationLocales(android.content.Context context) {
    }
    
    /**
     * * Convert a locale to a string
     *     *
     *     * @param locale the locale to convert
     *     * @return the string
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String localeToLocalisedString(@org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    private VectorLocale() {
        super();
    }
}