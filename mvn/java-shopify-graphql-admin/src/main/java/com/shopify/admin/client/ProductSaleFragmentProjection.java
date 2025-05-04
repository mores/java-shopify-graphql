package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ProductSaleFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductSaleFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductSale"));
  }

  public ProductSaleFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SaleActionTypeProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> actionType() {
     SaleActionTypeProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleActionTypeProjection<>(this, getRoot());
     getFields().put("actionType", projection);
     return projection;
  }

  public LineItemProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> lineItem() {
     LineItemProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public SaleLineTypeProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> lineType() {
     SaleLineTypeProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleLineTypeProjection<>(this, getRoot());
     getFields().put("lineType", projection);
     return projection;
  }

  public SaleTaxProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> taxes() {
     SaleTaxProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleTaxProjection<>(this, getRoot());
     getFields().put("taxes", projection);
     return projection;
  }

  public MoneyBagProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> totalAmount() {
     MoneyBagProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalAmount", projection);
     return projection;
  }

  public MoneyBagProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountAmountAfterTaxes(
      ) {
     MoneyBagProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountAfterTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountAmountBeforeTaxes(
      ) {
     MoneyBagProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountBeforeTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> totalTaxAmount() {
     MoneyBagProjection<ProductSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxAmount", projection);
     return projection;
  }

  public ProductSaleFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductSaleFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProductSale {");
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
