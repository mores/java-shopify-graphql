package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `quantityRulesDelete` mutation.
 */
public class QuantityRulesDeletePayload {
  /**
   * A list of product variant IDs whose quantity rules were removed from the price list.
   */
  private List<String> deletedQuantityRulesVariantIds;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<QuantityRuleUserError> userErrors;

  public QuantityRulesDeletePayload() {
  }

  /**
   * A list of product variant IDs whose quantity rules were removed from the price list.
   */
  public List<String> getDeletedQuantityRulesVariantIds() {
    return deletedQuantityRulesVariantIds;
  }

  public void setDeletedQuantityRulesVariantIds(List<String> deletedQuantityRulesVariantIds) {
    this.deletedQuantityRulesVariantIds = deletedQuantityRulesVariantIds;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<QuantityRuleUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<QuantityRuleUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "QuantityRulesDeletePayload{deletedQuantityRulesVariantIds='" + deletedQuantityRulesVariantIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityRulesDeletePayload that = (QuantityRulesDeletePayload) o;
    return Objects.equals(deletedQuantityRulesVariantIds, that.deletedQuantityRulesVariantIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedQuantityRulesVariantIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of product variant IDs whose quantity rules were removed from the price list.
     */
    private List<String> deletedQuantityRulesVariantIds;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<QuantityRuleUserError> userErrors;

    public QuantityRulesDeletePayload build() {
      QuantityRulesDeletePayload result = new QuantityRulesDeletePayload();
      result.deletedQuantityRulesVariantIds = this.deletedQuantityRulesVariantIds;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * A list of product variant IDs whose quantity rules were removed from the price list.
     */
    public Builder deletedQuantityRulesVariantIds(List<String> deletedQuantityRulesVariantIds) {
      this.deletedQuantityRulesVariantIds = deletedQuantityRulesVariantIds;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<QuantityRuleUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
