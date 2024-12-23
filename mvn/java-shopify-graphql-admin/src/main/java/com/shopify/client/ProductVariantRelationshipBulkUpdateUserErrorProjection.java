package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantRelationshipBulkUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantRelationshipBulkUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantRelationshipBulkUpdateUserError"));
  }

  public ProductVariantRelationshipBulkUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantRelationshipBulkUpdateUserErrorCodeProjection<ProductVariantRelationshipBulkUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ProductVariantRelationshipBulkUpdateUserErrorCodeProjection<ProductVariantRelationshipBulkUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantRelationshipBulkUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ProductVariantRelationshipBulkUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ProductVariantRelationshipBulkUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
