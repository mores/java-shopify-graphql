package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to update a dispute evidence object.
 */
public class ShopifyPaymentsDisputeEvidenceUpdateInput {
  /**
   * Customer email address.
   */
  private String customerEmailAddress;

  /**
   * Customer last name.
   */
  private String customerLastName;

  /**
   * Customer first name.
   */
  private String customerFirstName;

  /**
   * The shipping address associated with the dispute evidence.
   */
  private MailingAddressInput shippingAddress;

  /**
   * Uncategorized text.
   */
  private String uncategorizedText;

  /**
   * Activity logs.
   */
  private String accessActivityLog;

  /**
   * Cancellation policy disclosure.
   */
  private String cancellationPolicyDisclosure;

  /**
   * Cancellation rebuttal.
   */
  private String cancellationRebuttal;

  /**
   * Refund policy disclosure.
   */
  private String refundPolicyDisclosure;

  /**
   * Refund refusal explanation.
   */
  private String refundRefusalExplanation;

  /**
   * Cancellation policy file.
   */
  private ShopifyPaymentsDisputeFileUploadUpdateInput cancellationPolicyFile;

  /**
   * Customer communication file.
   */
  private ShopifyPaymentsDisputeFileUploadUpdateInput customerCommunicationFile;

  /**
   * Refund policy file.
   */
  private ShopifyPaymentsDisputeFileUploadUpdateInput refundPolicyFile;

  /**
   * Shipping documentation file.
   */
  private ShopifyPaymentsDisputeFileUploadUpdateInput shippingDocumentationFile;

  /**
   * Uncategorized file.
   */
  private ShopifyPaymentsDisputeFileUploadUpdateInput uncategorizedFile;

  /**
   * Service documentation file.
   */
  private ShopifyPaymentsDisputeFileUploadUpdateInput serviceDocumentationFile;

  /**
   * Whether to submit the evidence.
   */
  private Boolean submitEvidence = false;

  public ShopifyPaymentsDisputeEvidenceUpdateInput() {
  }

