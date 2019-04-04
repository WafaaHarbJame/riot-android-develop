package ms.messageapp.util;

import java.util.regex.Pattern;

/**
 * * Better support for geo URi
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lms/messageapp/util/VectorAutoLinkPatterns;", "", "()V", "COORDINATE_SYSTEM", "", "GEO_URI", "Ljava/util/regex/Pattern;", "getGEO_URI", "()Ljava/util/regex/Pattern;", "LAT_OR_LONG_OR_ALT_NUMBER", "vector_appDebug"})
public final class VectorAutoLinkPatterns {
    private static final java.lang.String LAT_OR_LONG_OR_ALT_NUMBER = "-?\\d+(?:\\.\\d+)?";
    private static final java.lang.String COORDINATE_SYSTEM = ";crs=[\\w-]+";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.regex.Pattern GEO_URI = null;
    public static final ms.messageapp.util.VectorAutoLinkPatterns INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.regex.Pattern getGEO_URI() {
        return null;
    }
    
    private VectorAutoLinkPatterns() {
        super();
    }
}