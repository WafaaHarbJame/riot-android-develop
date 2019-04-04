package ms.messageapp.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.transition.TransitionManager;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.binaryfork.spanny.Spanny;
import ms.messageapp.R;
import ms.messageapp.features.hhs.ResourceLimitErrorFormatter;
import ms.messageapp.listeners.IMessagesAdapterActionsListener;
import ms.messageapp.ui.animation.VectorTransitionSet;
import ms.messageapp.ui.themes.ThemeUtils;
import ms.messageapp.util.MatrixURLSpan;
import org.matrix.androidsdk.MXPatterns;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.rest.model.RoomTombstoneContent;
import org.matrix.androidsdk.util.Log;
import org.matrix.androidsdk.util.PermalinkUtils;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"LOG_TAG", "", "vector_appDebug"})
public final class NotificationAreaViewKt {
    private static final java.lang.String LOG_TAG = "NotificationAreaView";
}