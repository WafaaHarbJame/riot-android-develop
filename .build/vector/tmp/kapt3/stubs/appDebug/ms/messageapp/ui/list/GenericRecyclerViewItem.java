package ms.messageapp.ui.list;

import android.support.annotation.DrawableRes;

/**
 * * A generic list item.
 * * Displays an item with a title, and optional description.
 * * Can display an accessory on the right, that can be an image or an indeterminate progress.
 * * If provided with an action, will display a button at the bottom of the list item.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002$%B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000f\u00a8\u0006&"}, d2 = {"Lms/messageapp/ui/list/GenericRecyclerViewItem;", "", "title", "", "description", "style", "Lms/messageapp/ui/list/GenericRecyclerViewItem$STYLE;", "(Ljava/lang/String;Ljava/lang/String;Lms/messageapp/ui/list/GenericRecyclerViewItem$STYLE;)V", "buttonAction", "Lms/messageapp/ui/list/GenericRecyclerViewItem$Action;", "getButtonAction", "()Lms/messageapp/ui/list/GenericRecyclerViewItem$Action;", "setButtonAction", "(Lms/messageapp/ui/list/GenericRecyclerViewItem$Action;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "endIconResourceId", "", "getEndIconResourceId", "()I", "setEndIconResourceId", "(I)V", "hasIndeterminateProcess", "", "getHasIndeterminateProcess", "()Z", "setHasIndeterminateProcess", "(Z)V", "itemClickAction", "getItemClickAction", "setItemClickAction", "getStyle", "()Lms/messageapp/ui/list/GenericRecyclerViewItem$STYLE;", "getTitle", "Action", "STYLE", "vector_appDebug"})
public final class GenericRecyclerViewItem {
    @android.support.annotation.DrawableRes()
    private int endIconResourceId;
    private boolean hasIndeterminateProcess;
    @org.jetbrains.annotations.Nullable()
    private ms.messageapp.ui.list.GenericRecyclerViewItem.Action buttonAction;
    @org.jetbrains.annotations.Nullable()
    private ms.messageapp.ui.list.GenericRecyclerViewItem.Action itemClickAction;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    private final ms.messageapp.ui.list.GenericRecyclerViewItem.STYLE style = null;
    
    public final int getEndIconResourceId() {
        return 0;
    }
    
    public final void setEndIconResourceId(int p0) {
    }
    
    public final boolean getHasIndeterminateProcess() {
        return false;
    }
    
    public final void setHasIndeterminateProcess(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ms.messageapp.ui.list.GenericRecyclerViewItem.Action getButtonAction() {
        return null;
    }
    
    public final void setButtonAction(@org.jetbrains.annotations.Nullable()
    ms.messageapp.ui.list.GenericRecyclerViewItem.Action p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ms.messageapp.ui.list.GenericRecyclerViewItem.Action getItemClickAction() {
        return null;
    }
    
    public final void setItemClickAction(@org.jetbrains.annotations.Nullable()
    ms.messageapp.ui.list.GenericRecyclerViewItem.Action p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.ui.list.GenericRecyclerViewItem.STYLE getStyle() {
        return null;
    }
    
    public GenericRecyclerViewItem(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    ms.messageapp.ui.list.GenericRecyclerViewItem.STYLE style) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lms/messageapp/ui/list/GenericRecyclerViewItem$STYLE;", "", "(Ljava/lang/String;I)V", "BIG_TEXT", "NORMAL_TEXT", "vector_appDebug"})
    public static enum STYLE {
        /*public static final*/ BIG_TEXT /* = new BIG_TEXT() */,
        /*public static final*/ NORMAL_TEXT /* = new NORMAL_TEXT() */;
        
        STYLE() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lms/messageapp/ui/list/GenericRecyclerViewItem$Action;", "", "title", "", "(Ljava/lang/String;)V", "perform", "Ljava/lang/Runnable;", "getPerform", "()Ljava/lang/Runnable;", "setPerform", "(Ljava/lang/Runnable;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "vector_appDebug"})
    public static final class Action {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Runnable perform;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String title;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Runnable getPerform() {
            return null;
        }
        
        public final void setPerform(@org.jetbrains.annotations.Nullable()
        java.lang.Runnable p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public Action(@org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            super();
        }
    }
}