package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to create or update a selling plan.
 */
public class SellingPlanInput {
  /**
   * ID of the selling plan.
   */
  private String id;

  /**
   * Buyer facing string which describes the selling plan content.
   */
  private String name;

  /**
   * Buyer facing string which describes the selling plan commitment.
   */
  private String description;

  /**
   * Selling plan policy which describes the billing details.
   */
  private SellingPlanBillingPolicyInput billingPolicy;

  /**
   * A selling plan policy which describes the delivery details.
   */
  private SellingPlanDeliveryPolicyInput deliveryPolicy;

  /**
   * A selling plan policy which describes the inventory details.
   */
  private SellingPlanInventoryPolicyInput inventoryPolicy;

  /**
   * Additional customizable information to associate with the SellingPlan.
   */
  private List<MetafieldInput> metafields;

  /**
   * The pricing policies which describe the pricing details. Each selling plan
   * can only contain a maximum of 2 pricing policies.
   */
  private List<SellingPlanPricingPolicyInput> pricingPolicies;

  /**
   * The values of all options available on the selling plan. Selling plans are
   * grouped together in Liquid when they're created by the same app, and have the
   * same `selling_plan_group.name` and `selling_plan_group.options` values.
   */
  private List<String> options;

  /**
   * Relative value for display purposes of this plan. A lower position will be displayed before a higher one.
   */
  private Integer position;

  /**
   * The category used to classify this selling plan for reporting purposes.
   */
  private SellingPlanCategory category;

  public SellingPlanInput() {
  }

