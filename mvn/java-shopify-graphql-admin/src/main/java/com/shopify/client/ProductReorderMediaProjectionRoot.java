package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductReorderMediaProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductReorderMediaProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductReorderMediaPayload"));
  }

  public ProductReorderMediaProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<ProductReorderMediaProjectionRoot<PARENT, ROOT>, ProductReorderMediaProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<ProductReorderMediaProjectionRoot<PARENT, ROOT>, ProductReorderMediaProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public MediaUserErrorProjection<ProductReorderMediaProjectionRoot<PARENT, ROOT>, ProductReorderMediaProjectionRoot<PARENT, ROOT>> mediaUserErrors(
      ) {
    MediaUserErrorProjection<ProductReorderMediaProjectionRoot<PARENT, ROOT>, ProductReorderMediaProjectionRoot<PARENT, ROOT>> projection = new MediaUserErrorProjection<>(this, this);    
    getFields().put("mediaUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<ProductReorderMediaProjectionRoot<PARENT, ROOT>, ProductReorderMediaProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductReorderMediaProjectionRoot<PARENT, ROOT>, ProductReorderMediaProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
