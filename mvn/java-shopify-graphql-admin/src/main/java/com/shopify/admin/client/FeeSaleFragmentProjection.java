package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class FeeSaleFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public FeeSaleFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FeeSale"));
  }

  public FeeSaleFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SaleActionTypeProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> actionType() {
     SaleActionTypeProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleActionTypeProjection<>(this, getRoot());
     getFields().put("actionType", projection);
     return projection;
  }

  public FeeProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> fee() {
     FeeProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new FeeProjection<>(this, getRoot());
     getFields().put("fee", projection);
     return projection;
  }

  public SaleLineTypeProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> lineType() {
     SaleLineTypeProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleLineTypeProjection<>(this, getRoot());
     getFields().put("lineType", projection);
     return projection;
  }

  public SaleTaxProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> taxes() {
     SaleTaxProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleTaxProjection<>(this, getRoot());
     getFields().put("taxes", projection);
     return projection;
  }

  public MoneyBagProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> totalAmount() {
     MoneyBagProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalAmount", projection);
     return projection;
  }

  public MoneyBagProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountAmountAfterTaxes(
      ) {
     MoneyBagProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountAfterTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountAmountBeforeTaxes(
      ) {
     MoneyBagProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountBeforeTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> totalTaxAmount() {
     MoneyBagProjection<FeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxAmount", projection);
     return projection;
  }

  public FeeSaleFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FeeSaleFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on FeeSale {");
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
