package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A return line item of any type.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ReturnLineItem.class, name = "ReturnLineItem"),
    @JsonSubTypes.Type(value = UnverifiedReturnLineItem.class, name = "UnverifiedReturnLineItem")
})
public interface ReturnLineItemType {
  /**
   * A note from the customer that describes the item to be returned. Maximum length: 300 characters.
   */
  String getCustomerNote();

  /**
   * A globally-unique ID.
   */
  String getId();

  /**
   * The quantity being returned.
   */
  int getQuantity();

  /**
   * The quantity that can be refunded.
   */
  int getRefundableQuantity();

  /**
   * The quantity that was refunded.
   */
  int getRefundedQuantity();

  /**
   * The reason for returning the item.
   */
  ReturnReason getReturnReason();

  /**
   * Additional information about the reason for the return. Maximum length: 255 characters.
   */
  String getReturnReasonNote();
}
