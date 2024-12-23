package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CurrencySettingConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CurrencySettingConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CurrencySettingConnection"));
  }

  public CurrencySettingConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencySettingEdgeProjection<CurrencySettingConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CurrencySettingEdgeProjection<CurrencySettingConnectionProjection<PARENT, ROOT>, ROOT> projection = new CurrencySettingEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CurrencySettingProjection<CurrencySettingConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CurrencySettingProjection<CurrencySettingConnectionProjection<PARENT, ROOT>, ROOT> projection = new CurrencySettingProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CurrencySettingConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CurrencySettingConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
