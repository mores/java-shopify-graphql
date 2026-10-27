package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a market's shipping configuration.
 */
public class ShippingConfigurationUpdateInput {
  /**
   * Whether shipping is enabled for this market. When false, customers in this
   * market won't see shipping options at checkout. Defaults to true when the
   * market has no shipping configuration; otherwise preserves the existing value.
   */
  private Boolean isEnabled;

  /**
   * Shipping options to create for this market.
   */
  private List<DeliveryOptionDefinitionCreateInput> optionDefinitionsToCreate;

  /**
   * Shipping options to update, matched by ID.
   */
  private List<DeliveryOptionDefinitionUpdateInput> optionDefinitionsToUpdate;

  /**
   * The IDs of shipping options to remove.
   */
  private List<String> optionDefinitionsToDelete;

  public ShippingConfigurationUpdateInput() {
  }

  /**
   * Whether shipping is enabled for this market. When false, customers in this
   * market won't see shipping options at checkout. Defaults to true when the
   * market has no shipping configuration; otherwise preserves the existing value.
   */
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  /**
   * Shipping options to create for this market.
   */
  public List<DeliveryOptionDefinitionCreateInput> getOptionDefinitionsToCreate() {
    return optionDefinitionsToCreate;
  }

  public void setOptionDefinitionsToCreate(
      List<DeliveryOptionDefinitionCreateInput> optionDefinitionsToCreate) {
    this.optionDefinitionsToCreate = optionDefinitionsToCreate;
  }

  /**
   * Shipping options to update, matched by ID.
   */
  public List<DeliveryOptionDefinitionUpdateInput> getOptionDefinitionsToUpdate() {
    return optionDefinitionsToUpdate;
  }

  public void setOptionDefinitionsToUpdate(
      List<DeliveryOptionDefinitionUpdateInput> optionDefinitionsToUpdate) {
    this.optionDefinitionsToUpdate = optionDefinitionsToUpdate;
  }

  /**
   * The IDs of shipping options to remove.
   */
  public List<String> getOptionDefinitionsToDelete() {
    return optionDefinitionsToDelete;
  }

  public void setOptionDefinitionsToDelete(List<String> optionDefinitionsToDelete) {
    this.optionDefinitionsToDelete = optionDefinitionsToDelete;
  }

  @Override
  public String toString() {
    return "ShippingConfigurationUpdateInput{isEnabled='" + isEnabled + "', optionDefinitionsToCreate='" + optionDefinitionsToCreate + "', optionDefinitionsToUpdate='" + optionDefinitionsToUpdate + "', optionDefinitionsToDelete='" + optionDefinitionsToDelete + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingConfigurationUpdateInput that = (ShippingConfigurationUpdateInput) o;
    return Objects.equals(isEnabled, that.isEnabled) &&
        Objects.equals(optionDefinitionsToCreate, that.optionDefinitionsToCreate) &&
        Objects.equals(optionDefinitionsToUpdate, that.optionDefinitionsToUpdate) &&
        Objects.equals(optionDefinitionsToDelete, that.optionDefinitionsToDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, optionDefinitionsToCreate, optionDefinitionsToUpdate, optionDefinitionsToDelete);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether shipping is enabled for this market. When false, customers in this
     * market won't see shipping options at checkout. Defaults to true when the
     * market has no shipping configuration; otherwise preserves the existing value.
     */
    private Boolean isEnabled;

    /**
     * Shipping options to create for this market.
     */
    private List<DeliveryOptionDefinitionCreateInput> optionDefinitionsToCreate;

    /**
     * Shipping options to update, matched by ID.
     */
    private List<DeliveryOptionDefinitionUpdateInput> optionDefinitionsToUpdate;

    /**
     * The IDs of shipping options to remove.
     */
    private List<String> optionDefinitionsToDelete;

    public ShippingConfigurationUpdateInput build() {
      ShippingConfigurationUpdateInput result = new ShippingConfigurationUpdateInput();
      result.isEnabled = this.isEnabled;
      result.optionDefinitionsToCreate = this.optionDefinitionsToCreate;
      result.optionDefinitionsToUpdate = this.optionDefinitionsToUpdate;
      result.optionDefinitionsToDelete = this.optionDefinitionsToDelete;
      return result;
    }

    /**
     * Whether shipping is enabled for this market. When false, customers in this
     * market won't see shipping options at checkout. Defaults to true when the
     * market has no shipping configuration; otherwise preserves the existing value.
     */
    public Builder isEnabled(Boolean isEnabled) {
      this.isEnabled = isEnabled;
      return this;
    }

    /**
     * Shipping options to create for this market.
     */
    public Builder optionDefinitionsToCreate(
        List<DeliveryOptionDefinitionCreateInput> optionDefinitionsToCreate) {
      this.optionDefinitionsToCreate = optionDefinitionsToCreate;
      return this;
    }

    /**
     * Shipping options to update, matched by ID.
     */
    public Builder optionDefinitionsToUpdate(
        List<DeliveryOptionDefinitionUpdateInput> optionDefinitionsToUpdate) {
      this.optionDefinitionsToUpdate = optionDefinitionsToUpdate;
      return this;
    }

    /**
     * The IDs of shipping options to remove.
     */
    public Builder optionDefinitionsToDelete(List<String> optionDefinitionsToDelete) {
      this.optionDefinitionsToDelete = optionDefinitionsToDelete;
      return this;
    }
  }
}
