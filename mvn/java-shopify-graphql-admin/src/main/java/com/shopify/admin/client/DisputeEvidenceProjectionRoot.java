package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DisputeEvidenceProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DisputeEvidenceProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopifyPaymentsDisputeEvidence"));
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> billingAddress(
      ) {
    MailingAddressProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("billingAddress", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> cancellationPolicyFile(
      ) {
    ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, this);    
    getFields().put("cancellationPolicyFile", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> customerCommunicationFile(
      ) {
    ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, this);    
    getFields().put("customerCommunicationFile", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> dispute(
      ) {
    ShopifyPaymentsDisputeProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeProjection<>(this, this);    
    getFields().put("dispute", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> disputeFileUploads(
      ) {
    ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, this);    
    getFields().put("disputeFileUploads", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeFulfillmentProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> fulfillments(
      ) {
    ShopifyPaymentsDisputeFulfillmentProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeFulfillmentProjection<>(this, this);    
    getFields().put("fulfillments", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> refundPolicyFile(
      ) {
    ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, this);    
    getFields().put("refundPolicyFile", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> serviceDocumentationFile(
      ) {
    ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, this);    
    getFields().put("serviceDocumentationFile", projection);
    return projection;
  }

  public MailingAddressProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> shippingAddress(
      ) {
    MailingAddressProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("shippingAddress", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> shippingDocumentationFile(
      ) {
    ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, this);    
    getFields().put("shippingDocumentationFile", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> uncategorizedFile(
      ) {
    ShopifyPaymentsDisputeFileUploadProjection<DisputeEvidenceProjectionRoot<PARENT, ROOT>, DisputeEvidenceProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeFileUploadProjection<>(this, this);    
    getFields().put("uncategorizedFile", projection);
    return projection;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> accessActivityLog() {
    getFields().put("accessActivityLog", null);
    return this;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> cancellationPolicyDisclosure() {
    getFields().put("cancellationPolicyDisclosure", null);
    return this;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> cancellationRebuttal() {
    getFields().put("cancellationRebuttal", null);
    return this;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> customerEmailAddress() {
    getFields().put("customerEmailAddress", null);
    return this;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> customerFirstName() {
    getFields().put("customerFirstName", null);
    return this;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> customerLastName() {
    getFields().put("customerLastName", null);
    return this;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> customerPurchaseIp() {
    getFields().put("customerPurchaseIp", null);
    return this;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> productDescription() {
    getFields().put("productDescription", null);
    return this;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> refundPolicyDisclosure() {
    getFields().put("refundPolicyDisclosure", null);
    return this;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> refundRefusalExplanation() {
    getFields().put("refundRefusalExplanation", null);
    return this;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> submitted() {
    getFields().put("submitted", null);
    return this;
  }

  public DisputeEvidenceProjectionRoot<PARENT, ROOT> uncategorizedText() {
    getFields().put("uncategorizedText", null);
    return this;
  }
}
