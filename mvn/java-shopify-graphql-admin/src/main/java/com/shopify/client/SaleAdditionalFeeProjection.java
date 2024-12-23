package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SaleAdditionalFeeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SaleAdditionalFeeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SaleAdditionalFee"));
  }

  public SaleAdditionalFeeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<SaleAdditionalFeeProjection<PARENT, ROOT>, ROOT> price() {
     MoneyBagProjection<SaleAdditionalFeeProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public TaxLineProjection<SaleAdditionalFeeProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<SaleAdditionalFeeProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public SaleAdditionalFeeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SaleAdditionalFeeProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
