package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilitiesOnlineStore {
  
  private MetaobjectCapabilityDefinitionDataOnlineStore data;

  
  private boolean enabled;

  public MetaobjectCapabilitiesOnlineStore() {
  }

  
  public MetaobjectCapabilityDefinitionDataOnlineStore getData() {
    return data;
  }

  public void setData(MetaobjectCapabilityDefinitionDataOnlineStore data) {
    this.data = data;
  }

  
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilitiesOnlineStore{data='" + data + "', enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilitiesOnlineStore that = (MetaobjectCapabilitiesOnlineStore) o;
    return Objects.equals(data, that.data) &&
        enabled == that.enabled;
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, enabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetaobjectCapabilityDefinitionDataOnlineStore data;

    
    private boolean enabled;

    public MetaobjectCapabilitiesOnlineStore build() {
      MetaobjectCapabilitiesOnlineStore result = new MetaobjectCapabilitiesOnlineStore();
      result.data = this.data;
      result.enabled = this.enabled;
      return result;
    }

    
    public Builder data(MetaobjectCapabilityDefinitionDataOnlineStore data) {
      this.data = data;
      return this;
    }

    
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}
