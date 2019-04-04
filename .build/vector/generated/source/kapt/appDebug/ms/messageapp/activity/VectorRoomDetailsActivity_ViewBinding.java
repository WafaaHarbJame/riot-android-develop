// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.view.View;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class VectorRoomDetailsActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private VectorRoomDetailsActivity target;

  @UiThread
  public VectorRoomDetailsActivity_ViewBinding(VectorRoomDetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VectorRoomDetailsActivity_ViewBinding(VectorRoomDetailsActivity target, View source) {
    super(target, source);

    this.target = target;

    target.mTabLayout = Utils.findRequiredViewAsType(source, R.id.tabLayout, "field 'mTabLayout'", TabLayout.class);
  }

  @Override
  public void unbind() {
    VectorRoomDetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTabLayout = null;

    super.unbind();
  }
}
