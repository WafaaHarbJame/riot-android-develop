package ms.messageapp.notifications;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.PowerManager;
import android.support.annotation.ColorInt;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.VectorApp;
import ms.messageapp.activity.*;
import ms.messageapp.receiver.DismissNotificationReceiver;
import ms.messageapp.util.PreferencesManager;
import org.matrix.androidsdk.rest.model.bingrules.BingRule;
import org.matrix.androidsdk.util.Log;
import java.util.*;

/**
 * * Util class for creating notifications.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u001c\u001a\u00020\u000bH\u0007J0\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0007J\u0018\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u001fJ:\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\'0&2\u0006\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020\u001fJ*\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+2\u0006\u0010$\u001a\u00020\u001fH\u0002J&\u0010,\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\'2\u0006\u0010*\u001a\u00020+J8\u0010/\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0007J\u000e\u00101\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u00102\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u00103\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u00104\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u001a\u00105\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020\u00142\b\u00106\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u00107\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0014J(\u00108\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u001fH\u0003J\u000e\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u00020\u00122\u0006\u0010;\u001a\u00020<J\u000e\u0010>\u001a\u00020\u00122\u0006\u0010;\u001a\u00020<J\u0016\u0010?\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lms/messageapp/notifications/NotificationUtils;", "", "()V", "CALL_NOTIFICATION_CHANNEL_ID", "", "JOIN_ACTION", "LISTENING_FOR_EVENTS_NOTIFICATION_CHANNEL_ID", "LOG_TAG", "kotlin.jvm.PlatformType", "NOISY_NOTIFICATION_CHANNEL_ID", "NOTIFICATION_ID_FOREGROUND_SERVICE", "", "NOTIFICATION_ID_MESSAGES", "QUICK_LAUNCH_ACTION", "REJECT_ACTION", "SILENT_NOTIFICATION_CHANNEL_ID", "TAP_TO_VIEW_ACTION", "addTextStyle", "", "context", "Landroid/content/Context;", "builder", "Landroid/support/v4/app/NotificationCompat$Builder;", "roomsNotifications", "Lms/messageapp/notifications/RoomsNotifications;", "addTextStyleWithSeveralRooms", "buildForegroundServiceNotification", "Landroid/app/Notification;", "subTitleResId", "buildIncomingCallNotification", "isVideo", "", "roomName", "matrixId", "callId", "buildMessageNotification", "isBackground", "notifiedEventsByRoomId", "", "", "Lms/messageapp/notifications/NotifiedEvent;", "eventToNotify", "bingRule", "Lorg/matrix/androidsdk/rest/model/bingrules/BingRule;", "buildMessagesListNotification", "messagesStrings", "", "buildPendingCallNotification", "roomId", "cancelAllNotifications", "cancelNotificationForegroundService", "cancelNotificationMessage", "createNotificationChannels", "ensureTitleNotEmpty", "title", "isDoNotDisturbModeOn", "manageNotificationSound", "isBing", "openSystemSettingsForCallCategory", "fragment", "Landroid/support/v4/app/Fragment;", "openSystemSettingsForNoisyCategory", "openSystemSettingsForSilentCategory", "showNotificationMessage", "notification", "vector_appDebug"})
public final class NotificationUtils {
    private static final java.lang.String LOG_TAG = null;
    
    /**
     * * Identifier of the notification used to display messages.
     *     * Those messages are merged into a single notification.
     */
    private static final int NOTIFICATION_ID_MESSAGES = 60;
    
    /**
     * * Identifier of the foreground notification used to keep the application alive
     *     * when it runs in background.
     *     * This notification, which is not removable by the end user, displays what
     *     * the application is doing while in background.
     */
    public static final int NOTIFICATION_ID_FOREGROUND_SERVICE = 61;
    private static final java.lang.String JOIN_ACTION = "NotificationUtils.JOIN_ACTION";
    private static final java.lang.String REJECT_ACTION = "NotificationUtils.REJECT_ACTION";
    private static final java.lang.String QUICK_LAUNCH_ACTION = "NotificationUtils.QUICK_LAUNCH_ACTION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAP_TO_VIEW_ACTION = "NotificationUtils.TAP_TO_VIEW_ACTION";
    private static final java.lang.String LISTENING_FOR_EVENTS_NOTIFICATION_CHANNEL_ID = "LISTEN_FOR_EVENTS_NOTIFICATION_CHANNEL_ID";
    private static final java.lang.String NOISY_NOTIFICATION_CHANNEL_ID = "DEFAULT_NOISY_NOTIFICATION_CHANNEL_ID";
    private static final java.lang.String SILENT_NOTIFICATION_CHANNEL_ID = "DEFAULT_SILENT_NOTIFICATION_CHANNEL_ID_V2";
    private static final java.lang.String CALL_NOTIFICATION_CHANNEL_ID = "CALL_NOTIFICATION_CHANNEL_ID_V2";
    public static final ms.messageapp.notifications.NotificationUtils INSTANCE = null;
    
    /**
     * * Create notification channels.
     *     *
     *     * @param context the context
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    public final void createNotificationChannels(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * * Build a polling thread listener notification
     *     *
     *     * @param context       Android context
     *     * @param subTitleResId subtitle string resource Id of the notification
     *     * @return the polling thread listener notification
     */
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"NewApi"})
    public final android.app.Notification buildForegroundServiceNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @android.support.annotation.StringRes()
    int subTitleResId) {
        return null;
    }
    
    /**
     * * Build an incoming call notification.
     *     * This notification starts the VectorHomeActivity which is in charge of centralizing the incoming call flow.
     *     *
     *     * @param context  the context.
     *     * @param isVideo  true if this is a video call, false for voice call
     *     * @param roomName the room name in which the call is pending.
     *     * @param matrixId the matrix id
     *     * @param callId   the call id.
     *     * @return the call notification.
     */
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"NewApi"})
    public final android.app.Notification buildIncomingCallNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isVideo, @org.jetbrains.annotations.NotNull()
    java.lang.String roomName, @org.jetbrains.annotations.NotNull()
    java.lang.String matrixId, @org.jetbrains.annotations.NotNull()
    java.lang.String callId) {
        return null;
    }
    
    /**
     * * Build a pending call notification
     *     *
     *     * @param context  the context.
     *     * @param isVideo  true if this is a video call, false for voice call
     *     * @param roomName the room name in which the call is pending.
     *     * @param roomId   the room Id
     *     * @param matrixId the matrix id
     *     * @param callId   the call id.
     *     * @return the call notification.
     */
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"NewApi"})
    public final android.app.Notification buildPendingCallNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isVideo, @org.jetbrains.annotations.NotNull()
    java.lang.String roomName, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    java.lang.String matrixId, @org.jetbrains.annotations.NotNull()
    java.lang.String callId) {
        return null;
    }
    
    /**
     * * Add a text style to a notification when there are several notified rooms.
     *     *
     *     * @param context            the context
     *     * @param builder            the notification builder
     *     * @param roomsNotifications the rooms notifications
     */
    private final void addTextStyleWithSeveralRooms(android.content.Context context, android.support.v4.app.NotificationCompat.Builder builder, ms.messageapp.notifications.RoomsNotifications roomsNotifications) {
    }
    
    /**
     * * Add a text style for a bunch of notified events.
     *     *
     *     *
     *     * The notification contains the notified messages from any rooms.
     *     * It does not contain anymore the latest notified message.
     *     *
     *     *
     *     * When there is only one room, it displays the MAX_NUMBER_NOTIFICATION_LINES latest messages.
     *     * The busy ones are displayed in RED.
     *     * The QUICK REPLY and other buttons are displayed.
     *     *
     *     *
     *     * When there are several rooms, it displays the busy notified rooms first (sorted by latest message timestamp).
     *     * Each line is
     *     * - "Room Name : XX unread messages" if there are many unread messages
     *     * - 'Room Name : Sender   - Message body" if there is only one unread message.
     *     *
     *     * @param context            the context
     *     * @param builder            the notification builder
     *     * @param roomsNotifications the rooms notifications
     */
    private final void addTextStyle(android.content.Context context, android.support.v4.app.NotificationCompat.Builder builder, ms.messageapp.notifications.RoomsNotifications roomsNotifications) {
    }
    
    /**
     * * Add the notification sound.
     *     *
     *     * @param context      the context
     *     * @param builder      the notification builder
     *     * @param isBackground true if the notification is a background one (e.g. read receipt)
     *     * @param isBing       true if the notification should play sound
     */
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void manageNotificationSound(android.content.Context context, android.support.v4.app.NotificationCompat.Builder builder, boolean isBackground, boolean isBing) {
    }
    
    /**
     * * Build a notification from the cached RoomsNotifications instance.
     *     *
     *     * @param context      the context
     *     * @param isBackground true if it is background notification
     *     * @return the notification
     */
    @org.jetbrains.annotations.Nullable()
    public final android.app.Notification buildMessageNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isBackground) {
        return null;
    }
    
    /**
     * * Build a notification
     *     *
     *     * @param context                the context
     *     * @param notifiedEventsByRoomId the notified events
     *     * @param eventToNotify          the latest event to notify
     *     * @param isBackground           true if it is background notification (like read receipt)
     *     * @return the notification
     */
    @org.jetbrains.annotations.Nullable()
    public final android.app.Notification buildMessageNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<? extends ms.messageapp.notifications.NotifiedEvent>> notifiedEventsByRoomId, @org.jetbrains.annotations.NotNull()
    ms.messageapp.notifications.NotifiedEvent eventToNotify, boolean isBackground) {
        return null;
    }
    
    /**
     * * Build a notification
     *     *
     *     * @param context            the context
     *     * @param roomsNotifications the rooms notifications
     *     * @param bingRule           the bing rule
     *     * @param isBackground       true if it is background notification (e.g. read receipt)
     *     * @return the notification
     */
    private final android.app.Notification buildMessageNotification(android.content.Context context, ms.messageapp.notifications.RoomsNotifications roomsNotifications, org.matrix.androidsdk.rest.model.bingrules.BingRule bingRule, boolean isBackground) {
        return null;
    }
    
    /**
     * * Build a notification
     *     *
     *     * @param context         the context
     *     * @param messagesStrings the message texts
     *     * @param bingRule        the bing rule
     *     * @return the notification
     */
    @org.jetbrains.annotations.Nullable()
    public final android.app.Notification buildMessagesListNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.CharSequence> messagesStrings, @org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.rest.model.bingrules.BingRule bingRule) {
        return null;
    }
    
    /**
     * * Show a notification containing messages
     */
    public final void showNotificationMessage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.Notification notification) {
    }
    
    /**
     * * Cancel the notification containing messages
     */
    public final void cancelNotificationMessage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * * Cancel the foreground notification service
     */
    public final void cancelNotificationForegroundService(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * * Cancel all the notification
     */
    public final void cancelAllNotifications(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * * Return true it the user has enabled the do not disturb mode
     */
    public final boolean isDoNotDisturbModeOn(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private final java.lang.CharSequence ensureTitleNotEmpty(android.content.Context context, java.lang.String title) {
        return null;
    }
    
    public final void openSystemSettingsForSilentCategory(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment) {
    }
    
    public final void openSystemSettingsForNoisyCategory(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment) {
    }
    
    public final void openSystemSettingsForCallCategory(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment) {
    }
    
    private NotificationUtils() {
        super();
    }
}