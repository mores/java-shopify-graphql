package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DisputeEvidenceUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DisputeEvidenceUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DisputeEvidenceUpdatePayload"));
  }

  public DisputeEvidenceUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<DisputeEvidenceUpdateProjectionRoot<PARENT, ROOT>, DisputeEvidenceUpdateProjectionRoot<PARENT, ROOT>> disputeEvidence(
      ) {
    ShopifyPaymentsDisputeEvidenceProjection<DisputeEvidenceUpdateProjectionRoot<PARENT, ROOT>, DisputeEvidenceUpdateProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeEvidenceProjection<>(this, this);    
    getFields().put("disputeEvidence", projection);
    return projection;
  }

  public DisputeEvidenceUpdateUserErrorProjection<DisputeEvidenceUpdateProjectionRoot<PARENT, ROOT>, DisputeEvidenceUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DisputeEvidenceUpdateUserErrorProjection<DisputeEvidenceUpdateProjectionRoot<PARENT, ROOT>, DisputeEvidenceUpdateProjectionRoot<PARENT, ROOT>> projection = new DisputeEvidenceUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
