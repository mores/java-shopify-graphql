package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AutomaticDiscountSavedSearchesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AutomaticDiscountSavedSearchesProjectionRoot() {
    super(null, null, java.util.Optional.of("SavedSearchConnection"));
  }

  public AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SavedSearchEdgeProjection<AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT>, AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SavedSearchEdgeProjection<AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT>, AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new SavedSearchEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SavedSearchProjection<AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT>, AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SavedSearchProjection<AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT>, AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new SavedSearchProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT>, AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT>, AutomaticDiscountSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
