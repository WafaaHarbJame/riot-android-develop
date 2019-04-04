package ms.messageapp.fragments.keysbackup.settings;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import ms.messageapp.R;
import ms.messageapp.ui.list.GenericItemViewHolder;
import ms.messageapp.ui.list.GenericRecyclerViewItem;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager;
import org.matrix.androidsdk.crypto.keysbackup.KeysBackupVersionTrust;
import org.matrix.androidsdk.crypto.keysbackup.KeysBackupVersionTrustSignature;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\'(B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018H\u0016J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsRecyclerViewAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adapterListener", "Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsRecyclerViewAdapter$AdapterListener;", "getAdapterListener", "()Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsRecyclerViewAdapter$AdapterListener;", "setAdapterListener", "(Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsRecyclerViewAdapter$AdapterListener;)V", "getContext", "()Landroid/content/Context;", "inflater", "Landroid/view/LayoutInflater;", "getInflater", "()Landroid/view/LayoutInflater;", "infoList", "", "Lms/messageapp/ui/list/GenericRecyclerViewItem;", "isBackupAlreadySetup", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateWithTrust", "session", "Lorg/matrix/androidsdk/MXSession;", "keyBackupVersionTrust", "Lorg/matrix/androidsdk/crypto/keysbackup/KeysBackupVersionTrust;", "AdapterListener", "FooterViewHolder", "vector_appDebug"})
public final class KeysBackupSettingsRecyclerViewAdapter extends android.support.v7.widget.RecyclerView.Adapter<android.support.v7.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.view.LayoutInflater inflater = null;
    private java.util.List<ms.messageapp.ui.list.GenericRecyclerViewItem> infoList;
    private boolean isBackupAlreadySetup;
    @org.jetbrains.annotations.Nullable()
    private ms.messageapp.fragments.keysbackup.settings.KeysBackupSettingsRecyclerViewAdapter.AdapterListener adapterListener;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.LayoutInflater getInflater() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ms.messageapp.fragments.keysbackup.settings.KeysBackupSettingsRecyclerViewAdapter.AdapterListener getAdapterListener() {
        return null;
    }
    
    public final void setAdapterListener(@org.jetbrains.annotations.Nullable()
    ms.messageapp.fragments.keysbackup.settings.KeysBackupSettingsRecyclerViewAdapter.AdapterListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateWithTrust(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXSession session, @org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.crypto.keysbackup.KeysBackupVersionTrust keyBackupVersionTrust) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public KeysBackupSettingsRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsRecyclerViewAdapter$FooterViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "button1", "Landroid/widget/Button;", "getButton1", "()Landroid/widget/Button;", "setButton1", "(Landroid/widget/Button;)V", "button2", "getButton2", "setButton2", "bind", "", "vector_appDebug"})
    public static final class FooterViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_settings_footer_button1)
        public android.widget.Button button1;
        @org.jetbrains.annotations.NotNull()
        @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_settings_footer_button2)
        public android.widget.Button button2;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getButton1() {
            return null;
        }
        
        public final void setButton1(@org.jetbrains.annotations.NotNull()
        android.widget.Button p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getButton2() {
            return null;
        }
        
        public final void setButton2(@org.jetbrains.annotations.NotNull()
        android.widget.Button p0) {
        }
        
        public final void bind() {
        }
        
        public FooterViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsRecyclerViewAdapter$AdapterListener;", "", "didSelectDeleteSetupMessageRecovery", "", "didSelectRestoreMessageRecovery", "didSelectSetupMessageRecovery", "displayDeviceVerificationDialog", "signature", "Lorg/matrix/androidsdk/crypto/keysbackup/KeysBackupVersionTrustSignature;", "vector_appDebug"})
    public static abstract interface AdapterListener {
        
        public abstract void didSelectSetupMessageRecovery();
        
        public abstract void didSelectRestoreMessageRecovery();
        
        public abstract void didSelectDeleteSetupMessageRecovery();
        
        public abstract void displayDeviceVerificationDialog(@org.jetbrains.annotations.NotNull()
        org.matrix.androidsdk.crypto.keysbackup.KeysBackupVersionTrustSignature signature);
    }
}