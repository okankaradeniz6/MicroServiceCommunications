package net.javaguides.organizationservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Schema(
        description = "Organization DTO Model Information"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto {
    private Long id;

    @Schema(
            description = "Organization Name"
    )
    private String organizationName;

    @Schema(
            description = "Organization Description"
    )
    private String organizationDescription;

    @Schema(
            description = "Organization Code"
    )
    private String organizationCode;

    @Schema(
            description = "Created Date"
    )
    private LocalDateTime createdDate;
}
