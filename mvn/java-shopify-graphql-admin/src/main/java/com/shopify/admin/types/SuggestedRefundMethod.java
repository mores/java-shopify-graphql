package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Generic attributes of a suggested refund method.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes(@JsonSubTypes.Type(value = SuggestedStoreCreditRefund.class, name = "SuggestedStoreCreditRefund"))
public interface SuggestedRefundMethod {
  /**
   * The suggested amount to refund in shop and presentment currencies.
   */
  MoneyBag getAmount();

  /**
   * The maximum available amount to refund in shop and presentment currencies.
   */
  MoneyBag getMaximumRefundable();
}
