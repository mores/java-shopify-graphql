package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocalizationExtensionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocalizationExtensionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocalizationExtension"));
  }

  public LocalizationExtensionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<LocalizationExtensionProjection<PARENT, ROOT>, ROOT> countryCode() {
     CountryCodeProjection<LocalizationExtensionProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public LocalizationExtensionKeyProjection<LocalizationExtensionProjection<PARENT, ROOT>, ROOT> key(
      ) {
     LocalizationExtensionKeyProjection<LocalizationExtensionProjection<PARENT, ROOT>, ROOT> projection = new LocalizationExtensionKeyProjection<>(this, getRoot());
     getFields().put("key", projection);
     return projection;
  }

  public LocalizationExtensionPurposeProjection<LocalizationExtensionProjection<PARENT, ROOT>, ROOT> purpose(
      ) {
     LocalizationExtensionPurposeProjection<LocalizationExtensionProjection<PARENT, ROOT>, ROOT> projection = new LocalizationExtensionPurposeProjection<>(this, getRoot());
     getFields().put("purpose", projection);
     return projection;
  }

  public LocalizationExtensionProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public LocalizationExtensionProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
