package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A shipping option shown to buyers at checkout. Implemented by concrete option types.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DeliveryCarrierCalculatedOptionDefinition.class, name = "DeliveryCarrierCalculatedOptionDefinition"),
    @JsonSubTypes.Type(value = DeliveryFlatRateOptionDefinition.class, name = "DeliveryFlatRateOptionDefinition"),
    @JsonSubTypes.Type(value = DeliveryValueBasedOptionDefinition.class, name = "DeliveryValueBasedOptionDefinition"),
    @JsonSubTypes.Type(value = DeliveryWeightBasedOptionDefinition.class, name = "DeliveryWeightBasedOptionDefinition")
})
public interface DeliveryOptionDefinition {
  /**
   * The currency used for all money values in this shipping option.
   */
  CurrencyCode getCurrency();

  /**
   * Optional description shown to buyers.
   */
  String getDescription();

  /**
   * The cart subtotal required for free shipping. Null if no threshold is set.
   */
  MoneyV2 getFreeDeliveryMinimumValue();

  /**
   * A globally unique ID for this shipping option.
   */
  String getId();

  /**
   * Collections that any rate group in this shipping option applies to.
   */
  CollectionConnection getIncludedCollections();

  /**
   * Origin locations that any rate group in this shipping option applies to.
   */
  LocationConnection getIncludedLocations();

  /**
   * Whether this shipping option is active and shown to buyers.
   */
  boolean getIsActive();
}
