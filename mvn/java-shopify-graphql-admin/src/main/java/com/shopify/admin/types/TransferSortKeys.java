package com.shopify.admin.types;

/**
 * The set of valid sort keys for the Transfer query.
 */
public enum TransferSortKeys {
  /**
   * Sort by the `created_at` value.
   */
  CREATED_AT,

  /**
   * Sort by the `destination_name` value.
   */
  DESTINATION_NAME,

  /**
   * Sort by the `expected_shipment_arrival` value.
   */
  EXPECTED_SHIPMENT_ARRIVAL,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `name` value.
   */
  NAME,

  /**
   * Sort by the `origin_name` value.
   */
  ORIGIN_NAME,

  /**
   * Sort by the `source_name` value.
   */
  SOURCE_NAME,

  /**
   * Sort by the `status` value.
   */
  STATUS
}
