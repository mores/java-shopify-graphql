package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `locationLocalPickupEnable` mutation.
 */
public class LocationLocalPickupEnablePayload {
  /**
   * The local pickup settings that were enabled.
   */
  private DeliveryLocalPickupSettings localPickupSettings;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DeliveryLocationLocalPickupSettingsError> userErrors;

  public LocationLocalPickupEnablePayload() {
  }

  /**
   * The local pickup settings that were enabled.
   */
  public DeliveryLocalPickupSettings getLocalPickupSettings() {
    return localPickupSettings;
  }

  public void setLocalPickupSettings(DeliveryLocalPickupSettings localPickupSettings) {
    this.localPickupSettings = localPickupSettings;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<DeliveryLocationLocalPickupSettingsError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DeliveryLocationLocalPickupSettingsError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "LocationLocalPickupEnablePayload{localPickupSettings='" + localPickupSettings + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationLocalPickupEnablePayload that = (LocationLocalPickupEnablePayload) o;
    return Objects.equals(localPickupSettings, that.localPickupSettings) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localPickupSettings, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The local pickup settings that were enabled.
     */
    private DeliveryLocalPickupSettings localPickupSettings;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DeliveryLocationLocalPickupSettingsError> userErrors;

    public LocationLocalPickupEnablePayload build() {
      LocationLocalPickupEnablePayload result = new LocationLocalPickupEnablePayload();
      result.localPickupSettings = this.localPickupSettings;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The local pickup settings that were enabled.
     */
    public Builder localPickupSettings(DeliveryLocalPickupSettings localPickupSettings) {
      this.localPickupSettings = localPickupSettings;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<DeliveryLocationLocalPickupSettingsError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
