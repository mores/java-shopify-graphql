package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to append media to a single variant.
 */
public class ProductVariantAppendMediaInput {
  /**
   * Specifies the variant to which media will be appended.
   */
  private String variantId;

  /**
   * Specifies the media to append to the variant.
   */
  private List<String> mediaIds;

  public ProductVariantAppendMediaInput() {
  }

  /**
   * Specifies the variant to which media will be appended.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * Specifies the media to append to the variant.
   */
  public List<String> getMediaIds() {
    return mediaIds;
  }

  public void setMediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
  }

  @Override
  public String toString() {
    return "ProductVariantAppendMediaInput{variantId='" + variantId + "', mediaIds='" + mediaIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantAppendMediaInput that = (ProductVariantAppendMediaInput) o;
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
     * Specifies the variant to which media will be appended.
     */
    private String variantId;

    /**
     * Specifies the media to append to the variant.
     */
    private List<String> mediaIds;

    public ProductVariantAppendMediaInput build() {
      ProductVariantAppendMediaInput result = new ProductVariantAppendMediaInput();
      result.variantId = this.variantId;
      result.mediaIds = this.mediaIds;
      return result;
    }

    /**
     * Specifies the variant to which media will be appended.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * Specifies the media to append to the variant.
     */
    public Builder mediaIds(List<String> mediaIds) {
      this.mediaIds = mediaIds;
      return this;
    }
  }
}
