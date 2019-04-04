package ms.messageapp.util;

import android.content.Context;
import android.util.Log;
import java.io.File;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a7\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052%\u0010\r\u001a!\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00030\u000ej\u0002`\u0011H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000*@\u0010\u0012\"\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00030\u000e2\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00030\u000e\u00a8\u0006\u0013"}, d2 = {"LOG_TAG", "", "deleteAction", "", "file", "Ljava/io/File;", "deleteAllFiles", "", "context", "Landroid/content/Context;", "logAction", "lsFiles", "recursiveActionOnFile", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lms/messageapp/util/ActionOnFile;", "ActionOnFile", "vector_appDebug"})
public final class FileUtilsKt {
    private static final java.lang.String LOG_TAG = "FileUtils";
    
    public static final void deleteAllFiles(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private static final boolean deleteAction(java.io.File file) {
        return false;
    }
    
    public static final void lsFiles(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private static final boolean logAction(java.io.File file) {
        return false;
    }
    
    /**
     * * Return true in case of success
     */
    private static final boolean recursiveActionOnFile(java.io.File file, kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> action) {
        return false;
    }
}