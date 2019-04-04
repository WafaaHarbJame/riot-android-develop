package ms.messageapp.analytics;

import ms.messageapp.analytics.e2e.DecryptionFailureReason;

/**
 * * Represents all the analytics events, to be dispatched to {@link im.vector.analytics.Analytic#trackEvent()}
 * * @param category the category associated with the event
 * * @param action the action associated with the event
 * * @param title the title associated with the event
 * * @param value the optional value associated with the event
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0014\u0015\u0016\u0017\u0018\u0019B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f\u00a8\u0006 "}, d2 = {"Lms/messageapp/analytics/TrackingEvent;", "", "category", "Lms/messageapp/analytics/Category;", "action", "Lms/messageapp/analytics/Action;", "title", "", "value", "", "(Lms/messageapp/analytics/Category;Lms/messageapp/analytics/Action;Ljava/lang/String;Ljava/lang/Float;)V", "getAction", "()Lms/messageapp/analytics/Action;", "getCategory", "()Lms/messageapp/analytics/Category;", "getTitle", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Float;", "Ljava/lang/Float;", "DecryptionFailure", "IncrementalSync", "InitialSync", "LaunchScreen", "Rooms", "StorePreload", "Lms/messageapp/analytics/TrackingEvent$InitialSync;", "Lms/messageapp/analytics/TrackingEvent$IncrementalSync;", "Lms/messageapp/analytics/TrackingEvent$StorePreload;", "Lms/messageapp/analytics/TrackingEvent$LaunchScreen;", "Lms/messageapp/analytics/TrackingEvent$Rooms;", "Lms/messageapp/analytics/TrackingEvent$DecryptionFailure;", "vector_appDebug"})
public abstract class TrackingEvent {
    @org.jetbrains.annotations.NotNull()
    private final ms.messageapp.analytics.Category category = null;
    @org.jetbrains.annotations.NotNull()
    private final ms.messageapp.analytics.Action action = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Float value = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.analytics.Category getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.analytics.Action getAction() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getValue() {
        return null;
    }
    
    private TrackingEvent(ms.messageapp.analytics.Category category, ms.messageapp.analytics.Action action, java.lang.String title, java.lang.Float value) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lms/messageapp/analytics/TrackingEvent$InitialSync;", "Lms/messageapp/analytics/TrackingEvent;", "duration", "", "(J)V", "getDuration", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "vector_appDebug"})
    public static final class InitialSync extends ms.messageapp.analytics.TrackingEvent {
        private final long duration = 0L;
        
        public final long getDuration() {
            return 0L;
        }
        
        public InitialSync(long duration) {
            super(null, null, null, null);
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.analytics.TrackingEvent.InitialSync copy(long duration) {
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
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lms/messageapp/analytics/TrackingEvent$IncrementalSync;", "Lms/messageapp/analytics/TrackingEvent;", "duration", "", "(J)V", "getDuration", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "vector_appDebug"})
    public static final class IncrementalSync extends ms.messageapp.analytics.TrackingEvent {
        private final long duration = 0L;
        
        public final long getDuration() {
            return 0L;
        }
        
        public IncrementalSync(long duration) {
            super(null, null, null, null);
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.analytics.TrackingEvent.IncrementalSync copy(long duration) {
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
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lms/messageapp/analytics/TrackingEvent$StorePreload;", "Lms/messageapp/analytics/TrackingEvent;", "duration", "", "(J)V", "getDuration", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "vector_appDebug"})
    public static final class StorePreload extends ms.messageapp.analytics.TrackingEvent {
        private final long duration = 0L;
        
        public final long getDuration() {
            return 0L;
        }
        
        public StorePreload(long duration) {
            super(null, null, null, null);
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.analytics.TrackingEvent.StorePreload copy(long duration) {
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
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lms/messageapp/analytics/TrackingEvent$LaunchScreen;", "Lms/messageapp/analytics/TrackingEvent;", "duration", "", "(J)V", "getDuration", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "vector_appDebug"})
    public static final class LaunchScreen extends ms.messageapp.analytics.TrackingEvent {
        private final long duration = 0L;
        
        public final long getDuration() {
            return 0L;
        }
        
        public LaunchScreen(long duration) {
            super(null, null, null, null);
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.analytics.TrackingEvent.LaunchScreen copy(long duration) {
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
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lms/messageapp/analytics/TrackingEvent$Rooms;", "Lms/messageapp/analytics/TrackingEvent;", "nbOfRooms", "", "(I)V", "getNbOfRooms", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "vector_appDebug"})
    public static final class Rooms extends ms.messageapp.analytics.TrackingEvent {
        private final int nbOfRooms = 0;
        
        public final int getNbOfRooms() {
            return 0;
        }
        
        public Rooms(int nbOfRooms) {
            super(null, null, null, null);
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.analytics.TrackingEvent.Rooms copy(int nbOfRooms) {
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
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\b\u001a\u00020\u0005H\u00c2\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lms/messageapp/analytics/TrackingEvent$DecryptionFailure;", "Lms/messageapp/analytics/TrackingEvent;", "reason", "Lms/messageapp/analytics/e2e/DecryptionFailureReason;", "failureCount", "", "(Lms/messageapp/analytics/e2e/DecryptionFailureReason;I)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "vector_appDebug"})
    public static final class DecryptionFailure extends ms.messageapp.analytics.TrackingEvent {
        private final ms.messageapp.analytics.e2e.DecryptionFailureReason reason = null;
        private final int failureCount = 0;
        
        public DecryptionFailure(@org.jetbrains.annotations.NotNull()
        ms.messageapp.analytics.e2e.DecryptionFailureReason reason, int failureCount) {
            super(null, null, null, null);
        }
        
        private final ms.messageapp.analytics.e2e.DecryptionFailureReason component1() {
            return null;
        }
        
        private final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.analytics.TrackingEvent.DecryptionFailure copy(@org.jetbrains.annotations.NotNull()
        ms.messageapp.analytics.e2e.DecryptionFailureReason reason, int failureCount) {
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