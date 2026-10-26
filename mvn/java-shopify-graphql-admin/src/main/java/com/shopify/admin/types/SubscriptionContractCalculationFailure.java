package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A subscription contract calculation that has failed.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionContractCalculationFailure implements SubscriptionContractCalculation {
  /**
   * The errors that caused the calculation to fail.
   */
  private List<SubscriptionContractCalculationDiagnostic> errors;

  /**
   * The ID of the contract calculation.
   */
  private String id;

  public SubscriptionContractCalculationFailure() {
  }

  /**
   * The errors that caused the calculation to fail.
   */
  public List<SubscriptionContractCalculationDiagnostic> getErrors() {
    return errors;
  }

  public void setErrors(List<SubscriptionContractCalculationDiagnostic> errors) {
    this.errors = errors;
  }

  /**
   * The ID of the contract calculation.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationFailure{errors='" + errors + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationFailure that = (SubscriptionContractCalculationFailure) o;
    return Objects.equals(errors, that.errors) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The errors that caused the calculation to fail.
     */
    private List<SubscriptionContractCalculationDiagnostic> errors;

    /**
     * The ID of the contract calculation.
     */
    private String id;

    public SubscriptionContractCalculationFailure build() {
      SubscriptionContractCalculationFailure result = new SubscriptionContractCalculationFailure();
      result.errors = this.errors;
      result.id = this.id;
      return result;
    }

    /**
     * The errors that caused the calculation to fail.
     */
    public Builder errors(List<SubscriptionContractCalculationDiagnostic> errors) {
      this.errors = errors;
      return this;
    }

    /**
     * The ID of the contract calculation.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
