// Generated code from Butter Knife. Do not modify!
package ms.messageapp.adapters;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class VectorReadReceiptsAdapter$ReadReceiptViewHolder_ViewBinding implements Unbinder {
  private VectorReadReceiptsAdapter.ReadReceiptViewHolder target;

  @UiThread
  public VectorReadReceiptsAdapter$ReadReceiptViewHolder_ViewBinding(
      VectorReadReceiptsAdapter.ReadReceiptViewHolder target, View source) {
    this.target = target;

    target.imageView = Utils.findRequiredViewAsType(source, R.id.read_receipt_user_avatar, "field 'imageView'", ImageView.class);
    target.userNameTextView = Utils.findRequiredViewAsType(source, R.id.read_receipt_user_name, "field 'userNameTextView'", TextView.class);
    target.tsTextView = Utils.findRequiredViewAsType(source, R.id.read_receipt_ts, "field 'tsTextView'", TextView.class);
  }

  @Override
  public void unbind() {
    VectorReadReceiptsAdapter.ReadReceiptViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
    target.userNameTextView = null;
    target.tsTextView = null;
  }
}
