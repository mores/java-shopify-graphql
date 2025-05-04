package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Error codes for failed price list fixed prices by product bulk update operations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PriceListFixedPricesByProductBulkUpdateUserError implements com.shopify.admin.types.DisplayableError {
  /**
   * The error code.
   */
  private PriceListFixedPricesByProductBulkUpdateUserErrorCode code;

  /**
   * The path to the input field that caused the error.
   */
  private List<String> field;

  /**
   * The error message.
   */
  private String message;

  public PriceListFixedPricesByProductBulkUpdateUserError() {
  }

  /**
   * The error code.
   */
  public PriceListFixedPricesByProductBulkUpdateUserErrorCode getCode() {
    return code;
  }

  public void setCode(PriceListFixedPricesByProductBulkUpdateUserErrorCode code) {
    this.code = code;
  }

  /**
   * The path to the input field that caused the error.
   */
  public List<String> getField() {
    return field;
  }

  public void setField(List<String> field) {
    this.field = field;
  }

  /**
   * The error message.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "PriceListFixedPricesByProductBulkUpdateUserError{code='" + code + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListFixedPricesByProductBulkUpdateUserError that = (PriceListFixedPricesByProductBulkUpdateUserError) o;
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
     * The error code.
     */
    private PriceListFixedPricesByProductBulkUpdateUserErrorCode code;

    /**
     * The path to the input field that caused the error.
     */
    private List<String> field;

    /**
     * The error message.
     */
    private String message;

    public PriceListFixedPricesByProductBulkUpdateUserError build() {
      PriceListFixedPricesByProductBulkUpdateUserError result = new PriceListFixedPricesByProductBulkUpdateUserError();
      result.code = this.code;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    /**
     * The error code.
     */
    public Builder code(PriceListFixedPricesByProductBulkUpdateUserErrorCode code) {
      this.code = code;
      return this;
    }

    /**
     * The path to the input field that caused the error.
     */
    public Builder field(List<String> field) {
      this.field = field;
      return this;
    }

    /**
     * The error message.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
