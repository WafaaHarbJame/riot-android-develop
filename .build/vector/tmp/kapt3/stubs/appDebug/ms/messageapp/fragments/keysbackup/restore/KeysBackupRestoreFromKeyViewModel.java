package ms.messageapp.fragments.keysbackup.restore;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import ms.messageapp.R;
import ms.messageapp.activity.util.WaitingViewData;
import ms.messageapp.view.KeysBackupBanner;
import org.matrix.androidsdk.crypto.data.ImportRoomKeysResult;
import org.matrix.androidsdk.crypto.keysbackup.KeysBackup;
import org.matrix.androidsdk.listeners.StepProgressListener;
import org.matrix.androidsdk.rest.callback.ApiCallback;
import org.matrix.androidsdk.rest.callback.SimpleApiCallback;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.rest.model.keys.KeysVersionResult;
import org.matrix.androidsdk.util.Log;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0005R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t\u00a8\u0006\u001b"}, d2 = {"Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreFromKeyViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "recoveryCode", "Landroid/arch/lifecycle/MutableLiveData;", "", "getRecoveryCode", "()Landroid/arch/lifecycle/MutableLiveData;", "setRecoveryCode", "(Landroid/arch/lifecycle/MutableLiveData;)V", "recoveryCodeErrorText", "getRecoveryCodeErrorText", "setRecoveryCodeErrorText", "recoverKeys", "", "context", "Landroid/content/Context;", "sharedViewModel", "Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreSharedViewModel;", "trustOnDecrypt", "keysBackup", "Lorg/matrix/androidsdk/crypto/keysbackup/KeysBackup;", "keysVersionResult", "Lorg/matrix/androidsdk/rest/model/keys/KeysVersionResult;", "updateCode", "newValue", "Companion", "vector_appDebug"})
public final class KeysBackupRestoreFromKeyViewModel extends android.arch.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.String> recoveryCode;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.String> recoveryCodeErrorText;
    private static final java.lang.String LOG_TAG = null;
    public static final ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreFromKeyViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getRecoveryCode() {
        return null;
    }
    
    public final void setRecoveryCode(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getRecoveryCodeErrorText() {
        return null;
    }
    
    public final void setRecoveryCodeErrorText(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void updateCode(@org.jetbrains.annotations.NotNull()
    java.lang.String newValue) {
    }
    
    public final void recoverKeys(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreSharedViewModel sharedViewModel) {
    }
    
    private final void trustOnDecrypt(org.matrix.androidsdk.crypto.keysbackup.KeysBackup keysBackup, org.matrix.androidsdk.rest.model.keys.KeysVersionResult keysVersionResult) {
    }
    
    public KeysBackupRestoreFromKeyViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreFromKeyViewModel$Companion;", "", "()V", "LOG_TAG", "", "kotlin.jvm.PlatformType", "vector_appDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}