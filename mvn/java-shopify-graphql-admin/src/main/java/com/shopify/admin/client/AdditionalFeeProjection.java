package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AdditionalFeeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AdditionalFeeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AdditionalFee"));
  }

  public AdditionalFeeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<AdditionalFeeProjection<PARENT, ROOT>, ROOT> price() {
     MoneyBagProjection<AdditionalFeeProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public TaxLineProjection<AdditionalFeeProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<AdditionalFeeProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public AdditionalFeeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AdditionalFeeProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
