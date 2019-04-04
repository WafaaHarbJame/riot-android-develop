package ms.messageapp.features.hhs;

import android.content.Context;
import android.support.annotation.StringRes;
import android.text.Html;
import com.binaryfork.spanny.Spanny;
import ms.messageapp.R;
import org.matrix.androidsdk.rest.model.MatrixError;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lms/messageapp/features/hhs/ResourceLimitErrorFormatter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "format", "", "matrixError", "Lorg/matrix/androidsdk/rest/model/MatrixError;", "mode", "Lms/messageapp/features/hhs/ResourceLimitErrorFormatter$Mode;", "separator", "clickable", "", "uriAsLink", "", "uri", "Mode", "vector_appDebug"})
public final class ResourceLimitErrorFormatter {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.CharSequence format(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.rest.model.MatrixError matrixError, @org.jetbrains.annotations.NotNull()
    ms.messageapp.features.hhs.ResourceLimitErrorFormatter.Mode mode, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence separator, boolean clickable) {
        return null;
    }
    
    /**
     * * Create a HTML link with a uri
     */
    private final java.lang.String uriAsLink(java.lang.String uri) {
        return null;
    }
    
    public ResourceLimitErrorFormatter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB%\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lms/messageapp/features/hhs/ResourceLimitErrorFormatter$Mode;", "", "mauErrorRes", "", "defaultErrorRes", "contactRes", "(III)V", "getContactRes", "()I", "getDefaultErrorRes", "getMauErrorRes", "Hard", "Soft", "Lms/messageapp/features/hhs/ResourceLimitErrorFormatter$Mode$Soft;", "Lms/messageapp/features/hhs/ResourceLimitErrorFormatter$Mode$Hard;", "vector_appDebug"})
    public static abstract class Mode {
        private final int mauErrorRes = 0;
        private final int defaultErrorRes = 0;
        private final int contactRes = 0;
        
        public final int getMauErrorRes() {
            return 0;
        }
        
        public final int getDefaultErrorRes() {
            return 0;
        }
        
        public final int getContactRes() {
            return 0;
        }
        
        private Mode(@android.support.annotation.StringRes()
        int mauErrorRes, @android.support.annotation.StringRes()
        int defaultErrorRes, @android.support.annotation.StringRes()
        int contactRes) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/features/hhs/ResourceLimitErrorFormatter$Mode$Soft;", "Lms/messageapp/features/hhs/ResourceLimitErrorFormatter$Mode;", "()V", "vector_appDebug"})
        public static final class Soft extends ms.messageapp.features.hhs.ResourceLimitErrorFormatter.Mode {
            public static final ms.messageapp.features.hhs.ResourceLimitErrorFormatter.Mode.Soft INSTANCE = null;
            
            private Soft() {
                super(0, 0, 0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/features/hhs/ResourceLimitErrorFormatter$Mode$Hard;", "Lms/messageapp/features/hhs/ResourceLimitErrorFormatter$Mode;", "()V", "vector_appDebug"})
        public static final class Hard extends ms.messageapp.features.hhs.ResourceLimitErrorFormatter.Mode {
            public static final ms.messageapp.features.hhs.ResourceLimitErrorFormatter.Mode.Hard INSTANCE = null;
            
            private Hard() {
                super(0, 0, 0);
            }
        }
    }
}