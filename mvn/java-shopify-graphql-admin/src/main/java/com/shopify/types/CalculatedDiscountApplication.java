package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A [discount application](https://shopify.dev/api/admin-graphql/latest/interfaces/discountapplication) involved in order editing that might be newly added or have new changes applied.
 */
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
  /**
   * The method by which the discount's value is allocated to its entitled items.
   */
  DiscountApplicationAllocationMethod getAllocationMethod();

  /**
   * The level at which the discount was applied.
   */
  DiscountApplicationLevel getAppliedTo();

  /**
   * The description of discount application. Indicates the reason why the discount was applied.
   */
  String getDescription();

  /**
   * A globally-unique ID.
   */
  String getId();

  /**
   * How the discount amount is distributed on the discounted lines.
   */
  DiscountApplicationTargetSelection getTargetSelection();

  /**
   * Whether the discount is applied on line items or shipping lines.
   */
  DiscountApplicationTargetType getTargetType();

  /**
   * The value of the discount application.
   */
  PricingValue getValue();
}
