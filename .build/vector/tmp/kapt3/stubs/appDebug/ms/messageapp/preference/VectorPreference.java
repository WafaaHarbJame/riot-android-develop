package ms.messageapp.preference;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceViewHolder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import ms.messageapp.R;
import ms.messageapp.ui.themes.ThemeUtils;
import org.matrix.androidsdk.util.Log;

/**
 * * create a Preference with a dedicated click/long click methods.
 * * It also allow the title to be displayed on several lines
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 )2\u00020\u0001:\u0002)*B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006+"}, d2 = {"Lms/messageapp/preference/VectorPreference;", "Landroid/support/v7/preference/Preference;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentHighlightAnimator", "Landroid/animation/Animator;", "getCurrentHighlightAnimator", "()Landroid/animation/Animator;", "setCurrentHighlightAnimator", "(Landroid/animation/Animator;)V", "value", "", "isHighlighted", "()Z", "setHighlighted", "(Z)V", "mTypeface", "getMTypeface", "()I", "setMTypeface", "(I)V", "onPreferenceLongClickListener", "Lms/messageapp/preference/VectorPreference$OnPreferenceLongClickListener;", "getOnPreferenceLongClickListener", "()Lms/messageapp/preference/VectorPreference$OnPreferenceLongClickListener;", "setOnPreferenceLongClickListener", "(Lms/messageapp/preference/VectorPreference$OnPreferenceLongClickListener;)V", "addClickListeners", "", "view", "Landroid/view/View;", "onBindViewHolder", "holder", "Landroid/support/v7/preference/PreferenceViewHolder;", "Companion", "OnPreferenceLongClickListener", "vector_appDebug"})
public class VectorPreference extends android.support.v7.preference.Preference {
    private int mTypeface;
    
    /**
     * * Sets the callback to be invoked when this Preference is long clicked.
     *     *
     *     * @param onPreferenceLongClickListener The callback to be invoked.
     */
    @org.jetbrains.annotations.Nullable()
    private ms.messageapp.preference.VectorPreference.OnPreferenceLongClickListener onPreferenceLongClickListener;
    private boolean isHighlighted;
    @org.jetbrains.annotations.Nullable()
    private android.animation.Animator currentHighlightAnimator;
    private static final java.lang.String LOG_TAG = null;
    public static final ms.messageapp.preference.VectorPreference.Companion Companion = null;
    
    public final int getMTypeface() {
        return 0;
    }
    
    public final void setMTypeface(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ms.messageapp.preference.VectorPreference.OnPreferenceLongClickListener getOnPreferenceLongClickListener() {
        return null;
    }
    
    public final void setOnPreferenceLongClickListener(@org.jetbrains.annotations.Nullable()
    ms.messageapp.preference.VectorPreference.OnPreferenceLongClickListener p0) {
    }
    
    public final boolean isHighlighted() {
        return false;
    }
    
    public final void setHighlighted(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.animation.Animator getCurrentHighlightAnimator() {
        return null;
    }
    
    public final void setCurrentHighlightAnimator(@org.jetbrains.annotations.Nullable()
    android.animation.Animator p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.preference.PreferenceViewHolder holder) {
    }
    
    /**
     * * @param view
     */
    private final void addClickListeners(android.view.View view) {
    }
    
    public VectorPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    public VectorPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    public VectorPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null, null, 0, 0);
    }
    
    /**
     * * Interface definition for a callback to be invoked when a preference is
     *     * long clicked.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/preference/VectorPreference$OnPreferenceLongClickListener;", "", "onPreferenceLongClick", "", "preference", "Landroid/support/v7/preference/Preference;", "vector_appDebug"})
    public static abstract interface OnPreferenceLongClickListener {
        
        /**
         * * Called when a Preference has been clicked.
         *         *
         *         * @param preference The Preference that was clicked.
         *         * @return True if the click was handled.
         */
        public abstract boolean onPreferenceLongClick(@org.jetbrains.annotations.NotNull()
        android.support.v7.preference.Preference preference);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/preference/VectorPreference$Companion;", "", "()V", "LOG_TAG", "", "kotlin.jvm.PlatformType", "vector_appDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}