package ms.messageapp.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import ms.messageapp.BuildConfig;
import ms.messageapp.R;
import ms.messageapp.VectorApp;
import ms.messageapp.activity.interfaces.Restorable;
import ms.messageapp.dialogs.ConsentNotGivenHelper;
import ms.messageapp.receiver.DebugReceiver;
import ms.messageapp.ui.themes.ActivityOtherThemes;
import ms.messageapp.ui.themes.ThemeUtils;
import ms.messageapp.util.AssetReader;
import ms.messageapp.util.BugReporter;
import org.matrix.androidsdk.util.Log;

/**
 * * Parent class for all Activities in Vector application
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0010H\u0004J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0014J\b\u0010)\u001a\u00020&H\u0004J\b\u0010*\u001a\u00020#H\u0016J\b\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020-H\'J\b\u0010.\u001a\u00020-H\u0017J\b\u0010/\u001a\u00020-H\u0017J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0012H\u0004J\b\u00103\u001a\u00020-H\u0017J\b\u00104\u001a\u00020&H\u0016J\b\u00105\u001a\u00020&H\u0016J\b\u00106\u001a\u00020#H\u0004J\u0006\u00107\u001a\u00020#J\u0012\u00108\u001a\u00020&2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0004J\u000e\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020;J\b\u0010<\u001a\u00020&H\u0014J\b\u0010=\u001a\u00020&H\u0017J\u001a\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020#2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010B\u001a\u00020#2\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020&H\u0014J\b\u0010F\u001a\u00020&H\u0015J\u0010\u0010G\u001a\u00020&2\u0006\u0010H\u001a\u00020\u0012H\u0015J\u0010\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020#H\u0016J\b\u0010K\u001a\u00020&H\u0002J\b\u0010L\u001a\u00020&H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006M"}, d2 = {"Lms/messageapp/activity/VectorAppCompatActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "LOG_TAG", "", "kotlin.jvm.PlatformType", "consentNotGivenHelper", "Lms/messageapp/dialogs/ConsentNotGivenHelper;", "getConsentNotGivenHelper", "()Lms/messageapp/dialogs/ConsentNotGivenHelper;", "consentNotGivenHelper$delegate", "Lkotlin/Lazy;", "debugReceiver", "Lms/messageapp/receiver/DebugReceiver;", "restorables", "Ljava/util/HashSet;", "Lms/messageapp/activity/interfaces/Restorable;", "savedInstanceState", "Landroid/os/Bundle;", "toolbar", "Landroid/support/v7/widget/Toolbar;", "getToolbar", "()Landroid/support/v7/widget/Toolbar;", "setToolbar", "(Landroid/support/v7/widget/Toolbar;)V", "unBinder", "Lbutterknife/Unbinder;", "value", "Landroid/view/View;", "waitingView", "getWaitingView", "()Landroid/view/View;", "setWaitingView", "(Landroid/view/View;)V", "addToRestorables", "", "restorable", "attachBaseContext", "", "base", "Landroid/content/Context;", "configureToolbar", "displayInFullscreen", "doBeforeSetContentView", "getLayoutRes", "", "getMenuRes", "getMenuTint", "getOtherThemes", "Lms/messageapp/ui/themes/ActivityOtherThemes;", "getSavedInstanceState", "getTitleRes", "hideWaitingView", "initUiAndData", "isFirstCreation", "isWaitingViewVisible", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onLowMemory", "onMultiWindowModeChanged", "isInMultiWindowMode", "newConfig", "Landroid/content/res/Configuration;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onSaveInstanceState", "outState", "onWindowFocusChanged", "hasFocus", "setFullScreen", "showWaitingView", "vector_appDebug"})
public abstract class VectorAppCompatActivity extends android.support.v7.app.AppCompatActivity {
    private java.lang.String LOG_TAG;
    private butterknife.Unbinder unBinder;
    private android.os.Bundle savedInstanceState;
    private ms.messageapp.receiver.DebugReceiver debugReceiver;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.toolbar)
    @android.support.annotation.Nullable()
    protected android.support.v7.widget.Toolbar toolbar;
    @org.jetbrains.annotations.Nullable()
    private android.view.View waitingView;
    private final java.util.HashSet<ms.messageapp.activity.interfaces.Restorable> restorables = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy consentNotGivenHelper$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final android.support.v7.widget.Toolbar getToolbar() {
        return null;
    }
    
    protected final void setToolbar(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.Toolbar p0) {
    }
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    @java.lang.Override()
    protected final void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    @java.lang.Override()
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, @org.jetbrains.annotations.Nullable()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    public final boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @android.support.annotation.LayoutRes()
    public abstract int getLayoutRes();
    
    public boolean displayInFullscreen() {
        return false;
    }
    
    public void doBeforeSetContentView() {
    }
    
    public void initUiAndData() {
    }
    
    @android.support.annotation.StringRes()
    public int getTitleRes() {
        return 0;
    }
    
    @android.support.annotation.MenuRes()
    public int getMenuRes() {
        return 0;
    }
    
    @android.support.annotation.AttrRes()
    public int getMenuTint() {
        return 0;
    }
    
    /**
     * * Return a object containing other themes for this activity
     */
    @org.jetbrains.annotations.NotNull()
    public ms.messageapp.ui.themes.ActivityOtherThemes getOtherThemes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getWaitingView() {
        return null;
    }
    
    public final void setWaitingView(@org.jetbrains.annotations.Nullable()
    android.view.View value) {
    }
    
    /**
     * * Tells if the waiting view is currently displayed
     *     *
     *     * @return true if the waiting view is displayed
     */
    public final boolean isWaitingViewVisible() {
        return false;
    }
    
    /**
     * * Show the waiting view
     */
    public void showWaitingView() {
    }
    
    /**
     * * Hide the waiting view
     */
    public void hideWaitingView() {
    }
    
    /**
     * * Get the saved instance state.
     *     * Ensure {@link isFirstCreation()} returns false before calling this
     *     *
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    protected final android.os.Bundle getSavedInstanceState() {
        return null;
    }
    
    /**
     * * Is first creation
     *     *
     *     * @return true if Activity is created for the first time (and not restored by the system)
     */
    protected final boolean isFirstCreation() {
        return false;
    }
    
    /**
     * * Configure the Toolbar. It MUST be present in your layout with id "toolbar"
     */
    protected final void configureToolbar() {
    }
    
    /**
     * * Force to render the activity in fullscreen
     */
    private final void setFullScreen() {
    }
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    protected final boolean addToRestorables(@org.jetbrains.annotations.NotNull()
    ms.messageapp.activity.interfaces.Restorable restorable) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.dialogs.ConsentNotGivenHelper getConsentNotGivenHelper() {
        return null;
    }
    
    public VectorAppCompatActivity() {
        super();
    }
}