package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopAlertProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopAlertProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopAlert"));
  }

  public ShopAlertProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopAlertActionProjection<ShopAlertProjection<PARENT, ROOT>, ROOT> action() {
     ShopAlertActionProjection<ShopAlertProjection<PARENT, ROOT>, ROOT> projection = new ShopAlertActionProjection<>(this, getRoot());
     getFields().put("action", projection);
     return projection;
  }

  public ShopAlertProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }
}
