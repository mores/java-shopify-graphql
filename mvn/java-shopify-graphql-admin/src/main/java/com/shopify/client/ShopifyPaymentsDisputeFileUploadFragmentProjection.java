package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopifyPaymentsDisputeFileUploadFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopifyPaymentsDisputeFileUploadFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsDisputeFileUpload"));
  }

  public ShopifyPaymentsDisputeFileUploadFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFileTypeProjection<ShopifyPaymentsDisputeFileUploadFragmentProjection<PARENT, ROOT>, ROOT> disputeEvidenceType(
      ) {
     ShopifyPaymentsDisputeEvidenceFileTypeProjection<ShopifyPaymentsDisputeFileUploadFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeEvidenceFileTypeProjection<>(this, getRoot());
     getFields().put("disputeEvidenceType", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadFragmentProjection<PARENT, ROOT> fileSize() {
    getFields().put("fileSize", null);
    return this;
  }

  public ShopifyPaymentsDisputeFileUploadFragmentProjection<PARENT, ROOT> fileType() {
    getFields().put("fileType", null);
    return this;
  }

  public ShopifyPaymentsDisputeFileUploadFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsDisputeFileUploadFragmentProjection<PARENT, ROOT> originalFileName() {
    getFields().put("originalFileName", null);
    return this;
  }

  public ShopifyPaymentsDisputeFileUploadFragmentProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopifyPaymentsDisputeFileUpload {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
