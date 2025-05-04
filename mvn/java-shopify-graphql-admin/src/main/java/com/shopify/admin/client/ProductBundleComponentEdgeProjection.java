package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductBundleComponentEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductBundleComponentEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductBundleComponentEdge"));
  }

  public ProductBundleComponentEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductBundleComponentProjection<ProductBundleComponentEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ProductBundleComponentProjection<ProductBundleComponentEdgeProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleComponentProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ProductBundleComponentEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
