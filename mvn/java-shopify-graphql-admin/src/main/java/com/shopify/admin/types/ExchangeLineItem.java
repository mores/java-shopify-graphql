package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An item for exchange.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ExchangeLineItem implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The order line item for the exchange. If the exchange line has been processed
   * multiple times, this will be the first associated line item and won't reflect
   * all processed values.
   */
  private LineItem lineItem;

  /**
   * The order line items for the exchange.
   */
  private List<LineItem> lineItems;

  /**
   * The quantity of the exchange item that can be processed.
   */
  private int processableQuantity;

  /**
   * The quantity of the exchange item that have been processed.
   */
  private int processedQuantity;

  /**
   * The number of units ordered, including refunded and removed units.
   */
  private int quantity;

  /**
   * The quantity of the exchange item that haven't been processed.
   */
  private int unprocessedQuantity;

  /**
   * The ID of the variant at time of return creation.
   */
  private String variantId;

  public ExchangeLineItem() {
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

  /**
   * The order line item for the exchange. If the exchange line has been processed
   * multiple times, this will be the first associated line item and won't reflect
   * all processed values.
   */
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  /**
   * The order line items for the exchange.
   */
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The quantity of the exchange item that can be processed.
   */
  public int getProcessableQuantity() {
    return processableQuantity;
  }

  public void setProcessableQuantity(int processableQuantity) {
    this.processableQuantity = processableQuantity;
  }

  /**
   * The quantity of the exchange item that have been processed.
   */
  public int getProcessedQuantity() {
    return processedQuantity;
  }

  public void setProcessedQuantity(int processedQuantity) {
    this.processedQuantity = processedQuantity;
  }

  /**
   * The number of units ordered, including refunded and removed units.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The quantity of the exchange item that haven't been processed.
   */
  public int getUnprocessedQuantity() {
    return unprocessedQuantity;
  }

  public void setUnprocessedQuantity(int unprocessedQuantity) {
    this.unprocessedQuantity = unprocessedQuantity;
  }

  /**
   * The ID of the variant at time of return creation.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  @Override
  public String toString() {
    return "ExchangeLineItem{id='" + id + "', lineItem='" + lineItem + "', lineItems='" + lineItems + "', processableQuantity='" + processableQuantity + "', processedQuantity='" + processedQuantity + "', quantity='" + quantity + "', unprocessedQuantity='" + unprocessedQuantity + "', variantId='" + variantId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeLineItem that = (ExchangeLineItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(lineItem, that.lineItem) &&
        Objects.equals(lineItems, that.lineItems) &&
        processableQuantity == that.processableQuantity &&
        processedQuantity == that.processedQuantity &&
        quantity == that.quantity &&
        unprocessedQuantity == that.unprocessedQuantity &&
        Objects.equals(variantId, that.variantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineItem, lineItems, processableQuantity, processedQuantity, quantity, unprocessedQuantity, variantId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The order line item for the exchange. If the exchange line has been processed
     * multiple times, this will be the first associated line item and won't reflect
     * all processed values.
     */
    private LineItem lineItem;

    /**
     * The order line items for the exchange.
     */
    private List<LineItem> lineItems;

    /**
     * The quantity of the exchange item that can be processed.
     */
    private int processableQuantity;

    /**
     * The quantity of the exchange item that have been processed.
     */
    private int processedQuantity;

    /**
     * The number of units ordered, including refunded and removed units.
     */
    private int quantity;

    /**
     * The quantity of the exchange item that haven't been processed.
     */
    private int unprocessedQuantity;

    /**
     * The ID of the variant at time of return creation.
     */
    private String variantId;

    public ExchangeLineItem build() {
      ExchangeLineItem result = new ExchangeLineItem();
      result.id = this.id;
      result.lineItem = this.lineItem;
      result.lineItems = this.lineItems;
      result.processableQuantity = this.processableQuantity;
      result.processedQuantity = this.processedQuantity;
      result.quantity = this.quantity;
      result.unprocessedQuantity = this.unprocessedQuantity;
      result.variantId = this.variantId;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The order line item for the exchange. If the exchange line has been processed
     * multiple times, this will be the first associated line item and won't reflect
     * all processed values.
     */
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    /**
     * The order line items for the exchange.
     */
    public Builder lineItems(List<LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The quantity of the exchange item that can be processed.
     */
    public Builder processableQuantity(int processableQuantity) {
      this.processableQuantity = processableQuantity;
      return this;
    }

    /**
     * The quantity of the exchange item that have been processed.
     */
    public Builder processedQuantity(int processedQuantity) {
      this.processedQuantity = processedQuantity;
      return this;
    }

    /**
     * The number of units ordered, including refunded and removed units.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The quantity of the exchange item that haven't been processed.
     */
    public Builder unprocessedQuantity(int unprocessedQuantity) {
      this.unprocessedQuantity = unprocessedQuantity;
      return this;
    }

    /**
     * The ID of the variant at time of return creation.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }
  }
}
