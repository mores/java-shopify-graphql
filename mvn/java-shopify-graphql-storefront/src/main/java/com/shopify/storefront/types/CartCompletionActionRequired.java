package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The required completion action to checkout a cart.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CartCompletionActionRequired implements CartCompletionAttemptResult {
  /**
   * The action required to complete the cart completion attempt.
   */
  private CartCompletionAction action;

  /**
   * The ID of the cart completion attempt.
   */
  private String id;

  public CartCompletionActionRequired() {
  }

  /**
   * The action required to complete the cart completion attempt.
   */
  public CartCompletionAction getAction() {
    return action;
  }

  public void setAction(CartCompletionAction action) {
    this.action = action;
  }

  /**
   * The ID of the cart completion attempt.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "CartCompletionActionRequired{action='" + action + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartCompletionActionRequired that = (CartCompletionActionRequired) o;
    return Objects.equals(action, that.action) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The action required to complete the cart completion attempt.
     */
    private CartCompletionAction action;

    /**
     * The ID of the cart completion attempt.
     */
    private String id;

    public CartCompletionActionRequired build() {
      CartCompletionActionRequired result = new CartCompletionActionRequired();
      result.action = this.action;
      result.id = this.id;
      return result;
    }

    /**
     * The action required to complete the cart completion attempt.
     */
    public Builder action(CartCompletionAction action) {
      this.action = action;
      return this;
    }

    /**
     * The ID of the cart completion attempt.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
