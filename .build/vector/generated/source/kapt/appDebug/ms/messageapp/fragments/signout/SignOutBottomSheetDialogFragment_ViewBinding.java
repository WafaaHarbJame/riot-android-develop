// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments.signout;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class SignOutBottomSheetDialogFragment_ViewBinding implements Unbinder {
  private SignOutBottomSheetDialogFragment target;

  @UiThread
  public SignOutBottomSheetDialogFragment_ViewBinding(SignOutBottomSheetDialogFragment target,
      View source) {
    this.target = target;

    target.sheetTitle = Utils.findRequiredViewAsType(source, R.id.bottom_sheet_signout_warning_text, "field 'sheetTitle'", TextView.class);
    target.backingUpStatusGroup = Utils.findRequiredViewAsType(source, R.id.bottom_sheet_signout_backingup_status_group, "field 'backingUpStatusGroup'", ViewGroup.class);
    target.setupClickableView = Utils.findRequiredView(source, R.id.keys_backup_setup, "field 'setupClickableView'");
    target.activateClickableView = Utils.findRequiredView(source, R.id.keys_backup_activate, "field 'activateClickableView'");
    target.dontWantClickableView = Utils.findRequiredView(source, R.id.keys_backup_dont_want, "field 'dontWantClickableView'");
    target.backupProgress = Utils.findRequiredViewAsType(source, R.id.bottom_sheet_signout_icon_progress_bar, "field 'backupProgress'", ProgressBar.class);
    target.backupCompleteImage = Utils.findRequiredViewAsType(source, R.id.bottom_sheet_signout_icon, "field 'backupCompleteImage'", ImageView.class);
    target.backupStatusTex = Utils.findRequiredViewAsType(source, R.id.bottom_sheet_backup_status_text, "field 'backupStatusTex'", TextView.class);
    target.signoutClickableView = Utils.findRequiredView(source, R.id.bottom_sheet_signout_button, "field 'signoutClickableView'");
    target.rootLayout = Utils.findRequiredViewAsType(source, R.id.root_layout, "field 'rootLayout'", ViewGroup.class);
  }

  @Override
  public void unbind() {
    SignOutBottomSheetDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.sheetTitle = null;
    target.backingUpStatusGroup = null;
    target.setupClickableView = null;
    target.activateClickableView = null;
    target.dontWantClickableView = null;
    target.backupProgress = null;
    target.backupCompleteImage = null;
    target.backupStatusTex = null;
    target.signoutClickableView = null;
    target.rootLayout = null;
  }
}
