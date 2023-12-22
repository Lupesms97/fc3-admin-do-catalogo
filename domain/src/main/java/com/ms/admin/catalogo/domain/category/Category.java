package com.ms.admin.catalogo.domain.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;


@Data

public class Category {
   private String id;
   private String name;
   private String description;
   private boolean isActive;
   private Instant createdAt;
   private Instant updatedAt;
   private Instant deletedAt;


   @Builder
   private Category(
           final String id,
           final String name,
           final String description,
           final boolean isActive,
           final Instant createdAt,
           final Instant updatedAt,
           final Instant deletedAt
   ) {
      this.id = id;
      this.name = name;
      this.description = description;
      this.isActive = isActive;
      this.createdAt = createdAt;
      this.updatedAt = updatedAt;
      this.deletedAt = deletedAt;
   }

   public static Category newCategory(String name, String description, boolean isActive){
      final String id = UUID.randomUUID().toString();

        return Category.builder()
                .id(id)
                .name(name)
                .description(description)
                .isActive(isActive)
                .createdAt(Instant.now())
                .updatedAt(Instant.now())
                .deletedAt(null)
                .build();

   }

}