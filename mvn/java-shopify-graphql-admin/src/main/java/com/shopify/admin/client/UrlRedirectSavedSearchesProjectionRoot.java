package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectSavedSearchesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectSavedSearchesProjectionRoot() {
    super(null, null, java.util.Optional.of("SavedSearchConnection"));
  }

  public UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SavedSearchEdgeProjection<UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT>, UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SavedSearchEdgeProjection<UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT>, UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new SavedSearchEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SavedSearchProjection<UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT>, UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SavedSearchProjection<UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT>, UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new SavedSearchProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT>, UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT>, UrlRedirectSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
