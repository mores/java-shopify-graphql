package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class ValidationUpdateInput {
  
  private Boolean enable = false;

  
  private Boolean blockOnFailure = false;

  
  private List<MetafieldInput> metafields = Collections.emptyList();

  
  private String title;

  public ValidationUpdateInput() {
  }

  
  public Boolean getEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  
  public Boolean getBlockOnFailure() {
    return blockOnFailure;
  }

  public void setBlockOnFailure(Boolean blockOnFailure) {
    this.blockOnFailure = blockOnFailure;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "ValidationUpdateInput{enable='" + enable + "', blockOnFailure='" + blockOnFailure + "', metafields='" + metafields + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidationUpdateInput that = (ValidationUpdateInput) o;
    return Objects.equals(enable, that.enable) &&
        Objects.equals(blockOnFailure, that.blockOnFailure) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, blockOnFailure, metafields, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean enable = false;

    
    private Boolean blockOnFailure = false;

    
    private List<MetafieldInput> metafields = Collections.emptyList();

    
    private String title;

    public ValidationUpdateInput build() {
      ValidationUpdateInput result = new ValidationUpdateInput();
      result.enable = this.enable;
      result.blockOnFailure = this.blockOnFailure;
      result.metafields = this.metafields;
      result.title = this.title;
      return result;
    }

    
    public Builder enable(Boolean enable) {
      this.enable = enable;
      return this;
    }

    
    public Builder blockOnFailure(Boolean blockOnFailure) {
      this.blockOnFailure = blockOnFailure;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
