package com.shopify.storefront.types;

/**
 * The valid units of measurement for a unit price measurement.
 */
public enum UnitPriceMeasurementMeasuredUnit {
  /**
   * 1000 milliliters equals 1 liter.
   */
  ML,

  /**
   * 100 centiliters equals 1 liter.
   */
  CL,

  /**
   * Metric system unit of volume.
   */
  L,

  /**
   * 1 cubic meter equals 1000 liters.
   */
  M3,

  /**
   * Imperial system unit of volume (U.S. customary unit).
   */
  FLOZ,

  /**
   * 1 pint equals 16 fluid ounces (U.S. customary unit).
   */
  PT,

  /**
   * 1 quart equals 32 fluid ounces (U.S. customary unit).
   */
  QT,

  /**
   * 1 gallon equals 128 fluid ounces (U.S. customary unit).
   */
  GAL,

  /**
   * 1000 milligrams equals 1 gram.
   */
  MG,

  /**
   * Metric system unit of weight.
   */
  G,

  /**
   * 1 kilogram equals 1000 grams.
   */
  KG,

  /**
   * Imperial system unit of weight.
   */
  LB,

  /**
   * 16 ounces equals 1 pound.
   */
  OZ,

  /**
   * 1000 millimeters equals 1 meter.
   */
  MM,

  /**
   * 100 centimeters equals 1 meter.
   */
  CM,

  /**
   * Metric system unit of length.
   */
  M,

  /**
   * Imperial system unit of length.
   */
  IN,

  /**
   * 1 foot equals 12 inches.
   */
  FT,

  /**
   * 1 yard equals 36 inches.
   */
  YD,

  /**
   * Metric system unit of area.
   */
  M2,

  /**
   * Imperial system unit of area.
   */
  FT2,

  /**
   * 1 item, a unit of count.
   */
  ITEM,

  /**
   * The unit of measurement is unknown. Upgrade to the latest version of the API to resolve this unit.
   */
  UNKNOWN
}
