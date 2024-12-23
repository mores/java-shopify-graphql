package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAppProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAppProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderApp"));
  }

  public OrderAppProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<OrderAppProjection<PARENT, ROOT>, ROOT> icon() {
     ImageProjection<OrderAppProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("icon", projection);
     return projection;
  }

  public OrderAppProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public OrderAppProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
