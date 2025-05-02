package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The terms of the financing plan in Shop Pay Installments.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopPayInstallmentsFinancingPlanTerm implements com.shopify.storefront.types.Node {
  /**
   * The annual percentage rate (APR) of the financing plan.
   */
  private int apr;

  /**
   * The payment frequency for the financing plan.
   */
  private ShopPayInstallmentsFinancingPlanFrequency frequency;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The number of installments for the financing plan.
   */
  private Count installmentsCount;

  /**
   * The type of loan for the financing plan.
   */
  private ShopPayInstallmentsLoan loanType;

  public ShopPayInstallmentsFinancingPlanTerm() {
  }

  /**
   * The annual percentage rate (APR) of the financing plan.
   */
  public int getApr() {
    return apr;
  }

  public void setApr(int apr) {
    this.apr = apr;
  }

  /**
   * The payment frequency for the financing plan.
   */
  public ShopPayInstallmentsFinancingPlanFrequency getFrequency() {
    return frequency;
  }

  public void setFrequency(ShopPayInstallmentsFinancingPlanFrequency frequency) {
    this.frequency = frequency;
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

  /**
   * The number of installments for the financing plan.
   */
  public Count getInstallmentsCount() {
    return installmentsCount;
  }

  public void setInstallmentsCount(Count installmentsCount) {
    this.installmentsCount = installmentsCount;
  }

  /**
   * The type of loan for the financing plan.
   */
  public ShopPayInstallmentsLoan getLoanType() {
    return loanType;
  }

  public void setLoanType(ShopPayInstallmentsLoan loanType) {
    this.loanType = loanType;
  }

  @Override
  public String toString() {
    return "ShopPayInstallmentsFinancingPlanTerm{apr='" + apr + "', frequency='" + frequency + "', id='" + id + "', installmentsCount='" + installmentsCount + "', loanType='" + loanType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayInstallmentsFinancingPlanTerm that = (ShopPayInstallmentsFinancingPlanTerm) o;
    return apr == that.apr &&
        Objects.equals(frequency, that.frequency) &&
        Objects.equals(id, that.id) &&
        Objects.equals(installmentsCount, that.installmentsCount) &&
        Objects.equals(loanType, that.loanType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apr, frequency, id, installmentsCount, loanType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The annual percentage rate (APR) of the financing plan.
     */
    private int apr;

    /**
     * The payment frequency for the financing plan.
     */
    private ShopPayInstallmentsFinancingPlanFrequency frequency;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The number of installments for the financing plan.
     */
    private Count installmentsCount;

    /**
     * The type of loan for the financing plan.
     */
    private ShopPayInstallmentsLoan loanType;

    public ShopPayInstallmentsFinancingPlanTerm build() {
      ShopPayInstallmentsFinancingPlanTerm result = new ShopPayInstallmentsFinancingPlanTerm();
      result.apr = this.apr;
      result.frequency = this.frequency;
      result.id = this.id;
      result.installmentsCount = this.installmentsCount;
      result.loanType = this.loanType;
      return result;
    }

    /**
     * The annual percentage rate (APR) of the financing plan.
     */
    public Builder apr(int apr) {
      this.apr = apr;
      return this;
    }

    /**
     * The payment frequency for the financing plan.
     */
    public Builder frequency(ShopPayInstallmentsFinancingPlanFrequency frequency) {
      this.frequency = frequency;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The number of installments for the financing plan.
     */
    public Builder installmentsCount(Count installmentsCount) {
      this.installmentsCount = installmentsCount;
      return this;
    }

    /**
     * The type of loan for the financing plan.
     */
    public Builder loanType(ShopPayInstallmentsLoan loanType) {
      this.loanType = loanType;
      return this;
    }
  }
}
