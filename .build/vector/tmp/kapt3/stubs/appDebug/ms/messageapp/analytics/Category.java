package ms.messageapp.analytics;

import ms.messageapp.analytics.e2e.DecryptionFailureReason;

/**
 * * A category to be linked to an {@link im.vector.analytics.TrackingEvent}
 * * @param value to log into your analytics console
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lms/messageapp/analytics/Category;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "METRICS", "E2E", "vector_appDebug"})
public enum Category {
    /*public static final*/ METRICS /* = new METRICS(null) */,
    /*public static final*/ E2E /* = new E2E(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String value = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    Category(java.lang.String value) {
    }
}