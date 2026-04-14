package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyqlQueryProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyqlQueryProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopifyqlQueryResponse"));
  }

  public ShopifyqlQueryProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyqlTableDataProjection<ShopifyqlQueryProjectionRoot<PARENT, ROOT>, ShopifyqlQueryProjectionRoot<PARENT, ROOT>> tableData(
      ) {
    ShopifyqlTableDataProjection<ShopifyqlQueryProjectionRoot<PARENT, ROOT>, ShopifyqlQueryProjectionRoot<PARENT, ROOT>> projection = new ShopifyqlTableDataProjection<>(this, this);    
    getFields().put("tableData", projection);
    return projection;
  }

  public ShopifyqlQueryProjectionRoot<PARENT, ROOT> parseErrors() {
    getFields().put("parseErrors", null);
    return this;
  }
}
