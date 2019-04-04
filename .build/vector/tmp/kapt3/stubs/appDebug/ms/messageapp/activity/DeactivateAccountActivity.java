package ms.messageapp.activity;

import android.content.Context;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.EditText;
import butterknife.BindView;
import butterknife.OnClick;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.rest.callback.SimpleApiCallback;
import org.matrix.androidsdk.rest.model.MatrixError;

/**
 * * Displays the Account deactivation screen.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\r\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0015H\u0001\u00a2\u0006\u0002\b\u0019R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lms/messageapp/activity/DeactivateAccountActivity;", "Lms/messageapp/activity/VectorAppCompatActivity;", "()V", "eraseCheckBox", "Landroid/widget/CheckBox;", "getEraseCheckBox", "()Landroid/widget/CheckBox;", "setEraseCheckBox", "(Landroid/widget/CheckBox;)V", "passwordEditText", "Landroid/widget/EditText;", "getPasswordEditText", "()Landroid/widget/EditText;", "setPasswordEditText", "(Landroid/widget/EditText;)V", "session", "Lorg/matrix/androidsdk/MXSession;", "getLayoutRes", "", "getTitleRes", "initUiAndData", "", "onCancel", "onCancel$vector_appDebug", "onSubmit", "onSubmit$vector_appDebug", "Companion", "vector_appDebug"})
public final class DeactivateAccountActivity extends ms.messageapp.activity.VectorAppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.deactivate_account_erase_checkbox)
    public android.widget.CheckBox eraseCheckBox;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.deactivate_account_password)
    public android.widget.EditText passwordEditText;
    private org.matrix.androidsdk.MXSession session;
    public static final ms.messageapp.activity.DeactivateAccountActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getEraseCheckBox() {
        return null;
    }
    
    public final void setEraseCheckBox(@org.jetbrains.annotations.NotNull()
    android.widget.CheckBox p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getPasswordEditText() {
        return null;
    }
    
    public final void setPasswordEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public int getTitleRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    @butterknife.OnClick(value = {2131296448})
    public final void onSubmit$vector_appDebug() {
    }
    
    @butterknife.OnClick(value = {2131296447})
    public final void onCancel$vector_appDebug() {
    }
    
    public DeactivateAccountActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lms/messageapp/activity/DeactivateAccountActivity$Companion;", "", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}