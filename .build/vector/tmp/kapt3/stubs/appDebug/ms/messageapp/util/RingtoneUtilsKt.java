package ms.messageapp.util;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.preference.PreferenceManager;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007\u001a\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r\u001a\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u000f"}, d2 = {"getCallRingtone", "Landroid/media/Ringtone;", "context", "Landroid/content/Context;", "getCallRingtoneName", "", "getCallRingtoneUri", "Landroid/net/Uri;", "setCallRingtoneUri", "", "ringtoneUri", "setUseRiotDefaultRingtone", "useRiotDefault", "", "useRiotDefaultRingtone", "vector_appDebug"})
public final class RingtoneUtilsKt {
    
    /**
     * * Returns a Uri object that points to a specific Ringtone.
     * *
     * * If no Ringtone was explicitly set using Riot, it will return the Uri for the current system
     * * ringtone for calls.
     * *
     * * @return the [Uri] of the currently set [Ringtone]
     * * @see Ringtone
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.net.Uri getCallRingtoneUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * * Returns a Ringtone object that can then be played.
     * *
     * * If no Ringtone was explicitly set using Riot, it will return the current system ringtone
     * * for calls.
     * *
     * * @return the currently set [Ringtone]
     * * @see Ringtone
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.media.Ringtone getCallRingtone(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * * Returns a String with the name of the current Ringtone.
     * *
     * * If no Ringtone was explicitly set using Riot, it will return the name of the current system
     * * ringtone for calls.
     * *
     * * @return the name of the currently set [Ringtone], or null
     * * @see Ringtone
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getCallRingtoneName(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * * Sets the selected ringtone for riot calls.
     * *
     * * @param ringtoneUri
     * * @see Ringtone
     */
    public static final void setCallRingtoneUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri ringtoneUri) {
    }
    
    /**
     * * Set using Riot default ringtone
     */
    public static final boolean useRiotDefaultRingtone(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * Ask if default Riot ringtone has to be used
     */
    public static final void setUseRiotDefaultRingtone(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean useRiotDefault) {
    }
}