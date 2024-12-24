package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SellingPlanInput {
  
  private String id;

  
  private String name;

  
  private String description;

  
  private SellingPlanBillingPolicyInput billingPolicy;

  
  private SellingPlanDeliveryPolicyInput deliveryPolicy;

  
  private SellingPlanInventoryPolicyInput inventoryPolicy;

  
  private List<MetafieldInput> metafields;

  
  private List<SellingPlanPricingPolicyInput> pricingPolicies;

  
  private List<String> options;

  
  private Integer position;

  
  private SellingPlanCategory category;

  public SellingPlanInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public SellingPlanBillingPolicyInput getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SellingPlanBillingPolicyInput billingPolicy) {
    this.billingPolicy = billingPolicy;
  }

  
  public SellingPlanDeliveryPolicyInput getDeliveryPolicy() {
    return deliveryPolicy;
  }

  public void setDeliveryPolicy(SellingPlanDeliveryPolicyInput deliveryPolicy) {
    this.deliveryPolicy = deliveryPolicy;
  }

  
  public SellingPlanInventoryPolicyInput getInventoryPolicy() {
    return inventoryPolicy;
  }

  public void setInventoryPolicy(SellingPlanInventoryPolicyInput inventoryPolicy) {
    this.inventoryPolicy = inventoryPolicy;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  
  public List<SellingPlanPricingPolicyInput> getPricingPolicies() {
    return pricingPolicies;
  }

  public void setPricingPolicies(List<SellingPlanPricingPolicyInput> pricingPolicies) {
    this.pricingPolicies = pricingPolicies;
  }

  
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  
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
    
    private String id;

    
    private String name;

    
    private String description;

    
    private SellingPlanBillingPolicyInput billingPolicy;

    
    private SellingPlanDeliveryPolicyInput deliveryPolicy;

    
    private SellingPlanInventoryPolicyInput inventoryPolicy;

    
    private List<MetafieldInput> metafields;

    
    private List<SellingPlanPricingPolicyInput> pricingPolicies;

    
    private List<String> options;

    
    private Integer position;

    
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

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder billingPolicy(SellingPlanBillingPolicyInput billingPolicy) {
      this.billingPolicy = billingPolicy;
      return this;
    }

    
    public Builder deliveryPolicy(SellingPlanDeliveryPolicyInput deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
      return this;
    }

    
    public Builder inventoryPolicy(SellingPlanInventoryPolicyInput inventoryPolicy) {
      this.inventoryPolicy = inventoryPolicy;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder pricingPolicies(List<SellingPlanPricingPolicyInput> pricingPolicies) {
      this.pricingPolicies = pricingPolicies;
      return this;
    }

    
    public Builder options(List<String> options) {
      this.options = options;
      return this;
    }

    
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }

    
    public Builder category(SellingPlanCategory category) {
      this.category = category;
      return this;
    }
  }
}
