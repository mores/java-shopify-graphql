package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxLineProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxLineProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxLine"));
  }

  public TaxLineProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<TaxLineProjection<PARENT, ROOT>, ROOT> priceSet() {
     MoneyBagProjection<TaxLineProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("priceSet", projection);
     return projection;
  }

  public TaxLineProjection<PARENT, ROOT> channelLiable() {
    getFields().put("channelLiable", null);
    return this;
  }

  public TaxLineProjection<PARENT, ROOT> price() {
    getFields().put("price", null);
    return this;
  }

  public TaxLineProjection<PARENT, ROOT> rate() {
    getFields().put("rate", null);
    return this;
  }

  public TaxLineProjection<PARENT, ROOT> ratePercentage() {
    getFields().put("ratePercentage", null);
    return this;
  }

  public TaxLineProjection<PARENT, ROOT> source() {
    getFields().put("source", null);
    return this;
  }

  public TaxLineProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
