package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AdditionalFeeSaleFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AdditionalFeeSaleFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AdditionalFeeSale"));
  }

  public AdditionalFeeSaleFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SaleActionTypeProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> actionType(
      ) {
     SaleActionTypeProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleActionTypeProjection<>(this, getRoot());
     getFields().put("actionType", projection);
     return projection;
  }

  public SaleAdditionalFeeProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> additionalFee(
      ) {
     SaleAdditionalFeeProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleAdditionalFeeProjection<>(this, getRoot());
     getFields().put("additionalFee", projection);
     return projection;
  }

  public SaleLineTypeProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> lineType(
      ) {
     SaleLineTypeProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleLineTypeProjection<>(this, getRoot());
     getFields().put("lineType", projection);
     return projection;
  }

  public SaleTaxProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> taxes() {
     SaleTaxProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleTaxProjection<>(this, getRoot());
     getFields().put("taxes", projection);
     return projection;
  }

  public MoneyBagProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> totalAmount() {
     MoneyBagProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalAmount", projection);
     return projection;
  }

  public MoneyBagProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountAmountAfterTaxes(
      ) {
     MoneyBagProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountAfterTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountAmountBeforeTaxes(
      ) {
     MoneyBagProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountBeforeTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> totalTaxAmount(
      ) {
     MoneyBagProjection<AdditionalFeeSaleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxAmount", projection);
     return projection;
  }

  public AdditionalFeeSaleFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AdditionalFeeSaleFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AdditionalFeeSale {");
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
