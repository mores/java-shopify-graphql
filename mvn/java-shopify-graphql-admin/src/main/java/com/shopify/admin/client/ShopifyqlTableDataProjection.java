package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyqlTableDataProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyqlTableDataProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyqlTableData"));
  }

  public ShopifyqlTableDataProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyqlTableDataColumnProjection<ShopifyqlTableDataProjection<PARENT, ROOT>, ROOT> columns(
      ) {
     ShopifyqlTableDataColumnProjection<ShopifyqlTableDataProjection<PARENT, ROOT>, ROOT> projection = new ShopifyqlTableDataColumnProjection<>(this, getRoot());
     getFields().put("columns", projection);
     return projection;
  }

  public ShopifyqlTableDataProjection<PARENT, ROOT> rows() {
    getFields().put("rows", null);
    return this;
  }
}
