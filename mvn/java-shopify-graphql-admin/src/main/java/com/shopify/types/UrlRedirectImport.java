package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class UrlRedirectImport implements com.shopify.types.Node {
  
  private Integer count;

  
  private Integer createdCount;

  
  private Integer failedCount;

  
  private boolean finished;

  
  private OffsetDateTime finishedAt;

  
  private String id;

  
  private List<UrlRedirectImportPreview> previewRedirects;

  
  private Integer updatedCount;

  public UrlRedirectImport() {
  }

  
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  
  public Integer getCreatedCount() {
    return createdCount;
  }

  public void setCreatedCount(Integer createdCount) {
    this.createdCount = createdCount;
  }

  
  public Integer getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(Integer failedCount) {
    this.failedCount = failedCount;
  }

  
  public boolean getFinished() {
    return finished;
  }

  public void setFinished(boolean finished) {
    this.finished = finished;
  }

  
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<UrlRedirectImportPreview> getPreviewRedirects() {
    return previewRedirects;
  }

  public void setPreviewRedirects(List<UrlRedirectImportPreview> previewRedirects) {
    this.previewRedirects = previewRedirects;
  }

  
  public Integer getUpdatedCount() {
    return updatedCount;
  }

  public void setUpdatedCount(Integer updatedCount) {
    this.updatedCount = updatedCount;
  }

  @Override
  public String toString() {
    return "UrlRedirectImport{count='" + count + "', createdCount='" + createdCount + "', failedCount='" + failedCount + "', finished='" + finished + "', finishedAt='" + finishedAt + "', id='" + id + "', previewRedirects='" + previewRedirects + "', updatedCount='" + updatedCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UrlRedirectImport that = (UrlRedirectImport) o;
    return Objects.equals(count, that.count) &&
        Objects.equals(createdCount, that.createdCount) &&
        Objects.equals(failedCount, that.failedCount) &&
        finished == that.finished &&
        Objects.equals(finishedAt, that.finishedAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(previewRedirects, that.previewRedirects) &&
        Objects.equals(updatedCount, that.updatedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, createdCount, failedCount, finished, finishedAt, id, previewRedirects, updatedCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Integer count;

    
    private Integer createdCount;

    
    private Integer failedCount;

    
    private boolean finished;

    
    private OffsetDateTime finishedAt;

    
    private String id;

    
    private List<UrlRedirectImportPreview> previewRedirects;

    
    private Integer updatedCount;

    public UrlRedirectImport build() {
      UrlRedirectImport result = new UrlRedirectImport();
      result.count = this.count;
      result.createdCount = this.createdCount;
      result.failedCount = this.failedCount;
      result.finished = this.finished;
      result.finishedAt = this.finishedAt;
      result.id = this.id;
      result.previewRedirects = this.previewRedirects;
      result.updatedCount = this.updatedCount;
      return result;
    }

    
    public Builder count(Integer count) {
      this.count = count;
      return this;
    }

    
    public Builder createdCount(Integer createdCount) {
      this.createdCount = createdCount;
      return this;
    }

    
    public Builder failedCount(Integer failedCount) {
      this.failedCount = failedCount;
      return this;
    }

    
    public Builder finished(boolean finished) {
      this.finished = finished;
      return this;
    }

    
    public Builder finishedAt(OffsetDateTime finishedAt) {
      this.finishedAt = finishedAt;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder previewRedirects(List<UrlRedirectImportPreview> previewRedirects) {
      this.previewRedirects = previewRedirects;
      return this;
    }

    
    public Builder updatedCount(Integer updatedCount) {
      this.updatedCount = updatedCount;
      return this;
    }
  }
}
