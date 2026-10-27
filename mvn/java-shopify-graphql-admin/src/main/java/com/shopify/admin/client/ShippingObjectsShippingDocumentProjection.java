package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingObjectsShippingDocumentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingObjectsShippingDocumentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingObjectsShippingDocument"));
  }

  public ShippingObjectsShippingDocumentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingDocumentTypeProjection<ShippingObjectsShippingDocumentProjection<PARENT, ROOT>, ROOT> documentType(
      ) {
     ShippingDocumentTypeProjection<ShippingObjectsShippingDocumentProjection<PARENT, ROOT>, ROOT> projection = new ShippingDocumentTypeProjection<>(this, getRoot());
     getFields().put("documentType", projection);
     return projection;
  }

  public ShippingEnumsFileFormatProjection<ShippingObjectsShippingDocumentProjection<PARENT, ROOT>, ROOT> format(
      ) {
     ShippingEnumsFileFormatProjection<ShippingObjectsShippingDocumentProjection<PARENT, ROOT>, ROOT> projection = new ShippingEnumsFileFormatProjection<>(this, getRoot());
     getFields().put("format", projection);
     return projection;
  }

  public ShippingObjectsShippingDocumentProjection<PARENT, ROOT> printedAt() {
    getFields().put("printedAt", null);
    return this;
  }

  public ShippingObjectsShippingDocumentProjection<PARENT, ROOT> shippingLabelId() {
    getFields().put("shippingLabelId", null);
    return this;
  }

  public ShippingObjectsShippingDocumentProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
