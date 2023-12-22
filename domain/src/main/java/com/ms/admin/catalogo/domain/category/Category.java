package com.ms.admin.catalogo.domain.category;
import com.ms.admin.catalogo.domain.AggregateRoot;
import com.ms.admin.catalogo.domain.validation.ValidationHandler;

import java.time.Instant;




public class Category extends AggregateRoot<CategoryID> {

   private String name;
   private String description;
   private boolean isActive;
   private Instant createdAt;
   private Instant updatedAt;
   private Instant deletedAt;



   private Category(
           final CategoryID anId,
           final String aName,
           final String aDescription,
           final boolean isActive,
           final Instant aCreationDate,
           final Instant aUpdateDate,
           final Instant aDeleteDate
   ) {
      super(anId);
      this.name = aName;
      this.description = aDescription;
      this.isActive = isActive;
      this.createdAt = aCreationDate;
      this.updatedAt = aUpdateDate;
      this.deletedAt = aDeleteDate;
   }

   public static Category newCategory(
           final String aName,
           final String aDescription,
           final boolean isActive
   ) {
      final var anId = CategoryID.unique();
        final var now = Instant.now();

        return new Category(
                anId,
                aName,
                aDescription,
                isActive,
                now,
                now,
                null);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public boolean isActive() {
      return isActive;
   }

   public void setActive(boolean active) {
      isActive = active;
   }

   public Instant getCreatedAt() {
      return createdAt;
   }

   public void setCreatedAt(Instant createdAt) {
      this.createdAt = createdAt;
   }

   public Instant getUpdatedAt() {
      return updatedAt;
   }

   public void setUpdatedAt(Instant updatedAt) {
      this.updatedAt = updatedAt;
   }

   public Instant getDeletedAt() {
      return deletedAt;
   }

   public void setDeletedAt(Instant deletedAt) {
      this.deletedAt = deletedAt;
   }


   @Override
   public void validate(final ValidationHandler handler) {

   }
}