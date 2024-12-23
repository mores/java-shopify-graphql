package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PendingOrdersCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PendingOrdersCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public PendingOrdersCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<PendingOrdersCountProjectionRoot<PARENT, ROOT>, PendingOrdersCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<PendingOrdersCountProjectionRoot<PARENT, ROOT>, PendingOrdersCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public PendingOrdersCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
