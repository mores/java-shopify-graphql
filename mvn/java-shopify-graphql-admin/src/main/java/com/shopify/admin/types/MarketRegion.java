package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A geographic region which comprises a market.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes(@JsonSubTypes.Type(value = MarketRegionCountry.class, name = "MarketRegionCountry"))
public interface MarketRegion {
  /**
   * A globally-unique ID.
   */
  String getId();

  /**
   * The name of the region.
   */
  String getName();
}
