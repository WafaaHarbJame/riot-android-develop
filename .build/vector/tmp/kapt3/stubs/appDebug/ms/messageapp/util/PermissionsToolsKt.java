package ms.messageapp.util;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.widget.Toast;
import ms.messageapp.R;
import ms.messageapp.contacts.ContactsManager;
import org.matrix.androidsdk.util.Log;
import java.util.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\u001a\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e\u001a \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u0005\u001a,\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010#\u001a\u00020\u0005H\u0002\u001a \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00052\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010#\u001a\u00020\u0005\u001a\u000e\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)\u001a\u0016\u0010*\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u001e\u001a\u0016\u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u001e\u001a4\u0010,\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010.2\u0006\u00100\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"LOG_TAG", "", "PERMISSIONS_DENIED", "", "PERMISSIONS_EMPTY", "", "PERMISSIONS_FOR_AUDIO_IP_CALL", "PERMISSIONS_FOR_MEMBERS_SEARCH", "PERMISSIONS_FOR_MEMBER_DETAILS", "PERMISSIONS_FOR_ROOM_AVATAR", "PERMISSIONS_FOR_TAKING_PHOTO", "PERMISSIONS_FOR_VIDEO_IP_CALL", "PERMISSIONS_FOR_VIDEO_RECORDING", "PERMISSIONS_FOR_WRITING_FILES", "PERMISSIONS_GRANTED", "PERMISSION_BYPASSED", "PERMISSION_CAMERA", "PERMISSION_READ_CONTACTS", "PERMISSION_RECORD_AUDIO", "PERMISSION_REQUEST_CODE", "PERMISSION_REQUEST_CODE_AUDIO_CALL", "PERMISSION_REQUEST_CODE_CHANGE_AVATAR", "PERMISSION_REQUEST_CODE_EXPORT_KEYS", "PERMISSION_REQUEST_CODE_LAUNCH_CAMERA", "PERMISSION_REQUEST_CODE_LAUNCH_NATIVE_CAMERA", "PERMISSION_REQUEST_CODE_LAUNCH_NATIVE_VIDEO_CAMERA", "PERMISSION_REQUEST_CODE_VIDEO_CALL", "PERMISSION_WRITE_EXTERNAL_STORAGE", "allGranted", "grantResults", "", "checkPermissions", "permissionsToBeGrantedBitMap", "activity", "Landroid/app/Activity;", "requestCode", "fragment", "Landroid/support/v4/app/Fragment;", "logPermissionStatuses", "", "context", "Landroid/content/Context;", "onPermissionResultAudioIpCall", "onPermissionResultVideoIpCall", "updatePermissionsToBeGranted", "permissionAlreadyDeniedList_out", "", "permissionsListToBeGranted_out", "permissionType", "vector_appDebug"})
public final class PermissionsToolsKt {
    private static final java.lang.String LOG_TAG = "PermissionUtils";
    private static final boolean PERMISSIONS_GRANTED = true;
    private static final boolean PERMISSIONS_DENIED = false;
    private static final int PERMISSION_BYPASSED = 0;
    public static final int PERMISSION_CAMERA = 1;
    private static final int PERMISSION_WRITE_EXTERNAL_STORAGE = 2;
    private static final int PERMISSION_RECORD_AUDIO = 4;
    private static final int PERMISSION_READ_CONTACTS = 8;
    public static final int PERMISSIONS_FOR_AUDIO_IP_CALL = 4;
    public static final int PERMISSIONS_FOR_VIDEO_IP_CALL = 5;
    public static final int PERMISSIONS_FOR_TAKING_PHOTO = 3;
    public static final int PERMISSIONS_FOR_MEMBERS_SEARCH = 8;
    public static final int PERMISSIONS_FOR_MEMBER_DETAILS = 8;
    public static final int PERMISSIONS_FOR_ROOM_AVATAR = 1;
    public static final int PERMISSIONS_FOR_VIDEO_RECORDING = 5;
    public static final int PERMISSIONS_FOR_WRITING_FILES = 2;
    private static final int PERMISSIONS_EMPTY = 0;
    public static final int PERMISSION_REQUEST_CODE = 567;
    public static final int PERMISSION_REQUEST_CODE_LAUNCH_CAMERA = 568;
    public static final int PERMISSION_REQUEST_CODE_LAUNCH_NATIVE_CAMERA = 569;
    public static final int PERMISSION_REQUEST_CODE_LAUNCH_NATIVE_VIDEO_CAMERA = 570;
    public static final int PERMISSION_REQUEST_CODE_AUDIO_CALL = 571;
    public static final int PERMISSION_REQUEST_CODE_VIDEO_CALL = 572;
    public static final int PERMISSION_REQUEST_CODE_EXPORT_KEYS = 573;
    public static final int PERMISSION_REQUEST_CODE_CHANGE_AVATAR = 574;
    
