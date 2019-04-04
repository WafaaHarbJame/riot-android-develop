// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class DeactivateAccountActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private DeactivateAccountActivity target;

  private View view2131296448;

  private View view2131296447;

  @UiThread
  public DeactivateAccountActivity_ViewBinding(DeactivateAccountActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DeactivateAccountActivity_ViewBinding(final DeactivateAccountActivity target,
      View source) {
    super(target, source);

    this.target = target;

    View view;
    target.eraseCheckBox = Utils.findRequiredViewAsType(source, R.id.deactivate_account_erase_checkbox, "field 'eraseCheckBox'", CheckBox.class);
    target.passwordEditText = Utils.findRequiredViewAsType(source, R.id.deactivate_account_password, "field 'passwordEditText'", EditText.class);
    view = Utils.findRequiredView(source, R.id.deactivate_account_button_submit, "method 'onSubmit$vector_appDebug'");
    view2131296448 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSubmit$vector_appDebug();
      }
    });
    view = Utils.findRequiredView(source, R.id.deactivate_account_button_cancel, "method 'onCancel$vector_appDebug'");
    view2131296447 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCancel$vector_appDebug();
      }
    });
  }

  @Override
  public void unbind() {
    DeactivateAccountActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.eraseCheckBox = null;
    target.passwordEditText = null;

    view2131296448.setOnClickListener(null);
    view2131296448 = null;
    view2131296447.setOnClickListener(null);
    view2131296447 = null;

    super.unbind();
  }
}
