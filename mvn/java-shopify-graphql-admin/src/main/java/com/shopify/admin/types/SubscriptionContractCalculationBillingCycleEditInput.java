package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for editing a subscription contract for a single billing cycle, used for
 * contract calculation. Any field provided will update or replace the corresponding value for
 * the targeted cycle. Fields that are omitted will be left unchanged. Contract-level
 * attributes such as billing policy, delivery policy, and payment method cannot be changed by
 * a billing cycle edit.
 */
public class SubscriptionContractCalculationBillingCycleEditInput {
  /**
   * Specifies whether to use merchandise customizations in the calculation.
   */
  private boolean withMerchandiseCustomizations;

  /**
   * The subscription lines to set for the targeted billing cycle. Replaces all
   * existing lines with the contents of this array. At least one line is required.
   * - To update an existing line within the new set, include its `id`.
   * - To add a new line, omit its `id`.
   */
  private List<SubscriptionContractCalculationLineInput> lines;

  /**
   * The manual order and delivery discounts to set for the targeted billing cycle. Replaces all existing manual discounts.
   * - To update an existing discount within the new set, include its `id`.
   * - To add a new discount, omit its `id`.
   * - To remove all manual discounts, provide an empty array (`[]`).
   */
  private List<SubscriptionContractCalculationManualDiscountInput> manualDiscounts;

  /**
   * The discount codes to apply to the targeted billing cycle during this calculation. Applied
   * codes are resolved into manual discounts; discount codes aren't persisted as codes, so there
   * is nothing to preserve or replace across calculations. Defaults to an empty array (apply no
   * discount codes).
   */
  private List<SubscriptionContractCalculationDiscountCodeInput> discountCodes = Collections.emptyList();

  /**
   * The note for the targeted billing cycle. To remove the existing note, pass `null`.
   */
  private String note;

  /**
   * The custom attributes for the targeted billing cycle. Replaces all existing
   * attributes. To remove all attributes, provide an empty array (`[]`).
   */
  private List<AttributeInput> customAttributes;

  /**
   * The delivery method for the targeted billing cycle. Replaces the existing
   * delivery method. Provide `none` to remove the delivery method. Provide
   * `fetchAvailableDeliveryOptions` instead of a method to discover options for an
   * address without changing the committed delivery method.
   */
  private SubscriptionContractCalculationDeliveryMethodInput deliveryMethod;

  public SubscriptionContractCalculationBillingCycleEditInput() {
  }

  /**
   * Specifies whether to use merchandise customizations in the calculation.
   */
  public boolean getWithMerchandiseCustomizations() {
    return withMerchandiseCustomizations;
  }

  public void setWithMerchandiseCustomizations(boolean withMerchandiseCustomizations) {
    this.withMerchandiseCustomizations = withMerchandiseCustomizations;
  }

  /**
   * The subscription lines to set for the targeted billing cycle. Replaces all
   * existing lines with the contents of this array. At least one line is required.
   * - To update an existing line within the new set, include its `id`.
   * - To add a new line, omit its `id`.
   */
  public List<SubscriptionContractCalculationLineInput> getLines() {
    return lines;
  }

  public void setLines(List<SubscriptionContractCalculationLineInput> lines) {
    this.lines = lines;
  }

  /**
   * The manual order and delivery discounts to set for the targeted billing cycle. Replaces all existing manual discounts.
   * - To update an existing discount within the new set, include its `id`.
   * - To add a new discount, omit its `id`.
   * - To remove all manual discounts, provide an empty array (`[]`).
   */
  public List<SubscriptionContractCalculationManualDiscountInput> getManualDiscounts() {
    return manualDiscounts;
  }

  public void setManualDiscounts(
      List<SubscriptionContractCalculationManualDiscountInput> manualDiscounts) {
    this.manualDiscounts = manualDiscounts;
  }

