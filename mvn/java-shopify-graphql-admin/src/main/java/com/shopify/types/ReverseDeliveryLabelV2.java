package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class ReverseDeliveryLabelV2 {
  
  private OffsetDateTime createdAt;

  
  private String publicFileUrl;

  
  private OffsetDateTime updatedAt;

  public ReverseDeliveryLabelV2() {
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getPublicFileUrl() {
    return publicFileUrl;
  }

  public void setPublicFileUrl(String publicFileUrl) {
    this.publicFileUrl = publicFileUrl;
  }

  
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
    
    private OffsetDateTime createdAt;

    
    private String publicFileUrl;

    
    private OffsetDateTime updatedAt;

    public ReverseDeliveryLabelV2 build() {
      ReverseDeliveryLabelV2 result = new ReverseDeliveryLabelV2();
      result.createdAt = this.createdAt;
      result.publicFileUrl = this.publicFileUrl;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder publicFileUrl(String publicFileUrl) {
      this.publicFileUrl = publicFileUrl;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
