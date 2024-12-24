package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductVariantDetachMediaInput {
  
  private String variantId;

  
  private List<String> mediaIds;

  public ProductVariantDetachMediaInput() {
  }

  
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  
  public List<String> getMediaIds() {
    return mediaIds;
  }

  public void setMediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
  }

  @Override
  public String toString() {
    return "ProductVariantDetachMediaInput{variantId='" + variantId + "', mediaIds='" + mediaIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantDetachMediaInput that = (ProductVariantDetachMediaInput) o;
    return Objects.equals(variantId, that.variantId) &&
        Objects.equals(mediaIds, that.mediaIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantId, mediaIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String variantId;

    
    private List<String> mediaIds;

    public ProductVariantDetachMediaInput build() {
      ProductVariantDetachMediaInput result = new ProductVariantDetachMediaInput();
      result.variantId = this.variantId;
      result.mediaIds = this.mediaIds;
      return result;
    }

    
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    
    public Builder mediaIds(List<String> mediaIds) {
      this.mediaIds = mediaIds;
      return this;
    }
  }
}
