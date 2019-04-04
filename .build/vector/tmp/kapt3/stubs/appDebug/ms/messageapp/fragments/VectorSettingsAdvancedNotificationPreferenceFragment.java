package ms.messageapp.fragments;

import android.app.Activity;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v14.preference.SwitchPreference;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.activity.MXCActionBarActivity;
import ms.messageapp.notifications.NotificationUtils;
import ms.messageapp.preference.BingRulePreference;
import ms.messageapp.util.PreferencesManager;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.listeners.MXEventListener;
import org.matrix.androidsdk.rest.model.bingrules.BingRule;
import org.matrix.androidsdk.util.BingRulesManager;
import org.matrix.androidsdk.util.Log;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\"\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lms/messageapp/fragments/VectorSettingsAdvancedNotificationPreferenceFragment;", "Landroid/support/v7/preference/PreferenceFragmentCompat;", "()V", "mEventsListener", "Lorg/matrix/androidsdk/listeners/MXEventListener;", "mLoadingView", "Landroid/view/View;", "mSession", "Lorg/matrix/androidsdk/MXSession;", "displayLoadingView", "", "hideLoadingView", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreatePreferences", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "onPause", "onResume", "refreshDisplay", "refreshPreferences", "Companion", "vector_appDebug"})
public final class VectorSettingsAdvancedNotificationPreferenceFragment extends android.support.v7.preference.PreferenceFragmentCompat {
    private org.matrix.androidsdk.MXSession mSession;
    private android.view.View mLoadingView;
    private final org.matrix.androidsdk.listeners.MXEventListener mEventsListener = null;
    private static final java.lang.String LOG_TAG = null;
    private static final int REQUEST_NOTIFICATION_RINGTONE = 888;
    private static java.util.Map<java.lang.String, java.lang.String> mPrefKeyToBingRuleId;
    public static final ms.messageapp.fragments.VectorSettingsAdvancedNotificationPreferenceFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    java.lang.String rootKey) {
    }
    
    private final void refreshDisplay() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    /**
     * * Refresh the known information about the account
     */
    private final void refreshPreferences() {
    }
    
    /**
     * * Display the loading view.
     */
    private final void displayLoadingView() {
    }
    
    /**
     * * Hide the loading view.
     */
    private final void hideLoadingView() {
    }
    
    public VectorSettingsAdvancedNotificationPreferenceFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lms/messageapp/fragments/VectorSettingsAdvancedNotificationPreferenceFragment$Companion;", "", "()V", "LOG_TAG", "", "kotlin.jvm.PlatformType", "REQUEST_NOTIFICATION_RINGTONE", "", "mPrefKeyToBingRuleId", "", "newInstance", "Lms/messageapp/fragments/VectorSettingsAdvancedNotificationPreferenceFragment;", "matrixId", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.fragments.VectorSettingsAdvancedNotificationPreferenceFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String matrixId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}