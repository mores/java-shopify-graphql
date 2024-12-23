package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingLineConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingLineConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingLineConnection"));
  }

  public ShippingLineConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingLineEdgeProjection<ShippingLineConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     ShippingLineEdgeProjection<ShippingLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShippingLineEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ShippingLineProjection<ShippingLineConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ShippingLineProjection<ShippingLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShippingLineProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ShippingLineConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ShippingLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
