package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ServerPixel implements com.shopify.types.Node {
  
  private String id;

  
  private ServerPixelStatus status;

  
  private String webhookEndpointAddress;

  public ServerPixel() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public ServerPixelStatus getStatus() {
    return status;
  }

  public void setStatus(ServerPixelStatus status) {
    this.status = status;
  }

  
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
    
    private String id;

    
    private ServerPixelStatus status;

    
    private String webhookEndpointAddress;

    public ServerPixel build() {
      ServerPixel result = new ServerPixel();
      result.id = this.id;
      result.status = this.status;
      result.webhookEndpointAddress = this.webhookEndpointAddress;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder status(ServerPixelStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder webhookEndpointAddress(String webhookEndpointAddress) {
      this.webhookEndpointAddress = webhookEndpointAddress;
      return this;
    }
  }
}
