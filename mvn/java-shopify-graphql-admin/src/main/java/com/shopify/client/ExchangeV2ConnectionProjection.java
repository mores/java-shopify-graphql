package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ExchangeV2ConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ExchangeV2ConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExchangeV2Connection"));
  }

  public ExchangeV2ConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ExchangeV2EdgeProjection<ExchangeV2ConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     ExchangeV2EdgeProjection<ExchangeV2ConnectionProjection<PARENT, ROOT>, ROOT> projection = new ExchangeV2EdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ExchangeV2Projection<ExchangeV2ConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ExchangeV2Projection<ExchangeV2ConnectionProjection<PARENT, ROOT>, ROOT> projection = new ExchangeV2Projection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ExchangeV2ConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ExchangeV2ConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
