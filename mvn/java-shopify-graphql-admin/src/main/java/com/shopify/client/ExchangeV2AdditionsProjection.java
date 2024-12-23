package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ExchangeV2AdditionsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ExchangeV2AdditionsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExchangeV2Additions"));
  }

  public ExchangeV2AdditionsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ExchangeV2LineItemProjection<ExchangeV2AdditionsProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     ExchangeV2LineItemProjection<ExchangeV2AdditionsProjection<PARENT, ROOT>, ROOT> projection = new ExchangeV2LineItemProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2AdditionsProjection<PARENT, ROOT>, ROOT> subtotalPriceSet() {
     MoneyBagProjection<ExchangeV2AdditionsProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalPriceSet", projection);
     return projection;
  }

  public TaxLineProjection<ExchangeV2AdditionsProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<ExchangeV2AdditionsProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2AdditionsProjection<PARENT, ROOT>, ROOT> totalPriceSet() {
     MoneyBagProjection<ExchangeV2AdditionsProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalPriceSet", projection);
     return projection;
  }
}
