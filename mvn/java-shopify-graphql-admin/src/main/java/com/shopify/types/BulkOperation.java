package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class BulkOperation implements com.shopify.types.Node {
  
  private OffsetDateTime completedAt;

  
  private OffsetDateTime createdAt;

  
  private BulkOperationErrorCode errorCode;

  
  private String fileSize;

  
  private String id;

  
  private String objectCount;

  
  private String partialDataUrl;

  
  private String query;

  
  private String rootObjectCount;

  
  private BulkOperationStatus status;

  
  private BulkOperationType type;

  
  private String url;

  public BulkOperation() {
  }

  
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public BulkOperationErrorCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(BulkOperationErrorCode errorCode) {
    this.errorCode = errorCode;
  }

  
  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getObjectCount() {
    return objectCount;
  }

  public void setObjectCount(String objectCount) {
    this.objectCount = objectCount;
  }

  
  public String getPartialDataUrl() {
    return partialDataUrl;
  }

  public void setPartialDataUrl(String partialDataUrl) {
    this.partialDataUrl = partialDataUrl;
  }

  
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  
  public String getRootObjectCount() {
    return rootObjectCount;
  }

  public void setRootObjectCount(String rootObjectCount) {
    this.rootObjectCount = rootObjectCount;
  }

  
  public BulkOperationStatus getStatus() {
    return status;
  }

  public void setStatus(BulkOperationStatus status) {
    this.status = status;
  }

  
  public BulkOperationType getType() {
    return type;
  }

  public void setType(BulkOperationType type) {
    this.type = type;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "BulkOperation{completedAt='" + completedAt + "', createdAt='" + createdAt + "', errorCode='" + errorCode + "', fileSize='" + fileSize + "', id='" + id + "', objectCount='" + objectCount + "', partialDataUrl='" + partialDataUrl + "', query='" + query + "', rootObjectCount='" + rootObjectCount + "', status='" + status + "', type='" + type + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BulkOperation that = (BulkOperation) o;
    return Objects.equals(completedAt, that.completedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(errorCode, that.errorCode) &&
        Objects.equals(fileSize, that.fileSize) &&
        Objects.equals(id, that.id) &&
        Objects.equals(objectCount, that.objectCount) &&
        Objects.equals(partialDataUrl, that.partialDataUrl) &&
        Objects.equals(query, that.query) &&
        Objects.equals(rootObjectCount, that.rootObjectCount) &&
        Objects.equals(status, that.status) &&
        Objects.equals(type, that.type) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedAt, createdAt, errorCode, fileSize, id, objectCount, partialDataUrl, query, rootObjectCount, status, type, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime completedAt;

    
    private OffsetDateTime createdAt;

    
    private BulkOperationErrorCode errorCode;

    
    private String fileSize;

    
    private String id;

    
    private String objectCount;

    
    private String partialDataUrl;

    
    private String query;

    
    private String rootObjectCount;

    
    private BulkOperationStatus status;

    
    private BulkOperationType type;

    
    private String url;

    public BulkOperation build() {
      BulkOperation result = new BulkOperation();
      result.completedAt = this.completedAt;
      result.createdAt = this.createdAt;
      result.errorCode = this.errorCode;
      result.fileSize = this.fileSize;
      result.id = this.id;
      result.objectCount = this.objectCount;
      result.partialDataUrl = this.partialDataUrl;
      result.query = this.query;
      result.rootObjectCount = this.rootObjectCount;
      result.status = this.status;
      result.type = this.type;
      result.url = this.url;
      return result;
    }

    
    public Builder completedAt(OffsetDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder errorCode(BulkOperationErrorCode errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    
    public Builder fileSize(String fileSize) {
      this.fileSize = fileSize;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder objectCount(String objectCount) {
      this.objectCount = objectCount;
      return this;
    }

    
    public Builder partialDataUrl(String partialDataUrl) {
      this.partialDataUrl = partialDataUrl;
      return this;
    }

    
    public Builder query(String query) {
      this.query = query;
      return this;
    }

    
    public Builder rootObjectCount(String rootObjectCount) {
      this.rootObjectCount = rootObjectCount;
      return this;
    }

    
    public Builder status(BulkOperationStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder type(BulkOperationType type) {
      this.type = type;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
