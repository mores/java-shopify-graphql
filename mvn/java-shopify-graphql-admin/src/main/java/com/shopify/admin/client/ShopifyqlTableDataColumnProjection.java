package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyqlTableDataColumnProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyqlTableDataColumnProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyqlTableDataColumn"));
  }

  public ShopifyqlTableDataColumnProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ColumnDataTypeProjection<ShopifyqlTableDataColumnProjection<PARENT, ROOT>, ROOT> dataType(
      ) {
     ColumnDataTypeProjection<ShopifyqlTableDataColumnProjection<PARENT, ROOT>, ROOT> projection = new ColumnDataTypeProjection<>(this, getRoot());
     getFields().put("dataType", projection);
     return projection;
  }

  public ColumnDataTypeProjection<ShopifyqlTableDataColumnProjection<PARENT, ROOT>, ROOT> subType(
      ) {
     ColumnDataTypeProjection<ShopifyqlTableDataColumnProjection<PARENT, ROOT>, ROOT> projection = new ColumnDataTypeProjection<>(this, getRoot());
     getFields().put("subType", projection);
     return projection;
  }

  public ShopifyqlTableDataColumnProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public ShopifyqlTableDataColumnProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
