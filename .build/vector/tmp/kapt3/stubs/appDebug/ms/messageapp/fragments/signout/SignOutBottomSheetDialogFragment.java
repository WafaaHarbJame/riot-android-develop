package ms.messageapp.fragments.signout;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.transition.TransitionManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.activity.KeysBackupManageActivity;
import ms.messageapp.activity.KeysBackupSetupActivity;
import ms.messageapp.activity.MXCActionBarActivity;
import org.matrix.androidsdk.crypto.keysbackup.KeysBackupStateManager;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 J2\u00020\u0001:\u0001JB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00108\u001a\u000209H\u0002J\u0012\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\"\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0012\u0010D\u001a\u00020E2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J&\u0010F\u001a\u0004\u0018\u00010\u00042\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\n2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001e\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001e\u00100\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001e\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u000e\u00106\u001a\u000207X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lms/messageapp/fragments/signout/SignOutBottomSheetDialogFragment;", "Landroid/support/design/widget/BottomSheetDialogFragment;", "()V", "activateClickableView", "Landroid/view/View;", "getActivateClickableView", "()Landroid/view/View;", "setActivateClickableView", "(Landroid/view/View;)V", "backingUpStatusGroup", "Landroid/view/ViewGroup;", "getBackingUpStatusGroup", "()Landroid/view/ViewGroup;", "setBackingUpStatusGroup", "(Landroid/view/ViewGroup;)V", "backupCompleteImage", "Landroid/widget/ImageView;", "getBackupCompleteImage", "()Landroid/widget/ImageView;", "setBackupCompleteImage", "(Landroid/widget/ImageView;)V", "backupProgress", "Landroid/widget/ProgressBar;", "getBackupProgress", "()Landroid/widget/ProgressBar;", "setBackupProgress", "(Landroid/widget/ProgressBar;)V", "backupStatusTex", "Landroid/widget/TextView;", "getBackupStatusTex", "()Landroid/widget/TextView;", "setBackupStatusTex", "(Landroid/widget/TextView;)V", "dontWantClickableView", "getDontWantClickableView", "setDontWantClickableView", "onSignOut", "Ljava/lang/Runnable;", "getOnSignOut", "()Ljava/lang/Runnable;", "setOnSignOut", "(Ljava/lang/Runnable;)V", "rootLayout", "getRootLayout", "setRootLayout", "setupClickableView", "getSetupClickableView", "setSetupClickableView", "sheetTitle", "getSheetTitle", "setSheetTitle", "signoutClickableView", "getSignoutClickableView", "setSignoutClickableView", "viewModel", "Lms/messageapp/fragments/signout/SignOutViewModel;", "getExtraMatrixID", "", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Companion", "vector_appDebug"})
public final class SignOutBottomSheetDialogFragment extends android.support.design.widget.BottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bottom_sheet_signout_warning_text)
    public android.widget.TextView sheetTitle;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bottom_sheet_signout_backingup_status_group)
    public android.view.ViewGroup backingUpStatusGroup;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_setup)
    public android.view.View setupClickableView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_activate)
    public android.view.View activateClickableView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.keys_backup_dont_want)
    public android.view.View dontWantClickableView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bottom_sheet_signout_icon_progress_bar)
    public android.widget.ProgressBar backupProgress;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bottom_sheet_signout_icon)
    public android.widget.ImageView backupCompleteImage;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bottom_sheet_backup_status_text)
    public android.widget.TextView backupStatusTex;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.bottom_sheet_signout_button)
    public android.view.View signoutClickableView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.root_layout)
    public android.view.ViewGroup rootLayout;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Runnable onSignOut;
    private ms.messageapp.fragments.signout.SignOutViewModel viewModel;
    private static final int EXPORT_REQ = 0;
    public static final ms.messageapp.fragments.signout.SignOutBottomSheetDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getSheetTitle() {
        return null;
    }
    
    public final void setSheetTitle(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getBackingUpStatusGroup() {
        return null;
    }
    
    public final void setBackingUpStatusGroup(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getSetupClickableView() {
        return null;
    }
    
    public final void setSetupClickableView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getActivateClickableView() {
        return null;
    }
    
    public final void setActivateClickableView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getDontWantClickableView() {
        return null;
    }
    
    public final void setDontWantClickableView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getBackupProgress() {
        return null;
    }
    
    public final void setBackupProgress(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getBackupCompleteImage() {
        return null;
    }
    
    public final void setBackupCompleteImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getBackupStatusTex() {
        return null;
    }
    
    public final void setBackupStatusTex(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getSignoutClickableView() {
        return null;
    }
    
    public final void setSignoutClickableView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getRootLayout() {
        return null;
    }
    
    public final void setRootLayout(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Runnable getOnSignOut() {
        return null;
    }
    
    public final void setOnSignOut(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable p0) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.lang.String getExtraMatrixID() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public SignOutBottomSheetDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lms/messageapp/fragments/signout/SignOutBottomSheetDialogFragment$Companion;", "", "()V", "EXPORT_REQ", "", "newInstance", "Lms/messageapp/fragments/signout/SignOutBottomSheetDialogFragment;", "matrixId", "", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.fragments.signout.SignOutBottomSheetDialogFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String matrixId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}