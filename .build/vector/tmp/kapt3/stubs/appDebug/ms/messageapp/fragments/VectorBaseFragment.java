package ms.messageapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.view.*;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import ms.messageapp.activity.VectorAppCompatActivity;
import org.matrix.androidsdk.util.Log;

/**
 * * Parent class for all Fragment in Vector application
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0017J\b\u0010 \u001a\u00020\u000fH\u0016J\b\u0010!\u001a\u00020\u000fH\u0017J\u001a\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006$"}, d2 = {"Lms/messageapp/fragments/VectorBaseFragment;", "Landroid/support/v4/app/Fragment;", "()V", "mUnBinder", "Lbutterknife/Unbinder;", "vectorActivity", "Lms/messageapp/activity/VectorAppCompatActivity;", "getVectorActivity", "()Lms/messageapp/activity/VectorAppCompatActivity;", "setVectorActivity", "(Lms/messageapp/activity/VectorAppCompatActivity;)V", "getLayoutResId", "", "getMenuRes", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onDetach", "onResume", "onViewCreated", "view", "vector_appDebug"})
public abstract class VectorBaseFragment extends android.support.v4.app.Fragment {
    private butterknife.Unbinder mUnBinder;
    @org.jetbrains.annotations.Nullable()
    private ms.messageapp.activity.VectorAppCompatActivity vectorActivity;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    protected final ms.messageapp.activity.VectorAppCompatActivity getVectorActivity() {
        return null;
    }
    
    protected final void setVectorActivity(@org.jetbrains.annotations.Nullable()
    ms.messageapp.activity.VectorAppCompatActivity p0) {
    }
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.support.annotation.LayoutRes()
    public abstract int getLayoutResId();
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    public void onResume() {
    }
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public int getMenuRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    public VectorBaseFragment() {
        super();
    }
}