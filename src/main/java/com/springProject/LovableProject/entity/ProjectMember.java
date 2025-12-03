package com.springProject.LovableProject.entity;

import com.springProject.LovableProject.enums.ProjectRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
    /*
    this table is creating for the purpose of joning two tables User and Project. It does not have any
     it owns id.
     Called as the join table also.
     There are two parameters which combine to form the primary key uID, Project ID.
     */

    ProjectMemberId id;

    Project project;
    User user;

    ProjectRole projectRole;//this is for when we are inviting user then at which role? editor or viewer?

    Instant invitedAt;
    Instant acceptedAt;
    Integer invitedBy;
}
