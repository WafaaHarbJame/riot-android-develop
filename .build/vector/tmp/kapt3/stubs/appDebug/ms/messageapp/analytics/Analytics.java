package ms.messageapp.analytics;

import java.lang.System;

/**
 * * Defines the available tracking methods.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH&\u00a8\u0006\u0010"}, d2 = {"Lms/messageapp/analytics/Analytics;", "", "forceDispatch", "", "trackEvent", "event", "Lms/messageapp/analytics/TrackingEvent;", "trackScreen", "screen", "", "title", "visitVariable", "index", "", "name", "value", "vector_appDebug"})
public abstract interface Analytics {
    
    /**
     * * Method to track a screen in the analytic solution
     *     * @param screen the path of the screen
     *     * @param title the optional title of the screen
     */
    public abstract void trackScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String screen, @org.jetbrains.annotations.Nullable()
    java.lang.String title);
    
    /**
     * * Method to track an event
     *     * @param event the event to track
     */
    public abstract void trackEvent(@org.jetbrains.annotations.NotNull()
    ms.messageapp.analytics.TrackingEvent event);
    
    /**
     * * Method to add custom variable to the session
     *     * @param index the index of the variable
     *     * @param name the name of the variable
     *     * @param value the value of the variable
     */
    public abstract void visitVariable(int index, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    /**
     * * Method to dispatch immediately the previously not dispatched metrics
     */
    public abstract void forceDispatch();
    
    /**
     * * Defines the available tracking methods.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}