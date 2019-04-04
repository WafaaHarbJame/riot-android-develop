// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class VectorAppCompatActivity_ViewBinding implements Unbinder {
  private VectorAppCompatActivity target;

  @UiThread
  public VectorAppCompatActivity_ViewBinding(VectorAppCompatActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VectorAppCompatActivity_ViewBinding(VectorAppCompatActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findOptionalViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VectorAppCompatActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
  }
}
