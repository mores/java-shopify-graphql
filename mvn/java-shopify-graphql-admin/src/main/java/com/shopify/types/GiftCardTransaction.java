package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.time.OffsetDateTime;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = GiftCardCreditTransaction.class, name = "GiftCardCreditTransaction"),
    @JsonSubTypes.Type(value = GiftCardDebitTransaction.class, name = "GiftCardDebitTransaction")
})
public interface GiftCardTransaction {
  
  MoneyV2 getAmount();

  
  GiftCard getGiftCard();

  
  String getId();

  
  Metafield getMetafield();

  
  MetafieldConnection getMetafields();

  
  String getNote();

  
  PrivateMetafield getPrivateMetafield();

  
  PrivateMetafieldConnection getPrivateMetafields();

  
  OffsetDateTime getProcessedAt();
}
