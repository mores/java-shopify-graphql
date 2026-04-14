package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Default reason code.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CashManagementDefaultReasonCode implements CashManagementReasonCode, com.shopify.admin.types.Node {
  /**
   * The code for the default reason code.
   */
  private CashManagementDefaultReasonCodeEnum code;

  /**
   * A globally-unique ID.
   */
  private String id;

  public CashManagementDefaultReasonCode() {
  }

  /**
   * The code for the default reason code.
   */
  public CashManagementDefaultReasonCodeEnum getCode() {
    return code;
  }

  public void setCode(CashManagementDefaultReasonCodeEnum code) {
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
    return "CashManagementDefaultReasonCode{code='" + code + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashManagementDefaultReasonCode that = (CashManagementDefaultReasonCode) o;
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
     * The code for the default reason code.
     */
    private CashManagementDefaultReasonCodeEnum code;

    /**
     * A globally-unique ID.
     */
    private String id;

    public CashManagementDefaultReasonCode build() {
      CashManagementDefaultReasonCode result = new CashManagementDefaultReasonCode();
      result.code = this.code;
      result.id = this.id;
      return result;
    }

    /**
     * The code for the default reason code.
     */
    public Builder code(CashManagementDefaultReasonCodeEnum code) {
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
