package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedShippingLineProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedShippingLineProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedShippingLine"));
  }

  public CalculatedShippingLineProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<CalculatedShippingLineProjection<PARENT, ROOT>, ROOT> price() {
     MoneyBagProjection<CalculatedShippingLineProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public CalculatedShippingLineStagedStatusProjection<CalculatedShippingLineProjection<PARENT, ROOT>, ROOT> stagedStatus(
      ) {
     CalculatedShippingLineStagedStatusProjection<CalculatedShippingLineProjection<PARENT, ROOT>, ROOT> projection = new CalculatedShippingLineStagedStatusProjection<>(this, getRoot());
     getFields().put("stagedStatus", projection);
     return projection;
  }

  public CalculatedShippingLineProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CalculatedShippingLineProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
