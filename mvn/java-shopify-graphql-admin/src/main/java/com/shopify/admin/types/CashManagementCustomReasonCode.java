package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Custom reason code.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CashManagementCustomReasonCode implements CashManagementReasonCode, com.shopify.admin.types.Node {
  /**
   * The code for the custom reason code.
   */
  private String code;

  /**
   * A globally-unique ID.
   */
  private String id;

  public CashManagementCustomReasonCode() {
  }

  /**
   * The code for the custom reason code.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "CashManagementCustomReasonCode{code='" + code + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashManagementCustomReasonCode that = (CashManagementCustomReasonCode) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code for the custom reason code.
     */
    private String code;

    /**
     * A globally-unique ID.
     */
    private String id;

    public CashManagementCustomReasonCode build() {
      CashManagementCustomReasonCode result = new CashManagementCustomReasonCode();
      result.code = this.code;
      result.id = this.id;
      return result;
    }

    /**
     * The code for the custom reason code.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
