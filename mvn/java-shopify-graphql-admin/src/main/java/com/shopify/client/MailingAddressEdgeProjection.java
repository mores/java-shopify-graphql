package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MailingAddressEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MailingAddressEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MailingAddressEdge"));
  }

  public MailingAddressEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<MailingAddressEdgeProjection<PARENT, ROOT>, ROOT> node() {
     MailingAddressProjection<MailingAddressEdgeProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MailingAddressEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
