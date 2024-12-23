package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SavedSearchCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SavedSearchCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("SavedSearchCreatePayload"));
  }

  public SavedSearchCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SavedSearchProjection<SavedSearchCreateProjectionRoot<PARENT, ROOT>, SavedSearchCreateProjectionRoot<PARENT, ROOT>> savedSearch(
      ) {
    SavedSearchProjection<SavedSearchCreateProjectionRoot<PARENT, ROOT>, SavedSearchCreateProjectionRoot<PARENT, ROOT>> projection = new SavedSearchProjection<>(this, this);    
    getFields().put("savedSearch", projection);
    return projection;
  }

  public UserErrorProjection<SavedSearchCreateProjectionRoot<PARENT, ROOT>, SavedSearchCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<SavedSearchCreateProjectionRoot<PARENT, ROOT>, SavedSearchCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
