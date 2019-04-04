package ms.messageapp.fragments.keysbackup.restore;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import ms.messageapp.R;
import ms.messageapp.activity.util.WaitingViewData;
import ms.messageapp.ui.arch.LiveEvent;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.crypto.data.ImportRoomKeysResult;
import org.matrix.androidsdk.rest.callback.ApiCallback;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.rest.model.keys.KeysVersionResult;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\tJ\u000e\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020(2\u0006\u0010!\u001a\u00020\"J\u0006\u0010.\u001a\u00020(R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00188F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001aR\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00060"}, d2 = {"Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreSharedViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "_keyVersionResultError", "Landroid/arch/lifecycle/MutableLiveData;", "Lms/messageapp/ui/arch/LiveEvent;", "", "_navigateEvent", "importKeyResult", "Lorg/matrix/androidsdk/crypto/data/ImportRoomKeysResult;", "getImportKeyResult", "()Lorg/matrix/androidsdk/crypto/data/ImportRoomKeysResult;", "setImportKeyResult", "(Lorg/matrix/androidsdk/crypto/data/ImportRoomKeysResult;)V", "importRoomKeysFinishWithResult", "getImportRoomKeysFinishWithResult", "()Landroid/arch/lifecycle/MutableLiveData;", "setImportRoomKeysFinishWithResult", "(Landroid/arch/lifecycle/MutableLiveData;)V", "keyVersionResult", "Lorg/matrix/androidsdk/rest/model/keys/KeysVersionResult;", "getKeyVersionResult", "setKeyVersionResult", "keyVersionResultError", "Landroid/arch/lifecycle/LiveData;", "getKeyVersionResultError", "()Landroid/arch/lifecycle/LiveData;", "loadingEvent", "Lms/messageapp/activity/util/WaitingViewData;", "getLoadingEvent", "setLoadingEvent", "navigateEvent", "getNavigateEvent", "session", "Lorg/matrix/androidsdk/MXSession;", "getSession", "()Lorg/matrix/androidsdk/MXSession;", "setSession", "(Lorg/matrix/androidsdk/MXSession;)V", "didRecoverSucceed", "", "result", "getLatestVersion", "context", "Landroid/content/Context;", "initSession", "moveToRecoverWithKey", "Companion", "vector_appDebug"})
public final class KeysBackupRestoreSharedViewModel extends android.arch.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    public org.matrix.androidsdk.MXSession session;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.rest.model.keys.KeysVersionResult> keyVersionResult;
    private android.arch.lifecycle.MutableLiveData<ms.messageapp.ui.arch.LiveEvent<java.lang.String>> _keyVersionResultError;
    private android.arch.lifecycle.MutableLiveData<ms.messageapp.ui.arch.LiveEvent<java.lang.String>> _navigateEvent;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<ms.messageapp.activity.util.WaitingViewData> loadingEvent;
    @org.jetbrains.annotations.Nullable()
    private org.matrix.androidsdk.crypto.data.ImportRoomKeysResult importKeyResult;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<ms.messageapp.ui.arch.LiveEvent<org.matrix.androidsdk.crypto.data.ImportRoomKeysResult>> importRoomKeysFinishWithResult;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAVIGATE_TO_RECOVER_WITH_KEY = "NAVIGATE_TO_RECOVER_WITH_KEY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAVIGATE_TO_SUCCESS = "NAVIGATE_TO_SUCCESS";
    public static final ms.messageapp.fragments.keysbackup.restore.KeysBackupRestoreSharedViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.matrix.androidsdk.MXSession getSession() {
        return null;
    }
    
    public final void setSession(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXSession p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.rest.model.keys.KeysVersionResult> getKeyVersionResult() {
        return null;
    }
    
    public final void setKeyVersionResult(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<org.matrix.androidsdk.rest.model.keys.KeysVersionResult> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<ms.messageapp.ui.arch.LiveEvent<java.lang.String>> getKeyVersionResultError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<ms.messageapp.ui.arch.LiveEvent<java.lang.String>> getNavigateEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<ms.messageapp.activity.util.WaitingViewData> getLoadingEvent() {
        return null;
    }
    
    public final void setLoadingEvent(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<ms.messageapp.activity.util.WaitingViewData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.matrix.androidsdk.crypto.data.ImportRoomKeysResult getImportKeyResult() {
        return null;
    }
    
    public final void setImportKeyResult(@org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.crypto.data.ImportRoomKeysResult p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<ms.messageapp.ui.arch.LiveEvent<org.matrix.androidsdk.crypto.data.ImportRoomKeysResult>> getImportRoomKeysFinishWithResult() {
        return null;
    }
    
    public final void setImportRoomKeysFinishWithResult(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<ms.messageapp.ui.arch.LiveEvent<org.matrix.androidsdk.crypto.data.ImportRoomKeysResult>> p0) {
    }
    
    public final void initSession(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXSession session) {
    }
    
    public final void getLatestVersion(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void moveToRecoverWithKey() {
    }
    
    public final void didRecoverSucceed(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.crypto.data.ImportRoomKeysResult result) {
    }
    
    public KeysBackupRestoreSharedViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/fragments/keysbackup/restore/KeysBackupRestoreSharedViewModel$Companion;", "", "()V", "NAVIGATE_TO_RECOVER_WITH_KEY", "", "NAVIGATE_TO_SUCCESS", "vector_appDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}