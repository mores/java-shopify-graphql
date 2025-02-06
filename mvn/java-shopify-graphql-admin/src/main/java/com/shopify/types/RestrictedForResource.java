package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Information about product is restricted for a given resource.
 */
public class RestrictedForResource {
  /**
   * Returns true when the product is restricted for the given resource.
   */
  private boolean restricted;

  /**
   * Restriction reason for the given resource.
   */
  private String restrictedReason;

  public RestrictedForResource() {
  }

  /**
   * Returns true when the product is restricted for the given resource.
   */
  public boolean getRestricted() {
    return restricted;
  }

  public void setRestricted(boolean restricted) {
    this.restricted = restricted;
  }

  /**
   * Restriction reason for the given resource.
   */
  public String getRestrictedReason() {
    return restrictedReason;
  }

  public void setRestrictedReason(String restrictedReason) {
    this.restrictedReason = restrictedReason;
  }

  @Override
  public String toString() {
    return "RestrictedForResource{restricted='" + restricted + "', restrictedReason='" + restrictedReason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestrictedForResource that = (RestrictedForResource) o;
    return restricted == that.restricted &&
        Objects.equals(restrictedReason, that.restrictedReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restricted, restrictedReason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Returns true when the product is restricted for the given resource.
     */
    private boolean restricted;

    /**
     * Restriction reason for the given resource.
     */
    private String restrictedReason;

    public RestrictedForResource build() {
      RestrictedForResource result = new RestrictedForResource();
      result.restricted = this.restricted;
      result.restrictedReason = this.restrictedReason;
      return result;
    }

    /**
     * Returns true when the product is restricted for the given resource.
     */
    public Builder restricted(boolean restricted) {
      this.restricted = restricted;
      return this;
    }

    /**
     * Restriction reason for the given resource.
     */
    public Builder restrictedReason(String restrictedReason) {
      this.restrictedReason = restrictedReason;
      return this;
    }
  }
}
