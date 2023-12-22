package com.example.hospitalproject.entity;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@MappedSuperclass
@RequiredArgsConstructor
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = true)

    private Long id;
    private String createdBy;
    private String lastUpdatedBy;
    private Boolean active;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, nullable = true)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "last_updated_at", updatable = false, nullable = true)
    private LocalDateTime LastUpdatedAt;

    @PrePersist
    public void prePersist(){this.active=true;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(createdBy, that.createdBy) && Objects.equals(lastUpdatedBy, that.lastUpdatedBy) && Objects.equals(active, that.active) && Objects.equals(createdAt, that.createdAt) && Objects.equals(LastUpdatedAt, that.LastUpdatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdBy, lastUpdatedBy, active, createdAt, LastUpdatedAt);
    }
}
