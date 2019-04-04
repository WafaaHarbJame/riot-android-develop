package ms.messageapp.util;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.annotation.StringRes;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.binaryfork.spanny.Spanny;
import ms.messageapp.ui.themes.ThemeUtils;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a\u0014\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u000b\u001a\u0016\u0010\f\u001a\u00020\u0005*\u0004\u0018\u00010\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u001a(\u0010\u0010\u001a\u00020\u0005*\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u0014\u001a\u00020\u000f\u001a\u0014\u0010\u0015\u001a\u00020\u0005*\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"UTILS_OPACITY_FULL", "", "UTILS_OPACITY_HALF", "UTILS_OPACITY_NONE", "autoResetTextInputLayoutErrors", "", "textInputLayouts", "", "Landroid/support/design/widget/TextInputLayout;", "resetTextInputLayoutErrors", "findAllTextInputLayout", "Landroid/view/ViewGroup;", "setRoundBackground", "Landroid/view/View;", "backgroundColor", "", "setTextWithColoredPart", "Landroid/widget/TextView;", "fullTextRes", "colorTextRes", "colorAttribute", "tintDrawableCompat", "vector_appDebug"})
public final class ViewUtilKt {
    
    /**
     * * The view is visible
     */
    public static final float UTILS_OPACITY_FULL = 1.0F;
    
    /**
     * * The view is half dimmed
     */
    public static final float UTILS_OPACITY_HALF = 0.5F;
    
    /**
     * * The view is hidden
     */
    public static final float UTILS_OPACITY_NONE = 0.0F;
    
    /**
     * * Find all TextInputLayout in a ViewGroup and in all its descendants
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<android.support.design.widget.TextInputLayout> findAllTextInputLayout(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $receiver) {
        return null;
    }
    
    /**
     * * Add a text change listener to all TextInputEditText to reset error on its TextInputLayout when the text is changed
     */
    public static final void autoResetTextInputLayoutErrors(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.support.design.widget.TextInputLayout> textInputLayouts) {
    }
    
    /**
     * * Reset error for all TextInputLayout
     */
    public static final void resetTextInputLayoutErrors(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.support.design.widget.TextInputLayout> textInputLayouts) {
    }
    
    /**
     * * Tint all drawables of a TextView.
     * *
     * * Note: this method has no effect on API < 23. Please also set the android:drawableTint attribute in the layout or in the style
     */
    @kotlin.Suppress(names = {"LocalVariableName"})
    public static final void tintDrawableCompat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @android.support.annotation.AttrRes()
    int colorAttribute) {
    }
    
    /**
     * * Set text with a colored part
     */
    public static final void setTextWithColoredPart(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @android.support.annotation.StringRes()
    int fullTextRes, @android.support.annotation.StringRes()
    int colorTextRes, @android.support.annotation.AttrRes()
    int colorAttribute) {
    }
    
    /**
     * * Apply a rounded (sides) rectangle as a background to the view.
     * *
     * * @param backgroundColor background colour
     */
    public static final void setRoundBackground(@org.jetbrains.annotations.Nullable()
    android.view.View $receiver, @android.support.annotation.ColorInt()
    int backgroundColor) {
    }
}