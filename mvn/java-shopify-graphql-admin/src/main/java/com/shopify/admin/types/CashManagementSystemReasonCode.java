package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * System reason code.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CashManagementSystemReasonCode implements CashManagementReasonCode, com.shopify.admin.types.Node {
  /**
   * The code for the system reason code.
   */
  private CashManagementSystemReasonCodeEnum code;

  /**
   * A globally-unique ID.
   */
  private String id;

  public CashManagementSystemReasonCode() {
  }

  /**
   * The code for the system reason code.
   */
  public CashManagementSystemReasonCodeEnum getCode() {
    return code;
  }

  public void setCode(CashManagementSystemReasonCodeEnum code) {
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
    return "CashManagementSystemReasonCode{code='" + code + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashManagementSystemReasonCode that = (CashManagementSystemReasonCode) o;
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
     * The code for the system reason code.
     */
    private CashManagementSystemReasonCodeEnum code;

    /**
     * A globally-unique ID.
     */
    private String id;

    public CashManagementSystemReasonCode build() {
      CashManagementSystemReasonCode result = new CashManagementSystemReasonCode();
      result.code = this.code;
      result.id = this.id;
      return result;
    }

    /**
     * The code for the system reason code.
     */
    public Builder code(CashManagementSystemReasonCodeEnum code) {
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
