package com.springProject.LovableProject.entity;

import com.springProject.LovableProject.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    Long id;
    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolCalls;// it is jSON array of tools called.

    Integer tokenUsed;

    Instant createdAt;
}
