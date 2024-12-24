package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ApiVersion {
  
  private String displayName;

  
  private String handle;

  
  private boolean supported;

  public ApiVersion() {
  }

  
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public boolean getSupported() {
    return supported;
  }

  public void setSupported(boolean supported) {
    this.supported = supported;
  }

  @Override
  public String toString() {
    return "ApiVersion{displayName='" + displayName + "', handle='" + handle + "', supported='" + supported + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApiVersion that = (ApiVersion) o;
    return Objects.equals(displayName, that.displayName) &&
        Objects.equals(handle, that.handle) &&
        supported == that.supported;
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, handle, supported);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String displayName;

    
    private String handle;

    
    private boolean supported;

    public ApiVersion build() {
      ApiVersion result = new ApiVersion();
      result.displayName = this.displayName;
      result.handle = this.handle;
      result.supported = this.supported;
      return result;
    }

    
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder supported(boolean supported) {
      this.supported = supported;
      return this;
    }
  }
}
