// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.TextView;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public final class HistoricalRoomsActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private HistoricalRoomsActivity target;

  @UiThread
  public HistoricalRoomsActivity_ViewBinding(HistoricalRoomsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HistoricalRoomsActivity_ViewBinding(HistoricalRoomsActivity target, View source) {
    super(target, source);

    this.target = target;

    target.mSearchView = Utils.findRequiredViewAsType(source, R.id.historical_search_view, "field 'mSearchView'", SearchView.class);
    target.mHistoricalRecyclerView = Utils.findRequiredViewAsType(source, R.id.historical_recycler_view, "field 'mHistoricalRecyclerView'", RecyclerView.class);
    target.mHistoricalPlaceHolder = Utils.findRequiredViewAsType(source, R.id.historical_no_results, "field 'mHistoricalPlaceHolder'", TextView.class);
  }

  @Override
  public void unbind() {
    HistoricalRoomsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSearchView = null;
    target.mHistoricalRecyclerView = null;
    target.mHistoricalPlaceHolder = null;

    super.unbind();
  }
}
