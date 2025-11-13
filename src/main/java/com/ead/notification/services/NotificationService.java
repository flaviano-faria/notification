package com.ead.notification.services;

import com.ead.notification.dtos.NotificationRecordCommandDto;
import com.ead.notification.dtos.NotificationRecordDto;
import com.ead.notification.models.NotificationModel;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.Future;

public interface NotificationService {


    NotificationModel saveNotification(NotificationRecordCommandDto notificationRecordCommandDto);

    Page<NotificationModel> findAllNotificationsByUser(UUID userId, Pageable pageable);

    Optional<NotificationModel> findNotificationIdAndUserId(UUID notificationId, UUID userId);

    NotificationModel updateNotification(@Valid NotificationRecordDto notificationRecordDto, NotificationModel notificationModel);
}
