package com.ead.notification.services;

import com.ead.notification.dtos.NotificationRecordCommandDto;
import com.ead.notification.models.NotificationModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface NotificationService {


    NotificationModel saveNotification(NotificationRecordCommandDto notificationRecordCommandDto);

    Page<NotificationModel> findAllNotificationsByUser(UUID userId, Pageable pageable);
}
