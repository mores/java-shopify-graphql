package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OnlineStorePasswordProtection {
  
  private boolean enabled;

  public OnlineStorePasswordProtection() {
  }

  
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "OnlineStorePasswordProtection{enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStorePasswordProtection that = (OnlineStorePasswordProtection) o;
    return enabled == that.enabled;
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean enabled;

    public OnlineStorePasswordProtection build() {
      OnlineStorePasswordProtection result = new OnlineStorePasswordProtection();
      result.enabled = this.enabled;
      return result;
    }

    
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}
