package com.shopify.admin.types;

/**
 * The valid types of actions a user should be able to perform in an financial app.
 */
public enum BankingFinanceAppAccess {
  READ_ACCESS,

  MOVE_MONEY,

  MONEY_MOVEMENT_RESTRICTED,

  MONEY_MOVEMENT_BLOCKED_MFA
}
