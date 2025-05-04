package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxonomyValueEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxonomyValueEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyValueEdge"));
  }

  public TaxonomyValueEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyValueProjection<TaxonomyValueEdgeProjection<PARENT, ROOT>, ROOT> node() {
     TaxonomyValueProjection<TaxonomyValueEdgeProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyValueProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public TaxonomyValueEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
