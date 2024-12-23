package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CurrencySettingEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CurrencySettingEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CurrencySettingEdge"));
  }

  public CurrencySettingEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencySettingProjection<CurrencySettingEdgeProjection<PARENT, ROOT>, ROOT> node() {
     CurrencySettingProjection<CurrencySettingEdgeProjection<PARENT, ROOT>, ROOT> projection = new CurrencySettingProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CurrencySettingEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
