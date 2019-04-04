package ms.messageapp.receiver;

import android.content.*;
import android.support.v7.preference.PreferenceManager;
import android.util.Log;
import ms.messageapp.Matrix;

/**
 * * Receiver to handle some command from ADB
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a8\u0006\u0011"}, d2 = {"Lms/messageapp/receiver/DebugReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "alterScalarToken", "", "context", "Landroid/content/Context;", "dumpPreferences", "logPrefs", "name", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "onReceive", "intent", "Landroid/content/Intent;", "Companion", "vector_appDebug"})
public final class DebugReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String LOG_TAG = "DebugReceiver";
    private static final java.lang.String DEBUG_ACTION_DUMP_FILESYSTEM = "im.vector.receiver.DEBUG_ACTION_DUMP_FILESYSTEM";
    private static final java.lang.String DEBUG_ACTION_DUMP_PREFERENCES = "im.vector.receiver.DEBUG_ACTION_DUMP_PREFERENCES";
    private static final java.lang.String DEBUG_ACTION_ALTER_SCALAR_TOKEN = "im.vector.receiver.DEBUG_ACTION_ALTER_SCALAR_TOKEN";
    public static final ms.messageapp.receiver.DebugReceiver.Companion Companion = null;
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void dumpPreferences(android.content.Context context) {
    }
    
    private final void logPrefs(java.lang.String name, android.content.SharedPreferences sharedPreferences) {
    }
    
    private final void alterScalarToken(android.content.Context context) {
    }
    
    public DebugReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lms/messageapp/receiver/DebugReceiver$Companion;", "", "()V", "DEBUG_ACTION_ALTER_SCALAR_TOKEN", "", "DEBUG_ACTION_DUMP_FILESYSTEM", "DEBUG_ACTION_DUMP_PREFERENCES", "LOG_TAG", "getIntentFilter", "Landroid/content/IntentFilter;", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.IntentFilter getIntentFilter() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}