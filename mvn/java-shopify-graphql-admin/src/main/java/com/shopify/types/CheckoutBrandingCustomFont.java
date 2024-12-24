package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CheckoutBrandingCustomFont implements com.shopify.types.CheckoutBrandingFont {
  
  private String genericFileId;

  
  private String sources;

  
  private Integer weight;

  public CheckoutBrandingCustomFont() {
  }

  
  public String getGenericFileId() {
    return genericFileId;
  }

  public void setGenericFileId(String genericFileId) {
    this.genericFileId = genericFileId;
  }

  
  public String getSources() {
    return sources;
  }

  public void setSources(String sources) {
    this.sources = sources;
  }

  
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCustomFont{genericFileId='" + genericFileId + "', sources='" + sources + "', weight='" + weight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCustomFont that = (CheckoutBrandingCustomFont) o;
    return Objects.equals(genericFileId, that.genericFileId) &&
        Objects.equals(sources, that.sources) &&
        Objects.equals(weight, that.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genericFileId, sources, weight);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String genericFileId;

    
    private String sources;

    
    private Integer weight;

    public CheckoutBrandingCustomFont build() {
      CheckoutBrandingCustomFont result = new CheckoutBrandingCustomFont();
      result.genericFileId = this.genericFileId;
      result.sources = this.sources;
      result.weight = this.weight;
      return result;
    }

    
    public Builder genericFileId(String genericFileId) {
      this.genericFileId = genericFileId;
      return this;
    }

    
    public Builder sources(String sources) {
      this.sources = sources;
      return this;
    }

    
    public Builder weight(Integer weight) {
      this.weight = weight;
      return this;
    }
  }
}
