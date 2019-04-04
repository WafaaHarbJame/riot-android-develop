package ms.messageapp.analytics;

import android.content.Context;
import ms.messageapp.R;
import org.piwik.sdk.Piwik;
import org.piwik.sdk.QueryParams;
import org.piwik.sdk.Tracker;
import org.piwik.sdk.TrackerConfig;
import org.piwik.sdk.extra.CustomVariables;
import org.piwik.sdk.extra.TrackHelper;

/**
 * * A class implementing the Analytics interface for the Piwik solution
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lms/messageapp/analytics/PiwikAnalytics;", "Lms/messageapp/analytics/Analytics;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "tracker", "Lorg/piwik/sdk/Tracker;", "forceDispatch", "", "trackEvent", "event", "Lms/messageapp/analytics/TrackingEvent;", "trackScreen", "screen", "", "title", "visitVariable", "index", "", "name", "value", "vector_appDebug"})
public final class PiwikAnalytics implements ms.messageapp.analytics.Analytics {
    private final org.piwik.sdk.Tracker tracker = null;
    
    @java.lang.Override()
    public void trackScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String screen, @org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public void trackEvent(@org.jetbrains.annotations.NotNull()
    ms.messageapp.analytics.TrackingEvent event) {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Override()
    public void visitVariable(int index, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void forceDispatch() {
    }
    
    public PiwikAnalytics(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}