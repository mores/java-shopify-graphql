package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A sale associated with a product.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductSale implements com.shopify.admin.types.Sale {
  /**
   * The type of order action that the sale represents.
   */
  private SaleActionType actionType;

  /**
   * The unique ID for the sale.
   */
  private String id;

  /**
   * The line item for the associated sale.
   */
  private LineItem lineItem;

  /**
   * The line type assocated with the sale.
   */
  private SaleLineType lineType;

  /**
   * The number of units either ordered or intended to be returned.
   */
  private Integer quantity;

  /**
   * All individual taxes associated with the sale.
   */
  private List<SaleTax> taxes;

  /**
   * The total sale amount after taxes and discounts.
   */
  private MoneyBag totalAmount;

  /**
   * The total discounts allocated to the sale after taxes.
   */
  private MoneyBag totalDiscountAmountAfterTaxes;

  /**
   * The total discounts allocated to the sale before taxes.
   */
  private MoneyBag totalDiscountAmountBeforeTaxes;

  /**
   * The total amount of taxes for the sale.
   */
  private MoneyBag totalTaxAmount;

  public ProductSale() {
  }

  /**
   * The type of order action that the sale represents.
   */
  public SaleActionType getActionType() {
    return actionType;
  }

  public void setActionType(SaleActionType actionType) {
    this.actionType = actionType;
  }

  /**
   * The unique ID for the sale.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The line item for the associated sale.
   */
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  /**
   * The line type assocated with the sale.
   */
  public SaleLineType getLineType() {
    return lineType;
  }

  public void setLineType(SaleLineType lineType) {
    this.lineType = lineType;
  }

  /**
   * The number of units either ordered or intended to be returned.
   */
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * All individual taxes associated with the sale.
   */
  public List<SaleTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<SaleTax> taxes) {
    this.taxes = taxes;
  }

  /**
   * The total sale amount after taxes and discounts.
   */
  public MoneyBag getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(MoneyBag totalAmount) {
    this.totalAmount = totalAmount;
  }

  /**
   * The total discounts allocated to the sale after taxes.
   */
  public MoneyBag getTotalDiscountAmountAfterTaxes() {
    return totalDiscountAmountAfterTaxes;
  }

  public void setTotalDiscountAmountAfterTaxes(MoneyBag totalDiscountAmountAfterTaxes) {
    this.totalDiscountAmountAfterTaxes = totalDiscountAmountAfterTaxes;
  }

  /**
   * The total discounts allocated to the sale before taxes.
   */
  public MoneyBag getTotalDiscountAmountBeforeTaxes() {
    return totalDiscountAmountBeforeTaxes;
  }

  public void setTotalDiscountAmountBeforeTaxes(MoneyBag totalDiscountAmountBeforeTaxes) {
    this.totalDiscountAmountBeforeTaxes = totalDiscountAmountBeforeTaxes;
  }

  /**
   * The total amount of taxes for the sale.
   */
  public MoneyBag getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(MoneyBag totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  @Override
  public String toString() {
    return "ProductSale{actionType='" + actionType + "', id='" + id + "', lineItem='" + lineItem + "', lineType='" + lineType + "', quantity='" + quantity + "', taxes='" + taxes + "', totalAmount='" + totalAmount + "', totalDiscountAmountAfterTaxes='" + totalDiscountAmountAfterTaxes + "', totalDiscountAmountBeforeTaxes='" + totalDiscountAmountBeforeTaxes + "', totalTaxAmount='" + totalTaxAmount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductSale that = (ProductSale) o;
    return Objects.equals(actionType, that.actionType) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineItem, that.lineItem) &&
        Objects.equals(lineType, that.lineType) &&
        Objects.equals(quantity, that.quantity) &&
        Objects.equals(taxes, that.taxes) &&
        Objects.equals(totalAmount, that.totalAmount) &&
        Objects.equals(totalDiscountAmountAfterTaxes, that.totalDiscountAmountAfterTaxes) &&
        Objects.equals(totalDiscountAmountBeforeTaxes, that.totalDiscountAmountBeforeTaxes) &&
        Objects.equals(totalTaxAmount, that.totalTaxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, id, lineItem, lineType, quantity, taxes, totalAmount, totalDiscountAmountAfterTaxes, totalDiscountAmountBeforeTaxes, totalTaxAmount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The type of order action that the sale represents.
     */
    private SaleActionType actionType;

    /**
     * The unique ID for the sale.
     */
    private String id;

    /**
     * The line item for the associated sale.
     */
    private LineItem lineItem;

    /**
     * The line type assocated with the sale.
     */
    private SaleLineType lineType;

    /**
     * The number of units either ordered or intended to be returned.
     */
    private Integer quantity;

    /**
     * All individual taxes associated with the sale.
     */
    private List<SaleTax> taxes;

    /**
     * The total sale amount after taxes and discounts.
     */
    private MoneyBag totalAmount;

    /**
     * The total discounts allocated to the sale after taxes.
     */
    private MoneyBag totalDiscountAmountAfterTaxes;

    /**
     * The total discounts allocated to the sale before taxes.
     */
    private MoneyBag totalDiscountAmountBeforeTaxes;

    /**
     * The total amount of taxes for the sale.
     */
    private MoneyBag totalTaxAmount;

    public ProductSale build() {
      ProductSale result = new ProductSale();
      result.actionType = this.actionType;
      result.id = this.id;
      result.lineItem = this.lineItem;
      result.lineType = this.lineType;
      result.quantity = this.quantity;
      result.taxes = this.taxes;
      result.totalAmount = this.totalAmount;
      result.totalDiscountAmountAfterTaxes = this.totalDiscountAmountAfterTaxes;
      result.totalDiscountAmountBeforeTaxes = this.totalDiscountAmountBeforeTaxes;
      result.totalTaxAmount = this.totalTaxAmount;
      return result;
    }

    /**
     * The type of order action that the sale represents.
     */
    public Builder actionType(SaleActionType actionType) {
      this.actionType = actionType;
      return this;
    }

    /**
     * The unique ID for the sale.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The line item for the associated sale.
     */
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    /**
     * The line type assocated with the sale.
     */
    public Builder lineType(SaleLineType lineType) {
      this.lineType = lineType;
      return this;
    }

    /**
     * The number of units either ordered or intended to be returned.
     */
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * All individual taxes associated with the sale.
     */
    public Builder taxes(List<SaleTax> taxes) {
      this.taxes = taxes;
      return this;
    }

    /**
     * The total sale amount after taxes and discounts.
     */
    public Builder totalAmount(MoneyBag totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }

    /**
     * The total discounts allocated to the sale after taxes.
     */
    public Builder totalDiscountAmountAfterTaxes(MoneyBag totalDiscountAmountAfterTaxes) {
      this.totalDiscountAmountAfterTaxes = totalDiscountAmountAfterTaxes;
      return this;
    }

    /**
     * The total discounts allocated to the sale before taxes.
     */
    public Builder totalDiscountAmountBeforeTaxes(MoneyBag totalDiscountAmountBeforeTaxes) {
      this.totalDiscountAmountBeforeTaxes = totalDiscountAmountBeforeTaxes;
      return this;
    }

    /**
     * The total amount of taxes for the sale.
     */
    public Builder totalTaxAmount(MoneyBag totalTaxAmount) {
      this.totalTaxAmount = totalTaxAmount;
      return this;
    }
  }
}
