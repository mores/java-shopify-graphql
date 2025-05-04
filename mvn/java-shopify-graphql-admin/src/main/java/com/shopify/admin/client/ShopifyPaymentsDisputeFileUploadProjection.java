package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsDisputeFileUploadProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsDisputeFileUploadProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsDisputeFileUpload"));
  }

  public ShopifyPaymentsDisputeFileUploadProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFileTypeProjection<ShopifyPaymentsDisputeFileUploadProjection<PARENT, ROOT>, ROOT> disputeEvidenceType(
      ) {
     ShopifyPaymentsDisputeEvidenceFileTypeProjection<ShopifyPaymentsDisputeFileUploadProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeEvidenceFileTypeProjection<>(this, getRoot());
     getFields().put("disputeEvidenceType", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<PARENT, ROOT> fileSize() {
    getFields().put("fileSize", null);
    return this;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<PARENT, ROOT> fileType() {
    getFields().put("fileType", null);
    return this;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<PARENT, ROOT> originalFileName() {
    getFields().put("originalFileName", null);
    return this;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
