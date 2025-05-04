package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SavedSearchUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SavedSearchUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("SavedSearchUpdatePayload"));
  }

  public SavedSearchUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SavedSearchProjection<SavedSearchUpdateProjectionRoot<PARENT, ROOT>, SavedSearchUpdateProjectionRoot<PARENT, ROOT>> savedSearch(
      ) {
    SavedSearchProjection<SavedSearchUpdateProjectionRoot<PARENT, ROOT>, SavedSearchUpdateProjectionRoot<PARENT, ROOT>> projection = new SavedSearchProjection<>(this, this);    
    getFields().put("savedSearch", projection);
    return projection;
  }

  public UserErrorProjection<SavedSearchUpdateProjectionRoot<PARENT, ROOT>, SavedSearchUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<SavedSearchUpdateProjectionRoot<PARENT, ROOT>, SavedSearchUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
