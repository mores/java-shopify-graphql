package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxonomyCategoryAttributeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxonomyCategoryAttributeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyCategoryAttributeConnection"));
  }

  public TaxonomyCategoryAttributeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyCategoryAttributeEdgeProjection<TaxonomyCategoryAttributeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     TaxonomyCategoryAttributeEdgeProjection<TaxonomyCategoryAttributeConnectionProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryAttributeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public TaxonomyCategoryAttributeProjection<TaxonomyCategoryAttributeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     TaxonomyCategoryAttributeProjection<TaxonomyCategoryAttributeConnectionProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryAttributeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<TaxonomyCategoryAttributeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<TaxonomyCategoryAttributeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
