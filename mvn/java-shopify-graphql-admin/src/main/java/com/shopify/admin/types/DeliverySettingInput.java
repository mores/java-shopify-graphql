package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for shop-level delivery settings.
 */
public class DeliverySettingInput {
  /**
   * Whether legacy compatability mode is enabled for the multi-location delivery
   * profiles feature. Note: this field is effectively deprecated and will be
   * removed in a future version of the API.
   */
  private Boolean legacyModeProfiles;

  public DeliverySettingInput() {
  }

  /**
   * Whether legacy compatability mode is enabled for the multi-location delivery
   * profiles feature. Note: this field is effectively deprecated and will be
   * removed in a future version of the API.
   */
  public Boolean getLegacyModeProfiles() {
    return legacyModeProfiles;
  }

  public void setLegacyModeProfiles(Boolean legacyModeProfiles) {
    this.legacyModeProfiles = legacyModeProfiles;
  }

  @Override
  public String toString() {
    return "DeliverySettingInput{legacyModeProfiles='" + legacyModeProfiles + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliverySettingInput that = (DeliverySettingInput) o;
    return Objects.equals(legacyModeProfiles, that.legacyModeProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legacyModeProfiles);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether legacy compatability mode is enabled for the multi-location delivery
     * profiles feature. Note: this field is effectively deprecated and will be
     * removed in a future version of the API.
     */
    private Boolean legacyModeProfiles;

    public DeliverySettingInput build() {
      DeliverySettingInput result = new DeliverySettingInput();
      result.legacyModeProfiles = this.legacyModeProfiles;
      return result;
    }

    /**
     * Whether legacy compatability mode is enabled for the multi-location delivery
     * profiles feature. Note: this field is effectively deprecated and will be
     * removed in a future version of the API.
     */
    public Builder legacyModeProfiles(Boolean legacyModeProfiles) {
      this.legacyModeProfiles = legacyModeProfiles;
      return this;
    }
  }
}
