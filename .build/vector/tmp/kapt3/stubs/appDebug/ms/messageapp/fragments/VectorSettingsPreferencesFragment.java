package ms.messageapp.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.StringRes;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v14.preference.SwitchPreference;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.preference.*;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import com.bumptech.glide.Glide;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import ms.messageapp.Matrix;
import ms.messageapp.R;
import ms.messageapp.VectorApp;
import ms.messageapp.activity.*;
import ms.messageapp.contacts.ContactsManager;
import ms.messageapp.dialogs.ExportKeysDialog;
import ms.messageapp.preference.ProgressBarPreference;
import ms.messageapp.preference.UserAvatarPreference;
import ms.messageapp.preference.VectorGroupPreference;
import ms.messageapp.preference.VectorPreference;
import ms.messageapp.settings.FontScale;
import ms.messageapp.settings.VectorLocale;
import ms.messageapp.ui.themes.ThemeUtils;
import ms.messageapp.ui.util.SimpleTextWatcher;
import ms.messageapp.util.*;
import org.matrix.androidsdk.MXSession;
import org.matrix.androidsdk.crypto.data.ImportRoomKeysResult;
import org.matrix.androidsdk.crypto.data.MXDeviceInfo;
import org.matrix.androidsdk.data.MyUser;
import org.matrix.androidsdk.data.Pusher;
import org.matrix.androidsdk.data.RoomMediaMessage;
import org.matrix.androidsdk.db.MXMediaCache;
import org.matrix.androidsdk.listeners.IMXNetworkEventListener;
import org.matrix.androidsdk.listeners.MXEventListener;
import org.matrix.androidsdk.listeners.MXMediaUploadListener;
import org.matrix.androidsdk.rest.callback.ApiCallback;
import org.matrix.androidsdk.rest.callback.SimpleApiCallback;
import org.matrix.androidsdk.rest.model.MatrixError;
import org.matrix.androidsdk.rest.model.bingrules.BingRule;
import org.matrix.androidsdk.rest.model.group.Group;
import org.matrix.androidsdk.rest.model.pid.ThirdPartyIdentifier;
import org.matrix.androidsdk.rest.model.pid.ThreePid;
import org.matrix.androidsdk.rest.model.sync.DeviceInfo;
import org.matrix.androidsdk.rest.model.sync.DevicesListResponse;
import org.matrix.androidsdk.util.BingRulesManager;
import org.matrix.androidsdk.util.Log;
import org.matrix.androidsdk.util.ResourceUtils;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00f4\u00012\u00020\u00012\u00020\u0002:\u0004\u00f3\u0001\u00f4\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0013\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u0097\u0001\u001a\u00020\'H\u0002J\u0019\u0010\u0098\u0001\u001a\u00030\u0096\u00012\r\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020G0FH\u0002J\u001a\u0010\u009a\u0001\u001a\u00030\u0096\u00012\u000e\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u00020\'0\u009c\u0001H\u0002J\n\u0010\u009d\u0001\u001a\u00030\u0096\u0001H\u0002J\u0013\u0010\u009e\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u009f\u0001\u001a\u00020\'H\u0002J\u001e\u0010\u00a0\u0001\u001a\u00030\u0096\u00012\b\u0010\u00a1\u0001\u001a\u00030\u00a2\u00012\b\u0010\u00a3\u0001\u001a\u00030\u00a4\u0001H\u0002J\u0013\u0010\u00a5\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u00a6\u0001\u001a\u00020GH\u0002J\u0013\u0010\u00a7\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u00a8\u0001\u001a\u00020GH\u0002J\u0013\u0010\u00a9\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u00aa\u0001\u001a\u00020GH\u0002J\n\u0010\u00ab\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00ac\u0001\u001a\u00030\u0096\u0001H\u0002J\u0014\u0010\u00ad\u0001\u001a\u00030\u0096\u00012\b\u0010\u00ae\u0001\u001a\u00030\u00af\u0001H\u0002J\n\u0010\u00b0\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00b1\u0001\u001a\u00030\u0096\u0001H\u0002J\u0014\u0010\u00b1\u0001\u001a\u00030\u0096\u00012\b\u0010\u00b2\u0001\u001a\u00030\u00b3\u0001H\u0002J\n\u0010\u00b4\u0001\u001a\u00030\u0096\u0001H\u0003J\u0016\u0010\u00b4\u0001\u001a\u00030\u0096\u00012\n\u0010\u00b5\u0001\u001a\u0005\u0018\u00010\u00b6\u0001H\u0002J*\u0010\u00b7\u0001\u001a\u00030\u0096\u00012\b\u0010\u00b8\u0001\u001a\u00030\u00b9\u00012\b\u0010\u00ba\u0001\u001a\u00030\u00b9\u00012\n\u0010\u00bb\u0001\u001a\u0005\u0018\u00010\u00b6\u0001H\u0016J\u0016\u0010\u00bc\u0001\u001a\u00030\u0096\u00012\n\u0010\u00bd\u0001\u001a\u0005\u0018\u00010\u00be\u0001H\u0016J\u0015\u0010\u00bf\u0001\u001a\u00030\u0096\u00012\t\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\'H\u0002J!\u0010\u00c1\u0001\u001a\u00030\u0096\u00012\n\u0010\u00c2\u0001\u001a\u0005\u0018\u00010\u00c3\u00012\t\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\'H\u0016J-\u0010\u00c5\u0001\u001a\u0004\u0018\u00010a2\b\u0010\u00c6\u0001\u001a\u00030\u00c7\u00012\n\u0010\u00c8\u0001\u001a\u0005\u0018\u00010\u00c9\u00012\n\u0010\u00c2\u0001\u001a\u0005\u0018\u00010\u00c3\u0001H\u0016J\n\u0010\u00ca\u0001\u001a\u00030\u0096\u0001H\u0016J\u0015\u0010\u00cb\u0001\u001a\u00030\u0096\u00012\t\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\'H\u0002J\n\u0010\u00cd\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00ce\u0001\u001a\u00030\u0096\u0001H\u0016J\u0016\u0010\u00cf\u0001\u001a\u00030\u0096\u00012\n\u0010\u00bb\u0001\u001a\u0005\u0018\u00010\u00b6\u0001H\u0002J\u001d\u0010\u00d0\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u00d1\u0001\u001a\u00020\'2\b\u0010\u00d2\u0001\u001a\u00030\u00b3\u0001H\u0002J4\u0010\u00d3\u0001\u001a\u00030\u0096\u00012\b\u0010\u00b8\u0001\u001a\u00030\u00b9\u00012\u000e\u0010\u00d4\u0001\u001a\t\u0012\u0004\u0012\u00020\'0\u00d5\u00012\b\u0010\u00d6\u0001\u001a\u00030\u00d7\u0001H\u0016\u00a2\u0006\u0003\u0010\u00d8\u0001J\n\u0010\u00d9\u0001\u001a\u00030\u0096\u0001H\u0016J\u001d\u0010\u00da\u0001\u001a\u00030\u0096\u00012\b\u0010\u00db\u0001\u001a\u00030\u00dc\u00012\u0007\u0010\u00dd\u0001\u001a\u00020\'H\u0016J\n\u0010\u00de\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00df\u0001\u001a\u00030\u0096\u0001H\u0002J\u0015\u0010\u00e0\u0001\u001a\u00030\u0096\u00012\t\u0010\u00e1\u0001\u001a\u0004\u0018\u00010GH\u0002J\n\u0010\u00e2\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00e3\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00e4\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00e5\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00e6\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00e7\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00e8\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00e9\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00ea\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00eb\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00ec\u0001\u001a\u00030\u0096\u0001H\u0002J\u0013\u0010\u00ed\u0001\u001a\u00020\'2\b\u0010\u00ee\u0001\u001a\u00030\u00b9\u0001H\u0002J\n\u0010\u00ef\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00f0\u0001\u001a\u00030\u0096\u0001H\u0002J\u0014\u0010\u00f1\u0001\u001a\u00030\u0096\u00012\b\u0010\u00a1\u0001\u001a\u00030\u00f2\u0001H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0013\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001c\u0010\bR#\u0010\u001e\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b\u001f\u0010\bR#\u0010!\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b\"\u0010\bR\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010(\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b)\u0010\bR#\u0010+\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b,\u0010\bR\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u0010\n\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b4\u00101R#\u00106\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\n\u001a\u0004\b7\u0010\bR\u001b\u00109\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b:\u00101R#\u0010<\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010\n\u001a\u0004\b=\u0010\bR\u001b\u0010?\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\b@\u00101R#\u0010B\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bD\u0010\n\u001a\u0004\bC\u0010\bR\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020G0FX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010H\u001a\u00020I8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bL\u0010\n\u001a\u0004\bJ\u0010KR\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020\'0NX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020\'0NX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0NX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020SX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010T\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bV\u0010\n\u001a\u0004\bU\u00101R\u001b\u0010W\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bY\u0010\n\u001a\u0004\bX\u00101R#\u0010Z\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\\\u0010\n\u001a\u0004\b[\u0010\bR\u001b\u0010]\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b_\u0010\n\u001a\u0004\b^\u00101R\u0010\u0010`\u001a\u0004\u0018\u00010aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010b\u001a\u0004\u0018\u00010GX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010e\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bg\u0010\n\u001a\u0004\bf\u0010\bR#\u0010h\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bj\u0010\n\u001a\u0004\bi\u0010\bR\u0016\u0010k\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010lX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010m\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bo\u0010\n\u001a\u0004\bn\u00101R#\u0010p\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\br\u0010\n\u001a\u0004\bq\u0010\bR\u000e\u0010s\u001a\u00020tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010u\u001a\u0004\u0018\u00010I8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bw\u0010\n\u001a\u0004\bv\u0010KR\u001d\u0010x\u001a\u0004\u0018\u00010I8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bz\u0010\n\u001a\u0004\by\u0010KR\u001b\u0010{\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b}\u0010\n\u001a\u0004\b|\u0010\u0011R\u001e\u0010~\u001a\u00020\u007f8BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u0082\u0001\u0010\n\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u0083\u0001\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0085\u0001\u0010\n\u001a\u0005\b\u0084\u0001\u00101R&\u0010\u0086\u0001\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0088\u0001\u0010\n\u001a\u0005\b\u0087\u0001\u0010\bR\u001e\u0010\u0089\u0001\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u008b\u0001\u0010\n\u001a\u0005\b\u008a\u0001\u00101R&\u0010\u008c\u0001\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u008e\u0001\u0010\n\u001a\u0005\b\u008d\u0001\u0010\bR\u001e\u0010\u008f\u0001\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0091\u0001\u0010\n\u001a\u0005\b\u0090\u0001\u0010\u0011R&\u0010\u0092\u0001\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0094\u0001\u0010\n\u001a\u0005\b\u0093\u0001\u0010\b\u00a8\u0006\u00f5\u0001"}, d2 = {"Lms/messageapp/fragments/VectorSettingsPreferencesFragment;", "Landroid/support/v7/preference/PreferenceFragmentCompat;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "backgroundSyncCategory", "Landroid/support/v7/preference/Preference;", "kotlin.jvm.PlatformType", "getBackgroundSyncCategory", "()Landroid/support/v7/preference/Preference;", "backgroundSyncCategory$delegate", "Lkotlin/Lazy;", "backgroundSyncDivider", "getBackgroundSyncDivider", "backgroundSyncDivider$delegate", "backgroundSyncPreference", "Landroid/support/v14/preference/SwitchPreference;", "getBackgroundSyncPreference", "()Landroid/support/v14/preference/SwitchPreference;", "backgroundSyncPreference$delegate", "cryptoInfoDeviceIdPreference", "getCryptoInfoDeviceIdPreference", "cryptoInfoDeviceIdPreference$delegate", "cryptoInfoDeviceNamePreference", "Lms/messageapp/preference/VectorPreference;", "getCryptoInfoDeviceNamePreference", "()Lms/messageapp/preference/VectorPreference;", "cryptoInfoDeviceNamePreference$delegate", "cryptoInfoTextPreference", "getCryptoInfoTextPreference", "cryptoInfoTextPreference$delegate", "exportPref", "getExportPref", "exportPref$delegate", "importPref", "getImportPref", "importPref$delegate", "interactionListener", "Lms/messageapp/fragments/VectorSettingsFragmentInteractionListener;", "mAccountPassword", "", "mCallRingtonePreference", "getMCallRingtonePreference", "mCallRingtonePreference$delegate", "mContactPhonebookCountryPreference", "getMContactPhonebookCountryPreference", "mContactPhonebookCountryPreference$delegate", "mContactSettingsCategory", "Landroid/support/v7/preference/PreferenceCategory;", "getMContactSettingsCategory", "()Landroid/support/v7/preference/PreferenceCategory;", "mContactSettingsCategory$delegate", "mCryptographyCategory", "getMCryptographyCategory", "mCryptographyCategory$delegate", "mCryptographyCategoryDivider", "getMCryptographyCategoryDivider", "mCryptographyCategoryDivider$delegate", "mCryptographyManageCategory", "getMCryptographyManageCategory", "mCryptographyManageCategory$delegate", "mCryptographyManageCategoryDivider", "getMCryptographyManageCategoryDivider", "mCryptographyManageCategoryDivider$delegate", "mDevicesListSettingsCategory", "getMDevicesListSettingsCategory", "mDevicesListSettingsCategory$delegate", "mDevicesListSettingsCategoryDivider", "getMDevicesListSettingsCategoryDivider", "mDevicesListSettingsCategoryDivider$delegate", "mDevicesNameList", "", "Lorg/matrix/androidsdk/rest/model/sync/DeviceInfo;", "mDisplayNamePreference", "Landroid/support/v7/preference/EditTextPreference;", "getMDisplayNamePreference", "()Landroid/support/v7/preference/EditTextPreference;", "mDisplayNamePreference$delegate", "mDisplayedEmails", "Ljava/util/ArrayList;", "mDisplayedPhoneNumber", "mDisplayedPushers", "Lorg/matrix/androidsdk/data/Pusher;", "mEventsListener", "Lorg/matrix/androidsdk/listeners/MXEventListener;", "mGroupsFlairCategory", "getMGroupsFlairCategory", "mGroupsFlairCategory$delegate", "mIgnoredUserSettingsCategory", "getMIgnoredUserSettingsCategory", "mIgnoredUserSettingsCategory$delegate", "mIgnoredUserSettingsCategoryDivider", "getMIgnoredUserSettingsCategoryDivider", "mIgnoredUserSettingsCategoryDivider$delegate", "mLabsCategory", "getMLabsCategory", "mLabsCategory$delegate", "mLoadingView", "Landroid/view/View;", "mMyDeviceInfo", "mNetworkListener", "Lorg/matrix/androidsdk/listeners/IMXNetworkEventListener;", "mNotificationPrivacyPreference", "getMNotificationPrivacyPreference", "mNotificationPrivacyPreference$delegate", "mPasswordPreference", "getMPasswordPreference", "mPasswordPreference$delegate", "mPublicisedGroups", "", "mPushersSettingsCategory", "getMPushersSettingsCategory", "mPushersSettingsCategory$delegate", "mPushersSettingsDivider", "getMPushersSettingsDivider", "mPushersSettingsDivider$delegate", "mSession", "Lorg/matrix/androidsdk/MXSession;", "mSyncRequestDelayPreference", "getMSyncRequestDelayPreference", "mSyncRequestDelayPreference$delegate", "mSyncRequestTimeoutPreference", "getMSyncRequestTimeoutPreference", "mSyncRequestTimeoutPreference$delegate", "mUseRiotCallRingtonePreference", "getMUseRiotCallRingtonePreference", "mUseRiotCallRingtonePreference$delegate", "mUserAvatarPreference", "Lms/messageapp/preference/UserAvatarPreference;", "getMUserAvatarPreference", "()Lms/messageapp/preference/UserAvatarPreference;", "mUserAvatarPreference$delegate", "mUserSettingsCategory", "getMUserSettingsCategory", "mUserSettingsCategory$delegate", "manageBackupPref", "getManageBackupPref", "manageBackupPref$delegate", "notificationsSettingsCategory", "getNotificationsSettingsCategory", "notificationsSettingsCategory$delegate", "selectedLanguagePreference", "getSelectedLanguagePreference", "selectedLanguagePreference$delegate", "sendToUnverifiedDevicesPref", "getSendToUnverifiedDevicesPref", "sendToUnverifiedDevicesPref$delegate", "textSizePreference", "getTextSizePreference", "textSizePreference$delegate", "addEmail", "", "email", "buildDevicesSettings", "aDeviceInfoList", "buildGroupsList", "publicisedGroups", "", "changeAvatar", "deleteDevice", "deviceId", "displayDelete3PIDConfirmationDialog", "pid", "Lorg/matrix/androidsdk/rest/model/pid/ThirdPartyIdentifier;", "preferenceSummary", "", "displayDeviceDeletionDialog", "aDeviceInfoToDelete", "displayDeviceDetailsDialog", "aDeviceInfo", "displayDeviceRenameDialog", "aDeviceInfoToRename", "displayLoadingView", "displayRingtonePicker", "displayTextSizeSelection", "activity", "Landroid/app/Activity;", "exportKeys", "hideLoadingView", "refresh", "", "importKeys", "intent", "Landroid/content/Intent;", "onActivityResult", "requestCode", "", "resultCode", "data", "onAttach", "context", "Landroid/content/Context;", "onCommonDone", "errorMessage", "onCreatePreferences", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onDisplayNameClick", "value", "onPasswordUpdateClick", "onPause", "onPhonebookCountryUpdate", "onPushRuleClick", "preferenceKey", "newValue", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "onUpdateAvatarClick", "refreshBackgroundSyncPrefs", "refreshCryptographyPreference", "aMyDeviceInfo", "refreshDevicesList", "refreshDisplay", "refreshEmailsList", "refreshGroupFlairsList", "refreshIgnoredUsersList", "refreshNotificationPrivacy", "refreshPhoneNumbersList", "refreshPreferences", "refreshPushersList", "removeCryptographyPreference", "removeDevicesPreference", "secondsToText", "seconds", "setContactsPreferences", "setUserInterfacePreferences", "showEmailValidationDialog", "Lorg/matrix/androidsdk/rest/model/pid/ThreePid;", "ClearMediaCacheAsyncTask", "Companion", "vector_appDebug"})
public final class VectorSettingsPreferencesFragment extends android.support.v7.preference.PreferenceFragmentCompat implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private org.matrix.androidsdk.MXSession mSession;
    private final org.matrix.androidsdk.listeners.IMXNetworkEventListener mNetworkListener = null;
    private final org.matrix.androidsdk.listeners.MXEventListener mEventsListener = null;
    private android.view.View mLoadingView;
    private java.util.ArrayList<java.lang.String> mDisplayedEmails;
    private java.util.ArrayList<java.lang.String> mDisplayedPhoneNumber;
    private org.matrix.androidsdk.rest.model.sync.DeviceInfo mMyDeviceInfo;
    private java.util.ArrayList<org.matrix.androidsdk.data.Pusher> mDisplayedPushers;
    private ms.messageapp.fragments.VectorSettingsFragmentInteractionListener interactionListener;
    private java.util.List<? extends org.matrix.androidsdk.rest.model.sync.DeviceInfo> mDevicesNameList;
    private java.lang.String mAccountPassword;
    private java.util.Set<java.lang.String> mPublicisedGroups;
    private final kotlin.Lazy mUserSettingsCategory$delegate = null;
    private final kotlin.Lazy mUserAvatarPreference$delegate = null;
    private final kotlin.Lazy mDisplayNamePreference$delegate = null;
    private final kotlin.Lazy mPasswordPreference$delegate = null;
    private final kotlin.Lazy mContactSettingsCategory$delegate = null;
    private final kotlin.Lazy mContactPhonebookCountryPreference$delegate = null;
    private final kotlin.Lazy mGroupsFlairCategory$delegate = null;
    private final kotlin.Lazy mCryptographyCategory$delegate = null;
    private final kotlin.Lazy mCryptographyCategoryDivider$delegate = null;
    private final kotlin.Lazy mCryptographyManageCategory$delegate = null;
    private final kotlin.Lazy mCryptographyManageCategoryDivider$delegate = null;
    private final kotlin.Lazy mPushersSettingsDivider$delegate = null;
    private final kotlin.Lazy mPushersSettingsCategory$delegate = null;
    private final kotlin.Lazy mDevicesListSettingsCategory$delegate = null;
    private final kotlin.Lazy mDevicesListSettingsCategoryDivider$delegate = null;
    private final kotlin.Lazy mIgnoredUserSettingsCategoryDivider$delegate = null;
    private final kotlin.Lazy mIgnoredUserSettingsCategory$delegate = null;
    private final kotlin.Lazy mSyncRequestTimeoutPreference$delegate = null;
    private final kotlin.Lazy mSyncRequestDelayPreference$delegate = null;
    private final kotlin.Lazy mLabsCategory$delegate = null;
    private final kotlin.Lazy backgroundSyncCategory$delegate = null;
    private final kotlin.Lazy backgroundSyncDivider$delegate = null;
    private final kotlin.Lazy backgroundSyncPreference$delegate = null;
    private final kotlin.Lazy mUseRiotCallRingtonePreference$delegate = null;
    private final kotlin.Lazy mCallRingtonePreference$delegate = null;
    private final kotlin.Lazy notificationsSettingsCategory$delegate = null;
    private final kotlin.Lazy mNotificationPrivacyPreference$delegate = null;
    private final kotlin.Lazy selectedLanguagePreference$delegate = null;
    private final kotlin.Lazy textSizePreference$delegate = null;
    private final kotlin.Lazy cryptoInfoDeviceNamePreference$delegate = null;
    private final kotlin.Lazy cryptoInfoDeviceIdPreference$delegate = null;
    private final kotlin.Lazy manageBackupPref$delegate = null;
    private final kotlin.Lazy exportPref$delegate = null;
    private final kotlin.Lazy importPref$delegate = null;
    private final kotlin.Lazy cryptoInfoTextPreference$delegate = null;
    private final kotlin.Lazy sendToUnverifiedDevicesPref$delegate = null;
    private static final java.lang.String LOG_TAG = null;
    private static final java.lang.String ARG_MATRIX_ID = "VectorSettingsPreferencesFragment.ARG_MATRIX_ID";
    private static final java.lang.String EMAIL_PREFERENCE_KEY_BASE = "EMAIL_PREFERENCE_KEY_BASE";
    private static final java.lang.String PHONE_NUMBER_PREFERENCE_KEY_BASE = "PHONE_NUMBER_PREFERENCE_KEY_BASE";
    private static final java.lang.String PUSHER_PREFERENCE_KEY_BASE = "PUSHER_PREFERENCE_KEY_BASE";
    private static final java.lang.String DEVICES_PREFERENCE_KEY_BASE = "DEVICES_PREFERENCE_KEY_BASE";
    private static final java.lang.String IGNORED_USER_KEY_BASE = "IGNORED_USER_KEY_BASE";
    private static final java.lang.String ADD_EMAIL_PREFERENCE_KEY = "ADD_EMAIL_PREFERENCE_KEY";
    private static final java.lang.String ADD_PHONE_NUMBER_PREFERENCE_KEY = "ADD_PHONE_NUMBER_PREFERENCE_KEY";
    private static final java.lang.String APP_INFO_LINK_PREFERENCE_KEY = "APP_INFO_LINK_PREFERENCE_KEY";
    private static final java.lang.String DUMMY_RULE = "DUMMY_RULE";
    private static final java.lang.String LABEL_UNAVAILABLE_DATA = "none";
    private static final int REQUEST_E2E_FILE_REQUEST_CODE = 123;
    private static final int REQUEST_NEW_PHONE_NUMBER = 456;
    private static final int REQUEST_PHONEBOOK_COUNTRY = 789;
    private static final int REQUEST_LOCALE = 777;
    private static final int REQUEST_CALL_RINGTONE = 999;
    private static java.util.Map<java.lang.String, java.lang.String> mPrefKeyToBingRuleId;
    public static final ms.messageapp.fragments.VectorSettingsPreferencesFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final android.support.v7.preference.PreferenceCategory getMUserSettingsCategory() {
        return null;
    }
    
    private final ms.messageapp.preference.UserAvatarPreference getMUserAvatarPreference() {
        return null;
    }
    
    private final android.support.v7.preference.EditTextPreference getMDisplayNamePreference() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getMPasswordPreference() {
        return null;
    }
    
    private final android.support.v7.preference.PreferenceCategory getMContactSettingsCategory() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getMContactPhonebookCountryPreference() {
        return null;
    }
    
    private final android.support.v7.preference.PreferenceCategory getMGroupsFlairCategory() {
        return null;
    }
    
    private final android.support.v7.preference.PreferenceCategory getMCryptographyCategory() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getMCryptographyCategoryDivider() {
        return null;
    }
    
    private final android.support.v7.preference.PreferenceCategory getMCryptographyManageCategory() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getMCryptographyManageCategoryDivider() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getMPushersSettingsDivider() {
        return null;
    }
    
    private final android.support.v7.preference.PreferenceCategory getMPushersSettingsCategory() {
        return null;
    }
    
    private final android.support.v7.preference.PreferenceCategory getMDevicesListSettingsCategory() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getMDevicesListSettingsCategoryDivider() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getMIgnoredUserSettingsCategoryDivider() {
        return null;
    }
    
    private final android.support.v7.preference.PreferenceCategory getMIgnoredUserSettingsCategory() {
        return null;
    }
    
    private final android.support.v7.preference.EditTextPreference getMSyncRequestTimeoutPreference() {
        return null;
    }
    
    private final android.support.v7.preference.EditTextPreference getMSyncRequestDelayPreference() {
        return null;
    }
    
    private final android.support.v7.preference.PreferenceCategory getMLabsCategory() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getBackgroundSyncCategory() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getBackgroundSyncDivider() {
        return null;
    }
    
    private final android.support.v14.preference.SwitchPreference getBackgroundSyncPreference() {
        return null;
    }
    
    private final android.support.v14.preference.SwitchPreference getMUseRiotCallRingtonePreference() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getMCallRingtonePreference() {
        return null;
    }
    
    private final android.support.v7.preference.PreferenceCategory getNotificationsSettingsCategory() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getMNotificationPrivacyPreference() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getSelectedLanguagePreference() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getTextSizePreference() {
        return null;
    }
    
    private final ms.messageapp.preference.VectorPreference getCryptoInfoDeviceNamePreference() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getCryptoInfoDeviceIdPreference() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getManageBackupPref() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getExportPref() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getImportPref() {
        return null;
    }
    
    private final android.support.v7.preference.Preference getCryptoInfoTextPreference() {
        return null;
    }
    
    private final android.support.v14.preference.SwitchPreference getSendToUnverifiedDevicesPref() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    java.lang.String rootKey) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    /**
     * * Display the loading view.
     */
    private final void displayLoadingView() {
    }
    
    /**
     * * Hide the loading view.
     */
    private final void hideLoadingView() {
    }
    
    /**
     * * Hide the loading view and refresh the preferences.
     *     *
     *     * @param refresh true to refresh the display
     */
    private final void hideLoadingView(boolean refresh) {
    }
    
    /**
     * * Refresh the preferences.
     */
    private final void refreshDisplay() {
    }
    
    /**
     * * Update the password.
     */
    private final void onPasswordUpdateClick() {
    }
    
    /**
     * * Update a push rule.
     */
    private final void onPushRuleClick(java.lang.String preferenceKey, boolean newValue) {
    }
    
    /**
     * * Update the displayname.
     */
    private final void onDisplayNameClick(java.lang.String value) {
    }
    
    private final void displayRingtonePicker() {
    }
    
    /**
     * * Update the avatar.
     */
    private final void onUpdateAvatarClick() {
    }
    
    private final void changeAvatar() {
    }
    
    /**
     * * Refresh the notification privacy setting
     */
    private final void refreshNotificationPrivacy() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    /**
     * * Refresh the known information about the account
     */
    private final void refreshPreferences() {
    }
    
    /**
     * * Display a dialog which asks confirmation for the deletion of a 3pid
     *     *
     *     * @param pid               the 3pid to delete
     *     * @param preferenceSummary the displayed 3pid
     */
    private final void displayDelete3PIDConfirmationDialog(org.matrix.androidsdk.rest.model.pid.ThirdPartyIdentifier pid, java.lang.CharSequence preferenceSummary) {
    }
    
    /**
     * * Refresh the ignored users list
     */
    private final void refreshIgnoredUsersList() {
    }
    
    /**
     * * Refresh the pushers list
     */
    private final void refreshPushersList() {
    }
    
    /**
     * * Refresh the emails list
     */
    private final void refreshEmailsList() {
    }
    
    /**
     * * A request has been processed.
     *     * Display a toast if there is a an error message
     *     *
     *     * @param errorMessage the error message
     */
    private final void onCommonDone(java.lang.String errorMessage) {
    }
    
    /**
     * * Attempt to add a new email to the account
     *     *
     *     * @param email the email to add.
     */
    private final void addEmail(java.lang.String email) {
    }
    
    /**
     * * Show an email validation dialog to warn the user tho valid his email link.
     *     *
     *     * @param pid the used pid.
     */
    private final void showEmailValidationDialog(org.matrix.androidsdk.rest.model.pid.ThreePid pid) {
    }
    
    /**
     * * Refresh phone number list
     */
    private final void refreshPhoneNumbersList() {
    }
    
    private final void setContactsPreferences() {
    }
    
    private final void onPhonebookCountryUpdate(android.content.Intent data) {
    }
    
    private final void setUserInterfacePreferences() {
    }
    
    private final void displayTextSizeSelection(android.app.Activity activity) {
    }
    
    /**
     * * Convert a delay in seconds to string
     *     *
     *     * @param seconds the delay in seconds
     *     * @return the text
     */
    private final java.lang.String secondsToText(int seconds) {
        return null;
    }
    
    /**
     * * Refresh the background sync preference
     */
    private final void refreshBackgroundSyncPrefs() {
    }
    
    private final void removeCryptographyPreference() {
    }
    
    /**
     * * Build the cryptography preference section.
     *     *
     *     * @param aMyDeviceInfo the device info
     */
    private final void refreshCryptographyPreference(org.matrix.androidsdk.rest.model.sync.DeviceInfo aMyDeviceInfo) {
    }
    
    private final void removeDevicesPreference() {
    }
    
    /**
     * * Force the refresh of the devices list.<br></br>
     *     * The devices list is the list of the devices where the user as looged in.
     *     * It can be any mobile device, as any browser.
     */
    private final void refreshDevicesList() {
    }
    
    /**
     * * Build the devices portion of the settings.<br></br>
     *     * Each row correspond to a device ID and its corresponding device name. Clicking on the row
     *     * display a dialog containing: the device ID, the device name and the "last seen" information.
     *     *
     *     * @param aDeviceInfoList the list of the devices
     */
    private final void buildDevicesSettings(java.util.List<? extends org.matrix.androidsdk.rest.model.sync.DeviceInfo> aDeviceInfoList) {
    }
    
    /**
     * * Display a dialog containing the device ID, the device name and the "last seen" information.<>
     *     * This dialog allow to delete the corresponding device (see [.displayDeviceDeletionDialog])
     *     *
     *     * @param aDeviceInfo the device information
     */
    private final void displayDeviceDetailsDialog(org.matrix.androidsdk.rest.model.sync.DeviceInfo aDeviceInfo) {
    }
    
    /**
     * * Display an alert dialog to rename a device
     *     *
     *     * @param aDeviceInfoToRename device info
     */
    private final void displayDeviceRenameDialog(org.matrix.androidsdk.rest.model.sync.DeviceInfo aDeviceInfoToRename) {
    }
    
    /**
     * * Try to delete a device.
     *     *
     *     * @param deviceId the device id
     */
    private final void deleteDevice(java.lang.String deviceId) {
    }
    
    /**
     * * Display a delete confirmation dialog to remove a device.<br></br>
     *     * The user is invited to enter his password to confirm the deletion.
     *     *
     *     * @param aDeviceInfoToDelete device info
     */
    private final void displayDeviceDeletionDialog(org.matrix.androidsdk.rest.model.sync.DeviceInfo aDeviceInfoToDelete) {
    }
    
    /**
     * * Manage the e2e keys export.
     */
    private final void exportKeys() {
    }
    
    /**
     * * Manage the e2e keys import.
     */
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void importKeys() {
    }
    
    /**
     * * Manage the e2e keys import.
     *     *
     *     * @param intent the intent result
     */
    private final void importKeys(android.content.Intent intent) {
    }
    
    /**
     * * Force the refresh of the devices list.<br></br>
     *     * The devices list is the list of the devices where the user as looged in.
     *     * It can be any mobile device, as any browser.
     */
    private final void refreshGroupFlairsList() {
    }
    
    /**
     * * Build the groups list.
     *     *
     *     * @param publicisedGroups the publicised groups list.
     */
    private final void buildGroupsList(java.util.Set<java.lang.String> publicisedGroups) {
    }
    
    public VectorSettingsPreferencesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J%\u0010\u000b\u001a\u00020\u00022\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\r\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0011R(\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \t*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u00040\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \t*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u00040\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lms/messageapp/fragments/VectorSettingsPreferencesFragment$ClearMediaCacheAsyncTask;", "Landroid/os/AsyncTask;", "", "backgroundTask", "Lkotlin/Function0;", "onCompleteTask", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "backgroundTaskReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "onCompleteTaskReference", "doInBackground", "params", "", "([Lkotlin/Unit;)V", "onPostExecute", "result", "(Lkotlin/Unit;)V", "vector_appDebug"})
    static final class ClearMediaCacheAsyncTask extends android.os.AsyncTask<kotlin.Unit, kotlin.Unit, kotlin.Unit> {
        private final java.lang.ref.WeakReference<kotlin.jvm.functions.Function0<kotlin.Unit>> backgroundTaskReference = null;
        private final java.lang.ref.WeakReference<kotlin.jvm.functions.Function0<kotlin.Unit>> onCompleteTaskReference = null;
        
        @java.lang.Override()
        protected void doInBackground(@org.jetbrains.annotations.NotNull()
        kotlin.Unit... params) {
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        kotlin.Unit result) {
        }
        
        public ClearMediaCacheAsyncTask(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> backgroundTask, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onCompleteTask) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lms/messageapp/fragments/VectorSettingsPreferencesFragment$Companion;", "", "()V", "ADD_EMAIL_PREFERENCE_KEY", "", "ADD_PHONE_NUMBER_PREFERENCE_KEY", "APP_INFO_LINK_PREFERENCE_KEY", "ARG_MATRIX_ID", "DEVICES_PREFERENCE_KEY_BASE", "DUMMY_RULE", "EMAIL_PREFERENCE_KEY_BASE", "IGNORED_USER_KEY_BASE", "LABEL_UNAVAILABLE_DATA", "LOG_TAG", "kotlin.jvm.PlatformType", "PHONE_NUMBER_PREFERENCE_KEY_BASE", "PUSHER_PREFERENCE_KEY_BASE", "REQUEST_CALL_RINGTONE", "", "REQUEST_E2E_FILE_REQUEST_CODE", "REQUEST_LOCALE", "REQUEST_NEW_PHONE_NUMBER", "REQUEST_PHONEBOOK_COUNTRY", "mPrefKeyToBingRuleId", "", "newInstance", "Lms/messageapp/fragments/VectorSettingsPreferencesFragment;", "matrixId", "vector_appDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ms.messageapp.fragments.VectorSettingsPreferencesFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String matrixId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}