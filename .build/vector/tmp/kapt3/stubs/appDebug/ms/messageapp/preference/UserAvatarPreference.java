package ms.messageapp.preference;

import android.content.Context;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceViewHolder;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ProgressBar;
import ms.messageapp.R;
import ms.messageapp.util.VectorUtils;
import org.matrix.androidsdk.MXSession;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006 "}, d2 = {"Lms/messageapp/preference/UserAvatarPreference;", "Landroid/support/v7/preference/Preference;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAvatarView", "Landroid/widget/ImageView;", "getMAvatarView$vector_appDebug", "()Landroid/widget/ImageView;", "setMAvatarView$vector_appDebug", "(Landroid/widget/ImageView;)V", "mLoadingProgressBar", "Landroid/widget/ProgressBar;", "mSession", "Lorg/matrix/androidsdk/MXSession;", "getMSession$vector_appDebug", "()Lorg/matrix/androidsdk/MXSession;", "setMSession$vector_appDebug", "(Lorg/matrix/androidsdk/MXSession;)V", "onBindViewHolder", "", "holder", "Landroid/support/v7/preference/PreferenceViewHolder;", "refreshAvatar", "setSession", "session", "vector_appDebug"})
public class UserAvatarPreference extends android.support.v7.preference.Preference {
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView mAvatarView;
    @org.jetbrains.annotations.Nullable()
    private org.matrix.androidsdk.MXSession mSession;
    private android.widget.ProgressBar mLoadingProgressBar;
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getMAvatarView$vector_appDebug() {
        return null;
    }
    
    public final void setMAvatarView$vector_appDebug(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.matrix.androidsdk.MXSession getMSession$vector_appDebug() {
        return null;
    }
    
    public final void setMSession$vector_appDebug(@org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.MXSession p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.preference.PreferenceViewHolder holder) {
    }
    
    public void refreshAvatar() {
    }
    
    public final void setSession(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXSession session) {
    }
    
    public UserAvatarPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    public UserAvatarPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    public UserAvatarPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null, null, 0, 0);
    }
}