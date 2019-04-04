package ms.messageapp.activity;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.notifications.NotificationUtils;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.data.Room;
import org.matrix.androidsdk.rest.callback.ApiCallback;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.util.Log;

/**
 * * JoinRoomActivity is a dummy activity to join / reject a room invitation
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lms/messageapp/activity/JoinRoomActivity;", "Lms/messageapp/activity/VectorAppCompatActivity;", "()V", "getLayoutRes", "", "initUiAndData", "", "Companion", "vector_appDebug"})
public final class JoinRoomActivity extends ms.messageapp.activity.VectorAppCompatActivity {
    private static final java.lang.String LOG_TAG = null;
    private static final java.lang.String EXTRA_ROOM_ID = "EXTRA_ROOM_ID";
    private static final java.lang.String EXTRA_MATRIX_ID = "EXTRA_MATRIX_ID";
    private static final java.lang.String EXTRA_JOIN = "EXTRA_JOIN";
    private static final java.lang.String EXTRA_REJECT = "EXTRA_REJECT";
    public static final ms.messageapp.activity.JoinRoomActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    public JoinRoomActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lms/messageapp/activity/JoinRoomActivity$Companion;", "", "()V", "EXTRA_JOIN", "", "EXTRA_MATRIX_ID", "EXTRA_REJECT", "EXTRA_ROOM_ID", "LOG_TAG", "kotlin.jvm.PlatformType", "getJoinRoomIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "roomId", "matrixId", "getRejectRoomIntent", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getJoinRoomIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String roomId, @org.jetbrains.annotations.NotNull()
        java.lang.String matrixId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getRejectRoomIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String roomId, @org.jetbrains.annotations.NotNull()
        java.lang.String matrixId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}