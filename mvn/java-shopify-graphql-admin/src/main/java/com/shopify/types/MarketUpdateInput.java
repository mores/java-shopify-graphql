package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MarketUpdateInput {
  
  private String name;

  
  private String handle;

  
  private Boolean enabled;

  public MarketUpdateInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MarketUpdateInput{name='" + name + "', handle='" + handle + "', enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketUpdateInput that = (MarketUpdateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(enabled, that.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, handle, enabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String handle;

    
    private Boolean enabled;

    public MarketUpdateInput build() {
      MarketUpdateInput result = new MarketUpdateInput();
      result.name = this.name;
      result.handle = this.handle;
      result.enabled = this.enabled;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}
