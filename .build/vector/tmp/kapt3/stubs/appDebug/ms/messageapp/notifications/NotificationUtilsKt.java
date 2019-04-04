package ms.messageapp.notifications;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.PowerManager;
import android.support.annotation.ColorInt;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.VectorApp;
import ms.messageapp.activity.*;
import ms.messageapp.receiver.DismissNotificationReceiver;
import ms.messageapp.util.PreferencesManager;
import org.matrix.androidsdk.rest.model.bingrules.BingRule;
import org.matrix.androidsdk.util.Log;
import java.util.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"supportNotificationChannels", "", "vector_appDebug"})
public final class NotificationUtilsKt {
    
    public static final boolean supportNotificationChannels() {
        return false;
    }
}