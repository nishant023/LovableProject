package com.springProject.LovableProject.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectFile {
    Long id;

    Project project;

    String path;

    String minioObjectKey;//This is the storage we are using to store the large data.

    Instant createdAt;
    Instant updatedAt;

    User createdBy;
    User updatedBy; //these two are for the auditing purpose in file only

}