  /**
   * ID of the selling plan.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Buyer facing string which describes the selling plan content.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Buyer facing string which describes the selling plan commitment.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Selling plan policy which describes the billing details.
   */
  public SellingPlanBillingPolicyInput getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SellingPlanBillingPolicyInput billingPolicy) {
    this.billingPolicy = billingPolicy;
  }

  /**
   * A selling plan policy which describes the delivery details.
   */
  public SellingPlanDeliveryPolicyInput getDeliveryPolicy() {
    return deliveryPolicy;
  }

  public void setDeliveryPolicy(SellingPlanDeliveryPolicyInput deliveryPolicy) {
    this.deliveryPolicy = deliveryPolicy;
  }

  /**
   * A selling plan policy which describes the inventory details.
   */
  public SellingPlanInventoryPolicyInput getInventoryPolicy() {
    return inventoryPolicy;
  }

  public void setInventoryPolicy(SellingPlanInventoryPolicyInput inventoryPolicy) {
    this.inventoryPolicy = inventoryPolicy;
  }

  /**
   * Additional customizable information to associate with the SellingPlan.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * The pricing policies which describe the pricing details. Each selling plan
   * can only contain a maximum of 2 pricing policies.
   */
  public List<SellingPlanPricingPolicyInput> getPricingPolicies() {
    return pricingPolicies;
  }

  public void setPricingPolicies(List<SellingPlanPricingPolicyInput> pricingPolicies) {
    this.pricingPolicies = pricingPolicies;
  }

  /**
   * The values of all options available on the selling plan. Selling plans are
   * grouped together in Liquid when they're created by the same app, and have the
   * same `selling_plan_group.name` and `selling_plan_group.options` values.
   */
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  /**
   * Relative value for display purposes of this plan. A lower position will be displayed before a higher one.
   */
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  /**
   * The category used to classify this selling plan for reporting purposes.
   */
  public SellingPlanCategory getCategory() {
    return category;
  }

  public void setCategory(SellingPlanCategory category) {
    this.category = category;
  }

  @Override
  public String toString() {
    return "SellingPlanInput{id='" + id + "', name='" + name + "', description='" + description + "', billingPolicy='" + billingPolicy + "', deliveryPolicy='" + deliveryPolicy + "', inventoryPolicy='" + inventoryPolicy + "', metafields='" + metafields + "', pricingPolicies='" + pricingPolicies + "', options='" + options + "', position='" + position + "', category='" + category + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanInput that = (SellingPlanInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(billingPolicy, that.billingPolicy) &&
        Objects.equals(deliveryPolicy, that.deliveryPolicy) &&
        Objects.equals(inventoryPolicy, that.inventoryPolicy) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(pricingPolicies, that.pricingPolicies) &&
        Objects.equals(options, that.options) &&
        Objects.equals(position, that.position) &&
        Objects.equals(category, that.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, billingPolicy, deliveryPolicy, inventoryPolicy, metafields, pricingPolicies, options, position, category);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the selling plan.
     */
    private String id;

    /**
     * Buyer facing string which describes the selling plan content.
     */
    private String name;

    /**
     * Buyer facing string which describes the selling plan commitment.
     */
    private String description;

    /**
     * Selling plan policy which describes the billing details.
     */
    private SellingPlanBillingPolicyInput billingPolicy;

    /**
     * A selling plan policy which describes the delivery details.
     */
    private SellingPlanDeliveryPolicyInput deliveryPolicy;

    /**
     * A selling plan policy which describes the inventory details.
     */
    private SellingPlanInventoryPolicyInput inventoryPolicy;

    /**
     * Additional customizable information to associate with the SellingPlan.
     */
    private List<MetafieldInput> metafields;

    /**
     * The pricing policies which describe the pricing details. Each selling plan
     * can only contain a maximum of 2 pricing policies.
     */
    private List<SellingPlanPricingPolicyInput> pricingPolicies;

    /**
     * The values of all options available on the selling plan. Selling plans are
     * grouped together in Liquid when they're created by the same app, and have the
     * same `selling_plan_group.name` and `selling_plan_group.options` values.
     */
    private List<String> options;

    /**
     * Relative value for display purposes of this plan. A lower position will be displayed before a higher one.
     */
    private Integer position;

    /**
     * The category used to classify this selling plan for reporting purposes.
     */
    private SellingPlanCategory category;

    public SellingPlanInput build() {
      SellingPlanInput result = new SellingPlanInput();
      result.id = this.id;
      result.name = this.name;
      result.description = this.description;
      result.billingPolicy = this.billingPolicy;
      result.deliveryPolicy = this.deliveryPolicy;
      result.inventoryPolicy = this.inventoryPolicy;
      result.metafields = this.metafields;
      result.pricingPolicies = this.pricingPolicies;
      result.options = this.options;
      result.position = this.position;
      result.category = this.category;
      return result;
    }

    /**
     * ID of the selling plan.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Buyer facing string which describes the selling plan content.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Buyer facing string which describes the selling plan commitment.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Selling plan policy which describes the billing details.
     */
    public Builder billingPolicy(SellingPlanBillingPolicyInput billingPolicy) {
      this.billingPolicy = billingPolicy;
      return this;
    }

    /**
     * A selling plan policy which describes the delivery details.
     */
    public Builder deliveryPolicy(SellingPlanDeliveryPolicyInput deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
      return this;
    }

    /**
     * A selling plan policy which describes the inventory details.
     */
    public Builder inventoryPolicy(SellingPlanInventoryPolicyInput inventoryPolicy) {
      this.inventoryPolicy = inventoryPolicy;
      return this;
    }

    /**
     * Additional customizable information to associate with the SellingPlan.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The pricing policies which describe the pricing details. Each selling plan
     * can only contain a maximum of 2 pricing policies.
     */
    public Builder pricingPolicies(List<SellingPlanPricingPolicyInput> pricingPolicies) {
      this.pricingPolicies = pricingPolicies;
      return this;
    }

    /**
     * The values of all options available on the selling plan. Selling plans are
     * grouped together in Liquid when they're created by the same app, and have the
     * same `selling_plan_group.name` and `selling_plan_group.options` values.
     */
    public Builder options(List<String> options) {
      this.options = options;
      return this;
    }

    /**
     * Relative value for display purposes of this plan. A lower position will be displayed before a higher one.
     */
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }

    /**
     * The category used to classify this selling plan for reporting purposes.
     */
    public Builder category(SellingPlanCategory category) {
      this.category = category;
      return this;
    }
  }
}
