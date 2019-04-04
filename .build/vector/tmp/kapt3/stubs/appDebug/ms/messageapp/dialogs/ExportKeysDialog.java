package ms.messageapp.dialogs;

import android.app.Activity;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import ms.messageapp.R;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lms/messageapp/dialogs/ExportKeysDialog;", "", "()V", "show", "", "activity", "Landroid/app/Activity;", "exportKeyDialogListener", "Lms/messageapp/dialogs/ExportKeysDialog$ExportKeyDialogListener;", "ExportKeyDialogListener", "vector_appDebug"})
public final class ExportKeysDialog {
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    ms.messageapp.dialogs.ExportKeysDialog.ExportKeyDialogListener exportKeyDialogListener) {
    }
    
    public ExportKeysDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/dialogs/ExportKeysDialog$ExportKeyDialogListener;", "", "onPassphrase", "", "passphrase", "", "vector_appDebug"})
    public static abstract interface ExportKeyDialogListener {
        
        public abstract void onPassphrase(@org.jetbrains.annotations.NotNull()
        java.lang.String passphrase);
    }
}