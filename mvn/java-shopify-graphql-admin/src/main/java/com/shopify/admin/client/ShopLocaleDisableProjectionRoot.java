package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopLocaleDisableProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopLocaleDisableProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopLocaleDisablePayload"));
  }

  public ShopLocaleDisableProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<ShopLocaleDisableProjectionRoot<PARENT, ROOT>, ShopLocaleDisableProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ShopLocaleDisableProjectionRoot<PARENT, ROOT>, ShopLocaleDisableProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ShopLocaleDisableProjectionRoot<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }
}
