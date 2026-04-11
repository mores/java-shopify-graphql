package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a mobile device that Shopify Point of Sale has been installed on.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PointOfSaleDevice implements com.shopify.admin.types.Node {
  /**
   * The currently open payment session for this device.
   */
  private PointOfSaleDevicePaymentSession activePaymentSession;

  /**
   * The cash drawer that this device is currently assigned to.
   */
  private CashDrawer cashDrawer;

  /**
   * A globally-unique ID.
   */
  private String id;

  public PointOfSaleDevice() {
  }

  /**
   * The currently open payment session for this device.
   */
  public PointOfSaleDevicePaymentSession getActivePaymentSession() {
    return activePaymentSession;
  }

  public void setActivePaymentSession(PointOfSaleDevicePaymentSession activePaymentSession) {
    this.activePaymentSession = activePaymentSession;
  }

  /**
   * The cash drawer that this device is currently assigned to.
   */
  public CashDrawer getCashDrawer() {
    return cashDrawer;
  }

  public void setCashDrawer(CashDrawer cashDrawer) {
    this.cashDrawer = cashDrawer;
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

  @Override
  public String toString() {
    return "PointOfSaleDevice{activePaymentSession='" + activePaymentSession + "', cashDrawer='" + cashDrawer + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PointOfSaleDevice that = (PointOfSaleDevice) o;
    return Objects.equals(activePaymentSession, that.activePaymentSession) &&
        Objects.equals(cashDrawer, that.cashDrawer) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activePaymentSession, cashDrawer, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The currently open payment session for this device.
     */
    private PointOfSaleDevicePaymentSession activePaymentSession;

    /**
     * The cash drawer that this device is currently assigned to.
     */
    private CashDrawer cashDrawer;

    /**
     * A globally-unique ID.
     */
    private String id;

    public PointOfSaleDevice build() {
      PointOfSaleDevice result = new PointOfSaleDevice();
      result.activePaymentSession = this.activePaymentSession;
      result.cashDrawer = this.cashDrawer;
      result.id = this.id;
      return result;
    }

    /**
     * The currently open payment session for this device.
     */
    public Builder activePaymentSession(PointOfSaleDevicePaymentSession activePaymentSession) {
      this.activePaymentSession = activePaymentSession;
      return this;
    }

    /**
     * The cash drawer that this device is currently assigned to.
     */
    public Builder cashDrawer(CashDrawer cashDrawer) {
      this.cashDrawer = cashDrawer;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
