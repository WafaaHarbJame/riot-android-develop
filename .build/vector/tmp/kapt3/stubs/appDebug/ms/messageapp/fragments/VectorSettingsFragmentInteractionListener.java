package ms.messageapp.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lms/messageapp/fragments/VectorSettingsFragmentInteractionListener;", "", "requestHighlightPreferenceKeyOnResume", "", "key", "", "requestedKeyToHighlight", "vector_appDebug"})
public abstract interface VectorSettingsFragmentInteractionListener {
    
    public abstract void requestHighlightPreferenceKeyOnResume(@org.jetbrains.annotations.Nullable()
    java.lang.String key);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String requestedKeyToHighlight();
}