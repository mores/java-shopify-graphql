package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsDisputeEvidenceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsDisputeEvidenceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsDisputeEvidence"));
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> billingAddress(
      ) {
     MailingAddressProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> cancellationPolicyFile(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("cancellationPolicyFile", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> customerCommunicationFile(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("customerCommunicationFile", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> dispute(
      ) {
     ShopifyPaymentsDisputeProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeProjection<>(this, getRoot());
     getFields().put("dispute", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> disputeFileUploads(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("disputeFileUploads", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFulfillmentProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> fulfillments(
      ) {
     ShopifyPaymentsDisputeFulfillmentProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFulfillmentProjection<>(this, getRoot());
     getFields().put("fulfillments", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> refundPolicyFile(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("refundPolicyFile", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> serviceDocumentationFile(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("serviceDocumentationFile", projection);
     return projection;
  }

  public MailingAddressProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> shippingAddress(
      ) {
     MailingAddressProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("shippingAddress", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> shippingDocumentationFile(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("shippingDocumentationFile", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> uncategorizedFile(
      ) {
     ShopifyPaymentsDisputeFileUploadProjection<ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, getRoot());
     getFields().put("uncategorizedFile", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> accessActivityLog() {
    getFields().put("accessActivityLog", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> cancellationPolicyDisclosure() {
    getFields().put("cancellationPolicyDisclosure", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> cancellationRebuttal() {
    getFields().put("cancellationRebuttal", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> customerEmailAddress() {
    getFields().put("customerEmailAddress", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> customerFirstName() {
    getFields().put("customerFirstName", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> customerLastName() {
    getFields().put("customerLastName", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> customerPurchaseIp() {
    getFields().put("customerPurchaseIp", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> productDescription() {
    getFields().put("productDescription", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> refundPolicyDisclosure() {
    getFields().put("refundPolicyDisclosure", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> refundRefusalExplanation() {
    getFields().put("refundRefusalExplanation", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> submitted() {
    getFields().put("submitted", null);
    return this;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<PARENT, ROOT> uncategorizedText() {
    getFields().put("uncategorizedText", null);
    return this;
  }
}
