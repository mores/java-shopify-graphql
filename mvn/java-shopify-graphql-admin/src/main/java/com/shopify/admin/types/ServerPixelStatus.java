package com.shopify.admin.types;

/**
 * The current state of a server pixel.
 */
public enum ServerPixelStatus {
  /**
   * This server pixel is connected: it will stream customer events to the endpoint if it is configured properly.
   */
  CONNECTED,

  /**
   * This server pixel is disconnected and unconfigured: it does not stream events
   * to the endpoint and no endpoint address had been added to the server pixel.
   */
  DISCONNECTED_UNCONFIGURED,

  /**
   * This server pixel is disconnected: it does not stream events to the endpoint
   * and an endpoint address has been added to the server pixel.
   */
  DISCONNECTED_CONFIGURED
}