  /**
   * Customer email address.
   */
  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }

  public void setCustomerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
  }

  /**
   * Customer last name.
   */
  public String getCustomerLastName() {
    return customerLastName;
  }

  public void setCustomerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
  }

  /**
   * Customer first name.
   */
  public String getCustomerFirstName() {
    return customerFirstName;
  }

  public void setCustomerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
  }

  /**
   * The shipping address associated with the dispute evidence.
   */
  public MailingAddressInput getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddressInput shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * Uncategorized text.
   */
  public String getUncategorizedText() {
    return uncategorizedText;
  }

  public void setUncategorizedText(String uncategorizedText) {
    this.uncategorizedText = uncategorizedText;
  }

  /**
   * Activity logs.
   */
  public String getAccessActivityLog() {
    return accessActivityLog;
  }

  public void setAccessActivityLog(String accessActivityLog) {
    this.accessActivityLog = accessActivityLog;
  }

  /**
   * Cancellation policy disclosure.
   */
  public String getCancellationPolicyDisclosure() {
    return cancellationPolicyDisclosure;
  }

  public void setCancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
    this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
  }

  /**
   * Cancellation rebuttal.
   */
  public String getCancellationRebuttal() {
    return cancellationRebuttal;
  }

  public void setCancellationRebuttal(String cancellationRebuttal) {
    this.cancellationRebuttal = cancellationRebuttal;
  }

  /**
   * Refund policy disclosure.
   */
  public String getRefundPolicyDisclosure() {
    return refundPolicyDisclosure;
  }

  public void setRefundPolicyDisclosure(String refundPolicyDisclosure) {
    this.refundPolicyDisclosure = refundPolicyDisclosure;
  }

  /**
   * Refund refusal explanation.
   */
  public String getRefundRefusalExplanation() {
    return refundRefusalExplanation;
  }

  public void setRefundRefusalExplanation(String refundRefusalExplanation) {
    this.refundRefusalExplanation = refundRefusalExplanation;
  }

  /**
   * Cancellation policy file.
   */
  public ShopifyPaymentsDisputeFileUploadUpdateInput getCancellationPolicyFile() {
    return cancellationPolicyFile;
  }

  public void setCancellationPolicyFile(
      ShopifyPaymentsDisputeFileUploadUpdateInput cancellationPolicyFile) {
    this.cancellationPolicyFile = cancellationPolicyFile;
  }

  /**
   * Customer communication file.
   */
  public ShopifyPaymentsDisputeFileUploadUpdateInput getCustomerCommunicationFile() {
    return customerCommunicationFile;
  }

  public void setCustomerCommunicationFile(
      ShopifyPaymentsDisputeFileUploadUpdateInput customerCommunicationFile) {
    this.customerCommunicationFile = customerCommunicationFile;
  }

  /**
   * Refund policy file.
   */
  public ShopifyPaymentsDisputeFileUploadUpdateInput getRefundPolicyFile() {
    return refundPolicyFile;
  }

  public void setRefundPolicyFile(ShopifyPaymentsDisputeFileUploadUpdateInput refundPolicyFile) {
    this.refundPolicyFile = refundPolicyFile;
  }

  /**
   * Shipping documentation file.
   */
  public ShopifyPaymentsDisputeFileUploadUpdateInput getShippingDocumentationFile() {
    return shippingDocumentationFile;
  }

  public void setShippingDocumentationFile(
      ShopifyPaymentsDisputeFileUploadUpdateInput shippingDocumentationFile) {
    this.shippingDocumentationFile = shippingDocumentationFile;
  }

  /**
   * Uncategorized file.
   */
  public ShopifyPaymentsDisputeFileUploadUpdateInput getUncategorizedFile() {
    return uncategorizedFile;
  }

  public void setUncategorizedFile(ShopifyPaymentsDisputeFileUploadUpdateInput uncategorizedFile) {
    this.uncategorizedFile = uncategorizedFile;
  }

  /**
   * Service documentation file.
   */
  public ShopifyPaymentsDisputeFileUploadUpdateInput getServiceDocumentationFile() {
    return serviceDocumentationFile;
  }

  public void setServiceDocumentationFile(
      ShopifyPaymentsDisputeFileUploadUpdateInput serviceDocumentationFile) {
    this.serviceDocumentationFile = serviceDocumentationFile;
  }

  /**
   * Whether to submit the evidence.
   */
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
    /**
     * Customer email address.
     */
    private String customerEmailAddress;

    /**
     * Customer last name.
     */
    private String customerLastName;

    /**
     * Customer first name.
     */
    private String customerFirstName;

    /**
     * The shipping address associated with the dispute evidence.
     */
    private MailingAddressInput shippingAddress;

    /**
     * Uncategorized text.
     */
    private String uncategorizedText;

    /**
     * Activity logs.
     */
    private String accessActivityLog;

    /**
     * Cancellation policy disclosure.
     */
    private String cancellationPolicyDisclosure;

    /**
     * Cancellation rebuttal.
     */
    private String cancellationRebuttal;

    /**
     * Refund policy disclosure.
     */
    private String refundPolicyDisclosure;

    /**
     * Refund refusal explanation.
     */
    private String refundRefusalExplanation;

    /**
     * Cancellation policy file.
     */
    private ShopifyPaymentsDisputeFileUploadUpdateInput cancellationPolicyFile;

    /**
     * Customer communication file.
     */
    private ShopifyPaymentsDisputeFileUploadUpdateInput customerCommunicationFile;

    /**
     * Refund policy file.
     */
    private ShopifyPaymentsDisputeFileUploadUpdateInput refundPolicyFile;

    /**
     * Shipping documentation file.
     */
    private ShopifyPaymentsDisputeFileUploadUpdateInput shippingDocumentationFile;

    /**
     * Uncategorized file.
     */
    private ShopifyPaymentsDisputeFileUploadUpdateInput uncategorizedFile;

    /**
     * Service documentation file.
     */
    private ShopifyPaymentsDisputeFileUploadUpdateInput serviceDocumentationFile;

    /**
     * Whether to submit the evidence.
     */
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

    /**
     * Customer email address.
     */
    public Builder customerEmailAddress(String customerEmailAddress) {
      this.customerEmailAddress = customerEmailAddress;
      return this;
    }

    /**
     * Customer last name.
     */
    public Builder customerLastName(String customerLastName) {
      this.customerLastName = customerLastName;
      return this;
    }

    /**
     * Customer first name.
     */
    public Builder customerFirstName(String customerFirstName) {
      this.customerFirstName = customerFirstName;
      return this;
    }

    /**
     * The shipping address associated with the dispute evidence.
     */
    public Builder shippingAddress(MailingAddressInput shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * Uncategorized text.
     */
    public Builder uncategorizedText(String uncategorizedText) {
      this.uncategorizedText = uncategorizedText;
      return this;
    }

    /**
     * Activity logs.
     */
    public Builder accessActivityLog(String accessActivityLog) {
      this.accessActivityLog = accessActivityLog;
      return this;
    }

    /**
     * Cancellation policy disclosure.
     */
    public Builder cancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
      this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
      return this;
    }

    /**
     * Cancellation rebuttal.
     */
    public Builder cancellationRebuttal(String cancellationRebuttal) {
      this.cancellationRebuttal = cancellationRebuttal;
      return this;
    }

    /**
     * Refund policy disclosure.
     */
    public Builder refundPolicyDisclosure(String refundPolicyDisclosure) {
      this.refundPolicyDisclosure = refundPolicyDisclosure;
      return this;
    }

    /**
     * Refund refusal explanation.
     */
    public Builder refundRefusalExplanation(String refundRefusalExplanation) {
      this.refundRefusalExplanation = refundRefusalExplanation;
      return this;
    }

    /**
     * Cancellation policy file.
     */
    public Builder cancellationPolicyFile(
        ShopifyPaymentsDisputeFileUploadUpdateInput cancellationPolicyFile) {
      this.cancellationPolicyFile = cancellationPolicyFile;
      return this;
    }

    /**
     * Customer communication file.
     */
    public Builder customerCommunicationFile(
        ShopifyPaymentsDisputeFileUploadUpdateInput customerCommunicationFile) {
      this.customerCommunicationFile = customerCommunicationFile;
      return this;
    }

    /**
     * Refund policy file.
     */
    public Builder refundPolicyFile(ShopifyPaymentsDisputeFileUploadUpdateInput refundPolicyFile) {
      this.refundPolicyFile = refundPolicyFile;
      return this;
    }

    /**
     * Shipping documentation file.
     */
    public Builder shippingDocumentationFile(
        ShopifyPaymentsDisputeFileUploadUpdateInput shippingDocumentationFile) {
      this.shippingDocumentationFile = shippingDocumentationFile;
      return this;
    }

    /**
     * Uncategorized file.
     */
    public Builder uncategorizedFile(
        ShopifyPaymentsDisputeFileUploadUpdateInput uncategorizedFile) {
      this.uncategorizedFile = uncategorizedFile;
      return this;
    }

    /**
     * Service documentation file.
     */
    public Builder serviceDocumentationFile(
        ShopifyPaymentsDisputeFileUploadUpdateInput serviceDocumentationFile) {
      this.serviceDocumentationFile = serviceDocumentationFile;
      return this;
    }

    /**
     * Whether to submit the evidence.
     */
    public Builder submitEvidence(Boolean submitEvidence) {
      this.submitEvidence = submitEvidence;
      return this;
    }
  }
}
