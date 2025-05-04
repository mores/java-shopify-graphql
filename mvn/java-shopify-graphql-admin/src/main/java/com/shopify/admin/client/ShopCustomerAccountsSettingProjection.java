package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopCustomerAccountsSettingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopCustomerAccountsSettingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopCustomerAccountsSetting"));
  }

  public ShopCustomerAccountsSettingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
