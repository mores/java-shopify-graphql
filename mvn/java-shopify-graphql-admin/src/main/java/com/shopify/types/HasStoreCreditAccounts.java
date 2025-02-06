package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Represents information about the store credit accounts associated to the specified owner.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes(@JsonSubTypes.Type(value = Customer.class, name = "Customer"))
public interface HasStoreCreditAccounts {
  /**
   * Returns a list of store credit accounts that belong to the owner resource.
   */
  StoreCreditAccountConnection getStoreCreditAccounts();
}
