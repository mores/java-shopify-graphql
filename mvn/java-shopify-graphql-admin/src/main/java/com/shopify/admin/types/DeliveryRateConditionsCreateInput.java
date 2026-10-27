package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for conditions that limit a rate group to specific collections or origin locations.
 */
public class DeliveryRateConditionsCreateInput {
  /**
   * Collection IDs to add. The rate group applies only to products in these collections.
   */
  private List<String> collectionsToAdd;

  /**
   * Origin location IDs to add. The rate group applies only to shipments from these locations.
   */
  private List<String> originLocationsToAdd;

  public DeliveryRateConditionsCreateInput() {
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
   * Origin location IDs to add. The rate group applies only to shipments from these locations.
   */
  public List<String> getOriginLocationsToAdd() {
    return originLocationsToAdd;
  }

  public void setOriginLocationsToAdd(List<String> originLocationsToAdd) {
    this.originLocationsToAdd = originLocationsToAdd;
  }

  @Override
  public String toString() {
    return "DeliveryRateConditionsCreateInput{collectionsToAdd='" + collectionsToAdd + "', originLocationsToAdd='" + originLocationsToAdd + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryRateConditionsCreateInput that = (DeliveryRateConditionsCreateInput) o;
    return Objects.equals(collectionsToAdd, that.collectionsToAdd) &&
        Objects.equals(originLocationsToAdd, that.originLocationsToAdd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionsToAdd, originLocationsToAdd);
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
     * Origin location IDs to add. The rate group applies only to shipments from these locations.
     */
    private List<String> originLocationsToAdd;

    public DeliveryRateConditionsCreateInput build() {
      DeliveryRateConditionsCreateInput result = new DeliveryRateConditionsCreateInput();
      result.collectionsToAdd = this.collectionsToAdd;
      result.originLocationsToAdd = this.originLocationsToAdd;
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
     * Origin location IDs to add. The rate group applies only to shipments from these locations.
     */
    public Builder originLocationsToAdd(List<String> originLocationsToAdd) {
      this.originLocationsToAdd = originLocationsToAdd;
      return this;
    }
  }
}
