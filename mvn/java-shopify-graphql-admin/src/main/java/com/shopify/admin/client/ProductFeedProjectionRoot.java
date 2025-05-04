package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductFeedProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductFeedProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductFeed"));
  }

  public ProductFeedProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<ProductFeedProjectionRoot<PARENT, ROOT>, ProductFeedProjectionRoot<PARENT, ROOT>> country(
      ) {
    CountryCodeProjection<ProductFeedProjectionRoot<PARENT, ROOT>, ProductFeedProjectionRoot<PARENT, ROOT>> projection = new CountryCodeProjection<>(this, this);    
    getFields().put("country", projection);
    return projection;
  }

  public LanguageCodeProjection<ProductFeedProjectionRoot<PARENT, ROOT>, ProductFeedProjectionRoot<PARENT, ROOT>> language(
      ) {
    LanguageCodeProjection<ProductFeedProjectionRoot<PARENT, ROOT>, ProductFeedProjectionRoot<PARENT, ROOT>> projection = new LanguageCodeProjection<>(this, this);    
    getFields().put("language", projection);
    return projection;
  }

  public ProductFeedStatusProjection<ProductFeedProjectionRoot<PARENT, ROOT>, ProductFeedProjectionRoot<PARENT, ROOT>> status(
      ) {
    ProductFeedStatusProjection<ProductFeedProjectionRoot<PARENT, ROOT>, ProductFeedProjectionRoot<PARENT, ROOT>> projection = new ProductFeedStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public ProductFeedProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
