package ms.messageapp.fragments.keysbackup.settings;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindView;
import ms.messageapp.R;
import ms.messageapp.activity.CommonActivityUtils;
import ms.messageapp.activity.KeysBackupRestoreActivity;
import ms.messageapp.activity.KeysBackupSetupActivity;
import ms.messageapp.activity.util.WaitingViewData;
import ms.messageapp.fragments.VectorBaseFragment;
import ms.messageapp.listeners.YesNoListener;
import org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager;
import org.matrix.androidsdk.crypto.keysbackup.KeysBackupVersionTrustSignature;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsFragment;", "Lms/messageapp/fragments/VectorBaseFragment;", "Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsRecyclerViewAdapter$AdapterListener;", "()V", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "getRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "setRecyclerView", "(Landroid/support/v7/widget/RecyclerView;)V", "recyclerViewAdapter", "Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsRecyclerViewAdapter;", "viewModel", "Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsViewModel;", "didSelectDeleteSetupMessageRecovery", "", "didSelectRestoreMessageRecovery", "didSelectSetupMessageRecovery", "displayDeviceVerificationDialog", "signature", "Lorg/matrix/androidsdk/crypto/keysbackup/KeysBackupVersionTrustSignature;", "getLayoutResId", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "vector_appDebug"})
public final class KeysBackupSettingsFragment extends ms.messageapp.fragments.VectorBaseFragment implements ms.messageapp.fragments.keysbackup.settings.KeysBackupSettingsRecyclerViewAdapter.AdapterListener {
    private ms.messageapp.fragments.keysbackup.settings.KeysBackupSettingsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_settings_recycler_view)
    public android.support.v7.widget.RecyclerView recyclerView;
    private ms.messageapp.fragments.keysbackup.settings.KeysBackupSettingsRecyclerViewAdapter recyclerViewAdapter;
    public static final ms.messageapp.fragments.keysbackup.settings.KeysBackupSettingsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void didSelectSetupMessageRecovery() {
    }
    
    @java.lang.Override()
    public void didSelectRestoreMessageRecovery() {
    }
    
    @java.lang.Override()
    public void didSelectDeleteSetupMessageRecovery() {
    }
    
    @java.lang.Override()
    public void displayDeviceVerificationDialog(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.crypto.keysbackup.KeysBackupVersionTrustSignature signature) {
    }
    
    public KeysBackupSettingsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsFragment$Companion;", "", "()V", "newInstance", "Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsFragment;", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.fragments.keysbackup.settings.KeysBackupSettingsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}