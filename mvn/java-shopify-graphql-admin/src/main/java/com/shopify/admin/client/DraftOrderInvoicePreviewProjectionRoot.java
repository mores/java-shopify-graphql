package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderInvoicePreviewProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderInvoicePreviewProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderInvoicePreviewPayload"));
  }

  public DraftOrderInvoicePreviewProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<DraftOrderInvoicePreviewProjectionRoot<PARENT, ROOT>, DraftOrderInvoicePreviewProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DraftOrderInvoicePreviewProjectionRoot<PARENT, ROOT>, DraftOrderInvoicePreviewProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public DraftOrderInvoicePreviewProjectionRoot<PARENT, ROOT> previewHtml() {
    getFields().put("previewHtml", null);
    return this;
  }

  public DraftOrderInvoicePreviewProjectionRoot<PARENT, ROOT> previewSubject() {
    getFields().put("previewSubject", null);
    return this;
  }
}
