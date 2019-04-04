// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class VectorRoomDetailsMembersFragment_ViewBinding implements Unbinder {
  private VectorRoomDetailsMembersFragment target;

  @UiThread
  public VectorRoomDetailsMembersFragment_ViewBinding(VectorRoomDetailsMembersFragment target,
      View source) {
    this.target = target;

    target.mProgressView = Utils.findRequiredView(source, R.id.add_participants_progress_view, "field 'mProgressView'");
    target.mParticipantsListView = Utils.findRequiredViewAsType(source, R.id.room_details_members_exp_list_view, "field 'mParticipantsListView'", ExpandableListView.class);
    target.mPatternToSearchEditText = Utils.findRequiredViewAsType(source, R.id.search_value_edit_text, "field 'mPatternToSearchEditText'", EditText.class);
    target.mSearchNoResultTextView = Utils.findRequiredViewAsType(source, R.id.search_no_results_text_view, "field 'mSearchNoResultTextView'", TextView.class);
    target.mClearSearchImageView = Utils.findRequiredViewAsType(source, R.id.clear_search_icon_image_view, "field 'mClearSearchImageView'", ImageView.class);
    target.mAddMembersFloatingActionButton = Utils.findRequiredView(source, R.id.add_participants_create_view, "field 'mAddMembersFloatingActionButton'");
  }

  @Override
  @CallSuper
  public void unbind() {
    VectorRoomDetailsMembersFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mProgressView = null;
    target.mParticipantsListView = null;
    target.mPatternToSearchEditText = null;
    target.mSearchNoResultTextView = null;
    target.mClearSearchImageView = null;
    target.mAddMembersFloatingActionButton = null;
  }
}
