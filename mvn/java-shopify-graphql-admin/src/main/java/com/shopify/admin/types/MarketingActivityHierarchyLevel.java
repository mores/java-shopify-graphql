package com.shopify.admin.types;

/**
 * Hierarchy levels for external marketing activities.
 */
public enum MarketingActivityHierarchyLevel {
  /**
   * An advertisement activity. Must be parented by an ad group or a campaign
   * activity, and must be assigned tracking parameters (URL or UTM).
   */
  AD,

  /**
   * A group of advertisement activities. Must be parented by a campaign activity.
   */
  AD_GROUP,

  /**
   * A campaign activity. May contain either ad groups or ads as child activities.
   * If childless, then the campaign activity should have tracking parameters
   * assigned (URL or UTM) otherwise it won't appear in marketing reports.
   */
  CAMPAIGN
}
