package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxonomyCategoryAttributeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxonomyCategoryAttributeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyCategoryAttributeEdge"));
  }

  public TaxonomyCategoryAttributeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyCategoryAttributeProjection<TaxonomyCategoryAttributeEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     TaxonomyCategoryAttributeProjection<TaxonomyCategoryAttributeEdgeProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryAttributeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public TaxonomyCategoryAttributeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
