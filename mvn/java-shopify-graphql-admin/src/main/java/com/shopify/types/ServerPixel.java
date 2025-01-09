package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A server pixel stores configuration for streaming customer interactions to an EventBridge or PubSub endpoint.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ServerPixel implements com.shopify.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The current state of this server pixel.
   */
  private ServerPixelStatus status;

  /**
   * Address of the EventBridge or PubSub endpoint.
   */
  private String webhookEndpointAddress;

  public ServerPixel() {
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The current state of this server pixel.
   */
  public ServerPixelStatus getStatus() {
    return status;
  }

  public void setStatus(ServerPixelStatus status) {
    this.status = status;
  }

  /**
   * Address of the EventBridge or PubSub endpoint.
   */
  public String getWebhookEndpointAddress() {
    return webhookEndpointAddress;
  }

  public void setWebhookEndpointAddress(String webhookEndpointAddress) {
    this.webhookEndpointAddress = webhookEndpointAddress;
  }

  @Override
  public String toString() {
    return "ServerPixel{id='" + id + "', status='" + status + "', webhookEndpointAddress='" + webhookEndpointAddress + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServerPixel that = (ServerPixel) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(status, that.status) &&
        Objects.equals(webhookEndpointAddress, that.webhookEndpointAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, webhookEndpointAddress);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The current state of this server pixel.
     */
    private ServerPixelStatus status;

    /**
     * Address of the EventBridge or PubSub endpoint.
     */
    private String webhookEndpointAddress;

    public ServerPixel build() {
      ServerPixel result = new ServerPixel();
      result.id = this.id;
      result.status = this.status;
      result.webhookEndpointAddress = this.webhookEndpointAddress;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The current state of this server pixel.
     */
    public Builder status(ServerPixelStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Address of the EventBridge or PubSub endpoint.
     */
    public Builder webhookEndpointAddress(String webhookEndpointAddress) {
      this.webhookEndpointAddress = webhookEndpointAddress;
      return this;
    }
  }
}
