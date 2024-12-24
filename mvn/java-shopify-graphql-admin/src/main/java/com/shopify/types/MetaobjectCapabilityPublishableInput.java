package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilityPublishableInput {
  
  private boolean enabled;

  public MetaobjectCapabilityPublishableInput() {
  }

  
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityPublishableInput{enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityPublishableInput that = (MetaobjectCapabilityPublishableInput) o;
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

    public MetaobjectCapabilityPublishableInput build() {
      MetaobjectCapabilityPublishableInput result = new MetaobjectCapabilityPublishableInput();
      result.enabled = this.enabled;
      return result;
    }

    
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}
