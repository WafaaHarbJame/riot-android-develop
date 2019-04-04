package ms.messageapp.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.transition.TransitionManager;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.binaryfork.spanny.Spanny;
import ms.messageapp.R;
import ms.messageapp.features.hhs.ResourceLimitErrorFormatter;
import ms.messageapp.listeners.IMessagesAdapterActionsListener;
import ms.messageapp.ui.animation.VectorTransitionSet;
import ms.messageapp.ui.themes.ThemeUtils;
import ms.messageapp.util.MatrixURLSpan;
import org.matrix.androidsdk.MXPatterns;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.rest.model.RoomTombstoneContent;
import org.matrix.androidsdk.util.Log;
import org.matrix.androidsdk.util.PermalinkUtils;

/**
 * * The view used in VectorRoomActivity to show some information
 * * It does have a unique render method
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 =2\u00020\u0001:\u0005<=>?@B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\'\u001a\u00020(H\u0002J\u000e\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020$J\b\u0010+\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020(H\u0002J\b\u0010-\u001a\u00020(H\u0002J\u0010\u0010.\u001a\u00020(2\u0006\u0010#\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020(2\u0006\u0010#\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020(2\u0006\u0010#\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020(2\u0006\u0010#\u001a\u000205H\u0002J\b\u00106\u001a\u00020(H\u0002J\u0010\u00107\u001a\u00020(2\u0006\u0010#\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020(H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001cR$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lms/messageapp/view/NotificationAreaView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "delegate", "Lms/messageapp/view/NotificationAreaView$Delegate;", "getDelegate", "()Lms/messageapp/view/NotificationAreaView$Delegate;", "setDelegate", "(Lms/messageapp/view/NotificationAreaView$Delegate;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "messageView", "Landroid/widget/TextView;", "getMessageView", "()Landroid/widget/TextView;", "setMessageView", "(Landroid/widget/TextView;)V", "pendingVisibility", "Ljava/lang/Integer;", "value", "scrollState", "getScrollState", "()I", "setScrollState", "(I)V", "state", "Lms/messageapp/view/NotificationAreaView$State;", "visibilityForEmptyContent", "visibilityForMessages", "cleanUp", "", "render", "newState", "renderConnectionError", "renderDefault", "renderHidden", "renderResourceLimitExceededError", "Lms/messageapp/view/NotificationAreaView$State$ResourceLimitExceededError;", "renderScrollToBottom", "Lms/messageapp/view/NotificationAreaView$State$ScrollToBottom;", "renderTombstone", "Lms/messageapp/view/NotificationAreaView$State$Tombstone;", "renderTyping", "Lms/messageapp/view/NotificationAreaView$State$Typing;", "renderUnreadPreview", "renderUnsent", "Lms/messageapp/view/NotificationAreaView$State$UnsentEvents;", "setVisibility", "visibility", "setupView", "CancelAllClickableSpan", "Companion", "Delegate", "ResendAllClickableSpan", "State", "vector_appDebug"})
public final class NotificationAreaView extends android.widget.RelativeLayout {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.room_notification_icon)
    public android.widget.ImageView imageView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.room_notification_message)
    public android.widget.TextView messageView;
    @org.jetbrains.annotations.Nullable()
    private ms.messageapp.view.NotificationAreaView.Delegate delegate;
    private ms.messageapp.view.NotificationAreaView.State state;
    private int scrollState;
    private java.lang.Integer pendingVisibility;
    
    /**
     * * Visibility when the info area is empty.
     *     * [View.VISIBLE] only when preference is set to [SHOW_INFO_AREA_VALUE_ALWAYS].
     */
    private final int visibilityForEmptyContent = 0;
    
    /**
     * * Visibility when the info area has a non-error message or icon (for example scrolling icon).
     *     * [View.VISIBLE] only when preference is set to [SHOW_INFO_AREA_VALUE_ALWAYS] or [SHOW_INFO_AREA_VALUE_MESSAGES_AND_ERRORS].
     */
    private final int visibilityForMessages = 0;
    
    /**
     * * Preference key.
     */
    private static final java.lang.String SHOW_INFO_AREA_KEY = "SETTINGS_SHOW_INFO_AREA_KEY";
    
    /**
     * * Always show the info area.
     */
    private static final java.lang.String SHOW_INFO_AREA_VALUE_ALWAYS = "always";
    
    /**
     * * Show the info area when it has messages or errors.
     */
    private static final java.lang.String SHOW_INFO_AREA_VALUE_MESSAGES_AND_ERRORS = "messages_and_errors";
    
    /**
     * * Show the info area only when it has errors.
     */
    private static final java.lang.String SHOW_INFO_AREA_VALUE_ONLY_ERRORS = "only_errors";
    public static final ms.messageapp.view.NotificationAreaView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getImageView() {
        return null;
    }
    
    public final void setImageView(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMessageView() {
        return null;
    }
    
    public final void setMessageView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ms.messageapp.view.NotificationAreaView.Delegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    ms.messageapp.view.NotificationAreaView.Delegate p0) {
    }
    
    public final int getScrollState() {
        return 0;
    }
    
    public final void setScrollState(int value) {
    }
    
    /**
     * * This methods is responsible for rendering the view according to the newState
     *     *
     *     * @param newState the newState representing the view
     */
    public final void render(@org.jetbrains.annotations.NotNull()
    ms.messageapp.view.NotificationAreaView.State newState) {
    }
    
    @java.lang.Override()
    public void setVisibility(int visibility) {
    }
    
    private final void setupView() {
    }
    
    private final void cleanUp() {
    }
    
    private final void renderTombstone(ms.messageapp.view.NotificationAreaView.State.Tombstone state) {
    }
    
    private final void renderResourceLimitExceededError(ms.messageapp.view.NotificationAreaView.State.ResourceLimitExceededError state) {
    }
    
    private final void renderConnectionError() {
    }
    
    private final void renderTyping(ms.messageapp.view.NotificationAreaView.State.Typing state) {
    }
    
    private final void renderUnreadPreview() {
    }
    
    private final void renderScrollToBottom(ms.messageapp.view.NotificationAreaView.State.ScrollToBottom state) {
    }
    
    private final void renderUnsent(ms.messageapp.view.NotificationAreaView.State.UnsentEvents state) {
    }
    
    private final void renderDefault() {
    }
    
    private final void renderHidden() {
    }
    
    public NotificationAreaView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public NotificationAreaView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public NotificationAreaView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    /**
     * * Track the cancel all click.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lms/messageapp/view/NotificationAreaView$CancelAllClickableSpan;", "Landroid/text/style/ClickableSpan;", "(Lms/messageapp/view/NotificationAreaView;)V", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "vector_appDebug"})
    final class CancelAllClickableSpan extends android.text.style.ClickableSpan {
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View widget) {
        }
        
        @java.lang.Override()
        public void updateDrawState(@org.jetbrains.annotations.NotNull()
        android.text.TextPaint ds) {
        }
        
        public CancelAllClickableSpan() {
            super();
        }
    }
    
    /**
     * * Track the resend all click.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lms/messageapp/view/NotificationAreaView$ResendAllClickableSpan;", "Landroid/text/style/ClickableSpan;", "(Lms/messageapp/view/NotificationAreaView;)V", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "vector_appDebug"})
    final class ResendAllClickableSpan extends android.text.style.ClickableSpan {
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View widget) {
        }
        
        @java.lang.Override()
        public void updateDrawState(@org.jetbrains.annotations.NotNull()
        android.text.TextPaint ds) {
        }
        
        public ResendAllClickableSpan() {
            super();
        }
    }
    
    /**
     * * The state representing the view
     *     * It can take one state at a time
     *     * Priority of state is managed in {@link VectorRoomActivity.refreshNotificationsArea() }
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Lms/messageapp/view/NotificationAreaView$State;", "", "()V", "ConnectionError", "Default", "Hidden", "Initial", "ResourceLimitExceededError", "ScrollToBottom", "Tombstone", "Typing", "UnreadPreview", "UnsentEvents", "Lms/messageapp/view/NotificationAreaView$State$Initial;", "Lms/messageapp/view/NotificationAreaView$State$Default;", "Lms/messageapp/view/NotificationAreaView$State$Hidden;", "Lms/messageapp/view/NotificationAreaView$State$ResourceLimitExceededError;", "Lms/messageapp/view/NotificationAreaView$State$ConnectionError;", "Lms/messageapp/view/NotificationAreaView$State$Tombstone;", "Lms/messageapp/view/NotificationAreaView$State$Typing;", "Lms/messageapp/view/NotificationAreaView$State$UnreadPreview;", "Lms/messageapp/view/NotificationAreaView$State$ScrollToBottom;", "Lms/messageapp/view/NotificationAreaView$State$UnsentEvents;", "vector_appDebug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/view/NotificationAreaView$State$Initial;", "Lms/messageapp/view/NotificationAreaView$State;", "()V", "vector_appDebug"})
        public static final class Initial extends ms.messageapp.view.NotificationAreaView.State {
            public static final ms.messageapp.view.NotificationAreaView.State.Initial INSTANCE = null;
            
            private Initial() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/view/NotificationAreaView$State$Default;", "Lms/messageapp/view/NotificationAreaView$State;", "()V", "vector_appDebug"})
        public static final class Default extends ms.messageapp.view.NotificationAreaView.State {
            public static final ms.messageapp.view.NotificationAreaView.State.Default INSTANCE = null;
            
            private Default() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/view/NotificationAreaView$State$Hidden;", "Lms/messageapp/view/NotificationAreaView$State;", "()V", "vector_appDebug"})
        public static final class Hidden extends ms.messageapp.view.NotificationAreaView.State {
            public static final ms.messageapp.view.NotificationAreaView.State.Hidden INSTANCE = null;
            
            private Hidden() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lms/messageapp/view/NotificationAreaView$State$ResourceLimitExceededError;", "Lms/messageapp/view/NotificationAreaView$State;", "isSoft", "", "matrixError", "Lorg/matrix/androidsdk/rest/model/MatrixError;", "(ZLorg/matrix/androidsdk/rest/model/MatrixError;)V", "()Z", "getMatrixError", "()Lorg/matrix/androidsdk/rest/model/MatrixError;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "vector_appDebug"})
        public static final class ResourceLimitExceededError extends ms.messageapp.view.NotificationAreaView.State {
            private final boolean isSoft = false;
            @org.jetbrains.annotations.NotNull()
            private final org.matrix.androidsdk.rest.model.MatrixError matrixError = null;
            
            public final boolean isSoft() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.matrix.androidsdk.rest.model.MatrixError getMatrixError() {
                return null;
            }
            
            public ResourceLimitExceededError(boolean isSoft, @org.jetbrains.annotations.NotNull()
            org.matrix.androidsdk.rest.model.MatrixError matrixError) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.matrix.androidsdk.rest.model.MatrixError component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final ms.messageapp.view.NotificationAreaView.State.ResourceLimitExceededError copy(boolean isSoft, @org.jetbrains.annotations.NotNull()
            org.matrix.androidsdk.rest.model.MatrixError matrixError) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/view/NotificationAreaView$State$ConnectionError;", "Lms/messageapp/view/NotificationAreaView$State;", "()V", "vector_appDebug"})
        public static final class ConnectionError extends ms.messageapp.view.NotificationAreaView.State {
            public static final ms.messageapp.view.NotificationAreaView.State.ConnectionError INSTANCE = null;
            
            private ConnectionError() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lms/messageapp/view/NotificationAreaView$State$Tombstone;", "Lms/messageapp/view/NotificationAreaView$State;", "tombstoneContent", "Lorg/matrix/androidsdk/rest/model/RoomTombstoneContent;", "(Lorg/matrix/androidsdk/rest/model/RoomTombstoneContent;)V", "getTombstoneContent", "()Lorg/matrix/androidsdk/rest/model/RoomTombstoneContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "vector_appDebug"})
        public static final class Tombstone extends ms.messageapp.view.NotificationAreaView.State {
            @org.jetbrains.annotations.NotNull()
            private final org.matrix.androidsdk.rest.model.RoomTombstoneContent tombstoneContent = null;
            
            @org.jetbrains.annotations.NotNull()
            public final org.matrix.androidsdk.rest.model.RoomTombstoneContent getTombstoneContent() {
                return null;
            }
            
            public Tombstone(@org.jetbrains.annotations.NotNull()
            org.matrix.androidsdk.rest.model.RoomTombstoneContent tombstoneContent) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.matrix.androidsdk.rest.model.RoomTombstoneContent component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final ms.messageapp.view.NotificationAreaView.State.Tombstone copy(@org.jetbrains.annotations.NotNull()
            org.matrix.androidsdk.rest.model.RoomTombstoneContent tombstoneContent) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lms/messageapp/view/NotificationAreaView$State$Typing;", "Lms/messageapp/view/NotificationAreaView$State;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "vector_appDebug"})
        public static final class Typing extends ms.messageapp.view.NotificationAreaView.State {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
            
            public Typing(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final ms.messageapp.view.NotificationAreaView.State.Typing copy(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/view/NotificationAreaView$State$UnreadPreview;", "Lms/messageapp/view/NotificationAreaView$State;", "()V", "vector_appDebug"})
        public static final class UnreadPreview extends ms.messageapp.view.NotificationAreaView.State {
            public static final ms.messageapp.view.NotificationAreaView.State.UnreadPreview INSTANCE = null;
            
            private UnreadPreview() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lms/messageapp/view/NotificationAreaView$State$ScrollToBottom;", "Lms/messageapp/view/NotificationAreaView$State;", "unreadCount", "", "message", "", "(ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getUnreadCount", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "vector_appDebug"})
        public static final class ScrollToBottom extends ms.messageapp.view.NotificationAreaView.State {
            private final int unreadCount = 0;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String message = null;
            
            public final int getUnreadCount() {
                return 0;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getMessage() {
                return null;
            }
            
            public ScrollToBottom(int unreadCount, @org.jetbrains.annotations.Nullable()
            java.lang.String message) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final ms.messageapp.view.NotificationAreaView.State.ScrollToBottom copy(int unreadCount, @org.jetbrains.annotations.Nullable()
            java.lang.String message) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lms/messageapp/view/NotificationAreaView$State$UnsentEvents;", "Lms/messageapp/view/NotificationAreaView$State;", "hasUndeliverableEvents", "", "hasUnknownDeviceEvents", "(ZZ)V", "getHasUndeliverableEvents", "()Z", "getHasUnknownDeviceEvents", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "vector_appDebug"})
        public static final class UnsentEvents extends ms.messageapp.view.NotificationAreaView.State {
            private final boolean hasUndeliverableEvents = false;
            private final boolean hasUnknownDeviceEvents = false;
            
            public final boolean getHasUndeliverableEvents() {
                return false;
            }
            
            public final boolean getHasUnknownDeviceEvents() {
                return false;
            }
            
            public UnsentEvents(boolean hasUndeliverableEvents, boolean hasUnknownDeviceEvents) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean component2() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final ms.messageapp.view.NotificationAreaView.State.UnsentEvents copy(boolean hasUndeliverableEvents, boolean hasUnknownDeviceEvents) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
    
    /**
     * * An interface to delegate some actions to another object
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lms/messageapp/view/NotificationAreaView$Delegate;", "", "closeScreen", "", "deleteUnsentEvents", "jumpToBottom", "providesMessagesActionListener", "Lms/messageapp/listeners/IMessagesAdapterActionsListener;", "resendUnsentEvents", "vector_appDebug"})
    public static abstract interface Delegate {
        
        @org.jetbrains.annotations.NotNull()
        public abstract ms.messageapp.listeners.IMessagesAdapterActionsListener providesMessagesActionListener();
        
        public abstract void resendUnsentEvents();
        
        public abstract void deleteUnsentEvents();
        
        public abstract void closeScreen();
        
        public abstract void jumpToBottom();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lms/messageapp/view/NotificationAreaView$Companion;", "", "()V", "SHOW_INFO_AREA_KEY", "", "SHOW_INFO_AREA_VALUE_ALWAYS", "SHOW_INFO_AREA_VALUE_MESSAGES_AND_ERRORS", "SHOW_INFO_AREA_VALUE_ONLY_ERRORS", "vector_appDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}