  /**
   * The discount codes to apply to the targeted billing cycle during this calculation. Applied
   * codes are resolved into manual discounts; discount codes aren't persisted as codes, so there
   * is nothing to preserve or replace across calculations. Defaults to an empty array (apply no
   * discount codes).
   */
  public List<SubscriptionContractCalculationDiscountCodeInput> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(
      List<SubscriptionContractCalculationDiscountCodeInput> discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   * The note for the targeted billing cycle. To remove the existing note, pass `null`.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The custom attributes for the targeted billing cycle. Replaces all existing
   * attributes. To remove all attributes, provide an empty array (`[]`).
   */
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The delivery method for the targeted billing cycle. Replaces the existing
   * delivery method. Provide `none` to remove the delivery method. Provide
   * `fetchAvailableDeliveryOptions` instead of a method to discover options for an
   * address without changing the committed delivery method.
   */
  public SubscriptionContractCalculationDeliveryMethodInput getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(SubscriptionContractCalculationDeliveryMethodInput deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationBillingCycleEditInput{withMerchandiseCustomizations='" + withMerchandiseCustomizations + "', lines='" + lines + "', manualDiscounts='" + manualDiscounts + "', discountCodes='" + discountCodes + "', note='" + note + "', customAttributes='" + customAttributes + "', deliveryMethod='" + deliveryMethod + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationBillingCycleEditInput that = (SubscriptionContractCalculationBillingCycleEditInput) o;
    return withMerchandiseCustomizations == that.withMerchandiseCustomizations &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(manualDiscounts, that.manualDiscounts) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(note, that.note) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(deliveryMethod, that.deliveryMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withMerchandiseCustomizations, lines, manualDiscounts, discountCodes, note, customAttributes, deliveryMethod);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies whether to use merchandise customizations in the calculation.
     */
    private boolean withMerchandiseCustomizations;

    /**
     * The subscription lines to set for the targeted billing cycle. Replaces all
     * existing lines with the contents of this array. At least one line is required.
     * - To update an existing line within the new set, include its `id`.
     * - To add a new line, omit its `id`.
     */
    private List<SubscriptionContractCalculationLineInput> lines;

    /**
     * The manual order and delivery discounts to set for the targeted billing cycle. Replaces all existing manual discounts.
     * - To update an existing discount within the new set, include its `id`.
     * - To add a new discount, omit its `id`.
     * - To remove all manual discounts, provide an empty array (`[]`).
     */
    private List<SubscriptionContractCalculationManualDiscountInput> manualDiscounts;

    /**
     * The discount codes to apply to the targeted billing cycle during this calculation. Applied
     * codes are resolved into manual discounts; discount codes aren't persisted as codes, so there
     * is nothing to preserve or replace across calculations. Defaults to an empty array (apply no
     * discount codes).
     */
    private List<SubscriptionContractCalculationDiscountCodeInput> discountCodes = Collections.emptyList();

    /**
     * The note for the targeted billing cycle. To remove the existing note, pass `null`.
     */
    private String note;

    /**
     * The custom attributes for the targeted billing cycle. Replaces all existing
     * attributes. To remove all attributes, provide an empty array (`[]`).
     */
    private List<AttributeInput> customAttributes;

    /**
     * The delivery method for the targeted billing cycle. Replaces the existing
     * delivery method. Provide `none` to remove the delivery method. Provide
     * `fetchAvailableDeliveryOptions` instead of a method to discover options for an
     * address without changing the committed delivery method.
     */
    private SubscriptionContractCalculationDeliveryMethodInput deliveryMethod;

    public SubscriptionContractCalculationBillingCycleEditInput build() {
      SubscriptionContractCalculationBillingCycleEditInput result = new SubscriptionContractCalculationBillingCycleEditInput();
      result.withMerchandiseCustomizations = this.withMerchandiseCustomizations;
      result.lines = this.lines;
      result.manualDiscounts = this.manualDiscounts;
      result.discountCodes = this.discountCodes;
      result.note = this.note;
      result.customAttributes = this.customAttributes;
      result.deliveryMethod = this.deliveryMethod;
      return result;
    }

    /**
     * Specifies whether to use merchandise customizations in the calculation.
     */
    public Builder withMerchandiseCustomizations(boolean withMerchandiseCustomizations) {
      this.withMerchandiseCustomizations = withMerchandiseCustomizations;
      return this;
    }

    /**
     * The subscription lines to set for the targeted billing cycle. Replaces all
     * existing lines with the contents of this array. At least one line is required.
     * - To update an existing line within the new set, include its `id`.
     * - To add a new line, omit its `id`.
     */
    public Builder lines(List<SubscriptionContractCalculationLineInput> lines) {
      this.lines = lines;
      return this;
    }

    /**
     * The manual order and delivery discounts to set for the targeted billing cycle. Replaces all existing manual discounts.
     * - To update an existing discount within the new set, include its `id`.
     * - To add a new discount, omit its `id`.
     * - To remove all manual discounts, provide an empty array (`[]`).
     */
    public Builder manualDiscounts(
        List<SubscriptionContractCalculationManualDiscountInput> manualDiscounts) {
      this.manualDiscounts = manualDiscounts;
      return this;
    }

    /**
     * The discount codes to apply to the targeted billing cycle during this calculation. Applied
     * codes are resolved into manual discounts; discount codes aren't persisted as codes, so there
     * is nothing to preserve or replace across calculations. Defaults to an empty array (apply no
     * discount codes).
     */
    public Builder discountCodes(
        List<SubscriptionContractCalculationDiscountCodeInput> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    /**
     * The note for the targeted billing cycle. To remove the existing note, pass `null`.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The custom attributes for the targeted billing cycle. Replaces all existing
     * attributes. To remove all attributes, provide an empty array (`[]`).
     */
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The delivery method for the targeted billing cycle. Replaces the existing
     * delivery method. Provide `none` to remove the delivery method. Provide
     * `fetchAvailableDeliveryOptions` instead of a method to discover options for an
     * address without changing the committed delivery method.
     */
    public Builder deliveryMethod(
        SubscriptionContractCalculationDeliveryMethodInput deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }
  }
}
