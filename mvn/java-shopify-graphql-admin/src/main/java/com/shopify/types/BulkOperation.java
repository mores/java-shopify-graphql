package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * An asynchronous long-running operation to fetch data in bulk or to bulk import data.
 *
 * Bulk operations are created using the `bulkOperationRunQuery` or `bulkOperationRunMutation` mutation. After
 * they are created, clients should poll the `status` field for updates. When `COMPLETED`, the `url` field contains
 * a link to the data in [JSONL](http://jsonlines.org/) format.
 *
 * Refer to the [bulk operations guide](https://shopify.dev/api/usage/bulk-operations/imports) for more details.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class BulkOperation implements com.shopify.types.Node {
  /**
   * When the bulk operation was successfully completed.
   */
  private OffsetDateTime completedAt;

  /**
   * When the bulk operation was created.
   */
  private OffsetDateTime createdAt;

  /**
   * Error code for failed operations.
   */
  private BulkOperationErrorCode errorCode;

  /**
   * File size in bytes of the file in the `url` field.
   */
  private String fileSize;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A running count of all the objects processed.
   * For example, when fetching all the products and their variants, this field counts both products and variants.
   * This field can be used to track operation progress.
   */
  private String objectCount;

  /**
   * The URL that points to the partial or incomplete response data (in
   * [JSONL](http://jsonlines.org/) format) that was returned by a failed operation.
   * The URL expires 7 days after the operation fails. Returns `null` when there's no data available.
   */
  private String partialDataUrl;

  /**
   * GraphQL query document specified in `bulkOperationRunQuery`.
   */
  private String query;

  /**
   * A running count of all the objects that are processed at the root of the query.
   * For example, when fetching all the products and their variants, this field only counts products.
   * This field can be used to track operation progress.
   */
  private String rootObjectCount;

  /**
   * Status of the bulk operation.
   */
  private BulkOperationStatus status;

  /**
   * The bulk operation's type.
   */
  private BulkOperationType type;

  /**
   * The URL that points to the response data in [JSONL](http://jsonlines.org/) format.
   * The URL expires 7 days after the operation completes.
   */
  private String url;

  public BulkOperation() {
  }

  /**
   * When the bulk operation was successfully completed.
   */
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * When the bulk operation was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Error code for failed operations.
   */
  public BulkOperationErrorCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(BulkOperationErrorCode errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * File size in bytes of the file in the `url` field.
   */
  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
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
   * A running count of all the objects processed.
   * For example, when fetching all the products and their variants, this field counts both products and variants.
   * This field can be used to track operation progress.
   */
  public String getObjectCount() {
    return objectCount;
  }

  public void setObjectCount(String objectCount) {
    this.objectCount = objectCount;
  }

  /**
   * The URL that points to the partial or incomplete response data (in
   * [JSONL](http://jsonlines.org/) format) that was returned by a failed operation.
   * The URL expires 7 days after the operation fails. Returns `null` when there's no data available.
   */
  public String getPartialDataUrl() {
    return partialDataUrl;
  }

  public void setPartialDataUrl(String partialDataUrl) {
    this.partialDataUrl = partialDataUrl;
  }

  /**
   * GraphQL query document specified in `bulkOperationRunQuery`.
   */
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  /**
   * A running count of all the objects that are processed at the root of the query.
   * For example, when fetching all the products and their variants, this field only counts products.
   * This field can be used to track operation progress.
   */
  public String getRootObjectCount() {
    return rootObjectCount;
  }

  public void setRootObjectCount(String rootObjectCount) {
    this.rootObjectCount = rootObjectCount;
  }

  /**
   * Status of the bulk operation.
   */
  public BulkOperationStatus getStatus() {
    return status;
  }

  public void setStatus(BulkOperationStatus status) {
    this.status = status;
  }

  /**
   * The bulk operation's type.
   */
  public BulkOperationType getType() {
    return type;
  }

  public void setType(BulkOperationType type) {
    this.type = type;
  }

  /**
   * The URL that points to the response data in [JSONL](http://jsonlines.org/) format.
   * The URL expires 7 days after the operation completes.
   */
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
    /**
     * When the bulk operation was successfully completed.
     */
    private OffsetDateTime completedAt;

    /**
     * When the bulk operation was created.
     */
    private OffsetDateTime createdAt;

    /**
     * Error code for failed operations.
     */
    private BulkOperationErrorCode errorCode;

    /**
     * File size in bytes of the file in the `url` field.
     */
    private String fileSize;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A running count of all the objects processed.
     * For example, when fetching all the products and their variants, this field counts both products and variants.
     * This field can be used to track operation progress.
     */
    private String objectCount;

    /**
     * The URL that points to the partial or incomplete response data (in
     * [JSONL](http://jsonlines.org/) format) that was returned by a failed operation.
     * The URL expires 7 days after the operation fails. Returns `null` when there's no data available.
     */
    private String partialDataUrl;

    /**
     * GraphQL query document specified in `bulkOperationRunQuery`.
     */
    private String query;

    /**
     * A running count of all the objects that are processed at the root of the query.
     * For example, when fetching all the products and their variants, this field only counts products.
     * This field can be used to track operation progress.
     */
    private String rootObjectCount;

    /**
     * Status of the bulk operation.
     */
    private BulkOperationStatus status;

    /**
     * The bulk operation's type.
     */
    private BulkOperationType type;

    /**
     * The URL that points to the response data in [JSONL](http://jsonlines.org/) format.
     * The URL expires 7 days after the operation completes.
     */
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

    /**
     * When the bulk operation was successfully completed.
     */
    public Builder completedAt(OffsetDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
    }

    /**
     * When the bulk operation was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Error code for failed operations.
     */
    public Builder errorCode(BulkOperationErrorCode errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    /**
     * File size in bytes of the file in the `url` field.
     */
    public Builder fileSize(String fileSize) {
      this.fileSize = fileSize;
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
     * A running count of all the objects processed.
     * For example, when fetching all the products and their variants, this field counts both products and variants.
     * This field can be used to track operation progress.
     */
    public Builder objectCount(String objectCount) {
      this.objectCount = objectCount;
      return this;
    }

    /**
     * The URL that points to the partial or incomplete response data (in
     * [JSONL](http://jsonlines.org/) format) that was returned by a failed operation.
     * The URL expires 7 days after the operation fails. Returns `null` when there's no data available.
     */
    public Builder partialDataUrl(String partialDataUrl) {
      this.partialDataUrl = partialDataUrl;
      return this;
    }

    /**
     * GraphQL query document specified in `bulkOperationRunQuery`.
     */
    public Builder query(String query) {
      this.query = query;
      return this;
    }

    /**
     * A running count of all the objects that are processed at the root of the query.
     * For example, when fetching all the products and their variants, this field only counts products.
     * This field can be used to track operation progress.
     */
    public Builder rootObjectCount(String rootObjectCount) {
      this.rootObjectCount = rootObjectCount;
      return this;
    }

    /**
     * Status of the bulk operation.
     */
    public Builder status(BulkOperationStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The bulk operation's type.
     */
    public Builder type(BulkOperationType type) {
      this.type = type;
      return this;
    }

    /**
     * The URL that points to the response data in [JSONL](http://jsonlines.org/) format.
     * The URL expires 7 days after the operation completes.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
