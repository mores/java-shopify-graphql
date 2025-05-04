package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShippingLineSaleFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShippingLineSaleFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingLineSale"));
  }

  public ShippingLineSaleFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SaleActionTypeProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> actionType(
      ) {
     SaleActionTypeProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleActionTypeProjection<>(this, getRoot());
     getFields().put("actionType", projection);
     return projection;
  }

  public SaleLineTypeProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> lineType() {
     SaleLineTypeProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleLineTypeProjection<>(this, getRoot());
     getFields().put("lineType", projection);
     return projection;
  }

  public ShippingLineProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> shippingLine(
      ) {
     ShippingLineProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShippingLineProjection<>(this, getRoot());
     getFields().put("shippingLine", projection);
     return projection;
  }

  public SaleTaxProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> taxes() {
     SaleTaxProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleTaxProjection<>(this, getRoot());
     getFields().put("taxes", projection);
     return projection;
  }

  public MoneyBagProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> totalAmount() {
     MoneyBagProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalAmount", projection);
     return projection;
  }

  public MoneyBagProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountAmountAfterTaxes(
      ) {
     MoneyBagProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountAfterTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountAmountBeforeTaxes(
      ) {
     MoneyBagProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountBeforeTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> totalTaxAmount(
      ) {
     MoneyBagProjection<ShippingLineSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxAmount", projection);
     return projection;
  }

  public ShippingLineSaleFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShippingLineSaleFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShippingLineSale {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
