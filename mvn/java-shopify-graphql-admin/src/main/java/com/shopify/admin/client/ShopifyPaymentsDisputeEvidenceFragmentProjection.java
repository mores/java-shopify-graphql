package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsDisputeEvidence"));
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> billingAddress(
      ) {
     MailingAddressProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> cancellationPolicyFile(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("cancellationPolicyFile", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> customerCommunicationFile(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("customerCommunicationFile", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> dispute(
      ) {
     ShopifyPaymentsDisputeProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeProjection<>(this, getRoot());
     getFields().put("dispute", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> disputeFileUploads(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("disputeFileUploads", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFulfillmentProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> fulfillments(
      ) {
     ShopifyPaymentsDisputeFulfillmentProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFulfillmentProjection<>(this, getRoot());
     getFields().put("fulfillments", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> refundPolicyFile(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("refundPolicyFile", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> serviceDocumentationFile(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("serviceDocumentationFile", projection);
     return projection;
  }

  public MailingAddressProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> shippingAddress(
      ) {
     MailingAddressProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("shippingAddress", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> shippingDocumentationFile(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("shippingDocumentationFile", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> uncategorizedFile(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("uncategorizedFile", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> accessActivityLog() {
    getFields().put("accessActivityLog", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> cancellationPolicyDisclosure(
      ) {
    getFields().put("cancellationPolicyDisclosure", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> cancellationRebuttal() {
    getFields().put("cancellationRebuttal", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> customerEmailAddress() {
    getFields().put("customerEmailAddress", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> customerFirstName() {
    getFields().put("customerFirstName", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> customerLastName() {
    getFields().put("customerLastName", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> customerPurchaseIp() {
    getFields().put("customerPurchaseIp", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> productDescription() {
    getFields().put("productDescription", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> refundPolicyDisclosure() {
    getFields().put("refundPolicyDisclosure", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> refundRefusalExplanation() {
    getFields().put("refundRefusalExplanation", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> submitted() {
    getFields().put("submitted", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<PARENT, ROOT> uncategorizedText() {
    getFields().put("uncategorizedText", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopifyPaymentsDisputeEvidence {");
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
