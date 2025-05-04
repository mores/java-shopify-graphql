package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocalizedFieldProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocalizedFieldProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocalizedField"));
  }

  public LocalizedFieldProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<LocalizedFieldProjection<PARENT, ROOT>, ROOT> countryCode() {
     CountryCodeProjection<LocalizedFieldProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public LocalizedFieldKeyProjection<LocalizedFieldProjection<PARENT, ROOT>, ROOT> key() {
     LocalizedFieldKeyProjection<LocalizedFieldProjection<PARENT, ROOT>, ROOT> projection = new LocalizedFieldKeyProjection<>(this, getRoot());
     getFields().put("key", projection);
     return projection;
  }

  public LocalizedFieldPurposeProjection<LocalizedFieldProjection<PARENT, ROOT>, ROOT> purpose() {
     LocalizedFieldPurposeProjection<LocalizedFieldProjection<PARENT, ROOT>, ROOT> projection = new LocalizedFieldPurposeProjection<>(this, getRoot());
     getFields().put("purpose", projection);
     return projection;
  }

  public LocalizedFieldProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public LocalizedFieldProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
