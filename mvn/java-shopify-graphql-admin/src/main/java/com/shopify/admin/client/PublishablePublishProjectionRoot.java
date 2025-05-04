package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublishablePublishProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublishablePublishProjectionRoot() {
    super(null, null, java.util.Optional.of("PublishablePublishPayload"));
  }

  public PublishablePublishProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublishableProjection<PublishablePublishProjectionRoot<PARENT, ROOT>, PublishablePublishProjectionRoot<PARENT, ROOT>> publishable(
      ) {
    PublishableProjection<PublishablePublishProjectionRoot<PARENT, ROOT>, PublishablePublishProjectionRoot<PARENT, ROOT>> projection = new PublishableProjection<>(this, this);    
    getFields().put("publishable", projection);
    return projection;
  }

  public ShopProjection<PublishablePublishProjectionRoot<PARENT, ROOT>, PublishablePublishProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<PublishablePublishProjectionRoot<PARENT, ROOT>, PublishablePublishProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<PublishablePublishProjectionRoot<PARENT, ROOT>, PublishablePublishProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PublishablePublishProjectionRoot<PARENT, ROOT>, PublishablePublishProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
