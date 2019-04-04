package ms.messageapp.settings;

import android.content.res.Configuration;
import android.support.v7.preference.PreferenceManager;
import android.text.TextUtils;
import ms.messageapp.R;
import ms.messageapp.VectorApp;

/**
 * * Object to manage the Font Scale choice of the user
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lms/messageapp/settings/FontScale;", "", "()V", "APPLICATION_FONT_SCALE_KEY", "", "FONT_SCALE_HUGE", "FONT_SCALE_LARGE", "FONT_SCALE_LARGER", "FONT_SCALE_LARGEST", "FONT_SCALE_NORMAL", "FONT_SCALE_SMALL", "FONT_SCALE_TINY", "fontScaleToPrefValue", "", "", "prefValueToNameResId", "", "getFontScale", "getFontScaleDescription", "getFontScalePrefValue", "saveFontScale", "", "scaleValue", "updateFontScale", "fontScaleDescription", "vector_appDebug"})
public final class FontScale {
    private static final java.lang.String APPLICATION_FONT_SCALE_KEY = "APPLICATION_FONT_SCALE_KEY";
    private static final java.lang.String FONT_SCALE_TINY = "FONT_SCALE_TINY";
    private static final java.lang.String FONT_SCALE_SMALL = "FONT_SCALE_SMALL";
    private static final java.lang.String FONT_SCALE_NORMAL = "FONT_SCALE_NORMAL";
    private static final java.lang.String FONT_SCALE_LARGE = "FONT_SCALE_LARGE";
    private static final java.lang.String FONT_SCALE_LARGER = "FONT_SCALE_LARGER";
    private static final java.lang.String FONT_SCALE_LARGEST = "FONT_SCALE_LARGEST";
    private static final java.lang.String FONT_SCALE_HUGE = "FONT_SCALE_HUGE";
    private static final java.util.Map<java.lang.Float, java.lang.String> fontScaleToPrefValue = null;
    private static final java.util.Map<java.lang.String, java.lang.Integer> prefValueToNameResId = null;
    public static final ms.messageapp.settings.FontScale INSTANCE = null;
    
    /**
     * * Get the font scale value from SharedPrefs. Init the SharedPrefs if necessary
     *     *
     *     * @return the font scale
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFontScalePrefValue() {
        return null;
    }
    
    /**
     * * Provides the font scale value
     *     *
     *     * @return the font scale
     */
    public final float getFontScale() {
        return 0.0F;
    }
    
    /**
     * * Provides the font scale description
     *     *
     *     * @return the font description
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFontScaleDescription() {
        return null;
    }
    
    /**
     * * Update the font size from the locale description.
     *     *
     *     * @param fontScaleDescription the font scale description
     */
    public final void updateFontScale(@org.jetbrains.annotations.NotNull()
    java.lang.String fontScaleDescription) {
    }
    
    /**
     * * Save the new font scale
     *     *
     *     * @param scaleValue the text scale
     */
    public final void saveFontScale(@org.jetbrains.annotations.NotNull()
    java.lang.String scaleValue) {
    }
    
    private FontScale() {
        super();
    }
}