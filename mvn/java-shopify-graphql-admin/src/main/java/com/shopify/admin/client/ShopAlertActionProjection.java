package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopAlertActionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopAlertActionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopAlertAction"));
  }

  public ShopAlertActionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopAlertActionProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ShopAlertActionProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
