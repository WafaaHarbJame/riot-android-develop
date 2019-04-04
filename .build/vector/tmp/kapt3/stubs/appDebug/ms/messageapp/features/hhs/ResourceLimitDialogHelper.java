package ms.messageapp.features.hhs;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.style.StyleSpan;
import com.binaryfork.spanny.Spanny;
import ms.messageapp.R;
import ms.messageapp.activity.interfaces.Restorable;
import ms.messageapp.dialogs.DialogLocker;
import org.matrix.androidsdk.rest.model.MatrixError;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0011\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0005H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lms/messageapp/features/hhs/ResourceLimitDialogHelper;", "Lms/messageapp/activity/interfaces/Restorable;", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "dialogLocker", "Lms/messageapp/dialogs/DialogLocker;", "(Landroid/app/Activity;Lms/messageapp/dialogs/DialogLocker;)V", "formatter", "Lms/messageapp/features/hhs/ResourceLimitErrorFormatter;", "displayDialog", "", "matrixError", "Lorg/matrix/androidsdk/rest/model/MatrixError;", "saveState", "outState", "vector_appDebug"})
public final class ResourceLimitDialogHelper implements ms.messageapp.activity.interfaces.Restorable {
    private final ms.messageapp.features.hhs.ResourceLimitErrorFormatter formatter = null;
    private final android.app.Activity activity = null;
    private final ms.messageapp.dialogs.DialogLocker dialogLocker = null;
    
    /**
     * * Display the resource limit dialog, if not already displayed
     */
    public final void displayDialog(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.rest.model.MatrixError matrixError) {
    }
    
    private ResourceLimitDialogHelper(android.app.Activity activity, ms.messageapp.dialogs.DialogLocker dialogLocker) {
        super();
    }
    
    public ResourceLimitDialogHelper(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        super();
    }
    
    @java.lang.Override()
    public void saveState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
}