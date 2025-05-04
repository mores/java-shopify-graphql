package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublicationUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublicationUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("PublicationUpdatePayload"));
  }

  public PublicationUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublicationProjection<PublicationUpdateProjectionRoot<PARENT, ROOT>, PublicationUpdateProjectionRoot<PARENT, ROOT>> publication(
      ) {
    PublicationProjection<PublicationUpdateProjectionRoot<PARENT, ROOT>, PublicationUpdateProjectionRoot<PARENT, ROOT>> projection = new PublicationProjection<>(this, this);    
    getFields().put("publication", projection);
    return projection;
  }

  public PublicationUserErrorProjection<PublicationUpdateProjectionRoot<PARENT, ROOT>, PublicationUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PublicationUserErrorProjection<PublicationUpdateProjectionRoot<PARENT, ROOT>, PublicationUpdateProjectionRoot<PARENT, ROOT>> projection = new PublicationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
