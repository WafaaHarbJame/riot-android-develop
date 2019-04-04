package ms.messageapp.fragments.keysbackup.restore;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import ms.messageapp.R;
import ms.messageapp.fragments.VectorBaseFragment;
import org.matrix.androidsdk.util.Log;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\"\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0007J\b\u0010\u001f\u001a\u00020\u0016H\u0007J\u0012\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreFromKeyFragment;", "Lms/messageapp/fragments/VectorBaseFragment;", "()V", "mKeyInputLayout", "Landroid/support/design/widget/TextInputLayout;", "getMKeyInputLayout", "()Landroid/support/design/widget/TextInputLayout;", "setMKeyInputLayout", "(Landroid/support/design/widget/TextInputLayout;)V", "mKeyTextEdit", "Landroid/widget/EditText;", "getMKeyTextEdit", "()Landroid/widget/EditText;", "setMKeyTextEdit", "(Landroid/widget/EditText;)V", "sharedViewModel", "Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreSharedViewModel;", "viewModel", "Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreFromKeyViewModel;", "getLayoutResId", "", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onImport", "onRestoreFromKey", "onRestoreKeyTextEditChange", "s", "Landroid/text/Editable;", "Companion", "vector_appDebug"})
public final class KeysBackupRestoreFromKeyFragment extends ms.messageapp.fragments.VectorBaseFragment {
    private ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreFromKeyViewModel viewModel;
    private ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreSharedViewModel sharedViewModel;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_key_enter_til)
    public android.support.design.widget.TextInputLayout mKeyInputLayout;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_restore_key_enter_edittext)
    public android.widget.EditText mKeyTextEdit;
    private static final int REQUEST_TEXT_FILE_GET = 1;
    public static final ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreFromKeyFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.design.widget.TextInputLayout getMKeyInputLayout() {
        return null;
    }
    
    public final void setMKeyInputLayout(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getMKeyTextEdit() {
        return null;
    }
    
    public final void setMKeyTextEdit(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @butterknife.OnTextChanged(value = {2131296747})
    public final void onRestoreKeyTextEditChange(@org.jetbrains.annotations.Nullable()
    android.text.Editable s) {
    }
    
    @butterknife.OnClick(value = {2131296746})
    public final void onRestoreFromKey() {
    }
    
    @butterknife.OnClick(value = {2131296706})
    public final void onImport() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public KeysBackupRestoreFromKeyFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreFromKeyFragment$Companion;", "", "()V", "REQUEST_TEXT_FILE_GET", "", "newInstance", "Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreFromKeyFragment;", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreFromKeyFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}