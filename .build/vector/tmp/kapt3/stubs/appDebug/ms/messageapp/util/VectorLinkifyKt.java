package ms.messageapp.util;

import android.support.v4.text.util.LinkifyCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.widget.TextView;
import java.util.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0006*\u00020\nH\u0002\u001ao\u0010\u000b\u001a\u00020\u0006*\u00020\f2`\u0010\r\u001a\\\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u000eH\u0082\b\u001a\u0014\u0010\u0017\u001a\u00020\u0006*\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0019\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"COMPARATOR", "Ljava/util/Comparator;", "Lms/messageapp/util/LinkSpec;", "geoMatchFilter", "Landroid/text/util/Linkify$MatchFilter;", "pruneOverlaps", "", "links", "Ljava/util/ArrayList;", "addLinkMovementMethod", "Landroid/widget/TextView;", "forEachSpanIndexed", "Landroid/text/Spannable;", "action", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "index", "Landroid/text/style/URLSpan;", "urlSpan", "start", "end", "vectorCustomLinkify", "keepExistingUrlSpan", "", "vector_appDebug"})
public final class VectorLinkifyKt {
    private static final java.util.Comparator<ms.messageapp.util.LinkSpec> COMPARATOR = null;
    private static final android.text.util.Linkify.MatchFilter geoMatchFilter = null;
    
    /**
     * * Better support for auto link than the default implementation
     */
    public static final void vectorCustomLinkify(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, boolean keepExistingUrlSpan) {
    }
    
    private static final void pruneOverlaps(java.util.ArrayList<ms.messageapp.util.LinkSpec> links) {
    }
    
    private static final void forEachSpanIndexed(@org.jetbrains.annotations.NotNull()
    android.text.Spannable $receiver, kotlin.jvm.functions.Function4<? super java.lang.Integer, ? super android.text.style.URLSpan, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> action) {
    }
    
    private static final void addLinkMovementMethod(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver) {
    }
}