package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DomainProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DomainProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Domain"));
  }

  public DomainProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DomainProjection<PARENT, ROOT> host() {
    getFields().put("host", null);
    return this;
  }

  public DomainProjection<PARENT, ROOT> sslEnabled() {
    getFields().put("sslEnabled", null);
    return this;
  }

  public DomainProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
