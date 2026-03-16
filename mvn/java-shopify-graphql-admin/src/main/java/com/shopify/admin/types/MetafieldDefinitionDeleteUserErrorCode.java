package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MetafieldDefinitionDeleteUserError`.
 */
public enum MetafieldDefinitionDeleteUserErrorCode {
  PRESENT,

  NOT_FOUND,

  INTERNAL_ERROR,

  ID_TYPE_DELETION_ERROR,

  REFERENCE_TYPE_DELETION_ERROR,

  RESERVED_NAMESPACE_ORPHANED_METAFIELDS,

  METAFIELD_DEFINITION_IN_USE,

  APP_CONFIG_MANAGED,

  STANDARD_METAFIELD_DEFINITION_DEPENDENT_ON_APP,

  DISALLOWED_OWNER_TYPE
}
