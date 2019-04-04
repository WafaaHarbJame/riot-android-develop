package ms.messageapp.features.hhs;

import org.matrix.androidsdk.MXDataHandler;
import org.matrix.androidsdk.data.Room;
import org.matrix.androidsdk.data.RoomState;
import org.matrix.androidsdk.data.RoomTag;
import org.matrix.androidsdk.listeners.MXEventListener;
import org.matrix.androidsdk.rest.callback.SimpleApiCallback;
import org.matrix.androidsdk.rest.model.Event;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.rest.model.ServerNoticeUsageLimitContent;
import org.matrix.androidsdk.util.JsonUtils;
import org.matrix.androidsdk.util.Log;

/**
 * * This class is responsible for listening to system alert rooms and looking for pinning events.
 * * When an EVENT_TYPE_SERVER_NOTICE_USAGE_LIMIT is pinned, the state goes from Normal to Exceeded.
 * * When the event is unpinned, the state goes back to Normal.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lms/messageapp/features/hhs/ResourceLimitEventListener;", "Lorg/matrix/androidsdk/listeners/MXEventListener;", "dataHandler", "Lorg/matrix/androidsdk/MXDataHandler;", "callback", "Lms/messageapp/features/hhs/ResourceLimitEventListener$Callback;", "(Lorg/matrix/androidsdk/MXDataHandler;Lms/messageapp/features/hhs/ResourceLimitEventListener$Callback;)V", "<set-?>", "Lms/messageapp/features/hhs/LimitResourceState;", "limitResourceState", "getLimitResourceState", "()Lms/messageapp/features/hhs/LimitResourceState;", "serverNoticesRooms", "", "Lorg/matrix/androidsdk/data/Room;", "loadAndProcessServerNoticeRooms", "", "loadServerNoticeRooms", "onLiveEvent", "event", "Lorg/matrix/androidsdk/rest/model/Event;", "roomState", "Lorg/matrix/androidsdk/data/RoomState;", "onRoomTagEvent", "roomId", "", "processPinnedEvents", "room", "retrieveResourceLimitExceededEvent", "eventId", "shouldStateBeBackToNormal", "", "state", "pinnedEvents", "Callback", "vector_appDebug"})
public final class ResourceLimitEventListener extends org.matrix.androidsdk.listeners.MXEventListener {
    private java.util.List<? extends org.matrix.androidsdk.data.Room> serverNoticesRooms;
    @org.jetbrains.annotations.NotNull()
    private ms.messageapp.features.hhs.LimitResourceState limitResourceState;
    private final org.matrix.androidsdk.MXDataHandler dataHandler = null;
    private final ms.messageapp.features.hhs.ResourceLimitEventListener.Callback callback = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.features.hhs.LimitResourceState getLimitResourceState() {
        return null;
    }
    
    @java.lang.Override()
    public void onRoomTagEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId) {
    }
    
    @java.lang.Override()
    public void onLiveEvent(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.rest.model.Event event, @org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.data.RoomState roomState) {
    }
    
    private final void loadAndProcessServerNoticeRooms() {
    }
    
    /**
     * * Reload the server notice rooms.
     *     * This method is called when a room tag event is emitted
     */
    private final java.util.List<org.matrix.androidsdk.data.Room> loadServerNoticeRooms() {
        return null;
    }
    
    private final void processPinnedEvents(org.matrix.androidsdk.data.Room room) {
    }
    
    private final boolean shouldStateBeBackToNormal(ms.messageapp.features.hhs.LimitResourceState state, java.lang.String roomId, java.util.List<java.lang.String> pinnedEvents) {
        return false;
    }
    
    private final void retrieveResourceLimitExceededEvent(java.lang.String roomId, java.lang.String eventId) {
    }
    
    public ResourceLimitEventListener(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXDataHandler dataHandler, @org.jetbrains.annotations.Nullable()
    ms.messageapp.features.hhs.ResourceLimitEventListener.Callback callback) {
        super();
    }
    
    /**
     * * This callback allows to alert when the state change
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lms/messageapp/features/hhs/ResourceLimitEventListener$Callback;", "", "onResourceLimitStateChanged", "", "vector_appDebug"})
    public static abstract interface Callback {
        
        public abstract void onResourceLimitStateChanged();
    }
}