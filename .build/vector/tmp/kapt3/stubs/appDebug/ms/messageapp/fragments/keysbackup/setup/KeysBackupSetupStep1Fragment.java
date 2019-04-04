package ms.messageapp.fragments.keysbackup.setup;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import ms.messageapp.R;
import ms.messageapp.fragments.VectorBaseFragment;
import ms.messageapp.ui.arch.LiveEvent;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0007J\b\u0010\u0018\u001a\u00020\u0014H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupStep1Fragment;", "Lms/messageapp/fragments/VectorBaseFragment;", "()V", "advancedOptionText", "Landroid/widget/TextView;", "getAdvancedOptionText", "()Landroid/widget/TextView;", "setAdvancedOptionText", "(Landroid/widget/TextView;)V", "manualExportButton", "Landroid/widget/Button;", "getManualExportButton", "()Landroid/widget/Button;", "setManualExportButton", "(Landroid/widget/Button;)V", "viewModel", "Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupSharedViewModel;", "getLayoutResId", "", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onButtonClick", "onManualExportClick", "Companion", "vector_appDebug"})
public final class KeysBackupSetupStep1Fragment extends ms.messageapp.fragments.VectorBaseFragment {
    private ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupSharedViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_setup_step1_advanced)
    public android.widget.TextView advancedOptionText;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_setup_step1_manualExport)
    public android.widget.Button manualExportButton;
    public static final ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupStep1Fragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAdvancedOptionText() {
        return null;
    }
    
    public final void setAdvancedOptionText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getManualExportButton() {
        return null;
    }
    
    public final void setManualExportButton(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @butterknife.OnClick(value = {2131296730})
    public final void onButtonClick() {
    }
    
    @butterknife.OnClick(value = {2131296732})
    public final void onManualExportClick() {
    }
    
    public KeysBackupSetupStep1Fragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupStep1Fragment$Companion;", "", "()V", "newInstance", "Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupStep1Fragment;", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupStep1Fragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}