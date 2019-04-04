package ms.messageapp.analytics;

import android.content.Context;
import ms.messageapp.BuildConfig;
import ms.messageapp.util.PreferencesManager;
import org.matrix.androidsdk.util.Log;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001\u00a2\u0006\u0002\u0010\u0006J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lms/messageapp/analytics/AppAnalytics;", "Lms/messageapp/analytics/Analytics;", "context", "Landroid/content/Context;", "analytics", "", "(Landroid/content/Context;[Lms/messageapp/analytics/Analytics;)V", "[Lms/messageapp/analytics/Analytics;", "forceDispatch", "", "trackEvent", "event", "Lms/messageapp/analytics/TrackingEvent;", "trackScreen", "screen", "", "title", "visitVariable", "index", "", "name", "value", "vector_appDebug"})
public final class AppAnalytics implements ms.messageapp.analytics.Analytics {
    private final android.content.Context context = null;
    private final ms.messageapp.analytics.Analytics[] analytics = null;
    
    @java.lang.Override()
    public void trackScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String screen, @org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public void visitVariable(int index, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void trackEvent(@org.jetbrains.annotations.NotNull()
    ms.messageapp.analytics.TrackingEvent event) {
    }
    
    @java.lang.Override()
    public void forceDispatch() {
    }
    
    public AppAnalytics(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ms.messageapp.analytics.Analytics... analytics) {
        super();
    }
}