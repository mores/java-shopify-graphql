package com.shopify.admin.types;

/**
 * The set of strategies available for use on the `productOptionDelete` mutation.
 */
public enum ProductOptionDeleteStrategy {
  /**
   * The default strategy, the specified `Option` may only have one corresponding `value`.
   */
  DEFAULT,

  /**
   * An `Option` with multiple `values` can be deleted. Remaining variants will be
   * deleted, highest `position` first, in the event of duplicates being detected.
   */
  POSITION,

  /**
   * An `Option` with multiple `values` can be deleted, but the operation only succeeds if no product variants get deleted.
   */
  NON_DESTRUCTIVE
}
