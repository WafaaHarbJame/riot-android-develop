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
 * * This class represents the possible states the listener can have (Normal or Exceeded)
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0082\u0001\u0002\u0007\b\u00a8\u0006\t"}, d2 = {"Lms/messageapp/features/hhs/LimitResourceState;", "", "()V", "softErrorOrNull", "Lorg/matrix/androidsdk/rest/model/MatrixError;", "Exceeded", "Normal", "Lms/messageapp/features/hhs/LimitResourceState$Normal;", "Lms/messageapp/features/hhs/LimitResourceState$Exceeded;", "vector_appDebug"})
public abstract class LimitResourceState {
    
    @org.jetbrains.annotations.Nullable()
    public final org.matrix.androidsdk.rest.model.MatrixError softErrorOrNull() {
        return null;
    }
    
    private LimitResourceState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/features/hhs/LimitResourceState$Normal;", "Lms/messageapp/features/hhs/LimitResourceState;", "()V", "vector_appDebug"})
    public static final class Normal extends ms.messageapp.features.hhs.LimitResourceState {
        public static final ms.messageapp.features.hhs.LimitResourceState.Normal INSTANCE = null;
        
        private Normal() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lms/messageapp/features/hhs/LimitResourceState$Exceeded;", "Lms/messageapp/features/hhs/LimitResourceState;", "roomId", "", "eventId", "matrixError", "Lorg/matrix/androidsdk/rest/model/MatrixError;", "(Ljava/lang/String;Ljava/lang/String;Lorg/matrix/androidsdk/rest/model/MatrixError;)V", "getEventId", "()Ljava/lang/String;", "getMatrixError", "()Lorg/matrix/androidsdk/rest/model/MatrixError;", "getRoomId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "vector_appDebug"})
    public static final class Exceeded extends ms.messageapp.features.hhs.LimitResourceState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String roomId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String eventId = null;
        @org.jetbrains.annotations.NotNull()
        private final org.matrix.androidsdk.rest.model.MatrixError matrixError = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRoomId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEventId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.matrix.androidsdk.rest.model.MatrixError getMatrixError() {
            return null;
        }
        
        public Exceeded(@org.jetbrains.annotations.NotNull()
        java.lang.String roomId, @org.jetbrains.annotations.NotNull()
        java.lang.String eventId, @org.jetbrains.annotations.NotNull()
        org.matrix.androidsdk.rest.model.MatrixError matrixError) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.matrix.androidsdk.rest.model.MatrixError component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.features.hhs.LimitResourceState.Exceeded copy(@org.jetbrains.annotations.NotNull()
        java.lang.String roomId, @org.jetbrains.annotations.NotNull()
        java.lang.String eventId, @org.jetbrains.annotations.NotNull()
        org.matrix.androidsdk.rest.model.MatrixError matrixError) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}