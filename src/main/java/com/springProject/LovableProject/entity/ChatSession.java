package com.springProject.LovableProject.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatSession {
    //one user can have multiple chat session
    //but for the one project there is only one chat.

    Project project;
    User user;

    String title;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
