package ms.messageapp.listeners;

import java.lang.System;

/**
 * * Simple interface with yes() and no() methods
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lms/messageapp/listeners/YesNoListener;", "", "no", "", "yes", "vector_appDebug"})
public abstract interface YesNoListener {
    
    public abstract void yes();
    
    public abstract void no();
}