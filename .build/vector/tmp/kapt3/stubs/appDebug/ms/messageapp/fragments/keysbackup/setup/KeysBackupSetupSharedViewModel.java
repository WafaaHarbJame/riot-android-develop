package ms.messageapp.fragments.keysbackup.setup;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import com.nulabinc.zxcvbn.Strength;
import ms.messageapp.R;
import ms.messageapp.activity.util.WaitingViewData;
import ms.messageapp.ui.arch.LiveEvent;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.crypto.keysbackup.KeysBackup;
import org.matrix.androidsdk.crypto.keysbackup.MegolmBackupCreationInfo;
import org.matrix.androidsdk.listeners.ProgressListener;
import org.matrix.androidsdk.rest.callback.ApiCallback;
import org.matrix.androidsdk.rest.callback.SuccessErrorCallback;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.rest.model.keys.KeysVersion;
import org.matrix.androidsdk.util.Log;

/**
 * * The shared view model between all fragments.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 V2\u00020\u0001:\u0001VB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0002J\u000e\u0010S\u001a\u00020N2\u0006\u0010>\u001a\u00020?J\"\u0010T\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010U\u001a\u0004\u0018\u00010\u0005R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0014j\u0002`\u00150\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR \u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050+0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR \u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR \u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\tR$\u00108\u001a\f\u0012\b\u0012\u00060\u0014j\u0002`\u00150\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010\tR \u0010;\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0007\"\u0004\b=\u0010\tR\u001a\u0010>\u001a\u00020?X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0010\"\u0004\bF\u0010\u0012R \u0010G\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0007\"\u0004\bI\u0010\tR \u0010J\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0007\"\u0004\bL\u0010\t\u00a8\u0006W"}, d2 = {"Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupSharedViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "confirmPassphrase", "Landroid/arch/lifecycle/MutableLiveData;", "", "getConfirmPassphrase", "()Landroid/arch/lifecycle/MutableLiveData;", "setConfirmPassphrase", "(Landroid/arch/lifecycle/MutableLiveData;)V", "confirmPassphraseError", "getConfirmPassphraseError", "setConfirmPassphraseError", "copyHasBeenMade", "", "getCopyHasBeenMade", "()Z", "setCopyHasBeenMade", "(Z)V", "creatingBackupError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getCreatingBackupError", "setCreatingBackupError", "currentRequestId", "", "isCreatingBackupVersion", "setCreatingBackupVersion", "keysVersion", "Lorg/matrix/androidsdk/rest/model/keys/KeysVersion;", "getKeysVersion", "setKeysVersion", "loadingStatus", "Lms/messageapp/activity/util/WaitingViewData;", "getLoadingStatus", "setLoadingStatus", "megolmBackupCreationInfo", "Lorg/matrix/androidsdk/crypto/keysbackup/MegolmBackupCreationInfo;", "getMegolmBackupCreationInfo", "()Lorg/matrix/androidsdk/crypto/keysbackup/MegolmBackupCreationInfo;", "setMegolmBackupCreationInfo", "(Lorg/matrix/androidsdk/crypto/keysbackup/MegolmBackupCreationInfo;)V", "navigateEvent", "Lms/messageapp/ui/arch/LiveEvent;", "getNavigateEvent", "setNavigateEvent", "passphrase", "getPassphrase", "setPassphrase", "passphraseError", "getPassphraseError", "setPassphraseError", "passwordStrength", "Lcom/nulabinc/zxcvbn/Strength;", "getPasswordStrength", "setPasswordStrength", "prepareRecoverFailError", "getPrepareRecoverFailError", "setPrepareRecoverFailError", "recoveryKey", "getRecoveryKey", "setRecoveryKey", "session", "Lorg/matrix/androidsdk/MXSession;", "getSession", "()Lorg/matrix/androidsdk/MXSession;", "setSession", "(Lorg/matrix/androidsdk/MXSession;)V", "shouldPromptOnBack", "getShouldPromptOnBack", "setShouldPromptOnBack", "showManualExport", "getShowManualExport", "setShowManualExport", "showPasswordMode", "getShowPasswordMode", "setShowPasswordMode", "createKeysBackup", "", "context", "Landroid/content/Context;", "keysBackup", "Lorg/matrix/androidsdk/crypto/keysbackup/KeysBackup;", "initSession", "prepareRecoveryKey", "withPassphrase", "Companion", "vector_appDebug"})
public final class KeysBackupSetupSharedViewModel extends android.arch.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    public org.matrix.androidsdk.MXSession session;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Boolean> showManualExport;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<ms.messageapp.ui.arch.LiveEvent<java.lang.String>> navigateEvent;
    private boolean shouldPromptOnBack;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.String> passphrase;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.String> passphraseError;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.String> confirmPassphrase;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.String> confirmPassphraseError;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<com.nulabinc.zxcvbn.Strength> passwordStrength;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Boolean> showPasswordMode;
    private android.arch.lifecycle.MutableLiveData<java.lang.Long> currentRequestId;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.String> recoveryKey;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Exception> prepareRecoverFailError;
    @org.jetbrains.annotations.Nullable()
    private org.matrix.androidsdk.crypto.keysbackup.MegolmBackupCreationInfo megolmBackupCreationInfo;
    private boolean copyHasBeenMade;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Boolean> isCreatingBackupVersion;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Exception> creatingBackupError;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.rest.model.keys.KeysVersion> keysVersion;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<ms.messageapp.activity.util.WaitingViewData> loadingStatus;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAVIGATE_TO_STEP_2 = "NAVIGATE_TO_STEP_2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAVIGATE_TO_STEP_3 = "NAVIGATE_TO_STEP_3";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAVIGATE_FINISH = "NAVIGATE_FINISH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAVIGATE_MANUAL_EXPORT = "NAVIGATE_MANUAL_EXPORT";
    private static final java.lang.String LOG_TAG = null;
    public static final ms.messageapp.fragments.keysbackup.setup.KeysBackupSetupSharedViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.matrix.androidsdk.MXSession getSession() {
        return null;
    }
    
    public final void setSession(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXSession p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getShowManualExport() {
        return null;
    }
    
    public final void setShowManualExport(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<ms.messageapp.ui.arch.LiveEvent<java.lang.String>> getNavigateEvent() {
        return null;
    }
    
    public final void setNavigateEvent(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<ms.messageapp.ui.arch.LiveEvent<java.lang.String>> p0) {
    }
    
    public final boolean getShouldPromptOnBack() {
        return false;
    }
    
    public final void setShouldPromptOnBack(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getPassphrase() {
        return null;
    }
    
    public final void setPassphrase(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getPassphraseError() {
        return null;
    }
    
    public final void setPassphraseError(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getConfirmPassphrase() {
        return null;
    }
    
    public final void setConfirmPassphrase(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getConfirmPassphraseError() {
        return null;
    }
    
    public final void setConfirmPassphraseError(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.nulabinc.zxcvbn.Strength> getPasswordStrength() {
        return null;
    }
    
    public final void setPasswordStrength(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<com.nulabinc.zxcvbn.Strength> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getShowPasswordMode() {
        return null;
    }
    
    public final void setShowPasswordMode(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getRecoveryKey() {
        return null;
    }
    
    public final void setRecoveryKey(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Exception> getPrepareRecoverFailError() {
        return null;
    }
    
    public final void setPrepareRecoverFailError(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Exception> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.matrix.androidsdk.crypto.keysbackup.MegolmBackupCreationInfo getMegolmBackupCreationInfo() {
        return null;
    }
    
    public final void setMegolmBackupCreationInfo(@org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.crypto.keysbackup.MegolmBackupCreationInfo p0) {
    }
    
    public final boolean getCopyHasBeenMade() {
        return false;
    }
    
    public final void setCopyHasBeenMade(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> isCreatingBackupVersion() {
        return null;
    }
    
    public final void setCreatingBackupVersion(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Exception> getCreatingBackupError() {
        return null;
    }
    
    public final void setCreatingBackupError(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Exception> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.rest.model.keys.KeysVersion> getKeysVersion() {
        return null;
    }
    
    public final void setKeysVersion(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.rest.model.keys.KeysVersion> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<ms.messageapp.activity.util.WaitingViewData> getLoadingStatus() {
        return null;
    }
    
    public final void setLoadingStatus(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<ms.messageapp.activity.util.WaitingViewData> p0) {
    }
    
    public final void initSession(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXSession session) {
    }
    
    public final void prepareRecoveryKey(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.MXSession session, @org.jetbrains.annotations.Nullable()
    java.lang.String withPassphrase) {
    }
    
    private final void createKeysBackup(android.content.Context context, org.matrix.androidsdk.crypto.keysbackup.KeysBackup keysBackup) {
    }
    
    public KeysBackupSetupSharedViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lms/messageapp/fragments/keysbackup/setup/KeysBackupSetupSharedViewModel$Companion;", "", "()V", "LOG_TAG", "", "kotlin.jvm.PlatformType", "NAVIGATE_FINISH", "NAVIGATE_MANUAL_EXPORT", "NAVIGATE_TO_STEP_2", "NAVIGATE_TO_STEP_3", "vector_appDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}