package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductPublicationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductPublicationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductPublicationConnection"));
  }

  public ProductPublicationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductPublicationEdgeProjection<ProductPublicationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ProductPublicationEdgeProjection<ProductPublicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductPublicationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ProductPublicationProjection<ProductPublicationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ProductPublicationProjection<ProductPublicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductPublicationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ProductPublicationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ProductPublicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
