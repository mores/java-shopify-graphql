package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A cash drawer for cash management.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CashDrawer implements com.shopify.admin.types.Node {
  /**
   * The activities on the cash drawer.
   */
  private CashActivityConnection cashActivities;

  /**
   * A unique ID for the cash drawer.
   */
  private String id;

  /**
   * The location of the cash drawer.
   */
  private Location location;

  /**
   * The name of the cash drawer.
   */
  private String name;

  /**
   * The net sales for this cash drawer.
   */
  private MoneyV2 netSales;

  /**
   * The Point of Sale devices assigned to this cash drawer.
   */
  private PointOfSaleDeviceConnection pointOfSaleDevices;

  /**
   * The total adjustments for this cash drawer.
   */
  private MoneyV2 totalAdjustments;

  /**
   * The total discrepancies for this cash drawer.
   */
  private MoneyV2 totalDiscrepancies;

  /**
   * The total refunds for this cash drawer.
   */
  private MoneyV2 totalRefunds;

  /**
   * The total sales for this cash drawer.
   */
  private MoneyV2 totalSales;

  public CashDrawer() {
  }

  /**
   * The activities on the cash drawer.
   */
  public CashActivityConnection getCashActivities() {
    return cashActivities;
  }

  public void setCashActivities(CashActivityConnection cashActivities) {
    this.cashActivities = cashActivities;
  }

  /**
   * A unique ID for the cash drawer.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The location of the cash drawer.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * The name of the cash drawer.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The net sales for this cash drawer.
   */
  public MoneyV2 getNetSales() {
    return netSales;
  }

  public void setNetSales(MoneyV2 netSales) {
    this.netSales = netSales;
  }

  /**
   * The Point of Sale devices assigned to this cash drawer.
   */
  public PointOfSaleDeviceConnection getPointOfSaleDevices() {
    return pointOfSaleDevices;
  }

  public void setPointOfSaleDevices(PointOfSaleDeviceConnection pointOfSaleDevices) {
    this.pointOfSaleDevices = pointOfSaleDevices;
  }

  /**
   * The total adjustments for this cash drawer.
   */
  public MoneyV2 getTotalAdjustments() {
    return totalAdjustments;
  }

  public void setTotalAdjustments(MoneyV2 totalAdjustments) {
    this.totalAdjustments = totalAdjustments;
  }

  /**
   * The total discrepancies for this cash drawer.
   */
  public MoneyV2 getTotalDiscrepancies() {
    return totalDiscrepancies;
  }

  public void setTotalDiscrepancies(MoneyV2 totalDiscrepancies) {
    this.totalDiscrepancies = totalDiscrepancies;
  }

  /**
   * The total refunds for this cash drawer.
   */
  public MoneyV2 getTotalRefunds() {
    return totalRefunds;
  }

  public void setTotalRefunds(MoneyV2 totalRefunds) {
    this.totalRefunds = totalRefunds;
  }

  /**
   * The total sales for this cash drawer.
   */
  public MoneyV2 getTotalSales() {
    return totalSales;
  }

  public void setTotalSales(MoneyV2 totalSales) {
    this.totalSales = totalSales;
  }

  @Override
  public String toString() {
    return "CashDrawer{cashActivities='" + cashActivities + "', id='" + id + "', location='" + location + "', name='" + name + "', netSales='" + netSales + "', pointOfSaleDevices='" + pointOfSaleDevices + "', totalAdjustments='" + totalAdjustments + "', totalDiscrepancies='" + totalDiscrepancies + "', totalRefunds='" + totalRefunds + "', totalSales='" + totalSales + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashDrawer that = (CashDrawer) o;
    return Objects.equals(cashActivities, that.cashActivities) &&
        Objects.equals(id, that.id) &&
        Objects.equals(location, that.location) &&
        Objects.equals(name, that.name) &&
        Objects.equals(netSales, that.netSales) &&
        Objects.equals(pointOfSaleDevices, that.pointOfSaleDevices) &&
        Objects.equals(totalAdjustments, that.totalAdjustments) &&
        Objects.equals(totalDiscrepancies, that.totalDiscrepancies) &&
        Objects.equals(totalRefunds, that.totalRefunds) &&
        Objects.equals(totalSales, that.totalSales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashActivities, id, location, name, netSales, pointOfSaleDevices, totalAdjustments, totalDiscrepancies, totalRefunds, totalSales);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The activities on the cash drawer.
     */
    private CashActivityConnection cashActivities;

    /**
     * A unique ID for the cash drawer.
     */
    private String id;

    /**
     * The location of the cash drawer.
     */
    private Location location;

    /**
     * The name of the cash drawer.
     */
    private String name;

    /**
     * The net sales for this cash drawer.
     */
    private MoneyV2 netSales;

    /**
     * The Point of Sale devices assigned to this cash drawer.
     */
    private PointOfSaleDeviceConnection pointOfSaleDevices;

    /**
     * The total adjustments for this cash drawer.
     */
    private MoneyV2 totalAdjustments;

    /**
     * The total discrepancies for this cash drawer.
     */
    private MoneyV2 totalDiscrepancies;

    /**
     * The total refunds for this cash drawer.
     */
    private MoneyV2 totalRefunds;

    /**
     * The total sales for this cash drawer.
     */
    private MoneyV2 totalSales;

    public CashDrawer build() {
      CashDrawer result = new CashDrawer();
      result.cashActivities = this.cashActivities;
      result.id = this.id;
      result.location = this.location;
      result.name = this.name;
      result.netSales = this.netSales;
      result.pointOfSaleDevices = this.pointOfSaleDevices;
      result.totalAdjustments = this.totalAdjustments;
      result.totalDiscrepancies = this.totalDiscrepancies;
      result.totalRefunds = this.totalRefunds;
      result.totalSales = this.totalSales;
      return result;
    }

    /**
     * The activities on the cash drawer.
     */
    public Builder cashActivities(CashActivityConnection cashActivities) {
      this.cashActivities = cashActivities;
      return this;
    }

    /**
     * A unique ID for the cash drawer.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The location of the cash drawer.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * The name of the cash drawer.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The net sales for this cash drawer.
     */
    public Builder netSales(MoneyV2 netSales) {
      this.netSales = netSales;
      return this;
    }

    /**
     * The Point of Sale devices assigned to this cash drawer.
     */
    public Builder pointOfSaleDevices(PointOfSaleDeviceConnection pointOfSaleDevices) {
      this.pointOfSaleDevices = pointOfSaleDevices;
      return this;
    }

    /**
     * The total adjustments for this cash drawer.
     */
    public Builder totalAdjustments(MoneyV2 totalAdjustments) {
      this.totalAdjustments = totalAdjustments;
      return this;
    }

    /**
     * The total discrepancies for this cash drawer.
     */
    public Builder totalDiscrepancies(MoneyV2 totalDiscrepancies) {
      this.totalDiscrepancies = totalDiscrepancies;
      return this;
    }

    /**
     * The total refunds for this cash drawer.
     */
    public Builder totalRefunds(MoneyV2 totalRefunds) {
      this.totalRefunds = totalRefunds;
      return this;
    }

    /**
     * The total sales for this cash drawer.
     */
    public Builder totalSales(MoneyV2 totalSales) {
      this.totalSales = totalSales;
      return this;
    }
  }
}
