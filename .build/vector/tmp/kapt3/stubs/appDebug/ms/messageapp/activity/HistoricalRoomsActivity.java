package ms.messageapp.activity;

import android.app.SearchManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.adapters.AbsAdapter;
import ms.messageapp.adapters.HomeRoomAdapter;
import ms.messageapp.ui.themes.ActivityOtherThemes;
import ms.messageapp.util.RoomUtils;
import ms.messageapp.view.EmptyViewItemDecoration;
import ms.messageapp.view.SimpleDividerItemDecoration;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.data.Room;
import org.matrix.androidsdk.rest.callback.ApiCallback;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.util.Log;
import java.util.*;

/**
 * * Displays the historical rooms list
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002;<B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(H\u0016J \u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+2\u0006\u0010\'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u001eH\u0016J\b\u0010-\u001a\u00020#H\u0016J\u0018\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020+2\u0006\u0010\'\u001a\u00020(H\u0016J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u0002012\u0006\u00105\u001a\u000203H\u0016J\b\u00106\u001a\u00020#H\u0014J\u0018\u00107\u001a\u00020#2\u0006\u0010\'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u001eH\u0016J\u0010\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020\u001eH\u0016J\b\u0010:\u001a\u00020#H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lms/messageapp/activity/HistoricalRoomsActivity;", "Lms/messageapp/activity/VectorAppCompatActivity;", "Landroid/support/v7/widget/SearchView$OnQueryTextListener;", "Lms/messageapp/adapters/HomeRoomAdapter$OnSelectRoomListener;", "Lms/messageapp/adapters/AbsAdapter$MoreRoomActionListener;", "Lms/messageapp/util/RoomUtils$HistoricalRoomActionListener;", "()V", "mHistoricalAdapter", "Lms/messageapp/adapters/HomeRoomAdapter;", "mHistoricalPlaceHolder", "Landroid/widget/TextView;", "getMHistoricalPlaceHolder$vector_appDebug", "()Landroid/widget/TextView;", "setMHistoricalPlaceHolder$vector_appDebug", "(Landroid/widget/TextView;)V", "mHistoricalRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "getMHistoricalRecyclerView$vector_appDebug", "()Landroid/support/v7/widget/RecyclerView;", "setMHistoricalRecyclerView$vector_appDebug", "(Landroid/support/v7/widget/RecyclerView;)V", "mSearchView", "Landroid/support/v7/widget/SearchView;", "getMSearchView$vector_appDebug", "()Landroid/support/v7/widget/SearchView;", "setMSearchView$vector_appDebug", "(Landroid/support/v7/widget/SearchView;)V", "mSession", "Lorg/matrix/androidsdk/MXSession;", "getLayoutRes", "", "getOtherThemes", "Lms/messageapp/ui/themes/ActivityOtherThemes$Home;", "getTitleRes", "initHistoricalRoomsData", "", "initUiAndData", "initViews", "onForgotRoom", "room", "Lorg/matrix/androidsdk/data/Room;", "onLongClickRoom", "v", "Landroid/view/View;", "position", "onLowMemory", "onMoreActionClick", "itemView", "onQueryTextChange", "", "newText", "", "onQueryTextSubmit", "query", "onResume", "onSelectRoom", "onTrimMemory", "level", "refreshHistorical", "Companion", "HistoricalRoomApiCallback", "vector_appDebug"})
public final class HistoricalRoomsActivity extends ms.messageapp.activity.VectorAppCompatActivity implements android.support.v7.widget.SearchView.OnQueryTextListener, ms.messageapp.adapters.HomeRoomAdapter.OnSelectRoomListener, ms.messageapp.adapters.AbsAdapter.MoreRoomActionListener, ms.messageapp.util.RoomUtils.HistoricalRoomActionListener {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.historical_search_view)
    public android.support.v7.widget.SearchView mSearchView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.historical_recycler_view)
    public android.support.v7.widget.RecyclerView mHistoricalRecyclerView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.historical_no_results)
    public android.widget.TextView mHistoricalPlaceHolder;
    private ms.messageapp.adapters.HomeRoomAdapter mHistoricalAdapter;
    private org.matrix.androidsdk.MXSession mSession;
    private static final java.lang.String LOG_TAG = null;
    public static final ms.messageapp.activity.HistoricalRoomsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.SearchView getMSearchView$vector_appDebug() {
        return null;
    }
    
    public final void setMSearchView$vector_appDebug(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.SearchView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getMHistoricalRecyclerView$vector_appDebug() {
        return null;
    }
    
    public final void setMHistoricalRecyclerView$vector_appDebug(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMHistoricalPlaceHolder$vector_appDebug() {
        return null;
    }
    
    public final void setMHistoricalPlaceHolder$vector_appDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ms.messageapp.ui.themes.ActivityOtherThemes.Home getOtherThemes() {
        return null;
    }
    
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
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    public void onTrimMemory(int level) {
    }
    
    private final void initViews() {
    }
    
    private final void refreshHistorical() {
    }
    
    /**
     * * Init history rooms data
     */
    private final void initHistoricalRoomsData() {
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.String newText) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public void onSelectRoom(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.data.Room room, int position) {
    }
    
    @java.lang.Override()
    public void onLongClickRoom(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.data.Room room, int position) {
    }
    
    @java.lang.Override()
    public void onMoreActionClick(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.data.Room room) {
    }
    
    @java.lang.Override()
    public void onForgotRoom(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.data.Room room) {
    }
    
    public HistoricalRoomsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00a2\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0014\u0010\b\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\tj\u0002`\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0004J\u0014\u0010\u000e\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\tj\u0002`\nH\u0016\u00a8\u0006\u000f"}, d2 = {"Lms/messageapp/activity/HistoricalRoomsActivity$HistoricalRoomApiCallback;", "Lorg/matrix/androidsdk/rest/callback/ApiCallback;", "Ljava/lang/Void;", "(Lms/messageapp/activity/HistoricalRoomsActivity;)V", "onMatrixError", "", "e", "Lorg/matrix/androidsdk/rest/model/MatrixError;", "onNetworkError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onRequestDone", "errorMessage", "", "onUnexpectedError", "vector_appDebug"})
    abstract class HistoricalRoomApiCallback implements org.matrix.androidsdk.rest.callback.ApiCallback<java.lang.Void> {
        
        /**
         * * Handle the end of any request : hide loading wheel and display error message if there is any
         *         *
         *         * @param errorMessage the localized error message
         */
        protected final void onRequestDone(@org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage) {
        }
        
        @java.lang.Override()
        public void onNetworkError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception e) {
        }
        
        @java.lang.Override()
        public void onMatrixError(@org.jetbrains.annotations.NotNull()
        org.matrix.androidsdk.rest.model.MatrixError e) {
        }
        
        @java.lang.Override()
        public void onUnexpectedError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception e) {
        }
        
        public HistoricalRoomApiCallback() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lms/messageapp/activity/HistoricalRoomsActivity$Companion;", "", "()V", "LOG_TAG", "", "kotlin.jvm.PlatformType", "vector_appDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}