package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Whether the shop is blocked from converting to full multi-location delivery
 * profiles mode. If the shop is blocked, then the blocking reasons are also returned.
 */
public class DeliveryLegacyModeBlocked {
  /**
   * Whether the shop can convert to full multi-location delivery profiles mode.
   */
  private boolean blocked;

  /**
   * The reasons why the shop is blocked from converting to full multi-location delivery profiles mode.
   */
  private List<DeliveryLegacyModeBlockedReason> reasons;

  public DeliveryLegacyModeBlocked() {
  }

  /**
   * Whether the shop can convert to full multi-location delivery profiles mode.
   */
  public boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(boolean blocked) {
    this.blocked = blocked;
  }

  /**
   * The reasons why the shop is blocked from converting to full multi-location delivery profiles mode.
   */
  public List<DeliveryLegacyModeBlockedReason> getReasons() {
    return reasons;
  }

  public void setReasons(List<DeliveryLegacyModeBlockedReason> reasons) {
    this.reasons = reasons;
  }

  @Override
  public String toString() {
    return "DeliveryLegacyModeBlocked{blocked='" + blocked + "', reasons='" + reasons + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryLegacyModeBlocked that = (DeliveryLegacyModeBlocked) o;
    return blocked == that.blocked &&
        Objects.equals(reasons, that.reasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blocked, reasons);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the shop can convert to full multi-location delivery profiles mode.
     */
    private boolean blocked;

    /**
     * The reasons why the shop is blocked from converting to full multi-location delivery profiles mode.
     */
    private List<DeliveryLegacyModeBlockedReason> reasons;

    public DeliveryLegacyModeBlocked build() {
      DeliveryLegacyModeBlocked result = new DeliveryLegacyModeBlocked();
      result.blocked = this.blocked;
      result.reasons = this.reasons;
      return result;
    }

    /**
     * Whether the shop can convert to full multi-location delivery profiles mode.
     */
    public Builder blocked(boolean blocked) {
      this.blocked = blocked;
      return this;
    }

    /**
     * The reasons why the shop is blocked from converting to full multi-location delivery profiles mode.
     */
    public Builder reasons(List<DeliveryLegacyModeBlockedReason> reasons) {
      this.reasons = reasons;
      return this;
    }
  }
}
