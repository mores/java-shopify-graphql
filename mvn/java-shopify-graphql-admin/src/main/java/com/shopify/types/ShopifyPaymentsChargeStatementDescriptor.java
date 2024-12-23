package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * The charge descriptors for a payments account.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ShopifyPaymentsDefaultChargeStatementDescriptor.class, name = "ShopifyPaymentsDefaultChargeStatementDescriptor"),
    @JsonSubTypes.Type(value = ShopifyPaymentsJpChargeStatementDescriptor.class, name = "ShopifyPaymentsJpChargeStatementDescriptor")
})
public interface ShopifyPaymentsChargeStatementDescriptor {
  /**
   * The default charge statement descriptor.
   */
  String getDefault();

  /**
   * The prefix of the statement descriptor.
   */
  String getPrefix();
}
