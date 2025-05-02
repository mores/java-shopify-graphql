package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BaseCartLineConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BaseCartLineConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BaseCartLineConnection"));
  }

  public BaseCartLineConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BaseCartLineEdgeProjection<BaseCartLineConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     BaseCartLineEdgeProjection<BaseCartLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new BaseCartLineEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public BaseCartLineProjection<BaseCartLineConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     BaseCartLineProjection<BaseCartLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new BaseCartLineProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<BaseCartLineConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<BaseCartLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
