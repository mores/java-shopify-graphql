package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductFeedEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductFeedEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductFeedEdge"));
  }

  public ProductFeedEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductFeedProjection<ProductFeedEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ProductFeedProjection<ProductFeedEdgeProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ProductFeedEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
