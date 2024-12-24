package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class DeliveryCustomizationInput {
  
  private String functionId;

  
  private String title;

  
  private Boolean enabled;

  
  private List<MetafieldInput> metafields = Collections.emptyList();

  public DeliveryCustomizationInput() {
  }

  
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  @Override
  public String toString() {
    return "DeliveryCustomizationInput{functionId='" + functionId + "', title='" + title + "', enabled='" + enabled + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCustomizationInput that = (DeliveryCustomizationInput) o;
    return Objects.equals(functionId, that.functionId) &&
        Objects.equals(title, that.title) &&
        Objects.equals(enabled, that.enabled) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionId, title, enabled, metafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String functionId;

    
    private String title;

    
    private Boolean enabled;

    
    private List<MetafieldInput> metafields = Collections.emptyList();

    public DeliveryCustomizationInput build() {
      DeliveryCustomizationInput result = new DeliveryCustomizationInput();
      result.functionId = this.functionId;
      result.title = this.title;
      result.enabled = this.enabled;
      result.metafields = this.metafields;
      return result;
    }

    
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }
  }
}
