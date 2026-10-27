package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for the fulfillment order, shipping date and time, package
 * details, weight, notification setting, and optional rate preference used to
 * purchase a shipping label.
 */
public class ShippingLabelPurchaseInput {
  /**
   * The ID of the fulfillment order to create the shipping label for. The
   * fulfillment order must be fulfillable, require shipping, and have a
   * destination shipping address.
   */
  private String fulfillmentOrderId;

  /**
   * The date and time when the package is expected to be shipped. The value must not be in the past.
   */
  private OffsetDateTime shippingDatetime;

  /**
   * The package to use for the shipment. Provide either a custom package or a carrier-provided package.
   */
  private PackageInfoInput packageInfo;

  /**
   * Total shipment weight, including the items being fulfilled and the package. If
   * omitted, the total weight used is calculated using the weight of the empty
   * package and the weight of the fulfillable line items.
   */
  private WeightInput totalWeight;

  /**
   * Whether to notify the customer after the shipping label is purchased.
   */
  private Boolean notifyCustomer = false;

  /**
   * The preferred carrier and service to use for the shipping label. If omitted,
   * the mutation uses Shopify Shipping's default rate selection.
   */
  private PreferredRateSelectionInput preferredRateSelection;

  /**
   * A custom ship-from origin address that overrides the fulfillment order's
   * assigned location for this label. If not provided, the assigned location is used.
   */
  private MailingAddressInput originAddress;

  public ShippingLabelPurchaseInput() {
  }

  /**
   * The ID of the fulfillment order to create the shipping label for. The
   * fulfillment order must be fulfillable, require shipping, and have a
   * destination shipping address.
   */
  public String getFulfillmentOrderId() {
    return fulfillmentOrderId;
  }

  public void setFulfillmentOrderId(String fulfillmentOrderId) {
    this.fulfillmentOrderId = fulfillmentOrderId;
  }

  /**
   * The date and time when the package is expected to be shipped. The value must not be in the past.
   */
  public OffsetDateTime getShippingDatetime() {
    return shippingDatetime;
  }

  public void setShippingDatetime(OffsetDateTime shippingDatetime) {
    this.shippingDatetime = shippingDatetime;
  }

  /**
   * The package to use for the shipment. Provide either a custom package or a carrier-provided package.
   */
  public PackageInfoInput getPackageInfo() {
    return packageInfo;
  }

  public void setPackageInfo(PackageInfoInput packageInfo) {
    this.packageInfo = packageInfo;
  }

  /**
   * Total shipment weight, including the items being fulfilled and the package. If
   * omitted, the total weight used is calculated using the weight of the empty
   * package and the weight of the fulfillable line items.
   */
  public WeightInput getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(WeightInput totalWeight) {
    this.totalWeight = totalWeight;
  }

  /**
   * Whether to notify the customer after the shipping label is purchased.
   */
  public Boolean getNotifyCustomer() {
    return notifyCustomer;
  }

