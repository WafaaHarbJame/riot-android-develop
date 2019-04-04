package ms.messageapp.fragments.keysbackup.setup;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.transition.TransitionManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import com.nulabinc.zxcvbn.Zxcvbn;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.activity.MXCActionBarActivity;
import ms.messageapp.fragments.VectorBaseFragment;
import ms.messageapp.settings.VectorLocale;
import ms.messageapp.view.PasswordStrengthBar;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\u00020\u0001:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0007J\b\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020,H\u0007J\b\u00104\u001a\u00020,H\u0007J\b\u00105\u001a\u00020,H\u0007J\b\u00106\u001a\u00020,H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupStep2Fragment;", "Lms/messageapp/fragments/VectorBaseFragment;", "()V", "mPassphraseConfirmInputLayout", "Landroid/support/design/widget/TextInputLayout;", "getMPassphraseConfirmInputLayout", "()Landroid/support/design/widget/TextInputLayout;", "setMPassphraseConfirmInputLayout", "(Landroid/support/design/widget/TextInputLayout;)V", "mPassphraseConfirmTextEdit", "Landroid/widget/EditText;", "getMPassphraseConfirmTextEdit", "()Landroid/widget/EditText;", "setMPassphraseConfirmTextEdit", "(Landroid/widget/EditText;)V", "mPassphraseInputLayout", "getMPassphraseInputLayout", "setMPassphraseInputLayout", "mPassphraseProgressLevel", "Lms/messageapp/view/PasswordStrengthBar;", "getMPassphraseProgressLevel", "()Lms/messageapp/view/PasswordStrengthBar;", "setMPassphraseProgressLevel", "(Lms/messageapp/view/PasswordStrengthBar;)V", "mPassphraseReveal", "Landroid/widget/ImageView;", "getMPassphraseReveal", "()Landroid/widget/ImageView;", "setMPassphraseReveal", "(Landroid/widget/ImageView;)V", "mPassphraseTextEdit", "getMPassphraseTextEdit", "setMPassphraseTextEdit", "rootGroup", "Landroid/view/ViewGroup;", "getRootGroup", "()Landroid/view/ViewGroup;", "setRootGroup", "(Landroid/view/ViewGroup;)V", "viewModel", "Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupSharedViewModel;", "zxcvbn", "Lcom/nulabinc/zxcvbn/Zxcvbn;", "bindViewToViewModel", "", "doNext", "getLayoutResId", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onConfirmPassphraseChanged", "onPassphraseChanged", "skipPassphrase", "toggleVisibilityMode", "Companion", "vector_appDebug"})
public final class KeysBackupSetupStep2Fragment extends ms.messageapp.fragments.VectorBaseFragment {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_root)
    public android.view.ViewGroup rootGroup;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_passphrase_enter_edittext)
    public android.widget.EditText mPassphraseTextEdit;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_passphrase_enter_til)
    public android.support.design.widget.TextInputLayout mPassphraseInputLayout;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_view_show_password)
    public android.widget.ImageView mPassphraseReveal;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_passphrase_confirm_edittext)
    public android.widget.EditText mPassphraseConfirmTextEdit;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_passphrase_confirm_til)
    public android.support.design.widget.TextInputLayout mPassphraseConfirmInputLayout;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_passphrase_security_progress)
    public ms.messageapp.view.PasswordStrengthBar mPassphraseProgressLevel;
    private final com.nulabinc.zxcvbn.Zxcvbn zxcvbn = null;
    private ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupSharedViewModel viewModel;
    public static final ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupStep2Fragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getRootGroup() {
        return null;
    }
    
    public final void setRootGroup(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getMPassphraseTextEdit() {
        return null;
    }
    
    public final void setMPassphraseTextEdit(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.design.widget.TextInputLayout getMPassphraseInputLayout() {
        return null;
    }
    
    public final void setMPassphraseInputLayout(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getMPassphraseReveal() {
        return null;
    }
    
    public final void setMPassphraseReveal(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getMPassphraseConfirmTextEdit() {
        return null;
    }
    
    public final void setMPassphraseConfirmTextEdit(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.design.widget.TextInputLayout getMPassphraseConfirmInputLayout() {
        return null;
    }
    
    public final void setMPassphraseConfirmInputLayout(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.view.PasswordStrengthBar getMPassphraseProgressLevel() {
        return null;
    }
    
    public final void setMPassphraseProgressLevel(@org.jetbrains.annotations.NotNull()
    ms.messageapp.view.PasswordStrengthBar p0) {
    }
    
    @butterknife.OnTextChanged(value = {2131296710})
    public final void onPassphraseChanged() {
    }
    
    @butterknife.OnTextChanged(value = {2131296708})
    public final void onConfirmPassphraseChanged() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindViewToViewModel() {
    }
    
    @butterknife.OnClick(value = {2131296745})
    public final void toggleVisibilityMode() {
    }
    
    @butterknife.OnClick(value = {2131296734})
    public final void doNext() {
    }
    
    @butterknife.OnClick(value = {2131296735})
    public final void skipPassphrase() {
    }
    
    public KeysBackupSetupStep2Fragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupStep2Fragment$Companion;", "", "()V", "newInstance", "Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupStep2Fragment;", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupStep2Fragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}