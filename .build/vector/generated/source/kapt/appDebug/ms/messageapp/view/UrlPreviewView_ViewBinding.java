// Generated code from Butter Knife. Do not modify!
package ms.messageapp.view;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class UrlPreviewView_ViewBinding implements Unbinder {
  private UrlPreviewView target;

  private View view2131297257;

  @UiThread
  public UrlPreviewView_ViewBinding(UrlPreviewView target) {
    this(target, target);
  }

  @UiThread
  public UrlPreviewView_ViewBinding(final UrlPreviewView target, View source) {
    this.target = target;

    View view;
    target.mImageView = Utils.findRequiredViewAsType(source, R.id.url_preview_image_view, "field 'mImageView'", ImageView.class);
    target.mTitleTextView = Utils.findRequiredViewAsType(source, R.id.url_preview_title_text_view, "field 'mTitleTextView'", TextView.class);
    target.mDescriptionTextView = Utils.findRequiredViewAsType(source, R.id.url_preview_description_text_view, "field 'mDescriptionTextView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.url_preview_hide_image_view, "method 'closeUrlPreview$vector_appDebug'");
    view2131297257 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.closeUrlPreview$vector_appDebug();
      }
    });
  }

  @Override
  public void unbind() {
    UrlPreviewView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mImageView = null;
    target.mTitleTextView = null;
    target.mDescriptionTextView = null;

    view2131297257.setOnClickListener(null);
    view2131297257 = null;
  }
}
