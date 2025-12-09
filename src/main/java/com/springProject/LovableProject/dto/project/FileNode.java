package com.springProject.LovableProject.dto.project;

import java.time.Instant;

public record FileNode(
        String path,
        Instant modified,
        Long size,
        String type
) {
}
