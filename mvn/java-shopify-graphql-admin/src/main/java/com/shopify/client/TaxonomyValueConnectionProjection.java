package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxonomyValueConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxonomyValueConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyValueConnection"));
  }

  public TaxonomyValueConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyValueEdgeProjection<TaxonomyValueConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     TaxonomyValueEdgeProjection<TaxonomyValueConnectionProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyValueEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public TaxonomyValueProjection<TaxonomyValueConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     TaxonomyValueProjection<TaxonomyValueConnectionProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyValueProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<TaxonomyValueConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<TaxonomyValueConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
