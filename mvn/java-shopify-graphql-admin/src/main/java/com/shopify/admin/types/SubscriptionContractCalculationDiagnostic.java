package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A diagnostic (error or warning) emitted during a subscription contract calculation.
 */
public class SubscriptionContractCalculationDiagnostic {
  /**
   * The diagnostic code.
   */
  private SubscriptionContractCalculationDiagnosticCode code;

  /**
   * The path to the field on the calculation result that the diagnostic refers to,
   * if any. Fields of the calculated contract start at `calculatedContract`, and
   * line paths are keyed by the line's `id` on the calculated contract.
   */
  private List<String> field;

  /**
   * A human-readable message describing the diagnostic.
   */
  private String message;

  public SubscriptionContractCalculationDiagnostic() {
  }

  /**
   * The diagnostic code.
   */
  public SubscriptionContractCalculationDiagnosticCode getCode() {
    return code;
  }

  public void setCode(SubscriptionContractCalculationDiagnosticCode code) {
    this.code = code;
  }

  /**
   * The path to the field on the calculation result that the diagnostic refers to,
   * if any. Fields of the calculated contract start at `calculatedContract`, and
   * line paths are keyed by the line's `id` on the calculated contract.
   */
  public List<String> getField() {
    return field;
  }

  public void setField(List<String> field) {
    this.field = field;
  }

  /**
   * A human-readable message describing the diagnostic.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationDiagnostic{code='" + code + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationDiagnostic that = (SubscriptionContractCalculationDiagnostic) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(field, that.field) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, field, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The diagnostic code.
     */
    private SubscriptionContractCalculationDiagnosticCode code;

    /**
     * The path to the field on the calculation result that the diagnostic refers to,
     * if any. Fields of the calculated contract start at `calculatedContract`, and
     * line paths are keyed by the line's `id` on the calculated contract.
     */
    private List<String> field;

    /**
     * A human-readable message describing the diagnostic.
     */
    private String message;

    public SubscriptionContractCalculationDiagnostic build() {
      SubscriptionContractCalculationDiagnostic result = new SubscriptionContractCalculationDiagnostic();
      result.code = this.code;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    /**
     * The diagnostic code.
     */
    public Builder code(SubscriptionContractCalculationDiagnosticCode code) {
      this.code = code;
      return this;
    }

    /**
     * The path to the field on the calculation result that the diagnostic refers to,
     * if any. Fields of the calculated contract start at `calculatedContract`, and
     * line paths are keyed by the line's `id` on the calculated contract.
     */
    public Builder field(List<String> field) {
      this.field = field;
      return this;
    }

    /**
     * A human-readable message describing the diagnostic.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
