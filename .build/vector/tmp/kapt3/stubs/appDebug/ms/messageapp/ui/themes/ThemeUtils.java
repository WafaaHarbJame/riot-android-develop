package ms.messageapp.ui.themes;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Menu;
import ms.messageapp.R;
import ms.messageapp.VectorApp;
import ms.messageapp.activity.VectorGroupDetailsActivity;
import org.matrix.androidsdk.util.Log;
import java.util.*;

/**
 * * Util class for managing themes.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\fH\u0007J\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\fJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0004J\u0016\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fJ \u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!2\b\b\u0001\u0010#\u001a\u00020\fJ\u0018\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\b\u0001\u0010%\u001a\u00020\fJ\u0016\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u0010%\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lms/messageapp/ui/themes/ThemeUtils;", "", "()V", "APPLICATION_THEME_KEY", "", "LOG_TAG", "THEME_BLACK_VALUE", "THEME_DARK_VALUE", "THEME_LIGHT_VALUE", "THEME_STATUS_VALUE", "mColorByAttr", "Ljava/util/HashMap;", "", "getApplicationTheme", "context", "Landroid/content/Context;", "getColor", "c", "colorAttribute", "getResourceId", "resourceId", "setActivityTheme", "", "activity", "Landroid/app/Activity;", "otherThemes", "Lms/messageapp/ui/themes/ActivityOtherThemes;", "setApplicationTheme", "aTheme", "setTabLayoutTheme", "layout", "Landroid/support/design/widget/TabLayout;", "tintDrawable", "Landroid/graphics/drawable/Drawable;", "drawable", "attribute", "tintDrawableWithColor", "color", "tintMenuIcons", "menu", "Landroid/view/Menu;", "vector_appDebug"})
public final class ThemeUtils {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOG_TAG = "ThemeUtils";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPLICATION_THEME_KEY = "APPLICATION_THEME_KEY";
    private static final java.lang.String THEME_DARK_VALUE = "dark";
    private static final java.lang.String THEME_LIGHT_VALUE = "light";
    private static final java.lang.String THEME_BLACK_VALUE = "black";
    private static final java.lang.String THEME_STATUS_VALUE = "status";
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> mColorByAttr = null;
    public static final ms.messageapp.ui.themes.ThemeUtils INSTANCE = null;
    
    /**
     * * Provides the selected application theme
     *     *
     *     * @param context the context
     *     * @return the selected application theme
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApplicationTheme(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * * Update the application theme
     *     *
     *     * @param aTheme the new theme
     */
    public final void setApplicationTheme(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String aTheme) {
    }
    
    /**
     * * Set the activity theme according to the selected one.
     *     *
     *     * @param activity the activity
     */
    public final void setActivityTheme(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    ms.messageapp.ui.themes.ActivityOtherThemes otherThemes) {
    }
    
    /**
     * * Set the TabLayout colors.
     *     * It seems that there is no proper way to manage it with the manifest file.
     *     *
     *     * @param activity the activity
     *     * @param layout   the layout
     */
    public final void setTabLayoutTheme(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.support.design.widget.TabLayout layout) {
    }
    
    /**
     * * Translates color attributes to colors
     *     *
     *     * @param c              Context
     *     * @param colorAttribute Color Attribute
     *     * @return Requested Color
     */
    @android.support.annotation.ColorInt()
    public final int getColor(@org.jetbrains.annotations.NotNull()
    android.content.Context c, @android.support.annotation.AttrRes()
    int colorAttribute) {
        return 0;
    }
    
    /**
     * * Get the resource Id applied to the current theme
     *     *
     *     * @param c          the context
     *     * @param resourceId the resource id
     *     * @return the resource Id for the current theme
     */
    public final int getResourceId(@org.jetbrains.annotations.NotNull()
    android.content.Context c, int resourceId) {
        return 0;
    }
    
    /**
     * * Update the menu icons colors
     *     *
     *     * @param menu  the menu
     *     * @param color the color
     */
    public final void tintMenuIcons(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, int color) {
    }
    
    /**
     * * Tint the drawable with a theme attribute
     *     *
     *     * @param context   the context
     *     * @param drawable  the drawable to tint
     *     * @param attribute the theme color
     *     * @return the tinted drawable
     */
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable tintDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawable, @android.support.annotation.AttrRes()
    int attribute) {
        return null;
    }
    
    /**
     * * Tint the drawable with a color integer
     *     *
     *     * @param drawable the drawable to tint
     *     * @param color    the color
     *     * @return the tinted drawable
     */
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable tintDrawableWithColor(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawable, @android.support.annotation.ColorInt()
    int color) {
        return null;
    }
    
    private ThemeUtils() {
        super();
    }
}