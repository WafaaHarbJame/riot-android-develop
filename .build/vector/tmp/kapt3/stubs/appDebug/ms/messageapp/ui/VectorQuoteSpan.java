package ms.messageapp.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineBackgroundSpan;
import ms.messageapp.R;

/**
 * * android.text.style.QuoteSpan hard-codes the strip color and gap.
 * * This class allow to customize color and size of the QuoteSpan
 * *
 * * Inspired from https://medium.com/@459631839/style-blockquotes-in-android-textviews-de8656057c3d
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J`\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0016Jh\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lms/messageapp/ui/VectorQuoteSpan;", "Landroid/text/style/LeadingMarginSpan;", "Landroid/text/style/LineBackgroundSpan;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "backgroundColor", "", "gap", "", "stripeColor", "stripeWidth", "drawBackground", "", "c", "Landroid/graphics/Canvas;", "p", "Landroid/graphics/Paint;", "left", "right", "top", "baseline", "bottom", "text", "", "start", "end", "lnum", "drawLeadingMargin", "x", "dir", "first", "", "layout", "Landroid/text/Layout;", "getLeadingMargin", "vector_appDebug"})
public final class VectorQuoteSpan implements android.text.style.LeadingMarginSpan, android.text.style.LineBackgroundSpan {
    private final int backgroundColor = 0;
    private final int stripeColor = 0;
    private final float stripeWidth = 0.0F;
    private final float gap = 0.0F;
    
    @java.lang.Override()
    public int getLeadingMargin(boolean first) {
        return 0;
    }
    
    @java.lang.Override()
    public void drawLeadingMargin(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    android.graphics.Paint p, int x, int dir, int top, int baseline, int bottom, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int start, int end, boolean first, @org.jetbrains.annotations.NotNull()
    android.text.Layout layout) {
    }
    
    @java.lang.Override()
    public void drawBackground(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    android.graphics.Paint p, int left, int right, int top, int baseline, int bottom, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int start, int end, int lnum) {
    }
    
    public VectorQuoteSpan(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}