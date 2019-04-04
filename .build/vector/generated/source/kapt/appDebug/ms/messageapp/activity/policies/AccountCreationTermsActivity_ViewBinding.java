// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity.policies;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.airbnb.epoxy.EpoxyRecyclerView;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;
import ms.messageapp.activity.VectorAppCompatActivity_ViewBinding;

public final class AccountCreationTermsActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private AccountCreationTermsActivity target;

  private View view2131296266;

  @UiThread
  public AccountCreationTermsActivity_ViewBinding(AccountCreationTermsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AccountCreationTermsActivity_ViewBinding(final AccountCreationTermsActivity target,
      View source) {
    super(target, source);

    this.target = target;

    View view;
    target.policyList = Utils.findRequiredViewAsType(source, R.id.account_creation_policy_list, "field 'policyList'", EpoxyRecyclerView.class);
    view = Utils.findRequiredView(source, R.id.account_creation_policy_button_accept, "field 'submitButton' and method 'submit$vector_appDebug'");
    target.submitButton = Utils.castView(view, R.id.account_creation_policy_button_accept, "field 'submitButton'", Button.class);
    view2131296266 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submit$vector_appDebug();
      }
    });
  }

  @Override
  public void unbind() {
    AccountCreationTermsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.policyList = null;
    target.submitButton = null;

    view2131296266.setOnClickListener(null);
    view2131296266 = null;

    super.unbind();
  }
}
