package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantsProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantConnection"));
  }

  public ProductVariantsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantEdgeProjection<ProductVariantsProjectionRoot<PARENT, ROOT>, ProductVariantsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ProductVariantEdgeProjection<ProductVariantsProjectionRoot<PARENT, ROOT>, ProductVariantsProjectionRoot<PARENT, ROOT>> projection = new ProductVariantEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ProductVariantProjection<ProductVariantsProjectionRoot<PARENT, ROOT>, ProductVariantsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ProductVariantProjection<ProductVariantsProjectionRoot<PARENT, ROOT>, ProductVariantsProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ProductVariantsProjectionRoot<PARENT, ROOT>, ProductVariantsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ProductVariantsProjectionRoot<PARENT, ROOT>, ProductVariantsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
