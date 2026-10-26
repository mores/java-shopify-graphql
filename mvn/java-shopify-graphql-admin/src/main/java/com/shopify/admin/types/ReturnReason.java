package com.shopify.admin.types;

/**
 * The reason for returning the return line item.
 */
public enum ReturnReason {
  /**
   * The item is returned because the size was too small. Displays as **Size was too small**.
   */
  SIZE_TOO_SMALL,

  /**
   * The item is returned because the size was too large. Displays as **Size was too large**.
   */
  SIZE_TOO_LARGE,

  /**
   * The item is returned because the customer changed their mind. Displays as **Customer changed their mind**.
   */
  UNWANTED,

  /**
   * The item is returned because it was not as described. Displays as **Item not as described**.
   */
  NOT_AS_DESCRIBED,

  /**
   * The item is returned because the customer received the wrong one. Displays as **Received the wrong item**.
   */
  WRONG_ITEM,

  /**
   * The item is returned because it is damaged or defective. Displays as **Damaged or defective**.
   */
  DEFECTIVE,

  /**
   * The item is returned because the buyer did not like the style. Displays as **Style**.
   */
  STYLE,

  /**
   * The item is returned because the buyer did not like the color. Displays as **Color**.
   */
  COLOR,

  /**
   * The item is returned for another reason. For this value, a return reason note is also provided. Displays as **Other**.
   */
  OTHER,

  /**
   * The item is returned because of an unknown reason. Displays as **Unknown**.
   */
  UNKNOWN
}
