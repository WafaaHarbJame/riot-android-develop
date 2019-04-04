// Generated code from Butter Knife. Do not modify!
package ms.messageapp.view;

import android.content.Context;
import android.support.annotation.UiThread;
import android.support.v4.content.ContextCompat;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class PasswordStrengthBar_ViewBinding implements Unbinder {
  private PasswordStrengthBar target;

  @UiThread
  public PasswordStrengthBar_ViewBinding(PasswordStrengthBar target) {
    this(target, target);
  }

  @UiThread
  public PasswordStrengthBar_ViewBinding(PasswordStrengthBar target, View source) {
    this.target = target;

    target.bar1 = Utils.findRequiredView(source, R.id.password_strength_bar_1, "field 'bar1'");
    target.bar2 = Utils.findRequiredView(source, R.id.password_strength_bar_2, "field 'bar2'");
    target.bar3 = Utils.findRequiredView(source, R.id.password_strength_bar_3, "field 'bar3'");
    target.bar4 = Utils.findRequiredView(source, R.id.password_strength_bar_4, "field 'bar4'");

    Context context = source.getContext();
    target.colorBackground = ContextCompat.getColor(context, R.color.password_strength_bar_undefined);
    target.colorWeak = ContextCompat.getColor(context, R.color.password_strength_bar_weak);
    target.colorLow = ContextCompat.getColor(context, R.color.password_strength_bar_low);
    target.colorOk = ContextCompat.getColor(context, R.color.password_strength_bar_ok);
    target.colorStrong = ContextCompat.getColor(context, R.color.password_strength_bar_strong);
  }

  @Override
  public void unbind() {
    PasswordStrengthBar target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.bar1 = null;
    target.bar2 = null;
    target.bar3 = null;
    target.bar4 = null;
  }
}
