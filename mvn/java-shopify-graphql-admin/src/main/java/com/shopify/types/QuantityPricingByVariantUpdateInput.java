package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields used to update quantity pricing.
 */
public class QuantityPricingByVariantUpdateInput {
  /**
   * A list of quantity price breaks to add.
   */
  private List<QuantityPriceBreakInput> quantityPriceBreaksToAdd;

  /**
   * A list of quantity price break IDs that identify which quantity breaks to remove.
   */
  private List<String> quantityPriceBreaksToDelete;

  /**
   * A list of quantity rules to add.
   */
  private List<QuantityRuleInput> quantityRulesToAdd;

  /**
   * A list of variant IDs that identify which quantity rules to remove.
   */
  private List<String> quantityRulesToDeleteByVariantId;

  /**
   * A list of fixed prices to add.
   */
  private List<PriceListPriceInput> pricesToAdd;

  /**
   * A list of variant IDs that identify which fixed prices to remove.
   */
  private List<String> pricesToDeleteByVariantId;

  public QuantityPricingByVariantUpdateInput() {
  }

  /**
   * A list of quantity price breaks to add.
   */
  public List<QuantityPriceBreakInput> getQuantityPriceBreaksToAdd() {
    return quantityPriceBreaksToAdd;
  }

  public void setQuantityPriceBreaksToAdd(List<QuantityPriceBreakInput> quantityPriceBreaksToAdd) {
    this.quantityPriceBreaksToAdd = quantityPriceBreaksToAdd;
  }

  /**
   * A list of quantity price break IDs that identify which quantity breaks to remove.
   */
  public List<String> getQuantityPriceBreaksToDelete() {
    return quantityPriceBreaksToDelete;
  }

  public void setQuantityPriceBreaksToDelete(List<String> quantityPriceBreaksToDelete) {
    this.quantityPriceBreaksToDelete = quantityPriceBreaksToDelete;
  }

  /**
   * A list of quantity rules to add.
   */
  public List<QuantityRuleInput> getQuantityRulesToAdd() {
    return quantityRulesToAdd;
  }

  public void setQuantityRulesToAdd(List<QuantityRuleInput> quantityRulesToAdd) {
    this.quantityRulesToAdd = quantityRulesToAdd;
  }

  /**
   * A list of variant IDs that identify which quantity rules to remove.
   */
  public List<String> getQuantityRulesToDeleteByVariantId() {
    return quantityRulesToDeleteByVariantId;
  }

  public void setQuantityRulesToDeleteByVariantId(List<String> quantityRulesToDeleteByVariantId) {
    this.quantityRulesToDeleteByVariantId = quantityRulesToDeleteByVariantId;
  }

  /**
   * A list of fixed prices to add.
   */
  public List<PriceListPriceInput> getPricesToAdd() {
    return pricesToAdd;
  }

  public void setPricesToAdd(List<PriceListPriceInput> pricesToAdd) {
    this.pricesToAdd = pricesToAdd;
  }

  /**
   * A list of variant IDs that identify which fixed prices to remove.
   */
  public List<String> getPricesToDeleteByVariantId() {
    return pricesToDeleteByVariantId;
  }

  public void setPricesToDeleteByVariantId(List<String> pricesToDeleteByVariantId) {
    this.pricesToDeleteByVariantId = pricesToDeleteByVariantId;
  }

