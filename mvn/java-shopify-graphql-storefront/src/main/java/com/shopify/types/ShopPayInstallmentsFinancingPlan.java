package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The financing plan in Shop Pay Installments.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopPayInstallmentsFinancingPlan implements com.shopify.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The maximum price to qualify for the financing plan.
   */
  private MoneyV2 maxPrice;

  /**
   * The minimum price to qualify for the financing plan.
   */
  private MoneyV2 minPrice;

  /**
   * The terms of the financing plan.
   */
  private List<ShopPayInstallmentsFinancingPlanTerm> terms;

  public ShopPayInstallmentsFinancingPlan() {
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
   * The maximum price to qualify for the financing plan.
   */
  public MoneyV2 getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(MoneyV2 maxPrice) {
    this.maxPrice = maxPrice;
  }

  /**
   * The minimum price to qualify for the financing plan.
   */
  public MoneyV2 getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(MoneyV2 minPrice) {
    this.minPrice = minPrice;
  }

  /**
   * The terms of the financing plan.
   */
  public List<ShopPayInstallmentsFinancingPlanTerm> getTerms() {
    return terms;
  }

  public void setTerms(List<ShopPayInstallmentsFinancingPlanTerm> terms) {
    this.terms = terms;
  }

  @Override
  public String toString() {
    return "ShopPayInstallmentsFinancingPlan{id='" + id + "', maxPrice='" + maxPrice + "', minPrice='" + minPrice + "', terms='" + terms + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayInstallmentsFinancingPlan that = (ShopPayInstallmentsFinancingPlan) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(maxPrice, that.maxPrice) &&
        Objects.equals(minPrice, that.minPrice) &&
        Objects.equals(terms, that.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maxPrice, minPrice, terms);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The maximum price to qualify for the financing plan.
     */
    private MoneyV2 maxPrice;

    /**
     * The minimum price to qualify for the financing plan.
     */
    private MoneyV2 minPrice;

    /**
     * The terms of the financing plan.
     */
    private List<ShopPayInstallmentsFinancingPlanTerm> terms;

    public ShopPayInstallmentsFinancingPlan build() {
      ShopPayInstallmentsFinancingPlan result = new ShopPayInstallmentsFinancingPlan();
      result.id = this.id;
      result.maxPrice = this.maxPrice;
      result.minPrice = this.minPrice;
      result.terms = this.terms;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The maximum price to qualify for the financing plan.
     */
    public Builder maxPrice(MoneyV2 maxPrice) {
      this.maxPrice = maxPrice;
      return this;
    }

    /**
     * The minimum price to qualify for the financing plan.
     */
    public Builder minPrice(MoneyV2 minPrice) {
      this.minPrice = minPrice;
      return this;
    }

    /**
     * The terms of the financing plan.
     */
    public Builder terms(List<ShopPayInstallmentsFinancingPlanTerm> terms) {
      this.terms = terms;
      return this;
    }
  }
}
