package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ExchangeLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ExchangeLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExchangeLineItemConnection"));
  }

  public ExchangeLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ExchangeLineItemEdgeProjection<ExchangeLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ExchangeLineItemEdgeProjection<ExchangeLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new ExchangeLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ExchangeLineItemProjection<ExchangeLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ExchangeLineItemProjection<ExchangeLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new ExchangeLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ExchangeLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ExchangeLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
