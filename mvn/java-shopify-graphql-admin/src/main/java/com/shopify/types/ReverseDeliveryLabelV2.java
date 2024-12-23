package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The return label file information for a reverse delivery.
 */
public class ReverseDeliveryLabelV2 {
  /**
   * The date and time when the reverse delivery label was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A public link that can be used to download the label image.
   */
  private String publicFileUrl;

  /**
   * The date and time when the reverse delivery label was updated.
   */
  private OffsetDateTime updatedAt;

  public ReverseDeliveryLabelV2() {
  }

  /**
   * The date and time when the reverse delivery label was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A public link that can be used to download the label image.
   */
  public String getPublicFileUrl() {
    return publicFileUrl;
  }

  public void setPublicFileUrl(String publicFileUrl) {
    this.publicFileUrl = publicFileUrl;
  }

  /**
   * The date and time when the reverse delivery label was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryLabelV2{createdAt='" + createdAt + "', publicFileUrl='" + publicFileUrl + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryLabelV2 that = (ReverseDeliveryLabelV2) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(publicFileUrl, that.publicFileUrl) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, publicFileUrl, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the reverse delivery label was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A public link that can be used to download the label image.
     */
    private String publicFileUrl;

    /**
     * The date and time when the reverse delivery label was updated.
     */
    private OffsetDateTime updatedAt;

    public ReverseDeliveryLabelV2 build() {
      ReverseDeliveryLabelV2 result = new ReverseDeliveryLabelV2();
      result.createdAt = this.createdAt;
      result.publicFileUrl = this.publicFileUrl;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The date and time when the reverse delivery label was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A public link that can be used to download the label image.
     */
    public Builder publicFileUrl(String publicFileUrl) {
      this.publicFileUrl = publicFileUrl;
      return this;
    }

    /**
     * The date and time when the reverse delivery label was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
