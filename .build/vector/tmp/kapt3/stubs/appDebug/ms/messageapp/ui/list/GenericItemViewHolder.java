package ms.messageapp.ui.list;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import ms.messageapp.R;

/**
 * * View Holder for generic list items.
 * * Displays an item with a title, and optional description.
 * * Can display an accessory on the right, that can be an image or an indeterminate progress.
 * * If provided with an action, will display a button at the bottom of the list item.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016\u00a8\u0006%"}, d2 = {"Lms/messageapp/ui/list/GenericItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "accessoryImage", "Landroid/widget/ImageView;", "getAccessoryImage", "()Landroid/widget/ImageView;", "setAccessoryImage", "(Landroid/widget/ImageView;)V", "actionButton", "Landroid/widget/Button;", "getActionButton", "()Landroid/widget/Button;", "setActionButton", "(Landroid/widget/Button;)V", "descriptionText", "Landroid/widget/TextView;", "getDescriptionText", "()Landroid/widget/TextView;", "setDescriptionText", "(Landroid/widget/TextView;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "titleText", "getTitleText", "setTitleText", "bind", "", "item", "Lms/messageapp/ui/list/GenericRecyclerViewItem;", "Companion", "vector_appDebug"})
public final class GenericItemViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.item_generic_title_text)
    public android.widget.TextView titleText;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.item_generic_description_text)
    public android.widget.TextView descriptionText;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.item_generic_accessory_image)
    public android.widget.ImageView accessoryImage;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.item_generic_progress_bar)
    public android.widget.ProgressBar progressBar;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.item_generic_action_button)
    public android.widget.Button actionButton;
    @android.support.annotation.LayoutRes()
    public static final int resId = 2131427511;
    public static final ms.messageapp.ui.list.GenericItemViewHolder.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTitleText() {
        return null;
    }
    
    public final void setTitleText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getDescriptionText() {
        return null;
    }
    
    public final void setDescriptionText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getAccessoryImage() {
        return null;
    }
    
    public final void setAccessoryImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getActionButton() {
        return null;
    }
    
    public final void setActionButton(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    ms.messageapp.ui.list.GenericRecyclerViewItem item) {
    }
    
    public GenericItemViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lms/messageapp/ui/list/GenericItemViewHolder$Companion;", "", "()V", "resId", "", "vector_appDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}