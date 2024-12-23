package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrdersCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrdersCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public OrdersCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<OrdersCountProjectionRoot<PARENT, ROOT>, OrdersCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<OrdersCountProjectionRoot<PARENT, ROOT>, OrdersCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public OrdersCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
