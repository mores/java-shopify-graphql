package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StandardizedProductTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StandardizedProductTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StandardizedProductType"));
  }

  public StandardizedProductTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductTaxonomyNodeProjection<StandardizedProductTypeProjection<PARENT, ROOT>, ROOT> productTaxonomyNode(
      ) {
     ProductTaxonomyNodeProjection<StandardizedProductTypeProjection<PARENT, ROOT>, ROOT> projection = new ProductTaxonomyNodeProjection<>(this, getRoot());
     getFields().put("productTaxonomyNode", projection);
     return projection;
  }
}
