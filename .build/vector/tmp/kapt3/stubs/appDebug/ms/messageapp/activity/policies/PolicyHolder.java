package ms.messageapp.activity.policies;

import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.BindView;
import ms.messageapp.R;
import ms.messageapp.ui.epoxy.BaseEpoxyHolder;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lms/messageapp/activity/policies/PolicyHolder;", "Lms/messageapp/ui/epoxy/BaseEpoxyHolder;", "()V", "checkbox", "Landroid/widget/CheckBox;", "getCheckbox", "()Landroid/widget/CheckBox;", "setCheckbox", "(Landroid/widget/CheckBox;)V", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "setTitle", "(Landroid/widget/TextView;)V", "vector_appDebug"})
public final class PolicyHolder extends ms.messageapp.ui.epoxy.BaseEpoxyHolder {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.adapter_item_policy_checkbox)
    public android.widget.CheckBox checkbox;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.adapter_item_policy_title)
    public android.widget.TextView title;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getCheckbox() {
        return null;
    }
    
    public final void setCheckbox(@org.jetbrains.annotations.NotNull()
    android.widget.CheckBox p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    public PolicyHolder() {
        super();
    }
}