package ms.messageapp.preference;

import android.content.Context;
import android.support.v7.preference.ListPreference;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceViewHolder;
import android.util.AttributeSet;
import android.view.View;
import ms.messageapp.R;

/**
 * * Customize ListPreference class to add a warning icon to the right side of the list.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lms/messageapp/preference/VectorListPreference;", "Landroid/support/v7/preference/ListPreference;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mIsWarningIconVisible", "", "mWarningIconClickListener", "Lms/messageapp/preference/VectorListPreference$OnPreferenceWarningIconClickListener;", "mWarningIconView", "Landroid/view/View;", "onBindViewHolder", "", "holder", "Landroid/support/v7/preference/PreferenceViewHolder;", "setOnPreferenceWarningIconClickListener", "onPreferenceWarningIconClickListener", "setWarningIconVisible", "isVisible", "OnPreferenceWarningIconClickListener", "vector_appDebug"})
public final class VectorListPreference extends android.support.v7.preference.ListPreference {
    private android.view.View mWarningIconView;
    private boolean mIsWarningIconVisible;
    private ms.messageapp.preference.VectorListPreference.OnPreferenceWarningIconClickListener mWarningIconClickListener;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.preference.PreferenceViewHolder holder) {
    }
    
    /**
     * * Sets the callback to be invoked when this warning icon is clicked.
     *     *
     *     * @param onPreferenceWarningIconClickListener The callback to be invoked.
     */
    public final void setOnPreferenceWarningIconClickListener(@org.jetbrains.annotations.NotNull()
    ms.messageapp.preference.VectorListPreference.OnPreferenceWarningIconClickListener onPreferenceWarningIconClickListener) {
    }
    
    /**
     * * Set the warning icon visibility.
     *     *
     *     * @param isVisible to display the icon
     */
    public final void setWarningIconVisible(boolean isVisible) {
    }
    
    public VectorListPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    public VectorListPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    public VectorListPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, 0);
    }
    
    /**
     * * Interface definition for a callback to be invoked when the warning icon is clicked.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/preference/VectorListPreference$OnPreferenceWarningIconClickListener;", "", "onWarningIconClick", "", "preference", "Landroid/support/v7/preference/Preference;", "vector_appDebug"})
    public static abstract interface OnPreferenceWarningIconClickListener {
        
        /**
         * * Called when a warning icon has been clicked.
         *         *
         *         * @param preference The Preference that was clicked.
         */
        public abstract void onWarningIconClick(@org.jetbrains.annotations.NotNull()
        android.support.v7.preference.Preference preference);
    }
}