package ms.messageapp.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ms.messageapp.R;
import org.matrix.androidsdk.util.Log;

/**
 * * The view used in VectorHomeActivity to show some information about the keys backup state
 * * It does have a unique render method
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0003@ABB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010*\u001a\u00020+H\u0002J\u0012\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u000bH\u0016J\r\u0010.\u001a\u00020+H\u0001\u00a2\u0006\u0002\b/J\u0018\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020 2\b\b\u0002\u00102\u001a\u000203J\b\u00104\u001a\u00020+H\u0002J\b\u00105\u001a\u00020+H\u0002J\b\u00106\u001a\u00020+H\u0002J\u0010\u00107\u001a\u00020+2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020\bH\u0002J\u0010\u0010<\u001a\u00020+2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020\bH\u0016J\b\u0010?\u001a\u00020+H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001aR\u001e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&\u00a8\u0006C"}, d2 = {"Lms/messageapp/view/KeysBackupBanner;", "Landroid/support/constraint/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "close", "Landroid/view/View;", "getClose", "()Landroid/view/View;", "setClose", "(Landroid/view/View;)V", "delegate", "Lms/messageapp/view/KeysBackupBanner$Delegate;", "getDelegate", "()Lms/messageapp/view/KeysBackupBanner$Delegate;", "setDelegate", "(Lms/messageapp/view/KeysBackupBanner$Delegate;)V", "loading", "getLoading", "setLoading", "pendingVisibility", "Ljava/lang/Integer;", "value", "scrollState", "setScrollState", "(I)V", "state", "Lms/messageapp/view/KeysBackupBanner$State;", "textView1", "Landroid/widget/TextView;", "getTextView1", "()Landroid/widget/TextView;", "setTextView1", "(Landroid/widget/TextView;)V", "textView2", "getTextView2", "setTextView2", "hideAll", "", "onClick", "v", "onCloseClicked", "onCloseClicked$vector_appDebug", "render", "newState", "force", "", "renderBackingUp", "renderHidden", "renderInitial", "renderRecover", "version", "", "renderSetup", "nbOfKeys", "renderUpdate", "setVisibility", "visibility", "setupView", "Companion", "Delegate", "State", "vector_appDebug"})
public final class KeysBackupBanner extends android.support.constraint.ConstraintLayout implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.view_keys_backup_banner_text_1)
    public android.widget.TextView textView1;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.view_keys_backup_banner_text_2)
    public android.widget.TextView textView2;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.view_keys_backup_banner_close_group)
    public android.view.View close;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.view_keys_backup_banner_loading)
    public android.view.View loading;
    @org.jetbrains.annotations.Nullable()
    private ms.messageapp.view.KeysBackupBanner.Delegate delegate;
    private ms.messageapp.view.KeysBackupBanner.State state;
    private int scrollState;
    private java.lang.Integer pendingVisibility;
    private static final java.lang.String LOG_TAG = "KeysBackupBanner";
    
    /**
     * * Preference key for setup. Value is a boolean.
     */
    private static final java.lang.String BANNER_SETUP_DO_NOT_SHOW_AGAIN = "BANNER_SETUP_DO_NOT_SHOW_AGAIN";
    
    /**
     * * Preference key for recover. Value is a backup version (String).
     */
    private static final java.lang.String BANNER_RECOVER_DO_NOT_SHOW_FOR_VERSION = "BANNER_RECOVER_DO_NOT_SHOW_FOR_VERSION";
    
    /**
     * * Preference key for update. Value is a backup version (String).
     */
    private static final java.lang.String BANNER_UPDATE_DO_NOT_SHOW_FOR_VERSION = "BANNER_UPDATE_DO_NOT_SHOW_FOR_VERSION";
    public static final ms.messageapp.view.KeysBackupBanner.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextView1() {
        return null;
    }
    
    public final void setTextView1(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextView2() {
        return null;
    }
    
    public final void setTextView2(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getClose() {
        return null;
    }
    
    public final void setClose(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ms.messageapp.view.KeysBackupBanner.Delegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    ms.messageapp.view.KeysBackupBanner.Delegate p0) {
    }
    
    private final void setScrollState(int value) {
    }
    
    /**
     * * This methods is responsible for rendering the view according to the newState
     *     *
     *     * @param newState the newState representing the view
     */
    public final void render(@org.jetbrains.annotations.NotNull()
    ms.messageapp.view.KeysBackupBanner.State newState, boolean force) {
    }
    
    @java.lang.Override()
    public void setVisibility(int visibility) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @butterknife.OnClick(value = {2131297269})
    public final void onCloseClicked$vector_appDebug() {
    }
    
    private final void setupView() {
    }
    
    private final void renderInitial() {
    }
    
    private final void renderHidden() {
    }
    
    private final void renderSetup(int nbOfKeys) {
    }
    
    private final void renderRecover(java.lang.String version) {
    }
    
    private final void renderUpdate(java.lang.String version) {
    }
    
    private final void renderBackingUp() {
    }
    
    /**
     * * Hide all views that are not visible in all state
     */
    private final void hideAll() {
    }
    
    public KeysBackupBanner(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public KeysBackupBanner(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public KeysBackupBanner(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    /**
     * * The state representing the view
     *     * It can take one state at a time
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lms/messageapp/view/KeysBackupBanner$State;", "", "()V", "BackingUp", "Hidden", "Initial", "Recover", "Setup", "Update", "Lms/messageapp/view/KeysBackupBanner$State$Initial;", "Lms/messageapp/view/KeysBackupBanner$State$Hidden;", "Lms/messageapp/view/KeysBackupBanner$State$Setup;", "Lms/messageapp/view/KeysBackupBanner$State$Recover;", "Lms/messageapp/view/KeysBackupBanner$State$Update;", "Lms/messageapp/view/KeysBackupBanner$State$BackingUp;", "vector_appDebug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/view/KeysBackupBanner$State$Initial;", "Lms/messageapp/view/KeysBackupBanner$State;", "()V", "vector_appDebug"})
        public static final class Initial extends ms.messageapp.view.KeysBackupBanner.State {
            public static final ms.messageapp.view.KeysBackupBanner.State.Initial INSTANCE = null;
            
            private Initial() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/view/KeysBackupBanner$State$Hidden;", "Lms/messageapp/view/KeysBackupBanner$State;", "()V", "vector_appDebug"})
        public static final class Hidden extends ms.messageapp.view.KeysBackupBanner.State {
            public static final ms.messageapp.view.KeysBackupBanner.State.Hidden INSTANCE = null;
            
            private Hidden() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lms/messageapp/view/KeysBackupBanner$State$Setup;", "Lms/messageapp/view/KeysBackupBanner$State;", "numberOfKeys", "", "(I)V", "getNumberOfKeys", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "vector_appDebug"})
        public static final class Setup extends ms.messageapp.view.KeysBackupBanner.State {
            private final int numberOfKeys = 0;
            
            public final int getNumberOfKeys() {
                return 0;
            }
            
            public Setup(int numberOfKeys) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final ms.messageapp.view.KeysBackupBanner.State.Setup copy(int numberOfKeys) {
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
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lms/messageapp/view/KeysBackupBanner$State$Recover;", "Lms/messageapp/view/KeysBackupBanner$State;", "version", "", "(Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "vector_appDebug"})
        public static final class Recover extends ms.messageapp.view.KeysBackupBanner.State {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String version = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getVersion() {
                return null;
            }
            
            public Recover(@org.jetbrains.annotations.NotNull()
            java.lang.String version) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final ms.messageapp.view.KeysBackupBanner.State.Recover copy(@org.jetbrains.annotations.NotNull()
            java.lang.String version) {
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
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lms/messageapp/view/KeysBackupBanner$State$Update;", "Lms/messageapp/view/KeysBackupBanner$State;", "version", "", "(Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "vector_appDebug"})
        public static final class Update extends ms.messageapp.view.KeysBackupBanner.State {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String version = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getVersion() {
                return null;
            }
            
            public Update(@org.jetbrains.annotations.NotNull()
            java.lang.String version) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final ms.messageapp.view.KeysBackupBanner.State.Update copy(@org.jetbrains.annotations.NotNull()
            java.lang.String version) {
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
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/view/KeysBackupBanner$State$BackingUp;", "Lms/messageapp/view/KeysBackupBanner$State;", "()V", "vector_appDebug"})
        public static final class BackingUp extends ms.messageapp.view.KeysBackupBanner.State {
            public static final ms.messageapp.view.KeysBackupBanner.State.BackingUp INSTANCE = null;
            
            private BackingUp() {
                super();
            }
        }
    }
    
    /**
     * * An interface to delegate some actions to another object
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lms/messageapp/view/KeysBackupBanner$Delegate;", "", "recoverKeysBackup", "", "setupKeysBackup", "vector_appDebug"})
    public static abstract interface Delegate {
        
        public abstract void setupKeysBackup();
        
        public abstract void recoverKeysBackup();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lms/messageapp/view/KeysBackupBanner$Companion;", "", "()V", "BANNER_RECOVER_DO_NOT_SHOW_FOR_VERSION", "", "BANNER_SETUP_DO_NOT_SHOW_AGAIN", "BANNER_UPDATE_DO_NOT_SHOW_FOR_VERSION", "LOG_TAG", "onRecoverDoneForVersion", "", "context", "Landroid/content/Context;", "version", "vector_appDebug"})
    public static final class Companion {
        
        /**
         * * Inform the banner that a Recover has been done for this version, so do not show the Recover banner for this version
         */
        public final void onRecoverDoneForVersion(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String version) {
        }
        
        private Companion() {
            super();
        }
    }
}