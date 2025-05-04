package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductPublicationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductPublicationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductPublicationEdge"));
  }

  public ProductPublicationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductPublicationProjection<ProductPublicationEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ProductPublicationProjection<ProductPublicationEdgeProjection<PARENT, ROOT>, ROOT> projection = new ProductPublicationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ProductPublicationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
