// Generated code from Butter Knife. Do not modify!
package ms.messageapp.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class VectorMemberDetailsDevicesAdapter$MemberDetailsDevicesViewHolder_ViewBinding implements Unbinder {
  private VectorMemberDetailsDevicesAdapter.MemberDetailsDevicesViewHolder target;

  @UiThread
  public VectorMemberDetailsDevicesAdapter$MemberDetailsDevicesViewHolder_ViewBinding(
      VectorMemberDetailsDevicesAdapter.MemberDetailsDevicesViewHolder target, View source) {
    this.target = target;

    target.buttonVerify = Utils.findRequiredViewAsType(source, R.id.button_verify, "field 'buttonVerify'", Button.class);
    target.buttonBlock = Utils.findRequiredViewAsType(source, R.id.button_block, "field 'buttonBlock'", Button.class);
    target.deviceNameTextView = Utils.findRequiredViewAsType(source, R.id.device_name, "field 'deviceNameTextView'", TextView.class);
    target.deviceIdTextView = Utils.findRequiredViewAsType(source, R.id.device_id, "field 'deviceIdTextView'", TextView.class);
    target.e2eIconView = Utils.findRequiredViewAsType(source, R.id.device_e2e_icon, "field 'e2eIconView'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VectorMemberDetailsDevicesAdapter.MemberDetailsDevicesViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.buttonVerify = null;
    target.buttonBlock = null;
    target.deviceNameTextView = null;
    target.deviceIdTextView = null;
    target.e2eIconView = null;
  }
}
