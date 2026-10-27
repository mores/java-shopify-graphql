package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionGroupedLineConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionGroupedLineConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionGroupedLineConnection"));
  }

  public SubscriptionGroupedLineConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionGroupedLineEdgeProjection<SubscriptionGroupedLineConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     SubscriptionGroupedLineEdgeProjection<SubscriptionGroupedLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionGroupedLineEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SubscriptionGroupedLineProjection<SubscriptionGroupedLineConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     SubscriptionGroupedLineProjection<SubscriptionGroupedLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionGroupedLineProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SubscriptionGroupedLineConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<SubscriptionGroupedLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
