package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxonomyCategoryEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxonomyCategoryEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyCategoryEdge"));
  }

  public TaxonomyCategoryEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyCategoryProjection<TaxonomyCategoryEdgeProjection<PARENT, ROOT>, ROOT> node() {
     TaxonomyCategoryProjection<TaxonomyCategoryEdgeProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public TaxonomyCategoryEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
