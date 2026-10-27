package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MetafieldDefinitionDeleteUserError`.
 */
public enum MetafieldDefinitionDeleteUserErrorCode {
  /**
   * The input value needs to be blank.
   */
  PRESENT,

  /**
   * Definition not found.
   */
  NOT_FOUND,

  /**
   * An internal error occurred.
   */
  INTERNAL_ERROR,

  /**
   * Deleting an id type metafield definition requires deletion of its associated metafields.
   */
  ID_TYPE_DELETION_ERROR,

  /**
   * Deleting a reference type metafield definition requires deletion of its associated metafields.
   */
  REFERENCE_TYPE_DELETION_ERROR,

  /**
   * Deleting a definition in a reserved namespace requires deletion of its associated metafields.
   */
  RESERVED_NAMESPACE_ORPHANED_METAFIELDS,

  /**
   * Action cannot proceed. Definition is currently in use.
   */
  METAFIELD_DEFINITION_IN_USE,

  /**
   * Definition is managed by app configuration and cannot be modified through the API.
   */
  APP_CONFIG_MANAGED,

  /**
   * Definition is required by an installed app and cannot be deleted.
   */
  STANDARD_METAFIELD_DEFINITION_DEPENDENT_ON_APP,

  /**
   * Owner type can't be used in this mutation.
   */
  DISALLOWED_OWNER_TYPE
}
