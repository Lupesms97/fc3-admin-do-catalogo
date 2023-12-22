package com.ms.admin.catalogo.domain;



import com.ms.admin.catalogo.domain.category.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void givenAvalidParams_whenCallNewCategory_thenInstatiateACategory(){
        final var expectedName = "Filmes";
        final var expectedDescription = "A Categoria mais assistida";
        final var expectedIsActive = true;

        final var actualCategory =
                Category.newCategory(expectedName, expectedDescription, expectedIsActive);

        Assertions.assertNotNull(actualCategory);
        Assertions.assertNotNull(actualCategory.getId());
        Assertions.assertEquals(expectedName, actualCategory.getName());
        Assertions.assertEquals(expectedDescription, actualCategory.getDescription());
        Assertions.assertTrue(expectedIsActive, String.valueOf(actualCategory.isActive()));
        Assertions.assertNotNull(actualCategory.getCreatedAt());
        Assertions.assertNotNull(actualCategory.getUpdatedAt());
        Assertions.assertNull(actualCategory.getDeletedAt());

    }

    @Test
    public void givenAIvalidNullName_whenCallNewCategoryandValidate_thenthenShouldThrowAExceptionDomain(){
        final String expectedName = null;
        final var expectedMessageError = "'name' should not be null";
        final var expectedCountError = 1;
        final var expectedDescription = "A Categoria mais assistida";
        final var expectedIsActive = true;

        final var actualCategory =
                Category.newCategory(expectedName, expectedDescription, expectedIsActive);

        final var actualException = Assertions.assertThrows(
                DomainException.class,
                () -> actualCategory.validate()
        );

        Assertions.assertEquals(expectedMessageError, actualException.getErros());
        Assertions.assertEquals(expectedCountError, actualException.getErrors().size());

    }

}
