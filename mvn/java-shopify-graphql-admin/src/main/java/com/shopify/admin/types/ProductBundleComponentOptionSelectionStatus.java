package com.shopify.admin.types;

/**
 * The status of a component option value related to a bundle.
 */
public enum ProductBundleComponentOptionSelectionStatus {
  /**
   * The component option value is selected as sellable in the bundle.
   */
  SELECTED,

  /**
   * The component option value is not selected as sellable in the bundle.
   */
  DESELECTED,

  /**
   * The component option value was not initially selected, but is now available for the bundle.
   */
  NEW,

  /**
   * The component option value was selected, is no longer available for the bundle.
   */
  UNAVAILABLE
}
