package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyqlNullCellTranslationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyqlNullCellTranslationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyqlNullCellTranslation"));
  }

  public ShopifyqlNullCellTranslationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyqlNullCellTranslationProjection<PARENT, ROOT> columnName() {
    getFields().put("columnName", null);
    return this;
  }

  public ShopifyqlNullCellTranslationProjection<PARENT, ROOT> displayText() {
    getFields().put("displayText", null);
    return this;
  }
}
