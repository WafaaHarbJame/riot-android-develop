package ms.messageapp.util;

import java.util.regex.Pattern;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"emojisPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "containsOnlyEmojis", "", "str", "", "vector_appDebug"})
public final class EmojiKt {
    private static final java.util.regex.Pattern emojisPattern = null;
    
    /**
     * * Test if a string contains emojis.
     * * It seems that the regex [emoji_regex]+ does not work.
     * * Some characters like ?, # or digit are accepted.
     * *
     * * @param str the body to test
     * * @return true if the body contains only emojis
     */
    public static final boolean containsOnlyEmojis(@org.jetbrains.annotations.Nullable()
    java.lang.String str) {
        return false;
    }
}