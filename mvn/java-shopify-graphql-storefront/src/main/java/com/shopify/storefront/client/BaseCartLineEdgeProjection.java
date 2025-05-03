package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BaseCartLineEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BaseCartLineEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BaseCartLineEdge"));
  }

  public BaseCartLineEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BaseCartLineProjection<BaseCartLineEdgeProjection<PARENT, ROOT>, ROOT> node() {
     BaseCartLineProjection<BaseCartLineEdgeProjection<PARENT, ROOT>, ROOT> projection = new BaseCartLineProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public BaseCartLineEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
