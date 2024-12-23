package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The evidence associated with the dispute.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsDisputeEvidence implements com.shopify.types.Node {
  /**
   * The activity logs associated with the dispute evidence.
   */
  private String accessActivityLog;

  /**
   * The billing address that's provided by the customer.
   */
  private MailingAddress billingAddress;

  /**
   * The cancellation policy disclosure associated with the dispute evidence.
   */
  private String cancellationPolicyDisclosure;

  /**
   * The cancellation policy file associated with the dispute evidence.
   */
  private ShopifyPaymentsDisputeFileUpload cancellationPolicyFile;

  /**
   * The cancellation rebuttal associated with the dispute evidence.
   */
  private String cancellationRebuttal;

  /**
   * The customer communication file associated with the dispute evidence.
   */
  private ShopifyPaymentsDisputeFileUpload customerCommunicationFile;

  /**
   * The customer's email address.
   */
  private String customerEmailAddress;

  /**
   * The customer's first name.
   */
  private String customerFirstName;

  /**
   * The customer's last name.
   */
  private String customerLastName;

  /**
   * The customer purchase ip for this dispute evidence.
   */
  private String customerPurchaseIp;

  /**
   * The dispute associated with the evidence.
   */
  private ShopifyPaymentsDispute dispute;

  /**
   * The file uploads associated with the dispute evidence.
   */
  private List<ShopifyPaymentsDisputeFileUpload> disputeFileUploads;

  /**
   * The fulfillments associated with the dispute evidence.
   */
  private List<ShopifyPaymentsDisputeFulfillment> fulfillments;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The product description for this dispute evidence.
   */
  private String productDescription;

  /**
   * The refund policy disclosure associated with the dispute evidence.
   */
  private String refundPolicyDisclosure;

  /**
   * The refund policy file associated with the dispute evidence.
   */
  private ShopifyPaymentsDisputeFileUpload refundPolicyFile;

  /**
   * The refund refusal explanation associated with dispute evidence.
   */
  private String refundRefusalExplanation;

  /**
   * The service documentation file associated with the dispute evidence.
   */
  private ShopifyPaymentsDisputeFileUpload serviceDocumentationFile;

  /**
   * The mailing address for shipping that's provided by the customer.
   */
  private MailingAddress shippingAddress;

  /**
   * The shipping documentation file associated with the dispute evidence.
   */
  private ShopifyPaymentsDisputeFileUpload shippingDocumentationFile;

  /**
   * Whether the dispute evidence is submitted.
   */
  private boolean submitted;

  /**
   * The uncategorized file associated with the dispute evidence.
   */
  private ShopifyPaymentsDisputeFileUpload uncategorizedFile;

  /**
   * The uncategorized text for the dispute evidence.
   */
  private String uncategorizedText;

  public ShopifyPaymentsDisputeEvidence() {
  }

  /**
   * The activity logs associated with the dispute evidence.
   */
  public String getAccessActivityLog() {
    return accessActivityLog;
  }

  public void setAccessActivityLog(String accessActivityLog) {
    this.accessActivityLog = accessActivityLog;
  }

  /**
   * The billing address that's provided by the customer.
   */
  public MailingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * The cancellation policy disclosure associated with the dispute evidence.
   */
  public String getCancellationPolicyDisclosure() {
    return cancellationPolicyDisclosure;
  }

  public void setCancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
    this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
  }

  /**
   * The cancellation policy file associated with the dispute evidence.
   */
  public ShopifyPaymentsDisputeFileUpload getCancellationPolicyFile() {
    return cancellationPolicyFile;
  }

  public void setCancellationPolicyFile(ShopifyPaymentsDisputeFileUpload cancellationPolicyFile) {
    this.cancellationPolicyFile = cancellationPolicyFile;
  }

  /**
   * The cancellation rebuttal associated with the dispute evidence.
   */
  public String getCancellationRebuttal() {
    return cancellationRebuttal;
  }

  public void setCancellationRebuttal(String cancellationRebuttal) {
    this.cancellationRebuttal = cancellationRebuttal;
  }

  /**
   * The customer communication file associated with the dispute evidence.
   */
  public ShopifyPaymentsDisputeFileUpload getCustomerCommunicationFile() {
    return customerCommunicationFile;
  }

  public void setCustomerCommunicationFile(
      ShopifyPaymentsDisputeFileUpload customerCommunicationFile) {
    this.customerCommunicationFile = customerCommunicationFile;
  }

  /**
   * The customer's email address.
   */
  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }

  public void setCustomerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
  }

  /**
   * The customer's first name.
   */
  public String getCustomerFirstName() {
    return customerFirstName;
  }

  public void setCustomerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
  }

  /**
   * The customer's last name.
   */
  public String getCustomerLastName() {
    return customerLastName;
  }

  public void setCustomerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
  }

  /**
   * The customer purchase ip for this dispute evidence.
   */
  public String getCustomerPurchaseIp() {
    return customerPurchaseIp;
  }

  public void setCustomerPurchaseIp(String customerPurchaseIp) {
    this.customerPurchaseIp = customerPurchaseIp;
  }

  /**
   * The dispute associated with the evidence.
   */
  public ShopifyPaymentsDispute getDispute() {
    return dispute;
  }

  public void setDispute(ShopifyPaymentsDispute dispute) {
    this.dispute = dispute;
  }

  /**
   * The file uploads associated with the dispute evidence.
   */
  public List<ShopifyPaymentsDisputeFileUpload> getDisputeFileUploads() {
    return disputeFileUploads;
  }

  public void setDisputeFileUploads(List<ShopifyPaymentsDisputeFileUpload> disputeFileUploads) {
    this.disputeFileUploads = disputeFileUploads;
  }

  /**
   * The fulfillments associated with the dispute evidence.
   */
  public List<ShopifyPaymentsDisputeFulfillment> getFulfillments() {
    return fulfillments;
  }

  public void setFulfillments(List<ShopifyPaymentsDisputeFulfillment> fulfillments) {
    this.fulfillments = fulfillments;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The product description for this dispute evidence.
   */
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  /**
   * The refund policy disclosure associated with the dispute evidence.
   */
  public String getRefundPolicyDisclosure() {
    return refundPolicyDisclosure;
  }

  public void setRefundPolicyDisclosure(String refundPolicyDisclosure) {
    this.refundPolicyDisclosure = refundPolicyDisclosure;
  }

  /**
   * The refund policy file associated with the dispute evidence.
   */
  public ShopifyPaymentsDisputeFileUpload getRefundPolicyFile() {
    return refundPolicyFile;
  }

  public void setRefundPolicyFile(ShopifyPaymentsDisputeFileUpload refundPolicyFile) {
    this.refundPolicyFile = refundPolicyFile;
  }

  /**
   * The refund refusal explanation associated with dispute evidence.
   */
  public String getRefundRefusalExplanation() {
    return refundRefusalExplanation;
  }

  public void setRefundRefusalExplanation(String refundRefusalExplanation) {
    this.refundRefusalExplanation = refundRefusalExplanation;
  }

  /**
   * The service documentation file associated with the dispute evidence.
   */
  public ShopifyPaymentsDisputeFileUpload getServiceDocumentationFile() {
    return serviceDocumentationFile;
  }

  public void setServiceDocumentationFile(
      ShopifyPaymentsDisputeFileUpload serviceDocumentationFile) {
    this.serviceDocumentationFile = serviceDocumentationFile;
  }

  /**
   * The mailing address for shipping that's provided by the customer.
   */
  public MailingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * The shipping documentation file associated with the dispute evidence.
   */
  public ShopifyPaymentsDisputeFileUpload getShippingDocumentationFile() {
    return shippingDocumentationFile;
  }

  public void setShippingDocumentationFile(
      ShopifyPaymentsDisputeFileUpload shippingDocumentationFile) {
    this.shippingDocumentationFile = shippingDocumentationFile;
  }

  /**
   * Whether the dispute evidence is submitted.
   */
  public boolean getSubmitted() {
    return submitted;
  }

  public void setSubmitted(boolean submitted) {
    this.submitted = submitted;
  }

  /**
   * The uncategorized file associated with the dispute evidence.
   */
  public ShopifyPaymentsDisputeFileUpload getUncategorizedFile() {
    return uncategorizedFile;
  }

  public void setUncategorizedFile(ShopifyPaymentsDisputeFileUpload uncategorizedFile) {
    this.uncategorizedFile = uncategorizedFile;
  }

  /**
   * The uncategorized text for the dispute evidence.
   */
  public String getUncategorizedText() {
    return uncategorizedText;
  }

  public void setUncategorizedText(String uncategorizedText) {
    this.uncategorizedText = uncategorizedText;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsDisputeEvidence{accessActivityLog='" + accessActivityLog + "', billingAddress='" + billingAddress + "', cancellationPolicyDisclosure='" + cancellationPolicyDisclosure + "', cancellationPolicyFile='" + cancellationPolicyFile + "', cancellationRebuttal='" + cancellationRebuttal + "', customerCommunicationFile='" + customerCommunicationFile + "', customerEmailAddress='" + customerEmailAddress + "', customerFirstName='" + customerFirstName + "', customerLastName='" + customerLastName + "', customerPurchaseIp='" + customerPurchaseIp + "', dispute='" + dispute + "', disputeFileUploads='" + disputeFileUploads + "', fulfillments='" + fulfillments + "', id='" + id + "', productDescription='" + productDescription + "', refundPolicyDisclosure='" + refundPolicyDisclosure + "', refundPolicyFile='" + refundPolicyFile + "', refundRefusalExplanation='" + refundRefusalExplanation + "', serviceDocumentationFile='" + serviceDocumentationFile + "', shippingAddress='" + shippingAddress + "', shippingDocumentationFile='" + shippingDocumentationFile + "', submitted='" + submitted + "', uncategorizedFile='" + uncategorizedFile + "', uncategorizedText='" + uncategorizedText + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsDisputeEvidence that = (ShopifyPaymentsDisputeEvidence) o;
    return Objects.equals(accessActivityLog, that.accessActivityLog) &&
        Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(cancellationPolicyDisclosure, that.cancellationPolicyDisclosure) &&
        Objects.equals(cancellationPolicyFile, that.cancellationPolicyFile) &&
        Objects.equals(cancellationRebuttal, that.cancellationRebuttal) &&
        Objects.equals(customerCommunicationFile, that.customerCommunicationFile) &&
        Objects.equals(customerEmailAddress, that.customerEmailAddress) &&
        Objects.equals(customerFirstName, that.customerFirstName) &&
        Objects.equals(customerLastName, that.customerLastName) &&
        Objects.equals(customerPurchaseIp, that.customerPurchaseIp) &&
        Objects.equals(dispute, that.dispute) &&
        Objects.equals(disputeFileUploads, that.disputeFileUploads) &&
        Objects.equals(fulfillments, that.fulfillments) &&
        Objects.equals(id, that.id) &&
        Objects.equals(productDescription, that.productDescription) &&
        Objects.equals(refundPolicyDisclosure, that.refundPolicyDisclosure) &&
        Objects.equals(refundPolicyFile, that.refundPolicyFile) &&
        Objects.equals(refundRefusalExplanation, that.refundRefusalExplanation) &&
        Objects.equals(serviceDocumentationFile, that.serviceDocumentationFile) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(shippingDocumentationFile, that.shippingDocumentationFile) &&
        submitted == that.submitted &&
        Objects.equals(uncategorizedFile, that.uncategorizedFile) &&
        Objects.equals(uncategorizedText, that.uncategorizedText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessActivityLog, billingAddress, cancellationPolicyDisclosure, cancellationPolicyFile, cancellationRebuttal, customerCommunicationFile, customerEmailAddress, customerFirstName, customerLastName, customerPurchaseIp, dispute, disputeFileUploads, fulfillments, id, productDescription, refundPolicyDisclosure, refundPolicyFile, refundRefusalExplanation, serviceDocumentationFile, shippingAddress, shippingDocumentationFile, submitted, uncategorizedFile, uncategorizedText);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The activity logs associated with the dispute evidence.
     */
    private String accessActivityLog;

    /**
     * The billing address that's provided by the customer.
     */
    private MailingAddress billingAddress;

    /**
     * The cancellation policy disclosure associated with the dispute evidence.
     */
    private String cancellationPolicyDisclosure;

    /**
     * The cancellation policy file associated with the dispute evidence.
     */
    private ShopifyPaymentsDisputeFileUpload cancellationPolicyFile;

    /**
     * The cancellation rebuttal associated with the dispute evidence.
     */
    private String cancellationRebuttal;

    /**
     * The customer communication file associated with the dispute evidence.
     */
    private ShopifyPaymentsDisputeFileUpload customerCommunicationFile;

    /**
     * The customer's email address.
     */
    private String customerEmailAddress;

    /**
     * The customer's first name.
     */
    private String customerFirstName;

    /**
     * The customer's last name.
     */
    private String customerLastName;

    /**
     * The customer purchase ip for this dispute evidence.
     */
    private String customerPurchaseIp;

    /**
     * The dispute associated with the evidence.
     */
    private ShopifyPaymentsDispute dispute;

    /**
     * The file uploads associated with the dispute evidence.
     */
    private List<ShopifyPaymentsDisputeFileUpload> disputeFileUploads;

    /**
     * The fulfillments associated with the dispute evidence.
     */
    private List<ShopifyPaymentsDisputeFulfillment> fulfillments;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The product description for this dispute evidence.
     */
    private String productDescription;

    /**
     * The refund policy disclosure associated with the dispute evidence.
     */
    private String refundPolicyDisclosure;

    /**
     * The refund policy file associated with the dispute evidence.
     */
    private ShopifyPaymentsDisputeFileUpload refundPolicyFile;

    /**
     * The refund refusal explanation associated with dispute evidence.
     */
    private String refundRefusalExplanation;

    /**
     * The service documentation file associated with the dispute evidence.
     */
    private ShopifyPaymentsDisputeFileUpload serviceDocumentationFile;

    /**
     * The mailing address for shipping that's provided by the customer.
     */
    private MailingAddress shippingAddress;

    /**
     * The shipping documentation file associated with the dispute evidence.
     */
    private ShopifyPaymentsDisputeFileUpload shippingDocumentationFile;

    /**
     * Whether the dispute evidence is submitted.
     */
    private boolean submitted;

    /**
     * The uncategorized file associated with the dispute evidence.
     */
    private ShopifyPaymentsDisputeFileUpload uncategorizedFile;

    /**
     * The uncategorized text for the dispute evidence.
     */
    private String uncategorizedText;

    public ShopifyPaymentsDisputeEvidence build() {
      ShopifyPaymentsDisputeEvidence result = new ShopifyPaymentsDisputeEvidence();
      result.accessActivityLog = this.accessActivityLog;
      result.billingAddress = this.billingAddress;
      result.cancellationPolicyDisclosure = this.cancellationPolicyDisclosure;
      result.cancellationPolicyFile = this.cancellationPolicyFile;
      result.cancellationRebuttal = this.cancellationRebuttal;
      result.customerCommunicationFile = this.customerCommunicationFile;
      result.customerEmailAddress = this.customerEmailAddress;
      result.customerFirstName = this.customerFirstName;
      result.customerLastName = this.customerLastName;
      result.customerPurchaseIp = this.customerPurchaseIp;
      result.dispute = this.dispute;
      result.disputeFileUploads = this.disputeFileUploads;
      result.fulfillments = this.fulfillments;
      result.id = this.id;
      result.productDescription = this.productDescription;
      result.refundPolicyDisclosure = this.refundPolicyDisclosure;
      result.refundPolicyFile = this.refundPolicyFile;
      result.refundRefusalExplanation = this.refundRefusalExplanation;
      result.serviceDocumentationFile = this.serviceDocumentationFile;
      result.shippingAddress = this.shippingAddress;
      result.shippingDocumentationFile = this.shippingDocumentationFile;
      result.submitted = this.submitted;
      result.uncategorizedFile = this.uncategorizedFile;
      result.uncategorizedText = this.uncategorizedText;
      return result;
    }

    /**
     * The activity logs associated with the dispute evidence.
     */
    public Builder accessActivityLog(String accessActivityLog) {
      this.accessActivityLog = accessActivityLog;
      return this;
    }

    /**
     * The billing address that's provided by the customer.
     */
    public Builder billingAddress(MailingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * The cancellation policy disclosure associated with the dispute evidence.
     */
    public Builder cancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
      this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
      return this;
    }

    /**
     * The cancellation policy file associated with the dispute evidence.
     */
    public Builder cancellationPolicyFile(ShopifyPaymentsDisputeFileUpload cancellationPolicyFile) {
      this.cancellationPolicyFile = cancellationPolicyFile;
      return this;
    }

    /**
     * The cancellation rebuttal associated with the dispute evidence.
     */
    public Builder cancellationRebuttal(String cancellationRebuttal) {
      this.cancellationRebuttal = cancellationRebuttal;
      return this;
    }

    /**
     * The customer communication file associated with the dispute evidence.
     */
    public Builder customerCommunicationFile(
        ShopifyPaymentsDisputeFileUpload customerCommunicationFile) {
      this.customerCommunicationFile = customerCommunicationFile;
      return this;
    }

    /**
     * The customer's email address.
     */
    public Builder customerEmailAddress(String customerEmailAddress) {
      this.customerEmailAddress = customerEmailAddress;
      return this;
    }

    /**
     * The customer's first name.
     */
    public Builder customerFirstName(String customerFirstName) {
      this.customerFirstName = customerFirstName;
      return this;
    }

    /**
     * The customer's last name.
     */
    public Builder customerLastName(String customerLastName) {
      this.customerLastName = customerLastName;
      return this;
    }

    /**
     * The customer purchase ip for this dispute evidence.
     */
    public Builder customerPurchaseIp(String customerPurchaseIp) {
      this.customerPurchaseIp = customerPurchaseIp;
      return this;
    }

    /**
     * The dispute associated with the evidence.
     */
    public Builder dispute(ShopifyPaymentsDispute dispute) {
      this.dispute = dispute;
      return this;
    }

    /**
     * The file uploads associated with the dispute evidence.
     */
    public Builder disputeFileUploads(List<ShopifyPaymentsDisputeFileUpload> disputeFileUploads) {
      this.disputeFileUploads = disputeFileUploads;
      return this;
    }

    /**
     * The fulfillments associated with the dispute evidence.
     */
    public Builder fulfillments(List<ShopifyPaymentsDisputeFulfillment> fulfillments) {
      this.fulfillments = fulfillments;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The product description for this dispute evidence.
     */
    public Builder productDescription(String productDescription) {
      this.productDescription = productDescription;
      return this;
    }

    /**
     * The refund policy disclosure associated with the dispute evidence.
     */
    public Builder refundPolicyDisclosure(String refundPolicyDisclosure) {
      this.refundPolicyDisclosure = refundPolicyDisclosure;
      return this;
    }

    /**
     * The refund policy file associated with the dispute evidence.
     */
    public Builder refundPolicyFile(ShopifyPaymentsDisputeFileUpload refundPolicyFile) {
      this.refundPolicyFile = refundPolicyFile;
      return this;
    }

    /**
     * The refund refusal explanation associated with dispute evidence.
     */
    public Builder refundRefusalExplanation(String refundRefusalExplanation) {
      this.refundRefusalExplanation = refundRefusalExplanation;
      return this;
    }

    /**
     * The service documentation file associated with the dispute evidence.
     */
    public Builder serviceDocumentationFile(
        ShopifyPaymentsDisputeFileUpload serviceDocumentationFile) {
      this.serviceDocumentationFile = serviceDocumentationFile;
      return this;
    }

    /**
     * The mailing address for shipping that's provided by the customer.
     */
    public Builder shippingAddress(MailingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * The shipping documentation file associated with the dispute evidence.
     */
    public Builder shippingDocumentationFile(
        ShopifyPaymentsDisputeFileUpload shippingDocumentationFile) {
      this.shippingDocumentationFile = shippingDocumentationFile;
      return this;
    }

    /**
     * Whether the dispute evidence is submitted.
     */
    public Builder submitted(boolean submitted) {
      this.submitted = submitted;
      return this;
    }

    /**
     * The uncategorized file associated with the dispute evidence.
     */
    public Builder uncategorizedFile(ShopifyPaymentsDisputeFileUpload uncategorizedFile) {
      this.uncategorizedFile = uncategorizedFile;
      return this;
    }

    /**
     * The uncategorized text for the dispute evidence.
     */
    public Builder uncategorizedText(String uncategorizedText) {
      this.uncategorizedText = uncategorizedText;
      return this;
    }
  }
}
