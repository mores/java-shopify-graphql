package com.shopify.admin.types;

/**
 * The data type of a column.
 */
public enum ColumnDataType {
  /**
   * Represents an unspecified data type.
   */
  UNSPECIFIED,

  /**
   * Represents a monetary value.
   */
  MONEY,

  /**
   * Represents a percentage value.
   */
  PERCENT,

  /**
   * Represents an integer value.
   */
  INTEGER,

  /**
   * Represents a floating point value.
   */
  FLOAT,

  /**
   * Represents a decimal value.
   */
  DECIMAL,

  /**
   * Represents a string value.
   */
  STRING,

  /**
   * Represents a boolean value.
   */
  BOOLEAN,

  /**
   * Represents a timestamp value in seconds.
   */
  TIMESTAMP,

  /**
   * Represents a minute-level timestamp value.
   */
  MINUTE_TIMESTAMP,

  /**
   * Represents a hour-level timestamp value.
   */
  HOUR_TIMESTAMP,

  /**
   * Represents a day-level timestamp value.
   */
  DAY_TIMESTAMP,

  /**
   * Represents a week-level timestamp value.
   */
  WEEK_TIMESTAMP,

  /**
   * Represents a month-level timestamp value.
   */
  MONTH_TIMESTAMP,

  /**
   * Represents a quarter-level timestamp value.
   */
  QUARTER_TIMESTAMP,

  /**
   * Represents a year-level timestamp value.
   */
  YEAR_TIMESTAMP,

  /**
   * Represents a day of week value.
   */
  DAY_OF_WEEK,

  /**
   * Represents an hour of day value.
   */
  HOUR_OF_DAY,

  /**
   * Represents an identity value.
   */
  IDENTITY,

  /**
   * Represents a month of year value.
   */
  MONTH_OF_YEAR,

  /**
   * Represents a week of year value.
   */
  WEEK_OF_YEAR,

  /**
   * Represents a second-level timestamp value.
   */
  SECOND_TIMESTAMP,

  /**
   * Represents an array of values.
   */
  ARRAY,

  /**
   * Represents a duration in milliseconds.
   */
  MILLISECOND_DURATION,

  /**
   * Represents a duration in seconds.
   */
  SECOND_DURATION,

  /**
   * Represents a duration in minutes.
   */
  MINUTE_DURATION,

  /**
   * Represents a duration in hours.
   */
  HOUR_DURATION,

  /**
   * Represents a duration in days.
   */
  DAY_DURATION,

  /**
   * Represents a cumulative value.
   */
  CUMULATIVE,

  /**
   * Represents a geographic coordinate value.
   */
  GEO_COORDINATE,

  /**
   * Represents an entity reference value.
   */
  ENTITY,

  /**
   * Represents a hex color value.
   */
  COLOR,

  /**
   * Represents a string identity value.
   */
  STRING_IDENTITY,

  /**
   * Represents a rating value.
   */
  RATING,

  /**
   * Represents a unitless scalar value.
   */
  UNITLESS_SCALAR,

  /**
   * Represents a multiplier value.
   */
  MULTIPLIER
}
