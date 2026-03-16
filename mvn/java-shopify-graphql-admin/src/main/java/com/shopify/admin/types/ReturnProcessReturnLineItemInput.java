package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a return line item.
 */
public class ReturnProcessReturnLineItemInput {
  /**
   * The ID of the return line item.
   */
  private String id;

  /**
   * The quantity of the return line item.
   */
  private int quantity;

  /**
   * The dispositions for the return line item.
   */
  private List<ReverseFulfillmentOrderDisposeInput> dispositions;

  public ReturnProcessReturnLineItemInput() {
  }

  /**
   * The ID of the return line item.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The quantity of the return line item.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The dispositions for the return line item.
   */
  public List<ReverseFulfillmentOrderDisposeInput> getDispositions() {
    return dispositions;
  }

  public void setDispositions(List<ReverseFulfillmentOrderDisposeInput> dispositions) {
    this.dispositions = dispositions;
  }

  @Override
  public String toString() {
    return "ReturnProcessReturnLineItemInput{id='" + id + "', quantity='" + quantity + "', dispositions='" + dispositions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnProcessReturnLineItemInput that = (ReturnProcessReturnLineItemInput) o;
    return Objects.equals(id, that.id) &&
        quantity == that.quantity &&
        Objects.equals(dispositions, that.dispositions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, dispositions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the return line item.
     */
    private String id;

    /**
     * The quantity of the return line item.
     */
    private int quantity;

    /**
     * The dispositions for the return line item.
     */
    private List<ReverseFulfillmentOrderDisposeInput> dispositions;

    public ReturnProcessReturnLineItemInput build() {
      ReturnProcessReturnLineItemInput result = new ReturnProcessReturnLineItemInput();
      result.id = this.id;
      result.quantity = this.quantity;
      result.dispositions = this.dispositions;
      return result;
    }

    /**
     * The ID of the return line item.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The quantity of the return line item.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The dispositions for the return line item.
     */
    public Builder dispositions(List<ReverseFulfillmentOrderDisposeInput> dispositions) {
      this.dispositions = dispositions;
      return this;
    }
  }
}
