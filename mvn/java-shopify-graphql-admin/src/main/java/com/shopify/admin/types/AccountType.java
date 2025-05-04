package com.shopify.admin.types;

/**
 * Possible account types that a staff member can have.
 */
public enum AccountType {
  REGULAR,

  RESTRICTED,

  INVITED,

  REQUESTED,

  COLLABORATOR,

  COLLABORATOR_TEAM_MEMBER,

  SAML,

  INVITED_STORE_OWNER
}
