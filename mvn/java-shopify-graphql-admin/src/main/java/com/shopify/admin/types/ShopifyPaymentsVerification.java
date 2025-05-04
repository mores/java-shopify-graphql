package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Each subject (individual) of an account has a verification object giving
 *  information about the verification state.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsVerification implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The status of the verification.
   */
  private ShopifyPaymentsVerificationStatus status;

  /**
   * The subject/individual who has to be verified.
   */
  private ShopifyPaymentsVerificationSubject subject;

  public ShopifyPaymentsVerification() {
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The status of the verification.
   */
  public ShopifyPaymentsVerificationStatus getStatus() {
    return status;
  }

  public void setStatus(ShopifyPaymentsVerificationStatus status) {
    this.status = status;
  }

  /**
   * The subject/individual who has to be verified.
   */
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
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The status of the verification.
     */
    private ShopifyPaymentsVerificationStatus status;

    /**
     * The subject/individual who has to be verified.
     */
    private ShopifyPaymentsVerificationSubject subject;

    public ShopifyPaymentsVerification build() {
      ShopifyPaymentsVerification result = new ShopifyPaymentsVerification();
      result.id = this.id;
      result.status = this.status;
      result.subject = this.subject;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The status of the verification.
     */
    public Builder status(ShopifyPaymentsVerificationStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The subject/individual who has to be verified.
     */
    public Builder subject(ShopifyPaymentsVerificationSubject subject) {
      this.subject = subject;
      return this;
    }
  }
}
