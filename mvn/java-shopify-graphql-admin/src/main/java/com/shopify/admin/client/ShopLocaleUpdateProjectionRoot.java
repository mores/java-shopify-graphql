package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopLocaleUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopLocaleUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopLocaleUpdatePayload"));
  }

  public ShopLocaleUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopLocaleProjection<ShopLocaleUpdateProjectionRoot<PARENT, ROOT>, ShopLocaleUpdateProjectionRoot<PARENT, ROOT>> shopLocale(
      ) {
    ShopLocaleProjection<ShopLocaleUpdateProjectionRoot<PARENT, ROOT>, ShopLocaleUpdateProjectionRoot<PARENT, ROOT>> projection = new ShopLocaleProjection<>(this, this);    
    getFields().put("shopLocale", projection);
    return projection;
  }

  public UserErrorProjection<ShopLocaleUpdateProjectionRoot<PARENT, ROOT>, ShopLocaleUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ShopLocaleUpdateProjectionRoot<PARENT, ROOT>, ShopLocaleUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
