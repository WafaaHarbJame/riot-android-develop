package ms.messageapp.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.transition.TransitionManager;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.activity.MXCActionBarActivity;
import ms.messageapp.fragments.troubleshoot.NotificationTroubleshootTestManager;
import ms.messageapp.fragments.troubleshoot.TroubleshootTest;
import ms.messageapp.push.fcm.NotificationTroubleshootTestManagerFactory;
import ms.messageapp.util.BugReporter;
import org.matrix.androidsdk.MXSession;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 82\u00020\u0001:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0016J\"\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0012\u0010,\u001a\u00020\'2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010/\u001a\u00020\'2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020\'H\u0016J\b\u00103\u001a\u00020\'H\u0016J\u001a\u00104\u001a\u00020\'2\u0006\u00105\u001a\u0002062\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00107\u001a\u00020\'H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lms/messageapp/fragments/VectorSettingsNotificationsTroubleshootFragment;", "Lms/messageapp/fragments/VectorBaseFragment;", "()V", "interactionListener", "Lms/messageapp/fragments/VectorSettingsFragmentInteractionListener;", "mBottomView", "Landroid/view/ViewGroup;", "getMBottomView", "()Landroid/view/ViewGroup;", "setMBottomView", "(Landroid/view/ViewGroup;)V", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "getMRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "setMRecyclerView", "(Landroid/support/v7/widget/RecyclerView;)V", "mRunButton", "Landroid/widget/Button;", "getMRunButton", "()Landroid/widget/Button;", "setMRunButton", "(Landroid/widget/Button;)V", "mSession", "Lorg/matrix/androidsdk/MXSession;", "mSummaryButton", "getMSummaryButton", "setMSummaryButton", "mSummaryDescription", "Landroid/widget/TextView;", "getMSummaryDescription", "()Landroid/widget/TextView;", "setMSummaryDescription", "(Landroid/widget/TextView;)V", "testManager", "Lms/messageapp/fragments/troubleshoot/NotificationTroubleshootTestManager;", "getLayoutResId", "", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onResume", "onViewCreated", "view", "Landroid/view/View;", "startUI", "Companion", "vector_appDebug"})
public final class VectorSettingsNotificationsTroubleshootFragment extends ms.messageapp.fragments.VectorBaseFragment {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.troubleshoot_test_recycler_view)
    public android.support.v7.widget.RecyclerView mRecyclerView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.troubleshoot_bottom_view)
    public android.view.ViewGroup mBottomView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.toubleshoot_summ_description)
    public android.widget.TextView mSummaryDescription;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.troubleshoot_summ_button)
    public android.widget.Button mSummaryButton;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.troubleshoot_run_button)
    public android.widget.Button mRunButton;
    private ms.messageapp.fragments.troubleshoot.NotificationTroubleshootTestManager testManager;
    private org.matrix.androidsdk.MXSession mSession;
    private ms.messageapp.fragments.VectorSettingsFragmentInteractionListener interactionListener;
    public static final ms.messageapp.fragments.VectorSettingsNotificationsTroubleshootFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getMRecyclerView() {
        return null;
    }
    
    public final void setMRecyclerView(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getMBottomView() {
        return null;
    }
    
    public final void setMBottomView(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMSummaryDescription() {
        return null;
    }
    
    public final void setMSummaryDescription(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getMSummaryButton() {
        return null;
    }
    
    public final void setMSummaryButton(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getMRunButton() {
        return null;
    }
    
    public final void setMRunButton(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @java.lang.Override()
    public int getLayoutResId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startUI() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    public VectorSettingsNotificationsTroubleshootFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lms/messageapp/fragments/VectorSettingsNotificationsTroubleshootFragment$Companion;", "", "()V", "newInstance", "Lms/messageapp/fragments/VectorSettingsNotificationsTroubleshootFragment;", "matrixId", "", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.fragments.VectorSettingsNotificationsTroubleshootFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String matrixId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}