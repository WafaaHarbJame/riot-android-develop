package ms.messageapp.dialogs;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import ms.messageapp.activity.interfaces.Restorable;
import org.matrix.androidsdk.util.Log;

/**
 * * Class to avoid displaying twice the same dialog
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lms/messageapp/dialogs/DialogLocker;", "Lms/messageapp/activity/interfaces/Restorable;", "savedInstanceState", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "isDialogDisplayed", "", "displayDialog", "Landroid/support/v7/app/AlertDialog;", "builder", "Lkotlin/Function0;", "Landroid/support/v7/app/AlertDialog$Builder;", "lock", "", "saveState", "outState", "unlock", "vector_appDebug"})
public final class DialogLocker implements ms.messageapp.activity.interfaces.Restorable {
    private boolean isDialogDisplayed;
    
    private final void unlock() {
    }
    
    private final void lock() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.app.AlertDialog displayDialog(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends android.support.v7.app.AlertDialog.Builder> builder) {
        return null;
    }
    
    @java.lang.Override()
    public void saveState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public DialogLocker(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        super();
    }
}