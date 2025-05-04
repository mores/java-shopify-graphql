package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to detach media from a single variant.
 */
public class ProductVariantDetachMediaInput {
  /**
   * Specifies the variant from which media will be detached.
   */
  private String variantId;

  /**
   * Specifies the media to detach from the variant.
   */
  private List<String> mediaIds;

  public ProductVariantDetachMediaInput() {
  }

  /**
   * Specifies the variant from which media will be detached.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * Specifies the media to detach from the variant.
   */
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
    /**
     * Specifies the variant from which media will be detached.
     */
    private String variantId;

    /**
     * Specifies the media to detach from the variant.
     */
    private List<String> mediaIds;

    public ProductVariantDetachMediaInput build() {
      ProductVariantDetachMediaInput result = new ProductVariantDetachMediaInput();
      result.variantId = this.variantId;
      result.mediaIds = this.mediaIds;
      return result;
    }

    /**
     * Specifies the variant from which media will be detached.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * Specifies the media to detach from the variant.
     */
    public Builder mediaIds(List<String> mediaIds) {
      this.mediaIds = mediaIds;
      return this;
    }
  }
}
