package ms.messageapp.activity.policies;

import android.view.View;
import com.airbnb.epoxy.TypedEpoxyController;
import org.matrix.androidsdk.rest.model.login.LocalizedFlowDataLoginTerms;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lms/messageapp/activity/policies/PolicyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lms/messageapp/activity/policies/LocalizedFlowDataLoginTermsChecked;", "listener", "Lms/messageapp/activity/policies/PolicyController$PolicyControllerListener;", "(Lms/messageapp/activity/policies/PolicyController$PolicyControllerListener;)V", "getListener", "()Lms/messageapp/activity/policies/PolicyController$PolicyControllerListener;", "buildModels", "", "data", "PolicyControllerListener", "vector_appDebug"})
public final class PolicyController extends com.airbnb.epoxy.TypedEpoxyController<java.util.List<? extends ms.messageapp.activity.policies.LocalizedFlowDataLoginTermsChecked>> {
    @org.jetbrains.annotations.NotNull()
    private final ms.messageapp.activity.policies.PolicyController.PolicyControllerListener listener = null;
    
    @java.lang.Override()
    protected void buildModels(@org.jetbrains.annotations.NotNull()
    java.util.List<ms.messageapp.activity.policies.LocalizedFlowDataLoginTermsChecked> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.activity.policies.PolicyController.PolicyControllerListener getListener() {
        return null;
    }
    
    public PolicyController(@org.jetbrains.annotations.NotNull()
    ms.messageapp.activity.policies.PolicyController.PolicyControllerListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lms/messageapp/activity/policies/PolicyController$PolicyControllerListener;", "", "openPolicy", "", "localizedFlowDataLoginTerms", "Lorg/matrix/androidsdk/rest/model/login/LocalizedFlowDataLoginTerms;", "setChecked", "isChecked", "", "vector_appDebug"})
    public static abstract interface PolicyControllerListener {
        
        public abstract void setChecked(@org.jetbrains.annotations.NotNull()
        org.matrix.androidsdk.rest.model.login.LocalizedFlowDataLoginTerms localizedFlowDataLoginTerms, boolean isChecked);
        
        public abstract void openPolicy(@org.jetbrains.annotations.NotNull()
        org.matrix.androidsdk.rest.model.login.LocalizedFlowDataLoginTerms localizedFlowDataLoginTerms);
    }
}