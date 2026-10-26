package com.shopify.admin.types;

/**
 * Represents the fallback avatar image for a staff member. This is used only if the staff member has no avatar image.
 */
public enum StaffMemberDefaultImage {
  /**
   * Returns a default avatar image for the staff member.
   */
  DEFAULT,

  /**
   * Returns a transparent avatar image for the staff member.
   */
  TRANSPARENT,

  /**
   * Returns a URL that returns a 404 error if the image is not present.
   */
  NOT_FOUND
}
