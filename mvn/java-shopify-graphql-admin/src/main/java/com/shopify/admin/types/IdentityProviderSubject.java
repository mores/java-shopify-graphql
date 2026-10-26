package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents a customer's identity provider subject identifier.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class IdentityProviderSubject implements com.shopify.admin.types.Node {
  /**
   * The date and time when the provider subject was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A globally-unique ID for the provider subject.
   */
  private String id;

  /**
   * The merchant-configured name of the third-party identity provider.
   */
  private String providerName;

  /**
   * The unique subject identifier assigned to the customer by the authentication provider.
   */
  private String subject;

  /**
   * The date and time when the provider subject was last updated.
   */
  private OffsetDateTime updatedAt;

  public IdentityProviderSubject() {
  }

  /**
   * The date and time when the provider subject was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A globally-unique ID for the provider subject.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The merchant-configured name of the third-party identity provider.
   */
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  /**
   * The unique subject identifier assigned to the customer by the authentication provider.
   */
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * The date and time when the provider subject was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "IdentityProviderSubject{createdAt='" + createdAt + "', id='" + id + "', providerName='" + providerName + "', subject='" + subject + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IdentityProviderSubject that = (IdentityProviderSubject) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(providerName, that.providerName) &&
        Objects.equals(subject, that.subject) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, providerName, subject, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the provider subject was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A globally-unique ID for the provider subject.
     */
    private String id;

    /**
     * The merchant-configured name of the third-party identity provider.
     */
    private String providerName;

    /**
     * The unique subject identifier assigned to the customer by the authentication provider.
     */
    private String subject;

    /**
     * The date and time when the provider subject was last updated.
     */
    private OffsetDateTime updatedAt;

    public IdentityProviderSubject build() {
      IdentityProviderSubject result = new IdentityProviderSubject();
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.providerName = this.providerName;
      result.subject = this.subject;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The date and time when the provider subject was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A globally-unique ID for the provider subject.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The merchant-configured name of the third-party identity provider.
     */
    public Builder providerName(String providerName) {
      this.providerName = providerName;
      return this;
    }

    /**
     * The unique subject identifier assigned to the customer by the authentication provider.
     */
    public Builder subject(String subject) {
      this.subject = subject;
      return this;
    }

    /**
     * The date and time when the provider subject was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