    /**
     * * Log the used permissions statuses.
     */
    public static final void logPermissionStatuses(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * * See [.checkPermissions]
     * *
     * * @param permissionsToBeGrantedBitMap
     * * @param activity
     * * @return true if the permissions are granted (synchronous flow), false otherwise (asynchronous flow)
     */
    public static final boolean checkPermissions(int permissionsToBeGrantedBitMap, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int requestCode) {
        return false;
    }
    
    /**
     * * See [.checkPermissions]
     * *
     * * @param permissionsToBeGrantedBitMap
     * * @param fragment
     * * @return true if the permissions are granted (synchronous flow), false otherwise (asynchronous flow)
     */
    public static final boolean checkPermissions(int permissionsToBeGrantedBitMap, @org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, int requestCode) {
        return false;
    }
    
    /**
     * * Check if the permissions provided in the list are granted.
     * * This is an asynchronous method if permissions are requested, the final response
     * * is provided in onRequestPermissionsResult(). In this case checkPermissions()
     * * returns false.
     * * <br></br>If checkPermissions() returns true, the permissions were already granted.
     * * The permissions to be granted are given as bit map in permissionsToBeGrantedBitMap (ex: [.PERMISSIONS_FOR_TAKING_PHOTO]).
     * * <br></br>permissionsToBeGrantedBitMap is passed as the request code in onRequestPermissionsResult().
     * *
     * *
     * * If a permission was already denied by the user, a popup is displayed to
     * * explain why vector needs the corresponding permission.
     * *
     * * @param permissionsToBeGrantedBitMap the permissions bit map to be granted
     * * @param activity                     the calling Activity that is requesting the permissions (or fragment parent)
     * * @param fragment                     the calling fragment that is requesting the permissions
     * * @return true if the permissions are granted (synchronous flow), false otherwise (asynchronous flow)
     */
    private static final boolean checkPermissions(int permissionsToBeGrantedBitMap, android.app.Activity activity, android.support.v4.app.Fragment fragment, int requestCode) {
        return false;
    }
    
    /**
     * * Helper method used in [.checkPermissions] to populate the list of the
     * * permissions to be granted (permissionsListToBeGranted_out) and the list of the permissions already denied (permissionAlreadyDeniedList_out).
     * *
     * * @param activity                        calling activity
     * * @param permissionAlreadyDeniedList_out list to be updated with the permissions already denied by the user
     * * @param permissionsListToBeGranted_out  list to be updated with the permissions to be granted
     * * @param permissionType                  the permission to be checked
     * * @return true if the permission requires to be granted, false otherwise
     */
    private static final boolean updatePermissionsToBeGranted(android.app.Activity activity, java.util.List<java.lang.String> permissionAlreadyDeniedList_out, java.util.List<java.lang.String> permissionsListToBeGranted_out, java.lang.String permissionType) {
        return false;
    }
    
    /**
     * * Helper method to process [.PERMISSIONS_FOR_AUDIO_IP_CALL]
     * * on onRequestPermissionsResult() methods.
     * *
     * * @param context      App context
     * * @param grantResults permissions granted results
     * * @return true if audio IP call is permitted, false otherwise
     */
    public static final boolean onPermissionResultAudioIpCall(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
        return false;
    }
    
    /**
     * * Helper method to process [.PERMISSIONS_FOR_VIDEO_IP_CALL]
     * * on onRequestPermissionsResult() methods.
     * * For video IP calls, record audio and camera permissions are both mandatory.
     * *
     * * @param context      App context
     * * @param grantResults permissions granted results
     * * @return true if video IP call is permitted, false otherwise
     */
    public static final boolean onPermissionResultVideoIpCall(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
        return false;
    }
    
    /**
     * * Return true if all permissions are granted, false if not or if permission request has been cancelled
     */
    public static final boolean allGranted(@org.jetbrains.annotations.NotNull()
    int[] grantResults) {
        return false;
    }
}