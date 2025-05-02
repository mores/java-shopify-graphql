package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a selling method. For example, 'Subscribe and save' is a selling
 * method where customers pay for goods or services per delivery. A selling plan
 * group contains individual selling plans.
 */
public class SellingPlanGroup {
  /**
   * A display friendly name for the app that created the selling plan group.
   */
  private String appName;

  /**
   * The name of the selling plan group.
   */
  private String name;

  /**
   * Represents the selling plan options available in the drop-down list in the
   * storefront. For example, 'Delivery every week' or 'Delivery every 2 weeks'
   * specifies the delivery frequency options for the product.
   */
  private List<SellingPlanGroupOption> options;

  /**
   * A list of selling plans in a selling plan group. A selling plan is a
   * representation of how products and variants can be sold and purchased. For
   * example, an individual selling plan could be '6 weeks of prepaid granola,
   * delivered weekly'.
   */
  private SellingPlanConnection sellingPlans;

  public SellingPlanGroup() {
  }

  /**
   * A display friendly name for the app that created the selling plan group.
   */
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   * The name of the selling plan group.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Represents the selling plan options available in the drop-down list in the
   * storefront. For example, 'Delivery every week' or 'Delivery every 2 weeks'
   * specifies the delivery frequency options for the product.
   */
  public List<SellingPlanGroupOption> getOptions() {
    return options;
  }

  public void setOptions(List<SellingPlanGroupOption> options) {
    this.options = options;
  }

  /**
   * A list of selling plans in a selling plan group. A selling plan is a
   * representation of how products and variants can be sold and purchased. For
   * example, an individual selling plan could be '6 weeks of prepaid granola,
   * delivered weekly'.
   */
  public SellingPlanConnection getSellingPlans() {
    return sellingPlans;
  }

  public void setSellingPlans(SellingPlanConnection sellingPlans) {
    this.sellingPlans = sellingPlans;
  }

  @Override
  public String toString() {
    return "SellingPlanGroup{appName='" + appName + "', name='" + name + "', options='" + options + "', sellingPlans='" + sellingPlans + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroup that = (SellingPlanGroup) o;
    return Objects.equals(appName, that.appName) &&
        Objects.equals(name, that.name) &&
        Objects.equals(options, that.options) &&
        Objects.equals(sellingPlans, that.sellingPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, name, options, sellingPlans);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A display friendly name for the app that created the selling plan group.
     */
    private String appName;

    /**
     * The name of the selling plan group.
     */
    private String name;

    /**
     * Represents the selling plan options available in the drop-down list in the
     * storefront. For example, 'Delivery every week' or 'Delivery every 2 weeks'
     * specifies the delivery frequency options for the product.
     */
    private List<SellingPlanGroupOption> options;

    /**
     * A list of selling plans in a selling plan group. A selling plan is a
     * representation of how products and variants can be sold and purchased. For
     * example, an individual selling plan could be '6 weeks of prepaid granola,
     * delivered weekly'.
     */
    private SellingPlanConnection sellingPlans;

    public SellingPlanGroup build() {
      SellingPlanGroup result = new SellingPlanGroup();
      result.appName = this.appName;
      result.name = this.name;
      result.options = this.options;
      result.sellingPlans = this.sellingPlans;
      return result;
    }

    /**
     * A display friendly name for the app that created the selling plan group.
     */
    public Builder appName(String appName) {
      this.appName = appName;
      return this;
    }

    /**
     * The name of the selling plan group.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Represents the selling plan options available in the drop-down list in the
     * storefront. For example, 'Delivery every week' or 'Delivery every 2 weeks'
     * specifies the delivery frequency options for the product.
     */
    public Builder options(List<SellingPlanGroupOption> options) {
      this.options = options;
      return this;
    }

    /**
     * A list of selling plans in a selling plan group. A selling plan is a
     * representation of how products and variants can be sold and purchased. For
     * example, an individual selling plan could be '6 weeks of prepaid granola,
     * delivered weekly'.
     */
    public Builder sellingPlans(SellingPlanConnection sellingPlans) {
      this.sellingPlans = sellingPlans;
      return this;
    }
  }
}
