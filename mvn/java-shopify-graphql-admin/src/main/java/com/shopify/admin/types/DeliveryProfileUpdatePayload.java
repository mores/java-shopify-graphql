package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `deliveryProfileUpdate` mutation.
 */
public class DeliveryProfileUpdatePayload {
  /**
   * The delivery profile that was updated.
   */
  private DeliveryProfile profile;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public DeliveryProfileUpdatePayload() {
  }

  /**
   * The delivery profile that was updated.
   */
  public DeliveryProfile getProfile() {
    return profile;
  }

  public void setProfile(DeliveryProfile profile) {
    this.profile = profile;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DeliveryProfileUpdatePayload{profile='" + profile + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryProfileUpdatePayload that = (DeliveryProfileUpdatePayload) o;
    return Objects.equals(profile, that.profile) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The delivery profile that was updated.
     */
    private DeliveryProfile profile;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public DeliveryProfileUpdatePayload build() {
      DeliveryProfileUpdatePayload result = new DeliveryProfileUpdatePayload();
      result.profile = this.profile;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The delivery profile that was updated.
     */
    public Builder profile(DeliveryProfile profile) {
      this.profile = profile;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
