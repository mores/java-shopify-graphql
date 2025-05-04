package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderSavedSearchesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderSavedSearchesProjectionRoot() {
    super(null, null, java.util.Optional.of("SavedSearchConnection"));
  }

  public OrderSavedSearchesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SavedSearchEdgeProjection<OrderSavedSearchesProjectionRoot<PARENT, ROOT>, OrderSavedSearchesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SavedSearchEdgeProjection<OrderSavedSearchesProjectionRoot<PARENT, ROOT>, OrderSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new SavedSearchEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SavedSearchProjection<OrderSavedSearchesProjectionRoot<PARENT, ROOT>, OrderSavedSearchesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SavedSearchProjection<OrderSavedSearchesProjectionRoot<PARENT, ROOT>, OrderSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new SavedSearchProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<OrderSavedSearchesProjectionRoot<PARENT, ROOT>, OrderSavedSearchesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<OrderSavedSearchesProjectionRoot<PARENT, ROOT>, OrderSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
