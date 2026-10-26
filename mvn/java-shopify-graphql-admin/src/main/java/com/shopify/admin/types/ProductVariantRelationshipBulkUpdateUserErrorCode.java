package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductVariantRelationshipBulkUpdateUserError`.
 */
public enum ProductVariantRelationshipBulkUpdateUserErrorCode {
  /**
   * A parent product variant ID or product ID must be provided.
   */
  PARENT_REQUIRED,

  /**
   * Unable to create parent product variant.
   */
  FAILED_TO_CREATE,

  /**
   * The product variants were not found.
   */
  PRODUCT_VARIANTS_NOT_FOUND,

  /**
   * A parent product variant cannot contain itself as a component.
   */
  CIRCULAR_REFERENCE,

  /**
   * Nested parent product variants aren't supported.
   */
  NESTED_PARENT_PRODUCT_VARIANT,

  /**
   * Product variant relationships must have a quantity greater than 0.
   */
  INVALID_QUANTITY,

  /**
   * A parent product variant must not contain duplicate product variant relationships.
   */
  DUPLICATE_PRODUCT_VARIANT_RELATIONSHIP,

  /**
   * Exceeded the maximum allowable product variant relationships in a parent product variant.
   */
  EXCEEDED_PRODUCT_VARIANT_RELATIONSHIP_LIMIT,

  /**
   * A Core type relationship cannot be added to a composite product variant with SFN type relationships.
   */
  PRODUCT_VARIANT_RELATIONSHIP_TYPE_CONFLICT,

  /**
   * Unexpected error.
   */
  UNEXPECTED_ERROR,

  /**
   * Unable to remove product variant relationships.
   */
  FAILED_TO_REMOVE,

  /**
   * The product variant relationships to remove must be specified if all the
   * parent product variant's components aren't being removed.
   */
  MUST_SPECIFY_COMPONENTS,

  /**
   * Unable to update product variant relationships.
   */
  FAILED_TO_UPDATE,

  /**
   * Unable to update parent product variant price.
   */
  FAILED_TO_UPDATE_PARENT_PRODUCT_VARIANT_PRICE,

  /**
   * A price must be provided for a parent product variant if the price calculation is set to fixed.
   */
  UPDATE_PARENT_VARIANT_PRICE_REQUIRED,

  /**
   * Some of the provided product variants are not components of the specified parent product variant.
   */
  PRODUCT_VARIANTS_NOT_COMPONENTS,

  /**
   * The products for these product variants are already owned by another App.
   */
  PRODUCT_EXPANDER_APP_OWNERSHIP_ALREADY_EXISTS,

  /**
   * Multipack bundles are not supported.
   */
  UNSUPPORTED_MULTIPACK_RELATIONSHIP,

  /**
   * Gift cards cannot be parent product variants.
   */
  PARENT_PRODUCT_VARIANT_CANNOT_BE_GIFT_CARD,

  /**
   * Parent product variants cannot require a selling plan.
   */
  PARENT_PRODUCT_VARIANT_CANNOT_REQUIRE_SELLING_PLAN,

  /**
   * Combined listing cannot be parent product variants.
   */
  PARENT_PRODUCT_VARIANT_CANNOT_BE_COMBINED_LISTING,

  /**
   * Combined listing cannot be child product variants.
   */
  CHILD_PRODUCT_VARIANT_CANNOT_BE_COMBINED_LISTING
}
