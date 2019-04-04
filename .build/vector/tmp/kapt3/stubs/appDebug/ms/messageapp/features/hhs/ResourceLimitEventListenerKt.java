package ms.messageapp.features.hhs;

import org.matrix.androidsdk.MXDataHandler;
import org.matrix.androidsdk.data.Room;
import org.matrix.androidsdk.data.RoomState;
import org.matrix.androidsdk.data.RoomTag;
import org.matrix.androidsdk.listeners.MXEventListener;
import org.matrix.androidsdk.rest.callback.SimpleApiCallback;
import org.matrix.androidsdk.rest.model.Event;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.rest.model.ServerNoticeUsageLimitContent;
import org.matrix.androidsdk.util.JsonUtils;
import org.matrix.androidsdk.util.Log;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"MAX_PINNED_NOTICES_PER_ROOM", "", "vector_appDebug"})
public final class ResourceLimitEventListenerKt {
    private static final int MAX_PINNED_NOTICES_PER_ROOM = 2;
}