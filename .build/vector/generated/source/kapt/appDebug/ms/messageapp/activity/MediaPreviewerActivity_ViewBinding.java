// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class MediaPreviewerActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private MediaPreviewerActivity target;

  private View view2131296836;

  @UiThread
  public MediaPreviewerActivity_ViewBinding(MediaPreviewerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MediaPreviewerActivity_ViewBinding(final MediaPreviewerActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.mPreviewerImageView = Utils.findRequiredViewAsType(source, R.id.media_previewer_image_view, "field 'mPreviewerImageView'", ImageView.class);
    target.mPreviewerVideoView = Utils.findRequiredViewAsType(source, R.id.media_previewer_video_view, "field 'mPreviewerVideoView'", VideoView.class);
    target.mPreviewerVideoThumbnail = Utils.findRequiredViewAsType(source, R.id.media_previewer_video_thumbnail, "field 'mPreviewerVideoThumbnail'", ImageView.class);
    target.mPreviewerRecyclerView = Utils.findRequiredViewAsType(source, R.id.media_previewer_list, "field 'mPreviewerRecyclerView'", RecyclerView.class);
    target.mFileNameView = Utils.findRequiredViewAsType(source, R.id.media_previewer_file_name, "field 'mFileNameView'", TextView.class);
    target.mPlayCircleView = Utils.findRequiredViewAsType(source, R.id.media_previewer_video_play, "field 'mPlayCircleView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.media_previewer_send_button, "method 'onClick'");
    view2131296836 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
  }

  @Override
  public void unbind() {
    MediaPreviewerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPreviewerImageView = null;
    target.mPreviewerVideoView = null;
    target.mPreviewerVideoThumbnail = null;
    target.mPreviewerRecyclerView = null;
    target.mFileNameView = null;
    target.mPlayCircleView = null;

    view2131296836.setOnClickListener(null);
    view2131296836 = null;

    super.unbind();
  }
}
