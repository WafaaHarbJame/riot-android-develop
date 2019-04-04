package ms.messageapp.activity;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.CallSuper;
import android.text.TextUtils;
import ms.messageapp.R;
import ms.messageapp.types.JsonDict;
import ms.messageapp.widgets.WidgetsManager;
import org.matrix.androidsdk.rest.callback.ApiCallback;
import org.matrix.androidsdk.rest.model.Event;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.rest.model.RoomMember;
import org.matrix.androidsdk.util.Log;
import java.util.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J&\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J&\u0010\u0010\u001a\u00020\t2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J&\u0010\u0011\u001a\u00020\t2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J&\u0010\u0012\u001a\u00020\t2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0016J&\u0010\u0013\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J&\u0010\u0014\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J&\u0010\u0018\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J&\u0010\u0019\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0017J&\u0010\u001b\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J&\u0010\u001c\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J&\u0010\u001d\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J&\u0010\u001e\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J&\u0010\u001f\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lms/messageapp/activity/IntegrationManagerActivity;", "Lms/messageapp/activity/AbstractWidgetActivity;", "()V", "mScreenId", "", "mWidgetId", "buildInterfaceUrl", "scalarToken", "canScalarTokenBeProvided", "", "canSendEvent", "", "eventData", "", "", "Lms/messageapp/types/JsonDict;", "checkRoomId", "checkUserId", "dealsWithWidgetRequest", "getBotOptions", "getJoinRules", "getLayoutRes", "", "getMembershipCount", "getMembershipState", "getWidgets", "initUiAndData", "inviteUser", "setBotOptions", "setBotPower", "setPlumbingState", "setWidget", "Companion", "vector_appDebug"})
public final class IntegrationManagerActivity extends ms.messageapp.activity.AbstractWidgetActivity {
    private java.lang.String mWidgetId;
    private java.lang.String mScreenId;
    private static final java.lang.String LOG_TAG = null;
    
    /**
     * * the parameters
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MATRIX_ID = "EXTRA_MATRIX_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ROOM_ID = "EXTRA_ROOM_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_WIDGET_ID = "EXTRA_WIDGET_ID";
    private static final java.lang.String EXTRA_SCREEN_ID = "EXTRA_SCREEN_ID";
    public static final ms.messageapp.activity.IntegrationManagerActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    @java.lang.Override()
    public boolean canScalarTokenBeProvided() {
        return false;
    }
    
    /**
     * * Compute the integration URL
     *     *
     *     * @return the integration URL
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
    
    /**
     * * Invite an user to this room
     *     *
     *     * @param eventData the modular data
     */
    private final void inviteUser(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Set a new widget
     *     *
     *     * @param eventData the modular data
     */
    private final void setWidget(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Provide the widgets list
     *     *
     *     * @param eventData the modular data
     */
    private final void getWidgets(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Check if the user can send an event of predefined type
     *     *
     *     * @param eventData the modular data
     */
    private final void canSendEvent(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Provides the membership state
     *     *
     *     * @param eventData the modular data
     */
    private final void getMembershipState(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Request the latest joined room event
     *     *
     *     * @param eventData the modular data
     */
    private final void getJoinRules(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Update the 'plumbing state"
     *     *
     *     * @param eventData the modular data
     */
    private final void setPlumbingState(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Retrieve the latest botOptions event
     *     *
     *     * @param eventData the modular data
     */
    private final void getBotOptions(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Update the bot options
     *     *
     *     * @param eventData the modular data
     */
    private final void setBotOptions(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Update the bot power levels
     *     *
     *     * @param eventData the modular data
     */
    private final void setBotPower(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Provides the number of members in the rooms
     *     *
     *     * @param eventData the modular data
     */
    private final void getMembershipCount(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
    }
    
    /**
     * * Check if roomId is present in the event and match
     *     * Send response and return true in case of error
     *     *
     *     * @return true in case of error
     */
    private final boolean checkRoomId(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
        return false;
    }
    
    /**
     * * Check if userId is present in the event
     *     * Send response and return true in case of error
     *     *
     *     * @return true in case of error
     */
    private final boolean checkUserId(java.util.Map<java.lang.String, ? extends java.lang.Object> eventData) {
        return false;
    }
    
    public IntegrationManagerActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lms/messageapp/activity/IntegrationManagerActivity$Companion;", "", "()V", "EXTRA_MATRIX_ID", "", "EXTRA_ROOM_ID", "EXTRA_SCREEN_ID", "EXTRA_WIDGET_ID", "LOG_TAG", "kotlin.jvm.PlatformType", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "matrixId", "roomId", "widgetId", "screenId", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String matrixId, @org.jetbrains.annotations.NotNull()
        java.lang.String roomId, @org.jetbrains.annotations.Nullable()
        java.lang.String widgetId, @org.jetbrains.annotations.Nullable()
        java.lang.String screenId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}