package ms.messageapp.fragments.base;

import android.content.Context;
import android.support.v4.app.DialogFragment;
import org.matrix.androidsdk.util.Log;

/**
 * * this class can be used as a parent class for DialogFragment to manager the listener
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lms/messageapp/fragments/base/VectorBaseDialogFragment;", "LISTENER", "Landroid/support/v4/app/DialogFragment;", "()V", "listener", "getListener", "()Ljava/lang/Object;", "setListener", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "onAttach", "", "context", "Landroid/content/Context;", "onDetach", "Companion", "vector_appDebug"})
public abstract class VectorBaseDialogFragment<LISTENER extends java.lang.Object> extends android.support.v4.app.DialogFragment {
    @org.jetbrains.annotations.Nullable()
    private LISTENER listener;
    private static final java.lang.String LOG_TAG = null;
    public static final ms.messageapp.fragments.base.VectorBaseDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    protected final LISTENER getListener() {
        return null;
    }
    
    protected final void setListener(@org.jetbrains.annotations.Nullable()
    LISTENER p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public VectorBaseDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/fragments/base/VectorBaseDialogFragment$Companion;", "", "()V", "LOG_TAG", "", "kotlin.jvm.PlatformType", "vector_appDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}