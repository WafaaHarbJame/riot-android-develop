package ms.messageapp.dialogs;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import ms.messageapp.R;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\b\t\n\u000b\f\r\u000e\u000f\u0010B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u00a8\u0006\u0019"}, d2 = {"Lms/messageapp/dialogs/DialogListItem;", "", "iconRes", "", "titleRes", "(II)V", "getIconRes", "()I", "getTitleRes", "SendFile", "SendSticker", "SendVoice", "StartVideoCall", "StartVoiceCall", "TakePhoto", "TakePhotoVideo", "TakeVideo", "Lms/messageapp/dialogs/DialogListItem$StartVoiceCall;", "Lms/messageapp/dialogs/DialogListItem$StartVideoCall;", "Lms/messageapp/dialogs/DialogListItem$SendFile;", "Lms/messageapp/dialogs/DialogListItem$SendVoice;", "Lms/messageapp/dialogs/DialogListItem$SendSticker;", "Lms/messageapp/dialogs/DialogListItem$TakePhoto;", "Lms/messageapp/dialogs/DialogListItem$TakeVideo;", "Lms/messageapp/dialogs/DialogListItem$TakePhotoVideo;", "vector_appDebug"})
public abstract class DialogListItem {
    private final int iconRes = 0;
    private final int titleRes = 0;
    
    public final int getIconRes() {
        return 0;
    }
    
    public final int getTitleRes() {
        return 0;
    }
    
    private DialogListItem(@android.support.annotation.DrawableRes()
    int iconRes, @android.support.annotation.StringRes()
    int titleRes) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/dialogs/DialogListItem$StartVoiceCall;", "Lms/messageapp/dialogs/DialogListItem;", "()V", "vector_appDebug"})
    public static final class StartVoiceCall extends ms.messageapp.dialogs.DialogListItem {
        public static final ms.messageapp.dialogs.DialogListItem.StartVoiceCall INSTANCE = null;
        
        private StartVoiceCall() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/dialogs/DialogListItem$StartVideoCall;", "Lms/messageapp/dialogs/DialogListItem;", "()V", "vector_appDebug"})
    public static final class StartVideoCall extends ms.messageapp.dialogs.DialogListItem {
        public static final ms.messageapp.dialogs.DialogListItem.StartVideoCall INSTANCE = null;
        
        private StartVideoCall() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/dialogs/DialogListItem$SendFile;", "Lms/messageapp/dialogs/DialogListItem;", "()V", "vector_appDebug"})
    public static final class SendFile extends ms.messageapp.dialogs.DialogListItem {
        public static final ms.messageapp.dialogs.DialogListItem.SendFile INSTANCE = null;
        
        private SendFile() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/dialogs/DialogListItem$SendVoice;", "Lms/messageapp/dialogs/DialogListItem;", "()V", "vector_appDebug"})
    public static final class SendVoice extends ms.messageapp.dialogs.DialogListItem {
        public static final ms.messageapp.dialogs.DialogListItem.SendVoice INSTANCE = null;
        
        private SendVoice() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/dialogs/DialogListItem$SendSticker;", "Lms/messageapp/dialogs/DialogListItem;", "()V", "vector_appDebug"})
    public static final class SendSticker extends ms.messageapp.dialogs.DialogListItem {
        public static final ms.messageapp.dialogs.DialogListItem.SendSticker INSTANCE = null;
        
        private SendSticker() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/dialogs/DialogListItem$TakePhoto;", "Lms/messageapp/dialogs/DialogListItem;", "()V", "vector_appDebug"})
    public static final class TakePhoto extends ms.messageapp.dialogs.DialogListItem {
        public static final ms.messageapp.dialogs.DialogListItem.TakePhoto INSTANCE = null;
        
        private TakePhoto() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/dialogs/DialogListItem$TakeVideo;", "Lms/messageapp/dialogs/DialogListItem;", "()V", "vector_appDebug"})
    public static final class TakeVideo extends ms.messageapp.dialogs.DialogListItem {
        public static final ms.messageapp.dialogs.DialogListItem.TakeVideo INSTANCE = null;
        
        private TakeVideo() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lms/messageapp/dialogs/DialogListItem$TakePhotoVideo;", "Lms/messageapp/dialogs/DialogListItem;", "()V", "vector_appDebug"})
    public static final class TakePhotoVideo extends ms.messageapp.dialogs.DialogListItem {
        public static final ms.messageapp.dialogs.DialogListItem.TakePhotoVideo INSTANCE = null;
        
        private TakePhotoVideo() {
            super(0, 0);
        }
    }
}