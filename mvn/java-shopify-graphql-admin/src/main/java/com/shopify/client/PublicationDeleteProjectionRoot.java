package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublicationDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublicationDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("PublicationDeletePayload"));
  }

  public PublicationDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublicationUserErrorProjection<PublicationDeleteProjectionRoot<PARENT, ROOT>, PublicationDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PublicationUserErrorProjection<PublicationDeleteProjectionRoot<PARENT, ROOT>, PublicationDeleteProjectionRoot<PARENT, ROOT>> projection = new PublicationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public PublicationDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
