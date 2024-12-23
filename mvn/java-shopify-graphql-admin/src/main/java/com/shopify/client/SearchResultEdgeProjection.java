package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SearchResultEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SearchResultEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SearchResultEdge"));
  }

  public SearchResultEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SearchResultProjection<SearchResultEdgeProjection<PARENT, ROOT>, ROOT> node() {
     SearchResultProjection<SearchResultEdgeProjection<PARENT, ROOT>, ROOT> projection = new SearchResultProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SearchResultEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
