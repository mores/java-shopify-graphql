package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SavedSearchDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SavedSearchDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("SavedSearchDeletePayload"));
  }

  public SavedSearchDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopProjection<SavedSearchDeleteProjectionRoot<PARENT, ROOT>, SavedSearchDeleteProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<SavedSearchDeleteProjectionRoot<PARENT, ROOT>, SavedSearchDeleteProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<SavedSearchDeleteProjectionRoot<PARENT, ROOT>, SavedSearchDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<SavedSearchDeleteProjectionRoot<PARENT, ROOT>, SavedSearchDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public SavedSearchDeleteProjectionRoot<PARENT, ROOT> deletedSavedSearchId() {
    getFields().put("deletedSavedSearchId", null);
    return this;
  }
}
