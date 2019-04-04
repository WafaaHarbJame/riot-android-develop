package ms.messageapp.preference;

import android.content.Context;
import android.util.AttributeSet;
import ms.messageapp.util.VectorUtils;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.data.Room;

/**
 * * Specialized class to target a Room avatar preference.
 * * Based don the avatar preference class it redefines refreshAvatar() and
 * * add the new method  setConfiguration().
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lms/messageapp/preference/RoomAvatarPreference;", "Lms/messageapp/preference/UserAvatarPreference;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mRoom", "Lorg/matrix/androidsdk/data/Room;", "refreshAvatar", "", "setConfiguration", "aSession", "Lorg/matrix/androidsdk/MXSession;", "aRoom", "vector_appDebug"})
public final class RoomAvatarPreference extends ms.messageapp.preference.UserAvatarPreference {
    private org.matrix.androidsdk.data.Room mRoom;
    
    @java.lang.Override()
    public void refreshAvatar() {
    }
    
    public final void setConfiguration(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXSession aSession, @org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.data.Room aRoom) {
    }
    
    public RoomAvatarPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public RoomAvatarPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public RoomAvatarPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
}