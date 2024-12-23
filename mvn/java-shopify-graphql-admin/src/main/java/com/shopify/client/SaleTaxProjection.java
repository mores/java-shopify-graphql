package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SaleTaxProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SaleTaxProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SaleTax"));
  }

  public SaleTaxProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<SaleTaxProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyBagProjection<SaleTaxProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public TaxLineProjection<SaleTaxProjection<PARENT, ROOT>, ROOT> taxLine() {
     TaxLineProjection<SaleTaxProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLine", projection);
     return projection;
  }

  public SaleTaxProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
