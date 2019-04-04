package ms.messageapp.activity.policies;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.CompoundButton;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelClickListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.String;
import org.jetbrains.annotations.Nullable;

public interface PolicyModelBuilder {
  PolicyModelBuilder onBind(OnModelBoundListener<PolicyModel_, PolicyHolder> listener);

  PolicyModelBuilder onUnbind(OnModelUnboundListener<PolicyModel_, PolicyHolder> listener);

  PolicyModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<PolicyModel_, PolicyHolder> listener);

  PolicyModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<PolicyModel_, PolicyHolder> listener);

  PolicyModelBuilder checked(boolean checked);

  PolicyModelBuilder title(@Nullable String title);

  PolicyModelBuilder checkChangeListener(
      @Nullable CompoundButton.OnCheckedChangeListener checkChangeListener);

  PolicyModelBuilder clickListener(
      @Nullable final OnModelClickListener<PolicyModel_, PolicyHolder> clickListener);

  PolicyModelBuilder clickListener(@Nullable View.OnClickListener clickListener);

  PolicyModelBuilder id(long id);

  PolicyModelBuilder id(@android.support.annotation.Nullable Number... arg0);

  PolicyModelBuilder id(long id1, long id2);

  PolicyModelBuilder id(@android.support.annotation.Nullable CharSequence arg0);

  PolicyModelBuilder id(@android.support.annotation.Nullable CharSequence arg0,
      @android.support.annotation.Nullable CharSequence... arg1);

  PolicyModelBuilder id(@android.support.annotation.Nullable CharSequence arg0, long arg1);

  PolicyModelBuilder layout(@LayoutRes int arg0);

  PolicyModelBuilder spanSizeOverride(
      @android.support.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback arg0);
}
