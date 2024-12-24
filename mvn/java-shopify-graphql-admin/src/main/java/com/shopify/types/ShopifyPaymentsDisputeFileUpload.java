package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsDisputeFileUpload implements com.shopify.types.Node {
  
  private ShopifyPaymentsDisputeEvidenceFileType disputeEvidenceType;

  
  private int fileSize;

  
  private String fileType;

  
  private String id;

  
  private String originalFileName;

  
  private String url;

  public ShopifyPaymentsDisputeFileUpload() {
  }

  
  public ShopifyPaymentsDisputeEvidenceFileType getDisputeEvidenceType() {
    return disputeEvidenceType;
  }

  public void setDisputeEvidenceType(ShopifyPaymentsDisputeEvidenceFileType disputeEvidenceType) {
    this.disputeEvidenceType = disputeEvidenceType;
  }

  
  public int getFileSize() {
    return fileSize;
  }

  public void setFileSize(int fileSize) {
    this.fileSize = fileSize;
  }

  
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getOriginalFileName() {
    return originalFileName;
  }

  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsDisputeFileUpload{disputeEvidenceType='" + disputeEvidenceType + "', fileSize='" + fileSize + "', fileType='" + fileType + "', id='" + id + "', originalFileName='" + originalFileName + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsDisputeFileUpload that = (ShopifyPaymentsDisputeFileUpload) o;
    return Objects.equals(disputeEvidenceType, that.disputeEvidenceType) &&
        fileSize == that.fileSize &&
        Objects.equals(fileType, that.fileType) &&
        Objects.equals(id, that.id) &&
        Objects.equals(originalFileName, that.originalFileName) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputeEvidenceType, fileSize, fileType, id, originalFileName, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ShopifyPaymentsDisputeEvidenceFileType disputeEvidenceType;

    
    private int fileSize;

    
    private String fileType;

    
    private String id;

    
    private String originalFileName;

    
    private String url;

    public ShopifyPaymentsDisputeFileUpload build() {
      ShopifyPaymentsDisputeFileUpload result = new ShopifyPaymentsDisputeFileUpload();
      result.disputeEvidenceType = this.disputeEvidenceType;
      result.fileSize = this.fileSize;
      result.fileType = this.fileType;
      result.id = this.id;
      result.originalFileName = this.originalFileName;
      result.url = this.url;
      return result;
    }

    
    public Builder disputeEvidenceType(ShopifyPaymentsDisputeEvidenceFileType disputeEvidenceType) {
      this.disputeEvidenceType = disputeEvidenceType;
      return this;
    }

    
    public Builder fileSize(int fileSize) {
      this.fileSize = fileSize;
      return this;
    }

    
    public Builder fileType(String fileType) {
      this.fileType = fileType;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder originalFileName(String originalFileName) {
      this.originalFileName = originalFileName;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
