// Generated code from Butter Knife. Do not modify!
package ms.messageapp.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class PeopleAdapter$ContactViewHolder_ViewBinding implements Unbinder {
  private PeopleAdapter.ContactViewHolder target;

  @UiThread
  public PeopleAdapter$ContactViewHolder_ViewBinding(PeopleAdapter.ContactViewHolder target,
      View source) {
    this.target = target;

    target.vContactAvatar = Utils.findRequiredViewAsType(source, R.id.adapter_item_contact_avatar, "field 'vContactAvatar'", ImageView.class);
    target.vContactBadge = Utils.findRequiredViewAsType(source, R.id.contact_badge, "field 'vContactBadge'", ImageView.class);
    target.vContactName = Utils.findRequiredViewAsType(source, R.id.contact_name, "field 'vContactName'", TextView.class);
    target.vContactDesc = Utils.findRequiredViewAsType(source, R.id.contact_desc, "field 'vContactDesc'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PeopleAdapter.ContactViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vContactAvatar = null;
    target.vContactBadge = null;
    target.vContactName = null;
    target.vContactDesc = null;
  }
}
