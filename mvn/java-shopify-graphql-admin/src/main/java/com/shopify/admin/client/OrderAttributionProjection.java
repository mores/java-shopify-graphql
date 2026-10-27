package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAttributionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAttributionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderAttribution"));
  }

  public OrderAttributionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderAttributionProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public OrderAttributionProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public OrderAttributionProjection<PARENT, ROOT> icon() {
    getFields().put("icon", null);
    return this;
  }
}
