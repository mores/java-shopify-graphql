package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DraftOrderLineItemInput {
  
  private DraftOrderAppliedDiscountInput appliedDiscount;

  
  private List<AttributeInput> customAttributes;

  
  private MoneyInput originalUnitPriceWithCurrency;

  
  private int quantity;

  
  private Boolean requiresShipping;

  
  private String sku;

  
  private Boolean taxable;

  
  private String title;

  
  private String variantId;

  
  private WeightInput weight;

  
  private String uuid;

  
  private List<BundlesDraftOrderBundleLineItemComponentInput> bundleComponents;

  public DraftOrderLineItemInput() {
  }

  
  public DraftOrderAppliedDiscountInput getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public MoneyInput getOriginalUnitPriceWithCurrency() {
    return originalUnitPriceWithCurrency;
  }

  public void setOriginalUnitPriceWithCurrency(MoneyInput originalUnitPriceWithCurrency) {
    this.originalUnitPriceWithCurrency = originalUnitPriceWithCurrency;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public Boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(Boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  
  public WeightInput getWeight() {
    return weight;
  }

  public void setWeight(WeightInput weight) {
    this.weight = weight;
  }

  
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public List<BundlesDraftOrderBundleLineItemComponentInput> getBundleComponents() {
    return bundleComponents;
  }

  public void setBundleComponents(
      List<BundlesDraftOrderBundleLineItemComponentInput> bundleComponents) {
    this.bundleComponents = bundleComponents;
  }

  @Override
  public String toString() {
    return "DraftOrderLineItemInput{appliedDiscount='" + appliedDiscount + "', customAttributes='" + customAttributes + "', originalUnitPriceWithCurrency='" + originalUnitPriceWithCurrency + "', quantity='" + quantity + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "', taxable='" + taxable + "', title='" + title + "', variantId='" + variantId + "', weight='" + weight + "', uuid='" + uuid + "', bundleComponents='" + bundleComponents + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderLineItemInput that = (DraftOrderLineItemInput) o;
    return Objects.equals(appliedDiscount, that.appliedDiscount) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(originalUnitPriceWithCurrency, that.originalUnitPriceWithCurrency) &&
        quantity == that.quantity &&
        Objects.equals(requiresShipping, that.requiresShipping) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(taxable, that.taxable) &&
        Objects.equals(title, that.title) &&
        Objects.equals(variantId, that.variantId) &&
        Objects.equals(weight, that.weight) &&
        Objects.equals(uuid, that.uuid) &&
        Objects.equals(bundleComponents, that.bundleComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDiscount, customAttributes, originalUnitPriceWithCurrency, quantity, requiresShipping, sku, taxable, title, variantId, weight, uuid, bundleComponents);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DraftOrderAppliedDiscountInput appliedDiscount;

    
    private List<AttributeInput> customAttributes;

    
    private MoneyInput originalUnitPriceWithCurrency;

    
    private int quantity;

    
    private Boolean requiresShipping;

    
    private String sku;

    
    private Boolean taxable;

    
    private String title;

    
    private String variantId;

    
    private WeightInput weight;

    
    private String uuid;

    
    private List<BundlesDraftOrderBundleLineItemComponentInput> bundleComponents;

    public DraftOrderLineItemInput build() {
      DraftOrderLineItemInput result = new DraftOrderLineItemInput();
      result.appliedDiscount = this.appliedDiscount;
      result.customAttributes = this.customAttributes;
      result.originalUnitPriceWithCurrency = this.originalUnitPriceWithCurrency;
      result.quantity = this.quantity;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      result.taxable = this.taxable;
      result.title = this.title;
      result.variantId = this.variantId;
      result.weight = this.weight;
      result.uuid = this.uuid;
      result.bundleComponents = this.bundleComponents;
      return result;
    }

    
    public Builder appliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }

    
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder originalUnitPriceWithCurrency(MoneyInput originalUnitPriceWithCurrency) {
      this.originalUnitPriceWithCurrency = originalUnitPriceWithCurrency;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder requiresShipping(Boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    
    public Builder taxable(Boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    
    public Builder weight(WeightInput weight) {
      this.weight = weight;
      return this;
    }

    
    public Builder uuid(String uuid) {
      this.uuid = uuid;
      return this;
    }

    
    public Builder bundleComponents(
        List<BundlesDraftOrderBundleLineItemComponentInput> bundleComponents) {
      this.bundleComponents = bundleComponents;
      return this;
    }
  }
}
