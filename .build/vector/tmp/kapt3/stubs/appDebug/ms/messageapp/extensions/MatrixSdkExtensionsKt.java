package ms.messageapp.extensions;

import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.crypto.data.MXDeviceInfo;
import org.matrix.androidsdk.data.Room;
import org.matrix.androidsdk.rest.model.Event;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a8\u0006\f"}, d2 = {"getFingerprintHumanReadable", "", "Lorg/matrix/androidsdk/crypto/data/MXDeviceInfo;", "getRoomMaxPowerLevel", "", "Lorg/matrix/androidsdk/data/Room;", "getSessionId", "Lorg/matrix/androidsdk/rest/model/Event;", "isPowerLevelEnoughForAvatarUpdate", "", "aSession", "Lorg/matrix/androidsdk/MXSession;", "vector_appDebug"})
public final class MatrixSdkExtensionsKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getFingerprintHumanReadable(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.crypto.data.MXDeviceInfo $receiver) {
        return null;
    }
    
    /**
     * * Helper method to retrieve the max power level contained in the room.
     * * This value is used to indicate what is the power level value required
     * * to be admin of the room.
     * *
     * * @return max power level of the current room
     */
    public static final int getRoomMaxPowerLevel(@org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.data.Room $receiver) {
        return 0;
    }
    
    /**
     * * Check if the user power level allows to update the room avatar. This is mainly used to
     * * determine if camera permission must be checked or not.
     * *
     * * @param aSession the session
     * * @return true if the user power level allows to update the avatar, false otherwise.
     */
    public static final boolean isPowerLevelEnoughForAvatarUpdate(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.data.Room $receiver, @org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.MXSession aSession) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getSessionId(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.rest.model.Event $receiver) {
        return null;
    }
}