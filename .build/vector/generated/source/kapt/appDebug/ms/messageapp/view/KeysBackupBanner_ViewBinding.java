// Generated code from Butter Knife. Do not modify!
package ms.messageapp.view;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class KeysBackupBanner_ViewBinding implements Unbinder {
  private KeysBackupBanner target;

  private View view2131297269;

  @UiThread
  public KeysBackupBanner_ViewBinding(KeysBackupBanner target) {
    this(target, target);
  }

  @UiThread
  public KeysBackupBanner_ViewBinding(final KeysBackupBanner target, View source) {
    this.target = target;

    View view;
    target.textView1 = Utils.findRequiredViewAsType(source, R.id.view_keys_backup_banner_text_1, "field 'textView1'", TextView.class);
    target.textView2 = Utils.findRequiredViewAsType(source, R.id.view_keys_backup_banner_text_2, "field 'textView2'", TextView.class);
    target.close = Utils.findRequiredView(source, R.id.view_keys_backup_banner_close_group, "field 'close'");
    target.loading = Utils.findRequiredView(source, R.id.view_keys_backup_banner_loading, "field 'loading'");
    view = Utils.findRequiredView(source, R.id.view_keys_backup_banner_close, "method 'onCloseClicked$vector_appDebug'");
    view2131297269 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCloseClicked$vector_appDebug();
      }
    });
  }

  @Override
  public void unbind() {
    KeysBackupBanner target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textView1 = null;
    target.textView2 = null;
    target.close = null;
    target.loading = null;

    view2131297269.setOnClickListener(null);
    view2131297269 = null;
  }
}
