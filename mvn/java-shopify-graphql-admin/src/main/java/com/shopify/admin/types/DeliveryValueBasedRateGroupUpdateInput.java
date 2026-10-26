package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a rate group for a value-based shipping option.
 */
public class DeliveryValueBasedRateGroupUpdateInput {
  /**
   * The ID of the rate group to update.
   */
  private String id;

  /**
   * Rates to create within this rate group.
   */
  private List<DeliveryValueBasedRateCreateInput> ratesToCreate;

  /**
   * Rates to update within this rate group.
   */
  private List<DeliveryValueBasedRateUpdateInput> ratesToUpdate;

  /**
   * IDs of rates to delete from this rate group.
   */
  private List<String> ratesToDelete;

  /**
   * Collection and origin location conditions for this rate group.
   */
  private DeliveryRateConditionsUpdateInput conditions;

  public DeliveryValueBasedRateGroupUpdateInput() {
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
   * Rates to create within this rate group.
   */
  public List<DeliveryValueBasedRateCreateInput> getRatesToCreate() {
    return ratesToCreate;
  }

  public void setRatesToCreate(List<DeliveryValueBasedRateCreateInput> ratesToCreate) {
    this.ratesToCreate = ratesToCreate;
  }

  /**
   * Rates to update within this rate group.
   */
  public List<DeliveryValueBasedRateUpdateInput> getRatesToUpdate() {
    return ratesToUpdate;
  }

  public void setRatesToUpdate(List<DeliveryValueBasedRateUpdateInput> ratesToUpdate) {
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
    return "DeliveryValueBasedRateGroupUpdateInput{id='" + id + "', ratesToCreate='" + ratesToCreate + "', ratesToUpdate='" + ratesToUpdate + "', ratesToDelete='" + ratesToDelete + "', conditions='" + conditions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryValueBasedRateGroupUpdateInput that = (DeliveryValueBasedRateGroupUpdateInput) o;
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
     * Rates to create within this rate group.
     */
    private List<DeliveryValueBasedRateCreateInput> ratesToCreate;

    /**
     * Rates to update within this rate group.
     */
    private List<DeliveryValueBasedRateUpdateInput> ratesToUpdate;

    /**
     * IDs of rates to delete from this rate group.
     */
    private List<String> ratesToDelete;

    /**
     * Collection and origin location conditions for this rate group.
     */
    private DeliveryRateConditionsUpdateInput conditions;

    public DeliveryValueBasedRateGroupUpdateInput build() {
      DeliveryValueBasedRateGroupUpdateInput result = new DeliveryValueBasedRateGroupUpdateInput();
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
     * Rates to create within this rate group.
     */
    public Builder ratesToCreate(List<DeliveryValueBasedRateCreateInput> ratesToCreate) {
      this.ratesToCreate = ratesToCreate;
      return this;
    }

    /**
     * Rates to update within this rate group.
     */
    public Builder ratesToUpdate(List<DeliveryValueBasedRateUpdateInput> ratesToUpdate) {
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
