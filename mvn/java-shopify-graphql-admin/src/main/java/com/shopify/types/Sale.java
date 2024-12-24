package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.String;
import java.util.List;


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
  
  SaleActionType getActionType();

  
  String getId();

  
  SaleLineType getLineType();

  
  Integer getQuantity();

  
  List<SaleTax> getTaxes();

  
  MoneyBag getTotalAmount();

  
  MoneyBag getTotalDiscountAmountAfterTaxes();

  
  MoneyBag getTotalDiscountAmountBeforeTaxes();

  
  MoneyBag getTotalTaxAmount();
}
