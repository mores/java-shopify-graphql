package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublicationCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublicationCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("PublicationCreatePayload"));
  }

  public PublicationCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublicationProjection<PublicationCreateProjectionRoot<PARENT, ROOT>, PublicationCreateProjectionRoot<PARENT, ROOT>> publication(
      ) {
    PublicationProjection<PublicationCreateProjectionRoot<PARENT, ROOT>, PublicationCreateProjectionRoot<PARENT, ROOT>> projection = new PublicationProjection<>(this, this);    
    getFields().put("publication", projection);
    return projection;
  }

  public PublicationUserErrorProjection<PublicationCreateProjectionRoot<PARENT, ROOT>, PublicationCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PublicationUserErrorProjection<PublicationCreateProjectionRoot<PARENT, ROOT>, PublicationCreateProjectionRoot<PARENT, ROOT>> projection = new PublicationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
