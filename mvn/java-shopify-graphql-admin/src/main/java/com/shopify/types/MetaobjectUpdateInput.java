package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetaobjectUpdateInput {
  
  private String handle;

  
  private List<MetaobjectFieldInput> fields;

  
  private MetaobjectCapabilityDataInput capabilities;

  
  private Boolean redirectNewHandle = false;

  public MetaobjectUpdateInput() {
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public List<MetaobjectFieldInput> getFields() {
    return fields;
  }

  public void setFields(List<MetaobjectFieldInput> fields) {
    this.fields = fields;
  }

  
  public MetaobjectCapabilityDataInput getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetaobjectCapabilityDataInput capabilities) {
    this.capabilities = capabilities;
  }

  
  public Boolean getRedirectNewHandle() {
    return redirectNewHandle;
  }

  public void setRedirectNewHandle(Boolean redirectNewHandle) {
    this.redirectNewHandle = redirectNewHandle;
  }

  @Override
  public String toString() {
    return "MetaobjectUpdateInput{handle='" + handle + "', fields='" + fields + "', capabilities='" + capabilities + "', redirectNewHandle='" + redirectNewHandle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectUpdateInput that = (MetaobjectUpdateInput) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(fields, that.fields) &&
        Objects.equals(capabilities, that.capabilities) &&
        Objects.equals(redirectNewHandle, that.redirectNewHandle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, fields, capabilities, redirectNewHandle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String handle;

    
    private List<MetaobjectFieldInput> fields;

    
    private MetaobjectCapabilityDataInput capabilities;

    
    private Boolean redirectNewHandle = false;

    public MetaobjectUpdateInput build() {
      MetaobjectUpdateInput result = new MetaobjectUpdateInput();
      result.handle = this.handle;
      result.fields = this.fields;
      result.capabilities = this.capabilities;
      result.redirectNewHandle = this.redirectNewHandle;
      return result;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder fields(List<MetaobjectFieldInput> fields) {
      this.fields = fields;
      return this;
    }

    
    public Builder capabilities(MetaobjectCapabilityDataInput capabilities) {
      this.capabilities = capabilities;
      return this;
    }

    
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
      return this;
    }
  }
}
