package com.springProject.LovableProject.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String name;

    @ManyToOne//here many stands for project and one for the user so many project belongs to 1 U
    @JoinColumn(name = "owner_id", nullable = false)
    User owner;

    //if I want to disclude this column, then I will use @Transient
    Boolean isPublic = false;

    @CreationTimestamp
    Instant createAt;
    @UpdateTimestamp
    Instant updatedAt;
    Instant deletedAt;//soft delete


}
