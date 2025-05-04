package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountNodesCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountNodesCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public DiscountNodesCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<DiscountNodesCountProjectionRoot<PARENT, ROOT>, DiscountNodesCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<DiscountNodesCountProjectionRoot<PARENT, ROOT>, DiscountNodesCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public DiscountNodesCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
