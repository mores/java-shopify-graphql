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
   * The currently open payment session for this device. Data is returned only if
   * the device's location has a POS Pro subscription.
   */
  private PointOfSaleDevicePaymentSession activePaymentSession;

  /**
   * The cash drawer that this device is currently assigned to. Data is returned
   * only if the device's location has a POS Pro subscription.
   */
  private CashDrawer cashDrawer;

  /**
   * The Shopify-assigned fiscal register identifier for the device, such as
   * Sweden's manufacturing number (tillverkningsnummer). Only present for devices
   * at locations in countries whose fiscal regulations require registering the
   * device with the tax authority.
   */
  private String fiscalDeviceIdentifier;

  /**
   * A globally-unique ID.
   */
  private String id;

  public PointOfSaleDevice() {
  }

  /**
   * The currently open payment session for this device. Data is returned only if
   * the device's location has a POS Pro subscription.
   */
  public PointOfSaleDevicePaymentSession getActivePaymentSession() {
    return activePaymentSession;
  }

  public void setActivePaymentSession(PointOfSaleDevicePaymentSession activePaymentSession) {
    this.activePaymentSession = activePaymentSession;
  }

  /**
   * The cash drawer that this device is currently assigned to. Data is returned
   * only if the device's location has a POS Pro subscription.
   */
  public CashDrawer getCashDrawer() {
    return cashDrawer;
  }

  public void setCashDrawer(CashDrawer cashDrawer) {
    this.cashDrawer = cashDrawer;
  }

  /**
   * The Shopify-assigned fiscal register identifier for the device, such as
   * Sweden's manufacturing number (tillverkningsnummer). Only present for devices
   * at locations in countries whose fiscal regulations require registering the
   * device with the tax authority.
   */
  public String getFiscalDeviceIdentifier() {
    return fiscalDeviceIdentifier;
  }

  public void setFiscalDeviceIdentifier(String fiscalDeviceIdentifier) {
    this.fiscalDeviceIdentifier = fiscalDeviceIdentifier;
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
    return "PointOfSaleDevice{activePaymentSession='" + activePaymentSession + "', cashDrawer='" + cashDrawer + "', fiscalDeviceIdentifier='" + fiscalDeviceIdentifier + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PointOfSaleDevice that = (PointOfSaleDevice) o;
    return Objects.equals(activePaymentSession, that.activePaymentSession) &&
        Objects.equals(cashDrawer, that.cashDrawer) &&
        Objects.equals(fiscalDeviceIdentifier, that.fiscalDeviceIdentifier) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activePaymentSession, cashDrawer, fiscalDeviceIdentifier, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The currently open payment session for this device. Data is returned only if
     * the device's location has a POS Pro subscription.
     */
    private PointOfSaleDevicePaymentSession activePaymentSession;

    /**
     * The cash drawer that this device is currently assigned to. Data is returned
     * only if the device's location has a POS Pro subscription.
     */
    private CashDrawer cashDrawer;

    /**
     * The Shopify-assigned fiscal register identifier for the device, such as
     * Sweden's manufacturing number (tillverkningsnummer). Only present for devices
     * at locations in countries whose fiscal regulations require registering the
     * device with the tax authority.
     */
    private String fiscalDeviceIdentifier;

    /**
     * A globally-unique ID.
     */
    private String id;

    public PointOfSaleDevice build() {
      PointOfSaleDevice result = new PointOfSaleDevice();
      result.activePaymentSession = this.activePaymentSession;
      result.cashDrawer = this.cashDrawer;
      result.fiscalDeviceIdentifier = this.fiscalDeviceIdentifier;
      result.id = this.id;
      return result;
    }

    /**
     * The currently open payment session for this device. Data is returned only if
     * the device's location has a POS Pro subscription.
     */
    public Builder activePaymentSession(PointOfSaleDevicePaymentSession activePaymentSession) {
      this.activePaymentSession = activePaymentSession;
      return this;
    }

    /**
     * The cash drawer that this device is currently assigned to. Data is returned
     * only if the device's location has a POS Pro subscription.
     */
    public Builder cashDrawer(CashDrawer cashDrawer) {
      this.cashDrawer = cashDrawer;
      return this;
    }

    /**
     * The Shopify-assigned fiscal register identifier for the device, such as
     * Sweden's manufacturing number (tillverkningsnummer). Only present for devices
     * at locations in countries whose fiscal regulations require registering the
     * device with the tax authority.
     */
    public Builder fiscalDeviceIdentifier(String fiscalDeviceIdentifier) {
      this.fiscalDeviceIdentifier = fiscalDeviceIdentifier;
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
