package ms.messageapp.activity.policies;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.CompoundButton;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelClickListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.airbnb.epoxy.WrappedEpoxyModelClickListener;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import ms.messageapp.R;
import org.jetbrains.annotations.Nullable;

/**
 * Generated file. Do not modify! */
public class PolicyModel_ extends PolicyModel implements GeneratedModel<PolicyHolder>, PolicyModelBuilder {
  private OnModelBoundListener<PolicyModel_, PolicyHolder> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<PolicyModel_, PolicyHolder> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<PolicyModel_, PolicyHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<PolicyModel_, PolicyHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;

  public PolicyModel_() {
    super();
  }

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final PolicyHolder object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void handlePostBind(final PolicyHolder object, int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", position);
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public PolicyModel_ onBind(OnModelBoundListener<PolicyModel_, PolicyHolder> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(PolicyHolder object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public PolicyModel_ onUnbind(OnModelUnboundListener<PolicyModel_, PolicyHolder> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final PolicyHolder object) {
    if (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityStateChangedListener_epoxyGeneratedModel.onVisibilityStateChanged(this, object, visibilityState);
    }
    super.onVisibilityStateChanged(visibilityState, object);
  }

  /**
   * Register a listener that will be called when this model visibility state has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public PolicyModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<PolicyModel_, PolicyHolder> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final PolicyHolder object) {
    if (onModelVisibilityChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityChangedListener_epoxyGeneratedModel.onVisibilityChanged(this, object, percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth);
    }
    super.onVisibilityChanged(percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth, object);
  }

  /**
   * Register a listener that will be called when this model visibility has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public PolicyModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<PolicyModel_, PolicyHolder> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  public PolicyModel_ checked(boolean checked) {
    onMutation();
    super.setChecked(checked);
    return this;
  }

  public boolean checked() {
    return super.getChecked();
  }

  public PolicyModel_ title(@Nullable String title) {
    onMutation();
    super.setTitle(title);
    return this;
  }

  @Nullable
  public String title() {
    return super.getTitle();
  }

  public PolicyModel_ checkChangeListener(
      @Nullable CompoundButton.OnCheckedChangeListener checkChangeListener) {
    onMutation();
    super.setCheckChangeListener(checkChangeListener);
    return this;
  }

  @Nullable
  public CompoundButton.OnCheckedChangeListener checkChangeListener() {
    return super.getCheckChangeListener();
  }

  /**
   * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
  public PolicyModel_ clickListener(
      @Nullable final OnModelClickListener<PolicyModel_, PolicyHolder> clickListener) {
    onMutation();
    if (clickListener == null) {
      super.setClickListener(null);
    }
    else {
      super.setClickListener(new WrappedEpoxyModelClickListener(clickListener));
    }
    return this;
  }

  public PolicyModel_ clickListener(@Nullable View.OnClickListener clickListener) {
    onMutation();
    super.setClickListener(clickListener);
    return this;
  }

  @Nullable
  public View.OnClickListener clickListener() {
    return super.getClickListener();
  }

  @Override
  public PolicyModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public PolicyModel_ id(@android.support.annotation.Nullable Number... arg0) {
    super.id(arg0);
    return this;
  }

  @Override
  public PolicyModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public PolicyModel_ id(@android.support.annotation.Nullable CharSequence arg0) {
    super.id(arg0);
    return this;
  }

  @Override
  public PolicyModel_ id(@android.support.annotation.Nullable CharSequence arg0,
      @android.support.annotation.Nullable CharSequence... arg1) {
    super.id(arg0, arg1);
    return this;
  }

  @Override
  public PolicyModel_ id(@android.support.annotation.Nullable CharSequence arg0, long arg1) {
    super.id(arg0, arg1);
    return this;
  }

  @Override
  public PolicyModel_ layout(@LayoutRes int arg0) {
    super.layout(arg0);
    return this;
  }

  @Override
  public PolicyModel_ spanSizeOverride(
      @android.support.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback arg0) {
    super.spanSizeOverride(arg0);
    return this;
  }

  @Override
  public PolicyModel_ show() {
    super.show();
    return this;
  }

  @Override
  public PolicyModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public PolicyModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  protected PolicyHolder createNewHolder() {
    return new PolicyHolder();
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    return R.layout.adapter_item_policy;
  }

  @Override
  public PolicyModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    super.setChecked(false);
    super.setTitle(null);
    super.setCheckChangeListener(null);
    super.setClickListener(null);
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof PolicyModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    PolicyModel_ that = (PolicyModel_) o;
    if (((onModelBoundListener_epoxyGeneratedModel == null) != (that.onModelBoundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelUnboundListener_epoxyGeneratedModel == null) != (that.onModelUnboundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if ((getChecked() != that.getChecked())) {
      return false;
    }
    if ((getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null)) {
      return false;
    }
    if (((getCheckChangeListener() == null) != (that.getCheckChangeListener() == null))) {
      return false;
    }
    if (((getClickListener() == null) != (that.getClickListener() == null))) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (getChecked() ? 1 : 0);
    result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
    result = 31 * result + (getCheckChangeListener() != null ? 1 : 0);
    result = 31 * result + (getClickListener() != null ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "PolicyModel_{" +
        "checked=" + getChecked() +
        ", title=" + getTitle() +
        ", checkChangeListener=" + getCheckChangeListener() +
        ", clickListener=" + getClickListener() +
        "}" + super.toString();
  }
}
