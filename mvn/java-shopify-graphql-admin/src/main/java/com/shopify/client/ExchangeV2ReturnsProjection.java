package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ExchangeV2ReturnsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ExchangeV2ReturnsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExchangeV2Returns"));
  }

  public ExchangeV2ReturnsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ExchangeV2LineItemProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> lineItems() {
     ExchangeV2LineItemProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> projection = new ExchangeV2LineItemProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> orderDiscountAmountSet(
      ) {
     MoneyBagProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("orderDiscountAmountSet", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> shippingRefundAmountSet(
      ) {
     MoneyBagProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("shippingRefundAmountSet", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> subtotalPriceSet() {
     MoneyBagProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalPriceSet", projection);
     return projection;
  }

  public TaxLineProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> tipRefundAmountSet() {
     MoneyBagProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("tipRefundAmountSet", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> totalPriceSet() {
     MoneyBagProjection<ExchangeV2ReturnsProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalPriceSet", projection);
     return projection;
  }
}
