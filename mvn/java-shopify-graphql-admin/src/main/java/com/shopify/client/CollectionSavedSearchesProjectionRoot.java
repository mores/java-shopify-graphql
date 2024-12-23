package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSavedSearchesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSavedSearchesProjectionRoot() {
    super(null, null, java.util.Optional.of("SavedSearchConnection"));
  }

  public CollectionSavedSearchesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SavedSearchEdgeProjection<CollectionSavedSearchesProjectionRoot<PARENT, ROOT>, CollectionSavedSearchesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SavedSearchEdgeProjection<CollectionSavedSearchesProjectionRoot<PARENT, ROOT>, CollectionSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new SavedSearchEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SavedSearchProjection<CollectionSavedSearchesProjectionRoot<PARENT, ROOT>, CollectionSavedSearchesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SavedSearchProjection<CollectionSavedSearchesProjectionRoot<PARENT, ROOT>, CollectionSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new SavedSearchProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CollectionSavedSearchesProjectionRoot<PARENT, ROOT>, CollectionSavedSearchesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CollectionSavedSearchesProjectionRoot<PARENT, ROOT>, CollectionSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
