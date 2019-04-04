package ms.messageapp.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/util/AutoCompletionMode;", "", "(Ljava/lang/String;I)V", "USER_MODE", "COMMAND_MODE", "Companion", "vector_appDebug"})
public enum AutoCompletionMode {
    /*public static final*/ USER_MODE /* = new USER_MODE() */,
    /*public static final*/ COMMAND_MODE /* = new COMMAND_MODE() */;
    public static final ms.messageapp.util.AutoCompletionMode.Companion Companion = null;
    
    AutoCompletionMode() {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lms/messageapp/util/AutoCompletionMode$Companion;", "", "()V", "getWithText", "Lms/messageapp/util/AutoCompletionMode;", "text", "", "vector_appDebug"})
    public static final class Companion {
        
        /**
         * * It's important to start with " " to enter USER_MODE even if text starts with "/"
         */
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.util.AutoCompletionMode getWithText(@org.jetbrains.annotations.NotNull()
        java.lang.String text) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}