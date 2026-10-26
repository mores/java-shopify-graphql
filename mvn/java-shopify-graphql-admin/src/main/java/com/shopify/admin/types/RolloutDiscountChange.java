package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A rollout treatment change that applies to a discount. The concrete type
 * (`RolloutDiscountActivateChange` or `RolloutDiscountExpireChange`) tells you
 * whether the treatment activates or expires the discount for the buyers it serves.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = RolloutDiscountActivateChange.class, name = "RolloutDiscountActivateChange"),
    @JsonSubTypes.Type(value = RolloutDiscountExpireChange.class, name = "RolloutDiscountExpireChange")
})
public interface RolloutDiscountChange {
  /**
   * The discount that the change applies to. Returns `null` when the discount has been deleted or the caller can't read it.
   */
  DiscountNode getDiscount();

  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  String getId();
}
