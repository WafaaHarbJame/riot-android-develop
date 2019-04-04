package ms.messageapp.analytics;

import org.matrix.androidsdk.data.metrics.MetricsListener;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * * A proxy implementing the MetricsListener. It does then dispatch the metrics to analytics, with a one time check by session.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lms/messageapp/analytics/MetricsListenerProxy;", "Lorg/matrix/androidsdk/data/metrics/MetricsListener;", "analytics", "Lms/messageapp/analytics/Analytics;", "(Lms/messageapp/analytics/Analytics;)V", "getAnalytics", "()Lms/messageapp/analytics/Analytics;", "firstSyncDispatched", "Ljava/util/concurrent/atomic/AtomicBoolean;", "incrementalSyncDispatched", "roomsLoadedDispatched", "storePreloadDispatched", "onIncrementalSyncFinished", "", "duration", "", "onInitialSyncFinished", "onRoomsLoaded", "nbOfRooms", "", "onStorePreloaded", "vector_appDebug"})
public final class MetricsListenerProxy implements org.matrix.androidsdk.data.metrics.MetricsListener {
    private final java.util.concurrent.atomic.AtomicBoolean firstSyncDispatched = null;
    private final java.util.concurrent.atomic.AtomicBoolean incrementalSyncDispatched = null;
    private final java.util.concurrent.atomic.AtomicBoolean storePreloadDispatched = null;
    private final java.util.concurrent.atomic.AtomicBoolean roomsLoadedDispatched = null;
    @org.jetbrains.annotations.NotNull()
    private final ms.messageapp.analytics.Analytics analytics = null;
    
    @java.lang.Override()
    public void onInitialSyncFinished(long duration) {
    }
    
    @java.lang.Override()
    public void onIncrementalSyncFinished(long duration) {
    }
    
    @java.lang.Override()
    public void onStorePreloaded(long duration) {
    }
    
    @java.lang.Override()
    public void onRoomsLoaded(int nbOfRooms) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.analytics.Analytics getAnalytics() {
        return null;
    }
    
    public MetricsListenerProxy(@org.jetbrains.annotations.NotNull()
    ms.messageapp.analytics.Analytics analytics) {
        super();
    }
}