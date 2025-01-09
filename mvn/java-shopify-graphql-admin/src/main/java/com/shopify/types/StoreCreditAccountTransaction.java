package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;

/**
 * Interface for a store credit account transaction.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = StoreCreditAccountCreditTransaction.class, name = "StoreCreditAccountCreditTransaction"),
    @JsonSubTypes.Type(value = StoreCreditAccountDebitRevertTransaction.class, name = "StoreCreditAccountDebitRevertTransaction"),
    @JsonSubTypes.Type(value = StoreCreditAccountDebitTransaction.class, name = "StoreCreditAccountDebitTransaction"),
    @JsonSubTypes.Type(value = StoreCreditAccountExpirationTransaction.class, name = "StoreCreditAccountExpirationTransaction")
})
public interface StoreCreditAccountTransaction {
  /**
   * The store credit account that the transaction belongs to.
   */
  StoreCreditAccount getAccount();

  /**
   * The amount of the transaction.
   */
  MoneyV2 getAmount();

  /**
   * The balance of the account after the transaction.
   */
  MoneyV2 getBalanceAfterTransaction();

  /**
   * The date and time when the transaction was created.
   */
  OffsetDateTime getCreatedAt();

  /**
   * The event that caused the store credit account transaction.
   */
  StoreCreditSystemEvent getEvent();

  /**
   * The origin of the store credit account transaction.
   */
  StoreCreditAccountTransactionOrigin getOrigin();
}
