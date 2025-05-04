package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountRedeemCodeSavedSearchesProjectionRoot() {
    super(null, null, java.util.Optional.of("SavedSearchConnection"));
  }

  public DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SavedSearchEdgeProjection<DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SavedSearchEdgeProjection<DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new SavedSearchEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SavedSearchProjection<DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SavedSearchProjection<DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new SavedSearchProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeSavedSearchesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
