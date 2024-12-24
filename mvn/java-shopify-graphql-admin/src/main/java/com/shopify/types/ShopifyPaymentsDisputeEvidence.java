package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsDisputeEvidence implements com.shopify.types.Node {
  
  private String accessActivityLog;

  
  private MailingAddress billingAddress;

  
  private String cancellationPolicyDisclosure;

  
  private ShopifyPaymentsDisputeFileUpload cancellationPolicyFile;

  
  private String cancellationRebuttal;

  
  private ShopifyPaymentsDisputeFileUpload customerCommunicationFile;

  
  private String customerEmailAddress;

  
  private String customerFirstName;

  
  private String customerLastName;

  
  private String customerPurchaseIp;

  
  private ShopifyPaymentsDispute dispute;

  
  private List<ShopifyPaymentsDisputeFileUpload> disputeFileUploads;

  
  private List<ShopifyPaymentsDisputeFulfillment> fulfillments;

  
  private String id;

  
  private String productDescription;

  
  private String refundPolicyDisclosure;

  
  private ShopifyPaymentsDisputeFileUpload refundPolicyFile;

  
  private String refundRefusalExplanation;

  
  private ShopifyPaymentsDisputeFileUpload serviceDocumentationFile;

  
  private MailingAddress shippingAddress;

  
  private ShopifyPaymentsDisputeFileUpload shippingDocumentationFile;

  
  private boolean submitted;

  
  private ShopifyPaymentsDisputeFileUpload uncategorizedFile;

  
  private String uncategorizedText;

  public ShopifyPaymentsDisputeEvidence() {
  }

  
  public String getAccessActivityLog() {
    return accessActivityLog;
  }

  public void setAccessActivityLog(String accessActivityLog) {
    this.accessActivityLog = accessActivityLog;
  }

  
  public MailingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public String getCancellationPolicyDisclosure() {
    return cancellationPolicyDisclosure;
  }

  public void setCancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
    this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
  }

  
  public ShopifyPaymentsDisputeFileUpload getCancellationPolicyFile() {
    return cancellationPolicyFile;
  }

  public void setCancellationPolicyFile(ShopifyPaymentsDisputeFileUpload cancellationPolicyFile) {
    this.cancellationPolicyFile = cancellationPolicyFile;
  }

  
  public String getCancellationRebuttal() {
    return cancellationRebuttal;
  }

  public void setCancellationRebuttal(String cancellationRebuttal) {
    this.cancellationRebuttal = cancellationRebuttal;
  }

  
  public ShopifyPaymentsDisputeFileUpload getCustomerCommunicationFile() {
    return customerCommunicationFile;
  }

  public void setCustomerCommunicationFile(
      ShopifyPaymentsDisputeFileUpload customerCommunicationFile) {
    this.customerCommunicationFile = customerCommunicationFile;
  }

  
  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }

  public void setCustomerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
  }

  
  public String getCustomerFirstName() {
    return customerFirstName;
  }

  public void setCustomerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
  }

  
  public String getCustomerLastName() {
    return customerLastName;
  }

  public void setCustomerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
  }

  
  public String getCustomerPurchaseIp() {
    return customerPurchaseIp;
  }

  public void setCustomerPurchaseIp(String customerPurchaseIp) {
    this.customerPurchaseIp = customerPurchaseIp;
  }

  
  public ShopifyPaymentsDispute getDispute() {
    return dispute;
  }

  public void setDispute(ShopifyPaymentsDispute dispute) {
    this.dispute = dispute;
  }

  
  public List<ShopifyPaymentsDisputeFileUpload> getDisputeFileUploads() {
    return disputeFileUploads;
  }

  public void setDisputeFileUploads(List<ShopifyPaymentsDisputeFileUpload> disputeFileUploads) {
    this.disputeFileUploads = disputeFileUploads;
  }

  
  public List<ShopifyPaymentsDisputeFulfillment> getFulfillments() {
    return fulfillments;
  }

  public void setFulfillments(List<ShopifyPaymentsDisputeFulfillment> fulfillments) {
    this.fulfillments = fulfillments;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  
  public String getRefundPolicyDisclosure() {
    return refundPolicyDisclosure;
  }

  public void setRefundPolicyDisclosure(String refundPolicyDisclosure) {
    this.refundPolicyDisclosure = refundPolicyDisclosure;
  }

  
  public ShopifyPaymentsDisputeFileUpload getRefundPolicyFile() {
    return refundPolicyFile;
  }

  public void setRefundPolicyFile(ShopifyPaymentsDisputeFileUpload refundPolicyFile) {
    this.refundPolicyFile = refundPolicyFile;
  }

  
  public String getRefundRefusalExplanation() {
    return refundRefusalExplanation;
  }

  public void setRefundRefusalExplanation(String refundRefusalExplanation) {
    this.refundRefusalExplanation = refundRefusalExplanation;
  }

  
  public ShopifyPaymentsDisputeFileUpload getServiceDocumentationFile() {
    return serviceDocumentationFile;
  }

  public void setServiceDocumentationFile(
      ShopifyPaymentsDisputeFileUpload serviceDocumentationFile) {
    this.serviceDocumentationFile = serviceDocumentationFile;
  }

  
  public MailingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  
  public ShopifyPaymentsDisputeFileUpload getShippingDocumentationFile() {
    return shippingDocumentationFile;
  }

  public void setShippingDocumentationFile(
      ShopifyPaymentsDisputeFileUpload shippingDocumentationFile) {
    this.shippingDocumentationFile = shippingDocumentationFile;
  }

  
  public boolean getSubmitted() {
    return submitted;
  }

  public void setSubmitted(boolean submitted) {
    this.submitted = submitted;
  }

  
  public ShopifyPaymentsDisputeFileUpload getUncategorizedFile() {
    return uncategorizedFile;
  }

  public void setUncategorizedFile(ShopifyPaymentsDisputeFileUpload uncategorizedFile) {
    this.uncategorizedFile = uncategorizedFile;
  }

  
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
    
    private String accessActivityLog;

    
    private MailingAddress billingAddress;

    
    private String cancellationPolicyDisclosure;

    
    private ShopifyPaymentsDisputeFileUpload cancellationPolicyFile;

    
    private String cancellationRebuttal;

    
    private ShopifyPaymentsDisputeFileUpload customerCommunicationFile;

    
    private String customerEmailAddress;

    
    private String customerFirstName;

    
    private String customerLastName;

    
    private String customerPurchaseIp;

    
    private ShopifyPaymentsDispute dispute;

    
    private List<ShopifyPaymentsDisputeFileUpload> disputeFileUploads;

    
    private List<ShopifyPaymentsDisputeFulfillment> fulfillments;

    
    private String id;

    
    private String productDescription;

    
    private String refundPolicyDisclosure;

    
    private ShopifyPaymentsDisputeFileUpload refundPolicyFile;

    
    private String refundRefusalExplanation;

    
    private ShopifyPaymentsDisputeFileUpload serviceDocumentationFile;

    
    private MailingAddress shippingAddress;

    
    private ShopifyPaymentsDisputeFileUpload shippingDocumentationFile;

    
    private boolean submitted;

    
    private ShopifyPaymentsDisputeFileUpload uncategorizedFile;

    
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

    
    public Builder accessActivityLog(String accessActivityLog) {
      this.accessActivityLog = accessActivityLog;
      return this;
    }

    
    public Builder billingAddress(MailingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    
    public Builder cancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
      this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
      return this;
    }

    
    public Builder cancellationPolicyFile(ShopifyPaymentsDisputeFileUpload cancellationPolicyFile) {
      this.cancellationPolicyFile = cancellationPolicyFile;
      return this;
    }

    
    public Builder cancellationRebuttal(String cancellationRebuttal) {
      this.cancellationRebuttal = cancellationRebuttal;
      return this;
    }

    
    public Builder customerCommunicationFile(
        ShopifyPaymentsDisputeFileUpload customerCommunicationFile) {
      this.customerCommunicationFile = customerCommunicationFile;
      return this;
    }

    
    public Builder customerEmailAddress(String customerEmailAddress) {
      this.customerEmailAddress = customerEmailAddress;
      return this;
    }

    
    public Builder customerFirstName(String customerFirstName) {
      this.customerFirstName = customerFirstName;
      return this;
    }

    
    public Builder customerLastName(String customerLastName) {
      this.customerLastName = customerLastName;
      return this;
    }

    
    public Builder customerPurchaseIp(String customerPurchaseIp) {
      this.customerPurchaseIp = customerPurchaseIp;
      return this;
    }

    
    public Builder dispute(ShopifyPaymentsDispute dispute) {
      this.dispute = dispute;
      return this;
    }

    
    public Builder disputeFileUploads(List<ShopifyPaymentsDisputeFileUpload> disputeFileUploads) {
      this.disputeFileUploads = disputeFileUploads;
      return this;
    }

    
    public Builder fulfillments(List<ShopifyPaymentsDisputeFulfillment> fulfillments) {
      this.fulfillments = fulfillments;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder productDescription(String productDescription) {
      this.productDescription = productDescription;
      return this;
    }

    
    public Builder refundPolicyDisclosure(String refundPolicyDisclosure) {
      this.refundPolicyDisclosure = refundPolicyDisclosure;
      return this;
    }

    
    public Builder refundPolicyFile(ShopifyPaymentsDisputeFileUpload refundPolicyFile) {
      this.refundPolicyFile = refundPolicyFile;
      return this;
    }

    
    public Builder refundRefusalExplanation(String refundRefusalExplanation) {
      this.refundRefusalExplanation = refundRefusalExplanation;
      return this;
    }

    
    public Builder serviceDocumentationFile(
        ShopifyPaymentsDisputeFileUpload serviceDocumentationFile) {
      this.serviceDocumentationFile = serviceDocumentationFile;
      return this;
    }

    
    public Builder shippingAddress(MailingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    
    public Builder shippingDocumentationFile(
        ShopifyPaymentsDisputeFileUpload shippingDocumentationFile) {
      this.shippingDocumentationFile = shippingDocumentationFile;
      return this;
    }

    
    public Builder submitted(boolean submitted) {
      this.submitted = submitted;
      return this;
    }

    
    public Builder uncategorizedFile(ShopifyPaymentsDisputeFileUpload uncategorizedFile) {
      this.uncategorizedFile = uncategorizedFile;
      return this;
    }

    
    public Builder uncategorizedText(String uncategorizedText) {
      this.uncategorizedText = uncategorizedText;
      return this;
    }
  }
}
