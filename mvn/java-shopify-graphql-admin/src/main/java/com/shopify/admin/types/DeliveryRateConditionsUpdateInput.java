package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for conditions that limit a rate group to specific collections or origin locations.
 */
public class DeliveryRateConditionsUpdateInput {
  /**
   * Collection IDs to add. The rate group applies only to products in these collections.
   */
  private List<String> collectionsToAdd;

  /**
   * Collection IDs to remove.
   */
  private List<String> collectionsToRemove;

  /**
   * Whether to remove all collection conditions so the rate group applies to all products.
   */
  private Boolean resetToAllProducts;

  /**
   * Origin location IDs to add. The rate group applies only to shipments from these locations.
   */
  private List<String> originLocationsToAdd;

  /**
   * Origin location IDs to remove.
   */
  private List<String> originLocationsToRemove;

  public DeliveryRateConditionsUpdateInput() {
  }

  /**
   * Collection IDs to add. The rate group applies only to products in these collections.
   */
  public List<String> getCollectionsToAdd() {
    return collectionsToAdd;
  }

  public void setCollectionsToAdd(List<String> collectionsToAdd) {
    this.collectionsToAdd = collectionsToAdd;
  }

  /**
   * Collection IDs to remove.
   */
  public List<String> getCollectionsToRemove() {
    return collectionsToRemove;
  }

  public void setCollectionsToRemove(List<String> collectionsToRemove) {
    this.collectionsToRemove = collectionsToRemove;
  }

  /**
   * Whether to remove all collection conditions so the rate group applies to all products.
   */
  public Boolean getResetToAllProducts() {
    return resetToAllProducts;
  }

  public void setResetToAllProducts(Boolean resetToAllProducts) {
    this.resetToAllProducts = resetToAllProducts;
  }

  /**
   * Origin location IDs to add. The rate group applies only to shipments from these locations.
   */
  public List<String> getOriginLocationsToAdd() {
    return originLocationsToAdd;
  }

  public void setOriginLocationsToAdd(List<String> originLocationsToAdd) {
    this.originLocationsToAdd = originLocationsToAdd;
  }

  /**
   * Origin location IDs to remove.
   */
  public List<String> getOriginLocationsToRemove() {
    return originLocationsToRemove;
  }

  public void setOriginLocationsToRemove(List<String> originLocationsToRemove) {
    this.originLocationsToRemove = originLocationsToRemove;
  }

  @Override
  public String toString() {
    return "DeliveryRateConditionsUpdateInput{collectionsToAdd='" + collectionsToAdd + "', collectionsToRemove='" + collectionsToRemove + "', resetToAllProducts='" + resetToAllProducts + "', originLocationsToAdd='" + originLocationsToAdd + "', originLocationsToRemove='" + originLocationsToRemove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryRateConditionsUpdateInput that = (DeliveryRateConditionsUpdateInput) o;
    return Objects.equals(collectionsToAdd, that.collectionsToAdd) &&
        Objects.equals(collectionsToRemove, that.collectionsToRemove) &&
        Objects.equals(resetToAllProducts, that.resetToAllProducts) &&
        Objects.equals(originLocationsToAdd, that.originLocationsToAdd) &&
        Objects.equals(originLocationsToRemove, that.originLocationsToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionsToAdd, collectionsToRemove, resetToAllProducts, originLocationsToAdd, originLocationsToRemove);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Collection IDs to add. The rate group applies only to products in these collections.
     */
    private List<String> collectionsToAdd;

    /**
     * Collection IDs to remove.
     */
    private List<String> collectionsToRemove;

    /**
     * Whether to remove all collection conditions so the rate group applies to all products.
     */
    private Boolean resetToAllProducts;

    /**
     * Origin location IDs to add. The rate group applies only to shipments from these locations.
     */
    private List<String> originLocationsToAdd;

    /**
     * Origin location IDs to remove.
     */
    private List<String> originLocationsToRemove;

    public DeliveryRateConditionsUpdateInput build() {
      DeliveryRateConditionsUpdateInput result = new DeliveryRateConditionsUpdateInput();
      result.collectionsToAdd = this.collectionsToAdd;
      result.collectionsToRemove = this.collectionsToRemove;
      result.resetToAllProducts = this.resetToAllProducts;
      result.originLocationsToAdd = this.originLocationsToAdd;
      result.originLocationsToRemove = this.originLocationsToRemove;
      return result;
    }

    /**
     * Collection IDs to add. The rate group applies only to products in these collections.
     */
    public Builder collectionsToAdd(List<String> collectionsToAdd) {
      this.collectionsToAdd = collectionsToAdd;
      return this;
    }

    /**
     * Collection IDs to remove.
     */
    public Builder collectionsToRemove(List<String> collectionsToRemove) {
      this.collectionsToRemove = collectionsToRemove;
      return this;
    }

    /**
     * Whether to remove all collection conditions so the rate group applies to all products.
     */
    public Builder resetToAllProducts(Boolean resetToAllProducts) {
      this.resetToAllProducts = resetToAllProducts;
      return this;
    }

    /**
     * Origin location IDs to add. The rate group applies only to shipments from these locations.
     */
    public Builder originLocationsToAdd(List<String> originLocationsToAdd) {
      this.originLocationsToAdd = originLocationsToAdd;
      return this;
    }

    /**
     * Origin location IDs to remove.
     */
    public Builder originLocationsToRemove(List<String> originLocationsToRemove) {
      this.originLocationsToRemove = originLocationsToRemove;
      return this;
    }
  }
}
