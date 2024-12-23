package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class UnknownSaleFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public UnknownSaleFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UnknownSale"));
  }

  public UnknownSaleFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SaleActionTypeProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> actionType() {
     SaleActionTypeProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleActionTypeProjection<>(this, getRoot());
     getFields().put("actionType", projection);
     return projection;
  }

  public SaleLineTypeProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> lineType() {
     SaleLineTypeProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleLineTypeProjection<>(this, getRoot());
     getFields().put("lineType", projection);
     return projection;
  }

  public SaleTaxProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> taxes() {
     SaleTaxProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleTaxProjection<>(this, getRoot());
     getFields().put("taxes", projection);
     return projection;
  }

  public MoneyBagProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> totalAmount() {
     MoneyBagProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalAmount", projection);
     return projection;
  }

  public MoneyBagProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountAmountAfterTaxes(
      ) {
     MoneyBagProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountAfterTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountAmountBeforeTaxes(
      ) {
     MoneyBagProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountBeforeTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> totalTaxAmount() {
     MoneyBagProjection<UnknownSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxAmount", projection);
     return projection;
  }

  public UnknownSaleFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public UnknownSaleFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on UnknownSale {");
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
