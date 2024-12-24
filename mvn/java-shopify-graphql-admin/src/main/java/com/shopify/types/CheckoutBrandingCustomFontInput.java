package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingCustomFontInput {
  
  private int weight;

  
  private String genericFileId;

  public CheckoutBrandingCustomFontInput() {
  }

  
  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  
  public String getGenericFileId() {
    return genericFileId;
  }

  public void setGenericFileId(String genericFileId) {
    this.genericFileId = genericFileId;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCustomFontInput{weight='" + weight + "', genericFileId='" + genericFileId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCustomFontInput that = (CheckoutBrandingCustomFontInput) o;
    return weight == that.weight &&
        Objects.equals(genericFileId, that.genericFileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, genericFileId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int weight;

    
    private String genericFileId;

    public CheckoutBrandingCustomFontInput build() {
      CheckoutBrandingCustomFontInput result = new CheckoutBrandingCustomFontInput();
      result.weight = this.weight;
      result.genericFileId = this.genericFileId;
      return result;
    }

    
    public Builder weight(int weight) {
      this.weight = weight;
      return this;
    }

    
    public Builder genericFileId(String genericFileId) {
      this.genericFileId = genericFileId;
      return this;
    }
  }
}
