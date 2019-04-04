// Generated code from Butter Knife. Do not modify!
package ms.messageapp.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class MediaPreviewAdapter$MediaItemViewHolder_ViewBinding implements Unbinder {
  private MediaPreviewAdapter.MediaItemViewHolder target;

  @UiThread
  public MediaPreviewAdapter$MediaItemViewHolder_ViewBinding(
      MediaPreviewAdapter.MediaItemViewHolder target, View source) {
    this.target = target;

    target.mImagePreview = Utils.findRequiredViewAsType(source, R.id.image_preview, "field 'mImagePreview'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MediaPreviewAdapter.MediaItemViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mImagePreview = null;
  }
}
