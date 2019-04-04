package ms.messageapp.view;

import android.content.Context;
import android.support.annotation.IntRange;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import ms.messageapp.R;

/**
 * * A password strength bar custom widget
 * *  Strength is an Integer
 * *  -> 0 No strength
 * *  -> 1 Weak
 * *  -> 2 Fair
 * *  -> 3 Good
 * *  -> 4 Strong
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u0012\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00078\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006#"}, d2 = {"Lms/messageapp/view/PasswordStrengthBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bar1", "Landroid/view/View;", "getBar1", "()Landroid/view/View;", "setBar1", "(Landroid/view/View;)V", "bar2", "getBar2", "setBar2", "bar3", "getBar3", "setBar3", "bar4", "getBar4", "setBar4", "colorBackground", "colorLow", "colorOk", "colorStrong", "colorWeak", "newValue", "strength", "getStrength", "()I", "setStrength", "(I)V", "vector_appDebug"})
public final class PasswordStrengthBar extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.password_strength_bar_1)
    public android.view.View bar1;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.password_strength_bar_2)
    public android.view.View bar2;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.password_strength_bar_3)
    public android.view.View bar3;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.password_strength_bar_4)
    public android.view.View bar4;
    @butterknife.BindColor(value = ms.messageapp.R.color.password_strength_bar_undefined)
    public int colorBackground;
    @butterknife.BindColor(value = ms.messageapp.R.color.password_strength_bar_weak)
    public int colorWeak;
    @butterknife.BindColor(value = ms.messageapp.R.color.password_strength_bar_low)
    public int colorLow;
    @butterknife.BindColor(value = ms.messageapp.R.color.password_strength_bar_ok)
    public int colorOk;
    @butterknife.BindColor(value = ms.messageapp.R.color.password_strength_bar_strong)
    public int colorStrong;
    @android.support.annotation.IntRange(from = 0L, to = 4L)
    private int strength;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getBar1() {
        return null;
    }
    
    public final void setBar1(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getBar2() {
        return null;
    }
    
    public final void setBar2(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getBar3() {
        return null;
    }
    
    public final void setBar3(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getBar4() {
        return null;
    }
    
    public final void setBar4(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    public final int getStrength() {
        return 0;
    }
    
    public final void setStrength(int newValue) {
    }
    
    public PasswordStrengthBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public PasswordStrengthBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PasswordStrengthBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}