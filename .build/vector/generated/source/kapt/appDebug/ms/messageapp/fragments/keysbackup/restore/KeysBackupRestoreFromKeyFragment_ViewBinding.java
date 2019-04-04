// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments.keysbackup.restore;

import android.support.annotation.UiThread;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class KeysBackupRestoreFromKeyFragment_ViewBinding implements Unbinder {
  private KeysBackupRestoreFromKeyFragment target;

  private View view2131296747;

  private TextWatcher view2131296747TextWatcher;

  private View view2131296746;

  private View view2131296706;

  @UiThread
  public KeysBackupRestoreFromKeyFragment_ViewBinding(final KeysBackupRestoreFromKeyFragment target,
      View source) {
    this.target = target;

    View view;
    target.mKeyInputLayout = Utils.findRequiredViewAsType(source, R.id.keys_backup_key_enter_til, "field 'mKeyInputLayout'", TextInputLayout.class);
    view = Utils.findRequiredView(source, R.id.keys_restore_key_enter_edittext, "field 'mKeyTextEdit' and method 'onRestoreKeyTextEditChange'");
    target.mKeyTextEdit = Utils.castView(view, R.id.keys_restore_key_enter_edittext, "field 'mKeyTextEdit'", EditText.class);
    view2131296747 = view;
    view2131296747TextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        target.onRestoreKeyTextEditChange(Utils.<Editable>castParam(p0, "onTextChanged", 0, "onRestoreKeyTextEditChange", 0));
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
      }
    };
    ((TextView) view).addTextChangedListener(view2131296747TextWatcher);
    view = Utils.findRequiredView(source, R.id.keys_restore_button, "method 'onRestoreFromKey'");
    view2131296746 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRestoreFromKey();
      }
    });
    view = Utils.findRequiredView(source, R.id.keys_backup_import, "method 'onImport'");
    view2131296706 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onImport();
      }
    });
  }

  @Override
  public void unbind() {
    KeysBackupRestoreFromKeyFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mKeyInputLayout = null;
    target.mKeyTextEdit = null;

    ((TextView) view2131296747).removeTextChangedListener(view2131296747TextWatcher);
    view2131296747TextWatcher = null;
    view2131296747 = null;
    view2131296746.setOnClickListener(null);
    view2131296746 = null;
    view2131296706.setOnClickListener(null);
    view2131296706 = null;
  }
}
