package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AutomaticDiscountApplication.class, name = "AutomaticDiscountApplication"),
    @JsonSubTypes.Type(value = DiscountCodeApplication.class, name = "DiscountCodeApplication"),
    @JsonSubTypes.Type(value = ManualDiscountApplication.class, name = "ManualDiscountApplication"),
    @JsonSubTypes.Type(value = ScriptDiscountApplication.class, name = "ScriptDiscountApplication")
})
public interface DiscountApplication {
  
  DiscountApplicationAllocationMethod getAllocationMethod();

  
  int getIndex();

  
  DiscountApplicationTargetSelection getTargetSelection();

  
  DiscountApplicationTargetType getTargetType();

  
  PricingValue getValue();
}
