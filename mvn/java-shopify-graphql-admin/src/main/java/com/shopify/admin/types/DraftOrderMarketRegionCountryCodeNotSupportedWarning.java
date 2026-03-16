package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A warning indicating that the market region country code is not supported with Markets.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DraftOrderMarketRegionCountryCodeNotSupportedWarning implements com.shopify.admin.types.DraftOrderWarning {
  /**
   * The error code.
   */
  private String errorCode;

  /**
   * The input field that the warning applies to.
   */
  private String field;

  /**
   * The warning message.
   */
  private String message;

  public DraftOrderMarketRegionCountryCodeNotSupportedWarning() {
  }

  /**
   * The error code.
   */
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * The input field that the warning applies to.
   */
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  /**
   * The warning message.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "DraftOrderMarketRegionCountryCodeNotSupportedWarning{errorCode='" + errorCode + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderMarketRegionCountryCodeNotSupportedWarning that = (DraftOrderMarketRegionCountryCodeNotSupportedWarning) o;
    return Objects.equals(errorCode, that.errorCode) &&
        Objects.equals(field, that.field) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, field, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The error code.
     */
    private String errorCode;

    /**
     * The input field that the warning applies to.
     */
    private String field;

    /**
     * The warning message.
     */
    private String message;

    public DraftOrderMarketRegionCountryCodeNotSupportedWarning build() {
      DraftOrderMarketRegionCountryCodeNotSupportedWarning result = new DraftOrderMarketRegionCountryCodeNotSupportedWarning();
      result.errorCode = this.errorCode;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    /**
     * The error code.
     */
    public Builder errorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    /**
     * The input field that the warning applies to.
     */
    public Builder field(String field) {
      this.field = field;
      return this;
    }

    /**
     * The warning message.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
