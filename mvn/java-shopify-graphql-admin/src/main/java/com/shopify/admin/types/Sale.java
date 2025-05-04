package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
 * An individual sale record associated with a sales agreement. Every money value
 * in an order's sales data is represented in the currency's smallest unit. When
 * amounts are divided across multiple line items, such as taxes or order
 * discounts, the amounts might not divide evenly across all of the line items on
 * the order. To address this, the remaining currency units that couldn't be
 * divided evenly are allocated one at a time, starting with the first line item,
 * until they are all accounted for. In aggregate, the values sum up correctly. In
 * isolation, one line item might have a different tax or discount amount than
 * another line item of the same price, before taxes and discounts. This is because
 * the amount could not be divided evenly across the items. The allocation of
 * currency units across line items is immutable. After they are allocated,
 * currency units are never reallocated or redistributed among the line items.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AdditionalFeeSale.class, name = "AdditionalFeeSale"),
    @JsonSubTypes.Type(value = AdjustmentSale.class, name = "AdjustmentSale"),
    @JsonSubTypes.Type(value = DutySale.class, name = "DutySale"),
    @JsonSubTypes.Type(value = FeeSale.class, name = "FeeSale"),
    @JsonSubTypes.Type(value = GiftCardSale.class, name = "GiftCardSale"),
    @JsonSubTypes.Type(value = ProductSale.class, name = "ProductSale"),
    @JsonSubTypes.Type(value = ShippingLineSale.class, name = "ShippingLineSale"),
    @JsonSubTypes.Type(value = TipSale.class, name = "TipSale"),
    @JsonSubTypes.Type(value = UnknownSale.class, name = "UnknownSale")
})
public interface Sale {
  /**
   * The type of order action that the sale represents.
   */
  SaleActionType getActionType();

  /**
   * The unique ID for the sale.
   */
  String getId();

  /**
   * The line type assocated with the sale.
   */
  SaleLineType getLineType();

  /**
   * The number of units either ordered or intended to be returned.
   */
  Integer getQuantity();

  /**
   * All individual taxes associated with the sale.
   */
  List<SaleTax> getTaxes();

  /**
   * The total sale amount after taxes and discounts.
   */
  MoneyBag getTotalAmount();

  /**
   * The total discounts allocated to the sale after taxes.
   */
  MoneyBag getTotalDiscountAmountAfterTaxes();

  /**
   * The total discounts allocated to the sale before taxes.
   */
  MoneyBag getTotalDiscountAmountBeforeTaxes();

  /**
   * The total amount of taxes for the sale.
   */
  MoneyBag getTotalTaxAmount();
}
