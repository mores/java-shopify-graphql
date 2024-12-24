package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopifyPaymentsDisputeEvidenceUpdateInput {
  
  private String customerEmailAddress;

  
  private String customerLastName;

  
  private String customerFirstName;

  
  private MailingAddressInput shippingAddress;

  
  private String uncategorizedText;

  
  private String accessActivityLog;

  
  private String cancellationPolicyDisclosure;

  
  private String cancellationRebuttal;

  
  private String refundPolicyDisclosure;

  
  private String refundRefusalExplanation;

  
  private ShopifyPaymentsDisputeFileUploadUpdateInput cancellationPolicyFile;

  
  private ShopifyPaymentsDisputeFileUploadUpdateInput customerCommunicationFile;

  
  private ShopifyPaymentsDisputeFileUploadUpdateInput refundPolicyFile;

  
  private ShopifyPaymentsDisputeFileUploadUpdateInput shippingDocumentationFile;

  
  private ShopifyPaymentsDisputeFileUploadUpdateInput uncategorizedFile;

  
  private ShopifyPaymentsDisputeFileUploadUpdateInput serviceDocumentationFile;

  
  private Boolean submitEvidence = false;

  public ShopifyPaymentsDisputeEvidenceUpdateInput() {
  }

  
  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }

  public void setCustomerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
  }

  
  public String getCustomerLastName() {
    return customerLastName;
  }

  public void setCustomerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
  }

  
  public String getCustomerFirstName() {
    return customerFirstName;
  }

  public void setCustomerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
  }

  
  public MailingAddressInput getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddressInput shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  
  public String getUncategorizedText() {
    return uncategorizedText;
  }

  public void setUncategorizedText(String uncategorizedText) {
    this.uncategorizedText = uncategorizedText;
  }

  
  public String getAccessActivityLog() {
    return accessActivityLog;
  }

  public void setAccessActivityLog(String accessActivityLog) {
    this.accessActivityLog = accessActivityLog;
  }

  
  public String getCancellationPolicyDisclosure() {
    return cancellationPolicyDisclosure;
  }

  public void setCancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
    this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
  }

  
  public String getCancellationRebuttal() {
    return cancellationRebuttal;
  }

  public void setCancellationRebuttal(String cancellationRebuttal) {
    this.cancellationRebuttal = cancellationRebuttal;
  }

  
  public String getRefundPolicyDisclosure() {
    return refundPolicyDisclosure;
  }

  public void setRefundPolicyDisclosure(String refundPolicyDisclosure) {
    this.refundPolicyDisclosure = refundPolicyDisclosure;
  }

  
  public String getRefundRefusalExplanation() {
    return refundRefusalExplanation;
  }

  public void setRefundRefusalExplanation(String refundRefusalExplanation) {
    this.refundRefusalExplanation = refundRefusalExplanation;
  }

  
  public ShopifyPaymentsDisputeFileUploadUpdateInput getCancellationPolicyFile() {
    return cancellationPolicyFile;
  }

  public void setCancellationPolicyFile(
      ShopifyPaymentsDisputeFileUploadUpdateInput cancellationPolicyFile) {
    this.cancellationPolicyFile = cancellationPolicyFile;
  }

  
  public ShopifyPaymentsDisputeFileUploadUpdateInput getCustomerCommunicationFile() {
    return customerCommunicationFile;
  }

  public void setCustomerCommunicationFile(
      ShopifyPaymentsDisputeFileUploadUpdateInput customerCommunicationFile) {
    this.customerCommunicationFile = customerCommunicationFile;
  }

  
  public ShopifyPaymentsDisputeFileUploadUpdateInput getRefundPolicyFile() {
    return refundPolicyFile;
  }

  public void setRefundPolicyFile(ShopifyPaymentsDisputeFileUploadUpdateInput refundPolicyFile) {
    this.refundPolicyFile = refundPolicyFile;
  }

  
  public ShopifyPaymentsDisputeFileUploadUpdateInput getShippingDocumentationFile() {
    return shippingDocumentationFile;
  }

  public void setShippingDocumentationFile(
      ShopifyPaymentsDisputeFileUploadUpdateInput shippingDocumentationFile) {
    this.shippingDocumentationFile = shippingDocumentationFile;
  }

  
  public ShopifyPaymentsDisputeFileUploadUpdateInput getUncategorizedFile() {
    return uncategorizedFile;
  }

  public void setUncategorizedFile(ShopifyPaymentsDisputeFileUploadUpdateInput uncategorizedFile) {
    this.uncategorizedFile = uncategorizedFile;
  }

  
  public ShopifyPaymentsDisputeFileUploadUpdateInput getServiceDocumentationFile() {
    return serviceDocumentationFile;
  }

  public void setServiceDocumentationFile(
      ShopifyPaymentsDisputeFileUploadUpdateInput serviceDocumentationFile) {
    this.serviceDocumentationFile = serviceDocumentationFile;
  }

  
  public Boolean getSubmitEvidence() {
    return submitEvidence;
  }

  public void setSubmitEvidence(Boolean submitEvidence) {
    this.submitEvidence = submitEvidence;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsDisputeEvidenceUpdateInput{customerEmailAddress='" + customerEmailAddress + "', customerLastName='" + customerLastName + "', customerFirstName='" + customerFirstName + "', shippingAddress='" + shippingAddress + "', uncategorizedText='" + uncategorizedText + "', accessActivityLog='" + accessActivityLog + "', cancellationPolicyDisclosure='" + cancellationPolicyDisclosure + "', cancellationRebuttal='" + cancellationRebuttal + "', refundPolicyDisclosure='" + refundPolicyDisclosure + "', refundRefusalExplanation='" + refundRefusalExplanation + "', cancellationPolicyFile='" + cancellationPolicyFile + "', customerCommunicationFile='" + customerCommunicationFile + "', refundPolicyFile='" + refundPolicyFile + "', shippingDocumentationFile='" + shippingDocumentationFile + "', uncategorizedFile='" + uncategorizedFile + "', serviceDocumentationFile='" + serviceDocumentationFile + "', submitEvidence='" + submitEvidence + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsDisputeEvidenceUpdateInput that = (ShopifyPaymentsDisputeEvidenceUpdateInput) o;
    return Objects.equals(customerEmailAddress, that.customerEmailAddress) &&
        Objects.equals(customerLastName, that.customerLastName) &&
        Objects.equals(customerFirstName, that.customerFirstName) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(uncategorizedText, that.uncategorizedText) &&
        Objects.equals(accessActivityLog, that.accessActivityLog) &&
        Objects.equals(cancellationPolicyDisclosure, that.cancellationPolicyDisclosure) &&
        Objects.equals(cancellationRebuttal, that.cancellationRebuttal) &&
        Objects.equals(refundPolicyDisclosure, that.refundPolicyDisclosure) &&
        Objects.equals(refundRefusalExplanation, that.refundRefusalExplanation) &&
        Objects.equals(cancellationPolicyFile, that.cancellationPolicyFile) &&
        Objects.equals(customerCommunicationFile, that.customerCommunicationFile) &&
        Objects.equals(refundPolicyFile, that.refundPolicyFile) &&
        Objects.equals(shippingDocumentationFile, that.shippingDocumentationFile) &&
        Objects.equals(uncategorizedFile, that.uncategorizedFile) &&
        Objects.equals(serviceDocumentationFile, that.serviceDocumentationFile) &&
        Objects.equals(submitEvidence, that.submitEvidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerEmailAddress, customerLastName, customerFirstName, shippingAddress, uncategorizedText, accessActivityLog, cancellationPolicyDisclosure, cancellationRebuttal, refundPolicyDisclosure, refundRefusalExplanation, cancellationPolicyFile, customerCommunicationFile, refundPolicyFile, shippingDocumentationFile, uncategorizedFile, serviceDocumentationFile, submitEvidence);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String customerEmailAddress;

    
    private String customerLastName;

    
    private String customerFirstName;

    
    private MailingAddressInput shippingAddress;

    
    private String uncategorizedText;

    
    private String accessActivityLog;

    
    private String cancellationPolicyDisclosure;

    
    private String cancellationRebuttal;

    
    private String refundPolicyDisclosure;

    
    private String refundRefusalExplanation;

    
    private ShopifyPaymentsDisputeFileUploadUpdateInput cancellationPolicyFile;

    
    private ShopifyPaymentsDisputeFileUploadUpdateInput customerCommunicationFile;

    
    private ShopifyPaymentsDisputeFileUploadUpdateInput refundPolicyFile;

    
    private ShopifyPaymentsDisputeFileUploadUpdateInput shippingDocumentationFile;

    
    private ShopifyPaymentsDisputeFileUploadUpdateInput uncategorizedFile;

    
    private ShopifyPaymentsDisputeFileUploadUpdateInput serviceDocumentationFile;

    
    private Boolean submitEvidence = false;

    public ShopifyPaymentsDisputeEvidenceUpdateInput build() {
      ShopifyPaymentsDisputeEvidenceUpdateInput result = new ShopifyPaymentsDisputeEvidenceUpdateInput();
      result.customerEmailAddress = this.customerEmailAddress;
      result.customerLastName = this.customerLastName;
      result.customerFirstName = this.customerFirstName;
      result.shippingAddress = this.shippingAddress;
      result.uncategorizedText = this.uncategorizedText;
      result.accessActivityLog = this.accessActivityLog;
      result.cancellationPolicyDisclosure = this.cancellationPolicyDisclosure;
      result.cancellationRebuttal = this.cancellationRebuttal;
      result.refundPolicyDisclosure = this.refundPolicyDisclosure;
      result.refundRefusalExplanation = this.refundRefusalExplanation;
      result.cancellationPolicyFile = this.cancellationPolicyFile;
      result.customerCommunicationFile = this.customerCommunicationFile;
      result.refundPolicyFile = this.refundPolicyFile;
      result.shippingDocumentationFile = this.shippingDocumentationFile;
      result.uncategorizedFile = this.uncategorizedFile;
      result.serviceDocumentationFile = this.serviceDocumentationFile;
      result.submitEvidence = this.submitEvidence;
      return result;
    }

    
    public Builder customerEmailAddress(String customerEmailAddress) {
      this.customerEmailAddress = customerEmailAddress;
      return this;
    }

    
    public Builder customerLastName(String customerLastName) {
      this.customerLastName = customerLastName;
      return this;
    }

    
    public Builder customerFirstName(String customerFirstName) {
      this.customerFirstName = customerFirstName;
      return this;
    }

    
    public Builder shippingAddress(MailingAddressInput shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    
    public Builder uncategorizedText(String uncategorizedText) {
      this.uncategorizedText = uncategorizedText;
      return this;
    }

    
    public Builder accessActivityLog(String accessActivityLog) {
      this.accessActivityLog = accessActivityLog;
      return this;
    }

    
    public Builder cancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
      this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
      return this;
    }

    
    public Builder cancellationRebuttal(String cancellationRebuttal) {
      this.cancellationRebuttal = cancellationRebuttal;
      return this;
    }

    
    public Builder refundPolicyDisclosure(String refundPolicyDisclosure) {
      this.refundPolicyDisclosure = refundPolicyDisclosure;
      return this;
    }

    
    public Builder refundRefusalExplanation(String refundRefusalExplanation) {
      this.refundRefusalExplanation = refundRefusalExplanation;
      return this;
    }

    
    public Builder cancellationPolicyFile(
        ShopifyPaymentsDisputeFileUploadUpdateInput cancellationPolicyFile) {
      this.cancellationPolicyFile = cancellationPolicyFile;
      return this;
    }

    
    public Builder customerCommunicationFile(
        ShopifyPaymentsDisputeFileUploadUpdateInput customerCommunicationFile) {
      this.customerCommunicationFile = customerCommunicationFile;
      return this;
    }

    
    public Builder refundPolicyFile(ShopifyPaymentsDisputeFileUploadUpdateInput refundPolicyFile) {
      this.refundPolicyFile = refundPolicyFile;
      return this;
    }

    
    public Builder shippingDocumentationFile(
        ShopifyPaymentsDisputeFileUploadUpdateInput shippingDocumentationFile) {
      this.shippingDocumentationFile = shippingDocumentationFile;
      return this;
    }

    
    public Builder uncategorizedFile(
        ShopifyPaymentsDisputeFileUploadUpdateInput uncategorizedFile) {
      this.uncategorizedFile = uncategorizedFile;
      return this;
    }

    
    public Builder serviceDocumentationFile(
        ShopifyPaymentsDisputeFileUploadUpdateInput serviceDocumentationFile) {
      this.serviceDocumentationFile = serviceDocumentationFile;
      return this;
    }

    
    public Builder submitEvidence(Boolean submitEvidence) {
      this.submitEvidence = submitEvidence;
      return this;
    }
  }
}
