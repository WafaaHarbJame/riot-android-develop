/*
 * Copyright 2018 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ms.messageapp.activity.policies

import org.matrix.androidsdk.rest.model.login.LocalizedFlowDataLoginTerms

data class AccountCreationTermsViewState(
        val localizedFlowDataLoginTermsChecked: List<LocalizedFlowDataLoginTermsChecked>
) {
    fun check(data: LocalizedFlowDataLoginTerms) {
        localizedFlowDataLoginTermsChecked.find { it.localizedFlowDataLoginTerms == data }?.checked = true
    }

    fun uncheck(data: LocalizedFlowDataLoginTerms) {
        localizedFlowDataLoginTermsChecked.find { it.localizedFlowDataLoginTerms == data }?.checked = false
    }

    fun allChecked(): Boolean {
        localizedFlowDataLoginTermsChecked.forEach {
            if (!it.checked) {
                return false
            }
        }

        // Ok
        return true
    }
}