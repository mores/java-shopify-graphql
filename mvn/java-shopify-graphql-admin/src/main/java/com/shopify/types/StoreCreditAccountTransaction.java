package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;


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
  
  StoreCreditAccount getAccount();

  
  MoneyV2 getAmount();

  
  MoneyV2 getBalanceAfterTransaction();

  
  OffsetDateTime getCreatedAt();
}
