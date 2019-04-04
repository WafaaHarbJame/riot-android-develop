package ms.messageapp.fragments.keysbackup.setup;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.OnClick;
import ms.messageapp.R;
import ms.messageapp.activity.CommonActivityUtils;
import ms.messageapp.fragments.VectorBaseFragment;
import ms.messageapp.ui.arch.LiveEvent;
import ms.messageapp.util.*;
import org.matrix.androidsdk.rest.callback.SimpleApiCallback;
import java.io.ByteArrayInputStream;
import java.io.File;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0007J\b\u0010\u001e\u001a\u00020\u0015H\u0007J\b\u0010\u001f\u001a\u00020\u0015H\u0007J+\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010$\u001a\u00020%H\u0016\u00a2\u0006\u0002\u0010&R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupStep3Fragment;", "Lms/messageapp/fragments/VectorBaseFragment;", "()V", "mFinishButton", "Landroid/widget/Button;", "getMFinishButton", "()Landroid/widget/Button;", "setMFinishButton", "(Landroid/widget/Button;)V", "mRecoveryKeyLabel2TextView", "Landroid/widget/TextView;", "getMRecoveryKeyLabel2TextView", "()Landroid/widget/TextView;", "setMRecoveryKeyLabel2TextView", "(Landroid/widget/TextView;)V", "mRecoveryKeyTextView", "getMRecoveryKeyTextView", "setMRecoveryKeyTextView", "viewModel", "Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupSharedViewModel;", "exportRecoveryKeyToFile", "", "it", "", "getLayoutResId", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCopyButtonClicked", "onFinishButtonClicked", "onRecoveryKeyClicked", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "Companion", "vector_appDebug"})
public final class KeysBackupSetupStep3Fragment extends ms.messageapp.fragments.VectorBaseFragment {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_setup_step3_button)
    public android.widget.Button mFinishButton;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_recovery_key_text)
    public android.widget.TextView mRecoveryKeyTextView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_setup_step3_line2_text)
    public android.widget.TextView mRecoveryKeyLabel2TextView;
    private ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupSharedViewModel viewModel;
    public static final ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupStep3Fragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getMFinishButton() {
        return null;
    }
    
    public final void setMFinishButton(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMRecoveryKeyTextView() {
        return null;
    }
    
    public final void setMRecoveryKeyTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMRecoveryKeyLabel2TextView() {
        return null;
    }
    
    public final void setMRecoveryKeyLabel2TextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @butterknife.OnClick(value = {2131296738})
    public final void onFinishButtonClicked() {
    }
    
    @butterknife.OnClick(value = {2131296739})
    public final void onCopyButtonClicked() {
    }
    
    @butterknife.OnClick(value = {2131296714})
    public final void onRecoveryKeyClicked() {
    }
    
    public final void exportRecoveryKeyToFile(@org.jetbrains.annotations.NotNull()
    java.lang.String it) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public KeysBackupSetupStep3Fragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupStep3Fragment$Companion;", "", "()V", "newInstance", "Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupStep3Fragment;", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupStep3Fragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}