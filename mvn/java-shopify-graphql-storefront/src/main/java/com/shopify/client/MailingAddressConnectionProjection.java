package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MailingAddressConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MailingAddressConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MailingAddressConnection"));
  }

  public MailingAddressConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressEdgeProjection<MailingAddressConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MailingAddressEdgeProjection<MailingAddressConnectionProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MailingAddressProjection<MailingAddressConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     MailingAddressProjection<MailingAddressConnectionProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MailingAddressConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MailingAddressConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
