package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsVerification implements com.shopify.types.Node {
  
  private String id;

  
  private ShopifyPaymentsVerificationStatus status;

  
  private ShopifyPaymentsVerificationSubject subject;

  public ShopifyPaymentsVerification() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public ShopifyPaymentsVerificationStatus getStatus() {
    return status;
  }

  public void setStatus(ShopifyPaymentsVerificationStatus status) {
    this.status = status;
  }

  
  public ShopifyPaymentsVerificationSubject getSubject() {
    return subject;
  }

  public void setSubject(ShopifyPaymentsVerificationSubject subject) {
    this.subject = subject;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsVerification{id='" + id + "', status='" + status + "', subject='" + subject + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsVerification that = (ShopifyPaymentsVerification) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(status, that.status) &&
        Objects.equals(subject, that.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, subject);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private ShopifyPaymentsVerificationStatus status;

    
    private ShopifyPaymentsVerificationSubject subject;

    public ShopifyPaymentsVerification build() {
      ShopifyPaymentsVerification result = new ShopifyPaymentsVerification();
      result.id = this.id;
      result.status = this.status;
      result.subject = this.subject;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder status(ShopifyPaymentsVerificationStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder subject(ShopifyPaymentsVerificationSubject subject) {
      this.subject = subject;
      return this;
    }
  }
}
