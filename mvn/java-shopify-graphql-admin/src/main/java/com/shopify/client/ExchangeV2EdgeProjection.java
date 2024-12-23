package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ExchangeV2EdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ExchangeV2EdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExchangeV2Edge"));
  }

  public ExchangeV2EdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ExchangeV2Projection<ExchangeV2EdgeProjection<PARENT, ROOT>, ROOT> node() {
     ExchangeV2Projection<ExchangeV2EdgeProjection<PARENT, ROOT>, ROOT> projection = new ExchangeV2Projection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ExchangeV2EdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
