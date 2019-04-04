package ms.messageapp.activity.policies;

import android.view.View;
import android.widget.CompoundButton;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import ms.messageapp.R;

@com.airbnb.epoxy.EpoxyModelClass(layout = ms.messageapp.R.layout.adapter_item_policy)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006 "}, d2 = {"Lms/messageapp/activity/policies/PolicyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lms/messageapp/activity/policies/PolicyHolder;", "()V", "checkChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getCheckChangeListener", "()Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setCheckChangeListener", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "checked", "", "getChecked", "()Z", "setChecked", "(Z)V", "clickListener", "Landroid/view/View$OnClickListener;", "getClickListener", "()Landroid/view/View$OnClickListener;", "setClickListener", "(Landroid/view/View$OnClickListener;)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "bind", "", "holder", "unbind", "vector_appDebug"})
public abstract class PolicyModel extends com.airbnb.epoxy.EpoxyModelWithHolder<ms.messageapp.activity.policies.PolicyHolder> {
    @com.airbnb.epoxy.EpoxyAttribute()
    private boolean checked;
    @org.jetbrains.annotations.Nullable()
    @com.airbnb.epoxy.EpoxyAttribute()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    @com.airbnb.epoxy.EpoxyAttribute(value = {com.airbnb.epoxy.EpoxyAttribute.Option.DoNotHash})
    private android.widget.CompoundButton.OnCheckedChangeListener checkChangeListener;
    @org.jetbrains.annotations.Nullable()
    @com.airbnb.epoxy.EpoxyAttribute(value = {com.airbnb.epoxy.EpoxyAttribute.Option.DoNotHash})
    private android.view.View.OnClickListener clickListener;
    
    public final boolean getChecked() {
        return false;
    }
    
    public final void setChecked(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.CompoundButton.OnCheckedChangeListener getCheckChangeListener() {
        return null;
    }
    
    public final void setCheckChangeListener(@org.jetbrains.annotations.Nullable()
    android.widget.CompoundButton.OnCheckedChangeListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getClickListener() {
        return null;
    }
    
    public final void setClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    ms.messageapp.activity.policies.PolicyHolder holder) {
    }
    
    @java.lang.Override()
    public void unbind(@org.jetbrains.annotations.NotNull()
    ms.messageapp.activity.policies.PolicyHolder holder) {
    }
    
    public PolicyModel() {
        super();
    }
}