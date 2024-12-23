package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A request to import a [`URLRedirect`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) object
 * into the Online Store channel. Apps can use this to query the state of an `UrlRedirectImport` request.
 *
 * For more information, see [`url-redirect`](https://help.shopify.com/en/manual/online-store/menus-and-links/url-redirect)s.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class UrlRedirectImport implements com.shopify.types.Node {
  /**
   * The number of rows in the file.
   */
  private Integer count;

  /**
   * The number of redirects created from the import.
   */
  private Integer createdCount;

  /**
   * The number of redirects that failed to be imported.
   */
  private Integer failedCount;

  /**
   * Whether the import is finished.
   */
  private boolean finished;

  /**
   * The date and time when the import finished.
   */
  private OffsetDateTime finishedAt;

  /**
   * The ID of the `UrlRedirectImport` object.
   */
  private String id;

  /**
   * A list of up to three previews of the URL redirects to be imported.
   */
  private List<UrlRedirectImportPreview> previewRedirects;

  /**
   * The number of redirects updated during the import.
   */
  private Integer updatedCount;

  public UrlRedirectImport() {
  }

  /**
   * The number of rows in the file.
   */
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * The number of redirects created from the import.
   */
  public Integer getCreatedCount() {
    return createdCount;
  }

  public void setCreatedCount(Integer createdCount) {
    this.createdCount = createdCount;
  }

  /**
   * The number of redirects that failed to be imported.
   */
  public Integer getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(Integer failedCount) {
    this.failedCount = failedCount;
  }

  /**
   * Whether the import is finished.
   */
  public boolean getFinished() {
    return finished;
  }

  public void setFinished(boolean finished) {
    this.finished = finished;
  }

  /**
   * The date and time when the import finished.
   */
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  /**
   * The ID of the `UrlRedirectImport` object.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * A list of up to three previews of the URL redirects to be imported.
   */
  public List<UrlRedirectImportPreview> getPreviewRedirects() {
    return previewRedirects;
  }

  public void setPreviewRedirects(List<UrlRedirectImportPreview> previewRedirects) {
    this.previewRedirects = previewRedirects;
  }

  /**
   * The number of redirects updated during the import.
   */
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
    /**
     * The number of rows in the file.
     */
    private Integer count;

    /**
     * The number of redirects created from the import.
     */
    private Integer createdCount;

    /**
     * The number of redirects that failed to be imported.
     */
    private Integer failedCount;

    /**
     * Whether the import is finished.
     */
    private boolean finished;

    /**
     * The date and time when the import finished.
     */
    private OffsetDateTime finishedAt;

    /**
     * The ID of the `UrlRedirectImport` object.
     */
    private String id;

    /**
     * A list of up to three previews of the URL redirects to be imported.
     */
    private List<UrlRedirectImportPreview> previewRedirects;

    /**
     * The number of redirects updated during the import.
     */
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

    /**
     * The number of rows in the file.
     */
    public Builder count(Integer count) {
      this.count = count;
      return this;
    }

    /**
     * The number of redirects created from the import.
     */
    public Builder createdCount(Integer createdCount) {
      this.createdCount = createdCount;
      return this;
    }

    /**
     * The number of redirects that failed to be imported.
     */
    public Builder failedCount(Integer failedCount) {
      this.failedCount = failedCount;
      return this;
    }

    /**
     * Whether the import is finished.
     */
    public Builder finished(boolean finished) {
      this.finished = finished;
      return this;
    }

    /**
     * The date and time when the import finished.
     */
    public Builder finishedAt(OffsetDateTime finishedAt) {
      this.finishedAt = finishedAt;
      return this;
    }

    /**
     * The ID of the `UrlRedirectImport` object.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * A list of up to three previews of the URL redirects to be imported.
     */
    public Builder previewRedirects(List<UrlRedirectImportPreview> previewRedirects) {
      this.previewRedirects = previewRedirects;
      return this;
    }

    /**
     * The number of redirects updated during the import.
     */
    public Builder updatedCount(Integer updatedCount) {
      this.updatedCount = updatedCount;
      return this;
    }
  }
}
