package com.shopify.admin.types;

/**
 * Possible account types that a staff member can have.
 */
public enum AccountType {
  /**
   * The account can access the Shopify admin.
   */
  REGULAR,

  /**
   * The account cannot access the Shopify admin.
   */
  RESTRICTED,

  /**
   * The user has not yet accepted the invitation to create an account.
   */
  INVITED,

  /**
   * The admin has not yet accepted the request to create a collaborator account.
   */
  REQUESTED,

  /**
   * The account of a partner who collaborates with the merchant.
   */
  COLLABORATOR,

  /**
   * The account of a partner collaborator team member.
   */
  COLLABORATOR_TEAM_MEMBER,

  /**
   * The account can be signed into via a SAML provider.
   */
  SAML,

  /**
   * The user has not yet accepted the invitation to become the store owner.
   */
  INVITED_STORE_OWNER
}
