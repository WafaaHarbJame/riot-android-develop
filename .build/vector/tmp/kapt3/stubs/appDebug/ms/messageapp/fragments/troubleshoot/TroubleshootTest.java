package ms.messageapp.fragments.troubleshoot;

import android.support.annotation.StringRes;
import kotlin.properties.Delegates;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002-.B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010)\u001a\u00020\"H\u0016J\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020\"H&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u0006/"}, d2 = {"Lms/messageapp/fragments/troubleshoot/TroubleshootTest;", "", "titleResId", "", "(I)V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "manager", "Lms/messageapp/fragments/troubleshoot/NotificationTroubleshootTestManager;", "getManager", "()Lms/messageapp/fragments/troubleshoot/NotificationTroubleshootTestManager;", "setManager", "(Lms/messageapp/fragments/troubleshoot/NotificationTroubleshootTestManager;)V", "quickFix", "Lms/messageapp/fragments/troubleshoot/TroubleshootTest$TroubleshootQuickFix;", "getQuickFix", "()Lms/messageapp/fragments/troubleshoot/TroubleshootTest$TroubleshootQuickFix;", "setQuickFix", "(Lms/messageapp/fragments/troubleshoot/TroubleshootTest$TroubleshootQuickFix;)V", "<set-?>", "Lms/messageapp/fragments/troubleshoot/TroubleshootTest$TestStatus;", "status", "getStatus", "()Lms/messageapp/fragments/troubleshoot/TroubleshootTest$TestStatus;", "setStatus", "(Lms/messageapp/fragments/troubleshoot/TroubleshootTest$TestStatus;)V", "status$delegate", "Lkotlin/properties/ReadWriteProperty;", "statusListener", "Lkotlin/Function1;", "", "getStatusListener", "()Lkotlin/jvm/functions/Function1;", "setStatusListener", "(Lkotlin/jvm/functions/Function1;)V", "getTitleResId", "()I", "cancel", "isFinished", "", "perform", "TestStatus", "TroubleshootQuickFix", "vector_appDebug"})
public abstract class TroubleshootTest {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty status$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super ms.messageapp.fragments.troubleshoot.TroubleshootTest, kotlin.Unit> statusListener;
    @org.jetbrains.annotations.Nullable()
    private ms.messageapp.fragments.troubleshoot.NotificationTroubleshootTestManager manager;
    @org.jetbrains.annotations.Nullable()
    private ms.messageapp.fragments.troubleshoot.TroubleshootTest.TroubleshootQuickFix quickFix;
    private final int titleResId = 0;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.fragments.troubleshoot.TroubleshootTest.TestStatus getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    ms.messageapp.fragments.troubleshoot.TroubleshootTest.TestStatus p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<ms.messageapp.fragments.troubleshoot.TroubleshootTest, kotlin.Unit> getStatusListener() {
        return null;
    }
    
    public final void setStatusListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super ms.messageapp.fragments.troubleshoot.TroubleshootTest, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ms.messageapp.fragments.troubleshoot.NotificationTroubleshootTestManager getManager() {
        return null;
    }
    
    public final void setManager(@org.jetbrains.annotations.Nullable()
    ms.messageapp.fragments.troubleshoot.NotificationTroubleshootTestManager p0) {
    }
    
    public abstract void perform();
    
    public final boolean isFinished() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ms.messageapp.fragments.troubleshoot.TroubleshootTest.TroubleshootQuickFix getQuickFix() {
        return null;
    }
    
    public final void setQuickFix(@org.jetbrains.annotations.Nullable()
    ms.messageapp.fragments.troubleshoot.TroubleshootTest.TroubleshootQuickFix p0) {
    }
    
    public void cancel() {
    }
    
    public final int getTitleResId() {
        return 0;
    }
    
    public TroubleshootTest(@android.support.annotation.StringRes()
    int titleResId) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lms/messageapp/fragments/troubleshoot/TroubleshootTest$TestStatus;", "", "(Ljava/lang/String;I)V", "NOT_STARTED", "RUNNING", "FAILED", "SUCCESS", "vector_appDebug"})
    public static enum TestStatus {
        /*public static final*/ NOT_STARTED /* = new NOT_STARTED() */,
        /*public static final*/ RUNNING /* = new RUNNING() */,
        /*public static final*/ FAILED /* = new FAILED() */,
        /*public static final*/ SUCCESS /* = new SUCCESS() */;
        
        TestStatus() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lms/messageapp/fragments/troubleshoot/TroubleshootTest$TroubleshootQuickFix;", "", "title", "", "(I)V", "getTitle", "()I", "doFix", "", "vector_appDebug"})
    public static abstract class TroubleshootQuickFix {
        private final int title = 0;
        
        public abstract void doFix();
        
        public final int getTitle() {
            return 0;
        }
        
        public TroubleshootQuickFix(@android.support.annotation.StringRes()
        int title) {
            super();
        }
    }
}