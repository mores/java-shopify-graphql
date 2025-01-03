package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class EventBridgeServerPixelUpdatePayload {
  
  private ServerPixel serverPixel;

  
  private List<ErrorsServerPixelUserError> userErrors;

  public EventBridgeServerPixelUpdatePayload() {
  }

  
  public ServerPixel getServerPixel() {
    return serverPixel;
  }

  public void setServerPixel(ServerPixel serverPixel) {
    this.serverPixel = serverPixel;
  }

  
  public List<ErrorsServerPixelUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ErrorsServerPixelUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "EventBridgeServerPixelUpdatePayload{serverPixel='" + serverPixel + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EventBridgeServerPixelUpdatePayload that = (EventBridgeServerPixelUpdatePayload) o;
    return Objects.equals(serverPixel, that.serverPixel) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverPixel, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ServerPixel serverPixel;

    
    private List<ErrorsServerPixelUserError> userErrors;

    public EventBridgeServerPixelUpdatePayload build() {
      EventBridgeServerPixelUpdatePayload result = new EventBridgeServerPixelUpdatePayload();
      result.serverPixel = this.serverPixel;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder serverPixel(ServerPixel serverPixel) {
      this.serverPixel = serverPixel;
      return this;
    }

    
    public Builder userErrors(List<ErrorsServerPixelUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
