package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductComponentTypeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductComponentTypeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductComponentTypeEdge"));
  }

  public ProductComponentTypeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductComponentTypeProjection<ProductComponentTypeEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ProductComponentTypeProjection<ProductComponentTypeEdgeProjection<PARENT, ROOT>, ROOT> projection = new ProductComponentTypeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ProductComponentTypeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
