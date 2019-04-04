package ms.messageapp.dialogs;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.activity.VectorWebViewActivity;
import ms.messageapp.activity.interfaces.Restorable;
import ms.messageapp.webview.WebViewMode;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.util.Log;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0011\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lms/messageapp/dialogs/ConsentNotGivenHelper;", "Lms/messageapp/activity/interfaces/Restorable;", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "dialogLocker", "Lms/messageapp/dialogs/DialogLocker;", "(Landroid/app/Activity;Lms/messageapp/dialogs/DialogLocker;)V", "displayDialog", "", "matrixError", "Lorg/matrix/androidsdk/rest/model/MatrixError;", "openWebViewActivity", "consentUri", "", "saveState", "outState", "vector_appDebug"})
public final class ConsentNotGivenHelper implements ms.messageapp.activity.interfaces.Restorable {
    private final android.app.Activity activity = null;
    private final ms.messageapp.dialogs.DialogLocker dialogLocker = null;
    
    /**
     * * Display the consent dialog, if not already displayed
     */
    public final void displayDialog(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.rest.model.MatrixError matrixError) {
    }
    
    private final void openWebViewActivity(java.lang.String consentUri) {
    }
    
    private ConsentNotGivenHelper(android.app.Activity activity, ms.messageapp.dialogs.DialogLocker dialogLocker) {
        super();
    }
    
    public ConsentNotGivenHelper(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        super();
    }
    
    @java.lang.Override()
    public void saveState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
}