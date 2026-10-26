package com.shopify.admin.types;

/**
 * The accepted types of unit of measurement.
 */
public enum UnitPriceMeasurementMeasuredType {
  /**
   * Unit of measurements representing volumes.
   */
  VOLUME,

  /**
   * Unit of measurements representing weights.
   */
  WEIGHT,

  /**
   * Unit of measurements representing lengths.
   */
  LENGTH,

  /**
   * Unit of measurements representing areas.
   */
  AREA,

  /**
   * Unit of measurements representing counts.
   */
  COUNT,

  /**
   * The type of measurement is unknown. Upgrade to the latest version of the API to resolve this type.
   */
  UNKNOWN
}
