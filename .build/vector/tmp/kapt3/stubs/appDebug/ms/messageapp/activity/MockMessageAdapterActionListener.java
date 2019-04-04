package ms.messageapp.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import ms.messageapp.R;
import ms.messageapp.listeners.IMessagesAdapterActionsListener;
import ms.messageapp.util.MatrixLinkMovementMethod;
import org.matrix.androidsdk.crypto.data.MXDeviceInfo;
import org.matrix.androidsdk.rest.model.Event;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\u0018\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0012\u0010\u001e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010 \u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010)\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010+\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016\u00a8\u0006,"}, d2 = {"Lms/messageapp/activity/MockMessageAdapterActionListener;", "Lms/messageapp/listeners/IMessagesAdapterActionsListener;", "()V", "onAvatarClick", "", "userId", "", "onAvatarLongClick", "", "onContentClick", "position", "", "onContentLongClick", "onE2eIconClick", "event", "Lorg/matrix/androidsdk/rest/model/Event;", "deviceInfo", "Lorg/matrix/androidsdk/crypto/data/MXDeviceInfo;", "onEventAction", "textMsg", "action", "onEventDecrypted", "onEventIdClick", "eventId", "onGroupFlairClick", "groupIds", "", "onGroupIdClick", "groupId", "onInvalidIndexes", "onMatrixUserIdClick", "onMediaDownloaded", "onMoreReadReceiptClick", "onRoomAliasClick", "roomAlias", "onRoomIdClick", "roomId", "onRowClick", "onRowLongClick", "onSelectedEventChange", "currentSelectedEvent", "onSenderNameClick", "displayName", "shouldHighlightEvent", "vector_appDebug"})
public abstract class MockMessageAdapterActionListener implements ms.messageapp.listeners.IMessagesAdapterActionsListener {
    
    @java.lang.Override()
    public void onRowClick(int position) {
    }
    
    @java.lang.Override()
    public boolean onRowLongClick(int position) {
        return false;
    }
    
    @java.lang.Override()
    public void onContentClick(int position) {
    }
    
    @java.lang.Override()
    public boolean onContentLongClick(int position) {
        return false;
    }
    
    @java.lang.Override()
    public void onAvatarClick(@org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
    }
    
    @java.lang.Override()
    public boolean onAvatarLongClick(@org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
        return false;
    }
    
    @java.lang.Override()
    public void onSenderNameClick(@org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.lang.String displayName) {
    }
    
    @java.lang.Override()
    public void onMediaDownloaded(int position) {
    }
    
    @java.lang.Override()
    public void onMoreReadReceiptClick(@org.jetbrains.annotations.Nullable()
    java.lang.String eventId) {
    }
    
    @java.lang.Override()
    public void onGroupFlairClick(@org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> groupIds) {
    }
    
    @java.lang.Override()
    public boolean shouldHighlightEvent(@org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.rest.model.Event event) {
        return false;
    }
    
    @java.lang.Override()
    public void onMatrixUserIdClick(@org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
    }
    
    @java.lang.Override()
    public void onRoomAliasClick(@org.jetbrains.annotations.Nullable()
    java.lang.String roomAlias) {
    }
    
    @java.lang.Override()
    public void onRoomIdClick(@org.jetbrains.annotations.Nullable()
    java.lang.String roomId) {
    }
    
    @java.lang.Override()
    public void onEventIdClick(@org.jetbrains.annotations.Nullable()
    java.lang.String eventId) {
    }
    
    @java.lang.Override()
    public void onGroupIdClick(@org.jetbrains.annotations.Nullable()
    java.lang.String groupId) {
    }
    
    @java.lang.Override()
    public void onInvalidIndexes() {
    }
    
    @java.lang.Override()
    public void onEventAction(@org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.rest.model.Event event, @org.jetbrains.annotations.Nullable()
    java.lang.String textMsg, int action) {
    }
    
    @java.lang.Override()
    public void onE2eIconClick(@org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.rest.model.Event event, @org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.crypto.data.MXDeviceInfo deviceInfo) {
    }
    
    @java.lang.Override()
    public void onEventDecrypted() {
    }
    
    @java.lang.Override()
    public void onSelectedEventChange(@org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.rest.model.Event currentSelectedEvent) {
    }
    
    public MockMessageAdapterActionListener() {
        super();
    }
}