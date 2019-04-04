package ms.messageapp.util;

import android.content.Context;
import org.matrix.androidsdk.util.Log;
import java.io.InputStreamReader;

/**
 * * Singleton to read asset files
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lms/messageapp/util/AssetReader;", "", "()V", "cache", "Ljava/util/HashMap;", "", "clearCache", "", "readAssetFile", "context", "Landroid/content/Context;", "assetFilename", "vector_appDebug"})
public final class AssetReader {
    private static final java.util.HashMap<java.lang.String, java.lang.String> cache = null;
    public static final ms.messageapp.util.AssetReader INSTANCE = null;
    
    /**
     * * Read an asset from resource and return a String or null in cas of error.
     *     *
     *     * @param assetFilename Asset filename
     *     * @return the content of the asset file
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String readAssetFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String assetFilename) {
        return null;
    }
    
    public final void clearCache() {
    }
    
    private AssetReader() {
        super();
    }
}