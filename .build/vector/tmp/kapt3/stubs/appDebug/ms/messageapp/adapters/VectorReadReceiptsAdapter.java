package ms.messageapp.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import ms.messageapp.R;
import ms.messageapp.util.VectorUtils;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.data.Room;
import org.matrix.androidsdk.rest.model.ReceiptData;

/**
 * * An adapter which can display read receipts
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lms/messageapp/adapters/VectorReadReceiptsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lms/messageapp/adapters/VectorReadReceiptsAdapter$ReadReceiptViewHolder;", "mContext", "Landroid/content/Context;", "mSession", "Lorg/matrix/androidsdk/MXSession;", "mRoom", "Lorg/matrix/androidsdk/data/Room;", "list", "Ljava/util/ArrayList;", "Lorg/matrix/androidsdk/rest/model/ReceiptData;", "Lkotlin/collections/ArrayList;", "listener", "Lms/messageapp/adapters/VectorReadReceiptsAdapter$VectorReadReceiptsAdapterListener;", "(Landroid/content/Context;Lorg/matrix/androidsdk/MXSession;Lorg/matrix/androidsdk/data/Room;Ljava/util/ArrayList;Lms/messageapp/adapters/VectorReadReceiptsAdapter$VectorReadReceiptsAdapterListener;)V", "mLayoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ReadReceiptViewHolder", "VectorReadReceiptsAdapterListener", "vector_appDebug"})
public final class VectorReadReceiptsAdapter extends android.support.v7.widget.RecyclerView.Adapter<ms.messageapp.adapters.VectorReadReceiptsAdapter.ReadReceiptViewHolder> {
    private final android.view.LayoutInflater mLayoutInflater = null;
    private final android.content.Context mContext = null;
    private final org.matrix.androidsdk.MXSession mSession = null;
    private final org.matrix.androidsdk.data.Room mRoom = null;
    private final java.util.ArrayList<org.matrix.androidsdk.rest.model.ReceiptData> list = null;
    private final ms.messageapp.adapters.VectorReadReceiptsAdapter.VectorReadReceiptsAdapterListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ms.messageapp.adapters.VectorReadReceiptsAdapter.ReadReceiptViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ms.messageapp.adapters.VectorReadReceiptsAdapter.ReadReceiptViewHolder holder, int position) {
    }
    
    public VectorReadReceiptsAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXSession mSession, @org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.data.Room mRoom, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<org.matrix.androidsdk.rest.model.ReceiptData> list, @org.jetbrains.annotations.NotNull()
    ms.messageapp.adapters.VectorReadReceiptsAdapter.VectorReadReceiptsAdapterListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/adapters/VectorReadReceiptsAdapter$VectorReadReceiptsAdapterListener;", "", "onMemberClicked", "", "userId", "", "vector_appDebug"})
    public static abstract interface VectorReadReceiptsAdapterListener {
        
        public abstract void onMemberClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String userId);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lms/messageapp/adapters/VectorReadReceiptsAdapter$ReadReceiptViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "tsTextView", "Landroid/widget/TextView;", "getTsTextView", "()Landroid/widget/TextView;", "setTsTextView", "(Landroid/widget/TextView;)V", "userNameTextView", "getUserNameTextView", "setUserNameTextView", "getView", "()Landroid/view/View;", "vector_appDebug"})
    public static final class ReadReceiptViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        @butterknife.BindView(value = ms.messageapp.R.id.read_receipt_user_avatar)
        public android.widget.ImageView imageView;
        @org.jetbrains.annotations.NotNull()
        @butterknife.BindView(value = ms.messageapp.R.id.read_receipt_user_name)
        public android.widget.TextView userNameTextView;
        @org.jetbrains.annotations.NotNull()
        @butterknife.BindView(value = ms.messageapp.R.id.read_receipt_ts)
        public android.widget.TextView tsTextView;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImageView() {
            return null;
        }
        
        public final void setImageView(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getUserNameTextView() {
            return null;
        }
        
        public final void setUserNameTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTsTextView() {
            return null;
        }
        
        public final void setTsTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public ReadReceiptViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}