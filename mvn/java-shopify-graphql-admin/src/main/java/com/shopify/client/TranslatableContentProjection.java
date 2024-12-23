package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TranslatableContentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslatableContentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TranslatableContent"));
  }

  public TranslatableContentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocalizableContentTypeProjection<TranslatableContentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     LocalizableContentTypeProjection<TranslatableContentProjection<PARENT, ROOT>, ROOT> projection = new LocalizableContentTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public TranslatableContentProjection<PARENT, ROOT> digest() {
    getFields().put("digest", null);
    return this;
  }

  public TranslatableContentProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public TranslatableContentProjection<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public TranslatableContentProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
