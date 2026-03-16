package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyqlQueryResponseProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyqlQueryResponseProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyqlQueryResponse"));
  }

  public ShopifyqlQueryResponseProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyqlTableDataProjection<ShopifyqlQueryResponseProjection<PARENT, ROOT>, ROOT> tableData(
      ) {
     ShopifyqlTableDataProjection<ShopifyqlQueryResponseProjection<PARENT, ROOT>, ROOT> projection = new ShopifyqlTableDataProjection<>(this, getRoot());
     getFields().put("tableData", projection);
     return projection;
  }

  public ShopifyqlQueryResponseProjection<PARENT, ROOT> parseErrors() {
    getFields().put("parseErrors", null);
    return this;
  }
}
