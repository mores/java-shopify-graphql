package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyqlRowMetadataProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyqlRowMetadataProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyqlRowMetadata"));
  }

  public ShopifyqlRowMetadataProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyqlNullCellTranslationProjection<ShopifyqlRowMetadataProjection<PARENT, ROOT>, ROOT> nullCellTranslations(
      ) {
     ShopifyqlNullCellTranslationProjection<ShopifyqlRowMetadataProjection<PARENT, ROOT>, ROOT> projection = new ShopifyqlNullCellTranslationProjection<>(this, getRoot());
     getFields().put("nullCellTranslations", projection);
     return projection;
  }

  public ShopifyqlRowMetadataProjection<PARENT, ROOT> rawResourceIds() {
    getFields().put("rawResourceIds", null);
    return this;
  }

  public ShopifyqlRowMetadataProjection<PARENT, ROOT> topNRemainderColumnNames() {
    getFields().put("topNRemainderColumnNames", null);
    return this;
  }
}
