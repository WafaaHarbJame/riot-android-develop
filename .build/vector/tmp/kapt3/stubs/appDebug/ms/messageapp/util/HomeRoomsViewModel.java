package ms.messageapp.util;

import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.data.Room;
import org.matrix.androidsdk.data.RoomTag;
import org.matrix.androidsdk.util.Log;

/**
 * * This class is responsible for filtering and ranking rooms whenever there is a need to update in the context of the HomeScreens
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0006\u0010\u000e\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lms/messageapp/util/HomeRoomsViewModel;", "", "session", "Lorg/matrix/androidsdk/MXSession;", "(Lorg/matrix/androidsdk/MXSession;)V", "result", "Lms/messageapp/util/HomeRoomsViewModel$Result;", "getResult", "()Lms/messageapp/util/HomeRoomsViewModel$Result;", "setResult", "(Lms/messageapp/util/HomeRoomsViewModel$Result;)V", "getJoinedRooms", "", "Lorg/matrix/androidsdk/data/Room;", "update", "Result", "vector_appDebug"})
public final class HomeRoomsViewModel {
    
    /**
     * * The last result
     */
    @org.jetbrains.annotations.NotNull()
    private ms.messageapp.util.HomeRoomsViewModel.Result result;
    private final org.matrix.androidsdk.MXSession session = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.util.HomeRoomsViewModel.Result getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.NotNull()
    ms.messageapp.util.HomeRoomsViewModel.Result p0) {
    }
    
    /**
     * * The update method
     *     * This method should be called whenever the room data have changed
     */
    @org.jetbrains.annotations.NotNull()
    public final ms.messageapp.util.HomeRoomsViewModel.Result update() {
        return null;
    }
    
    private final java.util.List<org.matrix.androidsdk.data.Room> getJoinedRooms() {
        return null;
    }
    
    public HomeRoomsViewModel(@org.jetbrains.annotations.NotNull()
    org.matrix.androidsdk.MXSession session) {
        super();
    }
    
    /**
     * * A data class holding the result of filtering and ranking algorithm
     *     * A room can't be in multiple lists at the same time.
     *     * Order is favourites -> directChats -> otherRooms -> lowPriorities -> serverNotices
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003JY\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lms/messageapp/util/HomeRoomsViewModel$Result;", "", "favourites", "", "Lorg/matrix/androidsdk/data/Room;", "directChats", "otherRooms", "lowPriorities", "serverNotices", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDirectChats", "()Ljava/util/List;", "getFavourites", "getLowPriorities", "getOtherRooms", "getServerNotices", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "getDirectChatsWithFavorites", "getOtherRoomsWithFavorites", "hashCode", "", "toString", "", "vector_appDebug"})
    public static final class Result {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.matrix.androidsdk.data.Room> favourites = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.matrix.androidsdk.data.Room> directChats = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.matrix.androidsdk.data.Room> otherRooms = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.matrix.androidsdk.data.Room> lowPriorities = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.matrix.androidsdk.data.Room> serverNotices = null;
        
        /**
         * * Use this method when you need to get all the directChats, favorites included
         *         * Low Priorities are always excluded
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.matrix.androidsdk.data.Room> getDirectChatsWithFavorites() {
            return null;
        }
        
        /**
         * * Use this method when you need to get all the other rooms, favorites included
         *         * Low Priorities are always excluded
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.matrix.androidsdk.data.Room> getOtherRoomsWithFavorites() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.matrix.androidsdk.data.Room> getFavourites() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.matrix.androidsdk.data.Room> getDirectChats() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.matrix.androidsdk.data.Room> getOtherRooms() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.matrix.androidsdk.data.Room> getLowPriorities() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.matrix.androidsdk.data.Room> getServerNotices() {
            return null;
        }
        
        public Result(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.matrix.androidsdk.data.Room> favourites, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.matrix.androidsdk.data.Room> directChats, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.matrix.androidsdk.data.Room> otherRooms, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.matrix.androidsdk.data.Room> lowPriorities, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.matrix.androidsdk.data.Room> serverNotices) {
            super();
        }
        
        public Result() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.matrix.androidsdk.data.Room> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.matrix.androidsdk.data.Room> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.matrix.androidsdk.data.Room> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.matrix.androidsdk.data.Room> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.matrix.androidsdk.data.Room> component5() {
            return null;
        }
        
        /**
         * * A data class holding the result of filtering and ranking algorithm
         *     * A room can't be in multiple lists at the same time.
         *     * Order is favourites -> directChats -> otherRooms -> lowPriorities -> serverNotices
         */
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.util.HomeRoomsViewModel.Result copy(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.matrix.androidsdk.data.Room> favourites, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.matrix.androidsdk.data.Room> directChats, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.matrix.androidsdk.data.Room> otherRooms, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.matrix.androidsdk.data.Room> lowPriorities, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.matrix.androidsdk.data.Room> serverNotices) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}