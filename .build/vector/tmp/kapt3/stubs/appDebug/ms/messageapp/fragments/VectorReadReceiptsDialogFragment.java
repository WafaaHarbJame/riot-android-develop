package ms.messageapp.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.adapters.VectorReadReceiptsAdapter;
import ms.messageapp.fragments.base.VectorBaseDialogFragment;
import org.matrix.androidsdk.rest.callback.SimpleApiCallback;
import org.matrix.androidsdk.rest.model.RoomMember;
import org.matrix.androidsdk.util.Log;
import java.util.*;

/**
 * * A dialog fragment showing the read receipts for an event
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lms/messageapp/fragments/VectorReadReceiptsDialogFragment;", "Lms/messageapp/fragments/base/VectorBaseDialogFragment;", "Lms/messageapp/fragments/VectorReadReceiptsDialogFragment$VectorReadReceiptsDialogFragmentListener;", "Lms/messageapp/adapters/VectorReadReceiptsAdapter$VectorReadReceiptsAdapterListener;", "()V", "mAdapter", "Lms/messageapp/adapters/VectorReadReceiptsAdapter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMemberClicked", "userId", "", "Companion", "VectorReadReceiptsDialogFragmentListener", "vector_appDebug"})
public final class VectorReadReceiptsDialogFragment extends ms.messageapp.fragments.base.VectorBaseDialogFragment<ms.messageapp.fragments.VectorReadReceiptsDialogFragment.VectorReadReceiptsDialogFragmentListener> implements ms.messageapp.adapters.VectorReadReceiptsAdapter.VectorReadReceiptsAdapterListener {
    private ms.messageapp.adapters.VectorReadReceiptsAdapter mAdapter;
    private static final java.lang.String LOG_TAG = null;
    private static final java.lang.String ARG_ROOM_ID = "VectorReadReceiptsDialogFragment.ARG_ROOM_ID";
    private static final java.lang.String ARG_EVENT_ID = "VectorReadReceiptsDialogFragment.ARG_EVENT_ID";
    private static final java.lang.String ARG_SESSION_ID = "VectorReadReceiptsDialogFragment.ARG_SESSION_ID";
    public static final ms.messageapp.fragments.VectorReadReceiptsDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    @java.lang.Override()
    public void onMemberClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    public VectorReadReceiptsDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lms/messageapp/fragments/VectorReadReceiptsDialogFragment$VectorReadReceiptsDialogFragmentListener;", "Lms/messageapp/adapters/VectorReadReceiptsAdapter$VectorReadReceiptsAdapterListener;", "vector_appDebug"})
    public static abstract interface VectorReadReceiptsDialogFragmentListener extends ms.messageapp.adapters.VectorReadReceiptsAdapter.VectorReadReceiptsAdapterListener {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lms/messageapp/fragments/VectorReadReceiptsDialogFragment$Companion;", "", "()V", "ARG_EVENT_ID", "", "ARG_ROOM_ID", "ARG_SESSION_ID", "LOG_TAG", "kotlin.jvm.PlatformType", "newInstance", "Lms/messageapp/fragments/VectorReadReceiptsDialogFragment;", "userId", "roomId", "eventId", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.fragments.VectorReadReceiptsDialogFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String userId, @org.jetbrains.annotations.NotNull()
        java.lang.String roomId, @org.jetbrains.annotations.NotNull()
        java.lang.String eventId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}