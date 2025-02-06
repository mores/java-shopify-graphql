package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to update a policy.
 */
public class ShopPolicyInput {
  /**
   * The shop policy type.
   */
  private ShopPolicyType type;

  /**
   * Policy text, maximum size of 512kb.
   */
  private String body;

  public ShopPolicyInput() {
  }

  /**
   * The shop policy type.
   */
  public ShopPolicyType getType() {
    return type;
  }

  public void setType(ShopPolicyType type) {
    this.type = type;
  }

  /**
   * Policy text, maximum size of 512kb.
   */
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public String toString() {
    return "ShopPolicyInput{type='" + type + "', body='" + body + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPolicyInput that = (ShopPolicyInput) o;
    return Objects.equals(type, that.type) &&
        Objects.equals(body, that.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, body);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The shop policy type.
     */
    private ShopPolicyType type;

    /**
     * Policy text, maximum size of 512kb.
     */
    private String body;

    public ShopPolicyInput build() {
      ShopPolicyInput result = new ShopPolicyInput();
      result.type = this.type;
      result.body = this.body;
      return result;
    }

    /**
     * The shop policy type.
     */
    public Builder type(ShopPolicyType type) {
      this.type = type;
      return this;
    }

    /**
     * Policy text, maximum size of 512kb.
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }
  }
}
