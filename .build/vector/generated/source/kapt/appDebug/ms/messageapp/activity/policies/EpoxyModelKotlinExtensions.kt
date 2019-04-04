@file:Suppress("DEPRECATION")

package ms.messageapp.activity.policies

import com.airbnb.epoxy.EpoxyController
import kotlin.Suppress
import kotlin.Unit

inline fun EpoxyController.policy(modelInitializer: PolicyModelBuilder.() -> Unit) {
    PolicyModel_().apply  {
        modelInitializer()
    }
    .addTo(this)
}
