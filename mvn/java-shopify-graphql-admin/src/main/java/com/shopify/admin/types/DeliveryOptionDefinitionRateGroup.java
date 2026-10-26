package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A delivery rate group within an option definition.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DeliveryCarrierCalculatedRateGroup.class, name = "DeliveryCarrierCalculatedRateGroup"),
    @JsonSubTypes.Type(value = DeliveryFlatRateGroup.class, name = "DeliveryFlatRateGroup"),
    @JsonSubTypes.Type(value = DeliveryValueBasedRateGroup.class, name = "DeliveryValueBasedRateGroup"),
    @JsonSubTypes.Type(value = DeliveryWeightBasedRateGroup.class, name = "DeliveryWeightBasedRateGroup")
})
public interface DeliveryOptionDefinitionRateGroup {
  /**
   * Conditions that scope this rate group to specific collections or origin locations.
   */
  DeliveryRateGroupConditions getConditions();

  /**
   * A globally-unique ID.
   */
  String getId();
}
