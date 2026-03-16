package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The `DeliverySetting` object enables you to manage shop-wide shipping settings.
 */
public class DeliverySetting {
  /**
   * Whether the shop is blocked from converting to full multi-location delivery
   * profiles mode. If the shop is blocked, then the blocking reasons are also
   * returned. Note: this field is effectively deprecated and will be removed in a
   * future version of the API.
   */
  private DeliveryLegacyModeBlocked legacyModeBlocked;

  /**
   * Enables legacy compatability mode for the multi-location delivery profiles
   * feature. Note: this field is effectively deprecated and will be removed in a
   * future version of the API.
   */
  private boolean legacyModeProfiles;

  public DeliverySetting() {
  }

  /**
   * Whether the shop is blocked from converting to full multi-location delivery
   * profiles mode. If the shop is blocked, then the blocking reasons are also
   * returned. Note: this field is effectively deprecated and will be removed in a
   * future version of the API.
   */
  public DeliveryLegacyModeBlocked getLegacyModeBlocked() {
    return legacyModeBlocked;
  }

  public void setLegacyModeBlocked(DeliveryLegacyModeBlocked legacyModeBlocked) {
    this.legacyModeBlocked = legacyModeBlocked;
  }

  /**
   * Enables legacy compatability mode for the multi-location delivery profiles
   * feature. Note: this field is effectively deprecated and will be removed in a
   * future version of the API.
   */
  public boolean getLegacyModeProfiles() {
    return legacyModeProfiles;
  }

  public void setLegacyModeProfiles(boolean legacyModeProfiles) {
    this.legacyModeProfiles = legacyModeProfiles;
  }

  @Override
  public String toString() {
    return "DeliverySetting{legacyModeBlocked='" + legacyModeBlocked + "', legacyModeProfiles='" + legacyModeProfiles + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliverySetting that = (DeliverySetting) o;
    return Objects.equals(legacyModeBlocked, that.legacyModeBlocked) &&
        legacyModeProfiles == that.legacyModeProfiles;
  }

  @Override
  public int hashCode() {
    return Objects.hash(legacyModeBlocked, legacyModeProfiles);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the shop is blocked from converting to full multi-location delivery
     * profiles mode. If the shop is blocked, then the blocking reasons are also
     * returned. Note: this field is effectively deprecated and will be removed in a
     * future version of the API.
     */
    private DeliveryLegacyModeBlocked legacyModeBlocked;

    /**
     * Enables legacy compatability mode for the multi-location delivery profiles
     * feature. Note: this field is effectively deprecated and will be removed in a
     * future version of the API.
     */
    private boolean legacyModeProfiles;

    public DeliverySetting build() {
      DeliverySetting result = new DeliverySetting();
      result.legacyModeBlocked = this.legacyModeBlocked;
      result.legacyModeProfiles = this.legacyModeProfiles;
      return result;
    }

    /**
     * Whether the shop is blocked from converting to full multi-location delivery
     * profiles mode. If the shop is blocked, then the blocking reasons are also
     * returned. Note: this field is effectively deprecated and will be removed in a
     * future version of the API.
     */
    public Builder legacyModeBlocked(DeliveryLegacyModeBlocked legacyModeBlocked) {
      this.legacyModeBlocked = legacyModeBlocked;
      return this;
    }

    /**
     * Enables legacy compatability mode for the multi-location delivery profiles
     * feature. Note: this field is effectively deprecated and will be removed in a
     * future version of the API.
     */
    public Builder legacyModeProfiles(boolean legacyModeProfiles) {
      this.legacyModeProfiles = legacyModeProfiles;
      return this;
    }
  }
}
