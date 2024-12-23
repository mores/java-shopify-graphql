package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractConnection"));
  }

  public SubscriptionContractConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractEdgeProjection<SubscriptionContractConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     SubscriptionContractEdgeProjection<SubscriptionContractConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SubscriptionContractProjection<SubscriptionContractConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     SubscriptionContractProjection<SubscriptionContractConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SubscriptionContractConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<SubscriptionContractConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
