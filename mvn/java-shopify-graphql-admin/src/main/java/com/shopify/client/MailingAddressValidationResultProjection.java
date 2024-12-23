package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MailingAddressValidationResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MailingAddressValidationResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MailingAddressValidationResult"));
  }

  public MailingAddressValidationResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
