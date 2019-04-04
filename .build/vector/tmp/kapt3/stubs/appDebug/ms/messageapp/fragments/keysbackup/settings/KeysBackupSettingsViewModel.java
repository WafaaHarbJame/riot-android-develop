package ms.messageapp.fragments.keysbackup.settings;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import ms.messageapp.R;
import ms.messageapp.activity.util.WaitingViewData;
import ms.messageapp.ui.arch.LiveEvent;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager;
import org.matrix.androidsdk.crypto.keysbackup.KeysBackupVersionTrust;
import org.matrix.androidsdk.rest.callback.ApiCallback;
import org.matrix.androidsdk.rest.callback.SuccessCallback;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.rest.model.keys.KeysVersionResult;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010(\u001a\u00020!H\u0014J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\rH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006+"}, d2 = {"Lms/messageapp/fragments/keysbackup/settings/KeysBackupSettingsViewModel;", "Landroid/arch/lifecycle/ViewModel;", "Lorg/matrix/androidsdk/crypto/keysbackup/KeysBackupStateManager$KeysBackupStateListener;", "()V", "_apiResultError", "Landroid/arch/lifecycle/MutableLiveData;", "Lms/messageapp/ui/arch/LiveEvent;", "", "apiResultError", "Landroid/arch/lifecycle/LiveData;", "getApiResultError", "()Landroid/arch/lifecycle/LiveData;", "keyBackupState", "Lorg/matrix/androidsdk/crypto/keysbackup/KeysBackupStateManager$KeysBackupState;", "getKeyBackupState", "()Landroid/arch/lifecycle/MutableLiveData;", "setKeyBackupState", "(Landroid/arch/lifecycle/MutableLiveData;)V", "keyVersionTrust", "Lorg/matrix/androidsdk/crypto/keysbackup/KeysBackupVersionTrust;", "getKeyVersionTrust", "setKeyVersionTrust", "loadingEvent", "Lms/messageapp/activity/util/WaitingViewData;", "getLoadingEvent", "setLoadingEvent", "session", "Lorg/matrix/androidsdk/MXSession;", "getSession", "()Lorg/matrix/androidsdk/MXSession;", "setSession", "(Lorg/matrix/androidsdk/MXSession;)V", "deleteCurrentBackup", "", "context", "Landroid/content/Context;", "getKeysBackupTrust", "versionResult", "Lorg/matrix/androidsdk/rest/model/keys/KeysVersionResult;", "initSession", "onCleared", "onStateChange", "newState", "vector_appDebug"})
public final class KeysBackupSettingsViewModel extends android.arch.lifecycle.ViewModel implements org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager.KeysBackupStateListener {
    @org.jetbrains.annotations.Nullable()
    private org.matrix.androidsdk.MXSession session;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.crypto.keysbackup.KeysBackupVersionTrust> keyVersionTrust;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager.KeysBackupState> keyBackupState;
    private android.arch.lifecycle.MutableLiveData<ms.messageapp.ui.arch.LiveEvent<java.lang.String>> _apiResultError;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<ms.messageapp.activity.util.WaitingViewData> loadingEvent;
    
    @org.jetbrains.annotations.Nullable()
    public final org.matrix.androidsdk.MXSession getSession() {
        return null;
    }
    
    public final void setSession(@org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.MXSession p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.crypto.keysbackup.KeysBackupVersionTrust> getKeyVersionTrust() {
        return null;
    }
    
    public final void setKeyVersionTrust(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.crypto.keysbackup.KeysBackupVersionTrust> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager.KeysBackupState> getKeyBackupState() {
        return null;
    }
    
    public final void setKeyBackupState(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager.KeysBackupState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<ms.messageapp.ui.arch.LiveEvent<java.lang.String>> getApiResultError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<ms.messageapp.activity.util.WaitingViewData> getLoadingEvent() {
        return null;
    }
    
    public final void setLoadingEvent(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<ms.messageapp.activity.util.WaitingViewData> p0) {
    }
    
    public final void initSession(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXSession session) {
    }
    
    public final void getKeysBackupTrust(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.rest.model.keys.KeysVersionResult versionResult) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @java.lang.Override()
    public void onStateChange(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager.KeysBackupState newState) {
    }
    
    public final void deleteCurrentBackup(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public KeysBackupSettingsViewModel() {
        super();
    }
}