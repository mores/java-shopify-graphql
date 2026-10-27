package com.shopify.admin.types;

/**
 * The kind of dynamically generated column.
 */
public enum ShopifyqlDynamicColumnType {
  /**
   * Unspecified dynamic column type.
   */
  UNSPECIFIED,

  /**
   * A column with totals.
   */
  TOTALS,

  /**
   * A comparison data column (the comparison period).
   */
  COMPARISON,

  /**
   * A percent-change column.
   */
  PERCENT_CHANGE,

  /**
   * A comparison column with totals.
   */
  COMPARISON_TOTALS,

  /**
   * A benchmark data column.
   */
  BENCHMARKS,

  /**
   * A benchmark column with totals.
   */
  BENCHMARK_TOTALS,

  /**
   * A cumulative column.
   */
  CUMULATIVE,

  /**
   * A comparison column with cumulative data.
   */
  COMPARISON_CUMULATIVE,

  /**
   * An attribution column.
   */
  ATTRIBUTION,

  /**
   * An attribution column with totals.
   */
  ATTRIBUTION_TOTALS,

  /**
   * An attribution column with comparison data.
   */
  ATTRIBUTION_COMPARISON,

  /**
   * An attribution column with percent-change data.
   */
  ATTRIBUTION_PERCENT_CHANGE,

  /**
   * An attribution column with comparison data and totals.
   */
  ATTRIBUTION_COMPARISON_TOTALS,

  /**
   * An attribution column with cumulative data.
   */
  ATTRIBUTION_CUMULATIVE,

  /**
   * An attribution column with comparison and cumulative data.
   */
  ATTRIBUTION_COMPARISON_CUMULATIVE,

  /**
   * A rollout results column.
   */
  ROLLOUT_RESULTS,

  /**
   * A percentage of the corresponding overall totals column.
   */
  PERCENT_OF_TOTAL
}
