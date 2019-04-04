package ms.messageapp.fragments.signout;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010J\b\u0010\u0019\u001a\u00020\u0017H\u0014J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lms/messageapp/fragments/signout/SignOutViewModel;", "Landroid/arch/lifecycle/ViewModel;", "Lorg/matrix/androidsdk/crypto/keysbackup/KeysBackupStateManager$KeysBackupStateListener;", "()V", "keysBackupState", "Landroid/arch/lifecycle/MutableLiveData;", "Lorg/matrix/androidsdk/crypto/keysbackup/KeysBackupStateManager$KeysBackupState;", "getKeysBackupState", "()Landroid/arch/lifecycle/MutableLiveData;", "setKeysBackupState", "(Landroid/arch/lifecycle/MutableLiveData;)V", "keysExportedToFile", "", "getKeysExportedToFile", "setKeysExportedToFile", "mxSession", "Lorg/matrix/androidsdk/MXSession;", "canRestoreKeys", "getCurrentBackupVersion", "", "getNumberOfKeysToBackup", "", "init", "", "session", "onCleared", "onStateChange", "newState", "Companion", "vector_appDebug"})
public final class SignOutViewModel extends android.arch.lifecycle.ViewModel implements org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager.KeysBackupStateListener {
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Boolean> keysExportedToFile;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager.KeysBackupState> keysBackupState;
    private org.matrix.androidsdk.MXSession mxSession;
    public static final ms.messageapp.fragments.signout.SignOutViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getKeysExportedToFile() {
        return null;
    }
    
    public final void setKeysExportedToFile(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager.KeysBackupState> getKeysBackupState() {
        return null;
    }
    
    public final void setKeysBackupState(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager.KeysBackupState> p0) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXSession session) {
    }
    
    /**
     * * Safe way to get the current KeysBackup version
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentBackupVersion() {
        return null;
    }
    
    /**
     * * Safe way to get the number of keys to backup
     */
    public final int getNumberOfKeysToBackup() {
        return 0;
    }
    
    /**
     * * Safe way to tell if there are more keys on the server
     */
    public final boolean canRestoreKeys() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @java.lang.Override()
    public void onStateChange(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager.KeysBackupState newState) {
    }
    
    public SignOutViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lms/messageapp/fragments/signout/SignOutViewModel$Companion;", "", "()V", "doYouNeedToBeDisplayed", "", "session", "Lorg/matrix/androidsdk/MXSession;", "vector_appDebug"})
    public static final class Companion {
        
        /**
         * * The backup check on logout flow has to be displayed if there are keys in the store, and the keys backup state is not Ready
         */
        public final boolean doYouNeedToBeDisplayed(@org.jetbrains.annotations.Nullable()
        org.matrix.androidsdk.MXSession session) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}