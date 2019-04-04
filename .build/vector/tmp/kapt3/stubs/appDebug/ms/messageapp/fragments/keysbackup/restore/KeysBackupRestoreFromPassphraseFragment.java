package ms.messageapp.fragments.keysbackup.restore;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import ms.messageapp.R;
import ms.messageapp.fragments.VectorBaseFragment;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0007J\b\u0010(\u001a\u00020\"H\u0007J\b\u0010)\u001a\u00020\"H\u0007J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\"H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreFromPassphraseFragment;", "Lms/messageapp/fragments/VectorBaseFragment;", "()V", "helperTextWithLink", "Landroid/widget/TextView;", "getHelperTextWithLink", "()Landroid/widget/TextView;", "setHelperTextWithLink", "(Landroid/widget/TextView;)V", "mPassphraseInputLayout", "Landroid/support/design/widget/TextInputLayout;", "getMPassphraseInputLayout", "()Landroid/support/design/widget/TextInputLayout;", "setMPassphraseInputLayout", "(Landroid/support/design/widget/TextInputLayout;)V", "mPassphraseReveal", "Landroid/widget/ImageView;", "getMPassphraseReveal", "()Landroid/widget/ImageView;", "setMPassphraseReveal", "(Landroid/widget/ImageView;)V", "mPassphraseTextEdit", "Landroid/widget/EditText;", "getMPassphraseTextEdit", "()Landroid/widget/EditText;", "setMPassphraseTextEdit", "(Landroid/widget/EditText;)V", "sharedViewModel", "Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreSharedViewModel;", "viewModel", "Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreFromPassphraseViewModel;", "getLayoutResId", "", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onPassphraseTextEditChange", "s", "Landroid/text/Editable;", "onRestoreBackup", "onUseRecoveryKey", "spannableStringForHelperText", "Landroid/text/SpannableString;", "context", "Landroid/content/Context;", "toggleVisibilityMode", "Companion", "vector_appDebug"})
public final class KeysBackupRestoreFromPassphraseFragment extends ms.messageapp.fragments.VectorBaseFragment {
    private ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreFromPassphraseViewModel viewModel;
    private ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreSharedViewModel sharedViewModel;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_passphrase_enter_til)
    public android.support.design.widget.TextInputLayout mPassphraseInputLayout;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_passphrase_enter_edittext)
    public android.widget.EditText mPassphraseTextEdit;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_view_show_password)
    public android.widget.ImageView mPassphraseReveal;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_passphrase_help_with_link)
    public android.widget.TextView helperTextWithLink;
    public static final ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreFromPassphraseFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.design.widget.TextInputLayout getMPassphraseInputLayout() {
        return null;
    }
    
    public final void setMPassphraseInputLayout(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getMPassphraseTextEdit() {
        return null;
    }
    
    public final void setMPassphraseTextEdit(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getMPassphraseReveal() {
        return null;
    }
    
    public final void setMPassphraseReveal(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getHelperTextWithLink() {
        return null;
    }
    
    public final void setHelperTextWithLink(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @butterknife.OnClick(value = {2131296745})
    public final void toggleVisibilityMode() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final android.text.SpannableString spannableStringForHelperText(android.content.Context context) {
        return null;
    }
    
    @butterknife.OnTextChanged(value = {2131296710})
    public final void onPassphraseTextEditChange(@org.jetbrains.annotations.Nullable()
    android.text.Editable s) {
    }
    
    @butterknife.OnClick(value = {2131296712})
    public final void onUseRecoveryKey() {
    }
    
    @butterknife.OnClick(value = {2131296718})
    public final void onRestoreBackup() {
    }
    
    public KeysBackupRestoreFromPassphraseFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreFromPassphraseFragment$Companion;", "", "()V", "newInstance", "Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreFromPassphraseFragment;", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreFromPassphraseFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}