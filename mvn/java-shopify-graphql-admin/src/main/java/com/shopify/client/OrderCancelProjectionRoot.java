package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCancelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCancelProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderCancelPayload"));
  }

  public OrderCancelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<OrderCancelProjectionRoot<PARENT, ROOT>, OrderCancelProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<OrderCancelProjectionRoot<PARENT, ROOT>, OrderCancelProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public OrderCancelUserErrorProjection<OrderCancelProjectionRoot<PARENT, ROOT>, OrderCancelProjectionRoot<PARENT, ROOT>> orderCancelUserErrors(
      ) {
    OrderCancelUserErrorProjection<OrderCancelProjectionRoot<PARENT, ROOT>, OrderCancelProjectionRoot<PARENT, ROOT>> projection = new OrderCancelUserErrorProjection<>(this, this);    
    getFields().put("orderCancelUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<OrderCancelProjectionRoot<PARENT, ROOT>, OrderCancelProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderCancelProjectionRoot<PARENT, ROOT>, OrderCancelProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
