package com.shopify.types;

/**
 * Possible error codes that can be returned by `MetafieldDefinitionDeleteUserError`.
 */
public enum MetafieldDefinitionDeleteUserErrorCode {
  PRESENT,

  NOT_FOUND,

  INTERNAL_ERROR,

  REFERENCE_TYPE_DELETION_ERROR,

  RESERVED_NAMESPACE_ORPHANED_METAFIELDS,

  METAFIELD_DEFINITION_IN_USE,

  DISALLOWED_OWNER_TYPE
}
