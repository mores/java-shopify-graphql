package com.shopify.admin.types;

/**
 * The valid types of actions a user should be able to perform in an financial app.
 */
public enum BankingFinanceAppAccess {
  /**
   * Read access in the financial app.
   */
  READ_ACCESS,

  /**
   * Ability to perform actions that moves money.
   */
  MOVE_MONEY,

  /**
   * Indication that the user has restricted money movement.
   */
  MONEY_MOVEMENT_RESTRICTED,

  /**
   * Indication that the user has blocked money movement due to MFA disabled.
   */
  MONEY_MOVEMENT_BLOCKED_MFA
}
