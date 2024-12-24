package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;


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
  
  String getCustomerNote();

  
  String getId();

  
  int getQuantity();

  
  int getRefundableQuantity();

  
  int getRefundedQuantity();

  
  ReturnReason getReturnReason();

  
  String getReturnReasonNote();
}
