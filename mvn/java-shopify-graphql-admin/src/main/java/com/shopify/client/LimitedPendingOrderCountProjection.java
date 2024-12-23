package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LimitedPendingOrderCountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LimitedPendingOrderCountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LimitedPendingOrderCount"));
  }

  public LimitedPendingOrderCountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LimitedPendingOrderCountProjection<PARENT, ROOT> atMax() {
    getFields().put("atMax", null);
    return this;
  }

  public LimitedPendingOrderCountProjection<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
