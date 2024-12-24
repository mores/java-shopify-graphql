package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetaobjectUpsertInput {
  
  private String handle;

  
  private List<MetaobjectFieldInput> fields;

  
  private MetaobjectCapabilityDataInput capabilities;

  public MetaobjectUpsertInput() {
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

  @Override
  public String toString() {
    return "MetaobjectUpsertInput{handle='" + handle + "', fields='" + fields + "', capabilities='" + capabilities + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectUpsertInput that = (MetaobjectUpsertInput) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(fields, that.fields) &&
        Objects.equals(capabilities, that.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, fields, capabilities);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String handle;

    
    private List<MetaobjectFieldInput> fields;

    
    private MetaobjectCapabilityDataInput capabilities;

    public MetaobjectUpsertInput build() {
      MetaobjectUpsertInput result = new MetaobjectUpsertInput();
      result.handle = this.handle;
      result.fields = this.fields;
      result.capabilities = this.capabilities;
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
  }
}
