package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerVisitProductInfoProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerVisitProductInfoProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerVisitProductInfo"));
  }

  public CustomerVisitProductInfoProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<CustomerVisitProductInfoProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<CustomerVisitProductInfoProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductVariantProjection<CustomerVisitProductInfoProjection<PARENT, ROOT>, ROOT> variant(
      ) {
     ProductVariantProjection<CustomerVisitProductInfoProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public CustomerVisitProductInfoProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
