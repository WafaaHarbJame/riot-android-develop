package ms.messageapp.activity.policies;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.widget.Button;
import butterknife.BindView;
import butterknife.OnClick;
import com.airbnb.epoxy.EpoxyRecyclerView;
import ms.messageapp.R;
import ms.messageapp.activity.VectorAppCompatActivity;
import ms.messageapp.activity.VectorWebViewActivity;
import ms.messageapp.ui.themes.ThemeUtils;
import ms.messageapp.webview.WebViewMode;
import org.matrix.androidsdk.rest.model.login.LocalizedFlowDataLoginTerms;

/**
 * * AccountCreationTermsActivity displays the list of policies the user has to accept
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\r\u0010 \u001a\u00020\u0018H\u0001\u00a2\u0006\u0002\b!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006#"}, d2 = {"Lms/messageapp/activity/policies/AccountCreationTermsActivity;", "Lms/messageapp/activity/VectorAppCompatActivity;", "Lms/messageapp/activity/policies/PolicyController$PolicyControllerListener;", "()V", "accountCreationTermsViewState", "Lms/messageapp/activity/policies/AccountCreationTermsViewState;", "policyController", "Lms/messageapp/activity/policies/PolicyController;", "policyList", "Lcom/airbnb/epoxy/EpoxyRecyclerView;", "getPolicyList", "()Lcom/airbnb/epoxy/EpoxyRecyclerView;", "setPolicyList", "(Lcom/airbnb/epoxy/EpoxyRecyclerView;)V", "submitButton", "Landroid/widget/Button;", "getSubmitButton", "()Landroid/widget/Button;", "setSubmitButton", "(Landroid/widget/Button;)V", "getLayoutRes", "", "getTitleRes", "initUiAndData", "", "openPolicy", "localizedFlowDataLoginTerms", "Lorg/matrix/androidsdk/rest/model/login/LocalizedFlowDataLoginTerms;", "renderState", "setChecked", "isChecked", "", "submit", "submit$vector_appDebug", "Companion", "vector_appDebug"})
public final class AccountCreationTermsActivity extends ms.messageapp.activity.VectorAppCompatActivity implements ms.messageapp.activity.policies.PolicyController.PolicyControllerListener {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.account_creation_policy_list)
    public com.airbnb.epoxy.EpoxyRecyclerView policyList;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = ms.messageapp.R.id.account_creation_policy_button_accept)
    public android.widget.Button submitButton;
    private ms.messageapp.activity.policies.AccountCreationTermsViewState accountCreationTermsViewState;
    private final ms.messageapp.activity.policies.PolicyController policyController = null;
    private static final java.lang.String DATA = "DATA";
    public static final ms.messageapp.activity.policies.AccountCreationTermsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.airbnb.epoxy.EpoxyRecyclerView getPolicyList() {
        return null;
    }
    
    public final void setPolicyList(@org.jetbrains.annotations.NotNull()
    com.airbnb.epoxy.EpoxyRecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getSubmitButton() {
        return null;
    }
    
    public final void setSubmitButton(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public int getTitleRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void initUiAndData() {
    }
    
    private final void renderState() {
    }
    
    @java.lang.Override()
    public void setChecked(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.rest.model.login.LocalizedFlowDataLoginTerms localizedFlowDataLoginTerms, boolean isChecked) {
    }
    
    @java.lang.Override()
    public void openPolicy(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.rest.model.login.LocalizedFlowDataLoginTerms localizedFlowDataLoginTerms) {
    }
    
    @butterknife.OnClick(value = {2131296266})
    public final void submit$vector_appDebug() {
    }
    
    public AccountCreationTermsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lms/messageapp/activity/policies/AccountCreationTermsActivity$Companion;", "", "()V", "DATA", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "list", "", "Lorg/matrix/androidsdk/rest/model/login/LocalizedFlowDataLoginTerms;", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.util.List<org.matrix.androidsdk.rest.model.login.LocalizedFlowDataLoginTerms> list) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}