  @Override
  public String toString() {
    return "QuantityPricingByVariantUpdateInput{quantityPriceBreaksToAdd='" + quantityPriceBreaksToAdd + "', quantityPriceBreaksToDelete='" + quantityPriceBreaksToDelete + "', quantityRulesToAdd='" + quantityRulesToAdd + "', quantityRulesToDeleteByVariantId='" + quantityRulesToDeleteByVariantId + "', pricesToAdd='" + pricesToAdd + "', pricesToDeleteByVariantId='" + pricesToDeleteByVariantId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityPricingByVariantUpdateInput that = (QuantityPricingByVariantUpdateInput) o;
    return Objects.equals(quantityPriceBreaksToAdd, that.quantityPriceBreaksToAdd) &&
        Objects.equals(quantityPriceBreaksToDelete, that.quantityPriceBreaksToDelete) &&
        Objects.equals(quantityRulesToAdd, that.quantityRulesToAdd) &&
        Objects.equals(quantityRulesToDeleteByVariantId, that.quantityRulesToDeleteByVariantId) &&
        Objects.equals(pricesToAdd, that.pricesToAdd) &&
        Objects.equals(pricesToDeleteByVariantId, that.pricesToDeleteByVariantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityPriceBreaksToAdd, quantityPriceBreaksToDelete, quantityRulesToAdd, quantityRulesToDeleteByVariantId, pricesToAdd, pricesToDeleteByVariantId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of quantity price breaks to add.
     */
    private List<QuantityPriceBreakInput> quantityPriceBreaksToAdd;

    /**
     * A list of quantity price break IDs that identify which quantity breaks to remove.
     */
    private List<String> quantityPriceBreaksToDelete;

    /**
     * A list of quantity rules to add.
     */
    private List<QuantityRuleInput> quantityRulesToAdd;

    /**
     * A list of variant IDs that identify which quantity rules to remove.
     */
    private List<String> quantityRulesToDeleteByVariantId;

    /**
     * A list of fixed prices to add.
     */
    private List<PriceListPriceInput> pricesToAdd;

    /**
     * A list of variant IDs that identify which fixed prices to remove.
     */
    private List<String> pricesToDeleteByVariantId;

    public QuantityPricingByVariantUpdateInput build() {
      QuantityPricingByVariantUpdateInput result = new QuantityPricingByVariantUpdateInput();
      result.quantityPriceBreaksToAdd = this.quantityPriceBreaksToAdd;
      result.quantityPriceBreaksToDelete = this.quantityPriceBreaksToDelete;
      result.quantityRulesToAdd = this.quantityRulesToAdd;
      result.quantityRulesToDeleteByVariantId = this.quantityRulesToDeleteByVariantId;
      result.pricesToAdd = this.pricesToAdd;
      result.pricesToDeleteByVariantId = this.pricesToDeleteByVariantId;
      return result;
    }

    /**
     * A list of quantity price breaks to add.
     */
    public Builder quantityPriceBreaksToAdd(
        List<QuantityPriceBreakInput> quantityPriceBreaksToAdd) {
      this.quantityPriceBreaksToAdd = quantityPriceBreaksToAdd;
      return this;
    }

    /**
     * A list of quantity price break IDs that identify which quantity breaks to remove.
     */
    public Builder quantityPriceBreaksToDelete(List<String> quantityPriceBreaksToDelete) {
      this.quantityPriceBreaksToDelete = quantityPriceBreaksToDelete;
      return this;
    }

    /**
     * A list of quantity rules to add.
     */
    public Builder quantityRulesToAdd(List<QuantityRuleInput> quantityRulesToAdd) {
      this.quantityRulesToAdd = quantityRulesToAdd;
      return this;
    }

    /**
     * A list of variant IDs that identify which quantity rules to remove.
     */
    public Builder quantityRulesToDeleteByVariantId(List<String> quantityRulesToDeleteByVariantId) {
      this.quantityRulesToDeleteByVariantId = quantityRulesToDeleteByVariantId;
      return this;
    }

    /**
     * A list of fixed prices to add.
     */
    public Builder pricesToAdd(List<PriceListPriceInput> pricesToAdd) {
      this.pricesToAdd = pricesToAdd;
      return this;
    }

    /**
     * A list of variant IDs that identify which fixed prices to remove.
     */
    public Builder pricesToDeleteByVariantId(List<String> pricesToDeleteByVariantId) {
      this.pricesToDeleteByVariantId = pricesToDeleteByVariantId;
      return this;
    }
  }
}