  public void setNotifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
  }

  /**
   * The preferred carrier and service to use for the shipping label. If omitted,
   * the mutation uses Shopify Shipping's default rate selection.
   */
  public PreferredRateSelectionInput getPreferredRateSelection() {
    return preferredRateSelection;
  }

  public void setPreferredRateSelection(PreferredRateSelectionInput preferredRateSelection) {
    this.preferredRateSelection = preferredRateSelection;
  }

  /**
   * A custom ship-from origin address that overrides the fulfillment order's
   * assigned location for this label. If not provided, the assigned location is used.
   */
  public MailingAddressInput getOriginAddress() {
    return originAddress;
  }

  public void setOriginAddress(MailingAddressInput originAddress) {
    this.originAddress = originAddress;
  }

  @Override
  public String toString() {
    return "ShippingLabelPurchaseInput{fulfillmentOrderId='" + fulfillmentOrderId + "', shippingDatetime='" + shippingDatetime + "', packageInfo='" + packageInfo + "', totalWeight='" + totalWeight + "', notifyCustomer='" + notifyCustomer + "', preferredRateSelection='" + preferredRateSelection + "', originAddress='" + originAddress + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingLabelPurchaseInput that = (ShippingLabelPurchaseInput) o;
    return Objects.equals(fulfillmentOrderId, that.fulfillmentOrderId) &&
        Objects.equals(shippingDatetime, that.shippingDatetime) &&
        Objects.equals(packageInfo, that.packageInfo) &&
        Objects.equals(totalWeight, that.totalWeight) &&
        Objects.equals(notifyCustomer, that.notifyCustomer) &&
        Objects.equals(preferredRateSelection, that.preferredRateSelection) &&
        Objects.equals(originAddress, that.originAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrderId, shippingDatetime, packageInfo, totalWeight, notifyCustomer, preferredRateSelection, originAddress);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the fulfillment order to create the shipping label for. The
     * fulfillment order must be fulfillable, require shipping, and have a
     * destination shipping address.
     */
    private String fulfillmentOrderId;

    /**
     * The date and time when the package is expected to be shipped. The value must not be in the past.
     */
    private OffsetDateTime shippingDatetime;

    /**
     * The package to use for the shipment. Provide either a custom package or a carrier-provided package.
     */
    private PackageInfoInput packageInfo;

    /**
     * Total shipment weight, including the items being fulfilled and the package. If
     * omitted, the total weight used is calculated using the weight of the empty
     * package and the weight of the fulfillable line items.
     */
    private WeightInput totalWeight;

    /**
     * Whether to notify the customer after the shipping label is purchased.
     */
    private Boolean notifyCustomer = false;

    /**
     * The preferred carrier and service to use for the shipping label. If omitted,
     * the mutation uses Shopify Shipping's default rate selection.
     */
    private PreferredRateSelectionInput preferredRateSelection;

    /**
     * A custom ship-from origin address that overrides the fulfillment order's
     * assigned location for this label. If not provided, the assigned location is used.
     */
    private MailingAddressInput originAddress;

    public ShippingLabelPurchaseInput build() {
      ShippingLabelPurchaseInput result = new ShippingLabelPurchaseInput();
      result.fulfillmentOrderId = this.fulfillmentOrderId;
      result.shippingDatetime = this.shippingDatetime;
      result.packageInfo = this.packageInfo;
      result.totalWeight = this.totalWeight;
      result.notifyCustomer = this.notifyCustomer;
      result.preferredRateSelection = this.preferredRateSelection;
      result.originAddress = this.originAddress;
      return result;
    }

    /**
     * The ID of the fulfillment order to create the shipping label for. The
     * fulfillment order must be fulfillable, require shipping, and have a
     * destination shipping address.
     */
    public Builder fulfillmentOrderId(String fulfillmentOrderId) {
      this.fulfillmentOrderId = fulfillmentOrderId;
      return this;
    }

    /**
     * The date and time when the package is expected to be shipped. The value must not be in the past.
     */
    public Builder shippingDatetime(OffsetDateTime shippingDatetime) {
      this.shippingDatetime = shippingDatetime;
      return this;
    }

    /**
     * The package to use for the shipment. Provide either a custom package or a carrier-provided package.
     */
    public Builder packageInfo(PackageInfoInput packageInfo) {
      this.packageInfo = packageInfo;
      return this;
    }

    /**
     * Total shipment weight, including the items being fulfilled and the package. If
     * omitted, the total weight used is calculated using the weight of the empty
     * package and the weight of the fulfillable line items.
     */
    public Builder totalWeight(WeightInput totalWeight) {
      this.totalWeight = totalWeight;
      return this;
    }

    /**
     * Whether to notify the customer after the shipping label is purchased.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }

    /**
     * The preferred carrier and service to use for the shipping label. If omitted,
     * the mutation uses Shopify Shipping's default rate selection.
     */
    public Builder preferredRateSelection(PreferredRateSelectionInput preferredRateSelection) {
      this.preferredRateSelection = preferredRateSelection;
      return this;
    }

    /**
     * A custom ship-from origin address that overrides the fulfillment order's
     * assigned location for this label. If not provided, the assigned location is used.
     */
    public Builder originAddress(MailingAddressInput originAddress) {
      this.originAddress = originAddress;
      return this;
    }
  }
}
