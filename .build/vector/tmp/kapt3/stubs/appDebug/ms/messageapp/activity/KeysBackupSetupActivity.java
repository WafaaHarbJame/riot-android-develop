package ms.messageapp.activity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import ms.messageapp.R;
import ms.messageapp.dialogs.ExportKeysDialog;
import ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupSharedViewModel;
import ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupStep1Fragment;
import ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupStep2Fragment;
import ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupStep3Fragment;
import org.matrix.androidsdk.rest.callback.SimpleApiCallback;
import org.matrix.androidsdk.rest.model.MatrixError;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lms/messageapp/activity/KeysBackupSetupActivity;", "Lms/messageapp/activity/SimpleFragmentActivity;", "()V", "viewModel", "Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupSharedViewModel;", "exportKeysManually", "", "getTitleRes", "", "initUiAndData", "onBackPressed", "Companion", "vector_appDebug"})
public final class KeysBackupSetupActivity extends ms.messageapp.activity.SimpleFragmentActivity {
    private ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupSharedViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYS_VERSION = "KEYS_VERSION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MANUAL_EXPORT = "MANUAL_EXPORT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SHOW_MANUAL_EXPORT = "SHOW_MANUAL_EXPORT";
    public static final ms.messageapp.activity.KeysBackupSetupActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getTitleRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    public final void exportKeysManually() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public KeysBackupSetupActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lms/messageapp/activity/KeysBackupSetupActivity$Companion;", "", "()V", "EXTRA_SHOW_MANUAL_EXPORT", "", "KEYS_VERSION", "MANUAL_EXPORT", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "matrixID", "showManualExport", "", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent intent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String matrixID, boolean showManualExport) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}