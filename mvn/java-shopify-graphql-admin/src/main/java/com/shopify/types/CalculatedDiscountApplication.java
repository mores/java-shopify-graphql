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
    @JsonSubTypes.Type(value = CalculatedAutomaticDiscountApplication.class, name = "CalculatedAutomaticDiscountApplication"),
    @JsonSubTypes.Type(value = CalculatedDiscountCodeApplication.class, name = "CalculatedDiscountCodeApplication"),
    @JsonSubTypes.Type(value = CalculatedManualDiscountApplication.class, name = "CalculatedManualDiscountApplication"),
    @JsonSubTypes.Type(value = CalculatedScriptDiscountApplication.class, name = "CalculatedScriptDiscountApplication")
})
public interface CalculatedDiscountApplication {
  
  DiscountApplicationAllocationMethod getAllocationMethod();

  
  DiscountApplicationLevel getAppliedTo();

  
  String getDescription();

  
  String getId();

  
  DiscountApplicationTargetSelection getTargetSelection();

  
  DiscountApplicationTargetType getTargetType();

  
  PricingValue getValue();
}
