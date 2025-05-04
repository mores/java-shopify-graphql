package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublishablePublishToCurrentChannelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublishablePublishToCurrentChannelProjectionRoot() {
    super(null, null, java.util.Optional.of("PublishablePublishToCurrentChannelPayload"));
  }

  public PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublishableProjection<PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT>, PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT>> publishable(
      ) {
    PublishableProjection<PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT>, PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT>> projection = new PublishableProjection<>(this, this);    
    getFields().put("publishable", projection);
    return projection;
  }

  public ShopProjection<PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT>, PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT>, PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT>, PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT>, PublishablePublishToCurrentChannelProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
