package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.time.OffsetDateTime;

/**
 * Represents information about the metafields associated to the specified resource.
 */
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
  /**
   * The amount of the transaction.
   */
  MoneyV2 getAmount();

  /**
   * The gift card that the transaction belongs to.
   */
  GiftCard getGiftCard();

  /**
   * The unique ID for the transaction.
   */
  String getId();

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  Metafield getMetafield();

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  MetafieldConnection getMetafields();

  /**
   * A note about the transaction.
   */
  String getNote();

  /**
   * The date and time when the transaction was processed.
   */
  OffsetDateTime getProcessedAt();
}
