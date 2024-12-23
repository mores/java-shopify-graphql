package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SearchResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SearchResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SearchResult"));
  }

  public SearchResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<SearchResultProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<SearchResultProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public NodeProjection<SearchResultProjection<PARENT, ROOT>, ROOT> reference() {
     NodeProjection<SearchResultProjection<PARENT, ROOT>, ROOT> projection = new NodeProjection<>(this, getRoot());
     getFields().put("reference", projection);
     return projection;
  }

  public SearchResultProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SearchResultProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public SearchResultProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
