package ms.messageapp.fragments.troubleshoot;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import kotlin.properties.Delegates;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 12\u00020\u0001:\u00011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020)J\u0006\u0010.\u001a\u00020\"J\u0006\u0010/\u001a\u00020\"J\u0006\u00100\u001a\u00020\"R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00128F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u00062"}, d2 = {"Lms/messageapp/fragments/troubleshoot/NotificationTroubleshootTestManager;", "", "fragment", "Landroid/support/v4/app/Fragment;", "(Landroid/support/v4/app/Fragment;)V", "adapter", "Lms/messageapp/fragments/troubleshoot/NotificationTroubleshootRecyclerViewAdapter;", "getAdapter", "()Lms/messageapp/fragments/troubleshoot/NotificationTroubleshootRecyclerViewAdapter;", "<set-?>", "", "currentTestIndex", "getCurrentTestIndex", "()I", "setCurrentTestIndex", "(I)V", "currentTestIndex$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lms/messageapp/fragments/troubleshoot/TroubleshootTest$TestStatus;", "diagStatus", "getDiagStatus", "()Lms/messageapp/fragments/troubleshoot/TroubleshootTest$TestStatus;", "setDiagStatus", "(Lms/messageapp/fragments/troubleshoot/TroubleshootTest$TestStatus;)V", "diagStatus$delegate", "getFragment", "()Landroid/support/v4/app/Fragment;", "isCancelled", "", "()Z", "setCancelled", "(Z)V", "statusListener", "Lkotlin/Function1;", "", "getStatusListener", "()Lkotlin/jvm/functions/Function1;", "setStatusListener", "(Lkotlin/jvm/functions/Function1;)V", "testList", "Ljava/util/ArrayList;", "Lms/messageapp/fragments/troubleshoot/TroubleshootTest;", "getTestList", "()Ljava/util/ArrayList;", "addTest", "test", "cancel", "retry", "runDiagnostic", "Companion", "vector_appDebug"})
public final class NotificationTroubleshootTestManager {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<ms.messageapp.fragments.troubleshoot.TroubleshootTest> testList = null;
    private boolean isCancelled;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty currentTestIndex$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ms.messageapp.fragments.troubleshoot.NotificationTroubleshootRecyclerViewAdapter adapter = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super ms.messageapp.fragments.troubleshoot.NotificationTroubleshootTestManager, kotlin.Unit> statusListener;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty diagStatus$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.support.v4.app.Fragment fragment = null;
    private static final int REQ_CODE_FIX = 9099;
    public static final ms.messageapp.fragments.troubleshoot.NotificationTroubleshootTestManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<ms.messageapp.fragments.troubleshoot.TroubleshootTest> getTestList() {
        return null;
    }
    
    public final boolean isCancelled() {
        return false;
    }
    
    public final void setCancelled(boolean p0) {
    }
    
    public final int getCurrentTestIndex() {
        return 0;
    }
    
    public final void setCurrentTestIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.fragments.troubleshoot.NotificationTroubleshootRecyclerViewAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<ms.messageapp.fragments.troubleshoot.NotificationTroubleshootTestManager, kotlin.Unit> getStatusListener() {
        return null;
    }
    
    public final void setStatusListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super ms.messageapp.fragments.troubleshoot.NotificationTroubleshootTestManager, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.fragments.troubleshoot.TroubleshootTest.TestStatus getDiagStatus() {
        return null;
    }
    
    public final void setDiagStatus(@org.jetbrains.annotations.NotNull()
    ms.messageapp.fragments.troubleshoot.TroubleshootTest.TestStatus p0) {
    }
    
    public final void addTest(@org.jetbrains.annotations.NotNull()
    ms.messageapp.fragments.troubleshoot.TroubleshootTest test) {
    }
    
    public final void runDiagnostic() {
    }
    
    public final void retry() {
    }
    
    public final void cancel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v4.app.Fragment getFragment() {
        return null;
    }
    
    public NotificationTroubleshootTestManager(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lms/messageapp/fragments/troubleshoot/NotificationTroubleshootTestManager$Companion;", "", "()V", "REQ_CODE_FIX", "", "getREQ_CODE_FIX", "()I", "vector_appDebug"})
    public static final class Companion {
        
        public final int getREQ_CODE_FIX() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}