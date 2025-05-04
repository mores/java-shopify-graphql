package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantRelationshipBulkUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantRelationshipBulkUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantRelationshipBulkUpdatePayload"));
  }

  public ProductVariantRelationshipBulkUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<ProductVariantRelationshipBulkUpdateProjectionRoot<PARENT, ROOT>, ProductVariantRelationshipBulkUpdateProjectionRoot<PARENT, ROOT>> parentProductVariants(
      ) {
    ProductVariantProjection<ProductVariantRelationshipBulkUpdateProjectionRoot<PARENT, ROOT>, ProductVariantRelationshipBulkUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("parentProductVariants", projection);
    return projection;
  }

  public ProductVariantRelationshipBulkUpdateUserErrorProjection<ProductVariantRelationshipBulkUpdateProjectionRoot<PARENT, ROOT>, ProductVariantRelationshipBulkUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductVariantRelationshipBulkUpdateUserErrorProjection<ProductVariantRelationshipBulkUpdateProjectionRoot<PARENT, ROOT>, ProductVariantRelationshipBulkUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductVariantRelationshipBulkUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
