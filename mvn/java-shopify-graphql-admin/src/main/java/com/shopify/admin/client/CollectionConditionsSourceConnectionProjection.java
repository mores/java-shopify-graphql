package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionConditionsSourceConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionsSourceConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionConditionsSourceConnection"));
  }

  public CollectionConditionsSourceConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionsSourceEdgeProjection<CollectionConditionsSourceConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CollectionConditionsSourceEdgeProjection<CollectionConditionsSourceConnectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionsSourceEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CollectionConditionsSourceProjection<CollectionConditionsSourceConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CollectionConditionsSourceProjection<CollectionConditionsSourceConnectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionsSourceProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CollectionConditionsSourceConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CollectionConditionsSourceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
