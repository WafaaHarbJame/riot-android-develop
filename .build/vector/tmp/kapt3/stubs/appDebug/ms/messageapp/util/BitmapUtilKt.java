package ms.messageapp.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.matrix.androidsdk.util.Log;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"LOG_TAG", "", "addBackgroundColor", "Landroid/graphics/Bitmap;", "backgroundColor", "", "createSquareBitmap", "vector_appDebug"})
public final class BitmapUtilKt {
    private static final java.lang.String LOG_TAG = "BitmapUtil";
    
    /**
     * * Create a centered square bitmap from another one.
     * *
     * * if height == width
     * * +-------+
     * * |XXXXXXX|
     * * |XXXXXXX|
     * * |XXXXXXX|
     * * +-------+
     * *
     * * if width > height
     * * +------+-------+------+
     * * |      |XXXXXXX|      |
     * * |      |XXXXXXX|      |
     * * |      |XXXXXXX|      |
     * * +------+-------+------+
     * *
     * * if height > width
     * * +-------+
     * * |       |
     * * |       |
     * * +-------+
     * * |XXXXXXX|
     * * |XXXXXXX|
     * * |XXXXXXX|
     * * +-------+
     * * |       |
     * * |       |
     * * +-------+
     * *
     * * @param bitmap the bitmap to "square"
     * * @return the squared bitmap
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap createSquareBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $receiver) {
        return null;
    }
    
    /**
     * * Add a background color to the Bitmap
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap addBackgroundColor(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $receiver, int backgroundColor) {
        return null;
    }
}