package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionGroupedLineEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionGroupedLineEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionGroupedLineEdge"));
  }

  public SubscriptionGroupedLineEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionGroupedLineProjection<SubscriptionGroupedLineEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     SubscriptionGroupedLineProjection<SubscriptionGroupedLineEdgeProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionGroupedLineProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SubscriptionGroupedLineEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
