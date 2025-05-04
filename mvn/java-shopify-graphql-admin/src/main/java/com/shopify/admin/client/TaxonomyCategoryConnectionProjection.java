package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxonomyCategoryConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxonomyCategoryConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyCategoryConnection"));
  }

  public TaxonomyCategoryConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyCategoryEdgeProjection<TaxonomyCategoryConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     TaxonomyCategoryEdgeProjection<TaxonomyCategoryConnectionProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public TaxonomyCategoryProjection<TaxonomyCategoryConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     TaxonomyCategoryProjection<TaxonomyCategoryConnectionProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<TaxonomyCategoryConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<TaxonomyCategoryConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
