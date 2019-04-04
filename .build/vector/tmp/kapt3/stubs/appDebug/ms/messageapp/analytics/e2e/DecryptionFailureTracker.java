package ms.messageapp.analytics.e2e;

import ms.messageapp.analytics.Analytics;
import ms.messageapp.analytics.TrackingEvent;
import org.matrix.androidsdk.crypto.MXCryptoError;
import org.matrix.androidsdk.data.RoomState;
import org.matrix.androidsdk.listeners.MXEventListener;
import org.matrix.androidsdk.rest.model.Event;
import org.matrix.androidsdk.rest.model.RoomMember;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.ArrayList;

/**
 * * This class is responsible for managing the reported decryption errors
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lms/messageapp/analytics/e2e/DecryptionFailureTracker;", "Lorg/matrix/androidsdk/listeners/MXEventListener;", "analytics", "Lms/messageapp/analytics/Analytics;", "(Lms/messageapp/analytics/Analytics;)V", "checkFailuresTimer", "Ljava/util/Timer;", "reportedFailures", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lms/messageapp/analytics/e2e/DecryptionFailure;", "trackedEvents", "Ljava/util/HashSet;", "checkFailures", "", "dispatch", "onEventDecrypted", "event", "Lorg/matrix/androidsdk/rest/model/Event;", "reportUnableToDecryptError", "roomState", "Lorg/matrix/androidsdk/data/RoomState;", "userId", "Companion", "vector_appDebug"})
public final class DecryptionFailureTracker extends org.matrix.androidsdk.listeners.MXEventListener {
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, ms.messageapp.analytics.e2e.DecryptionFailure> reportedFailures = null;
    private final java.util.HashSet<java.lang.String> trackedEvents = null;
    private final java.util.Timer checkFailuresTimer = null;
    private final ms.messageapp.analytics.Analytics analytics = null;
    private static final long CHECK_PERIOD = 5000L;
    private static final long GRACE_PERIOD = 60000L;
    public static final ms.messageapp.analytics.e2e.DecryptionFailureTracker.Companion Companion = null;
    
    /**
     * * Reports the decryption error to the tracker.
     *     * The error will be filtered.
     *     * @param event: The error event
     *     * @param roomState: The state of the room when the decryption error happened
     *     * @param userId: The user id of the current session
     */
    public final void reportUnableToDecryptError(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.rest.model.Event event, @org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.data.RoomState roomState, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    /**
     * * Forces to check failures immediately
     */
    public final void dispatch() {
    }
    
    /**
     * * Reacts when an event is decrypted.
     *     * Potentially removes a previously reported failure
     *     * @param event the event who is decrypted
     */
    @java.lang.Override()
    public void onEventDecrypted(@org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.rest.model.Event event) {
    }
    
    private final void checkFailures() {
    }
    
    public DecryptionFailureTracker(@org.jetbrains.annotations.NotNull()
    ms.messageapp.analytics.Analytics analytics) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/analytics/e2e/DecryptionFailureTracker$Companion;", "", "()V", "CHECK_PERIOD", "", "GRACE_PERIOD", "vector_appDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}