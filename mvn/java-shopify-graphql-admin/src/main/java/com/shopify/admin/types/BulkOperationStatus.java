package com.shopify.admin.types;

/**
 * The valid values for the status of a bulk operation.
 */
public enum BulkOperationStatus {
  /**
   * The bulk operation has been canceled.
   */
  CANCELED,

  /**
   * Cancelation has been initiated on the bulk operation. There may be a short delay from when a cancelation
   * starts until the operation is actually canceled.
   */
  CANCELING,

  /**
   * The bulk operation has successfully completed.
   */
  COMPLETED,

  /**
   * The bulk operation has been created.
   */
  CREATED,

  /**
   * The bulk operation URL has expired.
   */
  EXPIRED,

  /**
   * The bulk operation has failed. For information on why the operation failed, use
   * [BulkOperation.errorCode](https://shopify.dev/api/admin-graphql/latest/enums/bulkoperationerrorcode).
   */
  FAILED,

  /**
   * The bulk operation is running.
   */
  RUNNING
}
