package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionLineConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionLineConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionLineConnection"));
  }

  public SubscriptionLineConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionLineEdgeProjection<SubscriptionLineConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     SubscriptionLineEdgeProjection<SubscriptionLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SubscriptionLineProjection<SubscriptionLineConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     SubscriptionLineProjection<SubscriptionLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SubscriptionLineConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<SubscriptionLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
