package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SearchResultItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SearchResultItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SearchResultItemEdge"));
  }

  public SearchResultItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SearchResultItemProjection<SearchResultItemEdgeProjection<PARENT, ROOT>, ROOT> node() {
     SearchResultItemProjection<SearchResultItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new SearchResultItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SearchResultItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
