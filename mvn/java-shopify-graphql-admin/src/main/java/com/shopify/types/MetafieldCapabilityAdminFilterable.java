package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldCapabilityAdminFilterable {
  
  private boolean eligible;

  
  private boolean enabled;

  
  private MetafieldDefinitionAdminFilterStatus status;

  public MetafieldCapabilityAdminFilterable() {
  }

  
  public boolean getEligible() {
    return eligible;
  }

  public void setEligible(boolean eligible) {
    this.eligible = eligible;
  }

  
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  
  public MetafieldDefinitionAdminFilterStatus getStatus() {
    return status;
  }

  public void setStatus(MetafieldDefinitionAdminFilterStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "MetafieldCapabilityAdminFilterable{eligible='" + eligible + "', enabled='" + enabled + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldCapabilityAdminFilterable that = (MetafieldCapabilityAdminFilterable) o;
    return eligible == that.eligible &&
        enabled == that.enabled &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligible, enabled, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean eligible;

    
    private boolean enabled;

    
    private MetafieldDefinitionAdminFilterStatus status;

    public MetafieldCapabilityAdminFilterable build() {
      MetafieldCapabilityAdminFilterable result = new MetafieldCapabilityAdminFilterable();
      result.eligible = this.eligible;
      result.enabled = this.enabled;
      result.status = this.status;
      return result;
    }

    
    public Builder eligible(boolean eligible) {
      this.eligible = eligible;
      return this;
    }

    
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    
    public Builder status(MetafieldDefinitionAdminFilterStatus status) {
      this.status = status;
      return this;
    }
  }
}
