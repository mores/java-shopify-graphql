package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyqlDynamicColumnMetadataProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyqlDynamicColumnMetadataProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyqlDynamicColumnMetadata"));
  }

  public ShopifyqlDynamicColumnMetadataProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyqlDynamicColumnTypeProjection<ShopifyqlDynamicColumnMetadataProjection<PARENT, ROOT>, ROOT> type(
      ) {
     ShopifyqlDynamicColumnTypeProjection<ShopifyqlDynamicColumnMetadataProjection<PARENT, ROOT>, ROOT> projection = new ShopifyqlDynamicColumnTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public ShopifyqlDynamicColumnMetadataProjection<PARENT, ROOT> aggregatedBy() {
    getFields().put("aggregatedBy", null);
    return this;
  }

  public ShopifyqlDynamicColumnMetadataProjection<PARENT, ROOT> comparisonReference() {
    getFields().put("comparisonReference", null);
    return this;
  }

  public ShopifyqlDynamicColumnMetadataProjection<PARENT, ROOT> originalColumnName() {
    getFields().put("originalColumnName", null);
    return this;
  }
}
