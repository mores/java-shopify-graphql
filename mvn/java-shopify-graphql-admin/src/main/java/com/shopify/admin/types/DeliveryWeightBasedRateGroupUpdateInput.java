package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a weight-based rate group.
 */
public class DeliveryWeightBasedRateGroupUpdateInput {
  /**
   * The ID of the rate group to update.
   */
  private String id;

  /**
   * Rates to create in this rate group.
   */
  private List<DeliveryWeightBasedRateCreateInput> ratesToCreate;

  /**
   * Rates to update in this rate group.
   */
  private List<DeliveryWeightBasedRateUpdateInput> ratesToUpdate;

  /**
   * IDs of rates to delete from this rate group.
   */
  private List<String> ratesToDelete;

  /**
   * Collection and origin location conditions for this rate group.
   */
  private DeliveryRateConditionsUpdateInput conditions;

  public DeliveryWeightBasedRateGroupUpdateInput() {
  }

  /**
   * The ID of the rate group to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Rates to create in this rate group.
   */
  public List<DeliveryWeightBasedRateCreateInput> getRatesToCreate() {
    return ratesToCreate;
  }

  public void setRatesToCreate(List<DeliveryWeightBasedRateCreateInput> ratesToCreate) {
    this.ratesToCreate = ratesToCreate;
  }

  /**
   * Rates to update in this rate group.
   */
  public List<DeliveryWeightBasedRateUpdateInput> getRatesToUpdate() {
    return ratesToUpdate;
  }

  public void setRatesToUpdate(List<DeliveryWeightBasedRateUpdateInput> ratesToUpdate) {
    this.ratesToUpdate = ratesToUpdate;
  }

  /**
   * IDs of rates to delete from this rate group.
   */
  public List<String> getRatesToDelete() {
    return ratesToDelete;
  }

  public void setRatesToDelete(List<String> ratesToDelete) {
    this.ratesToDelete = ratesToDelete;
  }

  /**
   * Collection and origin location conditions for this rate group.
   */
  public DeliveryRateConditionsUpdateInput getConditions() {
    return conditions;
  }

  public void setConditions(DeliveryRateConditionsUpdateInput conditions) {
    this.conditions = conditions;
  }

  @Override
  public String toString() {
    return "DeliveryWeightBasedRateGroupUpdateInput{id='" + id + "', ratesToCreate='" + ratesToCreate + "', ratesToUpdate='" + ratesToUpdate + "', ratesToDelete='" + ratesToDelete + "', conditions='" + conditions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryWeightBasedRateGroupUpdateInput that = (DeliveryWeightBasedRateGroupUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(ratesToCreate, that.ratesToCreate) &&
        Objects.equals(ratesToUpdate, that.ratesToUpdate) &&
        Objects.equals(ratesToDelete, that.ratesToDelete) &&
        Objects.equals(conditions, that.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ratesToCreate, ratesToUpdate, ratesToDelete, conditions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the rate group to update.
     */
    private String id;

    /**
     * Rates to create in this rate group.
     */
    private List<DeliveryWeightBasedRateCreateInput> ratesToCreate;

    /**
     * Rates to update in this rate group.
     */
    private List<DeliveryWeightBasedRateUpdateInput> ratesToUpdate;

    /**
     * IDs of rates to delete from this rate group.
     */
    private List<String> ratesToDelete;

    /**
     * Collection and origin location conditions for this rate group.
     */
    private DeliveryRateConditionsUpdateInput conditions;

    public DeliveryWeightBasedRateGroupUpdateInput build() {
      DeliveryWeightBasedRateGroupUpdateInput result = new DeliveryWeightBasedRateGroupUpdateInput();
      result.id = this.id;
      result.ratesToCreate = this.ratesToCreate;
      result.ratesToUpdate = this.ratesToUpdate;
      result.ratesToDelete = this.ratesToDelete;
      result.conditions = this.conditions;
      return result;
    }

    /**
     * The ID of the rate group to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Rates to create in this rate group.
     */
    public Builder ratesToCreate(List<DeliveryWeightBasedRateCreateInput> ratesToCreate) {
      this.ratesToCreate = ratesToCreate;
      return this;
    }

    /**
     * Rates to update in this rate group.
     */
    public Builder ratesToUpdate(List<DeliveryWeightBasedRateUpdateInput> ratesToUpdate) {
      this.ratesToUpdate = ratesToUpdate;
      return this;
    }

    /**
     * IDs of rates to delete from this rate group.
     */
    public Builder ratesToDelete(List<String> ratesToDelete) {
      this.ratesToDelete = ratesToDelete;
      return this;
    }

    /**
     * Collection and origin location conditions for this rate group.
     */
    public Builder conditions(DeliveryRateConditionsUpdateInput conditions) {
      this.conditions = conditions;
      return this;
    }
  }
}
