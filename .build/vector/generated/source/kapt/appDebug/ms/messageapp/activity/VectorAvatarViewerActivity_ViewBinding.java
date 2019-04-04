// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.github.chrisbanes.photoview.PhotoView;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class VectorAvatarViewerActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private VectorAvatarViewerActivity target;

  @UiThread
  public VectorAvatarViewerActivity_ViewBinding(VectorAvatarViewerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VectorAvatarViewerActivity_ViewBinding(VectorAvatarViewerActivity target, View source) {
    super(target, source);

    this.target = target;

    target.photoView = Utils.findRequiredViewAsType(source, R.id.avatar_viewer_image, "field 'photoView'", PhotoView.class);
  }

  @Override
  public void unbind() {
    VectorAvatarViewerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.photoView = null;

    super.unbind();
  }
}
