package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionConnection"));
  }

  public CollectionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionEdgeProjection<CollectionConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     CollectionEdgeProjection<CollectionConnectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CollectionProjection<CollectionConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     CollectionProjection<CollectionConnectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CollectionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CollectionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }

  public CollectionConnectionProjection<PARENT, ROOT> totalCount() {
    getFields().put("totalCount", null);
    return this;
  }
}
