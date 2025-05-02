package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.util.List;

/**
 * Represents a cart line common fields.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CartLine.class, name = "CartLine"),
    @JsonSubTypes.Type(value = ComponentizableCartLine.class, name = "ComponentizableCartLine")
})
public interface BaseCartLine {
  /**
   * An attribute associated with the cart line.
   */
  Attribute getAttribute();

  /**
   * The attributes associated with the cart line. Attributes are represented as key-value pairs.
   */
  List<Attribute> getAttributes();

  /**
   * The cost of the merchandise that the buyer will pay for at checkout. The costs
   * are subject to change and changes will be reflected at checkout.
   */
  CartLineCost getCost();

  /**
   * The estimated cost of the merchandise that the buyer will pay for at checkout.
   * The estimated costs are subject to change and changes will be reflected at checkout.
   */
  CartLineEstimatedCost getEstimatedCost();

  /**
   * A globally-unique ID.
   */
  String getId();

  /**
   * The merchandise that the buyer intends to purchase.
   */
  Merchandise getMerchandise();

  /**
   * The quantity of the merchandise that the customer intends to purchase.
   */
  int getQuantity();

  /**
   * The selling plan associated with the cart line and the effect that each
   * selling plan has on variants when they're purchased.
   */
  SellingPlanAllocation getSellingPlanAllocation();
}
