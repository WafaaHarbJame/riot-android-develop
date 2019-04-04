package ms.messageapp.fragments.keysbackup.restore;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import ms.messageapp.R;
import ms.messageapp.fragments.VectorBaseFragment;
import ms.messageapp.ui.arch.LiveEvent;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreSuccessFragment;", "Lms/messageapp/fragments/VectorBaseFragment;", "()V", "mSuccessDetailsText", "Landroid/widget/TextView;", "getMSuccessDetailsText", "()Landroid/widget/TextView;", "setMSuccessDetailsText", "(Landroid/widget/TextView;)V", "mSuccessText", "getMSuccessText", "setMSuccessText", "sharedViewModel", "Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreSharedViewModel;", "getLayoutResId", "", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onDone", "Companion", "vector_appDebug"})
public final class KeysBackupRestoreSuccessFragment extends ms.messageapp.fragments.VectorBaseFragment {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_restore_success)
    public android.widget.TextView mSuccessText;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_restore_success_info)
    public android.widget.TextView mSuccessDetailsText;
    private ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreSharedViewModel sharedViewModel;
    public static final ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreSuccessFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMSuccessText() {
        return null;
    }
    
    public final void setMSuccessText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMSuccessDetailsText() {
        return null;
    }
    
    public final void setMSuccessDetailsText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @butterknife.OnClick(value = {2131296724})
    public final void onDone() {
    }
    
    public KeysBackupRestoreSuccessFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreSuccessFragment$Companion;", "", "()V", "newInstance", "Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreSuccessFragment;", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreSuccessFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}