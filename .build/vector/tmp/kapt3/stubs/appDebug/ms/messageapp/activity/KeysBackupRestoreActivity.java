package ms.messageapp.activity;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import ms.messageapp.R;
import ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreFromKeyFragment;
import ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreFromPassphraseFragment;
import ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreSharedViewModel;
import ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreSuccessFragment;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lms/messageapp/activity/KeysBackupRestoreActivity;", "Lms/messageapp/activity/SimpleFragmentActivity;", "()V", "viewModel", "Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreSharedViewModel;", "getTitleRes", "", "initUiAndData", "", "Companion", "vector_appDebug"})
public final class KeysBackupRestoreActivity extends ms.messageapp.activity.SimpleFragmentActivity {
    private ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreSharedViewModel viewModel;
    public static final ms.messageapp.activity.KeysBackupRestoreActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getTitleRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    public KeysBackupRestoreActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lms/messageapp/activity/KeysBackupRestoreActivity$Companion;", "", "()V", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "matrixID", "", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent intent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String matrixID) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}