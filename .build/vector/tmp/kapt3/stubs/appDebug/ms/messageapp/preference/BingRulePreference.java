package ms.messageapp.preference;

import android.content.Context;
import android.support.v7.preference.PreferenceViewHolder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import ms.messageapp.R;
import org.matrix.androidsdk.rest.model.bingrules.BingRule;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\tJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\fR\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lms/messageapp/preference/BingRulePreference;", "Lms/messageapp/preference/VectorPreference;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Lorg/matrix/androidsdk/rest/model/bingrules/BingRule;", "rule", "getRule", "()Lorg/matrix/androidsdk/rest/model/bingrules/BingRule;", "ruleStatusIndex", "getRuleStatusIndex", "()I", "createRule", "index", "onBindViewHolder", "", "holder", "Landroid/support/v7/preference/PreferenceViewHolder;", "refreshSummary", "setBingRule", "aBingRule", "Companion", "vector_appDebug"})
public final class BingRulePreference extends ms.messageapp.preference.VectorPreference {
    
    /**
     * * @return the selected bing rule
     */
    @org.jetbrains.annotations.Nullable()
    private org.matrix.androidsdk.rest.model.bingrules.BingRule rule;
    private static final int NOTIFICATION_OFF_INDEX = 0;
    private static final int NOTIFICATION_SILENT_INDEX = 1;
    private static final int NOTIFICATION_NOISY_INDEX = 2;
    public static final ms.messageapp.preference.BingRulePreference.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final org.matrix.androidsdk.rest.model.bingrules.BingRule getRule() {
        return null;
    }
    
    public final int getRuleStatusIndex() {
        return 0;
    }
    
    /**
     * * Update the bing rule.
     *     *
     *     * @param aBingRule
     */
    public final void setBingRule(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.rest.model.bingrules.BingRule aBingRule) {
    }
    
    /**
     * * Refresh the summary
     */
    private final void refreshSummary() {
    }
    
    /**
     * * Create a bing rule with the updated required at index.
     *     *
     *     * @param index index
     *     * @return a bing rule with the updated flags / null if there is no update
     */
    @org.jetbrains.annotations.Nullable()
    public final org.matrix.androidsdk.rest.model.bingrules.BingRule createRule(int index) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.preference.PreferenceViewHolder holder) {
    }
    
    public BingRulePreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public BingRulePreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public BingRulePreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lms/messageapp/preference/BingRulePreference$Companion;", "", "()V", "NOTIFICATION_NOISY_INDEX", "", "NOTIFICATION_OFF_INDEX", "NOTIFICATION_SILENT_INDEX", "vector_appDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}