// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class NotificationPrivacyActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private NotificationPrivacyActivity target;

  private View view2131297018;

  private View view2131297017;

  private View view2131297020;

  @UiThread
  public NotificationPrivacyActivity_ViewBinding(NotificationPrivacyActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NotificationPrivacyActivity_ViewBinding(final NotificationPrivacyActivity target,
      View source) {
    super(target, source);

    this.target = target;

    View view;
    target.tvNeedPermission = Utils.findRequiredViewAsType(source, R.id.tv_apps_needs_permission, "field 'tvNeedPermission'", TextView.class);
    target.tvNoPermission = Utils.findRequiredViewAsType(source, R.id.tv_apps_no_permission, "field 'tvNoPermission'", TextView.class);
    target.rbPrivacyNormal = Utils.findRequiredViewAsType(source, R.id.rb_normal_notification_privacy, "field 'rbPrivacyNormal'", RadioButton.class);
    target.rbPrivacyLowDetail = Utils.findRequiredViewAsType(source, R.id.rb_notification_low_detail, "field 'rbPrivacyLowDetail'", RadioButton.class);
    target.rbPrivacyReduced = Utils.findRequiredViewAsType(source, R.id.rb_notification_reduce_privacy, "field 'rbPrivacyReduced'", RadioButton.class);
    view = Utils.findRequiredView(source, R.id.rly_normal_notification_privacy, "method 'onNormalClick'");
    view2131297018 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onNormalClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.rly_low_detail_notifications, "method 'onLowDetailClick'");
    view2131297017 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLowDetailClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.rly_reduced_privacy_notifications, "method 'onReducedPrivacyClick'");
    view2131297020 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onReducedPrivacyClick();
      }
    });
  }

  @Override
  public void unbind() {
    NotificationPrivacyActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvNeedPermission = null;
    target.tvNoPermission = null;
    target.rbPrivacyNormal = null;
    target.rbPrivacyLowDetail = null;
    target.rbPrivacyReduced = null;

    view2131297018.setOnClickListener(null);
    view2131297018 = null;
    view2131297017.setOnClickListener(null);
    view2131297017 = null;
    view2131297020.setOnClickListener(null);
    view2131297020 = null;

    super.unbind();
  }
}
