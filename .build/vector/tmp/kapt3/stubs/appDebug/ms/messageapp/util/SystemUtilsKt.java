package ms.messageapp.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.*;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import ms.messageapp.R;
import ms.messageapp.settings.VectorLocale;
import org.matrix.androidsdk.util.Log;
import java.util.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010\u001a,\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"LOG_TAG", "", "copyToClipboard", "", "context", "Landroid/content/Context;", "text", "", "getDeviceLocale", "Ljava/util/Locale;", "isIgnoringBatteryOptimizations", "", "requestDisablingBatteryOptimization", "activity", "Landroid/app/Activity;", "requestCode", "", "startAddGoogleAccountIntent", "fragment", "Landroid/support/v4/app/Fragment;", "startImportTextFromFileIntent", "startNotificationChannelSettingsIntent", "channelID", "startNotificationSettingsIntent", "startSharePlainTextIntent", "chooserTitle", "subject", "vector_appDebug"})
public final class SystemUtilsKt {
    private static final java.lang.String LOG_TAG = "SystemUtils";
    
    /**
     * * Tells if the application ignores battery optimizations.
     * *
     * * Ignoring them allows the app to run in background to make background sync with the homeserver.
     * * This user option appears on Android M but Android O enforces its usage and kills apps not
     * * authorised by the user to run in background.
     * *
     * * @param context the context
     * * @return true if battery optimisations are ignored
     */
    public static final boolean isIgnoringBatteryOptimizations(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * display the system dialog for granting this permission. If previously granted, the
     * * system will not show it (so you should call this method).
     * *
     * * Note: If the user finally does not grant the permission, PushManager.isBackgroundSyncAllowed()
     * * will return false and the notification privacy will fallback to "LOW_DETAIL".
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public static final void requestDisablingBatteryOptimization(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int requestCode) {
    }
    
    /**
     * * Copy a text to the clipboard, and display a Toast when done
     * *
     * * @param context the context
     * * @param text    the text to copy
     */
    public static final void copyToClipboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    /**
     * * Provides the device locale
     * *
     * * @return the device locale
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Locale getDeviceLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * * Shows notification settings for the current app.
     * * In android O will directly opens the notification settings, in lower version it will show the App settings
     */
    public static final void startNotificationSettingsIntent(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, int requestCode) {
    }
    
    /**
     * * Shows notification system settings for the given channel id.
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    public static final void startNotificationChannelSettingsIntent(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String channelID) {
    }
    
    public static final void startAddGoogleAccountIntent(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, int requestCode) {
    }
    
    public static final void startSharePlainTextIntent(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String chooserTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String subject) {
    }
    
    public static final void startImportTextFromFileIntent(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, int requestCode) {
    }
}