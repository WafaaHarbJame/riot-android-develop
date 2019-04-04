package ms.messageapp.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Browser;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.content.FileProvider;
import ms.messageapp.BuildConfig;
import ms.messageapp.R;
import org.matrix.androidsdk.util.Log;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a(\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0001\u001a\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0017\u001a\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001\u001a\u0016\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u001a.\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"LOG_TAG", "", "openCamera", "activity", "Landroid/app/Activity;", "titlePrefix", "requestCode", "", "openFileSelection", "", "fragment", "Landroid/support/v4/app/Fragment;", "allowMultipleSelection", "", "openMedia", "savedMediaPath", "mimeType", "openSoundRecorder", "openUri", "uri", "openUrlInExternalBrowser", "context", "Landroid/content/Context;", "Landroid/net/Uri;", "url", "openVideoRecorder", "sendMailTo", "address", "subject", "message", "vector_appDebug"})
public final class ExternalApplicationsUtilKt {
    private static final java.lang.String LOG_TAG = "ExternalApplicationsUtil";
    
    /**
     * * Open a url in the internet browser of the system
     */
    public static final void openUrlInExternalBrowser(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    /**
     * * Open a uri in the internet browser of the system
     */
    public static final void openUrlInExternalBrowser(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    /**
     * * Open sound recorder external application
     */
    public static final void openSoundRecorder(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int requestCode) {
    }
    
    /**
     * * Open file selection activity
     */
    public static final void openFileSelection(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.support.v4.app.Fragment fragment, boolean allowMultipleSelection, int requestCode) {
    }
    
    /**
     * * Open external video recorder
     */
    public static final void openVideoRecorder(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int requestCode) {
    }
    
    /**
     * * Open external camera
     * * @return the latest taken picture camera uri
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String openCamera(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String titlePrefix, int requestCode) {
        return null;
    }
    
    /**
     * * Send an email to address with optional subject and message
     */
    public static final void sendMailTo(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String subject, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * * Open an arbitrary uri
     */
    public static final void openUri(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    /**
     * * Send media to a third party application.
     * *
     * * @param activity       the activity
     * * @param savedMediaPath the media path
     * * @param mimeType       the media mime type.
     */
    public static final void openMedia(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String savedMediaPath, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
    }
}