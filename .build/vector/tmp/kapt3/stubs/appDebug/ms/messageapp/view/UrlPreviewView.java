package ms.messageapp.view;

import android.content.Context;
import android.support.transition.TransitionManager;
import android.support.v7.preference.PreferenceManager;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ms.messageapp.R;
import ms.messageapp.VectorApp;
import ms.messageapp.ui.animation.VectorTransitionSet;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.rest.model.URLPreview;
import org.matrix.androidsdk.util.Log;
import java.util.*;

/**
 * * View to display a UrlPreview object
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\r\u0010\u001c\u001a\u00020\u001dH\u0001\u00a2\u0006\u0002\b\u001eJ(\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u001bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lms/messageapp/view/UrlPreviewView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDescriptionTextView", "Landroid/widget/TextView;", "getMDescriptionTextView", "()Landroid/widget/TextView;", "setMDescriptionTextView", "(Landroid/widget/TextView;)V", "mImageView", "Landroid/widget/ImageView;", "getMImageView", "()Landroid/widget/ImageView;", "setMImageView", "(Landroid/widget/ImageView;)V", "mIsDismissed", "", "mTitleTextView", "getMTitleTextView", "setMTitleTextView", "mUID", "", "closeUrlPreview", "", "closeUrlPreview$vector_appDebug", "setUrlPreview", "session", "Lorg/matrix/androidsdk/MXSession;", "preview", "Lorg/matrix/androidsdk/rest/model/URLPreview;", "uid", "Companion", "vector_appDebug"})
public final class UrlPreviewView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.url_preview_image_view)
    public android.widget.ImageView mImageView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.url_preview_title_text_view)
    public android.widget.TextView mTitleTextView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.url_preview_description_text_view)
    public android.widget.TextView mDescriptionTextView;
    private boolean mIsDismissed;
    private java.lang.String mUID;
    private static final java.lang.String LOG_TAG = null;
    private static final kotlin.Lazy sDismissedUrlsPreviews$delegate = null;
    private static final java.lang.String DISMISSED_URL_PREVIEWS_PREF_KEY = "DISMISSED_URL_PREVIEWS_PREF_KEY";
    public static final ms.messageapp.view.UrlPreviewView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getMImageView() {
        return null;
    }
    
    public final void setMImageView(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMTitleTextView() {
        return null;
    }
    
    public final void setMTitleTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMDescriptionTextView() {
        return null;
    }
    
    public final void setMDescriptionTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    /**
     * * Set the URL preview.
     *     *
     *     * @param context the context
     *     * @param session the session
     *     * @param preview the url preview
     *     * @param uid     unique identifier of this preview
     */
    public final void setUrlPreview(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXSession session, @org.jetbrains.annotations.Nullable()
    org.matrix.androidsdk.rest.model.URLPreview preview, @org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
    }
    
    @butterknife.OnClick(value = {2131297257})
    public final void closeUrlPreview$vector_appDebug() {
    }
    
    public UrlPreviewView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public UrlPreviewView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public UrlPreviewView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u00040\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lms/messageapp/view/UrlPreviewView$Companion;", "", "()V", "DISMISSED_URL_PREVIEWS_PREF_KEY", "", "LOG_TAG", "kotlin.jvm.PlatformType", "sDismissedUrlsPreviews", "Ljava/util/HashSet;", "getSDismissedUrlsPreviews", "()Ljava/util/HashSet;", "sDismissedUrlsPreviews$delegate", "Lkotlin/Lazy;", "didUrlPreviewDismiss", "", "uid", "vector_appDebug"})
    public static final class Companion {
        
        private final java.util.HashSet<java.lang.String> getSDismissedUrlsPreviews() {
            return null;
        }
        
        /**
         * * Tells if the URL preview defines by uid has been dismissed.
         *         *
         *         * @param uid the url preview id
         *         * @return true if it has been dismissed
         */
        public final boolean didUrlPreviewDismiss(@org.jetbrains.annotations.NotNull()
        java.lang.String uid) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}