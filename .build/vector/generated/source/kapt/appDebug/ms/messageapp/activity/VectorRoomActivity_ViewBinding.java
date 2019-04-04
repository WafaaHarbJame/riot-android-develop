// Generated code from Butter Knife. Do not modify!
package ms.messageapp.activity;

import android.annotation.SuppressLint;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ms.messageapp.R;
import ms.messageapp.view.ActiveWidgetsBanner;
import ms.messageapp.view.NotificationAreaView;
import ms.messageapp.view.VectorAutoCompleteTextView;
import ms.messageapp.view.VectorOngoingConferenceCallView;
import ms.messageapp.view.VectorPendingCallView;

public class VectorRoomActivity_ViewBinding extends VectorAppCompatActivity_ViewBinding {
  private VectorRoomActivity target;

  private View view2131297093;

  private View view2131297092;

  private View view2131296488;

  private View view2131297094;

  private View view2131297071;

  private View view2131296944;

  private View view2131296278;

  private View view2131296283;

  private View view2131296282;

  private View view2131296279;

  private View view2131296281;

  private View view2131296284;

  private View view2131297072;

  private View view2131297086;

  private View view2131296596;

  private View view2131297054;

  @UiThread
  public VectorRoomActivity_ViewBinding(VectorRoomActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  @SuppressLint("ClickableViewAccessibility")
  public VectorRoomActivity_ViewBinding(final VectorRoomActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.room_sending_message_layout, "field 'mSendingMessagesLayout' and method 'onSendingMessageLayoutClick'");
    target.mSendingMessagesLayout = view;
    view2131297093 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSendingMessageLayoutClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.room_send_image_view, "field 'mSendImageView', method 'onSendClick', and method 'onLongClick'");
    target.mSendImageView = Utils.castView(view, R.id.room_send_image_view, "field 'mSendImageView'", ImageView.class);
    view2131297092 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSendClick();
      }
    });
    view.setOnLongClickListener(new View.OnLongClickListener() {
      @Override
      public boolean onLongClick(View p0) {
        return target.onLongClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.editText_messageBox, "field 'mEditText' and method 'onEditTextClick'");
    target.mEditText = Utils.castView(view, R.id.editText_messageBox, "field 'mEditText'", VectorAutoCompleteTextView.class);
    view2131296488 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onEditTextClick();
      }
    });
    target.mAvatarImageView = Utils.findRequiredViewAsType(source, R.id.room_self_avatar, "field 'mAvatarImageView'", ImageView.class);
    target.mBottomSeparator = Utils.findRequiredView(source, R.id.bottom_separator, "field 'mBottomSeparator'");
    target.mCanNotPostTextView = Utils.findRequiredView(source, R.id.room_cannot_post_textview, "field 'mCanNotPostTextView'");
    target.mBottomLayout = Utils.findRequiredView(source, R.id.room_bottom_layout, "field 'mBottomLayout'");
    target.mE2eImageView = Utils.findRequiredViewAsType(source, R.id.room_encrypted_image_view, "field 'mE2eImageView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.room_start_call_image_view, "field 'mStartCallLayout' and method 'onStartCallClick'");
    target.mStartCallLayout = view;
    view2131297094 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStartCallClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.room_end_call_image_view, "field 'mStopCallLayout' and method 'onStopCallClick'");
    target.mStopCallLayout = view;
    view2131297071 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStopCallClick();
      }
    });
    target.mActionBarCustomTitle = Utils.findRequiredViewAsType(source, R.id.room_action_bar_title, "field 'mActionBarCustomTitle'", TextView.class);
    target.mActionBarCustomTopic = Utils.findRequiredViewAsType(source, R.id.room_action_bar_topic, "field 'mActionBarCustomTopic'", TextView.class);
    view = Utils.findRequiredView(source, R.id.open_chat_header_arrow, "field 'mActionBarCustomArrowImageView' and method 'OnOpenHeaderClick'");
    target.mActionBarCustomArrowImageView = Utils.castView(view, R.id.open_chat_header_arrow, "field 'mActionBarCustomArrowImageView'", ImageView.class);
    view2131296944 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnOpenHeaderClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.action_bar_header, "field 'mRoomHeaderView' and method 'onRoomHeaderTouch'");
    target.mRoomHeaderView = Utils.castView(view, R.id.action_bar_header, "field 'mRoomHeaderView'", ViewGroup.class);
    view2131296278 = view;
    view.setOnTouchListener(new View.OnTouchListener() {
      @Override
      public boolean onTouch(View p0, MotionEvent p1) {
        return target.onRoomHeaderTouch(p0, p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.action_bar_header_room_title, "field 'mActionBarHeaderRoomName' and method 'onRoomHeaderTitleClick'");
    target.mActionBarHeaderRoomName = Utils.castView(view, R.id.action_bar_header_room_title, "field 'mActionBarHeaderRoomName'", TextView.class);
    view2131296283 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRoomHeaderTitleClick();
      }
    });
    target.mActionBarHeaderActiveMembersLayout = Utils.findRequiredView(source, R.id.action_bar_header_room_members_layout, "field 'mActionBarHeaderActiveMembersLayout'");
    view = Utils.findRequiredView(source, R.id.action_bar_header_room_members_text_view, "field 'mActionBarHeaderActiveMembersTextView' and method 'onRoomMembersClick'");
    target.mActionBarHeaderActiveMembersTextView = Utils.castView(view, R.id.action_bar_header_room_members_text_view, "field 'mActionBarHeaderActiveMembersTextView'", TextView.class);
    view2131296282 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRoomMembersClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.action_bar_header_room_members_invite_view, "field 'mActionBarHeaderActiveMembersInviteButton' and method 'onRoomMemberInviteClick'");
    target.mActionBarHeaderActiveMembersInviteButton = view;
    view2131296279 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRoomMemberInviteClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.action_bar_header_room_members_settings_view, "field 'mActionBarHeaderActiveMembersListButton' and method 'onRoomMembersSettingClick'");
    target.mActionBarHeaderActiveMembersListButton = view;
    view2131296281 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRoomMembersSettingClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.action_bar_header_room_topic, "field 'mActionBarHeaderRoomTopic' and method 'onRoomHeaderTopicClick'");
    target.mActionBarHeaderRoomTopic = Utils.castView(view, R.id.action_bar_header_room_topic, "field 'mActionBarHeaderRoomTopic'", TextView.class);
    view2131296284 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRoomHeaderTopicClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.room_header_avatar, "field 'mActionBarHeaderRoomAvatar' and method 'onRoomAvatarClick'");
    target.mActionBarHeaderRoomAvatar = Utils.castView(view, R.id.room_header_avatar, "field 'mActionBarHeaderRoomAvatar'", ImageView.class);
    view2131297072 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRoomAvatarClick();
      }
    });
    target.mNotificationsArea = Utils.findRequiredViewAsType(source, R.id.room_notifications_area, "field 'mNotificationsArea'", NotificationAreaView.class);
    target.mRoomPreviewLayout = Utils.findRequiredView(source, R.id.room_preview_info_layout, "field 'mRoomPreviewLayout'");
    view = Utils.findRequiredView(source, R.id.room_pending_call_view, "field 'mVectorPendingCallView' and method 'onPendingCallClick'");
    target.mVectorPendingCallView = Utils.castView(view, R.id.room_pending_call_view, "field 'mVectorPendingCallView'", VectorPendingCallView.class);
    view2131297086 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPendingCallClick();
      }
    });
    target.mVectorOngoingConferenceCallView = Utils.findRequiredViewAsType(source, R.id.room_ongoing_conference_call_view, "field 'mVectorOngoingConferenceCallView'", VectorOngoingConferenceCallView.class);
    target.mActiveWidgetsBanner = Utils.findRequiredViewAsType(source, R.id.room_pending_widgets_view, "field 'mActiveWidgetsBanner'", ActiveWidgetsBanner.class);
    target.mBackProgressView = Utils.findRequiredView(source, R.id.loading_room_paginate_back_progress, "field 'mBackProgressView'");
    target.mForwardProgressView = Utils.findRequiredView(source, R.id.loading_room_paginate_forward_progress, "field 'mForwardProgressView'");
    target.mMainProgressView = Utils.findRequiredView(source, R.id.main_progress_layout, "field 'mMainProgressView'");
    target.invitationTextView = Utils.findRequiredViewAsType(source, R.id.room_preview_invitation_textview, "field 'invitationTextView'", TextView.class);
    target.subInvitationTextView = Utils.findRequiredViewAsType(source, R.id.room_preview_subinvitation_textview, "field 'subInvitationTextView'", TextView.class);
    target.mSyncInProgressView = Utils.findRequiredView(source, R.id.room_sync_in_progress, "field 'mSyncInProgressView'");
    view = Utils.findRequiredView(source, R.id.header_texts_container, "method 'onTextsContainerClick'");
    view2131296596 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTextsContainerClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.room_button_margin_right, "method 'onMarginRightClick'");
    view2131297054 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMarginRightClick();
      }
    });
  }

  @Override
  public void unbind() {
    VectorRoomActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSendingMessagesLayout = null;
    target.mSendImageView = null;
    target.mEditText = null;
    target.mAvatarImageView = null;
    target.mBottomSeparator = null;
    target.mCanNotPostTextView = null;
    target.mBottomLayout = null;
    target.mE2eImageView = null;
    target.mStartCallLayout = null;
    target.mStopCallLayout = null;
    target.mActionBarCustomTitle = null;
    target.mActionBarCustomTopic = null;
    target.mActionBarCustomArrowImageView = null;
    target.mRoomHeaderView = null;
    target.mActionBarHeaderRoomName = null;
    target.mActionBarHeaderActiveMembersLayout = null;
    target.mActionBarHeaderActiveMembersTextView = null;
    target.mActionBarHeaderActiveMembersInviteButton = null;
    target.mActionBarHeaderActiveMembersListButton = null;
    target.mActionBarHeaderRoomTopic = null;
    target.mActionBarHeaderRoomAvatar = null;
    target.mNotificationsArea = null;
    target.mRoomPreviewLayout = null;
    target.mVectorPendingCallView = null;
    target.mVectorOngoingConferenceCallView = null;
    target.mActiveWidgetsBanner = null;
    target.mBackProgressView = null;
    target.mForwardProgressView = null;
    target.mMainProgressView = null;
    target.invitationTextView = null;
    target.subInvitationTextView = null;
    target.mSyncInProgressView = null;

    view2131297093.setOnClickListener(null);
    view2131297093 = null;
    view2131297092.setOnClickListener(null);
    view2131297092.setOnLongClickListener(null);
    view2131297092 = null;
    view2131296488.setOnClickListener(null);
    view2131296488 = null;
    view2131297094.setOnClickListener(null);
    view2131297094 = null;
    view2131297071.setOnClickListener(null);
    view2131297071 = null;
    view2131296944.setOnClickListener(null);
    view2131296944 = null;
    view2131296278.setOnTouchListener(null);
    view2131296278 = null;
    view2131296283.setOnClickListener(null);
    view2131296283 = null;
    view2131296282.setOnClickListener(null);
    view2131296282 = null;
    view2131296279.setOnClickListener(null);
    view2131296279 = null;
    view2131296281.setOnClickListener(null);
    view2131296281 = null;
    view2131296284.setOnClickListener(null);
    view2131296284 = null;
    view2131297072.setOnClickListener(null);
    view2131297072 = null;
    view2131297086.setOnClickListener(null);
    view2131297086 = null;
    view2131296596.setOnClickListener(null);
    view2131296596 = null;
    view2131297054.setOnClickListener(null);
    view2131297054 = null;

    super.unbind();
  }
}
