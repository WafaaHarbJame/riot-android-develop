// Generated code from Butter Knife. Do not modify!
package ms.messageapp.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;

public class FavouritesFragment_ViewBinding implements Unbinder {
  private FavouritesFragment target;

  @UiThread
  public FavouritesFragment_ViewBinding(FavouritesFragment target, View source) {
    this.target = target;

    target.mFavoritesRecyclerView = Utils.findRequiredViewAsType(source, R.id.favorites_recycler_view, "field 'mFavoritesRecyclerView'", RecyclerView.class);
    target.mFavoritesPlaceHolder = Utils.findRequiredViewAsType(source, R.id.favorites_placeholder, "field 'mFavoritesPlaceHolder'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FavouritesFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFavoritesRecyclerView = null;
    target.mFavoritesPlaceHolder = null;
  }
}
