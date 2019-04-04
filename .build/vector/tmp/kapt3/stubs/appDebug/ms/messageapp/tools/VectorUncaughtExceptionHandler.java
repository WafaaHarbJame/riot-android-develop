package ms.messageapp.tools;

import android.content.Context;
import android.os.Build;
import android.support.v7.preference.PreferenceManager;
import ms.messageapp.BuildConfig;
import ms.messageapp.Matrix;
import ms.messageapp.VectorApp;
import ms.messageapp.util.BugReporter;
import org.matrix.androidsdk.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lms/messageapp/tools/VectorUncaughtExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "()V", "PREFS_CRASH_KEY", "", "matrixSdkVersion", "previousHandler", "vectorVersion", "activate", "", "clearAppCrashStatus", "context", "Landroid/content/Context;", "didAppCrash", "", "setVersions", "uncaughtException", "thread", "Ljava/lang/Thread;", "throwable", "", "vector_appDebug"})
public final class VectorUncaughtExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler {
    private static final java.lang.String PREFS_CRASH_KEY = "PREFS_CRASH_KEY";
    private static java.lang.String vectorVersion;
    private static java.lang.String matrixSdkVersion;
    private static java.lang.Thread.UncaughtExceptionHandler previousHandler;
    public static final ms.messageapp.tools.VectorUncaughtExceptionHandler INSTANCE = null;
    
    /**
     * * Activate this handler
     */
    public final void activate() {
    }
    
    /**
     * * An uncaught exception has been triggered
     *     *
     *     * @param thread    the thread
     *     * @param throwable the throwable
     *     * @return the exception description
     */
    @java.lang.Override()
    public void uncaughtException(@org.jetbrains.annotations.NotNull()
    java.lang.Thread thread, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    public final void setVersions(@org.jetbrains.annotations.NotNull()
    java.lang.String vectorVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String matrixSdkVersion) {
    }
    
    /**
     * * Tells if the application crashed
     *     *
     *     * @return true if the application crashed
     */
    public final boolean didAppCrash(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * Clear the crash status
     */
    public final void clearAppCrashStatus(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private VectorUncaughtExceptionHandler() {
        super();
    }
}