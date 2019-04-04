package ms.messageapp.activity;

import android.content.Context;
import android.content.Intent;
import android.media.ExifInterface;
import butterknife.BindView;
import com.github.chrisbanes.photoview.PhotoView;
import ms.messageapp.R;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lms/messageapp/activity/VectorAvatarViewerActivity;", "Lms/messageapp/activity/MXCActionBarActivity;", "()V", "photoView", "Lcom/github/chrisbanes/photoview/PhotoView;", "getPhotoView", "()Lcom/github/chrisbanes/photoview/PhotoView;", "setPhotoView", "(Lcom/github/chrisbanes/photoview/PhotoView;)V", "getLayoutRes", "", "initUiAndData", "", "onBackPressed", "Companion", "vector_appDebug"})
public final class VectorAvatarViewerActivity extends ms.messageapp.activity.MXCActionBarActivity {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.avatar_viewer_image)
    public com.github.chrisbanes.photoview.PhotoView photoView;
    private static final java.lang.String EXTRA_AVATAR_URL = "EXTRA_AVATAR_URL";
    public static final ms.messageapp.activity.VectorAvatarViewerActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.chrisbanes.photoview.PhotoView getPhotoView() {
        return null;
    }
    
    public final void setPhotoView(@org.jetbrains.annotations.NotNull()
    com.github.chrisbanes.photoview.PhotoView p0) {
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public VectorAvatarViewerActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lms/messageapp/activity/VectorAvatarViewerActivity$Companion;", "", "()V", "EXTRA_AVATAR_URL", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "matrixId", "avatarUrl", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String matrixId, @org.jetbrains.annotations.NotNull()
        java.lang.String avatarUrl) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}