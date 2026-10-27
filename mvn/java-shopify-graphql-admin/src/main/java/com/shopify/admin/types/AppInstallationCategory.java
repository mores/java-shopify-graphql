package com.shopify.admin.types;

/**
 * The possible categories of an app installation, based on their purpose
 * or the environment they can run in.
 */
public enum AppInstallationCategory {
  /**
   * Apps that serve as channels through which sales are made, such as the online store.
   */
  CHANNEL,

  /**
   * Apps that can be used in the POS mobile client.
   */
  POS_EMBEDDED
}
