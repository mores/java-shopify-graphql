package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A subscription contract calculation that has completed successfully.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionContractCalculationSuccess implements SubscriptionContractCalculation {
  /**
   * The calculated subscription contract. This contract is uncommitted and can be previewed before committing.
   */
  private SubscriptionCalculatedContract calculatedContract;

  /**
   * The available delivery options computed during the calculation.
   */
  private List<SubscriptionContractCalculationDeliveryOption> deliveryOptions;

  /**
   * The ID of the contract calculation.
   */
  private String id;

  /**
   * Projected order totals (subtotal, delivery, estimated tax, discounts, and
   * grand total) for the calculated contract. Null when the calculation only
   * discovered delivery options for an address rather than calculating committed totals.
   */
  private SubscriptionContractCalculationProjectedOrderTotals projectedOrderTotals;

  /**
   * Non-fatal warnings produced during the calculation. The calculation still
   * succeeded; warnings inform the merchant about issues that should be reviewed
   * before committing the contract.
   */
  private List<SubscriptionContractCalculationDiagnostic> warnings;

  /**
   * Whether merchandise customizations were enabled for the calculation.
   */
  private boolean withMerchandiseCustomizations;

  public SubscriptionContractCalculationSuccess() {
  }

  /**
   * The calculated subscription contract. This contract is uncommitted and can be previewed before committing.
   */
  public SubscriptionCalculatedContract getCalculatedContract() {
    return calculatedContract;
  }

  public void setCalculatedContract(SubscriptionCalculatedContract calculatedContract) {
    this.calculatedContract = calculatedContract;
  }

  /**
   * The available delivery options computed during the calculation.
   */
  public List<SubscriptionContractCalculationDeliveryOption> getDeliveryOptions() {
    return deliveryOptions;
  }

  public void setDeliveryOptions(
      List<SubscriptionContractCalculationDeliveryOption> deliveryOptions) {
    this.deliveryOptions = deliveryOptions;
  }

  /**
   * The ID of the contract calculation.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Projected order totals (subtotal, delivery, estimated tax, discounts, and
   * grand total) for the calculated contract. Null when the calculation only
   * discovered delivery options for an address rather than calculating committed totals.
   */
  public SubscriptionContractCalculationProjectedOrderTotals getProjectedOrderTotals() {
    return projectedOrderTotals;
  }

  public void setProjectedOrderTotals(
      SubscriptionContractCalculationProjectedOrderTotals projectedOrderTotals) {
    this.projectedOrderTotals = projectedOrderTotals;
  }

  /**
   * Non-fatal warnings produced during the calculation. The calculation still
   * succeeded; warnings inform the merchant about issues that should be reviewed
   * before committing the contract.
   */
  public List<SubscriptionContractCalculationDiagnostic> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<SubscriptionContractCalculationDiagnostic> warnings) {
    this.warnings = warnings;
  }

  /**
   * Whether merchandise customizations were enabled for the calculation.
   */
  public boolean getWithMerchandiseCustomizations() {
    return withMerchandiseCustomizations;
  }

  public void setWithMerchandiseCustomizations(boolean withMerchandiseCustomizations) {
    this.withMerchandiseCustomizations = withMerchandiseCustomizations;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationSuccess{calculatedContract='" + calculatedContract + "', deliveryOptions='" + deliveryOptions + "', id='" + id + "', projectedOrderTotals='" + projectedOrderTotals + "', warnings='" + warnings + "', withMerchandiseCustomizations='" + withMerchandiseCustomizations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationSuccess that = (SubscriptionContractCalculationSuccess) o;
    return Objects.equals(calculatedContract, that.calculatedContract) &&
        Objects.equals(deliveryOptions, that.deliveryOptions) &&
        Objects.equals(id, that.id) &&
        Objects.equals(projectedOrderTotals, that.projectedOrderTotals) &&
        Objects.equals(warnings, that.warnings) &&
        withMerchandiseCustomizations == that.withMerchandiseCustomizations;
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedContract, deliveryOptions, id, projectedOrderTotals, warnings, withMerchandiseCustomizations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The calculated subscription contract. This contract is uncommitted and can be previewed before committing.
     */
    private SubscriptionCalculatedContract calculatedContract;

    /**
     * The available delivery options computed during the calculation.
     */
    private List<SubscriptionContractCalculationDeliveryOption> deliveryOptions;

    /**
     * The ID of the contract calculation.
     */
    private String id;

    /**
     * Projected order totals (subtotal, delivery, estimated tax, discounts, and
     * grand total) for the calculated contract. Null when the calculation only
     * discovered delivery options for an address rather than calculating committed totals.
     */
    private SubscriptionContractCalculationProjectedOrderTotals projectedOrderTotals;

    /**
     * Non-fatal warnings produced during the calculation. The calculation still
     * succeeded; warnings inform the merchant about issues that should be reviewed
     * before committing the contract.
     */
    private List<SubscriptionContractCalculationDiagnostic> warnings;

    /**
     * Whether merchandise customizations were enabled for the calculation.
     */
    private boolean withMerchandiseCustomizations;

    public SubscriptionContractCalculationSuccess build() {
      SubscriptionContractCalculationSuccess result = new SubscriptionContractCalculationSuccess();
      result.calculatedContract = this.calculatedContract;
      result.deliveryOptions = this.deliveryOptions;
      result.id = this.id;
      result.projectedOrderTotals = this.projectedOrderTotals;
      result.warnings = this.warnings;
      result.withMerchandiseCustomizations = this.withMerchandiseCustomizations;
      return result;
    }

    /**
     * The calculated subscription contract. This contract is uncommitted and can be previewed before committing.
     */
    public Builder calculatedContract(SubscriptionCalculatedContract calculatedContract) {
      this.calculatedContract = calculatedContract;
      return this;
    }

    /**
     * The available delivery options computed during the calculation.
     */
    public Builder deliveryOptions(
        List<SubscriptionContractCalculationDeliveryOption> deliveryOptions) {
      this.deliveryOptions = deliveryOptions;
      return this;
    }

    /**
     * The ID of the contract calculation.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Projected order totals (subtotal, delivery, estimated tax, discounts, and
     * grand total) for the calculated contract. Null when the calculation only
     * discovered delivery options for an address rather than calculating committed totals.
     */
    public Builder projectedOrderTotals(
        SubscriptionContractCalculationProjectedOrderTotals projectedOrderTotals) {
      this.projectedOrderTotals = projectedOrderTotals;
      return this;
    }

    /**
     * Non-fatal warnings produced during the calculation. The calculation still
     * succeeded; warnings inform the merchant about issues that should be reviewed
     * before committing the contract.
     */
    public Builder warnings(List<SubscriptionContractCalculationDiagnostic> warnings) {
      this.warnings = warnings;
      return this;
    }

    /**
     * Whether merchandise customizations were enabled for the calculation.
     */
    public Builder withMerchandiseCustomizations(boolean withMerchandiseCustomizations) {
      this.withMerchandiseCustomizations = withMerchandiseCustomizations;
      return this;
    }
  }
}
