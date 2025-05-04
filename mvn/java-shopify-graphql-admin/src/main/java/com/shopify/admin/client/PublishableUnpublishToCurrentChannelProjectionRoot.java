package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublishableUnpublishToCurrentChannelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublishableUnpublishToCurrentChannelProjectionRoot() {
    super(null, null, java.util.Optional.of("PublishableUnpublishToCurrentChannelPayload"));
  }

  public PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublishableProjection<PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT>, PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT>> publishable(
      ) {
    PublishableProjection<PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT>, PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT>> projection = new PublishableProjection<>(this, this);    
    getFields().put("publishable", projection);
    return projection;
  }

  public ShopProjection<PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT>, PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT>, PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT>, PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT>, PublishableUnpublishToCurrentChannelProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
