package com.springProject.LovableProject.repository;

import com.springProject.LovableProject.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query("""
            SELECT p FROM Project p
            WHERE p.deletedAt IS NULL
            AND p.owner.id=:userId
            ORDER BY p.updatedAt DESC
            """
    )
//here we use the Project(bcs writing JPQL) not sql.
    List<Project> findByAllAccessibleByUser(@Param("userId") Long userId);
}
