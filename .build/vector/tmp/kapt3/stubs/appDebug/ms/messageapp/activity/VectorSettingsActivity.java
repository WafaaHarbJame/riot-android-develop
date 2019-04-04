package ms.messageapp.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.fragments.VectorSettingsAdvancedNotificationPreferenceFragment;
import ms.messageapp.fragments.VectorSettingsFragmentInteractionListener;
import ms.messageapp.fragments.VectorSettingsNotificationsTroubleshootFragment;
import ms.messageapp.fragments.VectorSettingsPreferencesFragment;
import ms.messageapp.util.PreferencesManager;

/**
 * * Displays the client settings.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0014J\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lms/messageapp/activity/VectorSettingsActivity;", "Lms/messageapp/activity/MXCActionBarActivity;", "Landroid/support/v7/preference/PreferenceFragmentCompat$OnPreferenceStartFragmentCallback;", "Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;", "Lms/messageapp/fragments/VectorSettingsFragmentInteractionListener;", "()V", "keyToHighlight", "", "vectorSettingsPreferencesFragment", "Lms/messageapp/fragments/VectorSettingsPreferencesFragment;", "getLayoutRes", "", "getTitleRes", "initUiAndData", "", "onBackStackChanged", "onDestroy", "onPreferenceStartFragment", "", "caller", "Landroid/support/v7/preference/PreferenceFragmentCompat;", "pref", "Landroid/support/v7/preference/Preference;", "requestHighlightPreferenceKeyOnResume", "key", "requestedKeyToHighlight", "Companion", "vector_appDebug"})
public final class VectorSettingsActivity extends ms.messageapp.activity.MXCActionBarActivity implements android.support.v7.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback, android.support.v4.app.FragmentManager.OnBackStackChangedListener, ms.messageapp.fragments.VectorSettingsFragmentInteractionListener {
    private ms.messageapp.fragments.VectorSettingsPreferencesFragment vectorSettingsPreferencesFragment;
    private java.lang.String keyToHighlight;
    private static final java.lang.String FRAGMENT_TAG = "VectorSettingsPreferencesFragment";
    public static final ms.messageapp.activity.VectorSettingsActivity.Companion Companion = null;
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
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onBackStackChanged() {
    }
    
    @java.lang.Override()
    public boolean onPreferenceStartFragment(@org.jetbrains.annotations.Nullable()
    android.support.v7.preference.PreferenceFragmentCompat caller, @org.jetbrains.annotations.Nullable()
    android.support.v7.preference.Preference pref) {
        return false;
    }
    
    @java.lang.Override()
    public void requestHighlightPreferenceKeyOnResume(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String requestedKeyToHighlight() {
        return null;
    }
    
    public VectorSettingsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lms/messageapp/activity/VectorSettingsActivity$Companion;", "", "()V", "FRAGMENT_TAG", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "userId", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String userId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}