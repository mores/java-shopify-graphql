package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CombinedListingUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CombinedListingUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CombinedListingUpdatePayload"));
  }

  public CombinedListingUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<CombinedListingUpdateProjectionRoot<PARENT, ROOT>, CombinedListingUpdateProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<CombinedListingUpdateProjectionRoot<PARENT, ROOT>, CombinedListingUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public CombinedListingUpdateUserErrorProjection<CombinedListingUpdateProjectionRoot<PARENT, ROOT>, CombinedListingUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CombinedListingUpdateUserErrorProjection<CombinedListingUpdateProjectionRoot<PARENT, ROOT>, CombinedListingUpdateProjectionRoot<PARENT, ROOT>> projection = new CombinedListingUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
