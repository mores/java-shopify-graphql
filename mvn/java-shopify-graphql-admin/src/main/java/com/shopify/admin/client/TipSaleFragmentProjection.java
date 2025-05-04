package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class TipSaleFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public TipSaleFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TipSale"));
  }

  public TipSaleFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SaleActionTypeProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> actionType() {
     SaleActionTypeProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleActionTypeProjection<>(this, getRoot());
     getFields().put("actionType", projection);
     return projection;
  }

  public LineItemProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> lineItem() {
     LineItemProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public SaleLineTypeProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> lineType() {
     SaleLineTypeProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleLineTypeProjection<>(this, getRoot());
     getFields().put("lineType", projection);
     return projection;
  }

  public SaleTaxProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> taxes() {
     SaleTaxProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleTaxProjection<>(this, getRoot());
     getFields().put("taxes", projection);
     return projection;
  }

  public MoneyBagProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> totalAmount() {
     MoneyBagProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalAmount", projection);
     return projection;
  }

  public MoneyBagProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountAmountAfterTaxes(
      ) {
     MoneyBagProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountAfterTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountAmountBeforeTaxes(
      ) {
     MoneyBagProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountBeforeTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> totalTaxAmount() {
     MoneyBagProjection<TipSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxAmount", projection);
     return projection;
  }

  public TipSaleFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public TipSaleFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on TipSale {");
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
