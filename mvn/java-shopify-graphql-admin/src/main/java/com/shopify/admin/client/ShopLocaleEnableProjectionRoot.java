package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopLocaleEnableProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopLocaleEnableProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopLocaleEnablePayload"));
  }

  public ShopLocaleEnableProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopLocaleProjection<ShopLocaleEnableProjectionRoot<PARENT, ROOT>, ShopLocaleEnableProjectionRoot<PARENT, ROOT>> shopLocale(
      ) {
    ShopLocaleProjection<ShopLocaleEnableProjectionRoot<PARENT, ROOT>, ShopLocaleEnableProjectionRoot<PARENT, ROOT>> projection = new ShopLocaleProjection<>(this, this);    
    getFields().put("shopLocale", projection);
    return projection;
  }

  public UserErrorProjection<ShopLocaleEnableProjectionRoot<PARENT, ROOT>, ShopLocaleEnableProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ShopLocaleEnableProjectionRoot<PARENT, ROOT>, ShopLocaleEnableProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
