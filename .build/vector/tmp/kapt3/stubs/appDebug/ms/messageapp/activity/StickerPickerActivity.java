package ms.messageapp.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import ms.messageapp.R;
import ms.messageapp.types.JsonDict;
import ms.messageapp.widgets.WidgetsManager;
import org.matrix.androidsdk.util.JsonUtils;
import org.matrix.androidsdk.util.Log;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J&\u0010\n\u001a\u00020\t2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\"\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u00020\u00142\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lms/messageapp/activity/StickerPickerActivity;", "Lms/messageapp/activity/AbstractWidgetActivity;", "()V", "mWidgetId", "", "mWidgetUrl", "buildInterfaceUrl", "scalarToken", "canScalarTokenBeProvided", "", "dealsWithWidgetRequest", "eventData", "", "", "Lms/messageapp/types/JsonDict;", "getLayoutRes", "", "getMenuRes", "getTitleRes", "initUiAndData", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "sendSticker", "Companion", "vector_appDebug"})
public final class StickerPickerActivity extends ms.messageapp.activity.AbstractWidgetActivity {
    private java.lang.String mWidgetUrl;
    private java.lang.String mWidgetId;
    private static final java.lang.String LOG_TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIDGET_NAME = "m.stickerpicker";
    private static final java.lang.String EXTRA_WIDGET_URL = "EXTRA_WIDGET_URL";
    private static final java.lang.String EXTRA_WIDGET_ID = "EXTRA_WIDGET_ID";
    private static final java.lang.String EXTRA_OUT_CONTENT = "EXTRA_OUT_CONTENT";
    public static final ms.messageapp.activity.StickerPickerActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
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
    
    @java.lang.Override()
    public boolean canScalarTokenBeProvided() {
        return false;
    }
    
    /**
     * * Compute the URL
     *     *
     *     * @return the URL
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String buildInterfaceUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String scalarToken) {
        return null;
    }
    
    /**
     * * A Widget message has been received, deals with it and send the response
     */
    @java.lang.Override()
    public boolean dealsWithWidgetRequest(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
        return false;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public int getMenuRes() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void sendSticker(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    public StickerPickerActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lms/messageapp/activity/StickerPickerActivity$Companion;", "", "()V", "EXTRA_OUT_CONTENT", "", "EXTRA_WIDGET_ID", "EXTRA_WIDGET_URL", "LOG_TAG", "kotlin.jvm.PlatformType", "WIDGET_NAME", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "matrixId", "roomId", "widgetUrl", "widgetId", "getResultContent", "intent", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String matrixId, @org.jetbrains.annotations.NotNull()
        java.lang.String roomId, @org.jetbrains.annotations.NotNull()
        java.lang.String widgetUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String widgetId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getResultContent(@org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}