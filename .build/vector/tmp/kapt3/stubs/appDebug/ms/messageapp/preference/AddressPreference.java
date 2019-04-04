package ms.messageapp.preference;

import android.content.Context;
import android.support.v7.preference.PreferenceViewHolder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import ms.messageapp.R;

/**
 * * Preference used in Room setting for Room aliases
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lms/messageapp/preference/AddressPreference;", "Lms/messageapp/preference/VectorPreference;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mIsMainIconVisible", "", "mMainAddressIconView", "Landroid/widget/ImageView;", "mainIconView", "Landroid/view/View;", "getMainIconView", "()Landroid/view/View;", "onBindViewHolder", "", "holder", "Landroid/support/v7/preference/PreferenceViewHolder;", "setMainIconVisible", "isVisible", "vector_appDebug"})
public final class AddressPreference extends ms.messageapp.preference.VectorPreference {
    private android.widget.ImageView mMainAddressIconView;
    private boolean mIsMainIconVisible;
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getMainIconView() {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.preference.PreferenceViewHolder holder) {
    }
    
    /**
     * * Set the main address icon visibility.
     *     *
     *     * @param isVisible true to display the main icon
     */
    public final void setMainIconVisible(boolean isVisible) {
    }
    
    public AddressPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public AddressPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public AddressPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
}