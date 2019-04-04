package ms.messageapp.fragments.troubleshoot;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import ms.messageapp.R;
import ms.messageapp.ui.themes.ThemeUtils;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lms/messageapp/fragments/troubleshoot/NotificationTroubleshootRecyclerViewAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lms/messageapp/fragments/troubleshoot/NotificationTroubleshootRecyclerViewAdapter$ViewHolder;", "tests", "Ljava/util/ArrayList;", "Lms/messageapp/fragments/troubleshoot/TroubleshootTest;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getTests", "()Ljava/util/ArrayList;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "vector_appDebug"})
public final class NotificationTroubleshootRecyclerViewAdapter extends android.support.v7.widget.RecyclerView.Adapter<ms.messageapp.fragments.troubleshoot.NotificationTroubleshootRecyclerViewAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<ms.messageapp.fragments.troubleshoot.TroubleshootTest> tests = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ms.messageapp.fragments.troubleshoot.NotificationTroubleshootRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ms.messageapp.fragments.troubleshoot.NotificationTroubleshootRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<ms.messageapp.fragments.troubleshoot.TroubleshootTest> getTests() {
        return null;
    }
    
    public NotificationTroubleshootRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<ms.messageapp.fragments.troubleshoot.TroubleshootTest> tests) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\n\u00a8\u0006$"}, d2 = {"Lms/messageapp/fragments/troubleshoot/NotificationTroubleshootRecyclerViewAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "descriptionText", "Landroid/widget/TextView;", "getDescriptionText", "()Landroid/widget/TextView;", "setDescriptionText", "(Landroid/widget/TextView;)V", "fixButton", "Landroid/widget/Button;", "getFixButton", "()Landroid/widget/Button;", "setFixButton", "(Landroid/widget/Button;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "statusIconImage", "Landroid/widget/ImageView;", "getStatusIconImage", "()Landroid/widget/ImageView;", "setStatusIconImage", "(Landroid/widget/ImageView;)V", "titleText", "getTitleText", "setTitleText", "bind", "", "test", "Lms/messageapp/fragments/troubleshoot/TroubleshootTest;", "vector_appDebug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        @butterknife.BindView(value = ms.messageapp.R.id.troubleshootTestTitle)
        public android.widget.TextView titleText;
        @org.jetbrains.annotations.NotNull()
        @butterknife.BindView(value = ms.messageapp.R.id.troubleshootTestDescription)
        public android.widget.TextView descriptionText;
        @org.jetbrains.annotations.NotNull()
        @butterknife.BindView(value = ms.messageapp.R.id.troubleshootStatusIcon)
        public android.widget.ImageView statusIconImage;
        @org.jetbrains.annotations.NotNull()
        @butterknife.BindView(value = ms.messageapp.R.id.troubleshootProgressBar)
        public android.widget.ProgressBar progressBar;
        @org.jetbrains.annotations.NotNull()
        @butterknife.BindView(value = ms.messageapp.R.id.troubleshootTestButton)
        public android.widget.Button fixButton;
        
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
        public final android.widget.ImageView getStatusIconImage() {
            return null;
        }
        
        public final void setStatusIconImage(@org.jetbrains.annotations.NotNull()
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
        public final android.widget.Button getFixButton() {
            return null;
        }
        
        public final void setFixButton(@org.jetbrains.annotations.NotNull()
        android.widget.Button p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        ms.messageapp.fragments.troubleshoot.TroubleshootTest test) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}