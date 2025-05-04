package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublishableUnpublishProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublishableUnpublishProjectionRoot() {
    super(null, null, java.util.Optional.of("PublishableUnpublishPayload"));
  }

  public PublishableUnpublishProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublishableProjection<PublishableUnpublishProjectionRoot<PARENT, ROOT>, PublishableUnpublishProjectionRoot<PARENT, ROOT>> publishable(
      ) {
    PublishableProjection<PublishableUnpublishProjectionRoot<PARENT, ROOT>, PublishableUnpublishProjectionRoot<PARENT, ROOT>> projection = new PublishableProjection<>(this, this);    
    getFields().put("publishable", projection);
    return projection;
  }

  public ShopProjection<PublishableUnpublishProjectionRoot<PARENT, ROOT>, PublishableUnpublishProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<PublishableUnpublishProjectionRoot<PARENT, ROOT>, PublishableUnpublishProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<PublishableUnpublishProjectionRoot<PARENT, ROOT>, PublishableUnpublishProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PublishableUnpublishProjectionRoot<PARENT, ROOT>, PublishableUnpublishProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
