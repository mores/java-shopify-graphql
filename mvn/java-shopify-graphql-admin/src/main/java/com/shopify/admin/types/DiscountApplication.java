package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Discount applications capture the intentions of a discount source at
 * the time of application on an order's line items or shipping lines.
 *
 * Discount applications don't represent the actual final amount discounted on a
 * line (line item or shipping line). The actual amount discounted on a line is
 * represented by the [DiscountAllocation](https://shopify.dev/api/admin-graphql/latest/objects/discountallocation) object.
 */
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
  /**
   * The method by which the discount's value is applied to its entitled items.
   */
  DiscountApplicationAllocationMethod getAllocationMethod();

  /**
   * An ordered index that can be used to identify the discount application and indicate the precedence
   * of the discount application for calculations.
   */
  int getIndex();

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
